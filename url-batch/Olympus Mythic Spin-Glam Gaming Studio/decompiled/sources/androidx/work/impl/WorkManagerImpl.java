package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.R;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.CancelWorkRunnable;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.PreferenceUtils;
import androidx.work.impl.utils.StartWorkRunnable;
import androidx.work.impl.utils.StatusRunnable;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestrictTo
/* loaded from: classes9.dex */
public class WorkManagerImpl extends WorkManager {
    private Configuration mConfiguration;
    private Context mContext;
    private boolean mForceStopRunnableCompleted;
    private PreferenceUtils mPreferenceUtils;
    private Processor mProcessor;
    private BroadcastReceiver.PendingResult mRescheduleReceiverResult;
    private List mSchedulers;
    private final Trackers mTrackers;
    private WorkDatabase mWorkDatabase;
    private TaskExecutor mWorkTaskExecutor;
    private static final String TAG = Logger.tagWithPrefix("WorkManagerImpl");
    private static WorkManagerImpl sDelegatedInstance = null;
    private static WorkManagerImpl sDefaultInstance = null;
    private static final Object sLock = new Object();

    public static WorkManagerImpl getInstance() {
        synchronized (sLock) {
            try {
                WorkManagerImpl workManagerImpl = sDelegatedInstance;
                if (workManagerImpl != null) {
                    return workManagerImpl;
                }
                return sDefaultInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static WorkManagerImpl getInstance(Context context) {
        WorkManagerImpl workManagerImpl;
        synchronized (sLock) {
            try {
                workManagerImpl = getInstance();
                if (workManagerImpl == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext instanceof Configuration.Provider) {
                        initialize(applicationContext, ((Configuration.Provider) applicationContext).getWorkManagerConfiguration());
                        workManagerImpl = getInstance(applicationContext);
                    } else {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return workManagerImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (androidx.work.impl.WorkManagerImpl.sDefaultInstance != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        androidx.work.impl.WorkManagerImpl.sDefaultInstance = new androidx.work.impl.WorkManagerImpl(r4, r5, new androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor(r5.getTaskExecutor()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        androidx.work.impl.WorkManagerImpl.sDelegatedInstance = androidx.work.impl.WorkManagerImpl.sDefaultInstance;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void initialize(Context context, Configuration configuration) {
        synchronized (sLock) {
            try {
                WorkManagerImpl workManagerImpl = sDelegatedInstance;
                if (workManagerImpl != null && sDefaultInstance != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor taskExecutor) {
        this(context, configuration, taskExecutor, context.getResources().getBoolean(R.bool.workmanager_test_configuration));
    }

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor taskExecutor, boolean z) {
        this(context, configuration, taskExecutor, WorkDatabase.create(context.getApplicationContext(), taskExecutor.getSerialTaskExecutor(), z));
    }

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        Logger.setLogger(new Logger.LogcatLogger(configuration.getMinimumLoggingLevel()));
        Trackers trackers = new Trackers(applicationContext, taskExecutor);
        this.mTrackers = trackers;
        List createSchedulers = createSchedulers(applicationContext, configuration, trackers);
        internalInit(context, configuration, taskExecutor, workDatabase, createSchedulers, new Processor(context, configuration, taskExecutor, workDatabase, createSchedulers));
    }

    public Context getApplicationContext() {
        return this.mContext;
    }

    public WorkDatabase getWorkDatabase() {
        return this.mWorkDatabase;
    }

    public Configuration getConfiguration() {
        return this.mConfiguration;
    }

    public List getSchedulers() {
        return this.mSchedulers;
    }

    public Processor getProcessor() {
        return this.mProcessor;
    }

    public TaskExecutor getWorkTaskExecutor() {
        return this.mWorkTaskExecutor;
    }

    public PreferenceUtils getPreferenceUtils() {
        return this.mPreferenceUtils;
    }

    public Trackers getTrackers() {
        return this.mTrackers;
    }

    @Override // androidx.work.WorkManager
    public Operation enqueue(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new WorkContinuationImpl(this, list).enqueue();
    }

    public Operation cancelWorkById(UUID uuid) {
        CancelWorkRunnable forId = CancelWorkRunnable.forId(uuid, this);
        this.mWorkTaskExecutor.executeOnTaskThread(forId);
        return forId.getOperation();
    }

    @Override // androidx.work.WorkManager
    public Operation cancelAllWorkByTag(String str) {
        CancelWorkRunnable forTag = CancelWorkRunnable.forTag(str, this);
        this.mWorkTaskExecutor.executeOnTaskThread(forTag);
        return forTag.getOperation();
    }

    /* renamed from: androidx.work.impl.WorkManagerImpl$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ SettableFuture val$future;
        final /* synthetic */ PreferenceUtils val$preferenceUtils;

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.val$future.set(Long.valueOf(this.val$preferenceUtils.getLastCancelAllTimeMillis()));
            } catch (Throwable th) {
                this.val$future.setException(th);
            }
        }
    }

    /* renamed from: androidx.work.impl.WorkManagerImpl$2, reason: invalid class name */
    /* loaded from: classes14.dex */
    class AnonymousClass2 implements Function<List<WorkSpec.WorkInfoPojo>, WorkInfo> {
        @Override // androidx.arch.core.util.Function
        public WorkInfo apply(List list) {
            if (list == null || list.size() <= 0) {
                return null;
            }
            return ((WorkSpec.WorkInfoPojo) list.get(0)).toWorkInfo();
        }
    }

    @Override // androidx.work.WorkManager
    public ListenableFuture getWorkInfoById(UUID uuid) {
        StatusRunnable forUUID = StatusRunnable.forUUID(this, uuid);
        this.mWorkTaskExecutor.getSerialTaskExecutor().execute(forUUID);
        return forUUID.getFuture();
    }

    public void startWork(StartStopToken startStopToken) {
        startWork(startStopToken, null);
    }

    public void startWork(StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras) {
        this.mWorkTaskExecutor.executeOnTaskThread(new StartWorkRunnable(this, startStopToken, runtimeExtras));
    }

    public void stopWork(StartStopToken startStopToken) {
        this.mWorkTaskExecutor.executeOnTaskThread(new StopWorkRunnable(this, startStopToken, false));
    }

    public void stopForegroundWork(WorkGenerationalId workGenerationalId) {
        this.mWorkTaskExecutor.executeOnTaskThread(new StopWorkRunnable(this, new StartStopToken(workGenerationalId), true));
    }

    public void rescheduleEligibleWork() {
        SystemJobScheduler.cancelAll(getApplicationContext());
        getWorkDatabase().workSpecDao().resetScheduledState();
        Schedulers.schedule(getConfiguration(), getWorkDatabase(), getSchedulers());
    }

    public void onForceStopRunnableCompleted() {
        synchronized (sLock) {
            try {
                this.mForceStopRunnableCompleted = true;
                BroadcastReceiver.PendingResult pendingResult = this.mRescheduleReceiverResult;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.mRescheduleReceiverResult = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setReschedulePendingResult(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (sLock) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.mRescheduleReceiverResult;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.mRescheduleReceiverResult = pendingResult;
                if (this.mForceStopRunnableCompleted) {
                    pendingResult.finish();
                    this.mRescheduleReceiverResult = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void internalInit(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, List list, Processor processor) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mConfiguration = configuration;
        this.mWorkTaskExecutor = taskExecutor;
        this.mWorkDatabase = workDatabase;
        this.mSchedulers = list;
        this.mProcessor = processor;
        this.mPreferenceUtils = new PreferenceUtils(workDatabase);
        this.mForceStopRunnableCompleted = false;
        if (Api24Impl.isDeviceProtectedStorage(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.mWorkTaskExecutor.executeOnTaskThread(new ForceStopRunnable(applicationContext, this));
    }

    public List createSchedulers(Context context, Configuration configuration, Trackers trackers) {
        return Arrays.asList(Schedulers.createBestAvailableBackgroundScheduler(context, this), new GreedyScheduler(context, configuration, trackers, this));
    }

    @RequiresApi
    static class Api24Impl {
        @DoNotInline
        static boolean isDeviceProtectedStorage(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }
}

package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.work.Configuration;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

@RestrictTo
/* loaded from: classes13.dex */
public class Processor implements ExecutionListener, ForegroundProcessor {
    private static final String TAG = Logger.tagWithPrefix("Processor");
    private Context mAppContext;
    private Configuration mConfiguration;
    private List mSchedulers;
    private WorkDatabase mWorkDatabase;
    private TaskExecutor mWorkTaskExecutor;
    private Map mEnqueuedWorkMap = new HashMap();
    private Map mForegroundWorkMap = new HashMap();
    private Set mCancelledIds = new HashSet();
    private final List mOuterListeners = new ArrayList();
    private PowerManager.WakeLock mForegroundLock = null;
    private final Object mLock = new Object();
    private Map mWorkRuns = new HashMap();

    public Processor(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, List list) {
        this.mAppContext = context;
        this.mConfiguration = configuration;
        this.mWorkTaskExecutor = taskExecutor;
        this.mWorkDatabase = workDatabase;
        this.mSchedulers = list;
    }

    public boolean startWork(StartStopToken startStopToken) {
        return startWork(startStopToken, null);
    }

    public boolean startWork(StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras) {
        WorkGenerationalId id = startStopToken.getId();
        final String workSpecId = id.getWorkSpecId();
        final ArrayList arrayList = new ArrayList();
        WorkSpec workSpec = (WorkSpec) this.mWorkDatabase.runInTransaction(new Callable() { // from class: androidx.work.impl.Processor$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkSpec lambda$startWork$0;
                lambda$startWork$0 = Processor.this.lambda$startWork$0(arrayList, workSpecId);
                return lambda$startWork$0;
            }
        });
        if (workSpec == null) {
            Logger.get().warning(TAG, "Didn't find WorkSpec for id " + id);
            runOnExecuted(id, false);
            return false;
        }
        synchronized (this.mLock) {
            try {
                if (isEnqueued(workSpecId)) {
                    Set set = (Set) this.mWorkRuns.get(workSpecId);
                    if (((StartStopToken) set.iterator().next()).getId().getGeneration() == id.getGeneration()) {
                        set.add(startStopToken);
                        Logger.get().debug(TAG, "Work " + id + " is already enqueued for processing");
                    } else {
                        runOnExecuted(id, false);
                    }
                    return false;
                }
                if (workSpec.getGeneration() != id.getGeneration()) {
                    runOnExecuted(id, false);
                    return false;
                }
                WorkerWrapper build = new WorkerWrapper.Builder(this.mAppContext, this.mConfiguration, this.mWorkTaskExecutor, this, this.mWorkDatabase, workSpec, arrayList).withSchedulers(this.mSchedulers).withRuntimeExtras(runtimeExtras).build();
                ListenableFuture future = build.getFuture();
                future.addListener(new FutureListener(this, startStopToken.getId(), future), this.mWorkTaskExecutor.getMainThreadExecutor());
                this.mEnqueuedWorkMap.put(workSpecId, build);
                HashSet hashSet = new HashSet();
                hashSet.add(startStopToken);
                this.mWorkRuns.put(workSpecId, hashSet);
                this.mWorkTaskExecutor.getSerialTaskExecutor().execute(build);
                Logger.get().debug(TAG, getClass().getSimpleName() + ": processing " + id);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WorkSpec lambda$startWork$0(ArrayList arrayList, String str) {
        arrayList.addAll(this.mWorkDatabase.workTagDao().getTagsForWorkSpecId(str));
        return this.mWorkDatabase.workSpecDao().getWorkSpec(str);
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void startForeground(String str, ForegroundInfo foregroundInfo) {
        synchronized (this.mLock) {
            try {
                Logger.get().info(TAG, "Moving WorkSpec (" + str + ") to the foreground");
                WorkerWrapper workerWrapper = (WorkerWrapper) this.mEnqueuedWorkMap.remove(str);
                if (workerWrapper != null) {
                    if (this.mForegroundLock == null) {
                        PowerManager.WakeLock newWakeLock = WakeLocks.newWakeLock(this.mAppContext, "ProcessorForegroundLck");
                        this.mForegroundLock = newWakeLock;
                        newWakeLock.acquire();
                    }
                    this.mForegroundWorkMap.put(str, workerWrapper);
                    ContextCompat.startForegroundService(this.mAppContext, SystemForegroundDispatcher.createStartForegroundIntent(this.mAppContext, workerWrapper.getWorkGenerationalId(), foregroundInfo));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean stopForegroundWork(StartStopToken startStopToken) {
        WorkerWrapper workerWrapper;
        String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.mLock) {
            try {
                Logger.get().debug(TAG, "Processor stopping foreground work " + workSpecId);
                workerWrapper = (WorkerWrapper) this.mForegroundWorkMap.remove(workSpecId);
                if (workerWrapper != null) {
                    this.mWorkRuns.remove(workSpecId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interrupt(workSpecId, workerWrapper);
    }

    public boolean stopWork(StartStopToken startStopToken) {
        String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.mLock) {
            try {
                WorkerWrapper workerWrapper = (WorkerWrapper) this.mEnqueuedWorkMap.remove(workSpecId);
                if (workerWrapper == null) {
                    Logger.get().debug(TAG, "WorkerWrapper could not be found for " + workSpecId);
                    return false;
                }
                Set set = (Set) this.mWorkRuns.get(workSpecId);
                if (set != null && set.contains(startStopToken)) {
                    Logger.get().debug(TAG, "Processor stopping background work " + workSpecId);
                    this.mWorkRuns.remove(workSpecId);
                    return interrupt(workSpecId, workerWrapper);
                }
                return false;
            } finally {
            }
        }
    }

    public boolean stopAndCancelWork(String str) {
        WorkerWrapper workerWrapper;
        boolean z;
        synchronized (this.mLock) {
            try {
                Logger.get().debug(TAG, "Processor cancelling " + str);
                this.mCancelledIds.add(str);
                workerWrapper = (WorkerWrapper) this.mForegroundWorkMap.remove(str);
                z = workerWrapper != null;
                if (workerWrapper == null) {
                    workerWrapper = (WorkerWrapper) this.mEnqueuedWorkMap.remove(str);
                }
                if (workerWrapper != null) {
                    this.mWorkRuns.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean interrupt = interrupt(str, workerWrapper);
        if (z) {
            stopForegroundService();
        }
        return interrupt;
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void stopForeground(String str) {
        synchronized (this.mLock) {
            this.mForegroundWorkMap.remove(str);
            stopForegroundService();
        }
    }

    public boolean isCancelled(String str) {
        boolean contains;
        synchronized (this.mLock) {
            contains = this.mCancelledIds.contains(str);
        }
        return contains;
    }

    public boolean isEnqueued(String str) {
        boolean z;
        synchronized (this.mLock) {
            try {
                z = this.mEnqueuedWorkMap.containsKey(str) || this.mForegroundWorkMap.containsKey(str);
            } finally {
            }
        }
        return z;
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public boolean isEnqueuedInForeground(String str) {
        boolean containsKey;
        synchronized (this.mLock) {
            containsKey = this.mForegroundWorkMap.containsKey(str);
        }
        return containsKey;
    }

    public void addExecutionListener(ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.add(executionListener);
        }
    }

    public void removeExecutionListener(ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.remove(executionListener);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    /* renamed from: onExecuted, reason: merged with bridge method [inline-methods] */
    public void lambda$runOnExecuted$1(WorkGenerationalId workGenerationalId, boolean z) {
        synchronized (this.mLock) {
            try {
                WorkerWrapper workerWrapper = (WorkerWrapper) this.mEnqueuedWorkMap.get(workGenerationalId.getWorkSpecId());
                if (workerWrapper != null && workGenerationalId.equals(workerWrapper.getWorkGenerationalId())) {
                    this.mEnqueuedWorkMap.remove(workGenerationalId.getWorkSpecId());
                }
                Logger.get().debug(TAG, getClass().getSimpleName() + " " + workGenerationalId.getWorkSpecId() + " executed; reschedule = " + z);
                Iterator it = this.mOuterListeners.iterator();
                while (it.hasNext()) {
                    ((ExecutionListener) it.next()).lambda$runOnExecuted$1(workGenerationalId, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public WorkSpec getRunningWorkSpec(String str) {
        synchronized (this.mLock) {
            try {
                WorkerWrapper workerWrapper = (WorkerWrapper) this.mForegroundWorkMap.get(str);
                if (workerWrapper == null) {
                    workerWrapper = (WorkerWrapper) this.mEnqueuedWorkMap.get(str);
                }
                if (workerWrapper == null) {
                    return null;
                }
                return workerWrapper.getWorkSpec();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void runOnExecuted(final WorkGenerationalId workGenerationalId, final boolean z) {
        this.mWorkTaskExecutor.getMainThreadExecutor().execute(new Runnable() { // from class: androidx.work.impl.Processor$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Processor.this.lambda$runOnExecuted$1(workGenerationalId, z);
            }
        });
    }

    private void stopForegroundService() {
        synchronized (this.mLock) {
            try {
                if (this.mForegroundWorkMap.isEmpty()) {
                    try {
                        this.mAppContext.startService(SystemForegroundDispatcher.createStopForegroundIntent(this.mAppContext));
                    } catch (Throwable th) {
                        Logger.get().error(TAG, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.mForegroundLock;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.mForegroundLock = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean interrupt(String str, WorkerWrapper workerWrapper) {
        if (workerWrapper != null) {
            workerWrapper.interrupt();
            Logger.get().debug(TAG, "WorkerWrapper interrupted for " + str);
            return true;
        }
        Logger.get().debug(TAG, "WorkerWrapper could not be found for " + str);
        return false;
    }

    private static class FutureListener implements Runnable {
        private ExecutionListener mExecutionListener;
        private ListenableFuture mFuture;
        private final WorkGenerationalId mWorkGenerationalId;

        FutureListener(ExecutionListener executionListener, WorkGenerationalId workGenerationalId, ListenableFuture listenableFuture) {
            this.mExecutionListener = executionListener;
            this.mWorkGenerationalId = workGenerationalId;
            this.mFuture = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                z = ((Boolean) this.mFuture.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.mExecutionListener.lambda$runOnExecuted$1(this.mWorkGenerationalId, z);
        }
    }
}

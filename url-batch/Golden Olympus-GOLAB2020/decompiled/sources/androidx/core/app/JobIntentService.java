package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    final ArrayList<b> mCompatQueue;
    WorkEnqueuer mCompatWorkEnqueuer;
    CommandProcessor mCurProcessor;
    CompatJobEngine mJobImpl;
    static final Object sLock = new Object();
    static final HashMap<ComponentName, WorkEnqueuer> sClassWorkEnqueuer = new HashMap<>();
    boolean mInterruptIfStopped = false;
    boolean mStopped = false;
    boolean mDestroyed = false;

    final class CommandProcessor extends AsyncTask {
        CommandProcessor() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                GenericWorkItem dequeueWork = JobIntentService.this.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                JobIntentService.this.onHandleWork(dequeueWork.getIntent());
                dequeueWork.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r12) {
            JobIntentService.this.processorFinished();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            JobIntentService.this.processorFinished();
        }
    }

    interface CompatJobEngine {
        IBinder a();

        GenericWorkItem b();
    }

    interface GenericWorkItem {
        void a();

        Intent getIntent();
    }

    static abstract class WorkEnqueuer {

        /* renamed from: a, reason: collision with root package name */
        final ComponentName f11581a;

        /* renamed from: b, reason: collision with root package name */
        boolean f11582b;

        /* renamed from: c, reason: collision with root package name */
        int f11583c;

        WorkEnqueuer(ComponentName componentName) {
            this.f11581a = componentName;
        }

        abstract void a(Intent intent);

        void b(int i4) {
            if (!this.f11582b) {
                this.f11582b = true;
                this.f11583c = i4;
            } else {
                if (this.f11583c == i4) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i4 + " is different than previous " + this.f11583c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    static final class a extends WorkEnqueuer {

        /* renamed from: d, reason: collision with root package name */
        private final Context f11584d;

        /* renamed from: e, reason: collision with root package name */
        private final PowerManager.WakeLock f11585e;

        /* renamed from: f, reason: collision with root package name */
        private final PowerManager.WakeLock f11586f;

        /* renamed from: g, reason: collision with root package name */
        boolean f11587g;

        /* renamed from: h, reason: collision with root package name */
        boolean f11588h;

        a(Context context, ComponentName componentName) {
            super(componentName);
            this.f11584d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f11585e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f11586f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f11581a);
            if (this.f11584d.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.f11587g) {
                            this.f11587g = true;
                            if (!this.f11588h) {
                                this.f11585e.acquire(60000L);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void c() {
            synchronized (this) {
                try {
                    if (this.f11588h) {
                        if (this.f11587g) {
                            this.f11585e.acquire(60000L);
                        }
                        this.f11588h = false;
                        this.f11586f.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void d() {
            synchronized (this) {
                try {
                    if (!this.f11588h) {
                        this.f11588h = true;
                        this.f11586f.acquire(600000L);
                        this.f11585e.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void e() {
            synchronized (this) {
                this.f11587g = false;
            }
        }
    }

    final class b implements GenericWorkItem {

        /* renamed from: a, reason: collision with root package name */
        final Intent f11589a;

        /* renamed from: b, reason: collision with root package name */
        final int f11590b;

        b(Intent intent, int i4) {
            this.f11589a = intent;
            this.f11590b = i4;
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public void a() {
            JobIntentService.this.stopSelf(this.f11590b);
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public Intent getIntent() {
            return this.f11589a;
        }
    }

    static final class c extends JobServiceEngine implements CompatJobEngine {

        /* renamed from: a, reason: collision with root package name */
        final JobIntentService f11592a;

        /* renamed from: b, reason: collision with root package name */
        final Object f11593b;

        /* renamed from: c, reason: collision with root package name */
        JobParameters f11594c;

        final class a implements GenericWorkItem {

            /* renamed from: a, reason: collision with root package name */
            final JobWorkItem f11595a;

            a(JobWorkItem jobWorkItem) {
                this.f11595a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public void a() {
                synchronized (c.this.f11593b) {
                    try {
                        JobParameters jobParameters = c.this.f11594c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f11595a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public Intent getIntent() {
                Intent intent;
                intent = this.f11595a.getIntent();
                return intent;
            }
        }

        c(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f11593b = new Object();
            this.f11592a = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        public IBinder a() {
            IBinder binder;
            binder = getBinder();
            return binder;
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        public GenericWorkItem b() {
            JobWorkItem dequeueWork;
            Intent intent;
            synchronized (this.f11593b) {
                try {
                    JobParameters jobParameters = this.f11594c;
                    if (jobParameters == null) {
                        return null;
                    }
                    dequeueWork = jobParameters.dequeueWork();
                    if (dequeueWork == null) {
                        return null;
                    }
                    intent = dequeueWork.getIntent();
                    intent.setExtrasClassLoader(this.f11592a.getClassLoader());
                    return new a(dequeueWork);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f11594c = jobParameters;
            this.f11592a.ensureProcessorRunningLocked(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean doStopCurrentWork = this.f11592a.doStopCurrentWork();
            synchronized (this.f11593b) {
                this.f11594c = null;
            }
            return doStopCurrentWork;
        }
    }

    static final class d extends WorkEnqueuer {

        /* renamed from: d, reason: collision with root package name */
        private final JobInfo f11597d;

        /* renamed from: e, reason: collision with root package name */
        private final JobScheduler f11598e;

        d(Context context, ComponentName componentName, int i4) {
            super(componentName);
            b(i4);
            this.f11597d = new JobInfo.Builder(i4, this.f11581a).setOverrideDeadline(0L).build();
            this.f11598e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        void a(Intent intent) {
            this.f11598e.enqueue(this.f11597d, n.a(intent));
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        } else {
            this.mCompatQueue = new ArrayList<>();
        }
    }

    public static void enqueueWork(Context context, Class<?> cls, int i4, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i4, intent);
    }

    static WorkEnqueuer getWorkEnqueuer(Context context, ComponentName componentName, boolean z4, int i4) {
        WorkEnqueuer aVar;
        HashMap<ComponentName, WorkEnqueuer> hashMap = sClassWorkEnqueuer;
        WorkEnqueuer workEnqueuer = hashMap.get(componentName);
        if (workEnqueuer != null) {
            return workEnqueuer;
        }
        if (Build.VERSION.SDK_INT < 26) {
            aVar = new a(context, componentName);
        } else {
            if (!z4) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            aVar = new d(context, componentName, i4);
        }
        hashMap.put(componentName, aVar);
        return aVar;
    }

    GenericWorkItem dequeueWork() {
        CompatJobEngine compatJobEngine = this.mJobImpl;
        if (compatJobEngine != null) {
            return compatJobEngine.b();
        }
        synchronized (this.mCompatQueue) {
            try {
                if (this.mCompatQueue.size() <= 0) {
                    return null;
                }
                return this.mCompatQueue.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean doStopCurrentWork() {
        CommandProcessor commandProcessor = this.mCurProcessor;
        if (commandProcessor != null) {
            commandProcessor.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    void ensureProcessorRunningLocked(boolean z4) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new CommandProcessor();
            WorkEnqueuer workEnqueuer = this.mCompatWorkEnqueuer;
            if (workEnqueuer != null && z4) {
                workEnqueuer.d();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        CompatJobEngine compatJobEngine = this.mJobImpl;
        if (compatJobEngine != null) {
            return compatJobEngine.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mJobImpl = new c(this);
            this.mCompatWorkEnqueuer = null;
        } else {
            this.mJobImpl = null;
            this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<b> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.c();
            }
        }
    }

    protected abstract void onHandleWork(Intent intent);

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.e();
        synchronized (this.mCompatQueue) {
            ArrayList<b> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new b(intent, i5));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    void processorFinished() {
        ArrayList<b> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mCurProcessor = null;
                    ArrayList<b> arrayList2 = this.mCompatQueue;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        ensureProcessorRunningLocked(false);
                    } else if (!this.mDestroyed) {
                        this.mCompatWorkEnqueuer.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z4) {
        this.mInterruptIfStopped = z4;
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i4, Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (sLock) {
            WorkEnqueuer workEnqueuer = getWorkEnqueuer(context, componentName, true, i4);
            workEnqueuer.b(i4);
            workEnqueuer.a(intent);
        }
    }
}

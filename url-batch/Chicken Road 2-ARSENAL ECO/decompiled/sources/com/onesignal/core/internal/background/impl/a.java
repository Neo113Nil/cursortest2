package com.onesignal.core.internal.background.impl;

import H5.AbstractC0165z;
import H5.F;
import H5.InterfaceC0163x;
import H5.X;
import M5.s;
import T1.e;
import T1.f;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.onesignal.core.services.SyncJobService;
import g2.InterfaceC0391a;
import java.util.Iterator;
import java.util.List;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.g;
import u0.AbstractC0676f;
import x5.InterfaceC0732a;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class a implements e, V1.a, com.onesignal.core.internal.startup.b {
    public static final C0015a Companion = new C0015a(null);
    private static final int SYNC_TASK_ID = 2071862118;
    private final f _applicationService;
    private final List<V1.b> _backgroundServices;
    private final InterfaceC0391a _time;
    private X backgroundSyncJob;
    private final Object lock;
    private boolean needsJobReschedule;
    private long nextScheduledSyncTimeMs;
    private final Class<?> syncServiceJobClass;

    /* renamed from: com.onesignal.core.internal.background.impl.a$a, reason: collision with other inner class name */
    public static final class C0015a {
        public /* synthetic */ C0015a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0015a() {
        }
    }

    public static final class b extends j implements InterfaceC0732a {
        public b() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public /* bridge */ /* synthetic */ Object invoke() {
            m5invoke();
            return v.f5219a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5invoke() {
            a.this.cancelSyncTask();
        }
    }

    public static final class c extends j implements InterfaceC0732a {
        public c() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public /* bridge */ /* synthetic */ Object invoke() {
            m6invoke();
            return v.f5219a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m6invoke() {
            a.this.scheduleBackground();
        }
    }

    public static final class d extends g implements InterfaceC0747p {
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: com.onesignal.core.internal.background.impl.a$d$a, reason: collision with other inner class name */
        public static final class C0016a extends g implements InterfaceC0747p {
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0016a(a aVar, InterfaceC0564d interfaceC0564d) {
                super(2, interfaceC0564d);
                this.this$0 = aVar;
            }

            @Override // q5.AbstractC0605a
            public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
                return new C0016a(this.this$0, interfaceC0564d);
            }

            @Override // x5.InterfaceC0747p
            public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
                return ((C0016a) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
            }

            @Override // q5.AbstractC0605a
            public final Object invokeSuspend(Object obj) {
                Iterator it;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                int i7 = this.label;
                if (i7 == 0) {
                    AbstractC0676f.w(obj);
                    Object obj2 = this.this$0.lock;
                    a aVar = this.this$0;
                    synchronized (obj2) {
                        aVar.nextScheduledSyncTimeMs = 0L;
                    }
                    it = this.this$0._backgroundServices.iterator();
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.L$0;
                    AbstractC0676f.w(obj);
                }
                while (it.hasNext()) {
                    V1.b bVar = (V1.b) it.next();
                    this.L$0 = it;
                    this.label = 1;
                    if (bVar.backgroundRun(this) == enumC0580a) {
                        return enumC0580a;
                    }
                }
                this.this$0.scheduleBackground();
                return v.f5219a;
            }
        }

        public d(InterfaceC0564d interfaceC0564d) {
            super(2, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
            d dVar = a.this.new d(interfaceC0564d);
            dVar.L$0 = obj;
            return dVar;
        }

        @Override // x5.InterfaceC0747p
        public final Object invoke(InterfaceC0163x interfaceC0163x, InterfaceC0564d interfaceC0564d) {
            return ((d) create(interfaceC0163x, interfaceC0564d)).invokeSuspend(v.f5219a);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
            InterfaceC0163x interfaceC0163x = (InterfaceC0163x) this.L$0;
            com.onesignal.debug.internal.logging.b.debug$default("OSBackground sync, calling initWithContext", null, 2, null);
            a aVar = a.this;
            aVar.backgroundSyncJob = AbstractC0165z.l(interfaceC0163x, F.f1028b, new C0016a(aVar, null), 2);
            return v.f5219a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(f _applicationService, InterfaceC0391a _time, List<? extends V1.b> _backgroundServices) {
        i.e(_applicationService, "_applicationService");
        i.e(_time, "_time");
        i.e(_backgroundServices, "_backgroundServices");
        this._applicationService = _applicationService;
        this._time = _time;
        this._backgroundServices = _backgroundServices;
        this.lock = new Object();
        this.syncServiceJobClass = SyncJobService.class;
    }

    private final void cancelBackgroundSyncTask() {
        com.onesignal.debug.internal.logging.b.debug$default(a.class.getSimpleName().concat(" cancel background sync"), null, 2, null);
        synchronized (this.lock) {
            Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
            i.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            ((JobScheduler) systemService).cancel(SYNC_TASK_ID);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelSyncTask() {
        synchronized (this.lock) {
            this.nextScheduledSyncTimeMs = 0L;
            cancelBackgroundSyncTask();
        }
    }

    private final boolean hasBootPermission() {
        return u.f.a(this._applicationService.getAppContext(), "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    private final boolean isJobIdRunning() {
        X x6;
        Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
        i.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        Iterator<JobInfo> it = ((JobScheduler) systemService).getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == SYNC_TASK_ID && (x6 = this.backgroundSyncJob) != null) {
                i.b(x6);
                if (x6.a()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleBackground() {
        Iterator<V1.b> it = this._backgroundServices.iterator();
        Long l7 = null;
        while (it.hasNext()) {
            Long scheduleBackgroundRunIn = it.next().getScheduleBackgroundRunIn();
            if (scheduleBackgroundRunIn != null && (l7 == null || scheduleBackgroundRunIn.longValue() < l7.longValue())) {
                l7 = scheduleBackgroundRunIn;
            }
        }
        if (l7 != null) {
            scheduleSyncTask(l7.longValue());
        }
    }

    private final void scheduleBackgroundSyncTask(long j4) {
        synchronized (this.lock) {
            scheduleSyncServiceAsJob(j4);
        }
    }

    private final void scheduleSyncServiceAsJob(long j4) {
        com.onesignal.debug.internal.logging.b.debug$default("OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j4, null, 2, null);
        if (isJobIdRunning()) {
            com.onesignal.debug.internal.logging.b.verbose$default("OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!", null, 2, null);
            setNeedsJobReschedule(true);
            return;
        }
        Context appContext = this._applicationService.getAppContext();
        i.b(appContext);
        Class<?> cls = this.syncServiceJobClass;
        i.b(cls);
        JobInfo.Builder builder = new JobInfo.Builder(SYNC_TASK_ID, new ComponentName(appContext, cls));
        builder.setMinimumLatency(j4).setRequiredNetworkType(1);
        if (hasBootPermission()) {
            builder.setPersisted(true);
        }
        Context appContext2 = this._applicationService.getAppContext();
        i.b(appContext2);
        Object systemService = appContext2.getSystemService("jobscheduler");
        i.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        try {
            com.onesignal.debug.internal.logging.b.info$default("OSBackgroundSync scheduleSyncServiceAsJob:result: " + ((JobScheduler) systemService).schedule(builder.build()), null, 2, null);
        } catch (NullPointerException e4) {
            com.onesignal.debug.internal.logging.b.info("scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e4);
        }
    }

    private final void scheduleSyncTask(long j4) {
        synchronized (this.lock) {
            if (this.nextScheduledSyncTimeMs != 0 && this._time.getCurrentTimeMillis() + j4 > this.nextScheduledSyncTimeMs) {
                com.onesignal.debug.internal.logging.b.debug$default("OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.nextScheduledSyncTimeMs, null, 2, null);
            } else {
                if (j4 < 5000) {
                    j4 = 5000;
                }
                scheduleBackgroundSyncTask(j4);
                this.nextScheduledSyncTimeMs = this._time.getCurrentTimeMillis() + j4;
            }
        }
    }

    @Override // V1.a
    public boolean cancelRunBackgroundServices() {
        X x6 = this.backgroundSyncJob;
        if (x6 == null || !x6.a()) {
            return false;
        }
        X x7 = this.backgroundSyncJob;
        i.b(x7);
        x7.d(null);
        return true;
    }

    @Override // V1.a
    public boolean getNeedsJobReschedule() {
        return this.needsJobReschedule;
    }

    @Override // T1.e
    public void onFocus(boolean z5) {
        com.onesignal.common.threading.b.runOnSerialIO(new b());
    }

    @Override // T1.e
    public void onUnfocused() {
        com.onesignal.common.threading.b.runOnSerialIO(new c());
    }

    @Override // V1.a
    public Object runBackgroundServices(InterfaceC0564d interfaceC0564d) {
        d dVar = new d(null);
        s sVar = new s(interfaceC0564d.getContext(), interfaceC0564d);
        Object i02 = A3.c.i0(sVar, sVar, dVar);
        return i02 == EnumC0580a.f5697f ? i02 : v.f5219a;
    }

    @Override // V1.a
    public void setNeedsJobReschedule(boolean z5) {
        this.needsJobReschedule = z5;
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }
}

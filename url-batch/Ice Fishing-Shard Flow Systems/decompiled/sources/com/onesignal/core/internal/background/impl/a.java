package com.onesignal.core.internal.background.impl;

import X5.j;
import a.AbstractC0169a;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.onesignal.core.services.SyncJobService;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import n6.AbstractC0792z;
import n6.F;
import n6.InterfaceC0789w;
import n6.X;
import v2.e;
import v2.f;
import x2.InterfaceC1004a;

/* loaded from: classes.dex */
public final class a implements e, InterfaceC1004a, com.onesignal.core.internal.startup.b {
    public static final C0014a Companion = new C0014a(null);
    private static final int SYNC_TASK_ID = 2071862118;
    private final f _applicationService;
    private final List<x2.b> _backgroundServices;
    private final I2.a _time;
    private X backgroundSyncJob;
    private final Object lock;
    private boolean needsJobReschedule;
    private long nextScheduledSyncTimeMs;
    private final Class<?> syncServiceJobClass;

    /* renamed from: com.onesignal.core.internal.background.impl.a$a, reason: collision with other inner class name */
    public static final class C0014a {
        public /* synthetic */ C0014a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0014a() {
        }
    }

    public static final class b extends p implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m7invoke();
            return Unit.f6114a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m7invoke() {
            a.this.cancelSyncTask();
        }
    }

    public static final class c extends p implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m8invoke();
            return Unit.f6114a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m8invoke() {
            a.this.scheduleBackground();
        }
    }

    public static final class d extends j implements Function2 {
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: com.onesignal.core.internal.background.impl.a$d$a, reason: collision with other inner class name */
        public static final class C0015a extends j implements Function2 {
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0015a(a aVar, V5.b bVar) {
                super(2, bVar);
                this.this$0 = aVar;
            }

            @Override // X5.a
            public final V5.b create(Object obj, V5.b bVar) {
                return new C0015a(this.this$0, bVar);
            }

            @Override // X5.a
            public final Object invokeSuspend(Object obj) {
                Iterator it;
                W5.a aVar = W5.a.f2787d;
                int i2 = this.label;
                if (i2 == 0) {
                    V6.b.P(obj);
                    Object obj2 = this.this$0.lock;
                    a aVar2 = this.this$0;
                    synchronized (obj2) {
                        aVar2.nextScheduledSyncTimeMs = 0L;
                        Unit unit = Unit.f6114a;
                    }
                    it = this.this$0._backgroundServices.iterator();
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.L$0;
                    V6.b.P(obj);
                }
                while (it.hasNext()) {
                    x2.b bVar = (x2.b) it.next();
                    this.L$0 = it;
                    this.label = 1;
                    if (bVar.backgroundRun(this) == aVar) {
                        return aVar;
                    }
                }
                this.this$0.scheduleBackground();
                return Unit.f6114a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
                return ((C0015a) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
            }
        }

        public d(V5.b bVar) {
            super(2, bVar);
        }

        @Override // X5.a
        public final V5.b create(Object obj, V5.b bVar) {
            d dVar = a.this.new d(bVar);
            dVar.L$0 = obj;
            return dVar;
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            InterfaceC0789w interfaceC0789w = (InterfaceC0789w) this.L$0;
            com.onesignal.debug.internal.logging.b.debug$default("OSBackground sync, calling initWithContext", null, 2, null);
            a aVar2 = a.this;
            aVar2.backgroundSyncJob = AbstractC0792z.l(interfaceC0789w, F.f7012b, new C0015a(aVar2, null), 2);
            return Unit.f6114a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0789w interfaceC0789w, V5.b bVar) {
            return ((d) create(interfaceC0789w, bVar)).invokeSuspend(Unit.f6114a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(f _applicationService, I2.a _time, List<? extends x2.b> _backgroundServices) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_backgroundServices, "_backgroundServices");
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
            Intrinsics.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            ((JobScheduler) systemService).cancel(SYNC_TASK_ID);
            Unit unit = Unit.f6114a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelSyncTask() {
        synchronized (this.lock) {
            this.nextScheduledSyncTimeMs = 0L;
            cancelBackgroundSyncTask();
            Unit unit = Unit.f6114a;
        }
    }

    private final boolean hasBootPermission() {
        return AbstractC0169a.b(this._applicationService.getAppContext(), "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    private final boolean isJobIdRunning() {
        X x7;
        Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
        Intrinsics.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        Iterator<JobInfo> it = ((JobScheduler) systemService).getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == SYNC_TASK_ID && (x7 = this.backgroundSyncJob) != null) {
                Intrinsics.b(x7);
                if (x7.a()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleBackground() {
        Iterator<x2.b> it = this._backgroundServices.iterator();
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

    private final void scheduleBackgroundSyncTask(long j) {
        synchronized (this.lock) {
            scheduleSyncServiceAsJob(j);
            Unit unit = Unit.f6114a;
        }
    }

    private final void scheduleSyncServiceAsJob(long j) {
        com.onesignal.debug.internal.logging.b.debug$default("OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j, null, 2, null);
        if (isJobIdRunning()) {
            com.onesignal.debug.internal.logging.b.verbose$default("OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!", null, 2, null);
            setNeedsJobReschedule(true);
            return;
        }
        Context appContext = this._applicationService.getAppContext();
        Intrinsics.b(appContext);
        Class<?> cls = this.syncServiceJobClass;
        Intrinsics.b(cls);
        JobInfo.Builder builder = new JobInfo.Builder(SYNC_TASK_ID, new ComponentName(appContext, cls));
        builder.setMinimumLatency(j).setRequiredNetworkType(1);
        if (hasBootPermission()) {
            builder.setPersisted(true);
        }
        Context appContext2 = this._applicationService.getAppContext();
        Intrinsics.b(appContext2);
        Object systemService = appContext2.getSystemService("jobscheduler");
        Intrinsics.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        try {
            com.onesignal.debug.internal.logging.b.info$default("OSBackgroundSync scheduleSyncServiceAsJob:result: " + ((JobScheduler) systemService).schedule(builder.build()), null, 2, null);
        } catch (NullPointerException e7) {
            com.onesignal.debug.internal.logging.b.info("scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e7);
        }
    }

    private final void scheduleSyncTask(long j) {
        synchronized (this.lock) {
            if (this.nextScheduledSyncTimeMs != 0 && this._time.getCurrentTimeMillis() + j > this.nextScheduledSyncTimeMs) {
                com.onesignal.debug.internal.logging.b.debug$default("OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.nextScheduledSyncTimeMs, null, 2, null);
            } else {
                if (j < 5000) {
                    j = 5000;
                }
                scheduleBackgroundSyncTask(j);
                this.nextScheduledSyncTimeMs = this._time.getCurrentTimeMillis() + j;
                Unit unit = Unit.f6114a;
            }
        }
    }

    @Override // x2.InterfaceC1004a
    public boolean cancelRunBackgroundServices() {
        X x7 = this.backgroundSyncJob;
        if (x7 == null || !x7.a()) {
            return false;
        }
        X x8 = this.backgroundSyncJob;
        Intrinsics.b(x8);
        x8.d(null);
        return true;
    }

    @Override // x2.InterfaceC1004a
    public boolean getNeedsJobReschedule() {
        return this.needsJobReschedule;
    }

    @Override // v2.e
    public void onFocus(boolean z7) {
        com.onesignal.common.threading.b.runOnSerialIOIfBackgroundThreading(new b());
    }

    @Override // v2.e
    public void onUnfocused() {
        com.onesignal.common.threading.b.runOnSerialIOIfBackgroundThreading(new c());
    }

    @Override // x2.InterfaceC1004a
    public Object runBackgroundServices(V5.b bVar) {
        Object c7 = AbstractC0792z.c(new d(null), bVar);
        return c7 == W5.a.f2787d ? c7 : Unit.f6114a;
    }

    @Override // x2.InterfaceC1004a
    public void setNeedsJobReschedule(boolean z7) {
        this.needsJobReschedule = z7;
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }
}

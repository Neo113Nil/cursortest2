package com.onesignal.core.internal.background.impl;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import cf.c;
import com.onesignal.core.services.SyncJobService;
import ea.e;
import ea.f;
import ge.a0;
import ge.c1;
import ge.k0;
import ge.x;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nd.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements e, ga.a, ra.b {
    public static final C0011a Companion = new C0011a(null);
    private static final int SYNC_TASK_ID = 2071862118;
    private final f _applicationService;
    private final List<ga.b> _backgroundServices;
    private final sa.a _time;
    private c1 backgroundSyncJob;
    private final Object lock;
    private boolean needsJobReschedule;
    private long nextScheduledSyncTimeMs;
    private final Class<?> syncServiceJobClass;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends i implements Function2 {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        /* renamed from: com.onesignal.core.internal.background.impl.a$b$a, reason: collision with other inner class name */
        public static final class C0012a extends i implements Function2 {
            Object L$0;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0012a(a aVar, ld.a aVar2) {
                super(2, aVar2);
                this.this$0 = aVar;
            }

            @Override // nd.a
            public final ld.a create(Object obj, ld.a aVar) {
                return new C0012a(this.this$0, aVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(x xVar, ld.a aVar) {
                return ((C0012a) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
            }

            @Override // nd.a
            public final Object invokeSuspend(Object obj) {
                Iterator it;
                md.a aVar = md.a.f6622d;
                int i3 = this.label;
                if (i3 == 0) {
                    c.M(obj);
                    Object obj2 = this.this$0.lock;
                    a aVar2 = this.this$0;
                    synchronized (obj2) {
                        aVar2.nextScheduledSyncTimeMs = 0L;
                    }
                    it = this.this$0._backgroundServices.iterator();
                } else {
                    if (i3 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) this.L$0;
                    c.M(obj);
                }
                while (it.hasNext()) {
                    ga.b bVar = (ga.b) it.next();
                    this.L$0 = it;
                    this.label = 1;
                    if (bVar.backgroundRun(this) == aVar) {
                        return aVar;
                    }
                }
                this.this$0.scheduleBackground();
                return Unit.f5554a;
            }
        }

        public b(ld.a aVar) {
            super(2, aVar);
        }

        @Override // nd.a
        public final ld.a create(Object obj, ld.a aVar) {
            b bVar = a.this.new b(aVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, ld.a aVar) {
            return ((b) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            if (this.label != 0) {
                i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c.M(obj);
            x xVar = (x) this.L$0;
            com.onesignal.debug.internal.logging.b.debug$default("OSBackground sync, calling initWithContext", null, 2, null);
            a aVar2 = a.this;
            aVar2.backgroundSyncJob = a0.s(xVar, k0.f4373b, new C0012a(aVar2, null), 2);
            return Unit.f5554a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(f fVar, sa.a aVar, List<? extends ga.b> list) {
        fVar.getClass();
        aVar.getClass();
        list.getClass();
        this._applicationService = fVar;
        this._time = aVar;
        this._backgroundServices = list;
        this.lock = new Object();
        this.syncServiceJobClass = SyncJobService.class;
    }

    private final void cancelBackgroundSyncTask() {
        com.onesignal.debug.internal.logging.b.debug$default(a.class.getSimpleName().concat(" cancel background sync"), null, 2, null);
        synchronized (this.lock) {
            Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
            systemService.getClass();
            ((JobScheduler) systemService).cancel(SYNC_TASK_ID);
        }
    }

    private final void cancelSyncTask() {
        synchronized (this.lock) {
            this.nextScheduledSyncTimeMs = 0L;
            cancelBackgroundSyncTask();
        }
    }

    private final boolean hasBootPermission() {
        return k7.e.i(this._applicationService.getAppContext(), "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    private final boolean isJobIdRunning() {
        c1 c1Var;
        Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
        systemService.getClass();
        Iterator<JobInfo> it = ((JobScheduler) systemService).getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == SYNC_TASK_ID && (c1Var = this.backgroundSyncJob) != null) {
                c1Var.getClass();
                if (c1Var.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleBackground() {
        Iterator<ga.b> it = this._backgroundServices.iterator();
        Long l10 = null;
        while (it.hasNext()) {
            Long scheduleBackgroundRunIn = it.next().getScheduleBackgroundRunIn();
            if (scheduleBackgroundRunIn != null && (l10 == null || scheduleBackgroundRunIn.longValue() < l10.longValue())) {
                l10 = scheduleBackgroundRunIn;
            }
        }
        if (l10 != null) {
            scheduleSyncTask(l10.longValue());
        }
    }

    private final void scheduleBackgroundSyncTask(long j) {
        synchronized (this.lock) {
            scheduleSyncServiceAsJob(j);
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
        appContext.getClass();
        Class<?> cls = this.syncServiceJobClass;
        cls.getClass();
        JobInfo.Builder builder = new JobInfo.Builder(SYNC_TASK_ID, new ComponentName(appContext, cls));
        builder.setMinimumLatency(j).setRequiredNetworkType(1);
        if (hasBootPermission()) {
            builder.setPersisted(true);
        }
        Context appContext2 = this._applicationService.getAppContext();
        appContext2.getClass();
        Object systemService = appContext2.getSystemService("jobscheduler");
        systemService.getClass();
        try {
            com.onesignal.debug.internal.logging.b.info$default("OSBackgroundSync scheduleSyncServiceAsJob:result: " + ((JobScheduler) systemService).schedule(builder.build()), null, 2, null);
        } catch (NullPointerException e2) {
            com.onesignal.debug.internal.logging.b.error("scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e2);
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
            }
        }
    }

    @Override // ga.a
    public boolean cancelRunBackgroundServices() {
        c1 c1Var = this.backgroundSyncJob;
        if (c1Var == null || !c1Var.d()) {
            return false;
        }
        c1 c1Var2 = this.backgroundSyncJob;
        c1Var2.getClass();
        c1Var2.a(null);
        return true;
    }

    @Override // ga.a
    public boolean getNeedsJobReschedule() {
        return this.needsJobReschedule;
    }

    @Override // ea.e
    public void onFocus(boolean z10) {
        cancelSyncTask();
    }

    @Override // ea.e
    public void onUnfocused() {
        scheduleBackground();
    }

    @Override // ga.a
    public Object runBackgroundServices(ld.a aVar) {
        Object h10 = a0.h(new b(null), aVar);
        return h10 == md.a.f6622d ? h10 : Unit.f5554a;
    }

    @Override // ga.a
    public void setNeedsJobReschedule(boolean z10) {
        this.needsJobReschedule = z10;
    }

    @Override // ra.b
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.core.internal.background.impl.a$a, reason: collision with other inner class name */
    public static final class C0011a {
        public /* synthetic */ C0011a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0011a() {
        }
    }
}

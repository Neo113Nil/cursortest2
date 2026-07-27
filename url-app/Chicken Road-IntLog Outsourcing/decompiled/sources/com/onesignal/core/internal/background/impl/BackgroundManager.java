package com.onesignal.core.internal.background.impl;

import D4.X;
import I4.t;
import a.AbstractC0169a;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.background.IBackgroundManager;
import com.onesignal.core.internal.background.IBackgroundService;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.core.services.SyncJobService;
import com.onesignal.debug.internal.crash.AnrConstants;
import com.onesignal.debug.internal.logging.Logging;
import f4.v;
import java.util.Iterator;
import java.util.List;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import v.f;

/* loaded from: classes.dex */
public final class BackgroundManager implements IApplicationLifecycleHandler, IBackgroundManager, IStartableService {
    public static final Companion Companion = new Companion(null);
    private static final int SYNC_TASK_ID = 2071862118;
    private final IApplicationService _applicationService;
    private final List<IBackgroundService> _backgroundServices;
    private final ITime _time;
    private X backgroundSyncJob;
    private final Object lock;
    private boolean needsJobReschedule;
    private long nextScheduledSyncTimeMs;
    private final Class<?> syncServiceJobClass;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BackgroundManager(IApplicationService _applicationService, ITime _time, List<? extends IBackgroundService> _backgroundServices) {
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
        Logging.debug$default("BackgroundManager cancel background sync", null, 2, null);
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
        return f.a(this._applicationService.getAppContext(), "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    private final boolean isJobIdRunning() {
        X x5;
        Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
        i.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        Iterator<JobInfo> it = ((JobScheduler) systemService).getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == SYNC_TASK_ID && (x5 = this.backgroundSyncJob) != null) {
                i.b(x5);
                if (x5.a()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleBackground() {
        Iterator<IBackgroundService> it = this._backgroundServices.iterator();
        Long l2 = null;
        while (it.hasNext()) {
            Long scheduleBackgroundRunIn = it.next().getScheduleBackgroundRunIn();
            if (scheduleBackgroundRunIn != null && (l2 == null || scheduleBackgroundRunIn.longValue() < l2.longValue())) {
                l2 = scheduleBackgroundRunIn;
            }
        }
        if (l2 != null) {
            scheduleSyncTask(l2.longValue());
        }
    }

    private final void scheduleBackgroundSyncTask(long j2) {
        synchronized (this.lock) {
            scheduleSyncServiceAsJob(j2);
        }
    }

    private final void scheduleSyncServiceAsJob(long j2) {
        Logging.debug$default("OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j2, null, 2, null);
        if (isJobIdRunning()) {
            Logging.verbose$default("OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!", null, 2, null);
            setNeedsJobReschedule(true);
            return;
        }
        Context appContext = this._applicationService.getAppContext();
        i.b(appContext);
        Class<?> cls = this.syncServiceJobClass;
        i.b(cls);
        JobInfo.Builder builder = new JobInfo.Builder(SYNC_TASK_ID, new ComponentName(appContext, cls));
        builder.setMinimumLatency(j2).setRequiredNetworkType(1);
        if (hasBootPermission()) {
            builder.setPersisted(true);
        }
        Context appContext2 = this._applicationService.getAppContext();
        i.b(appContext2);
        Object systemService = appContext2.getSystemService("jobscheduler");
        i.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        try {
            Logging.info$default("OSBackgroundSync scheduleSyncServiceAsJob:result: " + ((JobScheduler) systemService).schedule(builder.build()), null, 2, null);
        } catch (NullPointerException e3) {
            Logging.info("scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e3);
        }
    }

    private final void scheduleSyncTask(long j2) {
        synchronized (this.lock) {
            if (this.nextScheduledSyncTimeMs != 0 && this._time.getCurrentTimeMillis() + j2 > this.nextScheduledSyncTimeMs) {
                Logging.debug$default("OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.nextScheduledSyncTimeMs, null, 2, null);
            } else {
                if (j2 < AnrConstants.DEFAULT_ANR_THRESHOLD_MS) {
                    j2 = 5000;
                }
                scheduleBackgroundSyncTask(j2);
                this.nextScheduledSyncTimeMs = this._time.getCurrentTimeMillis() + j2;
            }
        }
    }

    @Override // com.onesignal.core.internal.background.IBackgroundManager
    public boolean cancelRunBackgroundServices() {
        X x5 = this.backgroundSyncJob;
        if (x5 == null || !x5.a()) {
            return false;
        }
        X x6 = this.backgroundSyncJob;
        i.b(x6);
        x6.b(null);
        return true;
    }

    @Override // com.onesignal.core.internal.background.IBackgroundManager
    public boolean getNeedsJobReschedule() {
        return this.needsJobReschedule;
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onFocus(boolean z) {
        ThreadUtilsKt.runOnSerialIOIfBackgroundThreading(new BackgroundManager$onFocus$1(this));
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onUnfocused() {
        ThreadUtilsKt.runOnSerialIOIfBackgroundThreading(new BackgroundManager$onUnfocused$1(this));
    }

    @Override // com.onesignal.core.internal.background.IBackgroundManager
    public Object runBackgroundServices(InterfaceC1218d interfaceC1218d) {
        BackgroundManager$runBackgroundServices$2 backgroundManager$runBackgroundServices$2 = new BackgroundManager$runBackgroundServices$2(this, null);
        t tVar = new t(interfaceC1218d, interfaceC1218d.getContext());
        Object G5 = AbstractC0169a.G(tVar, tVar, backgroundManager$runBackgroundServices$2);
        return G5 == EnumC1260a.f11058a ? G5 : v.f5689a;
    }

    @Override // com.onesignal.core.internal.background.IBackgroundManager
    public void setNeedsJobReschedule(boolean z) {
        this.needsJobReschedule = z;
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }
}

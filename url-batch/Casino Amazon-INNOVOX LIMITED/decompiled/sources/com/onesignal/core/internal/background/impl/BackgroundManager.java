package com.onesignal.core.internal.background.impl;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import androidx.core.content.ContextCompat;
import com.facebook.react.uimanager.ViewProps;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.background.IBackgroundManager;
import com.onesignal.core.internal.background.IBackgroundService;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.core.services.SyncJobService;
import com.onesignal.debug.internal.logging.Logging;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

/* compiled from: BackgroundManager.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001+B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u0011H\u0002J\b\u0010\u001f\u001a\u00020\u0011H\u0002J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0011H\u0016J\b\u0010\"\u001a\u00020\u001bH\u0016J\u000e\u0010#\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u001bH\u0002J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u0017H\u0002J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u0017H\u0002J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u0017H\u0002J\b\u0010*\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/onesignal/core/internal/background/impl/BackgroundManager;", "Lcom/onesignal/core/internal/application/IApplicationLifecycleHandler;", "Lcom/onesignal/core/internal/background/IBackgroundManager;", "Lcom/onesignal/core/internal/startup/IStartableService;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_time", "Lcom/onesignal/core/internal/time/ITime;", "_backgroundServices", "", "Lcom/onesignal/core/internal/background/IBackgroundService;", "(Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/core/internal/time/ITime;Ljava/util/List;)V", "backgroundSyncJob", "Lkotlinx/coroutines/Job;", "lock", "", "needsJobReschedule", "", "getNeedsJobReschedule", "()Z", "setNeedsJobReschedule", "(Z)V", "nextScheduledSyncTimeMs", "", "syncServiceJobClass", "Ljava/lang/Class;", "cancelBackgroundSyncTask", "", "cancelRunBackgroundServices", "cancelSyncTask", "hasBootPermission", "isJobIdRunning", "onFocus", "firedOnSubscribe", "onUnfocused", "runBackgroundServices", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scheduleBackground", "scheduleBackgroundSyncTask", "delayMs", "scheduleSyncServiceAsJob", "scheduleSyncTask", ViewProps.START, "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BackgroundManager implements IApplicationLifecycleHandler, IBackgroundManager, IStartableService {
    private static final int SYNC_TASK_ID = 2071862118;
    private final IApplicationService _applicationService;
    private final List<IBackgroundService> _backgroundServices;
    private final ITime _time;
    private Job backgroundSyncJob;
    private final Object lock;
    private boolean needsJobReschedule;
    private long nextScheduledSyncTimeMs;
    private final Class<?> syncServiceJobClass;

    /* JADX WARN: Multi-variable type inference failed */
    public BackgroundManager(IApplicationService _applicationService, ITime _time, List<? extends IBackgroundService> _backgroundServices) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_backgroundServices, "_backgroundServices");
        this._applicationService = _applicationService;
        this._time = _time;
        this._backgroundServices = _backgroundServices;
        this.lock = new Object();
        this.syncServiceJobClass = SyncJobService.class;
    }

    @Override // com.onesignal.core.internal.background.IBackgroundManager
    public boolean getNeedsJobReschedule() {
        return this.needsJobReschedule;
    }

    @Override // com.onesignal.core.internal.background.IBackgroundManager
    public void setNeedsJobReschedule(boolean z) {
        this.needsJobReschedule = z;
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onFocus(boolean firedOnSubscribe) {
        ThreadUtilsKt.runOnSerialIO(new Function0<Unit>() { // from class: com.onesignal.core.internal.background.impl.BackgroundManager$onFocus$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BackgroundManager.this.cancelSyncTask();
            }
        });
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onUnfocused() {
        ThreadUtilsKt.runOnSerialIO(new Function0<Unit>() { // from class: com.onesignal.core.internal.background.impl.BackgroundManager$onUnfocused$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BackgroundManager.this.scheduleBackground();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleBackground() {
        Iterator<IBackgroundService> it = this._backgroundServices.iterator();
        Long l = null;
        while (it.hasNext()) {
            Long scheduleBackgroundRunIn = it.next().getScheduleBackgroundRunIn();
            if (scheduleBackgroundRunIn != null && (l == null || scheduleBackgroundRunIn.longValue() < l.longValue())) {
                l = scheduleBackgroundRunIn;
            }
        }
        if (l != null) {
            scheduleSyncTask(l.longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelSyncTask() {
        synchronized (this.lock) {
            this.nextScheduledSyncTimeMs = 0L;
            cancelBackgroundSyncTask();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.onesignal.core.internal.background.IBackgroundManager
    public Object runBackgroundServices(Continuation<? super Unit> continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new BackgroundManager$runBackgroundServices$2(this, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    @Override // com.onesignal.core.internal.background.IBackgroundManager
    public boolean cancelRunBackgroundServices() {
        Job job = this.backgroundSyncJob;
        if (job == null) {
            return false;
        }
        Intrinsics.checkNotNull(job);
        if (!job.isActive()) {
            return false;
        }
        Job job2 = this.backgroundSyncJob;
        Intrinsics.checkNotNull(job2);
        Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        return true;
    }

    private final void scheduleSyncTask(long delayMs) {
        synchronized (this.lock) {
            if (this.nextScheduledSyncTimeMs != 0 && this._time.getCurrentTimeMillis() + delayMs > this.nextScheduledSyncTimeMs) {
                Logging.debug$default("OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.nextScheduledSyncTimeMs, null, 2, null);
                return;
            }
            if (delayMs < 5000) {
                delayMs = 5000;
            }
            scheduleBackgroundSyncTask(delayMs);
            this.nextScheduledSyncTimeMs = this._time.getCurrentTimeMillis() + delayMs;
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void scheduleBackgroundSyncTask(long delayMs) {
        synchronized (this.lock) {
            scheduleSyncServiceAsJob(delayMs);
            Unit unit = Unit.INSTANCE;
        }
    }

    private final boolean hasBootPermission() {
        return ContextCompat.checkSelfPermission(this._applicationService.getAppContext(), "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    private final boolean isJobIdRunning() {
        Job job;
        Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        Iterator<JobInfo> it = ((JobScheduler) systemService).getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == SYNC_TASK_ID && (job = this.backgroundSyncJob) != null) {
                Intrinsics.checkNotNull(job);
                if (job.isActive()) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void scheduleSyncServiceAsJob(long delayMs) {
        Logging.debug$default("OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + delayMs, null, 2, null);
        if (isJobIdRunning()) {
            Logging.verbose$default("OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!", null, 2, null);
            setNeedsJobReschedule(true);
            return;
        }
        Context appContext = this._applicationService.getAppContext();
        Intrinsics.checkNotNull(appContext);
        Class<?> cls = this.syncServiceJobClass;
        Intrinsics.checkNotNull(cls);
        JobInfo.Builder builder = new JobInfo.Builder(SYNC_TASK_ID, new ComponentName(appContext, cls));
        builder.setMinimumLatency(delayMs).setRequiredNetworkType(1);
        if (hasBootPermission()) {
            builder.setPersisted(true);
        }
        Context appContext2 = this._applicationService.getAppContext();
        Intrinsics.checkNotNull(appContext2);
        Object systemService = appContext2.getSystemService("jobscheduler");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        try {
            Logging.info$default("OSBackgroundSync scheduleSyncServiceAsJob:result: " + ((JobScheduler) systemService).schedule(builder.build()), null, 2, null);
        } catch (NullPointerException e) {
            Logging.info("scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e);
        }
    }

    private final void cancelBackgroundSyncTask() {
        Logging.debug$default(getClass().getSimpleName() + " cancel background sync", null, 2, null);
        synchronized (this.lock) {
            Object systemService = this._applicationService.getAppContext().getSystemService("jobscheduler");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            ((JobScheduler) systemService).cancel(SYNC_TASK_ID);
            Unit unit = Unit.INSTANCE;
        }
    }
}

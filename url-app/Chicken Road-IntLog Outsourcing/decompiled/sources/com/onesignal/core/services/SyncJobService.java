package com.onesignal.core.services;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.onesignal.OneSignal;
import com.onesignal.common.threading.OneSignalDispatchers;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.background.IBackgroundManager;
import com.onesignal.debug.internal.logging.Logging;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class SyncJobService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        i.e(jobParameters, "jobParameters");
        OneSignalDispatchers.INSTANCE.prewarm();
        ThreadUtilsKt.suspendifyOnIO(new SyncJobService$onStartJob$1(this, jobParameters, null));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        i.e(jobParameters, "jobParameters");
        try {
            boolean cancelRunBackgroundServices = ((IBackgroundManager) OneSignal.INSTANCE.getServices().getService(IBackgroundManager.class)).cancelRunBackgroundServices();
            Logging.debug$default("SyncJobService onStopJob called, system conditions not available reschedule: " + cancelRunBackgroundServices, null, 2, null);
            return cancelRunBackgroundServices;
        } catch (Exception unused) {
            Logging.error$default("SyncJobService onStopJob failed, omit and do not reschedule", null, 2, null);
            return false;
        }
    }
}

package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class SyncJobService extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}

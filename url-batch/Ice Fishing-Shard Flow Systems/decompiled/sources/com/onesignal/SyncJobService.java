package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import kotlin.Metadata;

@Metadata
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

package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.onesignal.core.BuildConfig;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import kotlin.Metadata;

/* compiled from: SyncJobService.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/onesignal/SyncJobService;", "Landroid/app/job/JobService;", "()V", "onStartJob", "", OutcomeEventsTable.COLUMN_NAME_PARAMS, "Landroid/app/job/JobParameters;", "onStopJob", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SyncJobService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters params) {
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters params) {
        jobFinished(params, false);
        return false;
    }
}

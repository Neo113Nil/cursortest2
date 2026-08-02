package com.startapp.sdk.internal;

import android.app.job.JobParameters;
import com.startapp.sdk.jobs.SchedulerService;

/* loaded from: classes.dex */
public final class zf implements ya {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JobParameters f8043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SchedulerService f8044b;

    public zf(SchedulerService schedulerService, JobParameters jobParameters) {
        this.f8044b = schedulerService;
        this.f8043a = jobParameters;
    }

    @Override // com.startapp.sdk.internal.ya
    public final void a() {
        this.f8044b.jobFinished(this.f8043a, false);
    }
}

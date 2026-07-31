package com.startapp.sdk.internal;

import android.app.job.JobParameters;
import com.startapp.sdk.jobs.SchedulerService;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class hf implements fa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JobParameters f265a;
    public final /* synthetic */ SchedulerService b;

    public hf(SchedulerService schedulerService, JobParameters jobParameters) {
        this.b = schedulerService;
        this.f265a = jobParameters;
    }

    @Override // com.startapp.sdk.internal.fa
    public final void a() {
        this.b.jobFinished(this.f265a, false);
    }
}

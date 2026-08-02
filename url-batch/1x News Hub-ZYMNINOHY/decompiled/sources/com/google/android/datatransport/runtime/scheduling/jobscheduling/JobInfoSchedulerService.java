package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import A0.f;
import B0.m;
import F0.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import v0.i;
import v0.n;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2655a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i3 = jobParameters.getExtras().getInt("priority");
        int i4 = jobParameters.getExtras().getInt("attemptNumber");
        n.b(getApplicationContext());
        f a3 = i.a();
        a3.R(string);
        a3.f25d = a.b(i3);
        if (string2 != null) {
            a3.f24c = Base64.decode(string2, 0);
        }
        m mVar = n.a().f10570d;
        i t3 = a3.t();
        A1.a aVar = new A1.a(this, 2, jobParameters);
        mVar.getClass();
        mVar.f152e.execute(new B0.f(mVar, t3, i4, aVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

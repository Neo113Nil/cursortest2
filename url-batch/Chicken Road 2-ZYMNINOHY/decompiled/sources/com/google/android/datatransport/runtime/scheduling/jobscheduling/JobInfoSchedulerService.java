package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B1.j;
import L1.r;
import R1.e;
import R1.g;
import R1.m;
import V1.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5750a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i4 = jobParameters.getExtras().getInt("priority");
        int i5 = jobParameters.getExtras().getInt("attemptNumber");
        r.b(getApplicationContext());
        j a3 = L1.j.a();
        a3.D(string);
        a3.f203d = a.b(i4);
        if (string2 != null) {
            a3.f202c = Base64.decode(string2, 0);
        }
        m mVar = r.a().f1665d;
        mVar.f2366e.execute(new g(mVar, a3.h(), i5, new e(this, 0, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

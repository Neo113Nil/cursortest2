package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import D0.j;
import a1.i;
import a1.p;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import g1.e;
import k1.AbstractC0594a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4351d = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i2 = jobParameters.getExtras().getInt("priority");
        int i5 = jobParameters.getExtras().getInt("attemptNumber");
        p.b(getApplicationContext());
        j a7 = i.a();
        a7.b0(string);
        a7.f332l = AbstractC0594a.b(i2);
        if (string2 != null) {
            a7.f331i = Base64.decode(string2, 0);
        }
        g1.i iVar = p.a().f3082d;
        iVar.f5002e.execute(new e(iVar, a7.A(), i5, new A.j(this, 22, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

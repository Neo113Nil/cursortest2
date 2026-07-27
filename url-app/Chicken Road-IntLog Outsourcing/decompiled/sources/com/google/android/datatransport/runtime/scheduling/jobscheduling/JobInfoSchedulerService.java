package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B3.c;
import B4.i;
import V0.o;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import b1.C0273j;
import b1.RunnableC0269f;
import f1.AbstractC0416a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4950a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i2 = jobParameters.getExtras().getInt("priority");
        int i3 = jobParameters.getExtras().getInt("attemptNumber");
        o.b(getApplicationContext());
        i a6 = V0.i.a();
        a6.R(string);
        a6.f313d = AbstractC0416a.b(i2);
        if (string2 != null) {
            a6.f312c = Base64.decode(string2, 0);
        }
        C0273j c0273j = o.a().f3224d;
        V0.i v4 = a6.v();
        c cVar = new c(this, 9, jobParameters);
        c0273j.getClass();
        c0273j.f4791e.execute(new RunnableC0269f(c0273j, v4, i3, cVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

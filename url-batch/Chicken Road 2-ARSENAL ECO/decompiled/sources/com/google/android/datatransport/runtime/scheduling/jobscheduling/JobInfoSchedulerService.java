package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B0.c;
import D0.j;
import D0.s;
import J0.f;
import J0.k;
import N0.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f3840f = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i7 = jobParameters.getExtras().getInt("priority");
        int i8 = jobParameters.getExtras().getInt("attemptNumber");
        s.b(getApplicationContext());
        c a7 = j.a();
        a7.A(string);
        a7.f73i = a.b(i7);
        if (string2 != null) {
            a7.f72h = Base64.decode(string2, 0);
        }
        k kVar = s.a().f361d;
        kVar.f1273e.execute(new f(kVar, a7.e(), i8, new G4.c(this, 3, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

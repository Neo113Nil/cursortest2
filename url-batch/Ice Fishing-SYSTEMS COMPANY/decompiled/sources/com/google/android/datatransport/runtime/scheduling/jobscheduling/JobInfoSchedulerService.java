package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import D5.b;
import Y2.e;
import Z1.i;
import Z1.o;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import j2.AbstractC4595a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f23708n = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i4 = jobParameters.getExtras().getInt("attemptNumber");
        o.b(getApplicationContext());
        e a9 = i.a();
        a9.K(string);
        a9.f3965w = AbstractC4595a.b(i);
        if (string2 != null) {
            a9.f3964v = Base64.decode(string2, 0);
        }
        f2.i iVar = o.a().f4241d;
        i p6 = a9.p();
        b bVar = new b(17, this, jobParameters);
        iVar.getClass();
        iVar.f37690e.execute(new f2.e(iVar, p6, i4, bVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

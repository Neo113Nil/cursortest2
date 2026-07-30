package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.b33;
import defpackage.f33;
import defpackage.gm;
import defpackage.mh;
import defpackage.pz2;
import defpackage.q1;
import defpackage.z42;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int m = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        pz2.b(getApplicationContext());
        mh a = gm.a();
        a.F(string);
        a.p = z42.b(i);
        if (string2 != null) {
            a.o = Base64.decode(string2, 0);
        }
        f33 f33Var = pz2.a().d;
        f33Var.e.execute(new b33(f33Var, a.i(), i2, new q1(13, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

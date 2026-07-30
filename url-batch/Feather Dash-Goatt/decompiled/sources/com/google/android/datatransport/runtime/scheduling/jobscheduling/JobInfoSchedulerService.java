package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.cc;
import defpackage.ez0;
import defpackage.i8;
import defpackage.ij1;
import defpackage.ne0;
import defpackage.ul1;
import defpackage.x4;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int d = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        ij1.b(getApplicationContext());
        i8 a = cc.a();
        a.r(string);
        a.h = ez0.b(i);
        if (string2 != null) {
            a.g = Base64.decode(string2, 0);
        }
        ne0 ne0Var = ij1.a().d;
        ((Executor) ne0Var.e).execute(new ul1(ne0Var, a.b(), i2, new x4(this, 7, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

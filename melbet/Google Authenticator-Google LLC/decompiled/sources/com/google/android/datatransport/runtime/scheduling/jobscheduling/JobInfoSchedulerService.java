package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.avl;
import defpackage.ces;
import defpackage.ceu;
import defpackage.cgy;
import defpackage.iyh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        ceu.b(getApplicationContext());
        iyh c = ces.c();
        c.k(string);
        c.l(cgy.b(i));
        if (string2 != null) {
            c.b = Base64.decode(string2, 0);
        }
        ceu.a().b.g(c.j(), i2, new avl((Object) this, (Object) jobParameters, 8, (short[]) null));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a1.n;
import a6.f;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import java.util.concurrent.Executor;
import k6.i;
import k6.o;
import q6.d;
import u6.a;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2101d = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i3 = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        o.b(getApplicationContext());
        n a9 = i.a();
        a9.G(string);
        a9.f42r = a.b(i3);
        if (string2 != null) {
            a9.f41i = Base64.decode(string2, 0);
        }
        q6.i iVar = o.a().f5484d;
        ((Executor) iVar.g).execute(new d(iVar, a9.k(), i10, new f(17, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

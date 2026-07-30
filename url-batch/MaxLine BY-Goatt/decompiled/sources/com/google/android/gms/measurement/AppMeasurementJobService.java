package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import defpackage.dg3;
import defpackage.dq2;
import defpackage.ef3;
import defpackage.f92;
import defpackage.ll3;
import defpackage.no3;
import defpackage.oq3;
import defpackage.ot2;
import defpackage.pn3;
import defpackage.vh3;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements no3 {
    public ot2 m;

    @Override // defpackage.no3
    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.no3
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final ot2 d() {
        if (this.m == null) {
            this.m = new ot2(24, this);
        }
        return this.m;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().n).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) d().n).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        ot2 d = d();
        Service service = (Service) d.n;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            ll3.v(string);
            oq3 C = oq3.C(service);
            vh3 a = C.a();
            dq2 dq2Var = C.x.o;
            a.z.c(string, "Local AppMeasurementJobService called. action");
            C.c().F(new pn3(d, C, new f92(d, a, jobParameters, 10)));
        }
        if (Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            ll3.v(string);
            dg3 e = dg3.e(service, null);
            pn3 pn3Var = new pn3(5, d, jobParameters, false);
            e.getClass();
            e.c(new ef3(e, pn3Var, 1));
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @Override // defpackage.no3
    public final void b(Intent intent) {
    }
}

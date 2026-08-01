package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import c7.c0;
import com.google.android.gms.internal.measurement.cf;
import com.google.android.gms.internal.measurement.d7;
import com.google.android.gms.internal.measurement.q6;
import f8.j0;
import java.util.Objects;
import k5.c;
import l.d;
import s7.j4;
import s7.o3;
import s7.v0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements o3 {

    /* renamed from: d, reason: collision with root package name */
    public d f3058d;

    @Override // s7.o3
    public final boolean a(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // s7.o3
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final d d() {
        if (this.f3058d == null) {
            this.f3058d = new d(24, this);
        }
        return this.f3058d;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().f5643e).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) d().f5643e).getClass().getSimpleName().concat(" is shutting down."));
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
        d d10 = d();
        Service service = (Service) d10.f5643e;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            c0.g(string);
            j4 C = j4.C(service);
            v0 b10 = C.b();
            c cVar = C.f8771z.f8934i;
            b10.B.b(string, "Local AppMeasurementJobService called. action");
            C.d().B(new j0(d10, C, new cf(d10, b10, jobParameters, 12)));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        c0.g(string);
        d7 c10 = d7.c(service, null);
        j0 j0Var = new j0(28, d10, jobParameters);
        c10.getClass();
        c10.a(new q6(c10, j0Var, 2));
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

    @Override // s7.o3
    public final void b(Intent intent) {
    }
}

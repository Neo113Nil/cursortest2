package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import defpackage.j63;
import defpackage.mk3;
import defpackage.no3;
import defpackage.oq3;
import defpackage.ot2;
import defpackage.pj3;
import defpackage.pn3;
import defpackage.vh3;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements no3 {
    public ot2 m;

    @Override // defpackage.no3
    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    @Override // defpackage.no3
    public final void b(Intent intent) {
        SparseArray sparseArray = j63.a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = j63.a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.no3
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final ot2 d() {
        if (this.m == null) {
            this.m = new ot2(24, this);
        }
        return this.m;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        ot2 d = d();
        d.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new mk3(oq3.C((Service) d.n));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
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

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final ot2 d = d();
        if (intent == null) {
            d.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) d.n;
        final vh3 vh3Var = pj3.s(service, null, null).r;
        pj3.m(vh3Var);
        String action = intent.getAction();
        vh3Var.z.d(Integer.valueOf(i2), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: qo3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Service service2 = (Service) ot2.this.n;
                no3 no3Var = (no3) service2;
                int i3 = i2;
                if (no3Var.a(i3)) {
                    vh3Var.z.c(Integer.valueOf(i3), "Local AppMeasurementService processed last upload request. StartId");
                    vh3 vh3Var2 = pj3.s(service2, null, null).r;
                    pj3.m(vh3Var2);
                    vh3Var2.z.b("Completed wakeful intent.");
                    no3Var.b(intent);
                }
            }
        };
        oq3 C = oq3.C(service);
        C.c().F(new pn3(d, C, runnable));
        return 2;
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
}

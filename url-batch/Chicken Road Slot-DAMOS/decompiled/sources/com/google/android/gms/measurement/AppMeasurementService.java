package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import f8.j0;
import h4.a;
import l.d;
import s7.j4;
import s7.o3;
import s7.q1;
import s7.t2;
import s7.v0;
import s7.w1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements o3 {

    /* renamed from: d, reason: collision with root package name */
    public d f3060d;

    @Override // s7.o3
    public final boolean a(int i3) {
        return stopSelfResult(i3);
    }

    @Override // s7.o3
    public final void b(Intent intent) {
        SparseArray sparseArray = a.f4464a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = a.f4464a;
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

    @Override // s7.o3
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final d d() {
        if (this.f3060d == null) {
            this.f3060d = new d(24, this);
        }
        return this.f3060d;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        d d10 = d();
        d10.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new w1(j4.C((Service) d10.f5643e));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
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

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i3, int i10) {
        d d10 = d();
        if (intent == null) {
            d10.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) d10.f5643e;
        v0 v0Var = q1.r(service, null, null, null).f8937t;
        q1.l(v0Var);
        String action = intent.getAction();
        v0Var.B.c(Integer.valueOf(i10), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        t2 t2Var = new t2(d10, i10, v0Var, intent);
        j4 C = j4.C(service);
        C.d().B(new j0(d10, C, t2Var));
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

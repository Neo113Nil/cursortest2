package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import h4.a;
import l.d;
import s7.q1;
import s7.v0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends a {

    /* renamed from: c, reason: collision with root package name */
    public d f3059c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f3059c == null) {
            this.f3059c = new d(21, this);
        }
        d dVar = this.f3059c;
        dVar.getClass();
        v0 v0Var = q1.r(context, null, null, null).f8937t;
        q1.l(v0Var);
        if (intent == null) {
            v0Var.f9053w.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        v0Var.B.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                v0Var.f9053w.a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        v0Var.B.a("Starting wakeful intent.");
        ((AppMeasurementReceiver) dVar.f5643e).getClass();
        SparseArray sparseArray = a.f4464a;
        synchronized (sparseArray) {
            try {
                int i3 = a.f4465b;
                int i10 = i3 + 1;
                a.f4465b = i10;
                if (i10 <= 0) {
                    a.f4465b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i3);
                ComponentName startService = context.startService(className);
                if (startService == null) {
                    return;
                }
                PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(60000L);
                sparseArray.put(i3, newWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

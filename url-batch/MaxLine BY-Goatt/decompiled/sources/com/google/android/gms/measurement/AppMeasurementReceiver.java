package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import defpackage.j63;
import defpackage.ot2;
import defpackage.pj3;
import defpackage.vh3;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends j63 {
    public ot2 c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new ot2(17, this);
        }
        ot2 ot2Var = this.c;
        ot2Var.getClass();
        vh3 vh3Var = pj3.s(context, null, null).r;
        pj3.m(vh3Var);
        if (intent == null) {
            vh3Var.u.b("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        vh3Var.z.c(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                vh3Var.u.b("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        vh3Var.z.b("Starting wakeful intent.");
        ((AppMeasurementReceiver) ot2Var.n).getClass();
        SparseArray sparseArray = j63.a;
        synchronized (sparseArray) {
            try {
                int i = j63.b;
                int i2 = i + 1;
                j63.b = i2;
                if (i2 <= 0) {
                    j63.b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName startService = context.startService(className);
                if (startService == null) {
                    return;
                }
                PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(60000L);
                sparseArray.put(i, newWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

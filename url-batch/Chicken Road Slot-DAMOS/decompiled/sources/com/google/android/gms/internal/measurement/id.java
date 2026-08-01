package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class id extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static volatile v5 f2407a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            StringBuilder sb2 = new StringBuilder(stringExtra.length() + 68);
            sb2.append("Got an invalid config package for P/H that includes '..': ");
            sb2.append(stringExtra);
            sb2.append(". Exiting.");
            Log.w("PhUpdateBroadcastRecv", sb2.toString());
            return;
        }
        v5 v5Var = f2407a;
        if (v5Var == null) {
            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
            return;
        }
        oc ocVar = (oc) ((ConcurrentHashMap) ((v5) v5Var.f2870e).f2870e).get(stringExtra);
        if (ocVar != null) {
            ocVar.f2647a.b();
        }
    }
}

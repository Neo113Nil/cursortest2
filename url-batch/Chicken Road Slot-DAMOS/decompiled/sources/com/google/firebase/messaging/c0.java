package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public d0 f3116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f3117b;

    public c0(d0 d0Var, d0 d0Var2) {
        this.f3117b = d0Var;
        this.f3116a = d0Var2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f3117b.f3123d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            d0 d0Var = this.f3116a;
            if (d0Var == null) {
                return;
            }
            if (d0Var.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                d0 d0Var2 = this.f3116a;
                d0Var2.f3126r.f3113e.schedule(d0Var2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f3116a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

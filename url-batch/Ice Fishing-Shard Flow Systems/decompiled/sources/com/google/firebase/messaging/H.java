package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class H extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public I f4457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f4458b;

    public H(I i2, I i5) {
        this.f4458b = i2;
        this.f4457a = i5;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f4458b.f4462d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            I i2 = this.f4457a;
            if (i2 == null) {
                return;
            }
            if (i2.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                I i5 = this.f4457a;
                i5.f4465l.f4454e.schedule(i5, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f4457a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

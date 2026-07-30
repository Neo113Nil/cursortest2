package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;

/* loaded from: classes.dex */
public final class B extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4415a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Context f4416b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4417c;

    public /* synthetic */ B() {
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        C c7 = (C) this.f4417c;
        if (c7 != null) {
            Context context = c7.f4420i.f4439b;
            this.f4416b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    public synchronized void b() {
        try {
            Context context = this.f4416b;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f4416b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f4415a) {
            case 0:
                C c7 = (C) this.f4417c;
                if (c7 != null && c7.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    C c8 = (C) this.f4417c;
                    c8.f4420i.getClass();
                    FirebaseMessaging.b(c8, 0L);
                    Context context2 = this.f4416b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f4417c = null;
                    break;
                }
                break;
            default:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    ((l4.b) this.f4417c).l();
                    b();
                    break;
                }
                break;
        }
    }

    public B(l4.b bVar) {
        this.f4417c = bVar;
    }
}

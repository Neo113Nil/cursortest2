package io.appmetrica.analytics.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class e implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f9859a;

    /* renamed from: b, reason: collision with root package name */
    public IBinder f9860b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9861c = new Object();

    public e(Intent intent, String str) {
        this.f9859a = intent;
    }

    public final void a(Context context) {
        synchronized (this.f9861c) {
            this.f9860b = null;
            this.f9861c.notifyAll();
        }
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        synchronized (this.f9861c) {
            this.f9860b = null;
            this.f9861c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        synchronized (this.f9861c) {
            this.f9861c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f9861c) {
            this.f9860b = iBinder;
            this.f9861c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f9861c) {
            this.f9860b = null;
            this.f9861c.notifyAll();
        }
    }
}

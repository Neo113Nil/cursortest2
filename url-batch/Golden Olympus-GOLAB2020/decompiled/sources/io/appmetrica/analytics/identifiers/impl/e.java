package io.appmetrica.analytics.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes3.dex */
public final class e implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f37127a;

    /* renamed from: b, reason: collision with root package name */
    public IBinder f37128b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f37129c = new Object();

    public e(Intent intent, String str) {
        this.f37127a = intent;
        String.format("[AdvServiceConnection-%s]", str);
    }

    public final void a(Context context) {
        synchronized (this.f37129c) {
            this.f37128b = null;
            this.f37129c.notifyAll();
        }
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        synchronized (this.f37129c) {
            this.f37128b = null;
            this.f37129c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        synchronized (this.f37129c) {
            this.f37129c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f37129c) {
            this.f37128b = iBinder;
            this.f37129c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f37129c) {
            this.f37128b = null;
            this.f37129c.notifyAll();
        }
    }
}

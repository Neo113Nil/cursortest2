package io.appmetrica.analytics.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class e implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f5599a;

    /* renamed from: b, reason: collision with root package name */
    public IBinder f5600b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5601c = new Object();

    public e(Intent intent, String str) {
        this.f5599a = intent;
    }

    public final void a(Context context) {
        synchronized (this.f5601c) {
            this.f5600b = null;
            this.f5601c.notifyAll();
        }
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        synchronized (this.f5601c) {
            this.f5600b = null;
            this.f5601c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        synchronized (this.f5601c) {
            this.f5601c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f5601c) {
            this.f5600b = iBinder;
            this.f5601c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f5601c) {
            this.f5600b = null;
            this.f5601c.notifyAll();
        }
    }
}

package com.startapp.sdk.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class l0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f7201a = new LinkedBlockingQueue(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f7202b = false;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f7201a.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}

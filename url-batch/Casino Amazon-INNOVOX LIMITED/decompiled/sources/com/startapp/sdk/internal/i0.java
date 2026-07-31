package com.startapp.sdk.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class i0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f268a = new LinkedBlockingQueue(1);
    public boolean b = false;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f268a.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}

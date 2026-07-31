package com.startapp.sdk.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.CountDownLatch;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class td implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final String f441a;
    public final CountDownLatch b;

    public td(String str, CountDownLatch countDownLatch) {
        this.f441a = str;
        this.b = countDownLatch;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IInterface g8Var;
        try {
            int i = h8.f260a;
            if (iBinder == null) {
                g8Var = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                g8Var = (queryLocalInterface == null || !(queryLocalInterface instanceof i8)) ? new g8(iBinder) : (i8) queryLocalInterface;
            }
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f441a);
            ud.f454a = new zd(((g8) g8Var).a(bundle));
        } catch (Throwable unused) {
        }
        this.b.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.countDown();
    }
}

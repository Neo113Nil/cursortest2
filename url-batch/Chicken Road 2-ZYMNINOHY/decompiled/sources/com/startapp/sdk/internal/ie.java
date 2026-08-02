package com.startapp.sdk.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class ie implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final String f7097a;

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f7098b;

    public ie(String str, CountDownLatch countDownLatch) {
        this.f7097a = str;
        this.f7098b = countDownLatch;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IInterface v8Var;
        try {
            int i4 = w8.f7816a;
            if (iBinder == null) {
                v8Var = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                v8Var = (queryLocalInterface == null || !(queryLocalInterface instanceof x8)) ? new v8(iBinder) : (x8) queryLocalInterface;
            }
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f7097a);
            je.f7156a = new qe(((v8) v8Var).a(bundle));
        } catch (Throwable unused) {
        }
        this.f7098b.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f7098b.countDown();
    }
}

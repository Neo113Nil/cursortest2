package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC2767l0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2793m0 f39365a;

    public ServiceConnectionC2767l0(C2793m0 c2793m0) {
        this.f39365a = c2793m0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f39365a) {
            this.f39365a.f39425d = IAppMetricaService.Stub.asInterface(iBinder);
            this.f39365a.f39426e.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f39365a) {
            this.f39365a.f39425d = null;
        }
    }
}

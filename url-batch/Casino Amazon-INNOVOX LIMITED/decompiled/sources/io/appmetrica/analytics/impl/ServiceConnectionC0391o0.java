package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC0391o0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0416p0 f1405a;

    public ServiceConnectionC0391o0(C0416p0 c0416p0) {
        this.f1405a = c0416p0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f1405a) {
            this.f1405a.d = IAppMetricaService.Stub.asInterface(iBinder);
            this.f1405a.e.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f1405a) {
            this.f1405a.d = null;
        }
    }
}

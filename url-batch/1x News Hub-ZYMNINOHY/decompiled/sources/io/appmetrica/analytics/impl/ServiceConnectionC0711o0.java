package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0711o0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0737p0 f7983a;

    public ServiceConnectionC0711o0(C0737p0 c0737p0) {
        this.f7983a = c0737p0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f7983a) {
            this.f7983a.f8044d = IAppMetricaService.Stub.asInterface(iBinder);
            this.f7983a.f8045e.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f7983a) {
            this.f7983a.f8044d = null;
        }
    }
}

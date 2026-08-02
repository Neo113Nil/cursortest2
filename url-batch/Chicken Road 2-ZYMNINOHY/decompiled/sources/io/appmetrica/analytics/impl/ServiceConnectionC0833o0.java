package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0833o0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0859p0 f12480a;

    public ServiceConnectionC0833o0(C0859p0 c0859p0) {
        this.f12480a = c0859p0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f12480a) {
            this.f12480a.f12543d = IAppMetricaService.Stub.asInterface(iBinder);
            this.f12480a.f12544e.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f12480a) {
            this.f12480a.f12543d = null;
        }
    }
}

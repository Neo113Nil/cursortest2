package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class M4 implements ServiceConnection {

    /* renamed from: n, reason: collision with root package name */
    public final C3562m7 f26303n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3877s f26304u;

    public /* synthetic */ M4(C3877s c3877s, C3562m7 c3562m7) {
        Objects.requireNonNull(c3877s);
        this.f26304u = c3877s;
        this.f26303n = c3562m7;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC3401j8 c3295h8;
        AbstractC3035cL.m("Install Referrer service connected.");
        int i = AbstractBinderC3349i8.f31320n;
        if (iBinder == null) {
            c3295h8 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            c3295h8 = queryLocalInterface instanceof InterfaceC3401j8 ? (InterfaceC3401j8) queryLocalInterface : new C3295h8(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 2);
        }
        C3877s c3877s = this.f26304u;
        c3877s.f34152w = c3295h8;
        c3877s.f34149n = 2;
        this.f26303n.m(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC3035cL.v("Install Referrer service disconnected.");
        C3877s c3877s = this.f26304u;
        c3877s.f34152w = null;
        c3877s.f34149n = 0;
    }
}

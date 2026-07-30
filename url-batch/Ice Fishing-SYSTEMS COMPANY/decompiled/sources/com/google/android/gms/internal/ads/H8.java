package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import m2.AbstractC4778b;
import q2.InterfaceC4921w0;

/* loaded from: classes2.dex */
public final class H8 extends AbstractC4778b {

    /* renamed from: a, reason: collision with root package name */
    public final K8 f25314a;

    /* renamed from: b, reason: collision with root package name */
    public final I8 f25315b = new I8("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");

    public H8(K8 k82, String str) {
        new AtomicLong();
        this.f25314a = k82;
        new AtomicReference(str);
    }

    @Override // m2.AbstractC4778b
    public final k2.s a() {
        InterfaceC4921w0 interfaceC4921w0;
        try {
            interfaceC4921w0 = this.f25314a.e();
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
            interfaceC4921w0 = null;
        }
        return new k2.s(interfaceC4921w0);
    }

    @Override // m2.AbstractC4778b
    public final void c(Activity activity) {
        try {
            this.f25314a.P1(new V2.b(activity), this.f25315b);
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }
}

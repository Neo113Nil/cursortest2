package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import q2.AbstractBinderC4925y0;

/* renamed from: com.google.android.gms.internal.ads.rm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3863rm extends AbstractBinderC4925y0 {

    /* renamed from: n, reason: collision with root package name */
    public final Object f34105n = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final q2.A0 f34106u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC3962td f34107v;

    public BinderC3863rm(q2.A0 a02, InterfaceC3962td interfaceC3962td) {
        this.f34106u = a02;
        this.f34107v = interfaceC3962td;
    }

    @Override // q2.A0
    public final void c() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final void d2(q2.C0 c02) {
        synchronized (this.f34105n) {
            try {
                q2.A0 a02 = this.f34106u;
                if (a02 != null) {
                    a02.d2(c02);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // q2.A0
    public final void f() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final boolean g() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final float h() {
        InterfaceC3962td interfaceC3962td = this.f34107v;
        if (interfaceC3962td != null) {
            return interfaceC3962td.L();
        }
        return 0.0f;
    }

    @Override // q2.A0
    public final float j() {
        InterfaceC3962td interfaceC3962td = this.f34107v;
        if (interfaceC3962td != null) {
            return interfaceC3962td.H();
        }
        return 0.0f;
    }

    @Override // q2.A0
    public final int l() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final float m() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final void o0(boolean z8) {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final boolean p() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final q2.C0 q() {
        synchronized (this.f34105n) {
            try {
                q2.A0 a02 = this.f34106u;
                if (a02 == null) {
                    return null;
                }
                return a02.q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // q2.A0
    public final boolean r() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final void y() {
        throw new RemoteException();
    }
}

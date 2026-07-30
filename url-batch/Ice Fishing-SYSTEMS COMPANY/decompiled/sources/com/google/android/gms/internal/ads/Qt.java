package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;
import q2.C4908p0;

/* loaded from: classes2.dex */
public final class Qt implements F2.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27262n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Z2.a f27263u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractBinderC3186f8 f27264v;

    public Qt(Rt rt, C4908p0 c4908p0) {
        this.f27263u = c4908p0;
        Objects.requireNonNull(rt);
        this.f27264v = rt;
    }

    @Override // F2.a
    public final void d() {
        Z2.a aVar = this.f27263u;
        AbstractBinderC3186f8 abstractBinderC3186f8 = this.f27264v;
        switch (this.f27262n) {
            case 0:
                if (((Rt) abstractBinderC3186f8).f27435C != null) {
                    try {
                        C4908p0 c4908p0 = (C4908p0) aVar;
                        c4908p0.G0(c4908p0.A0(), 1);
                        break;
                    } catch (RemoteException e6) {
                        int i = t2.C.f40822b;
                        u2.i.i("#007 Could not call remote method.", e6);
                        return;
                    }
                }
                break;
            default:
                if (((St) abstractBinderC3186f8).f27635w != null) {
                    try {
                        q2.M m8 = (q2.M) aVar;
                        m8.G0(m8.A0(), 1);
                        break;
                    } catch (RemoteException e9) {
                        int i4 = t2.C.f40822b;
                        u2.i.i("#007 Could not call remote method.", e9);
                    }
                }
                break;
        }
    }

    public Qt(St st, q2.M m8) {
        this.f27263u = m8;
        this.f27264v = st;
    }
}

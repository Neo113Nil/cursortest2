package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import q2.C4927z0;

/* loaded from: classes2.dex */
public final /* synthetic */ class Jr implements InterfaceC4131wk {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Fr f25829n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2532Ec f25830u;

    public /* synthetic */ Jr(Fr fr, C2532Ec c2532Ec) {
        this.f25829n = fr;
        this.f25830u = c2532Ec;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4131wk
    public final void v(C4927z0 c4927z0) {
        this.f25829n.v(c4927z0);
        C2532Ec c2532Ec = this.f25830u;
        if (c2532Ec != null) {
            try {
                Parcel A02 = c2532Ec.A0();
                AbstractC3241g8.c(A02, c4927z0);
                c2532Ec.G0(A02, 3);
            } catch (RemoteException e6) {
                u2.i.i("#007 Could not call remote method.", e6);
            }
        }
        if (c2532Ec != null) {
            try {
                int i = c4927z0.f40122n;
                Parcel A03 = c2532Ec.A0();
                A03.writeInt(i);
                c2532Ec.G0(A03, 2);
            } catch (RemoteException e9) {
                u2.i.i("#007 Could not call remote method.", e9);
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import q2.InterfaceC4911r0;
import q2.InterfaceC4921w0;

/* loaded from: classes2.dex */
public final class J8 extends Z2.a implements K8 {
    @Override // com.google.android.gms.internal.ads.K8
    public final void E0(InterfaceC4911r0 interfaceC4911r0) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, interfaceC4911r0);
        G0(A02, 7);
    }

    @Override // com.google.android.gms.internal.ads.K8
    public final void P1(V2.a aVar, O8 o82) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.e(A02, o82);
        G0(A02, 4);
    }

    @Override // com.google.android.gms.internal.ads.K8
    public final InterfaceC4921w0 e() {
        Parcel D02 = D0(A0(), 5);
        InterfaceC4921w0 G32 = BinderC3754pk.G3(D02.readStrongBinder());
        D02.recycle();
        return G32;
    }
}

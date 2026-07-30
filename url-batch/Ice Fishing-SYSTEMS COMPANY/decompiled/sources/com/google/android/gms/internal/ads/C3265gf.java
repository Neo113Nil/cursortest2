package com.google.android.gms.internal.ads;

import android.os.Parcel;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.gf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3265gf extends Z2.a implements Cif {
    @Override // com.google.android.gms.internal.ads.Cif
    public final void A(int i) {
        Parcel A02 = A0();
        A02.writeInt(i);
        G0(A02, 4);
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void C0(C4927z0 c4927z0) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, c4927z0);
        G0(A02, 5);
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void O2(InterfaceC3047cf interfaceC3047cf) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, interfaceC3047cf);
        G0(A02, 3);
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void c() {
        G0(A0(), 1);
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void f() {
        G0(A0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void h() {
        G0(A0(), 6);
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public final void j() {
        G0(A0(), 7);
    }
}

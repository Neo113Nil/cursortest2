package com.google.android.gms.internal.ads;

import android.os.Parcel;
import q2.C4927z0;

/* loaded from: classes2.dex */
public final class L8 extends Z2.a implements M8 {
    @Override // com.google.android.gms.internal.ads.M8
    public final void D(int i) {
        Parcel A02 = A0();
        A02.writeInt(i);
        G0(A02, 2);
    }

    @Override // com.google.android.gms.internal.ads.M8
    public final void h0(C4927z0 c4927z0) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, c4927z0);
        G0(A02, 3);
    }

    @Override // com.google.android.gms.internal.ads.M8
    public final void t3(K8 k82) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, k82);
        G0(A02, 1);
    }
}

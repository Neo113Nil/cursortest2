package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.kf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3479kf extends Z2.a implements InterfaceC3587mf {
    public C3479kf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3587mf
    public final void a(C4927z0 c4927z0) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, c4927z0);
        G0(A02, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3587mf
    public final void c() {
        G0(A0(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3587mf
    public final void s(int i) {
        Parcel A02 = A0();
        A02.writeInt(i);
        G0(A02, 2);
    }
}

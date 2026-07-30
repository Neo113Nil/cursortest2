package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.yb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4230yb extends Z2.a implements InterfaceC4284zb {
    public C4230yb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4284zb
    public final boolean F(V2.a aVar) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        Parcel D02 = D0(A02, 10);
        boolean z8 = D02.readInt() != 0;
        D02.recycle();
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4284zb
    public final String g() {
        Parcel D02 = D0(A0(), 4);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4284zb
    public final V2.a o2() {
        return CL.f(D0(A0(), 9));
    }
}

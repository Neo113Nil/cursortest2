package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.pb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3745pb extends Z2.a implements InterfaceC3852rb {
    public C3745pb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3852rb
    public final void L1(V2.a aVar, String str) {
        Parcel A02 = A0();
        A02.writeString(str);
        AbstractC3241g8.e(A02, aVar);
        G0(A02, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3852rb
    public final V2.a N(String str) {
        Parcel A02 = A0();
        A02.writeString(str);
        return CL.f(D0(A02, 2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3852rb
    public final void Q1(V2.a aVar) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        G0(A02, 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3852rb
    public final void b2(InterfaceC3529lb interfaceC3529lb) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, interfaceC3529lb);
        G0(A02, 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3852rb
    public final void c() {
        G0(A0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3852rb
    public final void k0(V2.a aVar, int i) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        A02.writeInt(i);
        G0(A02, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3852rb
    public final void l2(V2.a aVar) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        G0(A02, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3852rb
    public final void n1(V2.a aVar) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        G0(A02, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3852rb
    public final void w2(V2.a aVar) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        G0(A02, 3);
    }
}

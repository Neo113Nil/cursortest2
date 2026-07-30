package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ex, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3174ex extends Z2.a implements InterfaceC3229fx {
    @Override // com.google.android.gms.internal.ads.InterfaceC3229fx
    public final void A(int i) {
        Parcel A02 = A0();
        A02.writeInt(i);
        G0(A02, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3229fx
    public final void c() {
        G0(A0(), 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3229fx
    public final void c2(byte[] bArr) {
        Parcel A02 = A0();
        A02.writeByteArray(bArr);
        G0(A02, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3229fx
    public final void e0(int i) {
        Parcel A02 = A0();
        A02.writeInt(i);
        G0(A02, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3229fx
    public final void k3() {
        Parcel A02 = A0();
        A02.writeIntArray(null);
        G0(A02, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3229fx
    public final void v3(V2.b bVar, String str) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, bVar);
        A02.writeString(str);
        A02.writeString(null);
        G0(A02, 8);
    }
}

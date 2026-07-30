package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Fe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2551Fe extends Z2.a implements InterfaceC2568Ge {
    @Override // com.google.android.gms.internal.ads.InterfaceC2568Ge
    public final void E1(C2687Ne c2687Ne, InterfaceC2636Ke interfaceC2636Ke) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, c2687Ne);
        AbstractC3241g8.e(A02, interfaceC2636Ke);
        G0(A02, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2568Ge
    public final void L0(C2687Ne c2687Ne, InterfaceC2636Ke interfaceC2636Ke) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, c2687Ne);
        AbstractC3241g8.e(A02, interfaceC2636Ke);
        G0(A02, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2568Ge
    public final void Q2(String str, InterfaceC2636Ke interfaceC2636Ke) {
        Parcel A02 = A0();
        A02.writeString(str);
        AbstractC3241g8.e(A02, interfaceC2636Ke);
        G0(A02, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2568Ge
    public final void a2(C2687Ne c2687Ne, InterfaceC2636Ke interfaceC2636Ke) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, c2687Ne);
        AbstractC3241g8.e(A02, interfaceC2636Ke);
        G0(A02, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2568Ge
    public final void p0(String str) {
        Parcel A02 = A0();
        A02.writeString(str);
        G0(A02, 9);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import r2.C4957a;

/* renamed from: com.google.android.gms.internal.ads.ce, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3046ce extends Z2.a implements InterfaceC3101de {
    public C3046ce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3101de
    public final void Q(V2.a aVar) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        G0(A02, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3101de
    public final void Z2(String[] strArr, int[] iArr, V2.a aVar) {
        Parcel A02 = A0();
        A02.writeStringArray(strArr);
        A02.writeIntArray(iArr);
        AbstractC3241g8.e(A02, aVar);
        G0(A02, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3101de
    public final void e() {
        G0(A0(), 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3101de
    public final void h3(V2.a aVar, C4957a c4957a) {
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.c(A02, c4957a);
        G0(A02, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3101de
    public final void q0(Intent intent) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, intent);
        G0(A02, 1);
    }
}

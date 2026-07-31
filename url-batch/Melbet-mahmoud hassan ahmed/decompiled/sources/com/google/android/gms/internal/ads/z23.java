package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class z23 extends zd implements b33 {
    z23(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.b33
    public final void A(int i7) {
        Parcel E = E();
        E.writeInt(i7);
        O0(7, E);
    }

    @Override // com.google.android.gms.internal.ads.b33
    public final void E0(byte[] bArr) {
        Parcel E = E();
        E.writeByteArray(bArr);
        O0(5, E);
    }

    @Override // com.google.android.gms.internal.ads.b33
    public final void H1(x3.a aVar, String str, String str2) {
        Parcel E = E();
        be.f(E, aVar);
        E.writeString(str);
        E.writeString(null);
        O0(8, E);
    }

    @Override // com.google.android.gms.internal.ads.b33
    public final void R(int i7) {
        Parcel E = E();
        E.writeInt(i7);
        O0(6, E);
    }

    @Override // com.google.android.gms.internal.ads.b33
    public final void d() {
        O0(3, E());
    }

    @Override // com.google.android.gms.internal.ads.b33
    public final void t0(int[] iArr) {
        Parcel E = E();
        E.writeIntArray(null);
        O0(4, E);
    }
}

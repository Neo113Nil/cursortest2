package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ce extends zd implements ee {
    ce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.ee
    public final void A(int i7) {
        Parcel E = E();
        E.writeInt(i7);
        O0(7, E);
    }

    @Override // com.google.android.gms.internal.ads.ee
    public final void E0(byte[] bArr) {
        Parcel E = E();
        E.writeByteArray(bArr);
        O0(5, E);
    }

    @Override // com.google.android.gms.internal.ads.ee
    public final void R(int i7) {
        Parcel E = E();
        E.writeInt(0);
        O0(6, E);
    }

    @Override // com.google.android.gms.internal.ads.ee
    public final void S0(x3.a aVar, String str) {
        Parcel E = E();
        be.f(E, aVar);
        E.writeString("GMA_SDK");
        O0(2, E);
    }

    @Override // com.google.android.gms.internal.ads.ee
    public final void d() {
        O0(3, E());
    }

    @Override // com.google.android.gms.internal.ads.ee
    public final void t0(int[] iArr) {
        Parcel E = E();
        E.writeIntArray(null);
        O0(4, E);
    }
}

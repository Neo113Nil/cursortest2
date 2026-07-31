package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public final class c50 extends zd implements e50 {
    c50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final boolean N0(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        Parcel q02 = q0(10, E);
        boolean g7 = be.g(q02);
        q02.recycle();
        return g7;
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final x3.a e() {
        Parcel q02 = q0(9, E());
        x3.a q03 = a.AbstractBinderC0153a.q0(q02.readStrongBinder());
        q02.recycle();
        return q03;
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final String f() {
        Parcel q02 = q0(4, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }
}

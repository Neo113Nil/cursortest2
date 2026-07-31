package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import x3.a;

/* loaded from: classes.dex */
public final class f60 extends zd implements h60 {
    f60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final double b() {
        Parcel q02 = q0(8, E());
        double readDouble = q02.readDouble();
        q02.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final zy e() {
        Parcel q02 = q0(31, E());
        zy s62 = yy.s6(q02.readStrongBinder());
        q02.recycle();
        return s62;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final cz f() {
        Parcel q02 = q0(11, E());
        cz s62 = bz.s6(q02.readStrongBinder());
        q02.recycle();
        return s62;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final g40 h() {
        g40 d40Var;
        Parcel q02 = q0(14, E());
        IBinder readStrongBinder = q02.readStrongBinder();
        if (readStrongBinder == null) {
            d40Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            d40Var = queryLocalInterface instanceof g40 ? (g40) queryLocalInterface : new d40(readStrongBinder);
        }
        q02.recycle();
        return d40Var;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final n40 j() {
        n40 l40Var;
        Parcel q02 = q0(5, E());
        IBinder readStrongBinder = q02.readStrongBinder();
        if (readStrongBinder == null) {
            l40Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            l40Var = queryLocalInterface instanceof n40 ? (n40) queryLocalInterface : new l40(readStrongBinder);
        }
        q02.recycle();
        return l40Var;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final x3.a k() {
        Parcel q02 = q0(19, E());
        x3.a q03 = a.AbstractBinderC0153a.q0(q02.readStrongBinder());
        q02.recycle();
        return q03;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final String l() {
        Parcel q02 = q0(6, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final String m() {
        Parcel q02 = q0(7, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final void m2(wy wyVar) {
        Parcel E = E();
        be.f(E, wyVar);
        O0(32, E);
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final String n() {
        Parcel q02 = q0(4, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final x3.a o() {
        Parcel q02 = q0(18, E());
        x3.a q03 = a.AbstractBinderC0153a.q0(q02.readStrongBinder());
        q02.recycle();
        return q03;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final String p() {
        Parcel q02 = q0(10, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final String q() {
        Parcel q02 = q0(9, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final String r() {
        Parcel q02 = q0(2, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final List x() {
        Parcel q02 = q0(23, E());
        ArrayList b7 = be.b(q02);
        q02.recycle();
        return b7;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final List y() {
        Parcel q02 = q0(3, E());
        ArrayList b7 = be.b(q02);
        q02.recycle();
        return b7;
    }
}

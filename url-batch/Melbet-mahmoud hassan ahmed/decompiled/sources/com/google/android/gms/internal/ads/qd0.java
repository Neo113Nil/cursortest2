package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import x3.a;

/* loaded from: classes.dex */
public final class qd0 extends zd implements sd0 {
    qd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final boolean G() {
        Parcel q02 = q0(18, E());
        boolean g7 = be.g(q02);
        q02.recycle();
        return g7;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final boolean H() {
        Parcel q02 = q0(17, E());
        boolean g7 = be.g(q02);
        q02.recycle();
        return g7;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final void K5(x3.a aVar, x3.a aVar2, x3.a aVar3) {
        Parcel E = E();
        be.f(E, aVar);
        be.f(E, aVar2);
        be.f(E, aVar3);
        O0(21, E);
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final void N() {
        O0(19, E());
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final void P3(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(22, E);
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final double b() {
        Parcel q02 = q0(8, E());
        double readDouble = q02.readDouble();
        q02.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final float d() {
        Parcel q02 = q0(23, E());
        float readFloat = q02.readFloat();
        q02.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final float e() {
        Parcel q02 = q0(25, E());
        float readFloat = q02.readFloat();
        q02.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final float f() {
        Parcel q02 = q0(24, E());
        float readFloat = q02.readFloat();
        q02.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final Bundle h() {
        Parcel q02 = q0(16, E());
        Bundle bundle = (Bundle) be.a(q02, Bundle.CREATOR);
        q02.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final cz i() {
        Parcel q02 = q0(11, E());
        cz s62 = bz.s6(q02.readStrongBinder());
        q02.recycle();
        return s62;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final g40 j() {
        Parcel q02 = q0(12, E());
        g40 s62 = e40.s6(q02.readStrongBinder());
        q02.recycle();
        return s62;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final n40 k() {
        Parcel q02 = q0(5, E());
        n40 s62 = m40.s6(q02.readStrongBinder());
        q02.recycle();
        return s62;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final void k2(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(20, E);
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final String l() {
        Parcel q02 = q0(7, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final x3.a m() {
        Parcel q02 = q0(14, E());
        x3.a q03 = a.AbstractBinderC0153a.q0(q02.readStrongBinder());
        q02.recycle();
        return q03;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final x3.a n() {
        Parcel q02 = q0(15, E());
        x3.a q03 = a.AbstractBinderC0153a.q0(q02.readStrongBinder());
        q02.recycle();
        return q03;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final x3.a o() {
        Parcel q02 = q0(13, E());
        x3.a q03 = a.AbstractBinderC0153a.q0(q02.readStrongBinder());
        q02.recycle();
        return q03;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final String p() {
        Parcel q02 = q0(2, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final String q() {
        Parcel q02 = q0(10, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final String r() {
        Parcel q02 = q0(4, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final String t() {
        Parcel q02 = q0(6, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final List x() {
        Parcel q02 = q0(3, E());
        ArrayList b7 = be.b(q02);
        q02.recycle();
        return b7;
    }

    @Override // com.google.android.gms.internal.ads.sd0
    public final String y() {
        Parcel q02 = q0(9, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }
}

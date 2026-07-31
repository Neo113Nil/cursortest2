package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class cy extends zd implements fy {
    cy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void D3(m90 m90Var) {
        Parcel E = E();
        be.f(E, m90Var);
        O0(12, E);
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void F0(boolean z6) {
        Parcel E = E();
        be.c(E, z6);
        O0(4, E);
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void I5(x3.a aVar, String str) {
        Parcel E = E();
        be.f(E, aVar);
        E.writeString(str);
        O0(5, E);
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void O3(String str, x3.a aVar) {
        Parcel E = E();
        E.writeString(null);
        be.f(E, aVar);
        O0(6, E);
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void U4(float f7) {
        Parcel E = E();
        E.writeFloat(f7);
        O0(2, E);
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void Y3(qy qyVar) {
        Parcel E = E();
        be.f(E, qyVar);
        O0(16, E);
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final String d() {
        Parcel q02 = q0(9, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final List<f90> e() {
        Parcel q02 = q0(13, E());
        ArrayList createTypedArrayList = q02.createTypedArrayList(f90.CREATOR);
        q02.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void h() {
        O0(15, E());
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void i() {
        O0(1, E());
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void j1(n00 n00Var) {
        Parcel E = E();
        be.d(E, n00Var);
        O0(14, E);
    }

    @Override // com.google.android.gms.internal.ads.fy
    public final void l4(dd0 dd0Var) {
        Parcel E = E();
        be.f(E, dd0Var);
        O0(11, E);
    }
}

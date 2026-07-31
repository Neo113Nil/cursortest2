package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public final class lx extends zd implements nx {
    lx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void D2(by byVar) {
        Parcel E = E();
        be.f(E, byVar);
        O0(45, E);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final boolean F4(kv kvVar) {
        Parcel E = E();
        be.d(E, kvVar);
        Parcel q02 = q0(4, E);
        boolean g7 = be.g(q02);
        q02.recycle();
        return g7;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void H() {
        O0(6, E());
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void K3(boolean z6) {
        Parcel E = E();
        be.c(E, z6);
        O0(34, E);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void L4(vv vvVar) {
        Parcel E = E();
        be.d(E, vvVar);
        O0(39, E);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void M3(ux uxVar) {
        Parcel E = E();
        be.f(E, uxVar);
        O0(8, E);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void N() {
        O0(2, E());
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void R3(pv pvVar) {
        Parcel E = E();
        be.d(E, pvVar);
        O0(13, E);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void V() {
        O0(5, E());
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void b1(ww wwVar) {
        Parcel E = E();
        be.f(E, wwVar);
        O0(20, E);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void b6(boolean z6) {
        Parcel E = E();
        be.c(E, z6);
        O0(22, E);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void c5(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(44, E);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void c6(s00 s00Var) {
        Parcel E = E();
        be.d(E, s00Var);
        O0(29, E);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final pv e() {
        Parcel q02 = q0(12, E());
        pv pvVar = (pv) be.a(q02, pv.CREATOR);
        q02.recycle();
        return pvVar;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final zy j() {
        zy xyVar;
        Parcel q02 = q0(41, E());
        IBinder readStrongBinder = q02.readStrongBinder();
        if (readStrongBinder == null) {
            xyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            xyVar = queryLocalInterface instanceof zy ? (zy) queryLocalInterface : new xy(readStrongBinder);
        }
        q02.recycle();
        return xyVar;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final cz k() {
        cz azVar;
        Parcel q02 = q0(26, E());
        IBinder readStrongBinder = q02.readStrongBinder();
        if (readStrongBinder == null) {
            azVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            azVar = queryLocalInterface instanceof cz ? (cz) queryLocalInterface : new az(readStrongBinder);
        }
        q02.recycle();
        return azVar;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final x3.a m() {
        Parcel q02 = q0(1, E());
        x3.a q03 = a.AbstractBinderC0153a.q0(q02.readStrongBinder());
        q02.recycle();
        return q03;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void q5(wp wpVar) {
        Parcel E = E();
        be.f(E, wpVar);
        O0(40, E);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void r2(kv kvVar, dx dxVar) {
        Parcel E = E();
        be.d(E, kvVar);
        be.f(E, dxVar);
        O0(43, E);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void r5(wy wyVar) {
        Parcel E = E();
        be.f(E, wyVar);
        O0(42, E);
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final String t() {
        Parcel q02 = q0(31, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.nx
    public final void v3(zw zwVar) {
        Parcel E = E();
        be.f(E, zwVar);
        O0(7, E);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import x3.a;

/* loaded from: classes.dex */
public final class pd0 extends zd {
    pd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final cz C3() {
        Parcel q02 = q0(16, E());
        cz s62 = bz.s6(q02.readStrongBinder());
        q02.recycle();
        return s62;
    }

    public final n40 C5() {
        Parcel q02 = q0(5, E());
        n40 s62 = m40.s6(q02.readStrongBinder());
        q02.recycle();
        return s62;
    }

    public final Bundle b() {
        Parcel q02 = q0(13, E());
        Bundle bundle = (Bundle) be.a(q02, Bundle.CREATOR);
        q02.recycle();
        return bundle;
    }

    public final x3.a h() {
        Parcel q02 = q0(15, E());
        x3.a q03 = a.AbstractBinderC0153a.q0(q02.readStrongBinder());
        q02.recycle();
        return q03;
    }

    public final String k() {
        Parcel q02 = q0(7, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    public final x3.a k6() {
        Parcel q02 = q0(20, E());
        x3.a q03 = a.AbstractBinderC0153a.q0(q02.readStrongBinder());
        q02.recycle();
        return q03;
    }

    public final String m() {
        Parcel q02 = q0(6, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    public final String n() {
        Parcel q02 = q0(2, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    public final String o() {
        Parcel q02 = q0(4, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    public final g40 o4() {
        Parcel q02 = q0(19, E());
        g40 s62 = e40.s6(q02.readStrongBinder());
        q02.recycle();
        return s62;
    }

    public final x3.a r6() {
        Parcel q02 = q0(21, E());
        x3.a q03 = a.AbstractBinderC0153a.q0(q02.readStrongBinder());
        q02.recycle();
        return q03;
    }

    public final List s6() {
        Parcel q02 = q0(3, E());
        ArrayList b7 = be.b(q02);
        q02.recycle();
        return b7;
    }

    public final void t() {
        O0(8, E());
    }

    public final void t6(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(9, E);
    }

    public final void u6(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(10, E);
    }

    public final void v6(x3.a aVar, x3.a aVar2, x3.a aVar3) {
        Parcel E = E();
        be.f(E, aVar);
        be.f(E, aVar2);
        be.f(E, aVar3);
        O0(22, E);
    }

    public final void w6(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(14, E);
    }

    public final boolean x6() {
        Parcel q02 = q0(12, E());
        boolean g7 = be.g(q02);
        q02.recycle();
        return g7;
    }

    public final boolean y6() {
        Parcel q02 = q0(11, E());
        boolean g7 = be.g(q02);
        q02.recycle();
        return g7;
    }
}

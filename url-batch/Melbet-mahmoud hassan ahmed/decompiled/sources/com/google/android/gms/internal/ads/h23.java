package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class h23 extends zd {
    h23(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final f23 C3(d23 d23Var) {
        Parcel E = E();
        be.d(E, d23Var);
        Parcel q02 = q0(1, E);
        f23 f23Var = (f23) be.a(q02, f23.CREATOR);
        q02.recycle();
        return f23Var;
    }

    public final void C5(a23 a23Var) {
        Parcel E = E();
        be.d(E, a23Var);
        O0(2, E);
    }

    public final p23 o4(m23 m23Var) {
        Parcel E = E();
        be.d(E, m23Var);
        Parcel q02 = q0(3, E);
        p23 p23Var = (p23) be.a(q02, p23.CREATOR);
        q02.recycle();
        return p23Var;
    }
}

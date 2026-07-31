package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class li0 extends zd implements ni0 {
    li0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.ni0
    public final void Q0(vi0 vi0Var, ri0 ri0Var) {
        Parcel E = E();
        be.d(E, vi0Var);
        be.f(E, ri0Var);
        O0(5, E);
    }

    @Override // com.google.android.gms.internal.ads.ni0
    public final void Z0(String str, ri0 ri0Var) {
        Parcel E = E();
        E.writeString(str);
        be.f(E, ri0Var);
        O0(7, E);
    }

    @Override // com.google.android.gms.internal.ads.ni0
    public final void h2(vi0 vi0Var, ri0 ri0Var) {
        Parcel E = E();
        be.d(E, vi0Var);
        be.f(E, ri0Var);
        O0(6, E);
    }

    @Override // com.google.android.gms.internal.ads.ni0
    public final void m5(vi0 vi0Var, ri0 ri0Var) {
        Parcel E = E();
        be.d(E, vi0Var);
        be.f(E, ri0Var);
        O0(4, E);
    }
}

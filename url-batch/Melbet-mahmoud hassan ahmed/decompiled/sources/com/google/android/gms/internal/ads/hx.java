package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class hx extends zd implements jx {
    hx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void D5(zw zwVar) {
        Parcel E = E();
        be.f(E, zwVar);
        O0(2, E);
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void V4(y50 y50Var) {
        Parcel E = E();
        be.f(E, y50Var);
        O0(10, E);
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final gx b() {
        gx exVar;
        Parcel q02 = q0(1, E());
        IBinder readStrongBinder = q02.readStrongBinder();
        if (readStrongBinder == null) {
            exVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            exVar = queryLocalInterface instanceof gx ? (gx) queryLocalInterface : new ex(readStrongBinder);
        }
        q02.recycle();
        return exVar;
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void g4(String str, r50 r50Var, o50 o50Var) {
        Parcel E = E();
        E.writeString(str);
        be.f(E, r50Var);
        be.f(E, o50Var);
        O0(5, E);
    }

    @Override // com.google.android.gms.internal.ads.jx
    public final void u4(b40 b40Var) {
        Parcel E = E();
        be.d(E, b40Var);
        O0(6, E);
    }
}

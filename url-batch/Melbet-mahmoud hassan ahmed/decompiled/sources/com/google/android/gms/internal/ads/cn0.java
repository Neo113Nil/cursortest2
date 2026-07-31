package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class cn0 extends zd implements en0 {
    cn0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.en0
    public final bn0 A0(x3.a aVar, dd0 dd0Var, int i7) {
        bn0 zm0Var;
        Parcel E = E();
        be.f(E, aVar);
        be.f(E, dd0Var);
        E.writeInt(214106000);
        Parcel q02 = q0(2, E);
        IBinder readStrongBinder = q02.readStrongBinder();
        if (readStrongBinder == null) {
            zm0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zm0Var = queryLocalInterface instanceof bn0 ? (bn0) queryLocalInterface : new zm0(readStrongBinder);
        }
        q02.recycle();
        return zm0Var;
    }
}

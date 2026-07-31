package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class bd0 extends zd implements dd0 {
    bd0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.dd0
    public final cf0 j0(String str) {
        Parcel E = E();
        E.writeString(str);
        Parcel q02 = q0(3, E);
        cf0 s62 = bf0.s6(q02.readStrongBinder());
        q02.recycle();
        return s62;
    }

    @Override // com.google.android.gms.internal.ads.dd0
    public final gd0 s(String str) {
        gd0 ed0Var;
        Parcel E = E();
        E.writeString(str);
        Parcel q02 = q0(1, E);
        IBinder readStrongBinder = q02.readStrongBinder();
        if (readStrongBinder == null) {
            ed0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            ed0Var = queryLocalInterface instanceof gd0 ? (gd0) queryLocalInterface : new ed0(readStrongBinder);
        }
        q02.recycle();
        return ed0Var;
    }

    @Override // com.google.android.gms.internal.ads.dd0
    public final boolean u(String str) {
        Parcel E = E();
        E.writeString(str);
        Parcel q02 = q0(4, E);
        boolean g7 = be.g(q02);
        q02.recycle();
        return g7;
    }

    @Override // com.google.android.gms.internal.ads.dd0
    public final boolean z(String str) {
        Parcel E = E();
        E.writeString(str);
        Parcel q02 = q0(2, E);
        boolean g7 = be.g(q02);
        q02.recycle();
        return g7;
    }
}

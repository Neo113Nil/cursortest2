package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class vx extends zd implements xx {
    vx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final nx E5(x3.a aVar, pv pvVar, String str, dd0 dd0Var, int i7) {
        nx lxVar;
        Parcel E = E();
        be.f(E, aVar);
        be.d(E, pvVar);
        E.writeString(str);
        be.f(E, dd0Var);
        E.writeInt(214106000);
        Parcel q02 = q0(13, E);
        IBinder readStrongBinder = q02.readStrongBinder();
        if (readStrongBinder == null) {
            lxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            lxVar = queryLocalInterface instanceof nx ? (nx) queryLocalInterface : new lx(readStrongBinder);
        }
        q02.recycle();
        return lxVar;
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final fy G0(x3.a aVar, int i7) {
        fy cyVar;
        Parcel E = E();
        be.f(E, aVar);
        E.writeInt(214106000);
        Parcel q02 = q0(9, E);
        IBinder readStrongBinder = q02.readStrongBinder();
        if (readStrongBinder == null) {
            cyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            cyVar = queryLocalInterface instanceof fy ? (fy) queryLocalInterface : new cy(readStrongBinder);
        }
        q02.recycle();
        return cyVar;
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final nx G3(x3.a aVar, pv pvVar, String str, dd0 dd0Var, int i7) {
        nx lxVar;
        Parcel E = E();
        be.f(E, aVar);
        be.d(E, pvVar);
        E.writeString(str);
        be.f(E, dd0Var);
        E.writeInt(214106000);
        Parcel q02 = q0(1, E);
        IBinder readStrongBinder = q02.readStrongBinder();
        if (readStrongBinder == null) {
            lxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            lxVar = queryLocalInterface instanceof nx ? (nx) queryLocalInterface : new lx(readStrongBinder);
        }
        q02.recycle();
        return lxVar;
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final jx P1(x3.a aVar, String str, dd0 dd0Var, int i7) {
        jx hxVar;
        Parcel E = E();
        be.f(E, aVar);
        E.writeString(str);
        be.f(E, dd0Var);
        E.writeInt(214106000);
        Parcel q02 = q0(3, E);
        IBinder readStrongBinder = q02.readStrongBinder();
        if (readStrongBinder == null) {
            hxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            hxVar = queryLocalInterface instanceof jx ? (jx) queryLocalInterface : new hx(readStrongBinder);
        }
        q02.recycle();
        return hxVar;
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final ng0 T1(x3.a aVar, dd0 dd0Var, int i7) {
        Parcel E = E();
        be.f(E, aVar);
        be.f(E, dd0Var);
        E.writeInt(214106000);
        Parcel q02 = q0(15, E);
        ng0 s62 = mg0.s6(q02.readStrongBinder());
        q02.recycle();
        return s62;
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final zg0 U(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        Parcel q02 = q0(8, E);
        zg0 s62 = yg0.s6(q02.readStrongBinder());
        q02.recycle();
        return s62;
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final fk0 Y4(x3.a aVar, String str, dd0 dd0Var, int i7) {
        Parcel E = E();
        be.f(E, aVar);
        E.writeString(str);
        be.f(E, dd0Var);
        E.writeInt(214106000);
        Parcel q02 = q0(12, E);
        fk0 s62 = ek0.s6(q02.readStrongBinder());
        q02.recycle();
        return s62;
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final nx c3(x3.a aVar, pv pvVar, String str, int i7) {
        nx lxVar;
        Parcel E = E();
        be.f(E, aVar);
        be.d(E, pvVar);
        E.writeString(str);
        E.writeInt(214106000);
        Parcel q02 = q0(10, E);
        IBinder readStrongBinder = q02.readStrongBinder();
        if (readStrongBinder == null) {
            lxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            lxVar = queryLocalInterface instanceof nx ? (nx) queryLocalInterface : new lx(readStrongBinder);
        }
        q02.recycle();
        return lxVar;
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final nx g2(x3.a aVar, pv pvVar, String str, dd0 dd0Var, int i7) {
        nx lxVar;
        Parcel E = E();
        be.f(E, aVar);
        be.d(E, pvVar);
        E.writeString(str);
        be.f(E, dd0Var);
        E.writeInt(214106000);
        Parcel q02 = q0(2, E);
        IBinder readStrongBinder = q02.readStrongBinder();
        if (readStrongBinder == null) {
            lxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            lxVar = queryLocalInterface instanceof nx ? (nx) queryLocalInterface : new lx(readStrongBinder);
        }
        q02.recycle();
        return lxVar;
    }

    @Override // com.google.android.gms.internal.ads.xx
    public final bn0 x1(x3.a aVar, dd0 dd0Var, int i7) {
        Parcel E = E();
        be.f(E, aVar);
        be.f(E, dd0Var);
        E.writeInt(214106000);
        Parcel q02 = q0(14, E);
        bn0 s62 = an0.s6(q02.readStrongBinder());
        q02.recycle();
        return s62;
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public abstract class wj0 extends ae implements xj0 {
    public wj0() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static xj0 s6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof xj0 ? (xj0) queryLocalInterface : new vj0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                U(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                break;
            case 2:
                S1(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                Y(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                break;
            case 4:
                d0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                break;
            case 5:
                u0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                break;
            case 6:
                p0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                break;
            case c4.w0.f2149o /* 7 */:
                f6(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), (yj0) be.a(parcel, yj0.CREATOR));
                break;
            case c4.w0.f2150p /* 8 */:
                zze(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                break;
            case 9:
                G0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                g0(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                break;
            case 11:
                n4(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                break;
            case 12:
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

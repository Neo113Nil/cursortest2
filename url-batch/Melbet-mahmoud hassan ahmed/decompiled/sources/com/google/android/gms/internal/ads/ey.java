package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import x3.a;

/* loaded from: classes.dex */
public abstract class ey extends ae implements fy {
    public ey() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.ae
    protected final boolean r6(int i7, Parcel parcel, Parcel parcel2, int i8) {
        qy oyVar;
        switch (i7) {
            case 1:
                i();
                break;
            case 2:
                U4(parcel.readFloat());
                break;
            case 3:
                l5(parcel.readString());
                break;
            case 4:
                F0(be.g(parcel));
                break;
            case 5:
                I5(a.AbstractBinderC0153a.q0(parcel.readStrongBinder()), parcel.readString());
                break;
            case 6:
                O3(parcel.readString(), a.AbstractBinderC0153a.q0(parcel.readStrongBinder()));
                break;
            case c4.w0.f2149o /* 7 */:
                float b7 = b();
                parcel2.writeNoException();
                parcel2.writeFloat(b7);
                return true;
            case c4.w0.f2150p /* 8 */:
                boolean q7 = q();
                parcel2.writeNoException();
                be.c(parcel2, q7);
                return true;
            case 9:
                String d7 = d();
                parcel2.writeNoException();
                parcel2.writeString(d7);
                return true;
            case 10:
                Q(parcel.readString());
                break;
            case 11:
                l4(cd0.s6(parcel.readStrongBinder()));
                break;
            case 12:
                D3(l90.s6(parcel.readStrongBinder()));
                break;
            case 13:
                List<f90> e7 = e();
                parcel2.writeNoException();
                parcel2.writeTypedList(e7);
                return true;
            case 14:
                j1((n00) be.a(parcel, n00.CREATOR));
                break;
            case 15:
                h();
                break;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    oyVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    oyVar = queryLocalInterface instanceof qy ? (qy) queryLocalInterface : new oy(readStrongBinder);
                }
                Y3(oyVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

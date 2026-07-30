package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.hf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3319hf extends AbstractBinderC3186f8 implements Cif {
    public AbstractBinderC3319hf() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC3047cf c2993bf;
        switch (i) {
            case 1:
                c();
                break;
            case 2:
                f();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c2993bf = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c2993bf = queryLocalInterface instanceof InterfaceC3047cf ? (InterfaceC3047cf) queryLocalInterface : new C2993bf(readStrongBinder);
                }
                AbstractC3241g8.f(parcel);
                O2(c2993bf);
                break;
            case 4:
                int readInt = parcel.readInt();
                AbstractC3241g8.f(parcel);
                A(readInt);
                break;
            case 5:
                C4927z0 c4927z0 = (C4927z0) AbstractC3241g8.b(parcel, C4927z0.CREATOR);
                AbstractC3241g8.f(parcel);
                C0(c4927z0);
                break;
            case 6:
                h();
                break;
            case 7:
                j();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

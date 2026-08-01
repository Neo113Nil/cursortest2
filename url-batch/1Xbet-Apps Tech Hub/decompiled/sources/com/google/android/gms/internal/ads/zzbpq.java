package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbpq extends zzavh implements zzbpr {
    public zzbpq() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbpr zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof zzbpr ? (zzbpr) queryLocalInterface : new zzbpp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzavh
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            zzavi.zzc(parcel);
            zzbpu zzb = zzb(readString);
            parcel2.writeNoException();
            zzavi.zzf(parcel2, zzb);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            zzavi.zzc(parcel);
            boolean zze = zze(readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zze ? 1 : 0);
        } else if (i == 3) {
            String readString3 = parcel.readString();
            zzavi.zzc(parcel);
            zzbrp zzc = zzc(readString3);
            parcel2.writeNoException();
            zzavi.zzf(parcel2, zzc);
        } else {
            if (i != 4) {
                return false;
            }
            String readString4 = parcel.readString();
            zzavi.zzc(parcel);
            boolean zzd = zzd(readString4);
            parcel2.writeNoException();
            parcel2.writeInt(zzd ? 1 : 0);
        }
        return true;
    }
}

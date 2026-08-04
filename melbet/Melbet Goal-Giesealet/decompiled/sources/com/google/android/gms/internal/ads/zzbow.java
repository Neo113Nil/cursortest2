package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbow extends zzaya implements zzbox {
    public zzbow() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbox zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof zzbox ? (zzbox) queryLocalInterface : new zzbov(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            zzayb.zzh(parcel);
            zzbpa zzb = zzb(readString);
            parcel2.writeNoException();
            zzayb.zze(parcel2, zzb);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            zzayb.zzh(parcel);
            boolean zzc = zzc(readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zzc ? 1 : 0);
        } else if (i == 3) {
            String readString3 = parcel.readString();
            zzayb.zzh(parcel);
            zzbqw zze = zze(readString3);
            parcel2.writeNoException();
            zzayb.zze(parcel2, zze);
        } else {
            if (i != 4) {
                return false;
            }
            String readString4 = parcel.readString();
            zzayb.zzh(parcel);
            boolean zzd = zzd(readString4);
            parcel2.writeNoException();
            parcel2.writeInt(zzd ? 1 : 0);
        }
        return true;
    }
}

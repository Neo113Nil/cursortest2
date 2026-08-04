package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbad extends zzaya implements zzbae {
    public zzbad() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzbae zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return queryLocalInterface instanceof zzbae ? (zzbae) queryLocalInterface : new zzbac(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbab zzazzVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzazzVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzazzVar = queryLocalInterface instanceof zzbab ? (zzbab) queryLocalInterface : new zzazz(readStrongBinder);
            }
            zzayb.zzh(parcel);
            zzb(zzazzVar);
        } else if (i == 2) {
            parcel.readInt();
            zzayb.zzh(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzayb.zzh(parcel);
            zzd(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}

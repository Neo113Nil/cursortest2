package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzaxl extends zzavh implements zzaxm {
    public zzaxl() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzaxm zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return queryLocalInterface instanceof zzaxm ? (zzaxm) queryLocalInterface : new zzaxk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzavh
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzaxj zzaxhVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzaxhVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzaxhVar = queryLocalInterface instanceof zzaxj ? (zzaxj) queryLocalInterface : new zzaxh(readStrongBinder);
            }
            zzavi.zzc(parcel);
            zzd(zzaxhVar);
        } else if (i == 2) {
            parcel.readInt();
            zzavi.zzc(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzavi.zzc(parcel);
            zzc(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}

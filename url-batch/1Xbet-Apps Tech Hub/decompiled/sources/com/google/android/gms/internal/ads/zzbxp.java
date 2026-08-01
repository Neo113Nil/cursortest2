package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzbxp extends zzavh implements zzbxq {
    public zzbxp() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzavh
    protected final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzg();
        } else if (i == 2) {
            int readInt = parcel.readInt();
            zzavi.zzc(parcel);
            zze(readInt);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzavi.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzavi.zzc(parcel);
            zzf(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}

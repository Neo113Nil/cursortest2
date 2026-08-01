package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbwr extends zzavg implements IInterface {
    zzbwr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbwq zzbwqVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzf(zza, zzbwqVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbi(2, zza);
    }
}

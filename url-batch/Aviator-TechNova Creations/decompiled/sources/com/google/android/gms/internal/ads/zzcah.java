package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcah extends zzbcs implements IInterface {
    zzcah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzcag zzcagVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzcagVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzda(2, zza);
    }
}

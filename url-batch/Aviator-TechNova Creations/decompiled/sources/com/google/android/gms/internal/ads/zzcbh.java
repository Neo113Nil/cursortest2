package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcbh extends zzbcs implements IInterface {
    zzcbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzcaw zzcawVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, zzcawVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzda(2, zza);
    }
}

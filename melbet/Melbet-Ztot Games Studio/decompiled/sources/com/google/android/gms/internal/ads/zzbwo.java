package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzbwo extends zzaxm implements IInterface {
    zzbwo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbwd zzbwdVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbwdVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzdc(2, zza);
    }
}

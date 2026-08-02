package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzbko extends zzaxm implements IInterface {
    zzbko(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbki zzbkiVar, zzbkn zzbknVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzbkiVar);
        zzaxo.zzf(zza, zzbknVar);
        zzdd(2, zza);
    }
}

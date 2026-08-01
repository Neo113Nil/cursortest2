package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzblt extends zzavg implements IInterface {
    zzblt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbln zzblnVar, zzbls zzblsVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzblnVar);
        zzavi.zzf(zza, zzblsVar);
        zzbj(2, zza);
    }
}

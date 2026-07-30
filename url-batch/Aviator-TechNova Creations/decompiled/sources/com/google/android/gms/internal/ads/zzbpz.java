package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbpz extends zzbcs implements IInterface {
    zzbpz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbpt zzbptVar, zzbpy zzbpyVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, zzbptVar);
        zzbcu.zze(zza, zzbpyVar);
        zzdb(2, zza);
    }
}

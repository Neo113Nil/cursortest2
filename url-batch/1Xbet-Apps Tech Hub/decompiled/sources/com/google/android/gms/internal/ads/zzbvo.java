package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbvo extends zzavg implements zzbvq {
    zzbvo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zze(zzbvi zzbviVar, zzbvt zzbvtVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzbviVar);
        zzavi.zzf(zza, zzbvtVar);
        zzbi(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzf(zzbve zzbveVar, zzbvt zzbvtVar) throws RemoteException {
        Parcel zza = zza();
        zzavi.zzd(zza, zzbveVar);
        zzavi.zzf(zza, zzbvtVar);
        zzbi(1, zza);
    }
}

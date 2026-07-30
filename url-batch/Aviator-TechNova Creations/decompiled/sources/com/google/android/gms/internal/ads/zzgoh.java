package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzgoh extends zzbcs implements zzgoj {
    zzgoh(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzgoj
    public final void zze(String str, Bundle bundle, zzgol zzgolVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbcu.zzc(zza, bundle);
        zzbcu.zze(zza, zzgolVar);
        zzdb(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgoj
    public final void zzf(Bundle bundle, zzgol zzgolVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, bundle);
        zzbcu.zze(zza, zzgolVar);
        zzdb(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgoj
    public final void zzg(Bundle bundle, zzgol zzgolVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zzc(zza, bundle);
        zzbcu.zze(zza, zzgolVar);
        zzdb(3, zza);
    }
}

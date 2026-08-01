package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzecf implements zzgax {
    final /* synthetic */ zzbvt zza;

    zzecf(zzecg zzecgVar, zzbvt zzbvtVar) {
        this.zza = zzbvtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        try {
            this.zza.zze(com.google.android.gms.ads.internal.util.zzbb.zzb(th));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ad service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zzf((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ad service can't call client", e);
        }
    }
}

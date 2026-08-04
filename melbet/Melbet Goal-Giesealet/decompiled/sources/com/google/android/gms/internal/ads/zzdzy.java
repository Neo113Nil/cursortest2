package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzdzy implements zzgoq {
    final /* synthetic */ zzbuf zza;
    final /* synthetic */ zzbuo zzb;

    zzdzy(zzeap zzeapVar, zzbuo zzbuoVar, zzbuf zzbufVar) {
        this.zzb = zzbuoVar;
        this.zza = zzbufVar;
        Objects.requireNonNull(zzeapVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        try {
            this.zzb.zzf(com.google.android.gms.ads.internal.util.zzba.zza(th));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zzb.zze((String) obj, this.zza);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }
}

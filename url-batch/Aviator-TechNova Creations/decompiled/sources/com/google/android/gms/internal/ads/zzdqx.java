package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzdqx implements zzgzl {
    final /* synthetic */ zzdxh zza;
    final /* synthetic */ zzdra zzb;

    zzdqx(zzdra zzdraVar, zzdxh zzdxhVar) {
        this.zza = zzdxhVar;
        Objects.requireNonNull(zzdraVar);
        this.zzb = zzdraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        this.zzb.zzd().zze().putLong(this.zza.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzdta implements zzgzl {
    final /* synthetic */ String zza;
    final /* synthetic */ zzboh zzb;

    zzdta(zzdtk zzdtkVar, String str, zzboh zzbohVar) {
        this.zza = str;
        this.zzb = zzbohVar;
        Objects.requireNonNull(zzdtkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcjl) obj).zzab(this.zza, this.zzb);
    }
}

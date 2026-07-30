package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzcet implements zzgzl {
    final /* synthetic */ zzcer zza;
    final /* synthetic */ zzcep zzb;

    zzcet(zzceu zzceuVar, zzcer zzcerVar, zzcep zzcepVar) {
        this.zza = zzcerVar;
        this.zzb = zzcepVar;
        Objects.requireNonNull(zzceuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }
}

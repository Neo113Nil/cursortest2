package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzces implements zzgzl {
    final /* synthetic */ zzceu zza;

    zzces(zzceu zzceuVar) {
        Objects.requireNonNull(zzceuVar);
        this.zza = zzceuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        this.zza.zzj().set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        this.zza.zzj().set(1);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgod implements zzgzl {
    final /* synthetic */ zzgoc zza;

    zzgod(zzgoe zzgoeVar, zzgoc zzgocVar) {
        this.zza = zzgocVar;
        Objects.requireNonNull(zzgoeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        zzgoc zzgocVar = this.zza;
        zzgocVar.zzb(th);
        zzgocVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        this.zza.zzc();
    }
}

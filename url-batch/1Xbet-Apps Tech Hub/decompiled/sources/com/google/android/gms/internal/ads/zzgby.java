package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgby extends zzgbk {
    final /* synthetic */ zzgca zza;
    private final zzgah zzb;

    zzgby(zzgca zzgcaVar, zzgah zzgahVar) {
        this.zza = zzgcaVar;
        this.zzb = zzgahVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgah zzgahVar = this.zzb;
        ListenableFuture zza = zzgahVar.zza();
        zzfty.zzd(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgahVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    final /* synthetic */ void zze(Object obj) {
        this.zza.zzs((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    final boolean zzg() {
        return this.zza.isDone();
    }
}

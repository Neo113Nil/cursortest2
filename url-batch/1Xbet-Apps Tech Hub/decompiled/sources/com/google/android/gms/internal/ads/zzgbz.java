package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgbz extends zzgbk {
    final /* synthetic */ zzgca zza;
    private final Callable zzb;

    zzgbz(zzgca zzgcaVar, Callable callable) {
        this.zza = zzgcaVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    final Object zza() throws Exception {
        return this.zzb.call();
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
    final void zze(Object obj) {
        this.zza.zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    final boolean zzg() {
        return this.zza.isDone();
    }
}

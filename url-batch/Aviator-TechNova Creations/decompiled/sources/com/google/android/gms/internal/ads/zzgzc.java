package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgzc extends zzgyq {
    private zzgzb zza;

    zzgzc(zzgub zzgubVar, boolean z, Executor executor, Callable callable) {
        super(zzgubVar, z, false);
        this.zza = new zzgza(this, callable, executor);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    final void zzA(int i) {
        super.zzA(i);
        if (i == 1) {
            this.zza = null;
        }
    }

    final /* synthetic */ void zzD(zzgzb zzgzbVar) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final void zzi() {
        zzgzb zzgzbVar = this.zza;
        if (zzgzbVar != null) {
            zzgzbVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    final void zzw(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    final void zzx() {
        zzgzb zzgzbVar = this.zza;
        if (zzgzbVar != null) {
            zzgzbVar.zze();
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgam extends zzgan {
    final /* synthetic */ zzgao zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgam(zzgao zzgaoVar, Callable callable, Executor executor) {
        super(zzgaoVar, executor);
        this.zza = zzgaoVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgan
    final void zzc(Object obj) {
        this.zza.zzc(obj);
    }
}

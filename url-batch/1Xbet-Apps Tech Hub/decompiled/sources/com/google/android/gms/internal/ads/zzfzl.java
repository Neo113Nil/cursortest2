package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfzl extends zzfzn {
    zzfzl(ListenableFuture listenableFuture, Class cls, zzgai zzgaiVar) {
        super(listenableFuture, cls, zzgaiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfzn
    final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        zzgai zzgaiVar = (zzgai) obj;
        ListenableFuture zza = zzgaiVar.zza(th);
        zzfty.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgaiVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfzn
    final /* synthetic */ void zzf(Object obj) {
        zzs((ListenableFuture) obj);
    }
}

package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzgat extends zzgav {
    zzgat(ListenableFuture listenableFuture, Class cls, zzgbq zzgbqVar) {
        super(listenableFuture, cls, zzgbqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgav
    final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        zzgbq zzgbqVar = (zzgbq) obj;
        ListenableFuture zza = zzgbqVar.zza(th);
        zzfuu.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgbqVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgav
    final /* synthetic */ void zzf(Object obj) {
        zzs((ListenableFuture) obj);
    }
}

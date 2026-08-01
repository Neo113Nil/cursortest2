package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfzv extends zzfzx {
    zzfzv(ListenableFuture listenableFuture, zzgai zzgaiVar) {
        super(listenableFuture, zzgaiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfzx
    final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) throws Exception {
        zzgai zzgaiVar = (zzgai) obj;
        ListenableFuture zza = zzgaiVar.zza(obj2);
        zzfty.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgaiVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfzx
    final /* synthetic */ void zzf(Object obj) {
        zzs((ListenableFuture) obj);
    }
}

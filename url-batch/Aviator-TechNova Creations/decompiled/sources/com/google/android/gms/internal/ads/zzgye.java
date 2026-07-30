package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgye extends zzgyg {
    zzgye(ListenableFuture listenableFuture, Class cls, zzgyw zzgywVar) {
        super(listenableFuture, cls, zzgywVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        zzgyw zzgywVar = (zzgyw) obj;
        ListenableFuture zza = zzgywVar.zza(th);
        zzgrc.zzl(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgywVar);
        return zza;
    }
}

package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzgnj extends zzgnl {
    zzgnj(ListenableFuture listenableFuture, Class cls, zzgob zzgobVar) {
        super(listenableFuture, cls, zzgobVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgnl
    final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgnl
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        zzgob zzgobVar = (zzgob) obj;
        ListenableFuture zza = zzgobVar.zza(th);
        zzghc.zzl(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgobVar);
        return zza;
    }
}

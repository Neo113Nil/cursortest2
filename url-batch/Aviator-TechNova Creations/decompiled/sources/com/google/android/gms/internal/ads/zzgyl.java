package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgyl extends zzgyn {
    zzgyl(ListenableFuture listenableFuture, zzgyw zzgywVar) {
        super(listenableFuture, zzgywVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyn
    final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyn
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzgyw zzgywVar = (zzgyw) obj;
        ListenableFuture zza = zzgywVar.zza(obj2);
        zzgrc.zzl(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgywVar);
        return zza;
    }
}

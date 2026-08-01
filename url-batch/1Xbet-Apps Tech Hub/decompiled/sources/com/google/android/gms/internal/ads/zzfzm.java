package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfzm extends zzfzn {
    zzfzm(ListenableFuture listenableFuture, Class cls, zzftn zzftnVar) {
        super(listenableFuture, cls, zzftnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfzn
    final /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        return ((zzftn) obj).apply(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfzn
    final void zzf(Object obj) {
        zzc(obj);
    }
}

package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzgnk extends zzgnl {
    zzgnk(ListenableFuture listenableFuture, Class cls, zzggr zzggrVar) {
        super(listenableFuture, cls, zzggrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgnl
    final void zze(Object obj) {
        zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgnl
    final /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        return ((zzggr) obj).apply(th);
    }
}

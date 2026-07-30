package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgyf extends zzgyg {
    zzgyf(ListenableFuture listenableFuture, Class cls, zzgqt zzgqtVar) {
        super(listenableFuture, cls, zzgqtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    final void zze(Object obj) {
        zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    final /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        return ((zzgqt) obj).apply(th);
    }
}

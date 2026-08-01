package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbyi implements zzgax {
    final /* synthetic */ ListenableFuture zza;

    zzbyi(zzbyj zzbyjVar, ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        List list;
        list = zzbyj.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        list = zzbyj.zzc;
        list.remove(this.zza);
    }
}

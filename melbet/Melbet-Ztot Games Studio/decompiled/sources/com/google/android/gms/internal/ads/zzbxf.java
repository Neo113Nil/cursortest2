package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzbxf implements zzgcf {
    final /* synthetic */ ListenableFuture zza;

    zzbxf(zzbxg zzbxgVar, ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th) {
        List list;
        list = zzbxg.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        list = zzbxg.zzc;
        list.remove(this.zza);
    }
}

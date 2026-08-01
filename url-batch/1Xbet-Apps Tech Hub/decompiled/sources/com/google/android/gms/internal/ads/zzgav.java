package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzgav extends zzgaw {
    private final ListenableFuture zza;

    protected zzgav(ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgau, com.google.android.gms.internal.ads.zzfwl
    protected final /* synthetic */ Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgaw, com.google.android.gms.internal.ads.zzgau
    protected final /* synthetic */ Future zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgaw
    protected final ListenableFuture zzc() {
        return this.zza;
    }
}

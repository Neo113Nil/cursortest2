package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzeyd implements zzevo {
    public zzeyd(zzbys zzbysVar, zzgcu zzgcuVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        final ListenableFuture zzh = zzgcj.zzh(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfi)).booleanValue()) {
            zzh = zzgcj.zzh(null);
        }
        final ListenableFuture zzh2 = zzgcj.zzh(null);
        return zzgcj.zzc(zzh, zzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeyc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeye((String) ListenableFuture.this.get(), (String) zzh2.get());
            }
        }, zzbzo.zza);
    }
}

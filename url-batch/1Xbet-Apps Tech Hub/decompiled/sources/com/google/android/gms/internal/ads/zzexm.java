package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzexm implements zzeuy {
    final zzgbl zza;
    final String zzb;
    final zzcak zzc;

    public zzexm(zzcak zzcakVar, zzgbl zzgblVar, String str) {
        this.zzc = zzcakVar;
        this.zza = zzgblVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        final ListenableFuture zzh = zzgbb.zzh(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfO)).booleanValue()) {
            zzh = zzgbb.zzh(null);
        }
        final ListenableFuture zzh2 = zzgbb.zzh(null);
        return zzgbb.zzc(zzh, zzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzexl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzexn((String) ListenableFuture.this.get(), (String) zzh2.get());
            }
        }, zzcca.zza);
    }
}

package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzeqm implements zzevo {
    private final zzgcu zza;
    private final zzdqg zzb;
    private final String zzc;
    private final zzffg zzd;

    public zzeqm(zzgcu zzgcuVar, zzdqg zzdqgVar, zzffg zzffgVar, String str) {
        this.zza = zzgcuVar;
        this.zzb = zzdqgVar;
        this.zzd = zzffgVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeql
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqm.this.zzc();
            }
        });
    }

    final /* synthetic */ zzeqn zzc() throws Exception {
        zzffg zzffgVar = this.zzd;
        zzdqg zzdqgVar = this.zzb;
        return new zzeqn(zzdqgVar.zzb(zzffgVar.zzf, this.zzc), zzdqgVar.zza());
    }
}

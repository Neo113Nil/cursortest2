package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzere implements zzeuy {
    private final zzgbl zza;
    private final zzdrp zzb;
    private final String zzc;
    private final zzfeq zzd;

    public zzere(zzgbl zzgblVar, zzdrp zzdrpVar, zzfeq zzfeqVar, String str) {
        this.zza = zzgblVar;
        this.zzb = zzdrpVar;
        this.zzd = zzfeqVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzere.this.zzc();
            }
        });
    }

    final /* synthetic */ zzerf zzc() throws Exception {
        zzfeq zzfeqVar = this.zzd;
        zzdrp zzdrpVar = this.zzb;
        return new zzerf(zzdrpVar.zzb(zzfeqVar.zzf, this.zzc), zzdrpVar.zza());
    }
}

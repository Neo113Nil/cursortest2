package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfax implements zzfbl {
    private final zzfgd zza;
    private final Executor zzb;
    private final zzgax zzc = new zzfav(this);

    public zzfax(zzfgd zzfgdVar, Executor executor) {
        this.zza = zzfgdVar;
        this.zzb = executor;
    }

    final /* synthetic */ ListenableFuture zza(zzcxo zzcxoVar, zzfbg zzfbgVar) throws Exception {
        zzfgd zzfgdVar = this.zza;
        zzfgn zzfgnVar = zzfbgVar.zzb;
        zzbwa zzbwaVar = zzfbgVar.zza;
        zzfgm zzb = zzfgdVar.zzb(zzfgnVar);
        if (zzb != null && zzbwaVar != null) {
            zzgbb.zzr(zzcxoVar.zzb().zzh(zzbwaVar), this.zzc, this.zzb);
        }
        return zzgbb.zzh(new zzfaw(zzfgnVar, zzbwaVar, zzb));
    }

    public final ListenableFuture zzb(zzfbm zzfbmVar, zzfbk zzfbkVar, final zzcxo zzcxoVar) {
        return zzgbb.zze(zzgbb.zzn(zzgas.zzu(new zzfbh(this.zza, zzcxoVar, this.zzb).zzc()), new zzgai() { // from class: com.google.android.gms.internal.ads.zzfat
            @Override // com.google.android.gms.internal.ads.zzgai
            public final ListenableFuture zza(Object obj) {
                return zzfax.this.zza(zzcxoVar, (zzfbg) obj);
            }
        }, this.zzb), Exception.class, new zzfau(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfbl
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfbm zzfbmVar, zzfbk zzfbkVar, Object obj) {
        return zzb(zzfbmVar, zzfbkVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfbl
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}

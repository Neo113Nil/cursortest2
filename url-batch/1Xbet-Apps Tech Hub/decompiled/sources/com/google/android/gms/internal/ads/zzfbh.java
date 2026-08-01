package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfbh {
    private final zzfgd zza;
    private final zzcxo zzb;
    private final Executor zzc;
    private zzfbg zzd;

    public zzfbh(zzfgd zzfgdVar, zzcxo zzcxoVar, Executor executor) {
        this.zza = zzfgdVar;
        this.zzb = zzcxoVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfgn zze() {
        zzfeq zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final ListenableFuture zzc() {
        ListenableFuture zze;
        zzfbg zzfbgVar = this.zzd;
        if (zzfbgVar != null) {
            return zzgbb.zzh(zzfbgVar);
        }
        if (((Boolean) zzbfc.zza.zze()).booleanValue()) {
            zze = zzgbb.zze(zzgbb.zzm(zzgas.zzu(this.zzb.zzb().zze(this.zza.zza())), new zzfbe(this), this.zzc), zzdzp.class, new zzfbd(this), this.zzc);
        } else {
            zzfbg zzfbgVar2 = new zzfbg(null, zze(), null);
            this.zzd = zzfbgVar2;
            zze = zzgbb.zzh(zzfbgVar2);
        }
        return zzgbb.zzm(zze, new zzftn() { // from class: com.google.android.gms.internal.ads.zzfbc
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                return (zzfbg) obj;
            }
        }, this.zzc);
    }
}

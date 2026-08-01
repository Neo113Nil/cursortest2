package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfar implements zzfbl {
    private final zzfbl zza;
    private final zzfbl zzb;
    private final zzfgz zzc;
    private final String zzd;
    private zzcxo zze;
    private final Executor zzf;

    public zzfar(zzfbl zzfblVar, zzfbl zzfblVar2, zzfgz zzfgzVar, String str, Executor executor) {
        this.zza = zzfblVar;
        this.zzb = zzfblVar2;
        this.zzc = zzfgzVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final ListenableFuture zzg(zzfgm zzfgmVar, zzfbm zzfbmVar) {
        zzcxo zzcxoVar = zzfgmVar.zza;
        this.zze = zzcxoVar;
        if (zzfgmVar.zzc != null) {
            if (zzcxoVar.zzf() != null) {
                zzfgmVar.zzc.zzo().zzl(zzfgmVar.zza.zzf());
            }
            return zzgbb.zzh(zzfgmVar.zzc);
        }
        zzcxoVar.zzb().zzl(zzfgmVar.zzb);
        return ((zzfbb) this.zza).zzb(zzfbmVar, null, zzfgmVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfbl
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcxo zzd() {
        return this.zze;
    }

    final /* synthetic */ ListenableFuture zzb(zzfbm zzfbmVar, zzfaq zzfaqVar, zzfbk zzfbkVar, zzcxo zzcxoVar, zzfaw zzfawVar) throws Exception {
        if (zzfawVar != null) {
            zzfaq zzfaqVar2 = new zzfaq(zzfaqVar.zza, zzfaqVar.zzb, zzfaqVar.zzc, zzfaqVar.zzd, zzfaqVar.zze, zzfaqVar.zzf, zzfawVar.zza);
            if (zzfawVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzfaqVar2);
                return zzg(zzfawVar.zzc, zzfbmVar);
            }
            ListenableFuture zza = this.zzc.zza(zzfaqVar2);
            if (zza != null) {
                this.zze = null;
                return zzgbb.zzn(zza, new zzgai() { // from class: com.google.android.gms.internal.ads.zzfan
                    @Override // com.google.android.gms.internal.ads.zzgai
                    public final ListenableFuture zza(Object obj) {
                        return zzfar.this.zze((zzfgw) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzfaqVar2);
            zzfbmVar = new zzfbm(zzfbmVar.zzb, zzfawVar.zzb);
        }
        ListenableFuture zzb = ((zzfbb) this.zza).zzb(zzfbmVar, zzfbkVar, zzcxoVar);
        this.zze = zzcxoVar;
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfbl
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfbm zzfbmVar, zzfbk zzfbkVar, Object obj) {
        return zzf(zzfbmVar, zzfbkVar, null);
    }

    final /* synthetic */ ListenableFuture zze(zzfgw zzfgwVar) throws Exception {
        zzfgy zzfgyVar;
        if (zzfgwVar == null || zzfgwVar.zza == null || (zzfgyVar = zzfgwVar.zzb) == null) {
            throw new zzdxn(1, "Empty prefetch");
        }
        zzaze zza = zzazk.zza();
        zzazc zza2 = zzazd.zza();
        zza2.zzd(2);
        zza2.zzb(zzazh.zzd());
        zza.zza(zza2);
        zzfgwVar.zza.zza.zzb().zzc().zzm((zzazk) zza.zzal());
        return zzg(zzfgwVar.zza, ((zzfaq) zzfgyVar).zzb);
    }

    public final synchronized ListenableFuture zzf(final zzfbm zzfbmVar, final zzfbk zzfbkVar, zzcxo zzcxoVar) {
        zzcxn zza = zzfbkVar.zza(zzfbmVar.zzb);
        zza.zza(new zzfas(this.zzd));
        final zzcxo zzcxoVar2 = (zzcxo) zza.zzh();
        zzcxoVar2.zzg();
        zzcxoVar2.zzg();
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzcxoVar2.zzg().zzd;
        if (zzlVar.zzs == null && zzlVar.zzx == null) {
            zzfeq zzg = zzcxoVar2.zzg();
            final zzfaq zzfaqVar = new zzfaq(zzfbkVar, zzfbmVar, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, null);
            return zzgbb.zzn(zzgas.zzu(((zzfax) this.zzb).zzb(zzfbmVar, zzfbkVar, zzcxoVar2)), new zzgai() { // from class: com.google.android.gms.internal.ads.zzfao
                @Override // com.google.android.gms.internal.ads.zzgai
                public final ListenableFuture zza(Object obj) {
                    return zzfar.this.zzb(zzfbmVar, zzfaqVar, zzfbkVar, zzcxoVar2, (zzfaw) obj);
                }
            }, this.zzf);
        }
        this.zze = zzcxoVar2;
        return ((zzfbb) this.zza).zzb(zzfbmVar, zzfbkVar, zzcxoVar2);
    }
}

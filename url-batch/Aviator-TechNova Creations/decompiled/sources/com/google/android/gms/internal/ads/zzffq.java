package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbgj;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzffq implements zzfgj {
    private final zzfgj zza;
    private final zzfgj zzb;
    private final zzflv zzc;
    private final String zzd;
    private zzdam zze;
    private final Executor zzf;

    public zzffq(zzfgj zzfgjVar, zzfgj zzfgjVar2, zzflv zzflvVar, String str, Executor executor) {
        this.zza = zzfgjVar;
        this.zzb = zzfgjVar2;
        this.zzc = zzflvVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final ListenableFuture zzg(zzfli zzfliVar, zzfgk zzfgkVar) {
        zzdam zzdamVar = zzfliVar.zza;
        this.zze = zzdamVar;
        if (zzfliVar.zzc != null) {
            if (zzdamVar.zzc() != null) {
                zzfliVar.zzc.zzp().zzu(zzfliVar.zza.zzc());
            }
            return zzgzo.zza(zzfliVar.zzc);
        }
        zzdamVar.zza().zzh(zzfliVar.zzb);
        return ((zzfga) this.zza).zzb(zzfgkVar, null, zzfliVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdam zzd() {
        return this.zze;
    }

    public final synchronized ListenableFuture zzb(final zzfgk zzfgkVar, final zzfgi zzfgiVar, zzdam zzdamVar) {
        zzdal zza = zzfgiVar.zza(zzfgkVar.zzb);
        zza.zzi(new zzffr(this.zzd));
        final zzdam zzdamVar2 = (zzdam) zza.zzh();
        zzdamVar2.zzb();
        zzdamVar2.zzb();
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzdamVar2.zzb().zzd;
        if (zzmVar.zzs == null && zzmVar.zzx == null) {
            zzfjk zzb = zzdamVar2.zzb();
            com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzb.zzd;
            String str = zzb.zzg;
            com.google.android.gms.ads.internal.client.zzx zzxVar = zzb.zzk;
            Executor executor = this.zzf;
            final zzffp zzffpVar = new zzffp(zzfgiVar, zzfgkVar, zzmVar2, str, executor, zzxVar, null);
            zzdam zzdamVar3 = zzdamVar2;
            return (zzgzg) zzgzo.zzj(zzgzg.zzw(((zzffw) this.zzb).zza(zzfgkVar, zzfgiVar, zzdamVar2)), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzffo
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return zzffq.this.zze(zzfgkVar, zzffpVar, zzfgiVar, zzdamVar2, (zzffv) obj);
                }
            }, executor);
        }
        this.zze = zzdamVar2;
        zzdam zzdamVar4 = zzdamVar2;
        return ((zzfga) this.zza).zzb(zzfgkVar, zzfgiVar, zzdamVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfgk zzfgkVar, zzfgi zzfgiVar, Object obj) {
        return zzb(zzfgkVar, zzfgiVar, null);
    }

    final /* synthetic */ ListenableFuture zze(zzfgk zzfgkVar, zzffp zzffpVar, zzfgi zzfgiVar, zzdam zzdamVar, zzffv zzffvVar) {
        if (zzffvVar != null) {
            zzffp zzffpVar2 = new zzffp(zzffpVar.zza, zzffpVar.zzb, zzffpVar.zzc, zzffpVar.zzd, zzffpVar.zze, zzffpVar.zzf, zzffvVar.zza);
            zzfli zzfliVar = zzffvVar.zzc;
            if (zzfliVar != null) {
                this.zze = null;
                this.zzc.zza(zzffpVar2);
                return zzg(zzfliVar, zzfgkVar);
            }
            zzflv zzflvVar = this.zzc;
            ListenableFuture zzb = zzflvVar.zzb(zzffpVar2);
            if (zzb != null) {
                this.zze = null;
                return zzgzo.zzj(zzb, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzffn
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return zzffq.this.zzf((zzflr) obj);
                    }
                }, this.zzf);
            }
            zzflvVar.zza(zzffpVar2);
            zzfgkVar = new zzfgk(zzfgkVar.zzb, zzffvVar.zzb);
        }
        ListenableFuture zzb2 = ((zzfga) this.zza).zzb(zzfgkVar, zzfgiVar, zzdamVar);
        this.zze = zzdamVar;
        return zzb2;
    }

    final /* synthetic */ ListenableFuture zzf(zzflr zzflrVar) {
        zzfli zzfliVar;
        zzflt zzfltVar;
        if (zzflrVar == null || (zzfliVar = zzflrVar.zza) == null || (zzfltVar = zzflrVar.zzb) == null) {
            throw new zzecr(1, "Empty prefetch");
        }
        zzbgj.zzb.zzc zzs = zzbgj.zzb.zzs();
        zzbgj.zzb.zza.C0014zza zzs2 = zzbgj.zzb.zza.zzs();
        zzs2.zzc(zzbgj.zzb.zzd.IN_MEMORY);
        zzs2.zzg(zzbgj.zzb.zze.zzs());
        zzs.zzh(zzs2);
        zzfliVar.zza.zza().zzd().zzl(zzs.zzbu());
        return zzg(zzfliVar, ((zzffp) zzfltVar).zzb);
    }
}

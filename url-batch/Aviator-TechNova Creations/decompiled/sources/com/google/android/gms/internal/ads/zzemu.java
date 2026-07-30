package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzemu implements zzekm {
    private final Context zza;
    private final zzdmq zzb;
    private final Executor zzc;

    public zzemu(Context context, zzdmq zzdmqVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdmqVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfjc zzfjcVar, int i) {
        return zzfjcVar.zza.zza.zzh.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        zzfki zzfkiVar = (zzfki) zzekjVar.zzb;
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        String jSONObject = zzfirVar.zzv.toString();
        String zzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzfirVar.zzs);
        zzfkiVar.zzo(this.zza, zzfjkVar.zzd, jSONObject, zzm, (zzbtz) zzekjVar.zzc, zzfjkVar.zzj, zzfjkVar.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        zzdoh zzag;
        zzfki zzfkiVar = (zzfki) zzekjVar.zzb;
        zzbue zzD = zzfkiVar.zzD();
        zzbuf zzE = zzfkiVar.zzE();
        zzbui zzu = zzfkiVar.zzu();
        if (zzu != null && zzc(zzfjcVar, 6)) {
            zzag = zzdoh.zzaf(zzu);
        } else if (zzD != null && zzc(zzfjcVar, 6)) {
            zzag = zzdoh.zzai(zzD);
        } else if (zzD != null && zzc(zzfjcVar, 2)) {
            zzag = zzdoh.zzah(zzD);
        } else if (zzE != null && zzc(zzfjcVar, 6)) {
            zzag = zzdoh.zzaj(zzE);
        } else {
            if (zzE == null || !zzc(zzfjcVar, 1)) {
                throw new zzenv(1, "No native ad mappers");
            }
            zzag = zzdoh.zzag(zzE);
        }
        if (zzag != null) {
            zzfjk zzfjkVar = zzfjcVar.zza.zza;
            if (zzfjkVar.zzh.contains(Integer.toString(zzag.zzx()))) {
                zzdoj zze = this.zzb.zze(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdos(zzag), new zzdql(zzE, zzD, zzu));
                ((zzelv) zzekjVar.zzc).zzc(zze.zzf());
                zze.zza().zzq(new zzcrl(zzfkiVar), this.zzc);
                return zze.zzh();
            }
        }
        throw new zzenv(1, "No corresponding native ad listener");
    }
}

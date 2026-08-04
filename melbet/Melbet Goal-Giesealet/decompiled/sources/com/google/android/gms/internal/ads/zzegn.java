package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzegn implements zzeef {
    private final Context zza;
    private final zzdhd zzb;
    private final Executor zzc;

    public zzegn(Context context, zzdhd zzdhdVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdhdVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfcu zzfcuVar, int i) {
        return zzfcuVar.zza.zza.zzh.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj {
        zzfea zzfeaVar = (zzfea) zzeecVar.zzb;
        zzfdc zzfdcVar = zzfcuVar.zza.zza;
        String jSONObject = zzfcjVar.zzv.toString();
        String zzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzfcjVar.zzs);
        zzfeaVar.zzo(this.zza, zzfdcVar.zzd, jSONObject, zzm, (zzbpd) zzeecVar.zzc, zzfdcVar.zzj, zzfdcVar.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj, zzeho {
        zzdiu zzag;
        zzfea zzfeaVar = (zzfea) zzeecVar.zzb;
        zzbpi zzD = zzfeaVar.zzD();
        zzbpj zzE = zzfeaVar.zzE();
        zzbpm zzu = zzfeaVar.zzu();
        if (zzu != null && zzc(zzfcuVar, 6)) {
            zzag = zzdiu.zzaf(zzu);
        } else if (zzD != null && zzc(zzfcuVar, 6)) {
            zzag = zzdiu.zzai(zzD);
        } else if (zzD != null && zzc(zzfcuVar, 2)) {
            zzag = zzdiu.zzah(zzD);
        } else if (zzE != null && zzc(zzfcuVar, 6)) {
            zzag = zzdiu.zzaj(zzE);
        } else {
            if (zzE == null || !zzc(zzfcuVar, 1)) {
                throw new zzeho(1, "No native ad mappers");
            }
            zzag = zzdiu.zzag(zzE);
        }
        if (zzag != null) {
            zzfdc zzfdcVar = zzfcuVar.zza.zza;
            if (zzfdcVar.zzh.contains(Integer.toString(zzag.zzx()))) {
                zzdiw zze = this.zzb.zze(new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza), new zzdjf(zzag), new zzdky(zzE, zzD, zzu));
                ((zzefo) zzeecVar.zzc).zzc(zze.zzf());
                zze.zza().zzq(new zzcly(zzfeaVar), this.zzc);
                return zze.zzh();
            }
        }
        throw new zzeho(1, "No corresponding native ad listener");
    }
}

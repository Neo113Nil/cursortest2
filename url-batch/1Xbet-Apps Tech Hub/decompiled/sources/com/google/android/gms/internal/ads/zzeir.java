package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeir implements zzegb {
    private final Context zza;
    private final zzdiu zzb;
    private final Executor zzc;

    public zzeir(Context context, zzdiu zzdiuVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdiuVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfeh zzfehVar, int i) {
        return zzfehVar.zza.zza.zzg.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzegb
    public final /* bridge */ /* synthetic */ Object zza(zzfeh zzfehVar, zzfdu zzfduVar, zzefy zzefyVar) throws zzfev, zzejt {
        zzdkk zzah;
        zzbqc zzD = ((zzffm) zzefyVar.zzb).zzD();
        zzbqd zzE = ((zzffm) zzefyVar.zzb).zzE();
        zzbqg zzd = ((zzffm) zzefyVar.zzb).zzd();
        if (zzd != null && zzc(zzfehVar, 6)) {
            zzah = zzdkk.zzt(zzd);
        } else if (zzD != null && zzc(zzfehVar, 6)) {
            zzah = zzdkk.zzai(zzD);
        } else if (zzD != null && zzc(zzfehVar, 2)) {
            zzah = zzdkk.zzag(zzD);
        } else if (zzE != null && zzc(zzfehVar, 6)) {
            zzah = zzdkk.zzaj(zzE);
        } else {
            if (zzE == null || !zzc(zzfehVar, 1)) {
                throw new zzejt(1, "No native ad mappers");
            }
            zzah = zzdkk.zzah(zzE);
        }
        zzfeq zzfeqVar = zzfehVar.zza.zza;
        if (!zzfeqVar.zzg.contains(Integer.toString(zzah.zzc()))) {
            throw new zzejt(1, "No corresponding native ad listener");
        }
        zzdkm zze = this.zzb.zze(new zzcuh(zzfehVar, zzfduVar, zzefyVar.zza), new zzdkw(zzah), new zzdmn(zzE, zzD, zzd));
        ((zzehr) zzefyVar.zzc).zzc(zze.zzj());
        zze.zzd().zzo(new zzcpf((zzffm) zzefyVar.zzb), this.zzc);
        return zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzegb
    public final void zzb(zzfeh zzfehVar, zzfdu zzfduVar, zzefy zzefyVar) throws zzfev {
        zzffm zzffmVar = (zzffm) zzefyVar.zzb;
        zzfeq zzfeqVar = zzfehVar.zza.zza;
        String jSONObject = zzfduVar.zzw.toString();
        String zzl = com.google.android.gms.ads.internal.util.zzbw.zzl(zzfduVar.zzt);
        zzbpx zzbpxVar = (zzbpx) zzefyVar.zzc;
        zzfeq zzfeqVar2 = zzfehVar.zza.zza;
        zzffmVar.zzp(this.zza, zzfeqVar.zzd, jSONObject, zzl, zzbpxVar, zzfeqVar2.zzi, zzfeqVar2.zzg);
    }
}

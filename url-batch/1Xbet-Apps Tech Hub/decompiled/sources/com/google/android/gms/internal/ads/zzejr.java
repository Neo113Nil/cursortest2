package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzejr {
    private final zzffg zza;
    private final zzdrh zzb;
    private final zzdtp zzc;
    private final zzfje zzd;

    public zzejr(zzffg zzffgVar, zzdrh zzdrhVar, zzdtp zzdtpVar, zzfje zzfjeVar) {
        this.zza = zzffgVar;
        this.zzb = zzdrhVar;
        this.zzc = zzdtpVar;
        this.zzd = zzfjeVar;
    }

    public final void zza(zzfdy zzfdyVar, zzfdu zzfduVar, int i, @Nullable zzefz zzefzVar, long j) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziv)).booleanValue()) {
            zzfjd zzb = zzfjd.zzb("adapter_status");
            zzb.zzg(zzfdyVar);
            zzb.zzf(zzfduVar);
            zzb.zza("adapter_l", String.valueOf(j));
            zzb.zza("sc", Integer.toString(i));
            if (zzefzVar != null) {
                zzb.zza("arec", Integer.toString(zzefzVar.zzb().zza));
                String zza = this.zza.zza(zzefzVar.getMessage());
                if (zza != null) {
                    zzb.zza("areec", zza);
                }
            }
            zzdrg zzb2 = this.zzb.zzb(zzfduVar.zzu);
            if (zzb2 != null) {
                zzb.zza("ancn", zzb2.zza);
                zzbsd zzbsdVar = zzb2.zzb;
                if (zzbsdVar != null) {
                    zzb.zza("adapter_v", zzbsdVar.toString());
                }
                zzbsd zzbsdVar2 = zzb2.zzc;
                if (zzbsdVar2 != null) {
                    zzb.zza("adapter_sv", zzbsdVar2.toString());
                }
            }
            this.zzd.zzb(zzb);
            return;
        }
        zzdto zza2 = this.zzc.zza();
        zza2.zze(zzfdyVar);
        zza2.zzd(zzfduVar);
        zza2.zzb("action", "adapter_status");
        zza2.zzb("adapter_l", String.valueOf(j));
        zza2.zzb("sc", Integer.toString(i));
        if (zzefzVar != null) {
            zza2.zzb("arec", Integer.toString(zzefzVar.zzb().zza));
            String zza3 = this.zza.zza(zzefzVar.getMessage());
            if (zza3 != null) {
                zza2.zzb("areec", zza3);
            }
        }
        zzdrg zzb3 = this.zzb.zzb(zzfduVar.zzu);
        if (zzb3 != null) {
            zza2.zzb("ancn", zzb3.zza);
            zzbsd zzbsdVar3 = zzb3.zzb;
            if (zzbsdVar3 != null) {
                zza2.zzb("adapter_v", zzbsdVar3.toString());
            }
            zzbsd zzbsdVar4 = zzb3.zzc;
            if (zzbsdVar4 != null) {
                zza2.zzb("adapter_sv", zzbsdVar4.toString());
            }
        }
        zza2.zzg();
    }
}

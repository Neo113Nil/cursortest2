package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzehm {
    private final zzfdv zza;
    private final zzdpz zzb;
    private final zzdsm zzc;

    public zzehm(zzfdv zzfdvVar, zzdpz zzdpzVar, zzdsm zzdsmVar) {
        this.zza = zzfdvVar;
        this.zzb = zzdpzVar;
        this.zzc = zzdsmVar;
    }

    public final void zza(zzfcm zzfcmVar, zzfcj zzfcjVar, int i, @Nullable zzeed zzeedVar, long j) {
        zzdpy zzdpyVar;
        zzdsl zza = this.zzc.zza();
        zza.zza(zzfcmVar);
        zza.zzb(zzfcjVar);
        zza.zzc("action", "adapter_status");
        zza.zzc("adapter_l", String.valueOf(j));
        zza.zzc("sc", Integer.toString(i));
        if (zzeedVar != null) {
            zza.zzc("arec", Integer.toString(zzeedVar.zzb().zza));
            String zza2 = this.zza.zza(zzeedVar.getMessage());
            if (zza2 != null) {
                zza.zzc("areec", zza2);
            }
        }
        zzdpz zzdpzVar = this.zzb;
        Iterator it = zzfcjVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdpyVar = null;
                break;
            } else {
                zzdpyVar = zzdpzVar.zzc((String) it.next());
                if (zzdpyVar != null) {
                    break;
                }
            }
        }
        if (zzdpyVar != null) {
            zza.zzc("ancn", zzdpyVar.zza);
            zzbrl zzbrlVar = zzdpyVar.zzb;
            if (zzbrlVar != null) {
                zza.zzc("adapter_v", zzbrlVar.toString());
            }
            zzbrl zzbrlVar2 = zzdpyVar.zzc;
            if (zzbrlVar2 != null) {
                zza.zzc("adapter_sv", zzbrlVar2.toString());
            }
        }
        zza.zzd();
    }
}

package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdzm implements zzdzo {
    private final Map zza;
    private final zzgbl zzb;
    private final zzdba zzc;

    public zzdzm(Map map, zzgbl zzgblVar, zzdba zzdbaVar) {
        this.zza = map;
        this.zzb = zzgblVar;
        this.zzc = zzdbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdzo
    public final ListenableFuture zzb(final zzbwa zzbwaVar) {
        this.zzc.zzbs(zzbwaVar);
        ListenableFuture zzg = zzgbb.zzg(new zzdxn(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzib)).split(",")) {
            final zzhec zzhecVar = (zzhec) this.zza.get(str.trim());
            if (zzhecVar != null) {
                zzg = zzgbb.zzf(zzg, zzdxn.class, new zzgai() { // from class: com.google.android.gms.internal.ads.zzdzk
                    @Override // com.google.android.gms.internal.ads.zzgai
                    public final ListenableFuture zza(Object obj) {
                        return ((zzdzo) zzhec.this.zzb()).zzb(zzbwaVar);
                    }
                }, this.zzb);
            }
        }
        zzgbb.zzr(zzg, new zzdzl(this), zzcca.zzf);
        return zzg;
    }
}

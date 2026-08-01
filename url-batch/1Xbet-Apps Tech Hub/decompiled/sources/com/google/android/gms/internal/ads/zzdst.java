package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdst implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;
    private final zzhec zzd;

    public zzdst(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3, zzhec zzhecVar4) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
        this.zzd = zzhecVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String str = (String) this.zza.zzb();
        Context zza = ((zzciw) this.zzb).zza();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        Map zzb = ((zzhdt) this.zzd).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeN)).booleanValue()) {
            zzayp zzaypVar = new zzayp(new zzayv(zza));
            zzaypVar.zzb(new zzayo() { // from class: com.google.android.gms.internal.ads.zzdsu
                @Override // com.google.android.gms.internal.ads.zzayo
                public final void zza(zzbae zzbaeVar) {
                    zzbaeVar.zzh(str);
                }
            });
            emptySet = Collections.singleton(new zzdfw(new zzdsw(zzaypVar, zzb), zzgblVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzhdx.zzb(emptySet);
        return emptySet;
    }
}

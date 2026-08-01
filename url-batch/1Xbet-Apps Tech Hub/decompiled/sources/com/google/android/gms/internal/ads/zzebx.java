package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzebx implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;
    private final zzhec zzd;
    private final zzhec zze;
    private final zzhec zzf;
    private final zzhec zzg;
    private final zzhec zzh;

    public zzebx(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3, zzhec zzhecVar4, zzhec zzhecVar5, zzhec zzhecVar6, zzhec zzhecVar7, zzhec zzhecVar8) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
        this.zzd = zzhecVar4;
        this.zze = zzhecVar5;
        this.zzf = zzhecVar6;
        this.zzg = zzhecVar7;
        this.zzh = zzhecVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* synthetic */ Object zzb() {
        Context zza = ((zzciw) this.zza).zza();
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        return new zzebw(zza, zzgblVar, new zzbwm(), ((zzcjf) this.zzd).zzb(), ((zzecp) this.zze).zzb(), (ArrayDeque) this.zzf.zzb(), new zzecl(), (zzfkk) this.zzh.zzb());
    }
}

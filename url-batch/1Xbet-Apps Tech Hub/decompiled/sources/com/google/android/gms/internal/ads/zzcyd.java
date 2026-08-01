package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcyd implements zzhdp {
    private final zzcyc zza;
    private final zzhec zzb;
    private final zzhec zzc;
    private final zzhec zzd;
    private final zzhec zze;

    public zzcyd(zzcyc zzcycVar, zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3, zzhec zzhecVar4) {
        this.zza = zzcycVar;
        this.zzb = zzhecVar;
        this.zzc = zzhecVar2;
        this.zzd = zzhecVar3;
        this.zze = zzhecVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zzb.zzb();
        zzcbt zza = ((zzcji) this.zzc).zza();
        zzfdu zza2 = ((zzcui) this.zzd).zza();
        zzbyk zzbykVar = new zzbyk();
        zzbyl zzbylVar = zza2.zzB;
        if (zzbylVar == null) {
            return null;
        }
        zzfea zzfeaVar = zza2.zzt;
        return new zzbyj(context, zza, zzbylVar, zzfeaVar == null ? null : zzfeaVar.zzb, zzbykVar);
    }
}

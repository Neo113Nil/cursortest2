package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzcim implements zzexn {
    final zzhqg zza;
    final zzhqg zzb;
    final zzhqg zzc;
    final zzhqg zzd;
    final zzhqg zze;
    final zzhqg zzf;
    private final zzcih zzg;

    zzcim(zzcih zzcihVar, Context context, String str) {
        this.zzg = zzcihVar;
        zzhpx zza = zzhpy.zza(context);
        this.zza = zza;
        zzhpx zza2 = zzhpy.zza(str);
        this.zzb = zza2;
        zzhqg zzhqgVar = zzcihVar.zzbr;
        zzfad zzc = zzfad.zzc(zza, zzhqgVar, zzcihVar.zzbs);
        this.zzc = zzc;
        zzhqg zza3 = zzhpw.zza(zzeyk.zza(zzhqgVar));
        this.zzd = zza3;
        zzhqg zzhqgVar2 = zzcihVar.zza;
        zzhqg zzhqgVar3 = zzcihVar.zzU;
        zzfde zza4 = zzfde.zza();
        zzhqg zzhqgVar4 = zzcihVar.zzi;
        zzhqg zza5 = zzhpw.zza(zzeym.zza(zza, zzhqgVar2, zzhqgVar3, zzc, zza3, zza4, zzhqgVar4));
        this.zze = zza5;
        this.zzf = zzhpw.zza(zzeys.zza(zzhqgVar3, zza, zza2, zza5, zza3, zzhqgVar4, zzcihVar.zzl));
    }

    @Override // com.google.android.gms.internal.ads.zzexn
    public final zzeyr zza() {
        return (zzeyr) this.zzf.zzb();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzcir implements zzeza {
    final zzhqg zza;
    final zzhqg zzb;
    final zzhqg zzc;
    final zzhqg zzd;
    final zzhqg zze;
    final zzhqg zzf;
    private final Context zzg;
    private final com.google.android.gms.ads.internal.client.zzr zzh;
    private final String zzi;
    private final zzcih zzj;

    zzcir(zzcih zzcihVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzj = zzcihVar;
        this.zzg = context;
        this.zzh = zzrVar;
        this.zzi = str;
        zzhpx zza = zzhpy.zza(context);
        this.zza = zza;
        zzhpx zza2 = zzhpy.zza(zzrVar);
        this.zzb = zza2;
        zzhqg zza3 = zzhpw.zza(zzelj.zza(zzcihVar.zzl));
        this.zzc = zza3;
        zzhqg zza4 = zzhpw.zza(zzelo.zza());
        this.zzd = zza4;
        zzhqg zza5 = zzhpw.zza(zzdba.zza());
        this.zze = zza5;
        this.zzf = zzhpw.zza(zzeyy.zza(zza, zzcihVar.zza, zza2, zzcihVar.zzU, zza3, zza4, zzfde.zza(), zza5));
    }

    @Override // com.google.android.gms.internal.ads.zzeza
    public final zzekn zza() {
        zzeyx zzeyxVar = (zzeyx) this.zzf.zzb();
        zzeli zzeliVar = (zzeli) this.zzc.zzb();
        zzcih zzcihVar = this.zzj;
        zzhqg zzhqgVar = zzcihVar.zzl;
        return new zzekn(this.zzg, this.zzh, this.zzi, zzeyxVar, zzeliVar, zzchs.zzd(zzcihVar.zzG()), (zzdsm) zzhqgVar.zzb());
    }
}

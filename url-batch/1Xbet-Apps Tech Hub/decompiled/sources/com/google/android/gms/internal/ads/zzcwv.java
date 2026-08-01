package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcwv implements zzdbc {
    private final Context zza;
    private final zzfeq zzb;
    private final zzcbt zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzdvs zze;
    private final zzfkk zzf;

    public zzcwv(Context context, zzfeq zzfeqVar, zzcbt zzcbtVar, com.google.android.gms.ads.internal.util.zzg zzgVar, zzdvs zzdvsVar, zzfkk zzfkkVar) {
        this.zza = context;
        this.zzb = zzfeqVar;
        this.zzc = zzcbtVar;
        this.zzd = zzgVar;
        this.zze = zzdvsVar;
        this.zzf = zzfkkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzbs(zzbwa zzbwaVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdO)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzd;
            Context context = this.zza;
            zzcbt zzcbtVar = this.zzc;
            zzfeq zzfeqVar = this.zzb;
            zzfkk zzfkkVar = this.zzf;
            com.google.android.gms.ads.internal.zzt.zza().zzc(context, zzcbtVar, zzfeqVar.zzf, zzgVar.zzh(), zzfkkVar);
        }
        this.zze.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzdbc
    public final void zzbt(zzfeh zzfehVar) {
    }
}

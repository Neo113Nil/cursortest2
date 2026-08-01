package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcpz implements zzgax {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcqa zzb;

    zzcpz(zzcqa zzcqaVar, String str) {
        this.zzb = zzcqaVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        zzffa zzffaVar;
        zzfkw zzfkwVar;
        zzfeh zzfehVar;
        zzfdu zzfduVar;
        zzfdu zzfduVar2;
        zzcqa zzcqaVar = this.zzb;
        zzffaVar = zzcqaVar.zzh;
        zzfkwVar = zzcqaVar.zzg;
        zzfehVar = zzcqaVar.zze;
        zzfduVar = zzcqaVar.zzf;
        zzfduVar2 = zzcqaVar.zzf;
        zzffaVar.zza(zzfkwVar.zzd(zzfehVar, zzfduVar, false, this.zza, null, zzfduVar2.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzffa zzffaVar;
        zzfkw zzfkwVar;
        zzfeh zzfehVar;
        zzfdu zzfduVar;
        zzfdu zzfduVar2;
        zzcqa zzcqaVar = this.zzb;
        String str = (String) obj;
        zzffaVar = zzcqaVar.zzh;
        zzfkwVar = zzcqaVar.zzg;
        zzfehVar = zzcqaVar.zze;
        zzfduVar = zzcqaVar.zzf;
        zzfduVar2 = zzcqaVar.zzf;
        zzffaVar.zza(zzfkwVar.zzd(zzfehVar, zzfduVar, false, this.zza, str, zzfduVar2.zzd));
    }
}

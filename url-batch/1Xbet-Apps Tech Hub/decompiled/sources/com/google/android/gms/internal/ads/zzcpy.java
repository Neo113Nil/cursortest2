package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcpy implements zzgax {
    final /* synthetic */ zzcqa zza;

    zzcpy(zzcqa zzcqaVar) {
        this.zza = zzcqaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzffa zzffaVar;
        zzfkw zzfkwVar;
        zzfeh zzfehVar;
        zzfdu zzfduVar;
        zzfdu zzfduVar2;
        Context context;
        zzcqa zzcqaVar = this.zza;
        String str = (String) obj;
        zzffaVar = zzcqaVar.zzh;
        zzfkwVar = zzcqaVar.zzg;
        zzfehVar = zzcqaVar.zze;
        zzfduVar = zzcqaVar.zzf;
        zzfduVar2 = zzcqaVar.zzf;
        List zzd = zzfkwVar.zzd(zzfehVar, zzfduVar, false, "", str, zzfduVar2.zzc);
        zzcqa zzcqaVar2 = this.zza;
        zzcaw zzo = com.google.android.gms.ads.internal.zzt.zzo();
        context = zzcqaVar2.zza;
        zzffaVar.zzc(zzd, true == zzo.zzz(context) ? 2 : 1);
    }
}

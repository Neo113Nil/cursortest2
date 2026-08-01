package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzdyp implements zzgax {
    final /* synthetic */ zzdyq zza;

    zzdyp(zzdyq zzdyqVar) {
        this.zza = zzdyqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        Pattern pattern;
        zzedm zzedmVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgi)).booleanValue()) {
            pattern = zzdyq.zza;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzedmVar = this.zza.zzf;
                zzedmVar.zzi(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzedm zzedmVar;
        zzedm zzedmVar2;
        zzfeh zzfehVar = (zzfeh) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgi)).booleanValue()) {
            zzedmVar = this.zza.zzf;
            zzedmVar.zzi(zzfehVar.zzb.zzb.zze);
            zzedmVar2 = this.zza.zzf;
            zzedmVar2.zzj(zzfehVar.zzb.zzb.zzf);
        }
    }
}

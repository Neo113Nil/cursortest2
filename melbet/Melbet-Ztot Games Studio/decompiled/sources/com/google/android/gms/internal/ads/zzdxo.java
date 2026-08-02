package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzdxo implements zzgcf {
    final /* synthetic */ zzdxp zza;

    zzdxo(zzdxp zzdxpVar) {
        this.zza = zzdxpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th) {
        Pattern pattern;
        zzecd zzecdVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfB)).booleanValue()) {
            pattern = zzdxp.zza;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzecdVar = this.zza.zzf;
                zzecdVar.zzi(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzecd zzecdVar;
        zzecd zzecdVar2;
        zzfex zzfexVar = (zzfex) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfB)).booleanValue()) {
            zzecdVar = this.zza.zzf;
            zzecdVar.zzi(zzfexVar.zzb.zzb.zzf);
            zzecdVar2 = this.zza.zzf;
            zzecdVar2.zzj(zzfexVar.zzb.zzb.zzg);
        }
    }
}

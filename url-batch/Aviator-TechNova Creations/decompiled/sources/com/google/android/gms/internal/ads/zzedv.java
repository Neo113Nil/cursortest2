package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzedv implements zzgzl {
    final /* synthetic */ zzedy zza;

    zzedv(zzedy zzedyVar) {
        Objects.requireNonNull(zzedyVar);
        this.zza = zzedyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        Pattern pattern;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhf)).booleanValue()) {
            String message = th.getMessage();
            pattern = zzedy.zzh;
            Matcher matcher = pattern.matcher(message);
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzedy zzedyVar = this.zza;
                zzedyVar.zzc().zzc(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfjc zzfjcVar = (zzfjc) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhf)).booleanValue()) {
            zzedy zzedyVar = this.zza;
            zzfiu zzfiuVar = zzfjcVar.zzb.zzb;
            zzedyVar.zzc().zzc(zzfiuVar.zzf);
            zzedyVar.zzc().zze(zzfiuVar.zzg);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzcsa implements zzgzl {
    final /* synthetic */ zzcsh zza;

    zzcsa(zzcsh zzcshVar) {
        Objects.requireNonNull(zzcshVar);
        this.zza = zzcshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcsh zzcshVar = this.zza;
        zzcshVar.zzu().zzb(zzcshVar.zzt().zzb(zzcshVar.zzr(), zzcshVar.zzs(), false, "", (String) obj, zzcshVar.zzs().zzc, null, null), true == com.google.android.gms.ads.internal.zzt.zzh().zzs(zzcshVar.zzq()) ? 2 : 1);
    }
}

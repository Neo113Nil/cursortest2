package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcps implements zzcyk {
    private final zzfdy zza;
    private final zzfeh zzb;
    private final zzfkw zzc;
    private final zzfla zzd;

    public zzcps(zzfeh zzfehVar, zzfla zzflaVar, zzfkw zzfkwVar) {
        this.zzb = zzfehVar;
        this.zzd = zzflaVar;
        this.zzc = zzfkwVar;
        this.zza = zzfehVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcyk
    public final void zzbG(com.google.android.gms.ads.internal.client.zze zzeVar) {
        List list = this.zza.zza;
        this.zzd.zzd(this.zzc.zzc(this.zzb, null, list));
    }
}

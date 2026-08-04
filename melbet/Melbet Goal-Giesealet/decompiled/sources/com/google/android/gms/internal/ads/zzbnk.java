package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbnk implements zzbzq {
    final /* synthetic */ zzbnj zza;

    zzbnk(zzbno zzbnoVar, zzbnj zzbnjVar) {
        this.zza = zzbnjVar;
        Objects.requireNonNull(zzbnoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Getting a new session for JS Engine.");
        this.zza.zzf(((zzbmk) obj).zzl());
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbsg implements zzcer {
    final /* synthetic */ zzbsf zza;

    zzbsg(zzbsk zzbskVar, zzbsf zzbsfVar) {
        this.zza = zzbsfVar;
        Objects.requireNonNull(zzbskVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcer
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Getting a new session for JS Engine.");
        this.zza.zzf(((zzbrg) obj).zzl());
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbsd implements zzcer {
    final /* synthetic */ zzbsf zza;

    zzbsd(zzbsf zzbsfVar) {
        Objects.requireNonNull(zzbsfVar);
        this.zza = zzbsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcer
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        this.zza.zzb().zzb();
    }
}

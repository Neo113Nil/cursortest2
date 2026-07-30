package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbxe extends zzbly {
    final /* synthetic */ zzbxf zza;

    /* synthetic */ zzbxe(zzbxf zzbxfVar, byte[] bArr) {
        Objects.requireNonNull(zzbxfVar);
        this.zza = zzbxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblz
    public final void zze(zzblm zzblmVar) {
        zzbxf zzbxfVar = this.zza;
        zzbxfVar.zzd().onCustomFormatAdLoaded(zzbxfVar.zzc(zzblmVar));
    }
}

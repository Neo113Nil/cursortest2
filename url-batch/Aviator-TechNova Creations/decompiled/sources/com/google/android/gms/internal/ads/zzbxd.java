package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbxd extends zzblv {
    final /* synthetic */ zzbxf zza;

    /* synthetic */ zzbxd(zzbxf zzbxfVar, byte[] bArr) {
        Objects.requireNonNull(zzbxfVar);
        this.zza = zzbxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zze(zzblm zzblmVar, String str) {
        zzbxf zzbxfVar = this.zza;
        if (zzbxfVar.zze() == null) {
            return;
        }
        zzbxfVar.zze().onCustomClick(zzbxfVar.zzc(zzblmVar), str);
    }
}

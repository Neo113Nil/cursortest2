package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbmq extends zzblv {
    final /* synthetic */ zzbms zza;

    /* synthetic */ zzbmq(zzbms zzbmsVar, byte[] bArr) {
        Objects.requireNonNull(zzbmsVar);
        this.zza = zzbmsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zze(zzblm zzblmVar, String str) {
        zzbms zzbmsVar = this.zza;
        if (zzbmsVar.zzd() == null) {
            return;
        }
        zzbmsVar.zzd().zzc(zzbmsVar.zze(zzblmVar), str);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzdlq implements zzgoq {
    final /* synthetic */ zzbzm zza;

    zzdlq(zzdmc zzdmcVar, zzbzm zzbzmVar) {
        this.zza = zzbzmVar;
        Objects.requireNonNull(zzdmcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcek zzcekVar = (zzcek) obj;
        if (zzcekVar == null) {
            this.zza.zzd(new zzeho(1, "Missing webview from video view future."));
            return;
        }
        final zzbzm zzbzmVar = this.zza;
        zzcekVar.zzab("/video", new zzccc(new zzccb() { // from class: com.google.android.gms.internal.ads.zzdlp
            @Override // com.google.android.gms.internal.ads.zzccb
            public final /* synthetic */ void zza(String str) {
                Bundle bundle = new Bundle();
                bundle.putString("mediaUrl", str);
                zzbzm.this.zzc(bundle);
            }
        }));
        zzcekVar.zzI();
    }
}

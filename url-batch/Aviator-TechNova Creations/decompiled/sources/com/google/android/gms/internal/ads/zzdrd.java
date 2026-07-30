package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzdrd implements zzgzl {
    final /* synthetic */ zzcen zza;

    zzdrd(zzdrp zzdrpVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzdrpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcjl zzcjlVar = (zzcjl) obj;
        if (zzcjlVar == null) {
            this.zza.zzd(new zzenv(1, "Missing webview from video view future."));
            return;
        }
        final zzcen zzcenVar = this.zza;
        zzcjlVar.zzab("/video", new zzchd(new zzchc() { // from class: com.google.android.gms.internal.ads.zzdrc
            @Override // com.google.android.gms.internal.ads.zzchc
            public final /* synthetic */ void zza(String str) {
                Bundle bundle = new Bundle();
                bundle.putString("mediaUrl", str);
                zzcen.this.zzc(bundle);
            }
        }));
        zzcjlVar.zzI();
    }
}

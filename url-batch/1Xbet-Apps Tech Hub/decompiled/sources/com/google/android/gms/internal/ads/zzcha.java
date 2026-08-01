package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcha implements zzgax {
    final /* synthetic */ List zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Uri zzc;
    final /* synthetic */ zzchc zzd;

    zzcha(zzchc zzchcVar, List list, String str, Uri uri) {
        this.zzd = zzchcVar;
        this.zza = list;
        this.zzb = str;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zza(Throwable th) {
        zzcbn.zzj("Failed to parse gmsg params for: ".concat(String.valueOf(String.valueOf(this.zzc))));
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list = this.zza;
        String str = this.zzb;
        this.zzd.zzP((Map) obj, list, str);
    }
}

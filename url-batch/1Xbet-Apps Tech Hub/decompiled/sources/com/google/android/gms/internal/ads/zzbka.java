package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbka implements zzbkd {
    zzbka() {
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgv zzcgvVar = (zzcgv) obj;
        if (map.keySet().contains("start")) {
            zzcgvVar.zzN().zzl();
        } else if (map.keySet().contains("stop")) {
            zzcgvVar.zzN().zzm();
        } else if (map.keySet().contains("cancel")) {
            zzcgvVar.zzN().zzk();
        }
    }
}

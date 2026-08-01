package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbkb implements zzbkd {
    zzbkb() {
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgv zzcgvVar = (zzcgv) obj;
        if (map.keySet().contains("start")) {
            zzcgvVar.zzas(true);
        }
        if (map.keySet().contains("stop")) {
            zzcgvVar.zzas(false);
        }
    }
}

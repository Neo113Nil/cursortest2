package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbnv implements zzboh {
    zzbnv() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        if (map.containsKey("start")) {
            zzcjlVar.zzas(true);
        }
        if (map.containsKey("stop")) {
            zzcjlVar.zzas(false);
        }
    }
}

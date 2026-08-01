package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbjz implements zzbkd {
    zzbjz() {
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgv zzcgvVar = (zzcgv) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcgvVar.zzbk();
        } else if ("resume".equals(str)) {
            zzcgvVar.zzbl();
        }
    }
}

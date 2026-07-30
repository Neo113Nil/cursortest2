package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbnt implements zzboh {
    zzbnt() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcjlVar.zzdk();
        } else if ("resume".equals(str)) {
            zzcjlVar.zzdl();
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbnd implements zzboh {
    zzbnd() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzd;
        zzcjl zzcjlVar = (zzcjl) obj;
        zzbkf zzar = zzcjlVar.zzar();
        if (zzar == null || (zzd = zzar.zzd()) == null) {
            zzcjlVar.zzd("nativeClickMetaReady", new JSONObject());
        } else {
            zzcjlVar.zzd("nativeClickMetaReady", zzd);
        }
    }
}

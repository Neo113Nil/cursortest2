package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbnc implements zzboh {
    zzbnc() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzc;
        zzcjl zzcjlVar = (zzcjl) obj;
        zzbkf zzar = zzcjlVar.zzar();
        if (zzar == null || (zzc = zzar.zzc()) == null) {
            zzcjlVar.zzd("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcjlVar.zzd("nativeAdViewSignalsReady", zzc);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbji implements zzbkd {
    zzbji() {
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcgv zzcgvVar = (zzcgv) obj;
        zzbfv zzK = zzcgvVar.zzK();
        if (zzK == null || (zza = zzK.zza()) == null) {
            zzcgvVar.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcgvVar.zze("nativeAdViewSignalsReady", zza);
        }
    }
}

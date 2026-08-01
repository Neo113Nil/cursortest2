package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbjj implements zzbkd {
    zzbjj() {
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzcgv zzcgvVar = (zzcgv) obj;
        zzbfv zzK = zzcgvVar.zzK();
        if (zzK == null || (zzb = zzK.zzb()) == null) {
            zzcgvVar.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcgvVar.zze("nativeClickMetaReady", zzb);
        }
    }
}

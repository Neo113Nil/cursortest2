package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbjq implements zzbkd {
    zzbjq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgv zzcgvVar = (zzcgv) obj;
        try {
            String str = (String) map.get("enabled");
            if (!zzftf.zzc("true", str) && !zzftf.zzc("false", str)) {
                return;
            }
            zzfra.zzi(zzcgvVar.getContext()).zzm(Boolean.parseBoolean(str));
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}

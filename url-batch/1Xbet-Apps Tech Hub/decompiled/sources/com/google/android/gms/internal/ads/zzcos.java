package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcos implements zzcof {
    zzcos() {
    }

    @Override // com.google.android.gms.internal.ads.zzcof
    public final void zza(Map map) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjJ)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzi().zzI(Boolean.parseBoolean(str));
    }
}

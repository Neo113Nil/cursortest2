package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcpd implements zzcof {
    private final zzdwn zza;

    zzcpd(zzdwn zzdwnVar) {
        this.zza = zzdwnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcof
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzn(str.equals("true"));
    }
}

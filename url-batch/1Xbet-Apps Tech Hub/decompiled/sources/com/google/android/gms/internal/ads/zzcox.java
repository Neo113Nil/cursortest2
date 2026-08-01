package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcox implements zzcof {
    private final zzfdt zza;

    public zzcox(zzfdt zzfdtVar) {
        this.zza = zzfdtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcof
    public final void zza(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zza.zzb(Boolean.parseBoolean(str));
        } catch (Exception e) {
            throw new IllegalStateException("Invalid render_in_browser state", e);
        }
    }
}

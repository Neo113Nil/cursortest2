package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzclm implements zzclg {
    private final zzdvi zza;

    zzclm(zzdvi zzdviVar) {
        this.zza = zzdviVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclg
    public final void zza(Map map) {
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                this.zza.zzm(zzdve.SHAKE);
                return;
            }
        } else if (str.equals("flick")) {
            this.zza.zzm(zzdve.FLICK);
            return;
        }
        this.zza.zzm(zzdve.NONE);
    }
}

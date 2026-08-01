package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcol implements zzcof {
    private final zzdwn zza;

    zzcol(zzdwn zzdwnVar) {
        this.zza = zzdwnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcof
    public final void zza(Map map) {
        char c;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("flick")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            this.zza.zzl(zzdwj.SHAKE);
        } else if (c != 1) {
            this.zza.zzl(zzdwj.NONE);
        } else {
            this.zza.zzl(zzdwj.FLICK);
        }
    }
}

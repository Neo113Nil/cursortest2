package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbjr implements zzbjl {
    private final Context zza;
    private final Map zzb;

    public zzbjr(Context context, Map map) {
        this.zza = context;
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        zzbxr zzD = com.google.android.gms.ads.internal.zzt.zzD();
        Context context = this.zza;
        if (zzD.zza(context)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int hashCode = str.hashCode();
            if (hashCode != 94399) {
                if (hashCode != 94401) {
                    if (hashCode == 94407 && str.equals("_ai")) {
                        com.google.android.gms.ads.internal.zzt.zzD().zzl(context, str2, (Map) this.zzb.get("_ai"));
                        return;
                    }
                } else if (str.equals("_ac")) {
                    com.google.android.gms.ads.internal.zzt.zzD().zzk(context, str2, (Map) this.zzb.get("_ac"));
                    return;
                }
            } else if (str.equals("_aa")) {
                com.google.android.gms.ads.internal.zzt.zzD().zzn(context, str2);
                return;
            }
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("logScionEvent gmsg contained unsupported eventName");
        }
    }
}

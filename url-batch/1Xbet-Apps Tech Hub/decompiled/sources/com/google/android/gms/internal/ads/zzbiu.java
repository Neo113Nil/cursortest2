package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbiu implements zzbkd {
    private final zzbiv zza;

    public zzbiu(zzbiv zzbivVar) {
        this.zza = zzbivVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            zzcbn.zzj("App event with no name parameter.");
        } else {
            this.zza.zzb(str, (String) map.get("info"));
        }
    }
}

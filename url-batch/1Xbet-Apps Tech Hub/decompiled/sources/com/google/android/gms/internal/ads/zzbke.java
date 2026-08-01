package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbke implements zzbkd {
    private final zzbkf zza;

    public zzbke(zzbkf zzbkfVar) {
        this.zza = zzbkfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgv zzcgvVar = (zzcgv) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            zzcbn.zzh("Fail to parse float", e);
        }
        this.zza.zzc(equals);
        this.zza.zzb(equals2, f);
        zzcgvVar.zzat(equals);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbjn implements zzbjl {
    private final zzbjo zza;

    public zzbjn(zzbjo zzbjoVar) {
        this.zza = zzbjoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to parse float", e);
        }
        zzbjo zzbjoVar = this.zza;
        zzbjoVar.zza(equals);
        zzbjoVar.zzb(equals2, f);
        zzcekVar.zzaE(equals);
    }
}

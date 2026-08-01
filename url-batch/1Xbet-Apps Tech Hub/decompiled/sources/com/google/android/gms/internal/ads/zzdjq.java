package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdjq implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;

    public zzdjq(zzhec zzhecVar, zzhec zzhecVar2) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcbt zza = ((zzcji) this.zza).zza();
        com.google.android.gms.ads.internal.zzt.zzp();
        return new zzavm(UUID.randomUUID().toString(), zza, "native", new JSONObject(), false, true);
    }
}

package com.google.android.gms.internal.ads;

import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzdxg implements zzhfc {
    public static zzdxg zza() {
        zzdxg zzdxgVar;
        zzdxgVar = zzdxf.zza;
        return zzdxgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzu.zzp();
        String uuid = UUID.randomUUID().toString();
        zzhfk.zzb(uuid);
        return uuid;
    }
}

package com.google.android.gms.internal.ads;

import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdyh implements zzhdp {
    public static zzdyh zza() {
        zzdyh zzdyhVar;
        zzdyhVar = zzdyg.zza;
        return zzdyhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzhdx.zzb(uuid);
        return uuid;
    }
}

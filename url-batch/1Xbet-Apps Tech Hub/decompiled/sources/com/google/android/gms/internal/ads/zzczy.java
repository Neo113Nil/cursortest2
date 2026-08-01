package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzczy implements zzhdp {
    private final zzhec zza;

    public zzczy(zzhec zzhecVar) {
        this.zza = zzhecVar;
    }

    public static zzczx zzc(Set set) {
        return new zzczx(set);
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzczx zzb() {
        return new zzczx(((zzhea) this.zza).zzb());
    }
}

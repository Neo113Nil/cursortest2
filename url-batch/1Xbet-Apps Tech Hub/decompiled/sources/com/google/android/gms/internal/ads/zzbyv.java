package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbyv implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;

    public zzbyv(zzhec zzhecVar, zzhec zzhecVar2) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbyu zzb() {
        return new zzbyu((Clock) this.zza.zzb(), (zzbys) this.zzb.zzb());
    }
}

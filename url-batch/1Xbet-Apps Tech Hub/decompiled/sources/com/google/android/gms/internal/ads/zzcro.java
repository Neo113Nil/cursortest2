package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcro implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;

    public zzcro(zzhec zzhecVar, zzhec zzhecVar2) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdaw zzb() {
        return new zzdaw((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb());
    }
}

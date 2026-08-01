package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfby implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;
    private final zzhec zzd;
    private final zzhec zze;
    private final zzhec zzf;

    public zzfby(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3, zzhec zzhecVar4, zzhec zzhecVar5, zzhec zzhecVar6) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
        this.zzd = zzhecVar4;
        this.zze = zzhecVar5;
        this.zzf = zzhecVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfbx((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (zzciq) this.zzc.zzb(), (zzenm) this.zzd.zzb(), (zzfcx) this.zze.zzb(), new zzfeo());
    }
}

package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcca;
import com.google.android.gms.internal.ads.zzdym;
import com.google.android.gms.internal.ads.zzgbl;
import com.google.android.gms.internal.ads.zzhdp;
import com.google.android.gms.internal.ads.zzhdx;
import com.google.android.gms.internal.ads.zzhec;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzal implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;

    public zzal(zzhec zzhecVar, zzhec zzhecVar2) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzak zzb() {
        zzgbl zzgblVar = zzcca.zza;
        zzhdx.zzb(zzgblVar);
        return new zzak(zzgblVar, ((zzdym) this.zzb).zzb());
    }
}

package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzcxm;
import com.google.android.gms.internal.ads.zzfio;
import com.google.android.gms.internal.ads.zzfiu;
import com.google.android.gms.internal.ads.zzhdp;
import com.google.android.gms.internal.ads.zzhec;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzai implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;

    public zzai(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzfiu) this.zza.zzb()).zzb(zzfio.GENERATE_SIGNALS, ((zzcxm) this.zzc).zzb().zzc()).zzf(((zzal) this.zzb).zzb()).zzi(((Integer) zzba.zzc().zza(zzbdc.zzfw)).intValue(), TimeUnit.SECONDS).zza();
    }
}

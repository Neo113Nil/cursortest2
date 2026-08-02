package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzfcf implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;
    private final zzhfu zzc;

    public zzfcf(zzhfu zzhfuVar, zzhfu zzhfuVar2, zzhfu zzhfuVar3) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
        this.zzc = zzhfuVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfcc zzb() {
        Context context = (Context) this.zza.zzb();
        zzfgq zzfgqVar = (zzfgq) this.zzb.zzb();
        zzfhi zzfhiVar = (zzfhi) this.zzc.zzb();
        zzbyy zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfG)).booleanValue() ? com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh() : com.google.android.gms.ads.internal.zzu.zzo().zzi().zzi();
        boolean z = false;
        if (zzh != null && zzh.zzh()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfI)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfF)).booleanValue() || z) {
                zzfhh zza = zzfhiVar.zza(zzfgy.Rewarded, context, zzfgqVar, new zzfbg(new zzfbd()));
                return new zzfbi(new zzfbs(new zzfbr()), new zzfbo(zza.zza, zzbzo.zza), zza.zzb, zza.zza.zza().zzf, zzbzo.zza);
            }
        }
        return new zzfbr();
    }
}

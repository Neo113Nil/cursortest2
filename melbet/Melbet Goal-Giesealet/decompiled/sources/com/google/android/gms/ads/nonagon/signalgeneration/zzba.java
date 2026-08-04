package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzhpx;
import com.google.android.gms.internal.ads.zzhqf;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzba implements zzhpx {
    private final zzay zza;

    private zzba(zzay zzayVar) {
        this.zza = zzayVar;
    }

    public static zzba zza(zzay zzayVar) {
        return new zzba(zzayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        String zzb = this.zza.zzb();
        zzhqf.zzb(zzb);
        return zzb;
    }
}

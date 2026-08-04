package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzeqd implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzeqd(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
    }

    public static zzeqd zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzeqd(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzeup zzb = ((zzemi) this.zza).zzb();
        zzeup zzeupVar = (zzepd) this.zzb.zzb();
        if (true == ((List) this.zzc.zzb()).contains("2")) {
            zzb = zzeupVar;
        }
        zzhqf.zzb(zzb);
        return zzb;
    }
}

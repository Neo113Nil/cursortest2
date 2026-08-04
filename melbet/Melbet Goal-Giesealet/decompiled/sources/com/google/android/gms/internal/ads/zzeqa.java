package com.google.android.gms.internal.ads;

import androidx.collection.SieveCacheKt;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzeqa implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzeqa(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar4;
    }

    public static zzeqa zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzeqa(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzepd(((zzete) this.zza).zzb(), SieveCacheKt.NodeLinkMask, (Clock) this.zzb.zzb(), zzfgc.zzc(), (zzdsm) this.zzc.zzb());
    }
}

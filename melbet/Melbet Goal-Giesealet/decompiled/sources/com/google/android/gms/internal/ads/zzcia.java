package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzcia implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzcia(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzcia zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzcia(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbup zzb() {
        Context zza = ((zzchd) this.zza).zza();
        zzfie zzfieVar = (zzfie) this.zzb.zzb();
        zzbod zza2 = com.google.android.gms.ads.internal.zzt.zzr().zza(zza, VersionInfoParcel.forPackage(), zzfieVar);
        zzbnx zzbnxVar = zzboa.zza;
        zza2.zza("google.afma.request.getAdDictionary", zzbnxVar, zzbnxVar);
        return new zzbur(zza, com.google.android.gms.ads.internal.zzt.zzr().zza(zza, VersionInfoParcel.forPackage(), zzfieVar).zza("google.afma.sdkConstants.getSdkConstants", zzbnxVar, zzbnxVar), VersionInfoParcel.forPackage());
    }
}

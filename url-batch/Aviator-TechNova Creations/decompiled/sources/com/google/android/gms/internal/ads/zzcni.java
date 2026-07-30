package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzcni implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcni(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcni zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzcni(zzikpVar, zzikpVar2, zzikpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbzn zzb() {
        Context zza = ((zzcmj) this.zza).zza();
        zzfor zzforVar = (zzfor) this.zzb.zzb();
        zzgzy zzc = zzfmk.zzc();
        zzbsz zza2 = com.google.android.gms.ads.internal.zzt.zzr().zza(zza, VersionInfoParcel.forPackage(), zzforVar);
        zzbst zzbstVar = zzbsw.zza;
        zza2.zza("google.afma.request.getAdDictionary", zzbstVar, zzbstVar);
        return new zzbzq(zza, com.google.android.gms.ads.internal.zzt.zzr().zza(zza, VersionInfoParcel.forPackage(), zzforVar).zza("google.afma.sdkConstants.getSdkConstants", zzbstVar, zzbstVar), VersionInfoParcel.forPackage(), zzc);
    }
}

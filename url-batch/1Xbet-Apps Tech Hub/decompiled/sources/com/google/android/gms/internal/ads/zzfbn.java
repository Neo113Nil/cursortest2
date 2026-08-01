package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfbn implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;

    public zzfbn(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfbl zzb() {
        Context context = (Context) this.zza.zzb();
        zzffz zzffzVar = (zzffz) this.zzb.zzb();
        zzfgr zzfgrVar = (zzfgr) this.zzc.zzb();
        zzcaq zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgq)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzo().zzi().zzh() : com.google.android.gms.ads.internal.zzt.zzo().zzi().zzi();
        boolean z = false;
        if (zzh != null && zzh.zzh()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgG)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgp)).booleanValue() || z) {
                zzfgq zza = zzfgrVar.zza(zzfgh.AppOpen, context, zzffzVar, new zzfap(new zzfam()));
                return new zzfar(new zzfbb(new zzfba()), new zzfax(zza.zza, zzcca.zza), zza.zzb, zza.zza.zza().zzf, zzcca.zza);
            }
        }
        return new zzfba();
    }
}

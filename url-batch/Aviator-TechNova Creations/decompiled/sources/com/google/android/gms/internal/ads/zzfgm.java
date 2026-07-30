package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfgm implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzfgm(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
    }

    public static zzfgm zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzfgm(zzikpVar, zzikpVar2, zzikpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfgj zzb() {
        zzfgj zzffzVar;
        Context context = (Context) this.zza.zzb();
        zzfkv zzfkvVar = (zzfkv) this.zzb.zzb();
        zzfln zzflnVar = (zzfln) this.zzc.zzb();
        zzcdp zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhk)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi() : com.google.android.gms.ads.internal.zzt.zzh().zzo().zzj();
        boolean z = false;
        if (zzi != null && zzi.zzi()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhm)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhj)).booleanValue() || z) {
                zzflm zza = zzflnVar.zza(zzfld.Rewarded, context, zzfkvVar, new zzffm(new zzffl()));
                zzfga zzfgaVar = new zzfga(new zzffz());
                zzfkz zzfkzVar = zza.zza;
                zzgzy zzgzyVar = zzcei.zza;
                zzffzVar = new zzffq(zzfgaVar, new zzffw(zzfkzVar, zzgzyVar), zza.zzb, zzfkzVar.zze().zzf, zzgzyVar);
                return zzffzVar;
            }
        }
        zzffzVar = new zzffz();
        return zzffzVar;
    }
}

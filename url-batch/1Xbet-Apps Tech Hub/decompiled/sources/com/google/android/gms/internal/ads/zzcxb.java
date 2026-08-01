package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcxb implements zzhdp {
    private final zzhec zza;
    private final zzhec zzb;
    private final zzhec zzc;

    public zzcxb(zzhec zzhecVar, zzhec zzhecVar2, zzhec zzhecVar3) {
        this.zza = zzhecVar;
        this.zzb = zzhecVar2;
        this.zzc = zzhecVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final zzcbt zza = ((zzcji) this.zzb).zza();
        final zzfeq zza2 = ((zzcxy) this.zzc).zza();
        return new zzftn() { // from class: com.google.android.gms.internal.ads.zzcxa
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                zzfdu zzfduVar = (zzfdu) obj;
                com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
                zzauVar.zzp(zzfduVar.zzC);
                zzauVar.zzq(zzfduVar.zzD.toString());
                zzauVar.zzo(zza.zza);
                zzauVar.zzn(zza2.zzf);
                return zzauVar;
            }
        };
    }
}

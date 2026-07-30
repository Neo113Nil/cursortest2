package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbgj;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdvy implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;

    private zzdvy(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
        this.zze = zzikpVar5;
    }

    public static zzdvy zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5) {
        return new zzdvy(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzcmj) this.zza).zza();
        final String zzb = ((zzedm) this.zzb).zzb();
        VersionInfoParcel zza2 = ((zzcna) this.zzc).zza();
        final zzbgj.zza.EnumC0011zza enumC0011zza = (zzbgj.zza.EnumC0011zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbgd zzbgdVar = new zzbgd(new zzbgi(zza));
        zzbgj.zzar.zza zzs = zzbgj.zzar.zzs();
        zzs.zzc(zza2.buddyApkVersion);
        zzs.zzg(zza2.clientJarVersion);
        zzs.zzk(true != zza2.isClientJar ? 2 : 0);
        final zzbgj.zzar zzbu = zzs.zzbu();
        zzbgdVar.zzb(new zzbgc() { // from class: com.google.android.gms.internal.ads.zzdvx
            @Override // com.google.android.gms.internal.ads.zzbgc
            public final /* synthetic */ void zza(zzbgj.zzt.zza zzaVar) {
                zzbgj.zza.zzb zzcc = zzaVar.zzY().zzcc();
                zzcc.zzc(zzbgj.zza.EnumC0011zza.this);
                zzaVar.zzaa(zzcc);
                zzbgj.zzm.zza zzcc2 = zzaVar.zzG().zzcc();
                zzcc2.zzd(zzb);
                zzcc2.zzs(zzbu);
                zzaVar.zzI(zzcc2);
                zzaVar.zzh(str);
            }
        });
        return zzbgdVar;
    }
}

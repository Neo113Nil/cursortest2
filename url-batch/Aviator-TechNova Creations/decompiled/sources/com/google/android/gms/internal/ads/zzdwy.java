package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdwy implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzdwy(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar4;
    }

    public static zzdwy zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzdwy(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String zza = ((zzfdh) this.zza).zza();
        Context zza2 = ((zzcmj) this.zzb).zza();
        zzgzy zzc = zzfmk.zzc();
        Map zzb = ((zzikk) this.zzc).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgd)).booleanValue()) {
            zzbgd zzbgdVar = new zzbgd(new zzbgi(zza2));
            zzbgdVar.zzb(new zzbgc() { // from class: com.google.android.gms.internal.ads.zzdwz
                @Override // com.google.android.gms.internal.ads.zzbgc
                public final /* synthetic */ void zza(zzbgj.zzt.zza zzaVar) {
                    zzaVar.zzh(zza);
                }
            });
            emptySet = Collections.singleton(new zzdje(new zzdxb(zzbgdVar, zzb), zzc));
        } else {
            emptySet = Collections.emptySet();
        }
        zziko.zzb(emptySet);
        return emptySet;
    }
}

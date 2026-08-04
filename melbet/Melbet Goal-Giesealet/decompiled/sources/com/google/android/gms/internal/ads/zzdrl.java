package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdrl implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzdrl(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar4;
    }

    public static zzdrl zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzdrl(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String zza = ((zzewz) this.zza).zza();
        Context zza2 = ((zzchd) this.zzb).zza();
        zzgpd zzc = zzfgc.zzc();
        Map zzb = ((zzhqb) this.zzc).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfD)).booleanValue()) {
            zzbbh zzbbhVar = new zzbbh(new zzbbm(zza2));
            zzbbhVar.zzb(new zzbbg() { // from class: com.google.android.gms.internal.ads.zzdrm
                @Override // com.google.android.gms.internal.ads.zzbbg
                public final /* synthetic */ void zza(zzbbn.zzt.zza zzaVar) {
                    zzaVar.zzh(zza);
                }
            });
            emptySet = Collections.singleton(new zzddr(new zzdro(zzbbhVar, zzb), zzc));
        } else {
            emptySet = Collections.emptySet();
        }
        zzhqf.zzb(emptySet);
        return emptySet;
    }
}

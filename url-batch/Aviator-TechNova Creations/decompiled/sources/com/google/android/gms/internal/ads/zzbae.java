package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbae implements zzfxb {
    private final zzfvj zza;
    private final zzfvx zzb;
    private final zzbar zzc;
    private final zzbad zzd;
    private final zzazn zze;
    private final zzbat zzf;
    private final zzbal zzg;
    private final zzbac zzh;

    zzbae(zzfvj zzfvjVar, zzfvx zzfvxVar, zzbar zzbarVar, zzbad zzbadVar, zzazn zzaznVar, zzbat zzbatVar, zzbal zzbalVar, zzbac zzbacVar) {
        this.zza = zzfvjVar;
        this.zzb = zzfvxVar;
        this.zzc = zzbarVar;
        this.zzd = zzbadVar;
        this.zze = zzaznVar;
        this.zzf = zzbatVar;
        this.zzg = zzbalVar;
        this.zzh = zzbacVar;
    }

    private final Map zzf() {
        HashMap hashMap = new HashMap();
        zzfvj zzfvjVar = this.zza;
        zzaxg zzb = this.zzb.zzb();
        hashMap.put("v", zzfvjVar.zza());
        hashMap.put("gms", Boolean.valueOf(zzfvjVar.zzc()));
        hashMap.put("gv", Long.valueOf(zzb.zzd()));
        hashMap.put("int", zzb.zzb());
        hashMap.put("attts", Long.valueOf(zzb.zzh().zzb()));
        hashMap.put("att", zzb.zzh().zzd());
        hashMap.put("attkid", zzb.zzh().zzc());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        zzbal zzbalVar = this.zzg;
        if (zzbalVar != null) {
            hashMap.put("tcq", Long.valueOf(zzbalVar.zze()));
            hashMap.put("tpq", Long.valueOf(zzbalVar.zzd()));
            hashMap.put("tcv", Long.valueOf(zzbalVar.zzf()));
            hashMap.put("tpv", Long.valueOf(zzbalVar.zzg()));
            hashMap.put("tchv", Long.valueOf(zzbalVar.zzi()));
            hashMap.put("tphv", Long.valueOf(zzbalVar.zzh()));
            hashMap.put("tcc", Long.valueOf(zzbalVar.zzj()));
            hashMap.put("tpc", Long.valueOf(zzbalVar.zzk()));
            zzazn zzaznVar = this.zze;
            if (zzaznVar != null) {
                hashMap.put("nt", Long.valueOf(zzaznVar.zzc()));
            }
            zzbat zzbatVar = this.zzf;
            if (zzbatVar != null) {
                hashMap.put("vs", Long.valueOf(zzbatVar.zzc()));
                hashMap.put("vf", Long.valueOf(zzbatVar.zzd()));
            }
        }
        return hashMap;
    }

    final void zza(View view) {
        this.zzc.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzb() {
        return zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzc() {
        zzbac zzbacVar = this.zzh;
        Map zzf = zzf();
        if (zzbacVar != null) {
            zzf.put("vst", zzbacVar.zzb());
        }
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zzd() {
        zzbar zzbarVar = this.zzc;
        Map zzf = zzf();
        zzf.put("lts", Long.valueOf(zzbarVar.zzc()));
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfxb
    public final Map zze() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", new Throwable());
        return hashMap;
    }
}

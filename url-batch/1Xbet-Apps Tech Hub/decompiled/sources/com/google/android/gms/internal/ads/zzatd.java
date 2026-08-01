package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzatd implements zzfps {
    private final zzfnv zza;
    private final zzfom zzb;
    private final zzatq zzc;
    private final zzatc zzd;
    private final zzasm zze;
    private final zzats zzf;
    private final zzatk zzg;
    private final zzatb zzh;

    zzatd(zzfnv zzfnvVar, zzfom zzfomVar, zzatq zzatqVar, zzatc zzatcVar, zzasm zzasmVar, zzats zzatsVar, zzatk zzatkVar, zzatb zzatbVar) {
        this.zza = zzfnvVar;
        this.zzb = zzfomVar;
        this.zzc = zzatqVar;
        this.zzd = zzatcVar;
        this.zze = zzasmVar;
        this.zzf = zzatsVar;
        this.zzg = zzatkVar;
        this.zzh = zzatbVar;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzfnv zzfnvVar = this.zza;
        zzaqd zzb = this.zzb.zzb();
        hashMap.put("v", zzfnvVar.zzb());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzc()));
        hashMap.put("int", zzb.zzh());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        zzatk zzatkVar = this.zzg;
        if (zzatkVar != null) {
            hashMap.put("tcq", Long.valueOf(zzatkVar.zzc()));
            hashMap.put("tpq", Long.valueOf(this.zzg.zzg()));
            hashMap.put("tcv", Long.valueOf(this.zzg.zzd()));
            hashMap.put("tpv", Long.valueOf(this.zzg.zzh()));
            hashMap.put("tchv", Long.valueOf(this.zzg.zzb()));
            hashMap.put("tphv", Long.valueOf(this.zzg.zzf()));
            hashMap.put("tcc", Long.valueOf(this.zzg.zza()));
            hashMap.put("tpc", Long.valueOf(this.zzg.zze()));
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzfps
    public final Map zza() {
        zzatq zzatqVar = this.zzc;
        Map zze = zze();
        zze.put("lts", Long.valueOf(zzatqVar.zza()));
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfps
    public final Map zzb() {
        Map zze = zze();
        zzaqd zza = this.zzb.zza();
        zze.put("gai", Boolean.valueOf(this.zza.zzd()));
        zze.put("did", zza.zzg());
        zze.put("dst", Integer.valueOf(zza.zzal() - 1));
        zze.put("doo", Boolean.valueOf(zza.zzai()));
        zzasm zzasmVar = this.zze;
        if (zzasmVar != null) {
            zze.put("nt", Long.valueOf(zzasmVar.zza()));
        }
        zzats zzatsVar = this.zzf;
        if (zzatsVar != null) {
            zze.put("vs", Long.valueOf(zzatsVar.zzc()));
            zze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfps
    public final Map zzc() {
        zzatb zzatbVar = this.zzh;
        Map zze = zze();
        if (zzatbVar != null) {
            zze.put("vst", zzatbVar.zza());
        }
        return zze;
    }

    final void zzd(View view) {
        this.zzc.zzd(view);
    }
}

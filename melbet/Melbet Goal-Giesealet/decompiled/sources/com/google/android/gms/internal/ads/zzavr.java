package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzavr implements zzfqb {
    private final zzfoj zza;
    private final zzfox zzb;
    private final zzawe zzc;
    private final zzavq zzd;
    private final zzava zze;
    private final zzawg zzf;
    private final zzavy zzg;
    private final zzavp zzh;

    zzavr(zzfoj zzfojVar, zzfox zzfoxVar, zzawe zzaweVar, zzavq zzavqVar, zzava zzavaVar, zzawg zzawgVar, zzavy zzavyVar, zzavp zzavpVar) {
        this.zza = zzfojVar;
        this.zzb = zzfoxVar;
        this.zzc = zzaweVar;
        this.zzd = zzavqVar;
        this.zze = zzavaVar;
        this.zzf = zzawgVar;
        this.zzg = zzavyVar;
        this.zzh = zzavpVar;
    }

    private final Map zzf() {
        HashMap hashMap = new HashMap();
        zzfoj zzfojVar = this.zza;
        zzast zzb = this.zzb.zzb();
        hashMap.put("v", zzfojVar.zza());
        hashMap.put("gms", Boolean.valueOf(zzfojVar.zzc()));
        hashMap.put("gv", Long.valueOf(zzb.zzc()));
        hashMap.put("int", zzb.zzb());
        hashMap.put("attts", Long.valueOf(zzb.zzg().zzb()));
        hashMap.put("att", zzb.zzg().zzd());
        hashMap.put("attkid", zzb.zzg().zzc());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        zzavy zzavyVar = this.zzg;
        if (zzavyVar != null) {
            hashMap.put("tcq", Long.valueOf(zzavyVar.zze()));
            hashMap.put("tpq", Long.valueOf(zzavyVar.zzd()));
            hashMap.put("tcv", Long.valueOf(zzavyVar.zzf()));
            hashMap.put("tpv", Long.valueOf(zzavyVar.zzg()));
            hashMap.put("tchv", Long.valueOf(zzavyVar.zzi()));
            hashMap.put("tphv", Long.valueOf(zzavyVar.zzh()));
            hashMap.put("tcc", Long.valueOf(zzavyVar.zzj()));
            hashMap.put("tpc", Long.valueOf(zzavyVar.zzk()));
            zzava zzavaVar = this.zze;
            if (zzavaVar != null) {
                hashMap.put("nt", Long.valueOf(zzavaVar.zzc()));
            }
            zzawg zzawgVar = this.zzf;
            if (zzawgVar != null) {
                hashMap.put("vs", Long.valueOf(zzawgVar.zzc()));
                hashMap.put("vf", Long.valueOf(zzawgVar.zzd()));
            }
        }
        return hashMap;
    }

    final void zza(View view) {
        this.zzc.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zzb() {
        return zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zzc() {
        zzavp zzavpVar = this.zzh;
        Map zzf = zzf();
        if (zzavpVar != null) {
            zzf.put("vst", zzavpVar.zzb());
        }
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zzd() {
        zzawe zzaweVar = this.zzc;
        Map zzf = zzf();
        zzf.put("lts", Long.valueOf(zzaweVar.zzc()));
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zze() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", new Throwable());
        return hashMap;
    }
}

package com.google.android.gms.internal.ads;

import android.util.Pair;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzwf extends zzyp {
    private final boolean zzb;
    private final zzbe zzc;
    private final zzbd zzd;
    private zzwd zze;
    private zzwc zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzwf(zzwm zzwmVar, boolean z) {
        super(zzwmVar);
        boolean z2;
        if (z) {
            zzwmVar.zzI();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        zzwmVar.zzH();
        this.zze = zzwd.zzp(zzwmVar.zzJ());
    }

    private final Object zzK(Object obj) {
        return (this.zze.zzs() == null || !obj.equals(zzwd.zzc)) ? obj : this.zze.zzs();
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final boolean zzL(long j) {
        zzwc zzwcVar = this.zzf;
        int zze = this.zze.zze(zzwcVar.zza.zza);
        if (zze == -1) {
            return false;
        }
        zzwd zzwdVar = this.zze;
        zzbd zzbdVar = this.zzd;
        zzwdVar.zzd(zze, zzbdVar, false);
        long j2 = zzbdVar.zzd;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzwcVar.zzo(j);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzA(zzak zzakVar) {
        if (this.zzi) {
            this.zze = this.zze.zzr(new zzyl(this.zze.zzb, zzakVar));
        } else {
            this.zze = zzwd.zzp(zzakVar);
        }
        this.zza.zzA(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final void zzB() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzv(null, ((zzyp) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzyp, com.google.android.gms.internal.ads.zzwm
    /* renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final zzwc zzG(zzwk zzwkVar, zzaan zzaanVar, long j) {
        zzwc zzwcVar = new zzwc(zzwkVar, zzaanVar, j);
        zzwcVar.zzr(this.zza);
        if (this.zzh) {
            zzwcVar.zzt(zzwkVar.zza(zzK(zzwkVar.zza)));
            return zzwcVar;
        }
        this.zzf = zzwcVar;
        if (!this.zzg) {
            this.zzg = true;
            zzv(null, ((zzyp) this).zza);
        }
        return zzwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyp, com.google.android.gms.internal.ads.zzwm
    public final void zzD(zzwi zzwiVar) {
        ((zzwc) zzwiVar).zzu();
        if (zzwiVar == this.zzf) {
            this.zzf = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r6 != 0) goto L20;
     */
    @Override // com.google.android.gms.internal.ads.zzyp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzE(zzbf zzbfVar) {
        long j;
        zzwk zzwkVar = null;
        if (this.zzh) {
            this.zze = this.zze.zzr(zzbfVar);
            zzwc zzwcVar = this.zzf;
            if (zzwcVar != null) {
                zzL(zzwcVar.zzq());
            }
        } else if (zzbfVar.zzg()) {
            this.zze = this.zzi ? this.zze.zzr(zzbfVar) : zzwd.zzq(zzbfVar, zzbe.zza, zzwd.zzc);
        } else {
            zzbe zzbeVar = this.zzc;
            zzbfVar.zzb(0, zzbeVar, 0L);
            Object obj = zzbeVar.zzb;
            zzwc zzwcVar2 = this.zzf;
            if (zzwcVar2 != null) {
                j = zzwcVar2.zza();
                this.zze.zzo(zzwcVar2.zza.zza, this.zzd);
                this.zze.zzb(0, zzbeVar, 0L);
            }
            j = 0;
            Pair zzm = zzbfVar.zzm(zzbeVar, this.zzd, 0, j);
            Object obj2 = zzm.first;
            long longValue = ((Long) zzm.second).longValue();
            this.zze = this.zzi ? this.zze.zzr(zzbfVar) : zzwd.zzq(zzbfVar, obj, obj2);
            zzwc zzwcVar3 = this.zzf;
            if (zzwcVar3 != null && zzL(longValue)) {
                zzwk zzwkVar2 = zzwcVar3.zza;
                zzwkVar = zzwkVar2.zza(zzK(zzwkVar2.zza));
            }
        }
        this.zzi = true;
        this.zzh = true;
        zze(this.zze);
        if (zzwkVar != null) {
            zzwc zzwcVar4 = this.zzf;
            zzwcVar4.getClass();
            zzwcVar4.zzt(zzwkVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    protected final zzwk zzF(zzwk zzwkVar) {
        Object zzs = this.zze.zzs();
        Object obj = zzwkVar.zza;
        if (zzs != null && this.zze.zzs().equals(obj)) {
            obj = zzwd.zzc;
        }
        return zzwkVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzvs, com.google.android.gms.internal.ads.zzvj
    public final void zzd() {
        this.zzh = false;
        this.zzg = false;
        super.zzd();
    }

    public final zzbf zzz() {
        return this.zze;
    }
}

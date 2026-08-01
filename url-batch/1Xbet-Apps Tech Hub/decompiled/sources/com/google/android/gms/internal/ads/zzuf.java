package com.google.android.gms.internal.ads;

import android.util.Pair;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzuf extends zzwn {
    private final boolean zzb;
    private final zzcz zzc;
    private final zzcx zzd;
    private zzud zze;
    private zzuc zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzuf(zzum zzumVar, boolean z) {
        super(zzumVar);
        boolean z2;
        if (z) {
            zzumVar.zzv();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzcz();
        this.zzd = new zzcx();
        zzumVar.zzM();
        this.zze = zzud.zzq(zzumVar.zzJ());
    }

    private final Object zzK(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.zze.zzf;
        if (obj2 == null || !obj.equals(zzud.zzd)) {
            return obj;
        }
        obj3 = this.zze.zzf;
        return obj3;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final void zzL(long j) {
        zzuc zzucVar = this.zzf;
        int zza = this.zze.zza(zzucVar.zza.zza);
        if (zza == -1) {
            return;
        }
        zzud zzudVar = this.zze;
        zzcx zzcxVar = this.zzd;
        zzudVar.zzd(zza, zzcxVar, false);
        long j2 = zzcxVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzucVar.zzs(j);
    }

    public final zzda zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    protected final zzuk zzD(zzuk zzukVar) {
        Object obj;
        Object obj2;
        obj = this.zze.zzf;
        Object obj3 = zzukVar.zza;
        if (obj != null) {
            obj2 = this.zze.zzf;
            if (obj2.equals(obj3)) {
                obj3 = zzud.zzd;
            }
        }
        return zzukVar.zza(obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    @Override // com.google.android.gms.internal.ads.zzwn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzE(zzda zzdaVar) {
        long j;
        zzuc zzucVar;
        zzuk zzukVar = null;
        if (this.zzh) {
            this.zze = this.zze.zzp(zzdaVar);
            zzuc zzucVar2 = this.zzf;
            if (zzucVar2 != null) {
                zzL(zzucVar2.zzn());
            }
        } else if (zzdaVar.zzo()) {
            this.zze = this.zzi ? this.zze.zzp(zzdaVar) : zzud.zzr(zzdaVar, zzcz.zza, zzud.zzd);
        } else {
            zzdaVar.zze(0, this.zzc, 0L);
            Object obj = this.zzc.zzc;
            zzuc zzucVar3 = this.zzf;
            if (zzucVar3 != null) {
                long zzq = zzucVar3.zzq();
                this.zze.zzn(zzucVar3.zza.zza, this.zzd);
                this.zze.zze(0, this.zzc, 0L);
                if (zzq != 0) {
                    j = zzq;
                    Pair zzl = zzdaVar.zzl(this.zzc, this.zzd, 0, j);
                    Object obj2 = zzl.first;
                    long longValue = ((Long) zzl.second).longValue();
                    this.zze = !this.zzi ? this.zze.zzp(zzdaVar) : zzud.zzr(zzdaVar, obj, obj2);
                    zzucVar = this.zzf;
                    if (zzucVar != null) {
                        zzL(longValue);
                        zzuk zzukVar2 = zzucVar.zza;
                        zzukVar = zzukVar2.zza(zzK(zzukVar2.zza));
                    }
                }
            }
            j = 0;
            Pair zzl2 = zzdaVar.zzl(this.zzc, this.zzd, 0, j);
            Object obj22 = zzl2.first;
            long longValue2 = ((Long) zzl2.second).longValue();
            this.zze = !this.zzi ? this.zze.zzp(zzdaVar) : zzud.zzr(zzdaVar, obj, obj22);
            zzucVar = this.zzf;
            if (zzucVar != null) {
            }
        }
        this.zzi = true;
        this.zzh = true;
        zzo(this.zze);
        if (zzukVar != null) {
            zzuc zzucVar4 = this.zzf;
            zzucVar4.getClass();
            zzucVar4.zzr(zzukVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final void zzF() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzB(null, ((zzwn) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzwn, com.google.android.gms.internal.ads.zzum
    public final void zzG(zzui zzuiVar) {
        ((zzuc) zzuiVar).zzt();
        if (zzuiVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwn, com.google.android.gms.internal.ads.zzum
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final zzuc zzI(zzuk zzukVar, zzyn zzynVar, long j) {
        zzuc zzucVar = new zzuc(zzukVar, zzynVar, j);
        zzucVar.zzu(this.zza);
        if (this.zzh) {
            zzucVar.zzr(zzukVar.zza(zzK(zzukVar.zza)));
        } else {
            this.zzf = zzucVar;
            if (!this.zzg) {
                this.zzg = true;
                zzB(null, ((zzwn) this).zza);
            }
        }
        return zzucVar;
    }

    @Override // com.google.android.gms.internal.ads.zztt, com.google.android.gms.internal.ads.zztl
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zztl, com.google.android.gms.internal.ads.zzum
    public final void zzt(zzbs zzbsVar) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzwj(this.zze.zzc, zzbsVar));
        } else {
            this.zze = zzud.zzq(zzbsVar);
        }
        this.zza.zzt(zzbsVar);
    }

    @Override // com.google.android.gms.internal.ads.zztt, com.google.android.gms.internal.ads.zzum
    public final void zzz() {
    }
}

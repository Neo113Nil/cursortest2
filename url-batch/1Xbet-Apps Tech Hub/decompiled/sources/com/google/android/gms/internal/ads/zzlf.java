package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzlf {
    private final zzcx zza = new zzcx();
    private final zzcz zzb = new zzcz();
    private final zzmj zzc;
    private final zzeq zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzlc zzh;
    private zzlc zzi;
    private zzlc zzj;
    private int zzk;
    private Object zzl;
    private long zzm;

    public zzlf(zzmj zzmjVar, zzeq zzeqVar) {
        this.zzc = zzmjVar;
        this.zzd = zzeqVar;
    }

    private final boolean zzA(zzda zzdaVar, zzuk zzukVar) {
        if (zzC(zzukVar)) {
            return zzdaVar.zze(zzdaVar.zzn(zzukVar.zza, this.zza).zzd, this.zzb, 0L).zzq == zzdaVar.zza(zzukVar.zza);
        }
        return false;
    }

    private final boolean zzB(zzda zzdaVar) {
        zzlc zzlcVar = this.zzh;
        if (zzlcVar == null) {
            return true;
        }
        int zza = zzdaVar.zza(zzlcVar.zzb);
        while (true) {
            zza = zzdaVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzlcVar.getClass();
                if (zzlcVar.zzg() == null || zzlcVar.zzf.zzg) {
                    break;
                }
                zzlcVar = zzlcVar.zzg();
            }
            zzlc zzg = zzlcVar.zzg();
            if (zza == -1 || zzg == null || zzdaVar.zza(zzg.zzb) != zza) {
                break;
            }
            zzlcVar = zzg;
        }
        boolean zzm = zzm(zzlcVar);
        zzlcVar.zzf = zzg(zzdaVar, zzlcVar.zzf);
        return !zzm;
    }

    private static final boolean zzC(zzuk zzukVar) {
        return !zzukVar.zzb() && zzukVar.zze == -1;
    }

    private final long zzs(zzda zzdaVar, Object obj, int i) {
        zzdaVar.zzn(obj, this.zza);
        this.zza.zzi(i);
        this.zza.zzk(i);
        return 0L;
    }

    private final zzld zzt(zzda zzdaVar, zzlc zzlcVar, long j) {
        long j2;
        zzld zzldVar = zzlcVar.zzf;
        long zze = (zzlcVar.zze() + zzldVar.zze) - j;
        if (zzldVar.zzg) {
            long j3 = 0;
            int zzi = zzdaVar.zzi(zzdaVar.zza(zzldVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi != -1) {
                int i = zzdaVar.zzd(zzi, this.zza, true).zzd;
                Object obj = this.zza.zzc;
                obj.getClass();
                long j4 = zzldVar.zza.zzd;
                if (zzdaVar.zze(i, this.zzb, 0L).zzp == zzi) {
                    Pair zzm = zzdaVar.zzm(this.zzb, this.zza, i, -9223372036854775807L, Math.max(0L, zze));
                    if (zzm != null) {
                        obj = zzm.first;
                        long longValue = ((Long) zzm.second).longValue();
                        zzlc zzg = zzlcVar.zzg();
                        if (zzg == null || !zzg.zzb.equals(obj)) {
                            j4 = this.zze;
                            this.zze = 1 + j4;
                        } else {
                            j4 = zzg.zzf.zza.zzd;
                        }
                        j2 = longValue;
                        j3 = -9223372036854775807L;
                    }
                } else {
                    j2 = 0;
                }
                zzuk zzx = zzx(zzdaVar, obj, j2, j4, this.zzb, this.zza);
                if (j3 != -9223372036854775807L && zzldVar.zzc != -9223372036854775807L) {
                    zzdaVar.zzn(zzldVar.zza.zza, this.zza).zzb();
                    this.zza.zzg();
                }
                return zzu(zzdaVar, zzx, j3, j2);
            }
        } else {
            zzuk zzukVar = zzldVar.zza;
            zzdaVar.zzn(zzukVar.zza, this.zza);
            if (!zzukVar.zzb()) {
                int i2 = zzukVar.zze;
                if (i2 != -1) {
                    this.zza.zzm(i2);
                }
                zzcx zzcxVar = this.zza;
                int i3 = zzukVar.zze;
                int zze2 = zzcxVar.zze(i3);
                zzcxVar.zzn(i3);
                if (zze2 != this.zza.zza(zzukVar.zze)) {
                    return zzv(zzdaVar, zzukVar.zza, zzukVar.zze, zze2, zzldVar.zze, zzukVar.zzd);
                }
                zzs(zzdaVar, zzukVar.zza, zzukVar.zze);
                return zzw(zzdaVar, zzukVar.zza, 0L, zzldVar.zze, zzukVar.zzd);
            }
            int i4 = zzukVar.zzb;
            if (this.zza.zza(i4) != -1) {
                int zzf = this.zza.zzf(i4, zzukVar.zzc);
                if (zzf < 0) {
                    return zzv(zzdaVar, zzukVar.zza, i4, zzf, zzldVar.zzc, zzukVar.zzd);
                }
                long j5 = zzldVar.zzc;
                if (j5 == -9223372036854775807L) {
                    zzcz zzczVar = this.zzb;
                    zzcx zzcxVar2 = this.zza;
                    Pair zzm2 = zzdaVar.zzm(zzczVar, zzcxVar2, zzcxVar2.zzd, -9223372036854775807L, Math.max(0L, zze));
                    if (zzm2 != null) {
                        j5 = ((Long) zzm2.second).longValue();
                    }
                }
                zzs(zzdaVar, zzukVar.zza, zzukVar.zzb);
                return zzw(zzdaVar, zzukVar.zza, Math.max(0L, j5), zzldVar.zzc, zzukVar.zzd);
            }
        }
        return null;
    }

    private final zzld zzu(zzda zzdaVar, zzuk zzukVar, long j, long j2) {
        zzdaVar.zzn(zzukVar.zza, this.zza);
        return zzukVar.zzb() ? zzv(zzdaVar, zzukVar.zza, zzukVar.zzb, zzukVar.zzc, j, zzukVar.zzd) : zzw(zzdaVar, zzukVar.zza, j2, j, zzukVar.zzd);
    }

    private final zzld zzv(zzda zzdaVar, Object obj, int i, int i2, long j, long j2) {
        zzuk zzukVar = new zzuk(obj, i, i2, j2);
        long zzh = zzdaVar.zzn(zzukVar.zza, this.zza).zzh(zzukVar.zzb, zzukVar.zzc);
        if (i2 == this.zza.zze(i)) {
            this.zza.zzj();
        }
        this.zza.zzn(zzukVar.zzb);
        return new zzld(zzukVar, (zzh == -9223372036854775807L || zzh > 0) ? 0L : Math.max(0L, (-1) + zzh), j, -9223372036854775807L, zzh, false, false, false, false);
    }

    private final zzld zzw(zzda zzdaVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long j7 = j;
        zzdaVar.zzn(obj, this.zza);
        int zzc = this.zza.zzc(j7);
        if (zzc != -1) {
            this.zza.zzm(zzc);
        }
        if (zzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzn(zzc);
        }
        zzuk zzukVar = new zzuk(obj, j3, zzc);
        boolean zzC = zzC(zzukVar);
        boolean zzA = zzA(zzdaVar, zzukVar);
        boolean zzz = zzz(zzdaVar, zzukVar, zzC);
        if (zzc != -1) {
            this.zza.zzn(zzc);
        }
        if (zzc != -1) {
            this.zza.zzi(zzc);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j5 = 0;
            j6 = 0;
        } else {
            j5 = j4;
            j6 = this.zza.zze;
        }
        if (j6 != -9223372036854775807L && j7 >= j6) {
            j7 = Math.max(0L, j6 - 1);
        }
        return new zzld(zzukVar, j7, j2, j5, j6, false, zzC, zzA, zzz);
    }

    private static zzuk zzx(zzda zzdaVar, Object obj, long j, long j2, zzcz zzczVar, zzcx zzcxVar) {
        zzdaVar.zzn(obj, zzcxVar);
        zzdaVar.zze(zzcxVar.zzd, zzczVar, 0L);
        zzdaVar.zza(obj);
        zzcxVar.zzb();
        zzdaVar.zzn(obj, zzcxVar);
        int zzd = zzcxVar.zzd(j);
        return zzd == -1 ? new zzuk(obj, j2, zzcxVar.zzc(j)) : new zzuk(obj, zzd, zzcxVar.zze(zzd), j2);
    }

    private final void zzy() {
        final zzfwr zzfwrVar = new zzfwr();
        for (zzlc zzlcVar = this.zzh; zzlcVar != null; zzlcVar = zzlcVar.zzg()) {
            zzfwrVar.zzf(zzlcVar.zzf.zza);
        }
        zzlc zzlcVar2 = this.zzi;
        final zzuk zzukVar = zzlcVar2 == null ? null : zzlcVar2.zzf.zza;
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzle
            @Override // java.lang.Runnable
            public final void run() {
                zzlf.this.zzj(zzfwrVar, zzukVar);
            }
        });
    }

    private final boolean zzz(zzda zzdaVar, zzuk zzukVar, boolean z) {
        int zza = zzdaVar.zza(zzukVar.zza);
        return !zzdaVar.zze(zzdaVar.zzd(zza, this.zza, false).zzd, this.zzb, 0L).zzj && zzdaVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z;
    }

    public final zzlc zza() {
        zzlc zzlcVar = this.zzh;
        if (zzlcVar == null) {
            return null;
        }
        if (zzlcVar == this.zzi) {
            this.zzi = zzlcVar.zzg();
        }
        zzlcVar.zzn();
        int i = this.zzk - 1;
        this.zzk = i;
        if (i == 0) {
            this.zzj = null;
            zzlc zzlcVar2 = this.zzh;
            this.zzl = zzlcVar2.zzb;
            this.zzm = zzlcVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzlc zzb() {
        zzlc zzlcVar = this.zzi;
        zzef.zzb(zzlcVar);
        this.zzi = zzlcVar.zzg();
        zzy();
        zzlc zzlcVar2 = this.zzi;
        zzef.zzb(zzlcVar2);
        return zzlcVar2;
    }

    public final zzlc zzc() {
        return this.zzj;
    }

    public final zzlc zzd() {
        return this.zzh;
    }

    public final zzlc zze() {
        return this.zzi;
    }

    public final zzld zzf(long j, zzls zzlsVar) {
        zzlc zzlcVar = this.zzj;
        return zzlcVar == null ? zzu(zzlsVar.zza, zzlsVar.zzb, zzlsVar.zzc, zzlsVar.zzr) : zzt(zzlsVar.zza, zzlcVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzld zzg(zzda zzdaVar, zzld zzldVar) {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        zzuk zzukVar = zzldVar.zza;
        boolean zzC = zzC(zzukVar);
        boolean zzA = zzA(zzdaVar, zzukVar);
        boolean zzz = zzz(zzdaVar, zzukVar, zzC);
        zzdaVar.zzn(zzldVar.zza.zza, this.zza);
        if (zzukVar.zzb() || (i = zzukVar.zze) == -1) {
            j = -9223372036854775807L;
        } else {
            this.zza.zzi(i);
            j = 0;
        }
        if (zzukVar.zzb()) {
            j2 = this.zza.zzh(zzukVar.zzb, zzukVar.zzc);
        } else {
            if (j != -9223372036854775807L) {
                j3 = 0;
                j4 = 0;
                if (zzukVar.zzb()) {
                    int i2 = zzukVar.zze;
                    if (i2 != -1) {
                        this.zza.zzn(i2);
                    }
                } else {
                    this.zza.zzn(zzukVar.zzb);
                }
                return new zzld(zzukVar, zzldVar.zzb, zzldVar.zzc, j3, j4, false, zzC, zzA, zzz);
            }
            j2 = this.zza.zze;
        }
        j3 = j;
        j4 = j2;
        if (zzukVar.zzb()) {
        }
        return new zzld(zzukVar, zzldVar.zzb, zzldVar.zzc, j3, j4, false, zzC, zzA, zzz);
    }

    public final zzuk zzh(zzda zzdaVar, Object obj, long j) {
        long j2;
        int zza;
        int i = zzdaVar.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 == null || (zza = zzdaVar.zza(obj2)) == -1 || zzdaVar.zzd(zza, this.zza, false).zzd != i) {
            zzlc zzlcVar = this.zzh;
            while (true) {
                if (zzlcVar == null) {
                    zzlc zzlcVar2 = this.zzh;
                    while (true) {
                        if (zzlcVar2 != null) {
                            int zza2 = zzdaVar.zza(zzlcVar2.zzb);
                            if (zza2 != -1 && zzdaVar.zzd(zza2, this.zza, false).zzd == i) {
                                j2 = zzlcVar2.zzf.zza.zzd;
                                break;
                            }
                            zzlcVar2 = zzlcVar2.zzg();
                        } else {
                            j2 = this.zze;
                            this.zze = 1 + j2;
                            if (this.zzh == null) {
                                this.zzl = obj;
                                this.zzm = j2;
                            }
                        }
                    }
                } else {
                    if (zzlcVar.zzb.equals(obj)) {
                        j2 = zzlcVar.zzf.zza.zzd;
                        break;
                    }
                    zzlcVar = zzlcVar.zzg();
                }
            }
        } else {
            j2 = this.zzm;
        }
        long j3 = j2;
        zzdaVar.zzn(obj, this.zza);
        zzdaVar.zze(this.zza.zzd, this.zzb, 0L);
        int zza3 = zzdaVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzcz zzczVar = this.zzb;
            if (zza3 < zzczVar.zzp) {
                return zzx(zzdaVar, obj3, j, j3, zzczVar, this.zza);
            }
            zzdaVar.zzd(zza3, this.zza, true);
            this.zza.zzb();
            zzcx zzcxVar = this.zza;
            if (zzcxVar.zzd(zzcxVar.zze) != -1) {
                obj3 = this.zza.zzc;
                obj3.getClass();
            }
            zza3--;
        }
    }

    public final void zzi() {
        if (this.zzk == 0) {
            return;
        }
        zzlc zzlcVar = this.zzh;
        zzef.zzb(zzlcVar);
        this.zzl = zzlcVar.zzb;
        this.zzm = zzlcVar.zzf.zza.zzd;
        while (zzlcVar != null) {
            zzlcVar.zzn();
            zzlcVar = zzlcVar.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzy();
    }

    final /* synthetic */ void zzj(zzfwr zzfwrVar, zzuk zzukVar) {
        this.zzc.zzS(zzfwrVar.zzi(), zzukVar);
    }

    public final void zzk(long j) {
        zzlc zzlcVar = this.zzj;
        if (zzlcVar != null) {
            zzlcVar.zzm(j);
        }
    }

    public final boolean zzl(zzui zzuiVar) {
        zzlc zzlcVar = this.zzj;
        return zzlcVar != null && zzlcVar.zza == zzuiVar;
    }

    public final boolean zzm(zzlc zzlcVar) {
        zzef.zzb(zzlcVar);
        boolean z = false;
        if (zzlcVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzlcVar;
        while (zzlcVar.zzg() != null) {
            zzlcVar = zzlcVar.zzg();
            zzlcVar.getClass();
            if (zzlcVar == this.zzi) {
                this.zzi = this.zzh;
                z = true;
            }
            zzlcVar.zzn();
            this.zzk--;
        }
        zzlc zzlcVar2 = this.zzj;
        zzlcVar2.getClass();
        zzlcVar2.zzo(null);
        zzy();
        return z;
    }

    public final boolean zzn() {
        zzlc zzlcVar = this.zzj;
        if (zzlcVar == null) {
            return true;
        }
        if (zzlcVar.zzf.zzi || !zzlcVar.zzr() || this.zzj.zzf.zze == -9223372036854775807L) {
            return false;
        }
        return this.zzk < 100;
    }

    public final boolean zzo(zzda zzdaVar, long j, long j2) {
        zzld zzldVar;
        boolean z;
        zzlc zzlcVar = null;
        for (zzlc zzlcVar2 = this.zzh; zzlcVar2 != null; zzlcVar2 = zzlcVar2.zzg()) {
            zzld zzldVar2 = zzlcVar2.zzf;
            if (zzlcVar == null) {
                zzldVar = zzg(zzdaVar, zzldVar2);
            } else {
                zzld zzt = zzt(zzdaVar, zzlcVar, j);
                if (zzt == null) {
                    return !zzm(zzlcVar);
                }
                if (zzldVar2.zzb != zzt.zzb || !zzldVar2.zza.equals(zzt.zza)) {
                    return !zzm(zzlcVar);
                }
                zzldVar = zzt;
            }
            zzlcVar2.zzf = zzldVar.zza(zzldVar2.zzc);
            long j3 = zzldVar2.zze;
            long j4 = zzldVar.zze;
            if (j3 != -9223372036854775807L && j3 != j4) {
                zzlcVar2.zzq();
                long j5 = zzldVar.zze;
                long zze = j5 == -9223372036854775807L ? Long.MAX_VALUE : j5 + zzlcVar2.zze();
                if (zzlcVar2 == this.zzi) {
                    boolean z2 = zzlcVar2.zzf.zzf;
                    if (j2 == Long.MIN_VALUE || j2 >= zze) {
                        z = true;
                        return zzm(zzlcVar2) && !z;
                    }
                }
                z = false;
                if (zzm(zzlcVar2)) {
                }
            }
            zzlcVar = zzlcVar2;
        }
        return true;
    }

    public final boolean zzp(zzda zzdaVar, int i) {
        this.zzf = i;
        return zzB(zzdaVar);
    }

    public final boolean zzq(zzda zzdaVar, boolean z) {
        this.zzg = z;
        return zzB(zzdaVar);
    }

    public final zzlc zzr(zzmb[] zzmbVarArr, zzye zzyeVar, zzyn zzynVar, zzlr zzlrVar, zzld zzldVar, zzyf zzyfVar) {
        zzlc zzlcVar = this.zzj;
        zzlc zzlcVar2 = new zzlc(zzmbVarArr, zzlcVar == null ? 1000000000000L : (zzlcVar.zze() + zzlcVar.zzf.zze) - zzldVar.zzb, zzyeVar, zzynVar, zzlrVar, zzldVar, zzyfVar);
        zzlc zzlcVar3 = this.zzj;
        if (zzlcVar3 != null) {
            zzlcVar3.zzo(zzlcVar2);
        } else {
            this.zzh = zzlcVar2;
            this.zzi = zzlcVar2;
        }
        this.zzl = null;
        this.zzj = zzlcVar2;
        this.zzk++;
        zzy();
        return zzlcVar2;
    }
}

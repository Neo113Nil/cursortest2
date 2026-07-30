package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzlq {
    private final zzmx zzc;
    private final zzdx zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjg zzh;
    private zzln zzi;
    private zzln zzj;
    private zzln zzk;
    private zzln zzl;
    private zzln zzm;
    private int zzn;
    private Object zzo;
    private long zzp;
    private final zzky zzr;
    private final zzbd zza = new zzbd();
    private final zzbe zzb = new zzbe();
    private List zzq = new ArrayList();

    public zzlq(zzmx zzmxVar, zzdx zzdxVar, zzky zzkyVar, zzjg zzjgVar) {
        this.zzc = zzmxVar;
        this.zzd = zzdxVar;
        this.zzr = zzkyVar;
        this.zzh = zzjgVar;
    }

    private static zzwk zzA(zzbf zzbfVar, Object obj, long j, long j2, zzbe zzbeVar, zzbd zzbdVar) {
        zzbfVar.zzo(obj, zzbdVar);
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzbfVar.zze(obj);
        zzbdVar.zzb();
        zzbfVar.zzo(obj, zzbdVar);
        int zze = zzbdVar.zze(j);
        return zze == -1 ? new zzwk(obj, j2, zzbdVar.zzf(j)) : new zzwk(obj, zze, zzbdVar.zzd(zze), j2);
    }

    private final void zzB() {
        int i = zzguf.zzd;
        final zzguc zzgucVar = new zzguc();
        for (zzln zzlnVar = this.zzi; zzlnVar != null; zzlnVar = zzlnVar.zzp()) {
            zzgucVar.zzf(zzlnVar.zzg.zza);
        }
        zzln zzlnVar2 = this.zzj;
        final zzwk zzwkVar = zzlnVar2 == null ? null : zzlnVar2.zzg.zza;
        this.zzd.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzlq.this.zzz(zzgucVar, zzwkVar);
            }
        });
    }

    private final long zzC(Object obj) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzln zzlnVar = (zzln) this.zzq.get(i);
            if (zzlnVar.zzb.equals(obj)) {
                return zzlnVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final int zzD(zzbf zzbfVar) {
        zzbf zzbfVar2;
        zzln zzlnVar = this.zzi;
        if (zzlnVar == null) {
            return 0;
        }
        int zze = zzbfVar.zze(zzlnVar.zzb);
        while (true) {
            zzbfVar2 = zzbfVar;
            zze = zzbfVar2.zzl(zze, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzlnVar.getClass();
                if (zzlnVar.zzp() == null || zzlnVar.zzg.zzh) {
                    break;
                }
                zzlnVar = zzlnVar.zzp();
            }
            zzln zzp = zzlnVar.zzp();
            if (zze == -1 || zzp == null || zzbfVar2.zze(zzp.zzb) != zze) {
                break;
            }
            zzlnVar = zzp;
            zzbfVar = zzbfVar2;
        }
        int zzs = zzs(zzlnVar);
        zzlnVar.zzg = zzx(zzbfVar2, zzlnVar.zzg);
        return zzs;
    }

    private final zzlo zzE(zzbf zzbfVar, zzln zzlnVar, long j) {
        zzbf zzbfVar2;
        long j2;
        zzbf zzbfVar3;
        zzbd zzbdVar;
        zzbe zzbeVar;
        Object obj;
        long j3;
        long j4;
        long j5;
        zzlo zzloVar = zzlnVar.zzg;
        long zza = zzlnVar.zza();
        long j6 = zzloVar.zze;
        long j7 = (zza + j6) - j;
        if (!zzloVar.zzh) {
            zzwk zzwkVar = zzloVar.zza;
            Object obj2 = zzwkVar.zza;
            zzbd zzbdVar2 = this.zza;
            zzbfVar.zzo(obj2, zzbdVar2);
            boolean z = zzloVar.zzg;
            if (!zzwkVar.zzb()) {
                int i = zzwkVar.zze;
                if (i != -1) {
                    zzbdVar2.zzi(i);
                }
                int zzd = zzbdVar2.zzd(i);
                zzbdVar2.zzk(i);
                if (zzd != zzbdVar2.zzg(i)) {
                    return zzG(zzbfVar, obj2, i, zzd, j6, zzwkVar.zzd, false);
                }
                zzK(zzbfVar, obj2, i);
                return zzH(zzbfVar, obj2, 0L, j6, zzwkVar.zzd, false);
            }
            int i2 = zzwkVar.zzb;
            if (zzbdVar2.zzg(i2) == -1) {
                return null;
            }
            int zza2 = zzbdVar2.zzg.zza(i2).zza(zzwkVar.zzc);
            if (zza2 < 0) {
                return zzG(zzbfVar, obj2, i2, zza2, zzloVar.zzc, zzwkVar.zzd, false);
            }
            long j8 = zzloVar.zzc;
            if (j8 == -9223372036854775807L) {
                Pair zzn = zzbfVar.zzn(this.zzb, zzbdVar2, zzbdVar2.zzc, -9223372036854775807L, Math.max(0L, j7));
                zzbfVar2 = zzbfVar;
                if (zzn == null) {
                    return null;
                }
                j8 = ((Long) zzn.second).longValue();
                j2 = -9223372036854775807L;
            } else {
                zzbfVar2 = zzbfVar;
                j2 = j8;
            }
            zzK(zzbfVar2, obj2, i2);
            return zzH(zzbfVar2, obj2, Math.max(0L, j8), j2, zzwkVar.zzd, false);
        }
        zzwk zzwkVar2 = zzloVar.zza;
        Object obj3 = zzwkVar2.zza;
        int zze = zzbfVar.zze(obj3);
        int i3 = this.zzf;
        boolean z2 = this.zzg;
        zzbe zzbeVar2 = this.zzb;
        zzbd zzbdVar3 = this.zza;
        long j9 = 0;
        int zzl = zzbfVar.zzl(zze, zzbdVar3, zzbeVar2, i3, z2);
        if (zzl == -1) {
            return null;
        }
        int i4 = zzbfVar.zzd(zzl, zzbdVar3, true).zzc;
        Object obj4 = zzbdVar3.zzb;
        obj4.getClass();
        long j10 = zzwkVar2.zzd;
        if (zzbfVar.zzb(i4, zzbeVar2, 0L).zzn == zzl) {
            Pair zzn2 = zzbfVar.zzn(zzbeVar2, zzbdVar3, i4, -9223372036854775807L, Math.max(0L, j7));
            if (zzn2 == null) {
                return null;
            }
            Object obj5 = zzn2.first;
            long longValue = ((Long) zzn2.second).longValue();
            zzln zzp = zzlnVar.zzp();
            if (zzp == null || !zzp.zzb.equals(obj5)) {
                long zzC = zzC(obj5);
                if (zzC == -1) {
                    zzC = this.zze;
                    this.zze = 1 + zzC;
                }
                j5 = zzC;
            } else {
                j5 = zzp.zzg.zza.zzd;
            }
            zzbfVar3 = zzbfVar;
            zzbeVar = zzbeVar2;
            zzbdVar = zzbdVar3;
            j3 = longValue;
            obj = obj5;
            j4 = j5;
            j9 = -9223372036854775807L;
        } else {
            zzbfVar3 = zzbfVar;
            zzbdVar = zzbdVar3;
            zzbeVar = zzbeVar2;
            obj = obj4;
            j3 = 0;
            j4 = j10;
        }
        zzwk zzA = zzA(zzbfVar3, obj, j3, j4, zzbeVar, zzbdVar);
        long j11 = j3;
        zzbd zzbdVar4 = zzbdVar;
        if (j9 != -9223372036854775807L && zzloVar.zzc != -9223372036854775807L) {
            zzbfVar3.zzo(obj3, zzbdVar4).zzb();
            int i5 = zzbdVar4.zzg.zzd;
        }
        return zzF(zzbfVar3, zzA, j9, j11);
    }

    private final zzlo zzF(zzbf zzbfVar, zzwk zzwkVar, long j, long j2) {
        Object obj = zzwkVar.zza;
        zzbfVar.zzo(obj, this.zza);
        return zzwkVar.zzb() ? zzG(zzbfVar, obj, zzwkVar.zzb, zzwkVar.zzc, j, zzwkVar.zzd, false) : zzH(zzbfVar, obj, j2, j, zzwkVar.zzd, false);
    }

    private final zzlo zzG(zzbf zzbfVar, Object obj, int i, int i2, long j, long j2, boolean z) {
        zzwk zzwkVar = new zzwk(obj, i, i2, j2);
        Object obj2 = zzwkVar.zza;
        int i3 = zzwkVar.zzb;
        int i4 = zzwkVar.zzc;
        zzbd zzbdVar = this.zza;
        long zzh = zzbfVar.zzo(obj2, zzbdVar).zzh(i3, i4);
        if (i2 == zzbdVar.zzd(i)) {
            zzbdVar.zzj();
        }
        zzbdVar.zzk(i3);
        long j3 = 0;
        if (zzh != -9223372036854775807L && zzh <= 0) {
            j3 = Math.max(0L, (-1) + zzh);
        }
        return new zzlo(zzwkVar, j3, j, -9223372036854775807L, zzh, false, false, false, false, false);
    }

    private final zzlo zzH(zzbf zzbfVar, Object obj, long j, long j2, long j3, boolean z) {
        long j4;
        long j5;
        long j6;
        long j7 = j;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        int zzf = zzbdVar.zzf(j7);
        if (zzf == -1) {
            zzbdVar.zzb();
        } else {
            zzbdVar.zzk(zzf);
        }
        zzwk zzwkVar = new zzwk(obj, j3, zzf);
        boolean zzL = zzL(zzwkVar);
        boolean zzI = zzI(zzbfVar, zzwkVar);
        boolean zzJ = zzJ(zzbfVar, zzwkVar, zzL);
        if (zzf != -1) {
            zzbdVar.zzk(zzf);
        }
        if (zzf != -1) {
            zzbdVar.zzi(zzf);
        }
        if (zzf != -1) {
            zzbdVar.zzc(zzf);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = zzbdVar.zzd;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && j7 >= j5) {
            j7 = Math.max(0L, j5 - 1);
        }
        return new zzlo(zzwkVar, j7, j2, j6, j5, false, false, zzL, zzI, zzJ);
    }

    private final boolean zzI(zzbf zzbfVar, zzwk zzwkVar) {
        if (!zzL(zzwkVar)) {
            return false;
        }
        Object obj = zzwkVar.zza;
        return zzbfVar.zzb(zzbfVar.zzo(obj, this.zza).zzc, this.zzb, 0L).zzo == zzbfVar.zze(obj);
    }

    private final boolean zzJ(zzbf zzbfVar, zzwk zzwkVar, boolean z) {
        int zze = zzbfVar.zze(zzwkVar.zza);
        zzbd zzbdVar = this.zza;
        int i = zzbfVar.zzd(zze, zzbdVar, false).zzc;
        zzbe zzbeVar = this.zzb;
        return !zzbfVar.zzb(i, zzbeVar, 0L).zzi && zzbfVar.zzl(zze, zzbdVar, zzbeVar, this.zzf, this.zzg) == -1 && z;
    }

    private final long zzK(zzbf zzbfVar, Object obj, int i) {
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        zzbdVar.zzc(i);
        long j = zzbdVar.zzg.zza(i).zzi;
        return 0L;
    }

    private static final boolean zzL(zzwk zzwkVar) {
        return !zzwkVar.zzb() && zzwkVar.zze == -1;
    }

    public final int zza(zzbf zzbfVar, int i) {
        this.zzf = i;
        return zzD(zzbfVar);
    }

    public final int zzb(zzbf zzbfVar, boolean z) {
        this.zzg = z;
        return zzD(zzbfVar);
    }

    public final void zzc(zzbf zzbfVar, zzjg zzjgVar) {
        this.zzh = zzjgVar;
        long j = zzjgVar.zzb;
        zzj();
    }

    public final boolean zzd(zzwi zzwiVar) {
        zzln zzlnVar = this.zzl;
        return zzlnVar != null && zzlnVar.zza == zzwiVar;
    }

    public final boolean zze(zzwi zzwiVar) {
        zzln zzlnVar = this.zzm;
        return zzlnVar != null && zzlnVar.zza == zzwiVar;
    }

    public final void zzf(long j) {
        zzln zzlnVar = this.zzl;
        if (zzlnVar != null) {
            zzlnVar.zzi(j);
        }
    }

    public final boolean zzg() {
        zzln zzlnVar = this.zzl;
        if (zzlnVar != null) {
            return !zzlnVar.zzg.zzj && zzlnVar.zzd() && this.zzl.zzg.zze != -9223372036854775807L && this.zzn < 100;
        }
        return true;
    }

    public final zzlo zzh(long j, zzmd zzmdVar) {
        zzln zzlnVar = this.zzl;
        return zzlnVar == null ? zzF(zzmdVar.zza, zzmdVar.zzb, zzmdVar.zzc, zzmdVar.zzs) : zzE(zzmdVar.zza, zzlnVar, j);
    }

    public final void zzj() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.zzq.size(); i++) {
            ((zzln) this.zzq.get(i)).zzn();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    public final zzln zzk() {
        return this.zzl;
    }

    public final zzln zzl() {
        return this.zzm;
    }

    public final zzln zzm() {
        return this.zzi;
    }

    public final zzln zzn() {
        return this.zzj;
    }

    public final zzln zzo() {
        return this.zzk;
    }

    public final zzln zzp() {
        zzln zzlnVar = this.zzk;
        zzln zzlnVar2 = this.zzj;
        if (zzlnVar == zzlnVar2) {
            zzlnVar2.getClass();
            this.zzk = zzlnVar2.zzp();
        }
        zzlnVar2.getClass();
        this.zzj = zzlnVar2.zzp();
        zzB();
        zzln zzlnVar3 = this.zzj;
        zzlnVar3.getClass();
        return zzlnVar3;
    }

    public final zzln zzq() {
        zzln zzlnVar = this.zzk;
        zzlnVar.getClass();
        this.zzk = zzlnVar.zzp();
        zzB();
        zzln zzlnVar2 = this.zzk;
        zzlnVar2.getClass();
        return zzlnVar2;
    }

    public final zzln zzr() {
        zzln zzlnVar = this.zzi;
        if (zzlnVar == null) {
            return null;
        }
        if (zzlnVar == this.zzj) {
            this.zzj = zzlnVar.zzp();
        }
        if (zzlnVar == this.zzk) {
            this.zzk = zzlnVar.zzp();
        }
        zzlnVar.zzn();
        int i = this.zzn - 1;
        this.zzn = i;
        if (i == 0) {
            this.zzl = null;
            zzln zzlnVar2 = this.zzi;
            this.zzo = zzlnVar2.zzb;
            this.zzp = zzlnVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzp();
        zzB();
        return this.zzi;
    }

    public final void zzt() {
        zzln zzlnVar = this.zzm;
        if (zzlnVar == null || zzlnVar.zze()) {
            this.zzm = null;
            for (int i = 0; i < this.zzq.size(); i++) {
                zzln zzlnVar2 = (zzln) this.zzq.get(i);
                if (!zzlnVar2.zze()) {
                    this.zzm = zzlnVar2;
                    return;
                }
            }
        }
    }

    public final zzln zzu(zzwi zzwiVar) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzln zzlnVar = (zzln) this.zzq.get(i);
            if (zzlnVar.zza == zzwiVar) {
                return zzlnVar;
            }
        }
        return null;
    }

    public final void zzv() {
        if (this.zzn == 0) {
            return;
        }
        zzln zzlnVar = this.zzi;
        zzlnVar.getClass();
        this.zzo = zzlnVar.zzb;
        this.zzp = zzlnVar.zzg.zza.zzd;
        while (zzlnVar != null) {
            zzlnVar.zzn();
            zzlnVar = zzlnVar.zzp();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzB();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a5, code lost:
    
        return zzs(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzw(zzbf zzbfVar, long j, long j2, long j3) {
        zzlo zzloVar;
        boolean z;
        int zzs;
        zzln zzlnVar = this.zzi;
        zzln zzlnVar2 = null;
        while (true) {
            int i = 0;
            if (zzlnVar == null) {
                return 0;
            }
            zzlo zzloVar2 = zzlnVar.zzg;
            if (zzlnVar2 == null) {
                zzloVar = zzx(zzbfVar, zzloVar2);
            } else {
                zzlo zzE = zzE(zzbfVar, zzlnVar2, j);
                if (zzE == null || zzloVar2.zzb != zzE.zzb || !zzloVar2.zza.equals(zzE.zza)) {
                    break;
                }
                zzloVar = zzE;
            }
            zzlnVar.zzg = zzloVar.zzb(zzloVar2.zzc);
            long j4 = zzloVar2.zze;
            long j5 = zzloVar.zze;
            if (j4 != j5) {
                zzlnVar.zzs();
                long zza = j5 == -9223372036854775807L ? Long.MAX_VALUE : j5 + zzlnVar.zza();
                if (zzlnVar == this.zzj) {
                    boolean z2 = zzlnVar.zzg.zzg;
                    if (j2 == Long.MIN_VALUE || j2 >= zza) {
                        z = true;
                        boolean z3 = zzlnVar != this.zzk && (j3 == Long.MIN_VALUE || j3 >= zza);
                        zzs = zzs(zzlnVar);
                        if (zzs == 0) {
                            return zzs;
                        }
                        if (j4 == -9223372036854775807L) {
                            long j6 = zzloVar2.zzd;
                            j4 = -9223372036854775807L;
                        }
                        if (z && j4 != -9223372036854775807L) {
                            i = 1;
                        }
                        return z3 ? i | 2 : i;
                    }
                }
                z = false;
                if (zzlnVar != this.zzk) {
                }
                zzs = zzs(zzlnVar);
                if (zzs == 0) {
                }
            } else {
                zzlnVar2 = zzlnVar;
                zzlnVar = zzlnVar.zzp();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzlo zzx(zzbf zzbfVar, zzlo zzloVar) {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        zzwk zzwkVar = zzloVar.zza;
        boolean zzL = zzL(zzwkVar);
        boolean zzI = zzI(zzbfVar, zzwkVar);
        boolean zzJ = zzJ(zzbfVar, zzwkVar, zzL);
        Object obj = zzwkVar.zza;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        if (zzwkVar.zzb() || (i = zzwkVar.zze) == -1) {
            j = -9223372036854775807L;
        } else {
            zzbdVar.zzc(i);
            j = 0;
        }
        if (zzwkVar.zzb()) {
            j2 = zzbdVar.zzh(zzwkVar.zzb, zzwkVar.zzc);
        } else {
            if (j != -9223372036854775807L) {
                j3 = 0;
                j4 = 0;
                if (zzwkVar.zzb()) {
                    int i2 = zzwkVar.zze;
                    if (i2 != -1) {
                        zzbdVar.zzk(i2);
                    }
                } else {
                    zzbdVar.zzk(zzwkVar.zzb);
                }
                long j5 = zzloVar.zzb;
                long j6 = zzloVar.zzc;
                boolean z = zzloVar.zzf;
                return new zzlo(zzwkVar, j5, j6, j4, j3, false, false, zzL, zzI, zzJ);
            }
            j2 = zzbdVar.zzd;
        }
        j3 = j2;
        j4 = j;
        if (zzwkVar.zzb()) {
        }
        long j52 = zzloVar.zzb;
        long j62 = zzloVar.zzc;
        boolean z2 = zzloVar.zzf;
        return new zzlo(zzwkVar, j52, j62, j4, j3, false, false, zzL, zzI, zzJ);
    }

    public final zzwk zzy(zzbf zzbfVar, Object obj, long j) {
        long zzC;
        int zze;
        zzbd zzbdVar = this.zza;
        int i = zzbfVar.zzo(obj, zzbdVar).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (zze = zzbfVar.zze(obj2)) == -1 || zzbfVar.zzd(zze, zzbdVar, false).zzc != i) {
            zzln zzlnVar = this.zzi;
            while (true) {
                if (zzlnVar == null) {
                    zzln zzlnVar2 = this.zzi;
                    while (true) {
                        if (zzlnVar2 != null) {
                            int zze2 = zzbfVar.zze(zzlnVar2.zzb);
                            if (zze2 != -1 && zzbfVar.zzd(zze2, zzbdVar, false).zzc == i) {
                                zzC = zzlnVar2.zzg.zza.zzd;
                                break;
                            }
                            zzlnVar2 = zzlnVar2.zzp();
                        } else {
                            zzC = zzC(obj);
                            if (zzC == -1) {
                                zzC = this.zze;
                                this.zze = 1 + zzC;
                                if (this.zzi == null) {
                                    this.zzo = obj;
                                    this.zzp = zzC;
                                }
                            }
                        }
                    }
                } else {
                    if (zzlnVar.zzb.equals(obj)) {
                        zzC = zzlnVar.zzg.zza.zzd;
                        break;
                    }
                    zzlnVar = zzlnVar.zzp();
                }
            }
        } else {
            zzC = this.zzp;
        }
        long j2 = zzC;
        zzbfVar.zzo(obj, zzbdVar);
        int i2 = zzbdVar.zzc;
        zzbe zzbeVar = this.zzb;
        zzbfVar.zzb(i2, zzbeVar, 0L);
        Object obj3 = obj;
        for (int zze3 = zzbfVar.zze(obj); zze3 >= zzbeVar.zzn; zze3--) {
            zzbfVar.zzd(zze3, zzbdVar, true);
            zzbdVar.zzb();
            if (zzbdVar.zze(zzbdVar.zzd) != -1) {
                Object obj4 = zzbdVar.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzA(zzbfVar, obj3, j, j2, zzbeVar, zzbdVar);
    }

    final /* synthetic */ void zzz(zzguc zzgucVar, zzwk zzwkVar) {
        this.zzc.zzz(zzgucVar.zzi(), zzwkVar);
    }

    public final zzln zzi(zzlo zzloVar) {
        zzln zzlnVar;
        zzln zzlnVar2 = this.zzl;
        long zza = zzlnVar2 == null ? 1000000000000L : (zzlnVar2.zza() + zzlnVar2.zzg.zze) - zzloVar.zzb;
        int i = 0;
        while (true) {
            if (i >= this.zzq.size()) {
                zzlnVar = null;
                break;
            }
            zzlo zzloVar2 = ((zzln) this.zzq.get(i)).zzg;
            long j = zzloVar2.zze;
            long j2 = zzloVar.zze;
            if ((j == -9223372036854775807L || j == j2) && zzloVar2.zzb == zzloVar.zzb && zzloVar2.zza.equals(zzloVar.zza)) {
                zzlnVar = (zzln) this.zzq.remove(i);
                break;
            }
            i++;
        }
        if (zzlnVar == null) {
            zzlnVar = this.zzr.zza(zzloVar, zza);
        } else {
            zzlnVar.zzg = zzloVar;
            zzlnVar.zzb(zza);
        }
        zzln zzlnVar3 = this.zzl;
        if (zzlnVar3 != null) {
            zzlnVar3.zzo(zzlnVar);
        } else {
            this.zzi = zzlnVar;
            this.zzj = zzlnVar;
            this.zzk = zzlnVar;
        }
        this.zzo = null;
        this.zzl = zzlnVar;
        this.zzn++;
        zzB();
        return zzlnVar;
    }

    public final int zzs(zzln zzlnVar) {
        zzlnVar.getClass();
        int i = 0;
        if (zzlnVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzlnVar;
        while (zzlnVar.zzp() != null) {
            zzlnVar = zzlnVar.zzp();
            zzlnVar.getClass();
            if (zzlnVar == this.zzj) {
                zzln zzlnVar2 = this.zzi;
                this.zzj = zzlnVar2;
                this.zzk = zzlnVar2;
                i = 3;
            }
            if (zzlnVar == this.zzk) {
                this.zzk = this.zzj;
                i |= 2;
            }
            zzlnVar.zzn();
            this.zzn--;
        }
        zzln zzlnVar3 = this.zzl;
        zzlnVar3.getClass();
        zzlnVar3.zzo(null);
        zzB();
        return i;
    }
}

package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzkq {
    private final zzmd zzc;
    private final zzdl zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzij zzh;
    private zzkn zzi;
    private zzkn zzj;
    private zzkn zzk;
    private zzkn zzl;
    private zzkn zzm;
    private int zzn;
    private Object zzo;
    private long zzp;
    private final zzjy zzr;
    private final zzbc zza = new zzbc();
    private final zzbd zzb = new zzbd();
    private List zzq = new ArrayList();

    public zzkq(zzmd zzmdVar, zzdl zzdlVar, zzjy zzjyVar, zzij zzijVar) {
        this.zzc = zzmdVar;
        this.zzd = zzdlVar;
        this.zzr = zzjyVar;
        this.zzh = zzijVar;
    }

    private static zzup zzA(zzbe zzbeVar, Object obj, long j, long j2, zzbd zzbdVar, zzbc zzbcVar) {
        zzbeVar.zzo(obj, zzbcVar);
        zzbeVar.zzb(zzbcVar.zzc, zzbdVar, 0L);
        zzbeVar.zze(obj);
        zzbcVar.zzb();
        zzbeVar.zzo(obj, zzbcVar);
        int zze = zzbcVar.zze(j);
        return zze == -1 ? new zzup(obj, j2, zzbcVar.zzf(j)) : new zzup(obj, zze, zzbcVar.zzd(zze), j2);
    }

    private final void zzB() {
        int i = zzgjz.zzd;
        final zzgjw zzgjwVar = new zzgjw();
        for (zzkn zzknVar = this.zzi; zzknVar != null; zzknVar = zzknVar.zzp()) {
            zzgjwVar.zzf(zzknVar.zzg.zza);
        }
        zzkn zzknVar2 = this.zzj;
        final zzup zzupVar = zzknVar2 == null ? null : zzknVar2.zzg.zza;
        this.zzd.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzkq.this.zzz(zzgjwVar, zzupVar);
            }
        });
    }

    private final long zzC(Object obj) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzkn zzknVar = (zzkn) this.zzq.get(i);
            if (zzknVar.zzb.equals(obj)) {
                return zzknVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final int zzD(zzbe zzbeVar) {
        zzbe zzbeVar2;
        zzkn zzknVar = this.zzi;
        if (zzknVar == null) {
            return 0;
        }
        int zze = zzbeVar.zze(zzknVar.zzb);
        while (true) {
            zzbeVar2 = zzbeVar;
            zze = zzbeVar2.zzl(zze, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzknVar.getClass();
                if (zzknVar.zzp() == null || zzknVar.zzg.zzh) {
                    break;
                }
                zzknVar = zzknVar.zzp();
            }
            zzkn zzp = zzknVar.zzp();
            if (zze == -1 || zzp == null || zzbeVar2.zze(zzp.zzb) != zze) {
                break;
            }
            zzknVar = zzp;
            zzbeVar = zzbeVar2;
        }
        int zzs = zzs(zzknVar);
        zzknVar.zzg = zzx(zzbeVar2, zzknVar.zzg);
        return zzs;
    }

    private final zzko zzE(zzbe zzbeVar, zzkn zzknVar, long j) {
        zzbe zzbeVar2;
        long j2;
        zzbe zzbeVar3;
        zzbc zzbcVar;
        zzbd zzbdVar;
        Object obj;
        long j3;
        long j4;
        long j5;
        zzko zzkoVar = zzknVar.zzg;
        long zza = zzknVar.zza();
        long j6 = zzkoVar.zze;
        long j7 = (zza + j6) - j;
        if (!zzkoVar.zzh) {
            zzup zzupVar = zzkoVar.zza;
            Object obj2 = zzupVar.zza;
            zzbc zzbcVar2 = this.zza;
            zzbeVar.zzo(obj2, zzbcVar2);
            boolean z = zzkoVar.zzg;
            if (!zzupVar.zzb()) {
                int i = zzupVar.zze;
                if (i != -1) {
                    zzbcVar2.zzi(i);
                }
                int zzd = zzbcVar2.zzd(i);
                zzbcVar2.zzk(i);
                if (zzd != zzbcVar2.zzg(i)) {
                    return zzG(zzbeVar, obj2, i, zzd, j6, zzupVar.zzd, false);
                }
                zzK(zzbeVar, obj2, i);
                return zzH(zzbeVar, obj2, 0L, j6, zzupVar.zzd, false);
            }
            int i2 = zzupVar.zzb;
            if (zzbcVar2.zzg(i2) == -1) {
                return null;
            }
            int zza2 = zzbcVar2.zzg.zza(i2).zza(zzupVar.zzc);
            if (zza2 < 0) {
                return zzG(zzbeVar, obj2, i2, zza2, zzkoVar.zzc, zzupVar.zzd, false);
            }
            long j8 = zzkoVar.zzc;
            if (j8 == -9223372036854775807L) {
                Pair zzn = zzbeVar.zzn(this.zzb, zzbcVar2, zzbcVar2.zzc, -9223372036854775807L, Math.max(0L, j7));
                zzbeVar2 = zzbeVar;
                if (zzn == null) {
                    return null;
                }
                j8 = ((Long) zzn.second).longValue();
                j2 = -9223372036854775807L;
            } else {
                zzbeVar2 = zzbeVar;
                j2 = j8;
            }
            zzK(zzbeVar2, obj2, i2);
            return zzH(zzbeVar2, obj2, Math.max(0L, j8), j2, zzupVar.zzd, false);
        }
        zzup zzupVar2 = zzkoVar.zza;
        Object obj3 = zzupVar2.zza;
        int zze = zzbeVar.zze(obj3);
        int i3 = this.zzf;
        boolean z2 = this.zzg;
        zzbd zzbdVar2 = this.zzb;
        zzbc zzbcVar3 = this.zza;
        long j9 = 0;
        int zzl = zzbeVar.zzl(zze, zzbcVar3, zzbdVar2, i3, z2);
        if (zzl == -1) {
            return null;
        }
        int i4 = zzbeVar.zzd(zzl, zzbcVar3, true).zzc;
        Object obj4 = zzbcVar3.zzb;
        obj4.getClass();
        long j10 = zzupVar2.zzd;
        if (zzbeVar.zzb(i4, zzbdVar2, 0L).zzn == zzl) {
            Pair zzn2 = zzbeVar.zzn(zzbdVar2, zzbcVar3, i4, -9223372036854775807L, Math.max(0L, j7));
            if (zzn2 == null) {
                return null;
            }
            Object obj5 = zzn2.first;
            long longValue = ((Long) zzn2.second).longValue();
            zzkn zzp = zzknVar.zzp();
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
            zzbeVar3 = zzbeVar;
            zzbdVar = zzbdVar2;
            zzbcVar = zzbcVar3;
            j3 = longValue;
            obj = obj5;
            j4 = j5;
            j9 = -9223372036854775807L;
        } else {
            zzbeVar3 = zzbeVar;
            zzbcVar = zzbcVar3;
            zzbdVar = zzbdVar2;
            obj = obj4;
            j3 = 0;
            j4 = j10;
        }
        zzup zzA = zzA(zzbeVar3, obj, j3, j4, zzbdVar, zzbcVar);
        long j11 = j3;
        zzbc zzbcVar4 = zzbcVar;
        if (j9 != -9223372036854775807L && zzkoVar.zzc != -9223372036854775807L) {
            zzbeVar3.zzo(obj3, zzbcVar4).zzb();
            int i5 = zzbcVar4.zzg.zzd;
        }
        return zzF(zzbeVar3, zzA, j9, j11);
    }

    private final zzko zzF(zzbe zzbeVar, zzup zzupVar, long j, long j2) {
        Object obj = zzupVar.zza;
        zzbeVar.zzo(obj, this.zza);
        return zzupVar.zzb() ? zzG(zzbeVar, obj, zzupVar.zzb, zzupVar.zzc, j, zzupVar.zzd, false) : zzH(zzbeVar, obj, j2, j, zzupVar.zzd, false);
    }

    private final zzko zzG(zzbe zzbeVar, Object obj, int i, int i2, long j, long j2, boolean z) {
        zzup zzupVar = new zzup(obj, i, i2, j2);
        Object obj2 = zzupVar.zza;
        int i3 = zzupVar.zzb;
        int i4 = zzupVar.zzc;
        zzbc zzbcVar = this.zza;
        long zzh = zzbeVar.zzo(obj2, zzbcVar).zzh(i3, i4);
        if (i2 == zzbcVar.zzd(i)) {
            zzbcVar.zzj();
        }
        zzbcVar.zzk(i3);
        long j3 = 0;
        if (zzh != -9223372036854775807L && zzh <= 0) {
            j3 = Math.max(0L, (-1) + zzh);
        }
        return new zzko(zzupVar, j3, j, -9223372036854775807L, zzh, false, false, false, false, false);
    }

    private final zzko zzH(zzbe zzbeVar, Object obj, long j, long j2, long j3, boolean z) {
        long j4;
        long j5;
        long j6;
        long j7 = j;
        zzbc zzbcVar = this.zza;
        zzbeVar.zzo(obj, zzbcVar);
        int zzf = zzbcVar.zzf(j7);
        if (zzf == -1) {
            zzbcVar.zzb();
        } else {
            zzbcVar.zzk(zzf);
        }
        zzup zzupVar = new zzup(obj, j3, zzf);
        boolean zzL = zzL(zzupVar);
        boolean zzI = zzI(zzbeVar, zzupVar);
        boolean zzJ = zzJ(zzbeVar, zzupVar, zzL);
        if (zzf != -1) {
            zzbcVar.zzk(zzf);
        }
        if (zzf != -1) {
            zzbcVar.zzi(zzf);
        }
        if (zzf != -1) {
            zzbcVar.zzc(zzf);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = zzbcVar.zzd;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && j7 >= j5) {
            j7 = Math.max(0L, j5 - 1);
        }
        return new zzko(zzupVar, j7, j2, j6, j5, false, false, zzL, zzI, zzJ);
    }

    private final boolean zzI(zzbe zzbeVar, zzup zzupVar) {
        if (!zzL(zzupVar)) {
            return false;
        }
        Object obj = zzupVar.zza;
        return zzbeVar.zzb(zzbeVar.zzo(obj, this.zza).zzc, this.zzb, 0L).zzo == zzbeVar.zze(obj);
    }

    private final boolean zzJ(zzbe zzbeVar, zzup zzupVar, boolean z) {
        int zze = zzbeVar.zze(zzupVar.zza);
        zzbc zzbcVar = this.zza;
        int i = zzbeVar.zzd(zze, zzbcVar, false).zzc;
        zzbd zzbdVar = this.zzb;
        return !zzbeVar.zzb(i, zzbdVar, 0L).zzi && zzbeVar.zzl(zze, zzbcVar, zzbdVar, this.zzf, this.zzg) == -1 && z;
    }

    private final long zzK(zzbe zzbeVar, Object obj, int i) {
        zzbc zzbcVar = this.zza;
        zzbeVar.zzo(obj, zzbcVar);
        zzbcVar.zzc(i);
        long j = zzbcVar.zzg.zza(i).zzh;
        return 0L;
    }

    private static final boolean zzL(zzup zzupVar) {
        return !zzupVar.zzb() && zzupVar.zze == -1;
    }

    public final int zza(zzbe zzbeVar, int i) {
        this.zzf = i;
        return zzD(zzbeVar);
    }

    public final int zzb(zzbe zzbeVar, boolean z) {
        this.zzg = z;
        return zzD(zzbeVar);
    }

    public final void zzc(zzbe zzbeVar, zzij zzijVar) {
        this.zzh = zzijVar;
        long j = zzijVar.zzb;
        zzj();
    }

    public final boolean zzd(zzun zzunVar) {
        zzkn zzknVar = this.zzl;
        return zzknVar != null && zzknVar.zza == zzunVar;
    }

    public final boolean zze(zzun zzunVar) {
        zzkn zzknVar = this.zzm;
        return zzknVar != null && zzknVar.zza == zzunVar;
    }

    public final void zzf(long j) {
        zzkn zzknVar = this.zzl;
        if (zzknVar != null) {
            zzknVar.zzi(j);
        }
    }

    public final boolean zzg() {
        zzkn zzknVar = this.zzl;
        if (zzknVar != null) {
            return !zzknVar.zzg.zzj && zzknVar.zzd() && this.zzl.zzg.zze != -9223372036854775807L && this.zzn < 100;
        }
        return true;
    }

    public final zzko zzh(long j, zzld zzldVar) {
        zzkn zzknVar = this.zzl;
        return zzknVar == null ? zzF(zzldVar.zza, zzldVar.zzb, zzldVar.zzc, zzldVar.zzs) : zzE(zzldVar.zza, zzknVar, j);
    }

    public final void zzj() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.zzq.size(); i++) {
            ((zzkn) this.zzq.get(i)).zzn();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    public final zzkn zzk() {
        return this.zzl;
    }

    public final zzkn zzl() {
        return this.zzm;
    }

    public final zzkn zzm() {
        return this.zzi;
    }

    public final zzkn zzn() {
        return this.zzj;
    }

    public final zzkn zzo() {
        return this.zzk;
    }

    public final zzkn zzp() {
        zzkn zzknVar = this.zzk;
        zzkn zzknVar2 = this.zzj;
        if (zzknVar == zzknVar2) {
            zzknVar2.getClass();
            this.zzk = zzknVar2.zzp();
        }
        zzknVar2.getClass();
        this.zzj = zzknVar2.zzp();
        zzB();
        zzkn zzknVar3 = this.zzj;
        zzknVar3.getClass();
        return zzknVar3;
    }

    public final zzkn zzq() {
        zzkn zzknVar = this.zzk;
        zzknVar.getClass();
        this.zzk = zzknVar.zzp();
        zzB();
        zzkn zzknVar2 = this.zzk;
        zzknVar2.getClass();
        return zzknVar2;
    }

    public final zzkn zzr() {
        zzkn zzknVar = this.zzi;
        if (zzknVar == null) {
            return null;
        }
        if (zzknVar == this.zzj) {
            this.zzj = zzknVar.zzp();
        }
        if (zzknVar == this.zzk) {
            this.zzk = zzknVar.zzp();
        }
        zzknVar.zzn();
        int i = this.zzn - 1;
        this.zzn = i;
        if (i == 0) {
            this.zzl = null;
            zzkn zzknVar2 = this.zzi;
            this.zzo = zzknVar2.zzb;
            this.zzp = zzknVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzp();
        zzB();
        return this.zzi;
    }

    public final void zzt() {
        zzkn zzknVar = this.zzm;
        if (zzknVar == null || zzknVar.zze()) {
            this.zzm = null;
            for (int i = 0; i < this.zzq.size(); i++) {
                zzkn zzknVar2 = (zzkn) this.zzq.get(i);
                if (!zzknVar2.zze()) {
                    this.zzm = zzknVar2;
                    return;
                }
            }
        }
    }

    public final zzkn zzu(zzun zzunVar) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzkn zzknVar = (zzkn) this.zzq.get(i);
            if (zzknVar.zza == zzunVar) {
                return zzknVar;
            }
        }
        return null;
    }

    public final void zzv() {
        if (this.zzn == 0) {
            return;
        }
        zzkn zzknVar = this.zzi;
        zzknVar.getClass();
        this.zzo = zzknVar.zzb;
        this.zzp = zzknVar.zzg.zza.zzd;
        while (zzknVar != null) {
            zzknVar.zzn();
            zzknVar = zzknVar.zzp();
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
    public final int zzw(zzbe zzbeVar, long j, long j2, long j3) {
        zzko zzkoVar;
        boolean z;
        int zzs;
        zzkn zzknVar = this.zzi;
        zzkn zzknVar2 = null;
        while (true) {
            int i = 0;
            if (zzknVar == null) {
                return 0;
            }
            zzko zzkoVar2 = zzknVar.zzg;
            if (zzknVar2 == null) {
                zzkoVar = zzx(zzbeVar, zzkoVar2);
            } else {
                zzko zzE = zzE(zzbeVar, zzknVar2, j);
                if (zzE == null || zzkoVar2.zzb != zzE.zzb || !zzkoVar2.zza.equals(zzE.zza)) {
                    break;
                }
                zzkoVar = zzE;
            }
            zzknVar.zzg = zzkoVar.zzb(zzkoVar2.zzc);
            long j4 = zzkoVar2.zze;
            long j5 = zzkoVar.zze;
            if (j4 != j5) {
                zzknVar.zzs();
                long zza = j5 == -9223372036854775807L ? Long.MAX_VALUE : j5 + zzknVar.zza();
                if (zzknVar == this.zzj) {
                    boolean z2 = zzknVar.zzg.zzg;
                    if (j2 == Long.MIN_VALUE || j2 >= zza) {
                        z = true;
                        boolean z3 = zzknVar != this.zzk && (j3 == Long.MIN_VALUE || j3 >= zza);
                        zzs = zzs(zzknVar);
                        if (zzs == 0) {
                            return zzs;
                        }
                        if (j4 == -9223372036854775807L) {
                            long j6 = zzkoVar2.zzd;
                            j4 = -9223372036854775807L;
                        }
                        if (z && j4 != -9223372036854775807L) {
                            i = 1;
                        }
                        return z3 ? i | 2 : i;
                    }
                }
                z = false;
                if (zzknVar != this.zzk) {
                }
                zzs = zzs(zzknVar);
                if (zzs == 0) {
                }
            } else {
                zzknVar2 = zzknVar;
                zzknVar = zzknVar.zzp();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzko zzx(zzbe zzbeVar, zzko zzkoVar) {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        zzup zzupVar = zzkoVar.zza;
        boolean zzL = zzL(zzupVar);
        boolean zzI = zzI(zzbeVar, zzupVar);
        boolean zzJ = zzJ(zzbeVar, zzupVar, zzL);
        Object obj = zzupVar.zza;
        zzbc zzbcVar = this.zza;
        zzbeVar.zzo(obj, zzbcVar);
        if (zzupVar.zzb() || (i = zzupVar.zze) == -1) {
            j = -9223372036854775807L;
        } else {
            zzbcVar.zzc(i);
            j = 0;
        }
        if (zzupVar.zzb()) {
            j2 = zzbcVar.zzh(zzupVar.zzb, zzupVar.zzc);
        } else {
            if (j != -9223372036854775807L) {
                j3 = 0;
                j4 = 0;
                if (zzupVar.zzb()) {
                    int i2 = zzupVar.zze;
                    if (i2 != -1) {
                        zzbcVar.zzk(i2);
                    }
                } else {
                    zzbcVar.zzk(zzupVar.zzb);
                }
                long j5 = zzkoVar.zzb;
                long j6 = zzkoVar.zzc;
                boolean z = zzkoVar.zzf;
                return new zzko(zzupVar, j5, j6, j4, j3, false, false, zzL, zzI, zzJ);
            }
            j2 = zzbcVar.zzd;
        }
        j3 = j2;
        j4 = j;
        if (zzupVar.zzb()) {
        }
        long j52 = zzkoVar.zzb;
        long j62 = zzkoVar.zzc;
        boolean z2 = zzkoVar.zzf;
        return new zzko(zzupVar, j52, j62, j4, j3, false, false, zzL, zzI, zzJ);
    }

    public final zzup zzy(zzbe zzbeVar, Object obj, long j) {
        long zzC;
        int zze;
        zzbc zzbcVar = this.zza;
        int i = zzbeVar.zzo(obj, zzbcVar).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (zze = zzbeVar.zze(obj2)) == -1 || zzbeVar.zzd(zze, zzbcVar, false).zzc != i) {
            zzkn zzknVar = this.zzi;
            while (true) {
                if (zzknVar == null) {
                    zzkn zzknVar2 = this.zzi;
                    while (true) {
                        if (zzknVar2 != null) {
                            int zze2 = zzbeVar.zze(zzknVar2.zzb);
                            if (zze2 != -1 && zzbeVar.zzd(zze2, zzbcVar, false).zzc == i) {
                                zzC = zzknVar2.zzg.zza.zzd;
                                break;
                            }
                            zzknVar2 = zzknVar2.zzp();
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
                    if (zzknVar.zzb.equals(obj)) {
                        zzC = zzknVar.zzg.zza.zzd;
                        break;
                    }
                    zzknVar = zzknVar.zzp();
                }
            }
        } else {
            zzC = this.zzp;
        }
        long j2 = zzC;
        zzbeVar.zzo(obj, zzbcVar);
        int i2 = zzbcVar.zzc;
        zzbd zzbdVar = this.zzb;
        zzbeVar.zzb(i2, zzbdVar, 0L);
        Object obj3 = obj;
        for (int zze3 = zzbeVar.zze(obj); zze3 >= zzbdVar.zzn; zze3--) {
            zzbeVar.zzd(zze3, zzbcVar, true);
            zzbcVar.zzb();
            if (zzbcVar.zze(zzbcVar.zzd) != -1) {
                Object obj4 = zzbcVar.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzA(zzbeVar, obj3, j, j2, zzbdVar, zzbcVar);
    }

    final /* synthetic */ void zzz(zzgjw zzgjwVar, zzup zzupVar) {
        this.zzc.zzz(zzgjwVar.zzi(), zzupVar);
    }

    public final zzkn zzi(zzko zzkoVar) {
        zzkn zzknVar;
        zzkn zzknVar2 = this.zzl;
        long zza = zzknVar2 == null ? 1000000000000L : (zzknVar2.zza() + zzknVar2.zzg.zze) - zzkoVar.zzb;
        int i = 0;
        while (true) {
            if (i >= this.zzq.size()) {
                zzknVar = null;
                break;
            }
            zzko zzkoVar2 = ((zzkn) this.zzq.get(i)).zzg;
            long j = zzkoVar2.zze;
            long j2 = zzkoVar.zze;
            if ((j == -9223372036854775807L || j == j2) && zzkoVar2.zzb == zzkoVar.zzb && zzkoVar2.zza.equals(zzkoVar.zza)) {
                zzknVar = (zzkn) this.zzq.remove(i);
                break;
            }
            i++;
        }
        if (zzknVar == null) {
            zzknVar = this.zzr.zza(zzkoVar, zza);
        } else {
            zzknVar.zzg = zzkoVar;
            zzknVar.zzb(zza);
        }
        zzkn zzknVar3 = this.zzl;
        if (zzknVar3 != null) {
            zzknVar3.zzo(zzknVar);
        } else {
            this.zzi = zzknVar;
            this.zzj = zzknVar;
            this.zzk = zzknVar;
        }
        this.zzo = null;
        this.zzl = zzknVar;
        this.zzn++;
        zzB();
        return zzknVar;
    }

    public final int zzs(zzkn zzknVar) {
        zzknVar.getClass();
        int i = 0;
        if (zzknVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzknVar;
        while (zzknVar.zzp() != null) {
            zzknVar = zzknVar.zzp();
            zzknVar.getClass();
            if (zzknVar == this.zzj) {
                zzkn zzknVar2 = this.zzi;
                this.zzj = zzknVar2;
                this.zzk = zzknVar2;
                i = 3;
            }
            if (zzknVar == this.zzk) {
                this.zzk = this.zzj;
                i |= 2;
            }
            zzknVar.zzn();
            this.zzn--;
        }
        zzkn zzknVar3 = this.zzl;
        zzknVar3.getClass();
        zzknVar3.zzo(null);
        zzB();
        return i;
    }
}

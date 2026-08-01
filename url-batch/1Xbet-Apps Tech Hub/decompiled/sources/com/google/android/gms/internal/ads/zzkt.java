package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzkt implements Handler.Callback, zzuh, zzyd, zzlq, zziq, zzlt {
    private boolean zzB;
    private boolean zzE;
    private int zzF;
    private zzks zzG;
    private long zzH;
    private int zzI;
    private boolean zzJ;
    private zzit zzK;
    private final zzje zzM;
    private final zzio zzN;
    private final zzlz[] zza;
    private final Set zzb;
    private final zzmb[] zzc;
    private final zzye zzd;
    private final zzyf zze;
    private final zzkw zzf;
    private final zzym zzg;
    private final zzeq zzh;
    private final HandlerThread zzi;
    private final Looper zzj;
    private final zzcz zzk;
    private final zzcx zzl;
    private final long zzm;
    private final zzir zzn;
    private final ArrayList zzo;
    private final zzeg zzp;
    private final zzlf zzq;
    private final zzlr zzr;
    private final long zzs;
    private zzmd zzt;
    private zzls zzu;
    private zzkr zzv;
    private boolean zzw;
    private boolean zzy;
    private boolean zzz;
    private int zzC = 0;
    private boolean zzD = false;
    private boolean zzx = false;
    private long zzL = -9223372036854775807L;
    private long zzA = -9223372036854775807L;

    public zzkt(zzlz[] zzlzVarArr, zzye zzyeVar, zzyf zzyfVar, zzkw zzkwVar, zzym zzymVar, int i, boolean z, zzmj zzmjVar, zzmd zzmdVar, zzio zzioVar, long j, boolean z2, Looper looper, zzeg zzegVar, zzje zzjeVar, zzov zzovVar, Looper looper2) {
        this.zzM = zzjeVar;
        this.zza = zzlzVarArr;
        this.zzd = zzyeVar;
        this.zze = zzyfVar;
        this.zzf = zzkwVar;
        this.zzg = zzymVar;
        int i2 = 0;
        this.zzt = zzmdVar;
        this.zzN = zzioVar;
        this.zzs = j;
        this.zzp = zzegVar;
        this.zzm = zzkwVar.zza();
        zzkwVar.zzf();
        this.zzu = zzls.zzg(zzyfVar);
        this.zzv = new zzkr(this.zzu);
        int length = zzlzVarArr.length;
        this.zzc = new zzmb[2];
        zzma zzc = zzyeVar.zzc();
        while (true) {
            int length2 = zzlzVarArr.length;
            if (i2 >= 2) {
                this.zzn = new zzir(this, zzegVar);
                this.zzo = new ArrayList();
                this.zzb = Collections.newSetFromMap(new IdentityHashMap());
                this.zzk = new zzcz();
                this.zzl = new zzcx();
                zzyeVar.zzr(this, zzymVar);
                this.zzJ = true;
                zzeq zzb = zzegVar.zzb(looper, null);
                this.zzq = new zzlf(zzmjVar, zzb);
                this.zzr = new zzlr(this, zzmjVar, zzb, zzovVar);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.zzi = handlerThread;
                handlerThread.start();
                Looper looper3 = handlerThread.getLooper();
                this.zzj = looper3;
                this.zzh = zzegVar.zzb(looper3, this);
                return;
            }
            zzlzVarArr[i2].zzu(i2, zzovVar, zzegVar);
            this.zzc[i2] = zzlzVarArr[i2].zzl();
            this.zzc[i2].zzJ(zzc);
            i2++;
        }
    }

    private final void zzA() throws zzit {
        int length = this.zza.length;
        zzB(new boolean[2], this.zzq.zze().zzf());
    }

    private final void zzB(boolean[] zArr, long j) throws zzit {
        zzlc zze = this.zzq.zze();
        zzyf zzi = zze.zzi();
        int i = 0;
        while (true) {
            int length = this.zza.length;
            if (i >= 2) {
                break;
            }
            if (!zzi.zzb(i) && this.zzb.remove(this.zza[i])) {
                this.zza[i].zzG();
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = this.zza.length;
            if (i2 >= 2) {
                zze.zzg = true;
                return;
            }
            if (zzi.zzb(i2)) {
                boolean z = zArr[i2];
                zzlz zzlzVar = this.zza[i2];
                if (!zzae(zzlzVar)) {
                    zzlf zzlfVar = this.zzq;
                    zzlc zze2 = zzlfVar.zze();
                    boolean z2 = zze2 == zzlfVar.zzd();
                    zzyf zzi2 = zze2.zzi();
                    zzmc zzmcVar = zzi2.zzb[i2];
                    zzam[] zzaj = zzaj(zzi2.zzc[i2]);
                    boolean z3 = zzah() && this.zzu.zze == 3;
                    boolean z4 = !z && z3;
                    this.zzF++;
                    this.zzb.add(zzlzVar);
                    zzlzVar.zzr(zzmcVar, zzaj, zze2.zzc[i2], this.zzH, z4, z2, j, zze2.zze(), zze2.zzf.zza);
                    zzlzVar.zzt(11, new zzkm(this));
                    this.zzn.zze(zzlzVar);
                    if (z3) {
                        zzlzVar.zzM();
                    }
                }
            }
            i2++;
        }
    }

    private final void zzC(IOException iOException, int i) {
        zzlf zzlfVar = this.zzq;
        zzit zzc = zzit.zzc(iOException, i);
        zzlc zzd = zzlfVar.zzd();
        if (zzd != null) {
            zzc = zzc.zza(zzd.zzf.zza);
        }
        zzez.zzd("ExoPlayerImplInternal", "Playback error", zzc);
        zzV(false, false);
        this.zzu = this.zzu.zzd(zzc);
    }

    private final void zzD(boolean z) {
        zzlc zzc = this.zzq.zzc();
        zzuk zzukVar = zzc == null ? this.zzu.zzb : zzc.zzf.zza;
        boolean z2 = !this.zzu.zzk.equals(zzukVar);
        if (z2) {
            this.zzu = this.zzu.zza(zzukVar);
        }
        zzls zzlsVar = this.zzu;
        zzlsVar.zzp = zzc == null ? zzlsVar.zzr : zzc.zzc();
        this.zzu.zzq = zzs();
        if ((z2 || z) && zzc != null && zzc.zzd) {
            zzY(zzc.zzf.zza, zzc.zzh(), zzc.zzi());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x0387: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r19 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:136:0x0386 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x039f  */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r1v82, types: [int] */
    /* JADX WARN: Type inference failed for: r1v98 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzE(zzda zzdaVar, boolean z) throws zzit {
        long j;
        zzuk zzukVar;
        zzcx zzcxVar;
        int i;
        zzcz zzczVar;
        long j2;
        Object obj;
        int i2;
        long j3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        boolean z5;
        long j4;
        boolean z6;
        long j5;
        boolean z7;
        boolean z8;
        boolean z9;
        zzuk zzukVar2;
        long j6;
        int i4;
        boolean z10;
        int i5;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i6;
        boolean z15;
        int i7;
        zzks zzksVar;
        int i8;
        zzks zzksVar2;
        int i9;
        int i10;
        boolean z16;
        boolean z17;
        long j7;
        int i11;
        boolean z18;
        int i12;
        boolean z19;
        zzls zzlsVar = this.zzu;
        zzks zzksVar3 = this.zzG;
        int i13 = this.zzC;
        boolean z20 = this.zzD;
        if (zzdaVar.zzo()) {
            zzukVar2 = zzls.zzh();
            j6 = -9223372036854775807L;
            z7 = false;
            z8 = true;
            z9 = false;
            z6 = true;
            j5 = 0;
            j2 = 0;
        } else {
            zzcx zzcxVar2 = this.zzl;
            zzuk zzukVar3 = zzlsVar.zzb;
            Object obj2 = zzukVar3.zza;
            boolean zzag = zzag(zzlsVar, zzcxVar2);
            j = (zzlsVar.zzb.zzb() || zzag) ? zzlsVar.zzc : zzlsVar.zzr;
            zzcz zzczVar2 = this.zzk;
            if (zzksVar3 != null) {
                zzukVar = zzukVar3;
                zzcxVar = zzcxVar2;
                Pair zzx = zzx(zzdaVar, zzksVar3, true, i13, z20, zzczVar2, zzcxVar);
                if (zzx == null) {
                    i5 = zzdaVar.zzg(z20);
                    j3 = j;
                    obj = obj2;
                    z12 = false;
                    z11 = false;
                    z13 = true;
                } else {
                    if (zzksVar3.zzc == -9223372036854775807L) {
                        i5 = zzdaVar.zzn(zzx.first, zzcxVar).zzd;
                        j3 = j;
                        obj = obj2;
                        z10 = false;
                    } else {
                        Object obj3 = zzx.first;
                        j3 = ((Long) zzx.second).longValue();
                        obj = obj3;
                        z10 = true;
                        i5 = -1;
                    }
                    z11 = zzlsVar.zze == 4;
                    z12 = z10;
                    z13 = false;
                }
                z2 = z11;
                z3 = z13;
                i2 = i5;
                zzczVar = zzczVar2;
                i = -1;
                j2 = 0;
                z4 = z12;
            } else {
                zzukVar = zzukVar3;
                zzcxVar = zzcxVar2;
                if (zzlsVar.zza.zzo()) {
                    i2 = zzdaVar.zzg(z20);
                    zzczVar = zzczVar2;
                    j3 = j;
                    obj = obj2;
                    z2 = false;
                    z3 = false;
                    i = -1;
                } else if (zzdaVar.zza(obj2) == -1) {
                    i = -1;
                    Object zze = zze(zzczVar2, zzcxVar, i13, z20, obj2, zzlsVar.zza, zzdaVar);
                    if (zze == null) {
                        i3 = zzdaVar.zzg(z20);
                        z5 = true;
                    } else {
                        i3 = zzdaVar.zzn(zze, zzcxVar).zzd;
                        z5 = false;
                    }
                    i2 = i3;
                    z3 = z5;
                    obj = obj2;
                    zzczVar = zzczVar2;
                    j3 = j;
                    z2 = false;
                } else {
                    i = -1;
                    if (j == -9223372036854775807L) {
                        i2 = zzdaVar.zzn(obj2, zzcxVar).zzd;
                        obj = obj2;
                        zzczVar = zzczVar2;
                        j3 = j;
                        z2 = false;
                        z3 = false;
                    } else if (zzag) {
                        zzlsVar.zza.zzn(zzukVar.zza, zzcxVar);
                        zzczVar = zzczVar2;
                        if (zzlsVar.zza.zze(zzcxVar.zzd, zzczVar, 0L).zzp == zzlsVar.zza.zza(zzukVar.zza)) {
                            j2 = 0;
                            Pair zzl = zzdaVar.zzl(zzczVar, zzcxVar, zzdaVar.zzn(obj2, zzcxVar).zzd, j);
                            Object obj4 = zzl.first;
                            j3 = ((Long) zzl.second).longValue();
                            obj = obj4;
                        } else {
                            j2 = 0;
                            obj = obj2;
                            j3 = j;
                        }
                        i2 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        zzczVar = zzczVar2;
                        j2 = 0;
                        obj = obj2;
                        i2 = -1;
                        j3 = j;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                }
                z4 = false;
                j2 = 0;
            }
            if (i2 != i) {
                Pair zzl2 = zzdaVar.zzl(zzczVar, zzcxVar, i2, -9223372036854775807L);
                Object obj5 = zzl2.first;
                long longValue = ((Long) zzl2.second).longValue();
                obj = obj5;
                j4 = longValue;
                j3 = -9223372036854775807L;
            } else {
                j4 = j3;
            }
            zzuk zzh = this.zzq.zzh(zzdaVar, obj, j4);
            int i14 = zzh.zze;
            boolean z21 = zzukVar.zza.equals(obj) && !zzukVar.zzb() && !zzh.zzb() && (i14 == i || ((i4 = zzukVar.zze) != i && i14 >= i4));
            zzcx zzn = zzdaVar.zzn(obj, zzcxVar);
            if (!zzag && j == j3 && zzukVar.zza.equals(zzh.zza)) {
                if (zzukVar.zzb()) {
                    zzn.zzn(zzukVar.zzb);
                }
                if (zzh.zzb()) {
                    zzn.zzn(zzh.zzb);
                }
            }
            z6 = true;
            if (true == z21) {
                zzh = zzukVar;
            }
            if (zzh.zzb()) {
                if (zzh.equals(zzukVar)) {
                    j4 = zzlsVar.zzr;
                } else {
                    zzdaVar.zzn(zzh.zza, zzcxVar);
                    if (zzh.zzc == zzcxVar.zze(zzh.zzb)) {
                        zzcxVar.zzj();
                    }
                    j4 = j2;
                }
            }
            j5 = j4;
            z7 = z2;
            z8 = z3;
            z9 = z4;
            zzukVar2 = zzh;
            j6 = j3;
        }
        boolean z22 = (this.zzu.zzb.equals(zzukVar2) && j5 == this.zzu.zzr) ? false : z6;
        if (z8) {
            try {
                if (this.zzu.zze != z6) {
                    i6 = 4;
                    try {
                        zzT(4);
                    } catch (Throwable th) {
                        th = th;
                        i7 = i6;
                        z14 = z9;
                        zzksVar = null;
                        i8 = i7;
                        zzls zzlsVar2 = this.zzu;
                        zzaa(zzdaVar, zzukVar2, zzlsVar2.zza, zzlsVar2.zzb, true == z14 ? -9223372036854775807L : j5, false);
                        if (z22) {
                        }
                        zzls zzlsVar3 = this.zzu;
                        Object obj6 = zzlsVar3.zzb.zza;
                        zzda zzdaVar2 = zzlsVar3.zza;
                        if (z22) {
                        }
                        zzksVar2 = zzksVar;
                        this.zzu = zzy(zzukVar2, j5, j6, this.zzu.zzd, (z22 || !z || zzdaVar2.zzo() || zzdaVar2.zzn(obj6, this.zzl).zzg) ? false : true, zzdaVar.zza(obj6) == -1 ? i8 : 3);
                        zzM();
                        zzO(zzdaVar, this.zzu.zza);
                        this.zzu = this.zzu.zzf(zzdaVar);
                        if (!zzdaVar.zzo()) {
                        }
                        zzD(false);
                        throw th;
                    }
                } else {
                    i6 = 4;
                }
                z15 = false;
            } catch (Throwable th2) {
                th = th2;
                z14 = z9;
                zzksVar = null;
                i8 = 4;
                zzls zzlsVar22 = this.zzu;
                zzaa(zzdaVar, zzukVar2, zzlsVar22.zza, zzlsVar22.zzb, true == z14 ? -9223372036854775807L : j5, false);
                if (z22) {
                }
                zzls zzlsVar32 = this.zzu;
                Object obj62 = zzlsVar32.zzb.zza;
                zzda zzdaVar22 = zzlsVar32.zza;
                if (z22) {
                }
                zzksVar2 = zzksVar;
                this.zzu = zzy(zzukVar2, j5, j6, this.zzu.zzd, (z22 || !z || zzdaVar22.zzo() || zzdaVar22.zzn(obj62, this.zzl).zzg) ? false : true, zzdaVar.zza(obj62) == -1 ? i8 : 3);
                zzM();
                zzO(zzdaVar, this.zzu.zza);
                this.zzu = this.zzu.zzf(zzdaVar);
                if (!zzdaVar.zzo()) {
                }
                zzD(false);
                throw th;
            }
            try {
                zzL(false, false, false, z6);
            } catch (Throwable th3) {
                th = th3;
                i9 = i6;
                z14 = z9;
                i7 = i9;
                zzksVar = null;
                i8 = i7;
                zzls zzlsVar222 = this.zzu;
                zzaa(zzdaVar, zzukVar2, zzlsVar222.zza, zzlsVar222.zzb, true == z14 ? -9223372036854775807L : j5, false);
                if (z22) {
                }
                zzls zzlsVar322 = this.zzu;
                Object obj622 = zzlsVar322.zzb.zza;
                zzda zzdaVar222 = zzlsVar322.zza;
                if (z22) {
                }
                zzksVar2 = zzksVar;
                this.zzu = zzy(zzukVar2, j5, j6, this.zzu.zzd, (z22 || !z || zzdaVar222.zzo() || zzdaVar222.zzn(obj622, this.zzl).zzg) ? false : true, zzdaVar.zza(obj622) == -1 ? i8 : 3);
                zzM();
                zzO(zzdaVar, this.zzu.zza);
                this.zzu = this.zzu.zzf(zzdaVar);
                if (!zzdaVar.zzo()) {
                }
                zzD(false);
                throw th;
            }
        } else {
            z15 = false;
            i6 = 4;
        }
        zzlz[] zzlzVarArr = this.zza;
        int length = zzlzVarArr.length;
        ?? r1 = z15;
        while (true) {
            i10 = 2;
            if (r1 >= 2) {
                try {
                    break;
                } catch (Throwable th4) {
                    th = th4;
                    z14 = z16;
                    i7 = j;
                    zzksVar = null;
                    i8 = i7;
                    zzls zzlsVar2222 = this.zzu;
                    zzaa(zzdaVar, zzukVar2, zzlsVar2222.zza, zzlsVar2222.zzb, true == z14 ? -9223372036854775807L : j5, false);
                    if (z22 && j6 == this.zzu.zzc) {
                        zzksVar2 = zzksVar;
                    } else {
                        zzls zzlsVar3222 = this.zzu;
                        Object obj6222 = zzlsVar3222.zzb.zza;
                        zzda zzdaVar2222 = zzlsVar3222.zza;
                        zzksVar2 = zzksVar;
                        this.zzu = zzy(zzukVar2, j5, j6, this.zzu.zzd, (z22 || !z || zzdaVar2222.zzo() || zzdaVar2222.zzn(obj6222, this.zzl).zzg) ? false : true, zzdaVar.zza(obj6222) == -1 ? i8 : 3);
                    }
                    zzM();
                    zzO(zzdaVar, this.zzu.zza);
                    this.zzu = this.zzu.zzf(zzdaVar);
                    if (!zzdaVar.zzo()) {
                        this.zzG = zzksVar2;
                    }
                    zzD(false);
                    throw th;
                }
            }
            zzlzVarArr[r1].zzL(zzdaVar);
            r1++;
        }
        if (z22) {
            z18 = z15;
            i12 = i6;
            z17 = z9;
            if (!zzdaVar.zzo()) {
                for (zzlc zzd = this.zzq.zzd(); zzd != null; zzd = zzd.zzg()) {
                    if (zzd.zzf.zza.equals(zzukVar2)) {
                        zzd.zzf = this.zzq.zzg(zzdaVar, zzd.zzf);
                        zzd.zzq();
                    }
                }
                j5 = zzu(zzukVar2, j5, z7);
            }
        } else {
            try {
                zzlf zzlfVar = this.zzq;
                long j8 = this.zzH;
                zzlc zze2 = zzlfVar.zze();
                if (zze2 == null) {
                    z17 = z9;
                    j7 = j2;
                } else {
                    long zze3 = zze2.zze();
                    z17 = z9;
                    if (zze2.zzd) {
                        long j9 = zze3;
                        int i15 = 0;
                        while (true) {
                            try {
                                zzlz[] zzlzVarArr2 = this.zza;
                                int length2 = zzlzVarArr2.length;
                                if (i15 >= i10) {
                                    j7 = j9;
                                    break;
                                }
                                if (zzae(zzlzVarArr2[i15]) && this.zza[i15].zzo() == zze2.zzc[i15]) {
                                    i11 = i15;
                                    long zzbf = this.zza[i15].zzbf();
                                    j7 = Long.MIN_VALUE;
                                    if (zzbf == Long.MIN_VALUE) {
                                        break;
                                    }
                                    j9 = Math.max(zzbf, j9);
                                    i15 = i11 + 1;
                                    i10 = 2;
                                }
                                i11 = i15;
                                i15 = i11 + 1;
                                i10 = 2;
                            } catch (Throwable th5) {
                                th = th5;
                                z14 = z17;
                                zzksVar = null;
                                i8 = 4;
                                zzls zzlsVar22222 = this.zzu;
                                zzaa(zzdaVar, zzukVar2, zzlsVar22222.zza, zzlsVar22222.zzb, true == z14 ? -9223372036854775807L : j5, false);
                                if (z22) {
                                }
                                zzls zzlsVar32222 = this.zzu;
                                Object obj62222 = zzlsVar32222.zzb.zza;
                                zzda zzdaVar22222 = zzlsVar32222.zza;
                                if (z22) {
                                }
                                zzksVar2 = zzksVar;
                                this.zzu = zzy(zzukVar2, j5, j6, this.zzu.zzd, (z22 || !z || zzdaVar22222.zzo() || zzdaVar22222.zzn(obj62222, this.zzl).zzg) ? false : true, zzdaVar.zza(obj62222) == -1 ? i8 : 3);
                                zzM();
                                zzO(zzdaVar, this.zzu.zza);
                                this.zzu = this.zzu.zzf(zzdaVar);
                                if (!zzdaVar.zzo()) {
                                }
                                zzD(false);
                                throw th;
                            }
                        }
                    } else {
                        j7 = zze3;
                    }
                }
                z18 = false;
                i12 = 4;
                if (!zzlfVar.zzo(zzdaVar, j8, j7)) {
                    zzQ(false);
                }
            } catch (Throwable th6) {
                th = th6;
                i9 = i6;
                z14 = z9;
                i7 = i9;
                zzksVar = null;
                i8 = i7;
                zzls zzlsVar222222 = this.zzu;
                zzaa(zzdaVar, zzukVar2, zzlsVar222222.zza, zzlsVar222222.zzb, true == z14 ? -9223372036854775807L : j5, false);
                if (z22) {
                }
                zzls zzlsVar322222 = this.zzu;
                Object obj622222 = zzlsVar322222.zzb.zza;
                zzda zzdaVar222222 = zzlsVar322222.zza;
                if (z22) {
                }
                zzksVar2 = zzksVar;
                this.zzu = zzy(zzukVar2, j5, j6, this.zzu.zzd, (z22 || !z || zzdaVar222222.zzo() || zzdaVar222222.zzn(obj622222, this.zzl).zzg) ? false : true, zzdaVar.zza(obj622222) == -1 ? i8 : 3);
                zzM();
                zzO(zzdaVar, this.zzu.zza);
                this.zzu = this.zzu.zzf(zzdaVar);
                if (!zzdaVar.zzo()) {
                }
                zzD(false);
                throw th;
            }
        }
        zzls zzlsVar4 = this.zzu;
        zzaa(zzdaVar, zzukVar2, zzlsVar4.zza, zzlsVar4.zzb, true != z17 ? -9223372036854775807L : j5, false);
        if (z22 || j6 != this.zzu.zzc) {
            zzls zzlsVar5 = this.zzu;
            Object obj7 = zzlsVar5.zzb.zza;
            zzda zzdaVar3 = zzlsVar5.zza;
            z19 = z18;
            this.zzu = zzy(zzukVar2, j5, j6, this.zzu.zzd, (!z22 || !z || zzdaVar3.zzo() || zzdaVar3.zzn(obj7, this.zzl).zzg) ? z18 : true, zzdaVar.zza(obj7) == -1 ? i12 : 3);
        } else {
            z19 = z18;
        }
        zzM();
        zzO(zzdaVar, this.zzu.zza);
        this.zzu = this.zzu.zzf(zzdaVar);
        if (!zzdaVar.zzo()) {
            this.zzG = null;
        }
        zzD(z19);
    }

    private final void zzF(zzcj zzcjVar, boolean z) throws zzit {
        zzG(zzcjVar, zzcjVar.zzc, true, z);
    }

    private final void zzG(zzcj zzcjVar, float f, boolean z, boolean z2) throws zzit {
        int i;
        zzkt zzktVar = this;
        if (z) {
            if (z2) {
                zzktVar.zzv.zza(1);
            }
            zzls zzlsVar = zzktVar.zzu;
            zzda zzdaVar = zzlsVar.zza;
            zzuk zzukVar = zzlsVar.zzb;
            long j = zzlsVar.zzc;
            long j2 = zzlsVar.zzd;
            int i2 = zzlsVar.zze;
            zzit zzitVar = zzlsVar.zzf;
            boolean z3 = zzlsVar.zzg;
            zzwl zzwlVar = zzlsVar.zzh;
            zzyf zzyfVar = zzlsVar.zzi;
            List list = zzlsVar.zzj;
            zzuk zzukVar2 = zzlsVar.zzk;
            boolean z4 = zzlsVar.zzl;
            int i3 = zzlsVar.zzm;
            long j3 = zzlsVar.zzp;
            long j4 = zzlsVar.zzq;
            long j5 = zzlsVar.zzr;
            long j6 = zzlsVar.zzs;
            boolean z5 = zzlsVar.zzo;
            zzktVar = this;
            zzktVar.zzu = new zzls(zzdaVar, zzukVar, j, j2, i2, zzitVar, z3, zzwlVar, zzyfVar, list, zzukVar2, z4, i3, zzcjVar, j3, j4, j5, j6, false);
        }
        float f2 = zzcjVar.zzc;
        zzlc zzd = zzktVar.zzq.zzd();
        while (true) {
            i = 0;
            if (zzd == null) {
                break;
            }
            zzxy[] zzxyVarArr = zzd.zzi().zzc;
            int length = zzxyVarArr.length;
            while (i < length) {
                zzxy zzxyVar = zzxyVarArr[i];
                i++;
            }
            zzd = zzd.zzg();
        }
        zzlz[] zzlzVarArr = zzktVar.zza;
        int length2 = zzlzVarArr.length;
        while (i < 2) {
            zzlz zzlzVar = zzlzVarArr[i];
            if (zzlzVar != null) {
                zzlzVar.zzK(f, zzcjVar.zzc);
            }
            i++;
        }
    }

    private final void zzH() {
        long zze;
        long j;
        boolean z = false;
        if (zzad()) {
            zzlc zzc = this.zzq.zzc();
            long zzt = zzt(zzc.zzd());
            if (zzc == this.zzq.zzd()) {
                zze = this.zzH;
                j = zzc.zze();
            } else {
                zze = this.zzH - zzc.zze();
                j = zzc.zzf.zzb;
            }
            long j2 = zze - j;
            boolean zzg = this.zzf.zzg(j2, zzt, this.zzn.zzc().zzc);
            if (zzg || zzt >= 500000 || this.zzm <= 0) {
                z = zzg;
            } else {
                this.zzq.zzd().zza.zzj(this.zzu.zzr, false);
                z = this.zzf.zzg(j2, zzt, this.zzn.zzc().zzc);
            }
        }
        this.zzB = z;
        if (z) {
            this.zzq.zzc().zzk(this.zzH, this.zzn.zzc().zzc, this.zzA);
        }
        zzX();
    }

    private final void zzI() {
        boolean z;
        this.zzv.zzc(this.zzu);
        z = this.zzv.zzg;
        if (z) {
            zzje zzjeVar = this.zzM;
            zzjeVar.zza.zzT(this.zzv);
            this.zzv = new zzkr(this.zzu);
        }
    }

    private final void zzJ() throws zzit {
        int i;
        float f = this.zzn.zzc().zzc;
        zzlf zzlfVar = this.zzq;
        zzlc zze = zzlfVar.zze();
        boolean z = true;
        for (zzlc zzd = zzlfVar.zzd(); zzd != null && zzd.zzd; zzd = zzd.zzg()) {
            zzyf zzj = zzd.zzj(f, this.zzu.zza);
            zzyf zzi = zzd.zzi();
            boolean z2 = false;
            if (zzi != null) {
                if (zzi.zzc.length == zzj.zzc.length) {
                    for (int i2 = 0; i2 < zzj.zzc.length; i2++) {
                        if (zzj.zza(zzi, i2)) {
                        }
                    }
                    if (zzd != zze) {
                        z2 = true;
                    }
                    z &= z2;
                }
            }
            if (z) {
                zzlf zzlfVar2 = this.zzq;
                zzlc zzd2 = zzlfVar2.zzd();
                boolean zzm = zzlfVar2.zzm(zzd2);
                int length = this.zza.length;
                boolean[] zArr = new boolean[2];
                long zzb = zzd2.zzb(zzj, this.zzu.zzr, zzm, zArr);
                zzls zzlsVar = this.zzu;
                boolean z3 = (zzlsVar.zze == 4 || zzb == zzlsVar.zzr) ? false : true;
                zzls zzlsVar2 = this.zzu;
                i = 2;
                this.zzu = zzy(zzlsVar2.zzb, zzb, zzlsVar2.zzc, zzlsVar2.zzd, z3, 5);
                if (z3) {
                    zzN(zzb);
                }
                int length2 = this.zza.length;
                boolean[] zArr2 = new boolean[2];
                int i3 = 0;
                while (true) {
                    zzlz[] zzlzVarArr = this.zza;
                    int length3 = zzlzVarArr.length;
                    if (i3 >= 2) {
                        break;
                    }
                    zzlz zzlzVar = zzlzVarArr[i3];
                    boolean zzae = zzae(zzlzVar);
                    zArr2[i3] = zzae;
                    zzwa zzwaVar = zzd2.zzc[i3];
                    if (zzae) {
                        if (zzwaVar != zzlzVar.zzo()) {
                            zzz(zzlzVar);
                        } else if (zArr[i3]) {
                            zzlzVar.zzH(this.zzH);
                        }
                    }
                    i3++;
                }
                zzB(zArr2, this.zzH);
            } else {
                i = 2;
                this.zzq.zzm(zzd);
                if (zzd.zzd) {
                    zzd.zza(zzj, Math.max(zzd.zzf.zzb, this.zzH - zzd.zze()), false);
                }
            }
            zzD(true);
            if (this.zzu.zze != 4) {
                zzH();
                zzZ();
                this.zzh.zzi(i);
                return;
            }
            return;
        }
    }

    private final void zzK() throws zzit {
        zzJ();
        zzQ(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r2.equals(r32.zzu.zzb) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzL(boolean z, boolean z2, boolean z3, boolean z4) {
        zzda zzdaVar;
        zzuk zzukVar;
        this.zzh.zzf(2);
        this.zzK = null;
        boolean z5 = true;
        zzab(false, true);
        this.zzn.zzi();
        this.zzH = 1000000000000L;
        zzlz[] zzlzVarArr = this.zza;
        int length = zzlzVarArr.length;
        for (int i = 0; i < 2; i++) {
            try {
                zzz(zzlzVarArr[i]);
            } catch (zzit | RuntimeException e) {
                zzez.zzd("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            zzlz[] zzlzVarArr2 = this.zza;
            int length2 = zzlzVarArr2.length;
            for (int i2 = 0; i2 < 2; i2++) {
                zzlz zzlzVar = zzlzVarArr2[i2];
                if (this.zzb.remove(zzlzVar)) {
                    try {
                        zzlzVar.zzG();
                    } catch (RuntimeException e2) {
                        zzez.zzd("ExoPlayerImplInternal", "Reset failed.", e2);
                    }
                }
            }
        }
        this.zzF = 0;
        zzls zzlsVar = this.zzu;
        zzuk zzukVar2 = zzlsVar.zzb;
        long j = zzlsVar.zzr;
        long j2 = (this.zzu.zzb.zzb() || zzag(this.zzu, this.zzl)) ? this.zzu.zzc : this.zzu.zzr;
        if (z2) {
            this.zzG = null;
            Pair zzw = zzw(this.zzu.zza);
            zzukVar2 = (zzuk) zzw.first;
            j = ((Long) zzw.second).longValue();
            j2 = -9223372036854775807L;
        }
        z5 = false;
        long j3 = j;
        long j4 = j2;
        this.zzq.zzi();
        this.zzB = false;
        zzda zzdaVar2 = this.zzu.zza;
        if (z3 && (zzdaVar2 instanceof zzlx)) {
            zzdaVar2 = ((zzlx) zzdaVar2).zzx(this.zzr.zzq());
            if (zzukVar2.zzb != -1) {
                zzdaVar2.zzn(zzukVar2.zza, this.zzl);
                zzcx zzcxVar = this.zzl;
                zzcz zzczVar = this.zzk;
                zzdaVar2.zze(zzcxVar.zzd, zzczVar, 0L);
                if (zzczVar.zzb()) {
                    zzdaVar = zzdaVar2;
                    zzukVar = new zzuk(zzukVar2.zza, zzukVar2.zzd);
                    zzls zzlsVar2 = this.zzu;
                    int i3 = zzlsVar2.zze;
                    zzit zzitVar = z4 ? null : zzlsVar2.zzf;
                    zzwl zzwlVar = !z5 ? zzwl.zza : zzlsVar2.zzh;
                    zzyf zzyfVar = !z5 ? this.zze : this.zzu.zzi;
                    List zzl = !z5 ? zzfwu.zzl() : this.zzu.zzj;
                    zzls zzlsVar3 = this.zzu;
                    this.zzu = new zzls(zzdaVar, zzukVar, j4, j3, i3, zzitVar, false, zzwlVar, zzyfVar, zzl, zzukVar, zzlsVar3.zzl, zzlsVar3.zzm, zzlsVar3.zzn, j3, 0L, j3, 0L, false);
                    if (z3) {
                        return;
                    }
                    this.zzr.zzh();
                    return;
                }
            }
        }
        zzdaVar = zzdaVar2;
        zzukVar = zzukVar2;
        zzls zzlsVar22 = this.zzu;
        int i32 = zzlsVar22.zze;
        zzit zzitVar2 = z4 ? null : zzlsVar22.zzf;
        zzwl zzwlVar2 = !z5 ? zzwl.zza : zzlsVar22.zzh;
        zzyf zzyfVar2 = !z5 ? this.zze : this.zzu.zzi;
        List zzl2 = !z5 ? zzfwu.zzl() : this.zzu.zzj;
        zzls zzlsVar32 = this.zzu;
        this.zzu = new zzls(zzdaVar, zzukVar, j4, j3, i32, zzitVar2, false, zzwlVar2, zzyfVar2, zzl2, zzukVar, zzlsVar32.zzl, zzlsVar32.zzm, zzlsVar32.zzn, j3, 0L, j3, 0L, false);
        if (z3) {
        }
    }

    private final void zzM() {
        zzlc zzd = this.zzq.zzd();
        boolean z = false;
        if (zzd != null && zzd.zzf.zzh && this.zzx) {
            z = true;
        }
        this.zzy = z;
    }

    private final void zzN(long j) throws zzit {
        zzlc zzd = this.zzq.zzd();
        long zze = j + (zzd == null ? 1000000000000L : zzd.zze());
        this.zzH = zze;
        this.zzn.zzf(zze);
        zzlz[] zzlzVarArr = this.zza;
        int length = zzlzVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzlz zzlzVar = zzlzVarArr[i];
            if (zzae(zzlzVar)) {
                zzlzVar.zzH(this.zzH);
            }
        }
        for (zzlc zzd2 = this.zzq.zzd(); zzd2 != null; zzd2 = zzd2.zzg()) {
            for (zzxy zzxyVar : zzd2.zzi().zzc) {
            }
        }
    }

    private final void zzO(zzda zzdaVar, zzda zzdaVar2) {
        if (zzdaVar.zzo() && zzdaVar2.zzo()) {
            return;
        }
        int size = this.zzo.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzo);
            return;
        }
        zzkq zzkqVar = (zzkq) this.zzo.get(size);
        Object obj = zzkqVar.zzb;
        zzlv zzlvVar = zzkqVar.zza;
        int i = zzfs.zza;
        zzlv zzlvVar2 = zzkqVar.zza;
        throw null;
    }

    private final void zzP(long j, long j2) {
        this.zzh.zzj(2, j + j2);
    }

    private final void zzQ(boolean z) throws zzit {
        zzuk zzukVar = this.zzq.zzd().zzf.zza;
        long zzv = zzv(zzukVar, this.zzu.zzr, true, false);
        if (zzv != this.zzu.zzr) {
            zzls zzlsVar = this.zzu;
            this.zzu = zzy(zzukVar, zzv, zzlsVar.zzc, zzlsVar.zzd, z, 5);
        }
    }

    private final void zzR(zzcj zzcjVar) {
        this.zzh.zzf(16);
        this.zzn.zzg(zzcjVar);
    }

    private final void zzS(boolean z, int i, boolean z2, int i2) throws zzit {
        this.zzv.zza(z2 ? 1 : 0);
        this.zzv.zzb(i2);
        this.zzu = this.zzu.zzc(z, i);
        zzab(false, false);
        for (zzlc zzd = this.zzq.zzd(); zzd != null; zzd = zzd.zzg()) {
            for (zzxy zzxyVar : zzd.zzi().zzc) {
            }
        }
        if (!zzah()) {
            zzW();
            zzZ();
            return;
        }
        int i3 = this.zzu.zze;
        if (i3 == 3) {
            zzU();
            this.zzh.zzi(2);
        } else if (i3 == 2) {
            this.zzh.zzi(2);
        }
    }

    private final void zzT(int i) {
        zzls zzlsVar = this.zzu;
        if (zzlsVar.zze != i) {
            if (i != 2) {
                this.zzL = -9223372036854775807L;
            }
            this.zzu = zzlsVar.zze(i);
        }
    }

    private final void zzU() throws zzit {
        zzab(false, false);
        this.zzn.zzh();
        zzlz[] zzlzVarArr = this.zza;
        int length = zzlzVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzlz zzlzVar = zzlzVarArr[i];
            if (zzae(zzlzVar)) {
                zzlzVar.zzM();
            }
        }
    }

    private final void zzV(boolean z, boolean z2) {
        zzL(z || !this.zzE, false, true, false);
        this.zzv.zza(z2 ? 1 : 0);
        this.zzf.zzd();
        zzT(1);
    }

    private final void zzW() throws zzit {
        this.zzn.zzi();
        zzlz[] zzlzVarArr = this.zza;
        int length = zzlzVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzlz zzlzVar = zzlzVarArr[i];
            if (zzae(zzlzVar)) {
                zzal(zzlzVar);
            }
        }
    }

    private final void zzX() {
        zzlc zzc = this.zzq.zzc();
        boolean z = this.zzB || (zzc != null && zzc.zza.zzp());
        zzls zzlsVar = this.zzu;
        if (z != zzlsVar.zzg) {
            zzda zzdaVar = zzlsVar.zza;
            zzuk zzukVar = zzlsVar.zzb;
            long j = zzlsVar.zzc;
            long j2 = zzlsVar.zzd;
            int i = zzlsVar.zze;
            zzit zzitVar = zzlsVar.zzf;
            zzwl zzwlVar = zzlsVar.zzh;
            zzyf zzyfVar = zzlsVar.zzi;
            List list = zzlsVar.zzj;
            zzuk zzukVar2 = zzlsVar.zzk;
            boolean z2 = zzlsVar.zzl;
            int i2 = zzlsVar.zzm;
            zzcj zzcjVar = zzlsVar.zzn;
            long j3 = zzlsVar.zzp;
            long j4 = zzlsVar.zzq;
            long j5 = zzlsVar.zzr;
            long j6 = zzlsVar.zzs;
            boolean z3 = zzlsVar.zzo;
            this.zzu = new zzls(zzdaVar, zzukVar, j, j2, i, zzitVar, z, zzwlVar, zzyfVar, list, zzukVar2, z2, i2, zzcjVar, j3, j4, j5, j6, false);
        }
    }

    private final void zzY(zzuk zzukVar, zzwl zzwlVar, zzyf zzyfVar) {
        zzda zzdaVar = this.zzu.zza;
        zzxy[] zzxyVarArr = zzyfVar.zzc;
        this.zzf.zze(zzdaVar, zzukVar, this.zza, zzwlVar, zzxyVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ac, code lost:
    
        r7 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzZ() throws zzit {
        zzkq zzkqVar;
        zzlc zzd = this.zzq.zzd();
        if (zzd == null) {
            return;
        }
        long zzd2 = zzd.zzd ? zzd.zza.zzd() : -9223372036854775807L;
        if (zzd2 != -9223372036854775807L) {
            if (!zzd.zzr()) {
                this.zzq.zzm(zzd);
                zzD(false);
                zzH();
            }
            zzN(zzd2);
            if (zzd2 != this.zzu.zzr) {
                zzls zzlsVar = this.zzu;
                this.zzu = zzy(zzlsVar.zzb, zzd2, zzlsVar.zzc, zzd2, true, 5);
            }
        } else {
            long zzb = this.zzn.zzb(zzd != this.zzq.zze());
            this.zzH = zzb;
            long zze = zzb - zzd.zze();
            long j = this.zzu.zzr;
            if (!this.zzo.isEmpty() && !this.zzu.zzb.zzb()) {
                if (this.zzJ) {
                    j--;
                    this.zzJ = false;
                }
                zzls zzlsVar2 = this.zzu;
                int zza = zzlsVar2.zza.zza(zzlsVar2.zzb.zza);
                int min = Math.min(this.zzI, this.zzo.size());
                if (min > 0) {
                    zzkqVar = (zzkq) this.zzo.get(min - 1);
                    while (zzkqVar != null && (zza < 0 || (zza == 0 && j < 0))) {
                        min--;
                        if (min > 0) {
                            zzkqVar = (zzkq) this.zzo.get(min - 1);
                        }
                    }
                    if (min < this.zzo.size()) {
                    }
                    this.zzI = min;
                }
                zzkqVar = null;
            }
            zzls zzlsVar3 = this.zzu;
            zzlsVar3.zzr = zze;
            zzlsVar3.zzs = SystemClock.elapsedRealtime();
        }
        this.zzu.zzp = this.zzq.zzc().zzc();
        this.zzu.zzq = zzs();
        zzls zzlsVar4 = this.zzu;
        if (zzlsVar4.zzl && zzlsVar4.zze == 3 && zzai(zzlsVar4.zza, zzlsVar4.zzb)) {
            zzls zzlsVar5 = this.zzu;
            if (zzlsVar5.zzn.zzc == 1.0f) {
                float zza2 = this.zzN.zza(zzr(zzlsVar5.zza, zzlsVar5.zzb.zza, zzlsVar5.zzr), zzs());
                if (this.zzn.zzc().zzc != zza2) {
                    zzR(new zzcj(zza2, this.zzu.zzn.zzd));
                    zzG(this.zzu.zzn, this.zzn.zzc().zzc, false, false);
                }
            }
        }
    }

    private final void zzaa(zzda zzdaVar, zzuk zzukVar, zzda zzdaVar2, zzuk zzukVar2, long j, boolean z) throws zzit {
        if (!zzai(zzdaVar, zzukVar)) {
            zzcj zzcjVar = zzukVar.zzb() ? zzcj.zza : this.zzu.zzn;
            if (this.zzn.zzc().equals(zzcjVar)) {
                return;
            }
            zzR(zzcjVar);
            zzG(this.zzu.zzn, zzcjVar.zzc, false, false);
            return;
        }
        zzdaVar.zze(zzdaVar.zzn(zzukVar.zza, this.zzl).zzd, this.zzk, 0L);
        zzio zzioVar = this.zzN;
        zzbi zzbiVar = this.zzk.zzl;
        int i = zzfs.zza;
        zzioVar.zzd(zzbiVar);
        if (j != -9223372036854775807L) {
            this.zzN.zze(zzr(zzdaVar, zzukVar.zza, j));
            return;
        }
        if (!zzfs.zzF(!zzdaVar2.zzo() ? zzdaVar2.zze(zzdaVar2.zzn(zzukVar2.zza, this.zzl).zzd, this.zzk, 0L).zzc : null, this.zzk.zzc) || z) {
            this.zzN.zze(-9223372036854775807L);
        }
    }

    private final void zzab(boolean z, boolean z2) {
        this.zzz = z;
        this.zzA = z2 ? -9223372036854775807L : SystemClock.elapsedRealtime();
    }

    private final synchronized void zzac(zzfuo zzfuoVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!Boolean.valueOf(((zzkk) zzfuoVar).zza.zzw).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzad() {
        zzlc zzc = this.zzq.zzc();
        return (zzc == null || zzc.zzd() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean zzae(zzlz zzlzVar) {
        return zzlzVar.zzbd() != 0;
    }

    private final boolean zzaf() {
        zzlc zzd = this.zzq.zzd();
        long j = zzd.zzf.zze;
        if (!zzd.zzd) {
            return false;
        }
        if (j == -9223372036854775807L || this.zzu.zzr < j) {
            return true;
        }
        return !zzah();
    }

    private static boolean zzag(zzls zzlsVar, zzcx zzcxVar) {
        zzuk zzukVar = zzlsVar.zzb;
        zzda zzdaVar = zzlsVar.zza;
        return zzdaVar.zzo() || zzdaVar.zzn(zzukVar.zza, zzcxVar).zzg;
    }

    private final boolean zzah() {
        zzls zzlsVar = this.zzu;
        return zzlsVar.zzl && zzlsVar.zzm == 0;
    }

    private final boolean zzai(zzda zzdaVar, zzuk zzukVar) {
        if (!zzukVar.zzb() && !zzdaVar.zzo()) {
            zzdaVar.zze(zzdaVar.zzn(zzukVar.zza, this.zzl).zzd, this.zzk, 0L);
            if (this.zzk.zzb()) {
                zzcz zzczVar = this.zzk;
                if (zzczVar.zzj && zzczVar.zzg != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzam[] zzaj(zzxy zzxyVar) {
        int zzc = zzxyVar != null ? zzxyVar.zzc() : 0;
        zzam[] zzamVarArr = new zzam[zzc];
        for (int i = 0; i < zzc; i++) {
            zzamVarArr[i] = zzxyVar.zzd(i);
        }
        return zzamVarArr;
    }

    private static final void zzak(zzlv zzlvVar) throws zzit {
        zzlvVar.zzj();
        try {
            zzlvVar.zzc().zzt(zzlvVar.zza(), zzlvVar.zzg());
        } finally {
            zzlvVar.zzh(true);
        }
    }

    private static final void zzal(zzlz zzlzVar) {
        if (zzlzVar.zzbd() == 2) {
            zzlzVar.zzN();
        }
    }

    private static final void zzam(zzlz zzlzVar, long j) {
        zzlzVar.zzI();
        if (zzlzVar instanceof zzwp) {
            throw null;
        }
    }

    static Object zze(zzcz zzczVar, zzcx zzcxVar, int i, boolean z, Object obj, zzda zzdaVar, zzda zzdaVar2) {
        int zza = zzdaVar.zza(obj);
        int zzb = zzdaVar.zzb();
        int i2 = 0;
        int i3 = zza;
        int i4 = -1;
        while (true) {
            if (i2 >= zzb || i4 != -1) {
                break;
            }
            i3 = zzdaVar.zzi(i3, zzcxVar, zzczVar, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = zzdaVar2.zza(zzdaVar.zzf(i3));
            i2++;
        }
        if (i4 == -1) {
            return null;
        }
        return zzdaVar2.zzf(i4);
    }

    static final /* synthetic */ void zzq(zzlv zzlvVar) {
        try {
            zzak(zzlvVar);
        } catch (zzit e) {
            zzez.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final long zzr(zzda zzdaVar, Object obj, long j) {
        zzdaVar.zze(zzdaVar.zzn(obj, this.zzl).zzd, this.zzk, 0L);
        zzcz zzczVar = this.zzk;
        if (zzczVar.zzg != -9223372036854775807L && zzczVar.zzb()) {
            zzcz zzczVar2 = this.zzk;
            if (zzczVar2.zzj) {
                long j2 = zzczVar2.zzh;
                return zzfs.zzq((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - this.zzk.zzg) - j;
            }
        }
        return -9223372036854775807L;
    }

    private final long zzs() {
        return zzt(this.zzu.zzp);
    }

    private final long zzt(long j) {
        zzlc zzc = this.zzq.zzc();
        if (zzc == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzH - zzc.zze()));
    }

    private final long zzu(zzuk zzukVar, long j, boolean z) throws zzit {
        zzlf zzlfVar = this.zzq;
        return zzv(zzukVar, j, zzlfVar.zzd() != zzlfVar.zze(), z);
    }

    private final long zzv(zzuk zzukVar, long j, boolean z, boolean z2) throws zzit {
        zzW();
        zzab(false, true);
        if (z2 || this.zzu.zze == 3) {
            zzT(2);
        }
        zzlc zzd = this.zzq.zzd();
        zzlc zzlcVar = zzd;
        while (zzlcVar != null && !zzukVar.equals(zzlcVar.zzf.zza)) {
            zzlcVar = zzlcVar.zzg();
        }
        if (z || zzd != zzlcVar || (zzlcVar != null && zzlcVar.zze() + j < 0)) {
            zzlz[] zzlzVarArr = this.zza;
            int length = zzlzVarArr.length;
            for (int i = 0; i < 2; i++) {
                zzz(zzlzVarArr[i]);
            }
            if (zzlcVar != null) {
                while (this.zzq.zzd() != zzlcVar) {
                    this.zzq.zza();
                }
                this.zzq.zzm(zzlcVar);
                zzlcVar.zzp(1000000000000L);
                zzA();
            }
        }
        if (zzlcVar != null) {
            this.zzq.zzm(zzlcVar);
            if (!zzlcVar.zzd) {
                zzlcVar.zzf = zzlcVar.zzf.zzb(j);
            } else if (zzlcVar.zze) {
                j = zzlcVar.zza.zze(j);
                zzlcVar.zza.zzj(j - this.zzm, false);
            }
            zzN(j);
            zzH();
        } else {
            this.zzq.zzi();
            zzN(j);
        }
        zzD(false);
        this.zzh.zzi(2);
        return j;
    }

    private final Pair zzw(zzda zzdaVar) {
        long j = 0;
        if (zzdaVar.zzo()) {
            return Pair.create(zzls.zzh(), 0L);
        }
        Pair zzl = zzdaVar.zzl(this.zzk, this.zzl, zzdaVar.zzg(this.zzD), -9223372036854775807L);
        zzuk zzh = this.zzq.zzh(zzdaVar, zzl.first, 0L);
        long longValue = ((Long) zzl.second).longValue();
        if (zzh.zzb()) {
            zzdaVar.zzn(zzh.zza, this.zzl);
            if (zzh.zzc == this.zzl.zze(zzh.zzb)) {
                this.zzl.zzj();
            }
        } else {
            j = longValue;
        }
        return Pair.create(zzh, Long.valueOf(j));
    }

    private static Pair zzx(zzda zzdaVar, zzks zzksVar, boolean z, int i, boolean z2, zzcz zzczVar, zzcx zzcxVar) {
        Pair zzl;
        zzda zzdaVar2 = zzksVar.zza;
        if (zzdaVar.zzo()) {
            return null;
        }
        zzda zzdaVar3 = true == zzdaVar2.zzo() ? zzdaVar : zzdaVar2;
        try {
            zzl = zzdaVar3.zzl(zzczVar, zzcxVar, zzksVar.zzb, zzksVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzdaVar.equals(zzdaVar3)) {
            return zzl;
        }
        if (zzdaVar.zza(zzl.first) != -1) {
            return (zzdaVar3.zzn(zzl.first, zzcxVar).zzg && zzdaVar3.zze(zzcxVar.zzd, zzczVar, 0L).zzp == zzdaVar3.zza(zzl.first)) ? zzdaVar.zzl(zzczVar, zzcxVar, zzdaVar.zzn(zzl.first, zzcxVar).zzd, zzksVar.zzc) : zzl;
        }
        Object zze = zze(zzczVar, zzcxVar, i, z2, zzl.first, zzdaVar3, zzdaVar);
        if (zze != null) {
            return zzdaVar.zzl(zzczVar, zzcxVar, zzdaVar.zzn(zze, zzcxVar).zzd, -9223372036854775807L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzls zzy(zzuk zzukVar, long j, long j2, long j3, boolean z, int i) {
        List list;
        zzyf zzyfVar;
        zzwl zzwlVar;
        int i2 = 0;
        this.zzJ = (!this.zzJ && j == this.zzu.zzr && zzukVar.equals(this.zzu.zzb)) ? false : true;
        zzM();
        zzls zzlsVar = this.zzu;
        zzwl zzwlVar2 = zzlsVar.zzh;
        zzyf zzyfVar2 = zzlsVar.zzi;
        List list2 = zzlsVar.zzj;
        if (this.zzr.zzj()) {
            zzlc zzd = this.zzq.zzd();
            zzwlVar2 = zzd == null ? zzwl.zza : zzd.zzh();
            zzyfVar2 = zzd == null ? this.zze : zzd.zzi();
            zzxy[] zzxyVarArr = zzyfVar2.zzc;
            zzfwr zzfwrVar = new zzfwr();
            boolean z2 = false;
            for (zzxy zzxyVar : zzxyVarArr) {
                if (zzxyVar != null) {
                    zzcb zzcbVar = zzxyVar.zzd(0).zzk;
                    if (zzcbVar == null) {
                        zzfwrVar.zzf(new zzcb(-9223372036854775807L, new zzca[0]));
                    } else {
                        zzfwrVar.zzf(zzcbVar);
                        z2 = true;
                    }
                }
            }
            zzfwu zzi = z2 ? zzfwrVar.zzi() : zzfwu.zzl();
            if (zzd != null) {
                zzld zzldVar = zzd.zzf;
                if (zzldVar.zzc != j2) {
                    zzd.zzf = zzldVar.zza(j2);
                }
            }
            zzlc zzd2 = this.zzq.zzd();
            if (zzd2 != null) {
                zzyf zzi2 = zzd2.zzi();
                while (true) {
                    int length = this.zza.length;
                    if (i2 >= 2) {
                        break;
                    }
                    if (zzi2.zzb(i2)) {
                        if (this.zza[i2].zzb() != 1) {
                            break;
                        }
                        int i3 = zzi2.zzb[i2].zzb;
                    }
                    i2++;
                }
            }
            list = zzi;
        } else {
            if (!zzukVar.equals(this.zzu.zzb)) {
                zzyfVar = this.zze;
                zzwlVar = zzwl.zza;
                list = zzfwu.zzl();
                if (z) {
                    this.zzv.zzd(i);
                }
                return this.zzu.zzb(zzukVar, j, j2, j3, zzs(), zzwlVar, zzyfVar, list);
            }
            list = list2;
        }
        zzwlVar = zzwlVar2;
        zzyfVar = zzyfVar2;
        if (z) {
        }
        return this.zzu.zzb(zzukVar, j, j2, j3, zzs(), zzwlVar, zzyfVar, list);
    }

    private final void zzz(zzlz zzlzVar) throws zzit {
        if (zzae(zzlzVar)) {
            this.zzn.zzd(zzlzVar);
            zzal(zzlzVar);
            zzlzVar.zzq();
            this.zzF--;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:506:0x0801, code lost:
    
        if (zzaf() != false) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x08a5, code lost:
    
        if (r7 == false) goto L443;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05f8 A[Catch: RuntimeException -> 0x09c2, IOException -> 0x09ec, zztm -> 0x09f4, zzgr -> 0x09fc, zzcf -> 0x0a04, zzrj -> 0x0a1b, zzit -> 0x0a25, TryCatch #8 {zzcf -> 0x0a04, zzgr -> 0x09fc, zzit -> 0x0a25, zzrj -> 0x0a1b, zztm -> 0x09f4, IOException -> 0x09ec, RuntimeException -> 0x09c2, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x002e, B:13:0x0033, B:14:0x0038, B:17:0x003f, B:19:0x0048, B:21:0x0056, B:23:0x005e, B:24:0x0069, B:25:0x007d, B:26:0x0095, B:27:0x00b1, B:29:0x00c0, B:30:0x00c4, B:31:0x00d5, B:33:0x00e4, B:34:0x0100, B:35:0x0113, B:36:0x011c, B:38:0x012e, B:39:0x013a, B:40:0x014a, B:42:0x0156, B:45:0x0161, B:46:0x0168, B:47:0x0175, B:50:0x017c, B:52:0x0184, B:54:0x0188, B:56:0x018e, B:58:0x0196, B:60:0x019e, B:62:0x01a1, B:67:0x01a6, B:76:0x01b3, B:78:0x01b4, B:81:0x01bb, B:83:0x01c9, B:84:0x01cc, B:86:0x01d1, B:88:0x01e1, B:89:0x01e4, B:90:0x01e9, B:91:0x01ee, B:93:0x01fa, B:94:0x0206, B:96:0x0212, B:98:0x023e, B:99:0x025e, B:100:0x0262, B:101:0x0266, B:103:0x026b, B:105:0x027c, B:107:0x0288, B:108:0x028b, B:117:0x0296, B:118:0x0297, B:119:0x029d, B:120:0x02a4, B:121:0x02b5, B:123:0x02dc, B:131:0x03f3, B:132:0x03c0, B:159:0x03bc, B:174:0x0404, B:175:0x0411, B:189:0x02fe, B:192:0x0311, B:194:0x0321, B:196:0x0338, B:198:0x0342, B:205:0x0412, B:207:0x0426, B:210:0x0430, B:212:0x043f, B:214:0x044b, B:216:0x047a, B:217:0x047f, B:218:0x0483, B:220:0x0487, B:221:0x0494, B:224:0x05f0, B:226:0x05f8, B:228:0x0600, B:231:0x0605, B:232:0x0611, B:234:0x0617, B:236:0x061f, B:241:0x062f, B:243:0x0635, B:245:0x0655, B:247:0x065b, B:240:0x0660, B:254:0x0665, B:256:0x0669, B:258:0x066f, B:260:0x0673, B:262:0x067b, B:264:0x0681, B:266:0x068b, B:269:0x0691, B:270:0x0694, B:272:0x069d, B:274:0x06af, B:276:0x06b8, B:278:0x06c0, B:281:0x06ca, B:282:0x06f6, B:284:0x06fc, B:286:0x0702, B:288:0x0709, B:301:0x04a3, B:303:0x04a9, B:306:0x04af, B:309:0x04ba, B:311:0x04bf, B:314:0x04cd, B:317:0x04d3, B:319:0x04db, B:323:0x04de, B:325:0x04e6, B:327:0x04f4, B:329:0x0530, B:331:0x053a, B:334:0x0545, B:336:0x054d, B:338:0x0550, B:341:0x0553, B:343:0x0559, B:345:0x0568, B:347:0x056e, B:349:0x057a, B:351:0x0584, B:353:0x0595, B:357:0x059b, B:356:0x05a6, B:362:0x05ab, B:364:0x05b6, B:367:0x05bb, B:369:0x05c1, B:371:0x05c9, B:373:0x05cf, B:375:0x05d5, B:379:0x05e3, B:380:0x05ea, B:382:0x05ed, B:388:0x0491, B:389:0x0715, B:393:0x0720, B:395:0x072a, B:396:0x072f, B:398:0x073d, B:399:0x0755, B:401:0x075b, B:403:0x0763, B:405:0x076a, B:408:0x0773, B:412:0x0782, B:417:0x078f, B:419:0x0795, B:427:0x07a8, B:430:0x07ad, B:438:0x07b9, B:440:0x07bf, B:444:0x07cc, B:446:0x07d4, B:448:0x07d8, B:449:0x07e3, B:451:0x07e9, B:452:0x08db, B:455:0x08e3, B:457:0x08e8, B:459:0x08f0, B:461:0x08fe, B:463:0x0905, B:467:0x0909, B:469:0x090f, B:471:0x0918, B:473:0x091e, B:475:0x0929, B:476:0x094d, B:478:0x0953, B:481:0x095c, B:484:0x097e, B:490:0x096f, B:492:0x0973, B:493:0x0979, B:495:0x0930, B:498:0x093e, B:499:0x0945, B:500:0x0946, B:501:0x07f2, B:503:0x07f9, B:505:0x07fd, B:508:0x0883, B:510:0x088f, B:513:0x080a, B:515:0x080e, B:517:0x0822, B:518:0x0830, B:520:0x083c, B:523:0x0845, B:525:0x084f, B:530:0x085a, B:536:0x0893, B:538:0x089a, B:540:0x089e, B:543:0x08a7, B:545:0x08b7, B:547:0x08bf, B:549:0x08c9, B:551:0x08ce, B:553:0x08d3, B:554:0x08d8, B:556:0x07b2, B:557:0x0983, B:560:0x098a, B:562:0x0992, B:565:0x09b0), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0617 A[Catch: RuntimeException -> 0x09c2, IOException -> 0x09ec, zztm -> 0x09f4, zzgr -> 0x09fc, zzcf -> 0x0a04, zzrj -> 0x0a1b, zzit -> 0x0a25, TryCatch #8 {zzcf -> 0x0a04, zzgr -> 0x09fc, zzit -> 0x0a25, zzrj -> 0x0a1b, zztm -> 0x09f4, IOException -> 0x09ec, RuntimeException -> 0x09c2, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x002e, B:13:0x0033, B:14:0x0038, B:17:0x003f, B:19:0x0048, B:21:0x0056, B:23:0x005e, B:24:0x0069, B:25:0x007d, B:26:0x0095, B:27:0x00b1, B:29:0x00c0, B:30:0x00c4, B:31:0x00d5, B:33:0x00e4, B:34:0x0100, B:35:0x0113, B:36:0x011c, B:38:0x012e, B:39:0x013a, B:40:0x014a, B:42:0x0156, B:45:0x0161, B:46:0x0168, B:47:0x0175, B:50:0x017c, B:52:0x0184, B:54:0x0188, B:56:0x018e, B:58:0x0196, B:60:0x019e, B:62:0x01a1, B:67:0x01a6, B:76:0x01b3, B:78:0x01b4, B:81:0x01bb, B:83:0x01c9, B:84:0x01cc, B:86:0x01d1, B:88:0x01e1, B:89:0x01e4, B:90:0x01e9, B:91:0x01ee, B:93:0x01fa, B:94:0x0206, B:96:0x0212, B:98:0x023e, B:99:0x025e, B:100:0x0262, B:101:0x0266, B:103:0x026b, B:105:0x027c, B:107:0x0288, B:108:0x028b, B:117:0x0296, B:118:0x0297, B:119:0x029d, B:120:0x02a4, B:121:0x02b5, B:123:0x02dc, B:131:0x03f3, B:132:0x03c0, B:159:0x03bc, B:174:0x0404, B:175:0x0411, B:189:0x02fe, B:192:0x0311, B:194:0x0321, B:196:0x0338, B:198:0x0342, B:205:0x0412, B:207:0x0426, B:210:0x0430, B:212:0x043f, B:214:0x044b, B:216:0x047a, B:217:0x047f, B:218:0x0483, B:220:0x0487, B:221:0x0494, B:224:0x05f0, B:226:0x05f8, B:228:0x0600, B:231:0x0605, B:232:0x0611, B:234:0x0617, B:236:0x061f, B:241:0x062f, B:243:0x0635, B:245:0x0655, B:247:0x065b, B:240:0x0660, B:254:0x0665, B:256:0x0669, B:258:0x066f, B:260:0x0673, B:262:0x067b, B:264:0x0681, B:266:0x068b, B:269:0x0691, B:270:0x0694, B:272:0x069d, B:274:0x06af, B:276:0x06b8, B:278:0x06c0, B:281:0x06ca, B:282:0x06f6, B:284:0x06fc, B:286:0x0702, B:288:0x0709, B:301:0x04a3, B:303:0x04a9, B:306:0x04af, B:309:0x04ba, B:311:0x04bf, B:314:0x04cd, B:317:0x04d3, B:319:0x04db, B:323:0x04de, B:325:0x04e6, B:327:0x04f4, B:329:0x0530, B:331:0x053a, B:334:0x0545, B:336:0x054d, B:338:0x0550, B:341:0x0553, B:343:0x0559, B:345:0x0568, B:347:0x056e, B:349:0x057a, B:351:0x0584, B:353:0x0595, B:357:0x059b, B:356:0x05a6, B:362:0x05ab, B:364:0x05b6, B:367:0x05bb, B:369:0x05c1, B:371:0x05c9, B:373:0x05cf, B:375:0x05d5, B:379:0x05e3, B:380:0x05ea, B:382:0x05ed, B:388:0x0491, B:389:0x0715, B:393:0x0720, B:395:0x072a, B:396:0x072f, B:398:0x073d, B:399:0x0755, B:401:0x075b, B:403:0x0763, B:405:0x076a, B:408:0x0773, B:412:0x0782, B:417:0x078f, B:419:0x0795, B:427:0x07a8, B:430:0x07ad, B:438:0x07b9, B:440:0x07bf, B:444:0x07cc, B:446:0x07d4, B:448:0x07d8, B:449:0x07e3, B:451:0x07e9, B:452:0x08db, B:455:0x08e3, B:457:0x08e8, B:459:0x08f0, B:461:0x08fe, B:463:0x0905, B:467:0x0909, B:469:0x090f, B:471:0x0918, B:473:0x091e, B:475:0x0929, B:476:0x094d, B:478:0x0953, B:481:0x095c, B:484:0x097e, B:490:0x096f, B:492:0x0973, B:493:0x0979, B:495:0x0930, B:498:0x093e, B:499:0x0945, B:500:0x0946, B:501:0x07f2, B:503:0x07f9, B:505:0x07fd, B:508:0x0883, B:510:0x088f, B:513:0x080a, B:515:0x080e, B:517:0x0822, B:518:0x0830, B:520:0x083c, B:523:0x0845, B:525:0x084f, B:530:0x085a, B:536:0x0893, B:538:0x089a, B:540:0x089e, B:543:0x08a7, B:545:0x08b7, B:547:0x08bf, B:549:0x08c9, B:551:0x08ce, B:553:0x08d3, B:554:0x08d8, B:556:0x07b2, B:557:0x0983, B:560:0x098a, B:562:0x0992, B:565:0x09b0), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0663 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x066f A[Catch: RuntimeException -> 0x09c2, IOException -> 0x09ec, zztm -> 0x09f4, zzgr -> 0x09fc, zzcf -> 0x0a04, zzrj -> 0x0a1b, zzit -> 0x0a25, TryCatch #8 {zzcf -> 0x0a04, zzgr -> 0x09fc, zzit -> 0x0a25, zzrj -> 0x0a1b, zztm -> 0x09f4, IOException -> 0x09ec, RuntimeException -> 0x09c2, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x002e, B:13:0x0033, B:14:0x0038, B:17:0x003f, B:19:0x0048, B:21:0x0056, B:23:0x005e, B:24:0x0069, B:25:0x007d, B:26:0x0095, B:27:0x00b1, B:29:0x00c0, B:30:0x00c4, B:31:0x00d5, B:33:0x00e4, B:34:0x0100, B:35:0x0113, B:36:0x011c, B:38:0x012e, B:39:0x013a, B:40:0x014a, B:42:0x0156, B:45:0x0161, B:46:0x0168, B:47:0x0175, B:50:0x017c, B:52:0x0184, B:54:0x0188, B:56:0x018e, B:58:0x0196, B:60:0x019e, B:62:0x01a1, B:67:0x01a6, B:76:0x01b3, B:78:0x01b4, B:81:0x01bb, B:83:0x01c9, B:84:0x01cc, B:86:0x01d1, B:88:0x01e1, B:89:0x01e4, B:90:0x01e9, B:91:0x01ee, B:93:0x01fa, B:94:0x0206, B:96:0x0212, B:98:0x023e, B:99:0x025e, B:100:0x0262, B:101:0x0266, B:103:0x026b, B:105:0x027c, B:107:0x0288, B:108:0x028b, B:117:0x0296, B:118:0x0297, B:119:0x029d, B:120:0x02a4, B:121:0x02b5, B:123:0x02dc, B:131:0x03f3, B:132:0x03c0, B:159:0x03bc, B:174:0x0404, B:175:0x0411, B:189:0x02fe, B:192:0x0311, B:194:0x0321, B:196:0x0338, B:198:0x0342, B:205:0x0412, B:207:0x0426, B:210:0x0430, B:212:0x043f, B:214:0x044b, B:216:0x047a, B:217:0x047f, B:218:0x0483, B:220:0x0487, B:221:0x0494, B:224:0x05f0, B:226:0x05f8, B:228:0x0600, B:231:0x0605, B:232:0x0611, B:234:0x0617, B:236:0x061f, B:241:0x062f, B:243:0x0635, B:245:0x0655, B:247:0x065b, B:240:0x0660, B:254:0x0665, B:256:0x0669, B:258:0x066f, B:260:0x0673, B:262:0x067b, B:264:0x0681, B:266:0x068b, B:269:0x0691, B:270:0x0694, B:272:0x069d, B:274:0x06af, B:276:0x06b8, B:278:0x06c0, B:281:0x06ca, B:282:0x06f6, B:284:0x06fc, B:286:0x0702, B:288:0x0709, B:301:0x04a3, B:303:0x04a9, B:306:0x04af, B:309:0x04ba, B:311:0x04bf, B:314:0x04cd, B:317:0x04d3, B:319:0x04db, B:323:0x04de, B:325:0x04e6, B:327:0x04f4, B:329:0x0530, B:331:0x053a, B:334:0x0545, B:336:0x054d, B:338:0x0550, B:341:0x0553, B:343:0x0559, B:345:0x0568, B:347:0x056e, B:349:0x057a, B:351:0x0584, B:353:0x0595, B:357:0x059b, B:356:0x05a6, B:362:0x05ab, B:364:0x05b6, B:367:0x05bb, B:369:0x05c1, B:371:0x05c9, B:373:0x05cf, B:375:0x05d5, B:379:0x05e3, B:380:0x05ea, B:382:0x05ed, B:388:0x0491, B:389:0x0715, B:393:0x0720, B:395:0x072a, B:396:0x072f, B:398:0x073d, B:399:0x0755, B:401:0x075b, B:403:0x0763, B:405:0x076a, B:408:0x0773, B:412:0x0782, B:417:0x078f, B:419:0x0795, B:427:0x07a8, B:430:0x07ad, B:438:0x07b9, B:440:0x07bf, B:444:0x07cc, B:446:0x07d4, B:448:0x07d8, B:449:0x07e3, B:451:0x07e9, B:452:0x08db, B:455:0x08e3, B:457:0x08e8, B:459:0x08f0, B:461:0x08fe, B:463:0x0905, B:467:0x0909, B:469:0x090f, B:471:0x0918, B:473:0x091e, B:475:0x0929, B:476:0x094d, B:478:0x0953, B:481:0x095c, B:484:0x097e, B:490:0x096f, B:492:0x0973, B:493:0x0979, B:495:0x0930, B:498:0x093e, B:499:0x0945, B:500:0x0946, B:501:0x07f2, B:503:0x07f9, B:505:0x07fd, B:508:0x0883, B:510:0x088f, B:513:0x080a, B:515:0x080e, B:517:0x0822, B:518:0x0830, B:520:0x083c, B:523:0x0845, B:525:0x084f, B:530:0x085a, B:536:0x0893, B:538:0x089a, B:540:0x089e, B:543:0x08a7, B:545:0x08b7, B:547:0x08bf, B:549:0x08c9, B:551:0x08ce, B:553:0x08d3, B:554:0x08d8, B:556:0x07b2, B:557:0x0983, B:560:0x098a, B:562:0x0992, B:565:0x09b0), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0691 A[Catch: RuntimeException -> 0x09c2, IOException -> 0x09ec, zztm -> 0x09f4, zzgr -> 0x09fc, zzcf -> 0x0a04, zzrj -> 0x0a1b, zzit -> 0x0a25, TryCatch #8 {zzcf -> 0x0a04, zzgr -> 0x09fc, zzit -> 0x0a25, zzrj -> 0x0a1b, zztm -> 0x09f4, IOException -> 0x09ec, RuntimeException -> 0x09c2, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x002e, B:13:0x0033, B:14:0x0038, B:17:0x003f, B:19:0x0048, B:21:0x0056, B:23:0x005e, B:24:0x0069, B:25:0x007d, B:26:0x0095, B:27:0x00b1, B:29:0x00c0, B:30:0x00c4, B:31:0x00d5, B:33:0x00e4, B:34:0x0100, B:35:0x0113, B:36:0x011c, B:38:0x012e, B:39:0x013a, B:40:0x014a, B:42:0x0156, B:45:0x0161, B:46:0x0168, B:47:0x0175, B:50:0x017c, B:52:0x0184, B:54:0x0188, B:56:0x018e, B:58:0x0196, B:60:0x019e, B:62:0x01a1, B:67:0x01a6, B:76:0x01b3, B:78:0x01b4, B:81:0x01bb, B:83:0x01c9, B:84:0x01cc, B:86:0x01d1, B:88:0x01e1, B:89:0x01e4, B:90:0x01e9, B:91:0x01ee, B:93:0x01fa, B:94:0x0206, B:96:0x0212, B:98:0x023e, B:99:0x025e, B:100:0x0262, B:101:0x0266, B:103:0x026b, B:105:0x027c, B:107:0x0288, B:108:0x028b, B:117:0x0296, B:118:0x0297, B:119:0x029d, B:120:0x02a4, B:121:0x02b5, B:123:0x02dc, B:131:0x03f3, B:132:0x03c0, B:159:0x03bc, B:174:0x0404, B:175:0x0411, B:189:0x02fe, B:192:0x0311, B:194:0x0321, B:196:0x0338, B:198:0x0342, B:205:0x0412, B:207:0x0426, B:210:0x0430, B:212:0x043f, B:214:0x044b, B:216:0x047a, B:217:0x047f, B:218:0x0483, B:220:0x0487, B:221:0x0494, B:224:0x05f0, B:226:0x05f8, B:228:0x0600, B:231:0x0605, B:232:0x0611, B:234:0x0617, B:236:0x061f, B:241:0x062f, B:243:0x0635, B:245:0x0655, B:247:0x065b, B:240:0x0660, B:254:0x0665, B:256:0x0669, B:258:0x066f, B:260:0x0673, B:262:0x067b, B:264:0x0681, B:266:0x068b, B:269:0x0691, B:270:0x0694, B:272:0x069d, B:274:0x06af, B:276:0x06b8, B:278:0x06c0, B:281:0x06ca, B:282:0x06f6, B:284:0x06fc, B:286:0x0702, B:288:0x0709, B:301:0x04a3, B:303:0x04a9, B:306:0x04af, B:309:0x04ba, B:311:0x04bf, B:314:0x04cd, B:317:0x04d3, B:319:0x04db, B:323:0x04de, B:325:0x04e6, B:327:0x04f4, B:329:0x0530, B:331:0x053a, B:334:0x0545, B:336:0x054d, B:338:0x0550, B:341:0x0553, B:343:0x0559, B:345:0x0568, B:347:0x056e, B:349:0x057a, B:351:0x0584, B:353:0x0595, B:357:0x059b, B:356:0x05a6, B:362:0x05ab, B:364:0x05b6, B:367:0x05bb, B:369:0x05c1, B:371:0x05c9, B:373:0x05cf, B:375:0x05d5, B:379:0x05e3, B:380:0x05ea, B:382:0x05ed, B:388:0x0491, B:389:0x0715, B:393:0x0720, B:395:0x072a, B:396:0x072f, B:398:0x073d, B:399:0x0755, B:401:0x075b, B:403:0x0763, B:405:0x076a, B:408:0x0773, B:412:0x0782, B:417:0x078f, B:419:0x0795, B:427:0x07a8, B:430:0x07ad, B:438:0x07b9, B:440:0x07bf, B:444:0x07cc, B:446:0x07d4, B:448:0x07d8, B:449:0x07e3, B:451:0x07e9, B:452:0x08db, B:455:0x08e3, B:457:0x08e8, B:459:0x08f0, B:461:0x08fe, B:463:0x0905, B:467:0x0909, B:469:0x090f, B:471:0x0918, B:473:0x091e, B:475:0x0929, B:476:0x094d, B:478:0x0953, B:481:0x095c, B:484:0x097e, B:490:0x096f, B:492:0x0973, B:493:0x0979, B:495:0x0930, B:498:0x093e, B:499:0x0945, B:500:0x0946, B:501:0x07f2, B:503:0x07f9, B:505:0x07fd, B:508:0x0883, B:510:0x088f, B:513:0x080a, B:515:0x080e, B:517:0x0822, B:518:0x0830, B:520:0x083c, B:523:0x0845, B:525:0x084f, B:530:0x085a, B:536:0x0893, B:538:0x089a, B:540:0x089e, B:543:0x08a7, B:545:0x08b7, B:547:0x08bf, B:549:0x08c9, B:551:0x08ce, B:553:0x08d3, B:554:0x08d8, B:556:0x07b2, B:557:0x0983, B:560:0x098a, B:562:0x0992, B:565:0x09b0), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06af A[Catch: RuntimeException -> 0x09c2, IOException -> 0x09ec, zztm -> 0x09f4, zzgr -> 0x09fc, zzcf -> 0x0a04, zzrj -> 0x0a1b, zzit -> 0x0a25, TryCatch #8 {zzcf -> 0x0a04, zzgr -> 0x09fc, zzit -> 0x0a25, zzrj -> 0x0a1b, zztm -> 0x09f4, IOException -> 0x09ec, RuntimeException -> 0x09c2, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x002e, B:13:0x0033, B:14:0x0038, B:17:0x003f, B:19:0x0048, B:21:0x0056, B:23:0x005e, B:24:0x0069, B:25:0x007d, B:26:0x0095, B:27:0x00b1, B:29:0x00c0, B:30:0x00c4, B:31:0x00d5, B:33:0x00e4, B:34:0x0100, B:35:0x0113, B:36:0x011c, B:38:0x012e, B:39:0x013a, B:40:0x014a, B:42:0x0156, B:45:0x0161, B:46:0x0168, B:47:0x0175, B:50:0x017c, B:52:0x0184, B:54:0x0188, B:56:0x018e, B:58:0x0196, B:60:0x019e, B:62:0x01a1, B:67:0x01a6, B:76:0x01b3, B:78:0x01b4, B:81:0x01bb, B:83:0x01c9, B:84:0x01cc, B:86:0x01d1, B:88:0x01e1, B:89:0x01e4, B:90:0x01e9, B:91:0x01ee, B:93:0x01fa, B:94:0x0206, B:96:0x0212, B:98:0x023e, B:99:0x025e, B:100:0x0262, B:101:0x0266, B:103:0x026b, B:105:0x027c, B:107:0x0288, B:108:0x028b, B:117:0x0296, B:118:0x0297, B:119:0x029d, B:120:0x02a4, B:121:0x02b5, B:123:0x02dc, B:131:0x03f3, B:132:0x03c0, B:159:0x03bc, B:174:0x0404, B:175:0x0411, B:189:0x02fe, B:192:0x0311, B:194:0x0321, B:196:0x0338, B:198:0x0342, B:205:0x0412, B:207:0x0426, B:210:0x0430, B:212:0x043f, B:214:0x044b, B:216:0x047a, B:217:0x047f, B:218:0x0483, B:220:0x0487, B:221:0x0494, B:224:0x05f0, B:226:0x05f8, B:228:0x0600, B:231:0x0605, B:232:0x0611, B:234:0x0617, B:236:0x061f, B:241:0x062f, B:243:0x0635, B:245:0x0655, B:247:0x065b, B:240:0x0660, B:254:0x0665, B:256:0x0669, B:258:0x066f, B:260:0x0673, B:262:0x067b, B:264:0x0681, B:266:0x068b, B:269:0x0691, B:270:0x0694, B:272:0x069d, B:274:0x06af, B:276:0x06b8, B:278:0x06c0, B:281:0x06ca, B:282:0x06f6, B:284:0x06fc, B:286:0x0702, B:288:0x0709, B:301:0x04a3, B:303:0x04a9, B:306:0x04af, B:309:0x04ba, B:311:0x04bf, B:314:0x04cd, B:317:0x04d3, B:319:0x04db, B:323:0x04de, B:325:0x04e6, B:327:0x04f4, B:329:0x0530, B:331:0x053a, B:334:0x0545, B:336:0x054d, B:338:0x0550, B:341:0x0553, B:343:0x0559, B:345:0x0568, B:347:0x056e, B:349:0x057a, B:351:0x0584, B:353:0x0595, B:357:0x059b, B:356:0x05a6, B:362:0x05ab, B:364:0x05b6, B:367:0x05bb, B:369:0x05c1, B:371:0x05c9, B:373:0x05cf, B:375:0x05d5, B:379:0x05e3, B:380:0x05ea, B:382:0x05ed, B:388:0x0491, B:389:0x0715, B:393:0x0720, B:395:0x072a, B:396:0x072f, B:398:0x073d, B:399:0x0755, B:401:0x075b, B:403:0x0763, B:405:0x076a, B:408:0x0773, B:412:0x0782, B:417:0x078f, B:419:0x0795, B:427:0x07a8, B:430:0x07ad, B:438:0x07b9, B:440:0x07bf, B:444:0x07cc, B:446:0x07d4, B:448:0x07d8, B:449:0x07e3, B:451:0x07e9, B:452:0x08db, B:455:0x08e3, B:457:0x08e8, B:459:0x08f0, B:461:0x08fe, B:463:0x0905, B:467:0x0909, B:469:0x090f, B:471:0x0918, B:473:0x091e, B:475:0x0929, B:476:0x094d, B:478:0x0953, B:481:0x095c, B:484:0x097e, B:490:0x096f, B:492:0x0973, B:493:0x0979, B:495:0x0930, B:498:0x093e, B:499:0x0945, B:500:0x0946, B:501:0x07f2, B:503:0x07f9, B:505:0x07fd, B:508:0x0883, B:510:0x088f, B:513:0x080a, B:515:0x080e, B:517:0x0822, B:518:0x0830, B:520:0x083c, B:523:0x0845, B:525:0x084f, B:530:0x085a, B:536:0x0893, B:538:0x089a, B:540:0x089e, B:543:0x08a7, B:545:0x08b7, B:547:0x08bf, B:549:0x08c9, B:551:0x08ce, B:553:0x08d3, B:554:0x08d8, B:556:0x07b2, B:557:0x0983, B:560:0x098a, B:562:0x0992, B:565:0x09b0), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06fc A[Catch: RuntimeException -> 0x09c2, IOException -> 0x09ec, zztm -> 0x09f4, zzgr -> 0x09fc, zzcf -> 0x0a04, zzrj -> 0x0a1b, zzit -> 0x0a25, TryCatch #8 {zzcf -> 0x0a04, zzgr -> 0x09fc, zzit -> 0x0a25, zzrj -> 0x0a1b, zztm -> 0x09f4, IOException -> 0x09ec, RuntimeException -> 0x09c2, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x002e, B:13:0x0033, B:14:0x0038, B:17:0x003f, B:19:0x0048, B:21:0x0056, B:23:0x005e, B:24:0x0069, B:25:0x007d, B:26:0x0095, B:27:0x00b1, B:29:0x00c0, B:30:0x00c4, B:31:0x00d5, B:33:0x00e4, B:34:0x0100, B:35:0x0113, B:36:0x011c, B:38:0x012e, B:39:0x013a, B:40:0x014a, B:42:0x0156, B:45:0x0161, B:46:0x0168, B:47:0x0175, B:50:0x017c, B:52:0x0184, B:54:0x0188, B:56:0x018e, B:58:0x0196, B:60:0x019e, B:62:0x01a1, B:67:0x01a6, B:76:0x01b3, B:78:0x01b4, B:81:0x01bb, B:83:0x01c9, B:84:0x01cc, B:86:0x01d1, B:88:0x01e1, B:89:0x01e4, B:90:0x01e9, B:91:0x01ee, B:93:0x01fa, B:94:0x0206, B:96:0x0212, B:98:0x023e, B:99:0x025e, B:100:0x0262, B:101:0x0266, B:103:0x026b, B:105:0x027c, B:107:0x0288, B:108:0x028b, B:117:0x0296, B:118:0x0297, B:119:0x029d, B:120:0x02a4, B:121:0x02b5, B:123:0x02dc, B:131:0x03f3, B:132:0x03c0, B:159:0x03bc, B:174:0x0404, B:175:0x0411, B:189:0x02fe, B:192:0x0311, B:194:0x0321, B:196:0x0338, B:198:0x0342, B:205:0x0412, B:207:0x0426, B:210:0x0430, B:212:0x043f, B:214:0x044b, B:216:0x047a, B:217:0x047f, B:218:0x0483, B:220:0x0487, B:221:0x0494, B:224:0x05f0, B:226:0x05f8, B:228:0x0600, B:231:0x0605, B:232:0x0611, B:234:0x0617, B:236:0x061f, B:241:0x062f, B:243:0x0635, B:245:0x0655, B:247:0x065b, B:240:0x0660, B:254:0x0665, B:256:0x0669, B:258:0x066f, B:260:0x0673, B:262:0x067b, B:264:0x0681, B:266:0x068b, B:269:0x0691, B:270:0x0694, B:272:0x069d, B:274:0x06af, B:276:0x06b8, B:278:0x06c0, B:281:0x06ca, B:282:0x06f6, B:284:0x06fc, B:286:0x0702, B:288:0x0709, B:301:0x04a3, B:303:0x04a9, B:306:0x04af, B:309:0x04ba, B:311:0x04bf, B:314:0x04cd, B:317:0x04d3, B:319:0x04db, B:323:0x04de, B:325:0x04e6, B:327:0x04f4, B:329:0x0530, B:331:0x053a, B:334:0x0545, B:336:0x054d, B:338:0x0550, B:341:0x0553, B:343:0x0559, B:345:0x0568, B:347:0x056e, B:349:0x057a, B:351:0x0584, B:353:0x0595, B:357:0x059b, B:356:0x05a6, B:362:0x05ab, B:364:0x05b6, B:367:0x05bb, B:369:0x05c1, B:371:0x05c9, B:373:0x05cf, B:375:0x05d5, B:379:0x05e3, B:380:0x05ea, B:382:0x05ed, B:388:0x0491, B:389:0x0715, B:393:0x0720, B:395:0x072a, B:396:0x072f, B:398:0x073d, B:399:0x0755, B:401:0x075b, B:403:0x0763, B:405:0x076a, B:408:0x0773, B:412:0x0782, B:417:0x078f, B:419:0x0795, B:427:0x07a8, B:430:0x07ad, B:438:0x07b9, B:440:0x07bf, B:444:0x07cc, B:446:0x07d4, B:448:0x07d8, B:449:0x07e3, B:451:0x07e9, B:452:0x08db, B:455:0x08e3, B:457:0x08e8, B:459:0x08f0, B:461:0x08fe, B:463:0x0905, B:467:0x0909, B:469:0x090f, B:471:0x0918, B:473:0x091e, B:475:0x0929, B:476:0x094d, B:478:0x0953, B:481:0x095c, B:484:0x097e, B:490:0x096f, B:492:0x0973, B:493:0x0979, B:495:0x0930, B:498:0x093e, B:499:0x0945, B:500:0x0946, B:501:0x07f2, B:503:0x07f9, B:505:0x07fd, B:508:0x0883, B:510:0x088f, B:513:0x080a, B:515:0x080e, B:517:0x0822, B:518:0x0830, B:520:0x083c, B:523:0x0845, B:525:0x084f, B:530:0x085a, B:536:0x0893, B:538:0x089a, B:540:0x089e, B:543:0x08a7, B:545:0x08b7, B:547:0x08bf, B:549:0x08c9, B:551:0x08ce, B:553:0x08d3, B:554:0x08d8, B:556:0x07b2, B:557:0x0983, B:560:0x098a, B:562:0x0992, B:565:0x09b0), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x07a8 A[Catch: RuntimeException -> 0x09c2, IOException -> 0x09ec, zztm -> 0x09f4, zzgr -> 0x09fc, zzcf -> 0x0a04, zzrj -> 0x0a1b, zzit -> 0x0a25, TryCatch #8 {zzcf -> 0x0a04, zzgr -> 0x09fc, zzit -> 0x0a25, zzrj -> 0x0a1b, zztm -> 0x09f4, IOException -> 0x09ec, RuntimeException -> 0x09c2, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x002e, B:13:0x0033, B:14:0x0038, B:17:0x003f, B:19:0x0048, B:21:0x0056, B:23:0x005e, B:24:0x0069, B:25:0x007d, B:26:0x0095, B:27:0x00b1, B:29:0x00c0, B:30:0x00c4, B:31:0x00d5, B:33:0x00e4, B:34:0x0100, B:35:0x0113, B:36:0x011c, B:38:0x012e, B:39:0x013a, B:40:0x014a, B:42:0x0156, B:45:0x0161, B:46:0x0168, B:47:0x0175, B:50:0x017c, B:52:0x0184, B:54:0x0188, B:56:0x018e, B:58:0x0196, B:60:0x019e, B:62:0x01a1, B:67:0x01a6, B:76:0x01b3, B:78:0x01b4, B:81:0x01bb, B:83:0x01c9, B:84:0x01cc, B:86:0x01d1, B:88:0x01e1, B:89:0x01e4, B:90:0x01e9, B:91:0x01ee, B:93:0x01fa, B:94:0x0206, B:96:0x0212, B:98:0x023e, B:99:0x025e, B:100:0x0262, B:101:0x0266, B:103:0x026b, B:105:0x027c, B:107:0x0288, B:108:0x028b, B:117:0x0296, B:118:0x0297, B:119:0x029d, B:120:0x02a4, B:121:0x02b5, B:123:0x02dc, B:131:0x03f3, B:132:0x03c0, B:159:0x03bc, B:174:0x0404, B:175:0x0411, B:189:0x02fe, B:192:0x0311, B:194:0x0321, B:196:0x0338, B:198:0x0342, B:205:0x0412, B:207:0x0426, B:210:0x0430, B:212:0x043f, B:214:0x044b, B:216:0x047a, B:217:0x047f, B:218:0x0483, B:220:0x0487, B:221:0x0494, B:224:0x05f0, B:226:0x05f8, B:228:0x0600, B:231:0x0605, B:232:0x0611, B:234:0x0617, B:236:0x061f, B:241:0x062f, B:243:0x0635, B:245:0x0655, B:247:0x065b, B:240:0x0660, B:254:0x0665, B:256:0x0669, B:258:0x066f, B:260:0x0673, B:262:0x067b, B:264:0x0681, B:266:0x068b, B:269:0x0691, B:270:0x0694, B:272:0x069d, B:274:0x06af, B:276:0x06b8, B:278:0x06c0, B:281:0x06ca, B:282:0x06f6, B:284:0x06fc, B:286:0x0702, B:288:0x0709, B:301:0x04a3, B:303:0x04a9, B:306:0x04af, B:309:0x04ba, B:311:0x04bf, B:314:0x04cd, B:317:0x04d3, B:319:0x04db, B:323:0x04de, B:325:0x04e6, B:327:0x04f4, B:329:0x0530, B:331:0x053a, B:334:0x0545, B:336:0x054d, B:338:0x0550, B:341:0x0553, B:343:0x0559, B:345:0x0568, B:347:0x056e, B:349:0x057a, B:351:0x0584, B:353:0x0595, B:357:0x059b, B:356:0x05a6, B:362:0x05ab, B:364:0x05b6, B:367:0x05bb, B:369:0x05c1, B:371:0x05c9, B:373:0x05cf, B:375:0x05d5, B:379:0x05e3, B:380:0x05ea, B:382:0x05ed, B:388:0x0491, B:389:0x0715, B:393:0x0720, B:395:0x072a, B:396:0x072f, B:398:0x073d, B:399:0x0755, B:401:0x075b, B:403:0x0763, B:405:0x076a, B:408:0x0773, B:412:0x0782, B:417:0x078f, B:419:0x0795, B:427:0x07a8, B:430:0x07ad, B:438:0x07b9, B:440:0x07bf, B:444:0x07cc, B:446:0x07d4, B:448:0x07d8, B:449:0x07e3, B:451:0x07e9, B:452:0x08db, B:455:0x08e3, B:457:0x08e8, B:459:0x08f0, B:461:0x08fe, B:463:0x0905, B:467:0x0909, B:469:0x090f, B:471:0x0918, B:473:0x091e, B:475:0x0929, B:476:0x094d, B:478:0x0953, B:481:0x095c, B:484:0x097e, B:490:0x096f, B:492:0x0973, B:493:0x0979, B:495:0x0930, B:498:0x093e, B:499:0x0945, B:500:0x0946, B:501:0x07f2, B:503:0x07f9, B:505:0x07fd, B:508:0x0883, B:510:0x088f, B:513:0x080a, B:515:0x080e, B:517:0x0822, B:518:0x0830, B:520:0x083c, B:523:0x0845, B:525:0x084f, B:530:0x085a, B:536:0x0893, B:538:0x089a, B:540:0x089e, B:543:0x08a7, B:545:0x08b7, B:547:0x08bf, B:549:0x08c9, B:551:0x08ce, B:553:0x08d3, B:554:0x08d8, B:556:0x07b2, B:557:0x0983, B:560:0x098a, B:562:0x0992, B:565:0x09b0), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0953 A[Catch: RuntimeException -> 0x09c2, IOException -> 0x09ec, zztm -> 0x09f4, zzgr -> 0x09fc, zzcf -> 0x0a04, zzrj -> 0x0a1b, zzit -> 0x0a25, TryCatch #8 {zzcf -> 0x0a04, zzgr -> 0x09fc, zzit -> 0x0a25, zzrj -> 0x0a1b, zztm -> 0x09f4, IOException -> 0x09ec, RuntimeException -> 0x09c2, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:12:0x002e, B:13:0x0033, B:14:0x0038, B:17:0x003f, B:19:0x0048, B:21:0x0056, B:23:0x005e, B:24:0x0069, B:25:0x007d, B:26:0x0095, B:27:0x00b1, B:29:0x00c0, B:30:0x00c4, B:31:0x00d5, B:33:0x00e4, B:34:0x0100, B:35:0x0113, B:36:0x011c, B:38:0x012e, B:39:0x013a, B:40:0x014a, B:42:0x0156, B:45:0x0161, B:46:0x0168, B:47:0x0175, B:50:0x017c, B:52:0x0184, B:54:0x0188, B:56:0x018e, B:58:0x0196, B:60:0x019e, B:62:0x01a1, B:67:0x01a6, B:76:0x01b3, B:78:0x01b4, B:81:0x01bb, B:83:0x01c9, B:84:0x01cc, B:86:0x01d1, B:88:0x01e1, B:89:0x01e4, B:90:0x01e9, B:91:0x01ee, B:93:0x01fa, B:94:0x0206, B:96:0x0212, B:98:0x023e, B:99:0x025e, B:100:0x0262, B:101:0x0266, B:103:0x026b, B:105:0x027c, B:107:0x0288, B:108:0x028b, B:117:0x0296, B:118:0x0297, B:119:0x029d, B:120:0x02a4, B:121:0x02b5, B:123:0x02dc, B:131:0x03f3, B:132:0x03c0, B:159:0x03bc, B:174:0x0404, B:175:0x0411, B:189:0x02fe, B:192:0x0311, B:194:0x0321, B:196:0x0338, B:198:0x0342, B:205:0x0412, B:207:0x0426, B:210:0x0430, B:212:0x043f, B:214:0x044b, B:216:0x047a, B:217:0x047f, B:218:0x0483, B:220:0x0487, B:221:0x0494, B:224:0x05f0, B:226:0x05f8, B:228:0x0600, B:231:0x0605, B:232:0x0611, B:234:0x0617, B:236:0x061f, B:241:0x062f, B:243:0x0635, B:245:0x0655, B:247:0x065b, B:240:0x0660, B:254:0x0665, B:256:0x0669, B:258:0x066f, B:260:0x0673, B:262:0x067b, B:264:0x0681, B:266:0x068b, B:269:0x0691, B:270:0x0694, B:272:0x069d, B:274:0x06af, B:276:0x06b8, B:278:0x06c0, B:281:0x06ca, B:282:0x06f6, B:284:0x06fc, B:286:0x0702, B:288:0x0709, B:301:0x04a3, B:303:0x04a9, B:306:0x04af, B:309:0x04ba, B:311:0x04bf, B:314:0x04cd, B:317:0x04d3, B:319:0x04db, B:323:0x04de, B:325:0x04e6, B:327:0x04f4, B:329:0x0530, B:331:0x053a, B:334:0x0545, B:336:0x054d, B:338:0x0550, B:341:0x0553, B:343:0x0559, B:345:0x0568, B:347:0x056e, B:349:0x057a, B:351:0x0584, B:353:0x0595, B:357:0x059b, B:356:0x05a6, B:362:0x05ab, B:364:0x05b6, B:367:0x05bb, B:369:0x05c1, B:371:0x05c9, B:373:0x05cf, B:375:0x05d5, B:379:0x05e3, B:380:0x05ea, B:382:0x05ed, B:388:0x0491, B:389:0x0715, B:393:0x0720, B:395:0x072a, B:396:0x072f, B:398:0x073d, B:399:0x0755, B:401:0x075b, B:403:0x0763, B:405:0x076a, B:408:0x0773, B:412:0x0782, B:417:0x078f, B:419:0x0795, B:427:0x07a8, B:430:0x07ad, B:438:0x07b9, B:440:0x07bf, B:444:0x07cc, B:446:0x07d4, B:448:0x07d8, B:449:0x07e3, B:451:0x07e9, B:452:0x08db, B:455:0x08e3, B:457:0x08e8, B:459:0x08f0, B:461:0x08fe, B:463:0x0905, B:467:0x0909, B:469:0x090f, B:471:0x0918, B:473:0x091e, B:475:0x0929, B:476:0x094d, B:478:0x0953, B:481:0x095c, B:484:0x097e, B:490:0x096f, B:492:0x0973, B:493:0x0979, B:495:0x0930, B:498:0x093e, B:499:0x0945, B:500:0x0946, B:501:0x07f2, B:503:0x07f9, B:505:0x07fd, B:508:0x0883, B:510:0x088f, B:513:0x080a, B:515:0x080e, B:517:0x0822, B:518:0x0830, B:520:0x083c, B:523:0x0845, B:525:0x084f, B:530:0x085a, B:536:0x0893, B:538:0x089a, B:540:0x089e, B:543:0x08a7, B:545:0x08b7, B:547:0x08bf, B:549:0x08c9, B:551:0x08ce, B:553:0x08d3, B:554:0x08d8, B:556:0x07b2, B:557:0x0983, B:560:0x098a, B:562:0x0992, B:565:0x09b0), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0967  */
    /* JADX WARN: Type inference failed for: r2v35, types: [com.google.android.gms.internal.ads.zzhs, com.google.android.gms.internal.ads.zzym] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        boolean z;
        boolean z2;
        zzlc zze;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        boolean z5;
        zzlc zze2;
        boolean z6;
        zzlc zzd;
        zzlc zzg;
        zzlc zza;
        char c;
        boolean z7;
        int i3;
        int i4;
        zzld zzf;
        long longValue;
        long j;
        boolean z8;
        zzuk zzukVar;
        zzuk zzukVar2;
        Throwable th;
        Throwable th2;
        long j2;
        long j3;
        long zzu;
        long j4;
        zzls zzlsVar;
        int i5;
        zzls zzy;
        int i6;
        List list;
        zzwd zzwdVar;
        List list2;
        zzwd zzwdVar2;
        int i7;
        long j5;
        List list3;
        zzwd zzwdVar3;
        try {
        } catch (zzcf e) {
            zzC(e, e.zzb == 1 ? true != e.zza ? 3003 : AdError.MEDIATION_ERROR_CODE : 1000);
        } catch (zzgr e2) {
            zzC(e2, e2.zza);
        } catch (zzit e3) {
            zzit zzitVar = e3;
            if (zzitVar.zze == 1 && (zze = this.zzq.zze()) != null) {
                zzitVar = zzitVar.zza(zze.zzf.zza);
            }
            if (zzitVar.zzk && (this.zzK == null || zzitVar.zzb == 5003)) {
                zzez.zzg("ExoPlayerImplInternal", "Recoverable renderer error", zzitVar);
                zzit zzitVar2 = this.zzK;
                if (zzitVar2 != null) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzitVar2, zzitVar);
                    zzitVar = this.zzK;
                } else {
                    this.zzK = zzitVar;
                }
                zzeq zzeqVar = this.zzh;
                zzeqVar.zzk(zzeqVar.zzc(25, zzitVar));
            } else {
                zzit zzitVar3 = this.zzK;
                if (zzitVar3 != null) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzitVar3, zzitVar);
                    zzitVar = this.zzK;
                }
                zzit zzitVar4 = zzitVar;
                zzez.zzd("ExoPlayerImplInternal", "Playback error", zzitVar4);
                z = true;
                if (zzitVar4.zze == 1) {
                    zzlf zzlfVar = this.zzq;
                    if (zzlfVar.zzd() != zzlfVar.zze()) {
                        while (true) {
                            zzlf zzlfVar2 = this.zzq;
                            if (zzlfVar2.zzd() == zzlfVar2.zze()) {
                                break;
                            }
                            this.zzq.zza();
                        }
                        zzlc zzd2 = this.zzq.zzd();
                        zzd2.getClass();
                        zzld zzldVar = zzd2.zzf;
                        zzuk zzukVar3 = zzldVar.zza;
                        long j6 = zzldVar.zzb;
                        this.zzu = zzy(zzukVar3, j6, zzldVar.zzc, j6, true, 0);
                    }
                    z2 = false;
                    z = true;
                } else {
                    z2 = false;
                }
                zzV(z, z2);
                this.zzu = this.zzu.zzd(zzitVar4);
            }
        } catch (zzrj e4) {
            zzC(e4, e4.zza);
        } catch (zztm e5) {
            zzC(e5, 1002);
        } catch (IOException e6) {
            zzC(e6, AdError.SERVER_ERROR_CODE);
        } catch (RuntimeException e7) {
            zzit zzd3 = zzit.zzd(e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            zzez.zzd("ExoPlayerImplInternal", "Playback error", zzd3);
            zzV(true, false);
            this.zzu = this.zzu.zzd(zzd3);
        }
        switch (message.what) {
            case 0:
                this.zzv.zza(1);
                zzL(false, false, false, true);
                this.zzf.zzb();
                zzT(true != this.zzu.zza.zzo() ? 2 : 4);
                this.zzr.zzg(this.zzg);
                this.zzh.zzi(2);
                z = true;
                zzI();
                return z;
            case 1:
                zzS(message.arg1 != 0, message.arg2, true, 1);
                z = true;
                zzI();
                return z;
            case 2:
                int i8 = 4;
                long uptimeMillis = SystemClock.uptimeMillis();
                this.zzh.zzf(2);
                if (!this.zzu.zza.zzo() && this.zzr.zzj()) {
                    this.zzq.zzk(this.zzH);
                    if (this.zzq.zzn() && (zzf = this.zzq.zzf(this.zzH, this.zzu)) != null) {
                        zzlc zzr = this.zzq.zzr(this.zzc, this.zzd, this.zzf.zzi(), this.zzr, zzf, this.zze);
                        zzr.zza.zzl(this, zzf.zzb);
                        if (this.zzq.zzd() == zzr) {
                            zzN(zzf.zzb);
                        }
                        zzD(false);
                    }
                    if (this.zzB) {
                        this.zzB = zzad();
                        zzX();
                    } else {
                        zzH();
                    }
                    zzlc zze3 = this.zzq.zze();
                    if (zze3 != null) {
                        if (zze3.zzg() != null && !this.zzy) {
                            zzlc zze4 = this.zzq.zze();
                            if (zze4.zzd) {
                                int i9 = 0;
                                while (true) {
                                    zzlz[] zzlzVarArr = this.zza;
                                    int length = zzlzVarArr.length;
                                    if (i9 < 2) {
                                        zzlz zzlzVar = zzlzVarArr[i9];
                                        zzwa zzwaVar = zze4.zzc[i9];
                                        if (zzlzVar.zzo() == zzwaVar) {
                                            if (zzwaVar == null || zzlzVar.zzO()) {
                                                i9++;
                                            } else {
                                                zze4.zzg();
                                                boolean z9 = zze4.zzf.zzf;
                                            }
                                        }
                                    } else if (zze3.zzg().zzd || this.zzH >= zze3.zzg().zzf()) {
                                        zzyf zzi = zze3.zzi();
                                        zzlc zzb = this.zzq.zzb();
                                        zzyf zzi2 = zzb.zzi();
                                        zzda zzdaVar = this.zzu.zza;
                                        zzyf zzyfVar = zzi2;
                                        zzaa(zzdaVar, zzb.zzf.zza, zzdaVar, zze3.zzf.zza, -9223372036854775807L, false);
                                        if (!zzb.zzd || zzb.zza.zzd() == -9223372036854775807L) {
                                            int i10 = 0;
                                            while (true) {
                                                int length2 = this.zza.length;
                                                if (i10 < 2) {
                                                    boolean zzb2 = zzi.zzb(i10);
                                                    zzyf zzyfVar2 = zzyfVar;
                                                    boolean zzb3 = zzyfVar2.zzb(i10);
                                                    if (zzb2 && !this.zza[i10].zzP()) {
                                                        this.zzc[i10].zzb();
                                                        zzmc zzmcVar = zzi.zzb[i10];
                                                        zzmc zzmcVar2 = zzyfVar2.zzb[i10];
                                                        if (!zzb3 || !zzmcVar2.equals(zzmcVar)) {
                                                            zzam(this.zza[i10], zzb.zzf());
                                                        }
                                                    }
                                                    i10++;
                                                    zzyfVar = zzyfVar2;
                                                }
                                            }
                                        } else {
                                            long zzf2 = zzb.zzf();
                                            zzlz[] zzlzVarArr2 = this.zza;
                                            int length3 = zzlzVarArr2.length;
                                            for (int i11 = 0; i11 < 2; i11++) {
                                                zzlz zzlzVar2 = zzlzVarArr2[i11];
                                                if (zzlzVar2.zzo() != null) {
                                                    zzam(zzlzVar2, zzf2);
                                                }
                                            }
                                            if (!zzb.zzr()) {
                                                this.zzq.zzm(zzb);
                                                zzD(false);
                                                zzH();
                                            }
                                        }
                                    }
                                }
                                zze2 = this.zzq.zze();
                                if (zze2 != null && this.zzq.zzd() != zze2 && !zze2.zzg) {
                                    zzlc zze5 = this.zzq.zze();
                                    zzyf zzi3 = zze5.zzi();
                                    i4 = 0;
                                    boolean z10 = false;
                                    while (true) {
                                        zzlz[] zzlzVarArr3 = this.zza;
                                        int length4 = zzlzVarArr3.length;
                                        if (i4 >= 2) {
                                            zzlz zzlzVar3 = zzlzVarArr3[i4];
                                            if (zzae(zzlzVar3)) {
                                                zzwa zzo = zzlzVar3.zzo();
                                                zzwa zzwaVar2 = zze5.zzc[i4];
                                                if (!zzi3.zzb(i4) || zzo != zzwaVar2) {
                                                    if (!zzlzVar3.zzP()) {
                                                        zzlzVar3.zzF(zzaj(zzi3.zzc[i4]), zze5.zzc[i4], zze5.zzf(), zze5.zze(), zze5.zzf.zza);
                                                    } else if (zzlzVar3.zzU()) {
                                                        zzz(zzlzVar3);
                                                    } else {
                                                        z10 = true;
                                                    }
                                                }
                                            }
                                            i4++;
                                        } else if (!z10) {
                                            zzA();
                                        }
                                    }
                                }
                                z6 = false;
                                while (zzah() && !this.zzy && (zzd = this.zzq.zzd()) != null && (zzg = zzd.zzg()) != null && this.zzH >= zzg.zzf() && zzg.zzg) {
                                    if (z6) {
                                        zzI();
                                    }
                                    zza = this.zzq.zza();
                                    zza.getClass();
                                    if (this.zzu.zzb.zza.equals(zza.zzf.zza.zza)) {
                                        c = 65535;
                                    } else {
                                        zzuk zzukVar4 = this.zzu.zzb;
                                        c = 65535;
                                        if (zzukVar4.zzb == -1) {
                                            zzuk zzukVar5 = zza.zzf.zza;
                                            if (zzukVar5.zzb == -1 && zzukVar4.zze != zzukVar5.zze) {
                                                z7 = true;
                                                zzld zzldVar2 = zza.zzf;
                                                zzuk zzukVar6 = zzldVar2.zza;
                                                long j7 = zzldVar2.zzb;
                                                this.zzu = zzy(zzukVar6, j7, zzldVar2.zzc, j7, !z7, 0);
                                                zzM();
                                                zzZ();
                                                zzyf zzi4 = this.zzq.zzd().zzi();
                                                i3 = 0;
                                                while (true) {
                                                    int length5 = this.zza.length;
                                                    if (i3 < 2) {
                                                        if (zzi4.zzb(i3)) {
                                                            this.zza[i3].zzs();
                                                        }
                                                        i3++;
                                                    }
                                                }
                                                z6 = true;
                                            }
                                        }
                                    }
                                    z7 = false;
                                    zzld zzldVar22 = zza.zzf;
                                    zzuk zzukVar62 = zzldVar22.zza;
                                    long j72 = zzldVar22.zzb;
                                    this.zzu = zzy(zzukVar62, j72, zzldVar22.zzc, j72, !z7, 0);
                                    zzM();
                                    zzZ();
                                    zzyf zzi42 = this.zzq.zzd().zzi();
                                    i3 = 0;
                                    while (true) {
                                        int length52 = this.zza.length;
                                        if (i3 < 2) {
                                            break;
                                        }
                                        i3++;
                                    }
                                    z6 = true;
                                }
                                i8 = 4;
                            }
                        }
                        if (zze3.zzf.zzi || this.zzy) {
                            int i12 = 0;
                            while (true) {
                                zzlz[] zzlzVarArr4 = this.zza;
                                int length6 = zzlzVarArr4.length;
                                if (i12 < 2) {
                                    zzlz zzlzVar4 = zzlzVarArr4[i12];
                                    zzwa zzwaVar3 = zze3.zzc[i12];
                                    if (zzwaVar3 != null && zzlzVar4.zzo() == zzwaVar3 && zzlzVar4.zzO()) {
                                        long j8 = zze3.zzf.zze;
                                        zzam(zzlzVar4, (j8 == -9223372036854775807L || j8 == Long.MIN_VALUE) ? -9223372036854775807L : zze3.zze() + j8);
                                    }
                                    i12++;
                                }
                            }
                        }
                        zze2 = this.zzq.zze();
                        if (zze2 != null) {
                            zzlc zze52 = this.zzq.zze();
                            zzyf zzi32 = zze52.zzi();
                            i4 = 0;
                            boolean z102 = false;
                            while (true) {
                                zzlz[] zzlzVarArr32 = this.zza;
                                int length42 = zzlzVarArr32.length;
                                if (i4 >= 2) {
                                }
                                i4++;
                            }
                        }
                        z6 = false;
                        while (zzah()) {
                            if (z6) {
                            }
                            zza = this.zzq.zza();
                            zza.getClass();
                            if (this.zzu.zzb.zza.equals(zza.zzf.zza.zza)) {
                            }
                            z7 = false;
                            zzld zzldVar222 = zza.zzf;
                            zzuk zzukVar622 = zzldVar222.zza;
                            long j722 = zzldVar222.zzb;
                            this.zzu = zzy(zzukVar622, j722, zzldVar222.zzc, j722, !z7, 0);
                            zzM();
                            zzZ();
                            zzyf zzi422 = this.zzq.zzd().zzi();
                            i3 = 0;
                            while (true) {
                                int length522 = this.zza.length;
                                if (i3 < 2) {
                                }
                                i3++;
                            }
                            z6 = true;
                        }
                        i8 = 4;
                    }
                    zze2 = this.zzq.zze();
                    if (zze2 != null) {
                    }
                    z6 = false;
                    while (zzah()) {
                    }
                    i8 = 4;
                }
                int i13 = this.zzu.zze;
                z = true;
                if (i13 != 1) {
                    if (i13 != i8) {
                        zzlc zzd4 = this.zzq.zzd();
                        if (zzd4 == null) {
                            zzP(uptimeMillis, 10L);
                        } else {
                            int i14 = zzfs.zza;
                            Trace.beginSection("doSomeWork");
                            zzZ();
                            if (zzd4.zzd) {
                                long zzq = zzfs.zzq(SystemClock.elapsedRealtime());
                                zzd4.zza.zzj(this.zzu.zzr - this.zzm, false);
                                z3 = true;
                                z4 = true;
                                int i15 = 0;
                                while (true) {
                                    zzlz[] zzlzVarArr5 = this.zza;
                                    int length7 = zzlzVarArr5.length;
                                    if (i15 < 2) {
                                        zzlz zzlzVar5 = zzlzVarArr5[i15];
                                        if (zzae(zzlzVar5)) {
                                            zzlzVar5.zzT(this.zzH, zzq);
                                            boolean z11 = z3 && zzlzVar5.zzU();
                                            boolean z12 = zzd4.zzc[i15] != zzlzVar5.zzo();
                                            boolean z13 = !z12 && zzlzVar5.zzO();
                                            if (!z12 && !z13 && !zzlzVar5.zzV() && !zzlzVar5.zzU()) {
                                                z5 = false;
                                                boolean z14 = !z4 && z5;
                                                if (!z5) {
                                                    zzlzVar5.zzv();
                                                }
                                                z4 = z14;
                                                z3 = z11;
                                            }
                                            z5 = true;
                                            if (z4) {
                                            }
                                            if (!z5) {
                                            }
                                            z4 = z14;
                                            z3 = z11;
                                        }
                                        i15++;
                                    }
                                }
                            } else {
                                zzd4.zza.zzk();
                                z3 = true;
                                z4 = true;
                            }
                            long j9 = zzd4.zzf.zze;
                            if (z3 && zzd4.zzd && (j9 == -9223372036854775807L || j9 <= this.zzu.zzr)) {
                                if (this.zzy) {
                                    this.zzy = false;
                                    zzS(false, this.zzu.zzm, false, 5);
                                }
                                if (zzd4.zzf.zzi) {
                                    zzT(i8);
                                    zzW();
                                    i = 3;
                                    int i16 = 2;
                                    if (this.zzu.zze == 2) {
                                        int i17 = 0;
                                        while (true) {
                                            zzlz[] zzlzVarArr6 = this.zza;
                                            int length8 = zzlzVarArr6.length;
                                            if (i17 < i16) {
                                                if (zzae(zzlzVarArr6[i17]) && this.zza[i17].zzo() == zzd4.zzc[i17]) {
                                                    this.zza[i17].zzv();
                                                }
                                                i17++;
                                                i16 = 2;
                                            } else {
                                                zzls zzlsVar2 = this.zzu;
                                                if (!zzlsVar2.zzg && zzlsVar2.zzq < 500000 && zzad()) {
                                                    if (this.zzL == -9223372036854775807L) {
                                                        this.zzL = SystemClock.elapsedRealtime();
                                                    } else if (SystemClock.elapsedRealtime() - this.zzL >= 4000) {
                                                        throw new IllegalStateException("Playback stuck buffering and not loading");
                                                    }
                                                    boolean z15 = !zzah() && this.zzu.zze == i;
                                                    boolean z16 = this.zzu.zzo;
                                                    i2 = this.zzu.zze;
                                                    if (i2 != i8) {
                                                        if (!z15 && i2 != 2) {
                                                            if (i2 == i && this.zzF != 0) {
                                                                zzP(uptimeMillis, 1000L);
                                                            }
                                                        }
                                                        zzP(uptimeMillis, 10L);
                                                    }
                                                    Trace.endSection();
                                                }
                                            }
                                        }
                                    }
                                    this.zzL = -9223372036854775807L;
                                    if (zzah()) {
                                    }
                                    boolean z162 = this.zzu.zzo;
                                    i2 = this.zzu.zze;
                                    if (i2 != i8) {
                                    }
                                    Trace.endSection();
                                }
                            }
                            zzls zzlsVar3 = this.zzu;
                            if (zzlsVar3.zze == 2) {
                                if (this.zzF == 0) {
                                    break;
                                } else if (z4) {
                                    if (zzlsVar3.zzg) {
                                        zzlc zzd5 = this.zzq.zzd();
                                        long zzb4 = zzai(this.zzu.zza, zzd5.zzf.zza) ? this.zzN.zzb() : -9223372036854775807L;
                                        zzlc zzc = this.zzq.zzc();
                                        boolean z17 = zzc.zzr() && zzc.zzf.zzi;
                                        boolean z18 = zzc.zzf.zza.zzb() && !zzc.zzd;
                                        if (!z17) {
                                            if (!z18) {
                                                if (this.zzf.zzh(this.zzu.zza, zzd5.zzf.zza, zzs(), this.zzn.zzc().zzc, this.zzz, zzb4)) {
                                                }
                                            }
                                        }
                                    }
                                    i = 3;
                                    zzT(3);
                                    this.zzK = null;
                                    if (zzah()) {
                                        zzU();
                                    }
                                }
                                int i162 = 2;
                                if (this.zzu.zze == 2) {
                                }
                                this.zzL = -9223372036854775807L;
                                if (zzah()) {
                                }
                                boolean z1622 = this.zzu.zzo;
                                i2 = this.zzu.zze;
                                if (i2 != i8) {
                                }
                                Trace.endSection();
                            }
                            i = 3;
                            if (this.zzu.zze == 3) {
                                if (this.zzF == 0) {
                                    if (!zzaf()) {
                                        zzab(zzah(), false);
                                        zzT(2);
                                        if (this.zzz) {
                                            for (zzlc zzd6 = this.zzq.zzd(); zzd6 != null; zzd6 = zzd6.zzg()) {
                                                for (zzxy zzxyVar : zzd6.zzi().zzc) {
                                                }
                                            }
                                            this.zzN.zzc();
                                        }
                                        zzW();
                                    }
                                }
                            }
                            int i1622 = 2;
                            if (this.zzu.zze == 2) {
                            }
                            this.zzL = -9223372036854775807L;
                            if (zzah()) {
                            }
                            boolean z16222 = this.zzu.zzo;
                            i2 = this.zzu.zze;
                            if (i2 != i8) {
                            }
                            Trace.endSection();
                        }
                    }
                    z = true;
                }
                zzI();
                return z;
            case 3:
                zzks zzksVar = (zzks) message.obj;
                this.zzv.zza(1);
                Pair zzx = zzx(this.zzu.zza, zzksVar, true, this.zzC, this.zzD, this.zzk, this.zzl);
                if (zzx == null) {
                    Pair zzw = zzw(this.zzu.zza);
                    zzukVar = (zzuk) zzw.first;
                    long longValue2 = ((Long) zzw.second).longValue();
                    j = -9223372036854775807L;
                    z8 = !this.zzu.zza.zzo();
                    longValue = longValue2;
                } else {
                    Object obj = zzx.first;
                    longValue = ((Long) zzx.second).longValue();
                    j = zzksVar.zzc == -9223372036854775807L ? -9223372036854775807L : longValue;
                    zzuk zzh = this.zzq.zzh(this.zzu.zza, obj, longValue);
                    if (zzh.zzb()) {
                        this.zzu.zza.zzn(zzh.zza, this.zzl);
                        if (this.zzl.zze(zzh.zzb) == zzh.zzc) {
                            this.zzl.zzj();
                        }
                        zzukVar = zzh;
                        z8 = true;
                        longValue = 0;
                    } else {
                        z8 = zzksVar.zzc == -9223372036854775807L;
                        zzukVar = zzh;
                    }
                }
                try {
                    try {
                        if (this.zzu.zza.zzo()) {
                            this.zzG = zzksVar;
                        } else if (zzx == null) {
                            if (this.zzu.zze != 1) {
                                zzT(4);
                            }
                            zzL(false, true, false, true);
                        } else {
                            try {
                                if (zzukVar.equals(this.zzu.zzb)) {
                                    zzlc zzd7 = this.zzq.zzd();
                                    j3 = (zzd7 == null || !zzd7.zzd || longValue == 0) ? longValue : zzd7.zza.zza(longValue, this.zzt);
                                    zzukVar2 = zzukVar;
                                    try {
                                        if (zzfs.zzt(j3) == zzfs.zzt(this.zzu.zzr) && ((i5 = (zzlsVar = this.zzu).zze) == 2 || i5 == 3)) {
                                            long j10 = zzlsVar.zzr;
                                            zzy = zzy(zzukVar2, j10, j, j10, z8, 2);
                                            this.zzu = zzy;
                                            z = true;
                                            zzI();
                                            return z;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        th = th;
                                        th2 = th;
                                        j2 = longValue;
                                        this.zzu = zzy(zzukVar2, j2, j, j2, z8, 2);
                                        throw th2;
                                    }
                                } else {
                                    zzukVar2 = zzukVar;
                                    j3 = longValue;
                                }
                                zzls zzlsVar4 = this.zzu;
                                zzda zzdaVar2 = zzlsVar4.zza;
                                zzaa(zzdaVar2, zzukVar2, zzdaVar2, zzlsVar4.zzb, j, true);
                                j4 = zzu;
                                zzy = zzy(zzukVar2, j4, j, j4, z8, 2);
                                this.zzu = zzy;
                                z = true;
                                zzI();
                                return z;
                            } catch (Throwable th4) {
                                j2 = zzu;
                                th2 = th4;
                                this.zzu = zzy(zzukVar2, j2, j, j2, z8, 2);
                                throw th2;
                            }
                            zzu = zzu(zzukVar2, j3, this.zzu.zze == 4);
                            z8 |= longValue != zzu;
                        }
                        j4 = longValue;
                        zzukVar2 = zzukVar;
                        zzy = zzy(zzukVar2, j4, j, j4, z8, 2);
                        this.zzu = zzy;
                        z = true;
                        zzI();
                        return z;
                    } catch (Throwable th5) {
                        th = th5;
                        zzukVar2 = zzukVar;
                        th2 = th;
                        j2 = longValue;
                        this.zzu = zzy(zzukVar2, j2, j, j2, z8, 2);
                        throw th2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    zzukVar2 = zzukVar;
                }
                break;
            case 4:
                zzR((zzcj) message.obj);
                zzF(this.zzn.zzc(), true);
                z = true;
                zzI();
                return z;
            case 5:
                this.zzt = (zzmd) message.obj;
                z = true;
                zzI();
                return z;
            case 6:
                zzV(false, true);
                z = true;
                zzI();
                return z;
            case 7:
                zzL(true, false, true, false);
                int i18 = 0;
                while (true) {
                    int length9 = this.zza.length;
                    if (i18 >= 2) {
                        this.zzf.zzc();
                        zzT(1);
                        HandlerThread handlerThread = this.zzi;
                        if (handlerThread != null) {
                            handlerThread.quit();
                        }
                        synchronized (this) {
                            this.zzw = true;
                            notifyAll();
                        }
                        return true;
                    }
                    this.zzc[i18].zzp();
                    this.zza[i18].zzE();
                    i18++;
                }
            case 8:
                if (this.zzq.zzl((zzui) message.obj)) {
                    zzlc zzc2 = this.zzq.zzc();
                    zzc2.zzl(this.zzn.zzc().zzc, this.zzu.zza);
                    zzY(zzc2.zzf.zza, zzc2.zzh(), zzc2.zzi());
                    if (zzc2 == this.zzq.zzd()) {
                        zzN(zzc2.zzf.zzb);
                        zzA();
                        zzls zzlsVar5 = this.zzu;
                        zzuk zzukVar7 = zzlsVar5.zzb;
                        long j11 = zzc2.zzf.zzb;
                        this.zzu = zzy(zzukVar7, j11, zzlsVar5.zzc, j11, false, 5);
                    }
                    zzH();
                }
                z = true;
                zzI();
                return z;
            case 9:
                if (this.zzq.zzl((zzui) message.obj)) {
                    this.zzq.zzk(this.zzH);
                    zzH();
                }
                z = true;
                zzI();
                return z;
            case 10:
                zzJ();
                z = true;
                zzI();
                return z;
            case 11:
                int i19 = message.arg1;
                this.zzC = i19;
                if (!this.zzq.zzp(this.zzu.zza, i19)) {
                    zzQ(true);
                }
                zzD(false);
                z = true;
                zzI();
                return z;
            case 12:
                boolean z19 = message.arg1 != 0;
                this.zzD = z19;
                if (!this.zzq.zzq(this.zzu.zza, z19)) {
                    zzQ(true);
                }
                zzD(false);
                z = true;
                zzI();
                return z;
            case 13:
                boolean z20 = message.arg1 != 0;
                AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                if (this.zzE != z20) {
                    this.zzE = z20;
                    if (!z20) {
                        zzlz[] zzlzVarArr7 = this.zza;
                        int length10 = zzlzVarArr7.length;
                        for (int i20 = 0; i20 < 2; i20++) {
                            zzlz zzlzVar6 = zzlzVarArr7[i20];
                            if (!zzae(zzlzVar6) && this.zzb.remove(zzlzVar6)) {
                                zzlzVar6.zzG();
                            }
                        }
                    }
                }
                if (atomicBoolean != null) {
                    synchronized (this) {
                        atomicBoolean.set(true);
                        notifyAll();
                    }
                }
                z = true;
                zzI();
                return z;
            case 14:
                zzlv zzlvVar = (zzlv) message.obj;
                if (zzlvVar.zzb() == this.zzj) {
                    zzak(zzlvVar);
                    int i21 = this.zzu.zze;
                    if (i21 == 3 || i21 == 2) {
                        this.zzh.zzi(2);
                    }
                } else {
                    this.zzh.zzc(15, zzlvVar).zza();
                }
                z = true;
                zzI();
                return z;
            case 15:
                final zzlv zzlvVar2 = (zzlv) message.obj;
                Looper zzb5 = zzlvVar2.zzb();
                if (zzb5.getThread().isAlive()) {
                    this.zzp.zzb(zzb5, null).zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkl
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzkt.zzq(zzlvVar2);
                        }
                    });
                } else {
                    zzez.zzf("TAG", "Trying to send message on a dead thread.");
                    zzlvVar2.zzh(false);
                }
                z = true;
                zzI();
                return z;
            case 16:
                zzF((zzcj) message.obj, false);
                z = true;
                zzI();
                return z;
            case 17:
                zzko zzkoVar = (zzko) message.obj;
                this.zzv.zza(1);
                i6 = zzkoVar.zzb;
                if (i6 != -1) {
                    list2 = zzkoVar.zza;
                    zzwdVar2 = zzkoVar.zzd;
                    zzlx zzlxVar = new zzlx(list2, zzwdVar2);
                    i7 = zzkoVar.zzb;
                    j5 = zzkoVar.zzc;
                    this.zzG = new zzks(zzlxVar, i7, j5);
                }
                zzlr zzlrVar = this.zzr;
                list = zzkoVar.zza;
                zzwdVar = zzkoVar.zzd;
                zzE(zzlrVar.zzn(list, zzwdVar), false);
                z = true;
                zzI();
                return z;
            case 18:
                zzko zzkoVar2 = (zzko) message.obj;
                int i22 = message.arg1;
                this.zzv.zza(1);
                zzlr zzlrVar2 = this.zzr;
                if (i22 == -1) {
                    i22 = zzlrVar2.zza();
                }
                list3 = zzkoVar2.zza;
                zzwdVar3 = zzkoVar2.zzd;
                zzE(zzlrVar2.zzk(i22, list3, zzwdVar3), false);
                z = true;
                zzI();
                return z;
            case 19:
                zzkp zzkpVar = (zzkp) message.obj;
                this.zzv.zza(1);
                zzlr zzlrVar3 = this.zzr;
                int i23 = zzkpVar.zza;
                int i24 = zzkpVar.zzb;
                int i25 = zzkpVar.zzc;
                zzwd zzwdVar4 = zzkpVar.zzd;
                zzE(zzlrVar3.zzl(0, 0, 0, null), false);
                z = true;
                zzI();
                return z;
            case 20:
                int i26 = message.arg1;
                int i27 = message.arg2;
                zzwd zzwdVar5 = (zzwd) message.obj;
                this.zzv.zza(1);
                zzE(this.zzr.zzm(i26, i27, zzwdVar5), false);
                z = true;
                zzI();
                return z;
            case 21:
                zzwd zzwdVar6 = (zzwd) message.obj;
                this.zzv.zza(1);
                zzE(this.zzr.zzo(zzwdVar6), false);
                z = true;
                zzI();
                return z;
            case 22:
                zzE(this.zzr.zzb(), true);
                z = true;
                zzI();
                return z;
            case 23:
                this.zzx = message.arg1 != 0;
                zzM();
                if (this.zzy && this.zzq.zze() != this.zzq.zzd()) {
                    zzQ(true);
                    zzD(false);
                }
                z = true;
                zzI();
                return z;
            case 24:
            default:
                return false;
            case 25:
                zzK();
                z = true;
                zzI();
                return z;
            case 26:
                zzK();
                z = true;
                zzI();
                return z;
            case 27:
                int i28 = message.arg1;
                int i29 = message.arg2;
                List list4 = (List) message.obj;
                this.zzv.zza(1);
                zzE(this.zzr.zzc(i28, i29, list4), false);
                z = true;
                zzI();
                return z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final void zza(zzcj zzcjVar) {
        this.zzh.zzc(16, zzcjVar).zza();
    }

    public final Looper zzb() {
        return this.zzj;
    }

    final /* synthetic */ Boolean zzd() {
        return Boolean.valueOf(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final /* bridge */ /* synthetic */ void zzf(zzwc zzwcVar) {
        this.zzh.zzc(9, (zzui) zzwcVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzg() {
        this.zzh.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final void zzh(zzui zzuiVar) {
        this.zzh.zzc(8, zzuiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zzi() {
        this.zzh.zzi(10);
    }

    public final void zzj() {
        this.zzh.zzb(0).zza();
    }

    public final void zzk(zzda zzdaVar, int i, long j) {
        this.zzh.zzc(3, new zzks(zzdaVar, i, j)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final synchronized void zzl(zzlv zzlvVar) {
        if (!this.zzw && this.zzj.getThread().isAlive()) {
            this.zzh.zzc(14, zzlvVar).zza();
            return;
        }
        zzez.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzlvVar.zzh(false);
    }

    public final void zzm(boolean z, int i) {
        this.zzh.zzd(1, z ? 1 : 0, i).zza();
    }

    public final void zzn() {
        this.zzh.zzb(6).zza();
    }

    public final synchronized boolean zzo() {
        if (!this.zzw && this.zzj.getThread().isAlive()) {
            this.zzh.zzi(7);
            zzac(new zzkk(this), this.zzs);
            return this.zzw;
        }
        return true;
    }

    public final void zzp(List list, int i, long j, zzwd zzwdVar) {
        this.zzh.zzc(17, new zzko(list, zzwdVar, i, j, null)).zza();
    }
}

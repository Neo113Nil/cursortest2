package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.work.WorkRequest;
import com.google.android.gms.games.GamesStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzjx implements Handler.Callback, zzuf, zzya, zzkv, zzhu, zzky {
    private static final long zza = zzet.zzu(WorkRequest.MIN_BACKOFF_MILLIS);
    private boolean zzA;
    private boolean zzB;
    private boolean zzD;
    private boolean zzG;
    private int zzH;
    private zzjw zzI;
    private long zzJ;
    private long zzK;
    private int zzL;
    private boolean zzM;
    private zzhw zzN;
    private zzig zzP;
    private final zzii zzQ;
    private final zzhq zzR;
    private final zzle[] zzb;
    private final Set zzc;
    private final zzlh[] zzd;
    private final zzyb zze;
    private final zzyc zzf;
    private final zzkb zzg;
    private final zzyj zzh;
    private final zzdt zzi;
    private final HandlerThread zzj;
    private final Looper zzk;
    private final zzcb zzl;
    private final zzca zzm;
    private final long zzn;
    private final zzhv zzo;
    private final ArrayList zzp;
    private final zzdj zzq;
    private final zzkk zzr;
    private final zzkw zzs;
    private final long zzt;
    private final zznz zzu;
    private zzlj zzv;
    private zzkx zzw;
    private zzjv zzx;
    private boolean zzy;
    private int zzE = 0;
    private boolean zzF = false;
    private boolean zzz = false;
    private long zzO = -9223372036854775807L;
    private long zzC = -9223372036854775807L;

    public zzjx(zzle[] zzleVarArr, zzyb zzybVar, zzyc zzycVar, zzkb zzkbVar, zzyj zzyjVar, int i, boolean z, zzln zzlnVar, zzlj zzljVar, zzhq zzhqVar, long j, boolean z2, boolean z3, Looper looper, zzdj zzdjVar, zzii zziiVar, zznz zznzVar, Looper looper2, zzig zzigVar) {
        this.zzQ = zziiVar;
        this.zzb = zzleVarArr;
        this.zze = zzybVar;
        this.zzf = zzycVar;
        this.zzg = zzkbVar;
        this.zzh = zzyjVar;
        int i2 = 0;
        this.zzv = zzljVar;
        this.zzR = zzhqVar;
        this.zzt = j;
        this.zzq = zzdjVar;
        this.zzu = zznzVar;
        this.zzP = zzigVar;
        this.zzn = zzkbVar.zzb(zznzVar);
        zzkbVar.zzg(zznzVar);
        zzcc zzccVar = zzcc.zza;
        zzkx zzg = zzkx.zzg(zzycVar);
        this.zzw = zzg;
        this.zzx = new zzjv(zzg);
        int length = zzleVarArr.length;
        this.zzd = new zzlh[2];
        zzlg zze = zzybVar.zze();
        while (true) {
            int length2 = zzleVarArr.length;
            if (i2 >= 2) {
                this.zzo = new zzhv(this, zzdjVar);
                this.zzp = new ArrayList();
                this.zzc = Collections.newSetFromMap(new IdentityHashMap());
                this.zzl = new zzcb();
                this.zzm = new zzca();
                zzybVar.zzr(this, zzyjVar);
                this.zzM = true;
                zzdt zzb = zzdjVar.zzb(looper, null);
                this.zzr = new zzkk(zzlnVar, zzb, new zzjp(this), zzigVar);
                this.zzs = new zzkw(this, zzlnVar, zzb, zznzVar);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.zzj = handlerThread;
                handlerThread.start();
                Looper looper3 = handlerThread.getLooper();
                this.zzk = looper3;
                this.zzi = zzdjVar.zzb(looper3, this);
                return;
            }
            zzleVarArr[i2].zzu(i2, zznzVar, zzdjVar);
            this.zzd[i2] = zzleVarArr[i2].zzl();
            this.zzd[i2].zzL(zze);
            i2++;
        }
    }

    private final void zzA() throws zzhw {
        int length = this.zzb.length;
        zzB(new boolean[2], this.zzr.zzf().zzf());
    }

    private final void zzB(boolean[] zArr, long j) throws zzhw {
        zzkh zzf = this.zzr.zzf();
        zzyc zzi = zzf.zzi();
        int i = 0;
        while (true) {
            int length = this.zzb.length;
            if (i >= 2) {
                break;
            }
            if (!zzi.zzb(i) && this.zzc.remove(this.zzb[i])) {
                this.zzb[i].zzI();
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = this.zzb.length;
            if (i2 >= 2) {
                zzf.zzg = true;
                return;
            }
            if (zzi.zzb(i2)) {
                boolean z = zArr[i2];
                zzle zzleVar = this.zzb[i2];
                if (!zzae(zzleVar)) {
                    zzkk zzkkVar = this.zzr;
                    zzkh zzf2 = zzkkVar.zzf();
                    boolean z2 = zzf2 == zzkkVar.zze();
                    zzyc zzi2 = zzf2.zzi();
                    zzli zzliVar = zzi2.zzb[i2];
                    zzaf[] zzaj = zzaj(zzi2.zzc[i2]);
                    boolean z3 = zzah() && this.zzw.zze == 3;
                    boolean z4 = !z && z3;
                    this.zzH++;
                    this.zzc.add(zzleVar);
                    zzleVar.zzr(zzliVar, zzaj, zzf2.zzc[i2], this.zzJ, z4, z2, j, zzf2.zze(), zzf2.zzf.zza);
                    zzleVar.zzt(11, new zzjq(this));
                    this.zzo.zze(zzleVar);
                    if (z3 && z2) {
                        zzleVar.zzO();
                    }
                }
            }
            i2++;
        }
    }

    private final void zzC(IOException iOException, int i) {
        zzkk zzkkVar = this.zzr;
        zzhw zzc = zzhw.zzc(iOException, i);
        zzkh zze = zzkkVar.zze();
        if (zze != null) {
            zzc = zzc.zza(zze.zzf.zza);
        }
        zzea.zzd("ExoPlayerImplInternal", "Playback error", zzc);
        zzV(false, false);
        this.zzw = this.zzw.zzd(zzc);
    }

    private final void zzD(boolean z) {
        zzkh zzd = this.zzr.zzd();
        zzui zzuiVar = zzd == null ? this.zzw.zzb : zzd.zzf.zza;
        boolean z2 = !this.zzw.zzk.equals(zzuiVar);
        if (z2) {
            this.zzw = this.zzw.zza(zzuiVar);
        }
        zzkx zzkxVar = this.zzw;
        zzkxVar.zzp = zzd == null ? zzkxVar.zzr : zzd.zzc();
        this.zzw.zzq = zzs();
        if ((z2 || z) && zzd != null && zzd.zzd) {
            zzY(zzd.zzf.zza, zzd.zzh(), zzd.zzi());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzE(zzcc zzccVar, boolean z) throws zzhw {
        zzui zzuiVar;
        zzca zzcaVar;
        int i;
        zzcb zzcbVar;
        long j;
        Object obj;
        long j2;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j3;
        boolean z6;
        long j4;
        boolean z7;
        boolean z8;
        boolean z9;
        zzui zzuiVar2;
        long j5;
        int i3;
        boolean z10;
        int i4;
        boolean z11;
        boolean z12;
        boolean z13;
        zzjw zzjwVar;
        boolean z14;
        zzjw zzjwVar2;
        long j6;
        boolean z15;
        long j7;
        int i5;
        zzkx zzkxVar = this.zzw;
        zzjw zzjwVar3 = this.zzI;
        int i6 = this.zzE;
        boolean z16 = this.zzF;
        if (zzccVar.zzo()) {
            zzuiVar2 = zzkx.zzh();
            j5 = -9223372036854775807L;
            z7 = false;
            z8 = true;
            z9 = false;
            z6 = true;
            j4 = 0;
            j = 0;
        } else {
            zzca zzcaVar2 = this.zzm;
            zzui zzuiVar3 = zzkxVar.zzb;
            Object obj2 = zzuiVar3.zza;
            boolean zzag = zzag(zzkxVar, zzcaVar2);
            long j8 = (zzkxVar.zzb.zzb() || zzag) ? zzkxVar.zzc : zzkxVar.zzr;
            zzcb zzcbVar2 = this.zzl;
            if (zzjwVar3 != null) {
                zzuiVar = zzuiVar3;
                zzcaVar = zzcaVar2;
                Pair zzx = zzx(zzccVar, zzjwVar3, true, i6, z16, zzcbVar2, zzcaVar);
                if (zzx == null) {
                    i4 = zzccVar.zzg(z16);
                    j2 = j8;
                    obj = obj2;
                    z12 = false;
                    z11 = false;
                    z13 = true;
                } else {
                    if (zzjwVar3.zzc == -9223372036854775807L) {
                        i4 = zzccVar.zzn(zzx.first, zzcaVar).zzc;
                        j2 = j8;
                        obj = obj2;
                        z10 = false;
                    } else {
                        Object obj3 = zzx.first;
                        j2 = ((Long) zzx.second).longValue();
                        obj = obj3;
                        z10 = true;
                        i4 = -1;
                    }
                    z11 = zzkxVar.zze == 4;
                    z12 = z10;
                    z13 = false;
                }
                z2 = z11;
                z3 = z13;
                i2 = i4;
                zzcbVar = zzcbVar2;
                i = -1;
                j = 0;
                z4 = z12;
            } else {
                zzuiVar = zzuiVar3;
                zzcaVar = zzcaVar2;
                if (zzkxVar.zza.zzo()) {
                    i2 = zzccVar.zzg(z16);
                    zzcbVar = zzcbVar2;
                    j2 = j8;
                    obj = obj2;
                    z2 = false;
                    z3 = false;
                    i = -1;
                } else if (zzccVar.zza(obj2) == -1) {
                    i = -1;
                    int zzb = zzb(zzcbVar2, zzcaVar, i6, z16, obj2, zzkxVar.zza, zzccVar);
                    if (zzb == -1) {
                        zzb = zzccVar.zzg(z16);
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    i2 = zzb;
                    z3 = z5;
                    obj = obj2;
                    zzcbVar = zzcbVar2;
                    j2 = j8;
                    z2 = false;
                } else {
                    i = -1;
                    if (j8 == -9223372036854775807L) {
                        i2 = zzccVar.zzn(obj2, zzcaVar).zzc;
                        obj = obj2;
                        zzcbVar = zzcbVar2;
                        j2 = j8;
                        z2 = false;
                        z3 = false;
                    } else if (zzag) {
                        zzkxVar.zza.zzn(zzuiVar.zza, zzcaVar);
                        zzcbVar = zzcbVar2;
                        if (zzkxVar.zza.zze(zzcaVar.zzc, zzcbVar, 0L).zzn == zzkxVar.zza.zza(zzuiVar.zza)) {
                            j = 0;
                            Pair zzl = zzccVar.zzl(zzcbVar, zzcaVar, zzccVar.zzn(obj2, zzcaVar).zzc, j8);
                            Object obj4 = zzl.first;
                            j2 = ((Long) zzl.second).longValue();
                            obj = obj4;
                        } else {
                            j = 0;
                            obj = obj2;
                            j2 = j8;
                        }
                        i2 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        zzcbVar = zzcbVar2;
                        j = 0;
                        obj = obj2;
                        j2 = j8;
                        i2 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                }
                z4 = false;
                j = 0;
            }
            if (i2 != i) {
                Pair zzl2 = zzccVar.zzl(zzcbVar, zzcaVar, i2, -9223372036854775807L);
                Object obj5 = zzl2.first;
                long longValue = ((Long) zzl2.second).longValue();
                obj = obj5;
                j3 = longValue;
                j2 = -9223372036854775807L;
            } else {
                j3 = j2;
            }
            zzui zzi = this.zzr.zzi(zzccVar, obj, j3);
            int i7 = zzi.zze;
            boolean z17 = zzuiVar.zza.equals(obj) && !zzuiVar.zzb() && !zzi.zzb() && (i7 == i || ((i3 = zzuiVar.zze) != i && i7 >= i3));
            zzca zzn = zzccVar.zzn(obj, zzcaVar);
            if (!zzag && j8 == j2 && zzuiVar.zza.equals(zzi.zza)) {
                if (zzuiVar.zzb()) {
                    zzn.zzn(zzuiVar.zzb);
                }
                if (zzi.zzb()) {
                    zzn.zzn(zzi.zzb);
                }
            }
            z6 = true;
            if (true == z17) {
                zzi = zzuiVar;
            }
            if (zzi.zzb()) {
                if (zzi.equals(zzuiVar)) {
                    j3 = zzkxVar.zzr;
                } else {
                    zzccVar.zzn(zzi.zza, zzcaVar);
                    if (zzi.zzc == zzcaVar.zze(zzi.zzb)) {
                        zzcaVar.zzj();
                    }
                    j3 = j;
                }
            }
            j4 = j3;
            z7 = z2;
            z8 = z3;
            z9 = z4;
            zzuiVar2 = zzi;
            j5 = j2;
        }
        boolean z18 = (this.zzw.zzb.equals(zzuiVar2) && j4 == this.zzw.zzr) ? false : true;
        int i8 = 2;
        if (z8) {
            try {
                if (this.zzw.zze != z6) {
                    try {
                        zzT(4);
                    } catch (Throwable th) {
                        th = th;
                        z14 = z9;
                        zzjwVar = null;
                        zzkx zzkxVar2 = this.zzw;
                        zzaa(zzccVar, zzuiVar2, zzkxVar2.zza, zzkxVar2.zzb, true == z14 ? -9223372036854775807L : j4, false);
                        if (z18 && j5 == this.zzw.zzc) {
                            zzjwVar2 = zzjwVar;
                        } else {
                            zzkx zzkxVar3 = this.zzw;
                            Object obj6 = zzkxVar3.zzb.zza;
                            zzcc zzccVar2 = zzkxVar3.zza;
                            zzjwVar2 = zzjwVar;
                            this.zzw = zzy(zzuiVar2, j4, j5, this.zzw.zzd, (z18 || !z || zzccVar2.zzo() || zzccVar2.zzn(obj6, this.zzm).zzf) ? false : true, zzccVar.zza(obj6) == -1 ? 4 : 3);
                        }
                        zzM();
                        zzO(zzccVar, this.zzw.zza);
                        this.zzw = this.zzw.zzf(zzccVar);
                        if (!zzccVar.zzo()) {
                            this.zzI = zzjwVar2;
                        }
                        zzD(false);
                        this.zzi.zzi(2);
                        throw th;
                    }
                }
                zzL(false, false, false, z6);
            } catch (Throwable th2) {
                th = th2;
                z14 = z9;
                zzjwVar = null;
                zzkx zzkxVar22 = this.zzw;
                zzaa(zzccVar, zzuiVar2, zzkxVar22.zza, zzkxVar22.zzb, true == z14 ? -9223372036854775807L : j4, false);
                if (z18) {
                }
                zzkx zzkxVar32 = this.zzw;
                Object obj62 = zzkxVar32.zzb.zza;
                zzcc zzccVar22 = zzkxVar32.zza;
                zzjwVar2 = zzjwVar;
                this.zzw = zzy(zzuiVar2, j4, j5, this.zzw.zzd, (z18 || !z || zzccVar22.zzo() || zzccVar22.zzn(obj62, this.zzm).zzf) ? false : true, zzccVar.zza(obj62) == -1 ? 4 : 3);
                zzM();
                zzO(zzccVar, this.zzw.zza);
                this.zzw = this.zzw.zzf(zzccVar);
                if (!zzccVar.zzo()) {
                }
                zzD(false);
                this.zzi.zzi(2);
                throw th;
            }
        }
        zzle[] zzleVarArr = this.zzb;
        int length = zzleVarArr.length;
        for (int i9 = 0; i9 < 2; i9++) {
            zzleVarArr[i9].zzN(zzccVar);
        }
        try {
            if (z18) {
                z15 = z9;
                if (!zzccVar.zzo()) {
                    for (zzkh zze = this.zzr.zze(); zze != null; zze = zze.zzg()) {
                        if (zze.zzf.zza.equals(zzuiVar2)) {
                            zze.zzf = this.zzr.zzh(zzccVar, zze.zzf);
                            zze.zzq();
                        }
                    }
                    j4 = zzu(zzuiVar2, j4, z7);
                }
            } else {
                try {
                    zzkk zzkkVar = this.zzr;
                    long j9 = this.zzJ;
                    zzkh zzf = zzkkVar.zzf();
                    if (zzf == null) {
                        j6 = j9;
                        z15 = z9;
                        j7 = j;
                    } else {
                        long zze2 = zzf.zze();
                        if (zzf.zzd) {
                            z15 = z9;
                            long j10 = zze2;
                            int i10 = 0;
                            while (true) {
                                try {
                                    zzle[] zzleVarArr2 = this.zzb;
                                    int length2 = zzleVarArr2.length;
                                    if (i10 >= i8) {
                                        j6 = j9;
                                        j7 = j10;
                                        break;
                                    }
                                    if (zzae(zzleVarArr2[i10]) && this.zzb[i10].zzo() == zzf.zzc[i10]) {
                                        j6 = j9;
                                        long zzcX = this.zzb[i10].zzcX();
                                        zze2 = Long.MIN_VALUE;
                                        if (zzcX == Long.MIN_VALUE) {
                                            break;
                                        }
                                        j10 = Math.max(zzcX, j10);
                                        i10++;
                                        j9 = j6;
                                        i8 = 2;
                                    }
                                    j6 = j9;
                                    i10++;
                                    j9 = j6;
                                    i8 = 2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    z14 = z15;
                                    zzjwVar = null;
                                    zzkx zzkxVar222 = this.zzw;
                                    zzaa(zzccVar, zzuiVar2, zzkxVar222.zza, zzkxVar222.zzb, true == z14 ? -9223372036854775807L : j4, false);
                                    if (z18) {
                                    }
                                    zzkx zzkxVar322 = this.zzw;
                                    Object obj622 = zzkxVar322.zzb.zza;
                                    zzcc zzccVar222 = zzkxVar322.zza;
                                    zzjwVar2 = zzjwVar;
                                    this.zzw = zzy(zzuiVar2, j4, j5, this.zzw.zzd, (z18 || !z || zzccVar222.zzo() || zzccVar222.zzn(obj622, this.zzm).zzf) ? false : true, zzccVar.zza(obj622) == -1 ? 4 : 3);
                                    zzM();
                                    zzO(zzccVar, this.zzw.zza);
                                    this.zzw = this.zzw.zzf(zzccVar);
                                    if (!zzccVar.zzo()) {
                                    }
                                    zzD(false);
                                    this.zzi.zzi(2);
                                    throw th;
                                }
                            }
                        } else {
                            j6 = j9;
                            z15 = z9;
                        }
                        j7 = zze2;
                    }
                    if (!zzkkVar.zzs(zzccVar, j6, j7)) {
                        zzQ(false);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    boolean z19 = z9;
                    z14 = z19;
                    zzjwVar = null;
                    zzkx zzkxVar2222 = this.zzw;
                    zzaa(zzccVar, zzuiVar2, zzkxVar2222.zza, zzkxVar2222.zzb, true == z14 ? -9223372036854775807L : j4, false);
                    if (z18) {
                    }
                    zzkx zzkxVar3222 = this.zzw;
                    Object obj6222 = zzkxVar3222.zzb.zza;
                    zzcc zzccVar2222 = zzkxVar3222.zza;
                    zzjwVar2 = zzjwVar;
                    this.zzw = zzy(zzuiVar2, j4, j5, this.zzw.zzd, (z18 || !z || zzccVar2222.zzo() || zzccVar2222.zzn(obj6222, this.zzm).zzf) ? false : true, zzccVar.zza(obj6222) == -1 ? 4 : 3);
                    zzM();
                    zzO(zzccVar, this.zzw.zza);
                    this.zzw = this.zzw.zzf(zzccVar);
                    if (!zzccVar.zzo()) {
                    }
                    zzD(false);
                    this.zzi.zzi(2);
                    throw th;
                }
            }
            zzkx zzkxVar4 = this.zzw;
            zzaa(zzccVar, zzuiVar2, zzkxVar4.zza, zzkxVar4.zzb, true != z15 ? -9223372036854775807L : j4, false);
            if (z18 || j5 != this.zzw.zzc) {
                zzkx zzkxVar5 = this.zzw;
                Object obj7 = zzkxVar5.zzb.zza;
                zzcc zzccVar3 = zzkxVar5.zza;
                i5 = 2;
                this.zzw = zzy(zzuiVar2, j4, j5, this.zzw.zzd, z18 && z && !zzccVar3.zzo() && !zzccVar3.zzn(obj7, this.zzm).zzf, zzccVar.zza(obj7) == -1 ? 4 : 3);
            } else {
                i5 = 2;
            }
            zzM();
            zzO(zzccVar, this.zzw.zza);
            this.zzw = this.zzw.zzf(zzccVar);
            if (!zzccVar.zzo()) {
                this.zzI = null;
            }
            zzD(false);
            this.zzi.zzi(i5);
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private final void zzF(zzbq zzbqVar, boolean z) throws zzhw {
        zzG(zzbqVar, zzbqVar.zzb, true, z);
    }

    private final void zzG(zzbq zzbqVar, float f, boolean z, boolean z2) throws zzhw {
        int i;
        zzjx zzjxVar = this;
        if (z) {
            if (z2) {
                zzjxVar.zzx.zza(1);
            }
            zzkx zzkxVar = zzjxVar.zzw;
            zzcc zzccVar = zzkxVar.zza;
            zzui zzuiVar = zzkxVar.zzb;
            long j = zzkxVar.zzc;
            long j2 = zzkxVar.zzd;
            int i2 = zzkxVar.zze;
            zzhw zzhwVar = zzkxVar.zzf;
            boolean z3 = zzkxVar.zzg;
            zzwi zzwiVar = zzkxVar.zzh;
            zzyc zzycVar = zzkxVar.zzi;
            List list = zzkxVar.zzj;
            zzui zzuiVar2 = zzkxVar.zzk;
            boolean z4 = zzkxVar.zzl;
            int i3 = zzkxVar.zzm;
            long j3 = zzkxVar.zzp;
            long j4 = zzkxVar.zzq;
            long j5 = zzkxVar.zzr;
            long j6 = zzkxVar.zzs;
            boolean z5 = zzkxVar.zzo;
            zzjxVar = this;
            zzjxVar.zzw = new zzkx(zzccVar, zzuiVar, j, j2, i2, zzhwVar, z3, zzwiVar, zzycVar, list, zzuiVar2, z4, i3, zzbqVar, j3, j4, j5, j6, false);
        }
        float f2 = zzbqVar.zzb;
        zzkh zze = zzjxVar.zzr.zze();
        while (true) {
            i = 0;
            if (zze == null) {
                break;
            }
            zzxv[] zzxvVarArr = zze.zzi().zzc;
            int length = zzxvVarArr.length;
            while (i < length) {
                zzxv zzxvVar = zzxvVarArr[i];
                i++;
            }
            zze = zze.zzg();
        }
        zzle[] zzleVarArr = zzjxVar.zzb;
        int length2 = zzleVarArr.length;
        while (i < 2) {
            zzle zzleVar = zzleVarArr[i];
            if (zzleVar != null) {
                zzleVar.zzM(f, zzbqVar.zzb);
            }
            i++;
        }
    }

    private final void zzH() {
        long zze;
        long j;
        boolean z;
        if (zzad()) {
            zzkh zzd = this.zzr.zzd();
            long zzt = zzt(zzd.zzd());
            if (zzd == this.zzr.zze()) {
                zze = this.zzJ;
                j = zzd.zze();
            } else {
                zze = this.zzJ - zzd.zze();
                j = zzd.zzf.zzb;
            }
            zzka zzkaVar = new zzka(this.zzu, this.zzw.zza, zzd.zzf.zza, zze - j, zzt, this.zzo.zzc().zzb, this.zzw.zzl, this.zzB, zzai(this.zzw.zza, zzd.zzf.zza) ? this.zzR.zzb() : -9223372036854775807L);
            boolean zzh = this.zzg.zzh(zzkaVar);
            zzkh zze2 = this.zzr.zze();
            if (zzh || !zze2.zzd || zzt >= 500000 || this.zzn <= 0) {
                z = zzh;
            } else {
                zze2.zza.zzj(this.zzw.zzr, false);
                z = this.zzg.zzh(zzkaVar);
            }
        } else {
            z = false;
        }
        this.zzD = z;
        if (z) {
            this.zzr.zzd().zzk(this.zzJ, this.zzo.zzc().zzb, this.zzC);
        }
        zzX();
    }

    private final void zzI() {
        boolean z;
        this.zzx.zzc(this.zzw);
        z = this.zzx.zzg;
        if (z) {
            zzii zziiVar = this.zzQ;
            zziiVar.zza.zzO(this.zzx);
            this.zzx = new zzjv(this.zzw);
        }
    }

    private final void zzJ() throws zzhw {
        int i;
        float f = this.zzo.zzc().zzb;
        zzkk zzkkVar = this.zzr;
        zzkh zze = zzkkVar.zze();
        zzkh zzf = zzkkVar.zzf();
        zzyc zzycVar = null;
        boolean z = true;
        while (zze != null && zze.zzd) {
            zzyc zzj = zze.zzj(f, this.zzw.zza);
            zzyc zzycVar2 = zze == this.zzr.zze() ? zzj : zzycVar;
            zzyc zzi = zze.zzi();
            boolean z2 = false;
            if (zzi != null) {
                if (zzi.zzc.length == zzj.zzc.length) {
                    for (int i2 = 0; i2 < zzj.zzc.length; i2++) {
                        if (zzj.zza(zzi, i2)) {
                        }
                    }
                    if (zze != zzf) {
                        z2 = true;
                    }
                    z &= z2;
                    zze = zze.zzg();
                    zzycVar = zzycVar2;
                }
            }
            if (z) {
                zzkk zzkkVar2 = this.zzr;
                zzkh zze2 = zzkkVar2.zze();
                boolean zzq = zzkkVar2.zzq(zze2);
                int length = this.zzb.length;
                boolean[] zArr = new boolean[2];
                zzycVar2.getClass();
                long zzb = zze2.zzb(zzycVar2, this.zzw.zzr, zzq, zArr);
                zzkx zzkxVar = this.zzw;
                boolean z3 = (zzkxVar.zze == 4 || zzb == zzkxVar.zzr) ? false : true;
                zzkx zzkxVar2 = this.zzw;
                i = 2;
                this.zzw = zzy(zzkxVar2.zzb, zzb, zzkxVar2.zzc, zzkxVar2.zzd, z3, 5);
                if (z3) {
                    zzN(zzb);
                }
                int length2 = this.zzb.length;
                boolean[] zArr2 = new boolean[2];
                int i3 = 0;
                while (true) {
                    zzle[] zzleVarArr = this.zzb;
                    int length3 = zzleVarArr.length;
                    if (i3 >= 2) {
                        break;
                    }
                    zzle zzleVar = zzleVarArr[i3];
                    boolean zzae = zzae(zzleVar);
                    zArr2[i3] = zzae;
                    zzvx zzvxVar = zze2.zzc[i3];
                    if (zzae) {
                        if (zzvxVar != zzleVar.zzo()) {
                            zzz(zzleVar);
                        } else if (zArr[i3]) {
                            zzleVar.zzJ(this.zzJ);
                        }
                    }
                    i3++;
                }
                zzB(zArr2, this.zzJ);
            } else {
                i = 2;
                this.zzr.zzq(zze);
                if (zze.zzd) {
                    zze.zza(zzj, Math.max(zze.zzf.zzb, this.zzJ - zze.zze()), false);
                }
            }
            zzD(true);
            if (this.zzw.zze != 4) {
                zzH();
                zzZ();
                this.zzi.zzi(i);
                return;
            }
            return;
        }
    }

    private final void zzK() throws zzhw {
        zzJ();
        zzQ(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzL(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        zzcc zzccVar;
        zzcc zzccVar2;
        zzui zzuiVar;
        this.zzi.zzf(2);
        this.zzN = null;
        boolean z5 = true;
        zzab(false, true);
        this.zzo.zzi();
        this.zzJ = 1000000000000L;
        zzle[] zzleVarArr = this.zzb;
        int length = zzleVarArr.length;
        for (int i = 0; i < 2; i++) {
            try {
                zzz(zzleVarArr[i]);
            } catch (zzhw | RuntimeException e) {
                zzea.zzd("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            zzle[] zzleVarArr2 = this.zzb;
            int length2 = zzleVarArr2.length;
            for (int i2 = 0; i2 < 2; i2++) {
                zzle zzleVar = zzleVarArr2[i2];
                if (this.zzc.remove(zzleVar)) {
                    try {
                        zzleVar.zzI();
                    } catch (RuntimeException e2) {
                        zzea.zzd("ExoPlayerImplInternal", "Reset failed.", e2);
                    }
                }
            }
        }
        this.zzH = 0;
        zzkx zzkxVar = this.zzw;
        zzui zzuiVar2 = zzkxVar.zzb;
        long j3 = zzkxVar.zzr;
        long j4 = (this.zzw.zzb.zzb() || zzag(this.zzw, this.zzm)) ? this.zzw.zzc : this.zzw.zzr;
        if (z2) {
            this.zzI = null;
            Pair zzw = zzw(this.zzw.zza);
            zzuiVar2 = (zzui) zzw.first;
            j3 = ((Long) zzw.second).longValue();
            j4 = -9223372036854775807L;
            if (!zzuiVar2.equals(this.zzw.zzb)) {
                j = j3;
                j2 = -9223372036854775807L;
                this.zzr.zzj();
                this.zzD = false;
                zzccVar = this.zzw.zza;
                if (z3 && (zzccVar instanceof zzlc)) {
                    zzccVar = ((zzlc) zzccVar).zzx(this.zzs.zzq());
                    if (zzuiVar2.zzb != -1) {
                        zzccVar.zzn(zzuiVar2.zza, this.zzm);
                        zzca zzcaVar = this.zzm;
                        zzcb zzcbVar = this.zzl;
                        zzccVar.zze(zzcaVar.zzc, zzcbVar, 0L);
                        if (zzcbVar.zzb()) {
                            zzccVar2 = zzccVar;
                            zzuiVar = new zzui(zzuiVar2.zza, zzuiVar2.zzd);
                            zzkx zzkxVar2 = this.zzw;
                            int i3 = zzkxVar2.zze;
                            zzhw zzhwVar = z4 ? null : zzkxVar2.zzf;
                            zzwi zzwiVar = z5 ? zzwi.zza : zzkxVar2.zzh;
                            zzyc zzycVar = z5 ? this.zzf : this.zzw.zzi;
                            List zzm = z5 ? zzfxr.zzm() : this.zzw.zzj;
                            zzkx zzkxVar3 = this.zzw;
                            this.zzw = new zzkx(zzccVar2, zzuiVar, j2, j, i3, zzhwVar, false, zzwiVar, zzycVar, zzm, zzuiVar, zzkxVar3.zzl, zzkxVar3.zzm, zzkxVar3.zzn, j, 0L, j, 0L, false);
                            if (z3) {
                                this.zzr.zzm();
                                this.zzs.zzh();
                                return;
                            }
                            return;
                        }
                    }
                }
                zzccVar2 = zzccVar;
                zzuiVar = zzuiVar2;
                zzkx zzkxVar22 = this.zzw;
                int i32 = zzkxVar22.zze;
                zzhw zzhwVar2 = z4 ? null : zzkxVar22.zzf;
                zzwi zzwiVar2 = z5 ? zzwi.zza : zzkxVar22.zzh;
                zzyc zzycVar2 = z5 ? this.zzf : this.zzw.zzi;
                List zzm2 = z5 ? zzfxr.zzm() : this.zzw.zzj;
                zzkx zzkxVar32 = this.zzw;
                this.zzw = new zzkx(zzccVar2, zzuiVar, j2, j, i32, zzhwVar2, false, zzwiVar2, zzycVar2, zzm2, zzuiVar, zzkxVar32.zzl, zzkxVar32.zzm, zzkxVar32.zzn, j, 0L, j, 0L, false);
                if (z3) {
                }
            }
        }
        j = j3;
        j2 = j4;
        z5 = false;
        this.zzr.zzj();
        this.zzD = false;
        zzccVar = this.zzw.zza;
        if (z3) {
            zzccVar = ((zzlc) zzccVar).zzx(this.zzs.zzq());
            if (zzuiVar2.zzb != -1) {
            }
        }
        zzccVar2 = zzccVar;
        zzuiVar = zzuiVar2;
        zzkx zzkxVar222 = this.zzw;
        int i322 = zzkxVar222.zze;
        zzhw zzhwVar22 = z4 ? null : zzkxVar222.zzf;
        zzwi zzwiVar22 = z5 ? zzwi.zza : zzkxVar222.zzh;
        zzyc zzycVar22 = z5 ? this.zzf : this.zzw.zzi;
        List zzm22 = z5 ? zzfxr.zzm() : this.zzw.zzj;
        zzkx zzkxVar322 = this.zzw;
        this.zzw = new zzkx(zzccVar2, zzuiVar, j2, j, i322, zzhwVar22, false, zzwiVar22, zzycVar22, zzm22, zzuiVar, zzkxVar322.zzl, zzkxVar322.zzm, zzkxVar322.zzn, j, 0L, j, 0L, false);
        if (z3) {
        }
    }

    private final void zzM() {
        zzkh zze = this.zzr.zze();
        boolean z = false;
        if (zze != null && zze.zzf.zzh && this.zzz) {
            z = true;
        }
        this.zzA = z;
    }

    private final void zzN(long j) throws zzhw {
        zzkh zze = this.zzr.zze();
        long zze2 = j + (zze == null ? 1000000000000L : zze.zze());
        this.zzJ = zze2;
        this.zzo.zzf(zze2);
        zzle[] zzleVarArr = this.zzb;
        int length = zzleVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzle zzleVar = zzleVarArr[i];
            if (zzae(zzleVar)) {
                zzleVar.zzJ(this.zzJ);
            }
        }
        for (zzkh zze3 = this.zzr.zze(); zze3 != null; zze3 = zze3.zzg()) {
            for (zzxv zzxvVar : zze3.zzi().zzc) {
            }
        }
    }

    private final void zzO(zzcc zzccVar, zzcc zzccVar2) {
        if (zzccVar.zzo() && zzccVar2.zzo()) {
            return;
        }
        int size = this.zzp.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzp);
            return;
        }
        zzju zzjuVar = (zzju) this.zzp.get(size);
        Object obj = zzjuVar.zzb;
        zzla zzlaVar = zzjuVar.zza;
        int i = zzet.zza;
        zzla zzlaVar2 = zzjuVar.zza;
        throw null;
    }

    private final void zzP(long j) {
        this.zzi.zzj(2, j + ((this.zzw.zze != 3 || zzah()) ? zza : 1000L));
    }

    private final void zzQ(boolean z) throws zzhw {
        zzui zzuiVar = this.zzr.zze().zzf.zza;
        long zzv = zzv(zzuiVar, this.zzw.zzr, true, false);
        if (zzv != this.zzw.zzr) {
            zzkx zzkxVar = this.zzw;
            this.zzw = zzy(zzuiVar, zzv, zzkxVar.zzc, zzkxVar.zzd, z, 5);
        }
    }

    private final void zzR(zzbq zzbqVar) {
        this.zzi.zzf(16);
        this.zzo.zzg(zzbqVar);
    }

    private final void zzS(boolean z, int i, boolean z2, int i2) throws zzhw {
        this.zzx.zza(z2 ? 1 : 0);
        this.zzx.zzb(i2);
        this.zzw = this.zzw.zzc(z, i);
        zzab(false, false);
        for (zzkh zze = this.zzr.zze(); zze != null; zze = zze.zzg()) {
            for (zzxv zzxvVar : zze.zzi().zzc) {
            }
        }
        if (!zzah()) {
            zzW();
            zzZ();
            return;
        }
        int i3 = this.zzw.zze;
        if (i3 == 3) {
            this.zzo.zzh();
            zzU();
            this.zzi.zzi(2);
        } else if (i3 == 2) {
            this.zzi.zzi(2);
        }
    }

    private final void zzT(int i) {
        zzkx zzkxVar = this.zzw;
        if (zzkxVar.zze != i) {
            if (i != 2) {
                this.zzO = -9223372036854775807L;
            }
            this.zzw = zzkxVar.zze(i);
        }
    }

    private final void zzU() throws zzhw {
        zzkh zze = this.zzr.zze();
        if (zze == null) {
            return;
        }
        zzyc zzi = zze.zzi();
        int i = 0;
        while (true) {
            int length = this.zzb.length;
            if (i >= 2) {
                return;
            }
            if (zzi.zzb(i) && this.zzb[i].zzcV() == 1) {
                this.zzb[i].zzO();
            }
            i++;
        }
    }

    private final void zzV(boolean z, boolean z2) {
        zzL(z || !this.zzG, false, true, false);
        this.zzx.zza(z2 ? 1 : 0);
        this.zzg.zze(this.zzu);
        zzT(1);
    }

    private final void zzW() throws zzhw {
        this.zzo.zzi();
        zzle[] zzleVarArr = this.zzb;
        int length = zzleVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzle zzleVar = zzleVarArr[i];
            if (zzae(zzleVar)) {
                zzal(zzleVar);
            }
        }
    }

    private final void zzX() {
        zzkh zzd = this.zzr.zzd();
        boolean z = this.zzD || (zzd != null && zzd.zza.zzp());
        zzkx zzkxVar = this.zzw;
        if (z != zzkxVar.zzg) {
            zzcc zzccVar = zzkxVar.zza;
            zzui zzuiVar = zzkxVar.zzb;
            long j = zzkxVar.zzc;
            long j2 = zzkxVar.zzd;
            int i = zzkxVar.zze;
            zzhw zzhwVar = zzkxVar.zzf;
            zzwi zzwiVar = zzkxVar.zzh;
            zzyc zzycVar = zzkxVar.zzi;
            List list = zzkxVar.zzj;
            zzui zzuiVar2 = zzkxVar.zzk;
            boolean z2 = zzkxVar.zzl;
            int i2 = zzkxVar.zzm;
            zzbq zzbqVar = zzkxVar.zzn;
            long j3 = zzkxVar.zzp;
            long j4 = zzkxVar.zzq;
            long j5 = zzkxVar.zzr;
            long j6 = zzkxVar.zzs;
            boolean z3 = zzkxVar.zzo;
            this.zzw = new zzkx(zzccVar, zzuiVar, j, j2, i, zzhwVar, z, zzwiVar, zzycVar, list, zzuiVar2, z2, i2, zzbqVar, j3, j4, j5, j6, false);
        }
    }

    private final void zzY(zzui zzuiVar, zzwi zzwiVar, zzyc zzycVar) {
        zzcc zzccVar = this.zzw.zza;
        zzxv[] zzxvVarArr = zzycVar.zzc;
        this.zzg.zzf(this.zzu, zzccVar, zzuiVar, this.zzb, zzwiVar, zzxvVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ae, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzZ() throws zzhw {
        zzju zzjuVar;
        zzkh zze = this.zzr.zze();
        if (zze == null) {
            return;
        }
        long zzd = zze.zzd ? zze.zza.zzd() : -9223372036854775807L;
        if (zzd != -9223372036854775807L) {
            if (!zze.zzr()) {
                this.zzr.zzq(zze);
                zzD(false);
                zzH();
            }
            zzN(zzd);
            if (zzd != this.zzw.zzr) {
                zzkx zzkxVar = this.zzw;
                this.zzw = zzy(zzkxVar.zzb, zzd, zzkxVar.zzc, zzd, true, 5);
            }
        } else {
            long zzb = this.zzo.zzb(zze != this.zzr.zzf());
            this.zzJ = zzb;
            long zze2 = zzb - zze.zze();
            long j = this.zzw.zzr;
            if (!this.zzp.isEmpty() && !this.zzw.zzb.zzb()) {
                if (this.zzM) {
                    j--;
                    this.zzM = false;
                }
                zzkx zzkxVar2 = this.zzw;
                int zza2 = zzkxVar2.zza.zza(zzkxVar2.zzb.zza);
                int min = Math.min(this.zzL, this.zzp.size());
                if (min > 0) {
                    zzjuVar = (zzju) this.zzp.get(min - 1);
                    while (zzjuVar != null && (zza2 < 0 || (zza2 == 0 && j < 0))) {
                        int i = min - 1;
                        if (i > 0) {
                            zzjuVar = (zzju) this.zzp.get(min - 2);
                            min = i;
                        } else {
                            min = i;
                        }
                    }
                    if (min < this.zzp.size()) {
                    }
                    this.zzL = min;
                }
                zzjuVar = null;
            }
            if (this.zzo.zzj()) {
                boolean z = !this.zzx.zzc;
                zzkx zzkxVar3 = this.zzw;
                this.zzw = zzy(zzkxVar3.zzb, zze2, zzkxVar3.zzc, zze2, z, 6);
            } else {
                zzkx zzkxVar4 = this.zzw;
                zzkxVar4.zzr = zze2;
                zzkxVar4.zzs = SystemClock.elapsedRealtime();
            }
        }
        this.zzw.zzp = this.zzr.zzd().zzc();
        this.zzw.zzq = zzs();
        zzkx zzkxVar5 = this.zzw;
        if (zzkxVar5.zzl && zzkxVar5.zze == 3 && zzai(zzkxVar5.zza, zzkxVar5.zzb)) {
            zzkx zzkxVar6 = this.zzw;
            if (zzkxVar6.zzn.zzb == 1.0f) {
                float zza3 = this.zzR.zza(zzr(zzkxVar6.zza, zzkxVar6.zzb.zza, zzkxVar6.zzr), zzs());
                if (this.zzo.zzc().zzb != zza3) {
                    zzR(new zzbq(zza3, this.zzw.zzn.zzc));
                    zzG(this.zzw.zzn, this.zzo.zzc().zzb, false, false);
                }
            }
        }
    }

    private final void zzaa(zzcc zzccVar, zzui zzuiVar, zzcc zzccVar2, zzui zzuiVar2, long j, boolean z) throws zzhw {
        if (!zzai(zzccVar, zzuiVar)) {
            zzbq zzbqVar = zzuiVar.zzb() ? zzbq.zza : this.zzw.zzn;
            if (this.zzo.zzc().equals(zzbqVar)) {
                return;
            }
            zzR(zzbqVar);
            zzG(this.zzw.zzn, zzbqVar.zzb, false, false);
            return;
        }
        zzccVar.zze(zzccVar.zzn(zzuiVar.zza, this.zzm).zzc, this.zzl, 0L);
        zzhq zzhqVar = this.zzR;
        zzav zzavVar = this.zzl.zzj;
        int i = zzet.zza;
        zzhqVar.zzd(zzavVar);
        if (j != -9223372036854775807L) {
            this.zzR.zze(zzr(zzccVar, zzuiVar.zza, j));
            return;
        }
        if (!zzet.zzG(!zzccVar2.zzo() ? zzccVar2.zze(zzccVar2.zzn(zzuiVar2.zza, this.zzm).zzc, this.zzl, 0L).zzb : null, this.zzl.zzb) || z) {
            this.zzR.zze(-9223372036854775807L);
        }
    }

    private final void zzab(boolean z, boolean z2) {
        this.zzB = z;
        long j = -9223372036854775807L;
        if (z && !z2) {
            j = SystemClock.elapsedRealtime();
        }
        this.zzC = j;
    }

    private final synchronized void zzac(zzfvk zzfvkVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (true) {
            boolean z2 = ((zzjn) zzfvkVar).zza.zzy;
            Boolean.valueOf(z2).getClass();
            if (z2 || j <= 0) {
                break;
            }
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
        zzkh zzd = this.zzr.zzd();
        return (zzd == null || zzd.zzd() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean zzae(zzle zzleVar) {
        return zzleVar.zzcV() != 0;
    }

    private final boolean zzaf() {
        zzkh zze = this.zzr.zze();
        long j = zze.zzf.zze;
        if (zze.zzd) {
            return j == -9223372036854775807L || this.zzw.zzr < j || !zzah();
        }
        return false;
    }

    private static boolean zzag(zzkx zzkxVar, zzca zzcaVar) {
        zzui zzuiVar = zzkxVar.zzb;
        zzcc zzccVar = zzkxVar.zza;
        return zzccVar.zzo() || zzccVar.zzn(zzuiVar.zza, zzcaVar).zzf;
    }

    private final boolean zzah() {
        zzkx zzkxVar = this.zzw;
        return zzkxVar.zzl && zzkxVar.zzm == 0;
    }

    private final boolean zzai(zzcc zzccVar, zzui zzuiVar) {
        if (!zzuiVar.zzb() && !zzccVar.zzo()) {
            zzccVar.zze(zzccVar.zzn(zzuiVar.zza, this.zzm).zzc, this.zzl, 0L);
            if (this.zzl.zzb()) {
                zzcb zzcbVar = this.zzl;
                if (zzcbVar.zzi && zzcbVar.zzf != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzaf[] zzaj(zzxv zzxvVar) {
        int zzc = zzxvVar != null ? zzxvVar.zzc() : 0;
        zzaf[] zzafVarArr = new zzaf[zzc];
        for (int i = 0; i < zzc; i++) {
            zzafVarArr[i] = zzxvVar.zzd(i);
        }
        return zzafVarArr;
    }

    private static final void zzak(zzla zzlaVar) throws zzhw {
        zzlaVar.zzj();
        try {
            zzlaVar.zzc().zzt(zzlaVar.zza(), zzlaVar.zzg());
        } finally {
            zzlaVar.zzh(true);
        }
    }

    private static final void zzal(zzle zzleVar) {
        if (zzleVar.zzcV() == 2) {
            zzleVar.zzP();
        }
    }

    private static final void zzam(zzle zzleVar, long j) {
        zzleVar.zzK();
        if (zzleVar instanceof zzwm) {
            throw null;
        }
    }

    static int zzb(zzcb zzcbVar, zzca zzcaVar, int i, boolean z, Object obj, zzcc zzccVar, zzcc zzccVar2) {
        Object obj2 = zzccVar.zze(zzccVar.zzn(obj, zzcaVar).zzc, zzcbVar, 0L).zzb;
        for (int i2 = 0; i2 < zzccVar2.zzc(); i2++) {
            if (zzccVar2.zze(i2, zzcbVar, 0L).zzb.equals(obj2)) {
                return i2;
            }
        }
        int zza2 = zzccVar.zza(obj);
        int zzb = zzccVar.zzb();
        int i3 = zza2;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            if (i5 >= zzb || i4 != -1) {
                break;
            }
            i3 = zzccVar.zzi(i3, zzcaVar, zzcbVar, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = zzccVar2.zza(zzccVar.zzf(i3));
            i5++;
        }
        if (i4 == -1) {
            return -1;
        }
        return zzccVar2.zzd(i4, zzcaVar, false).zzc;
    }

    public static /* synthetic */ zzkh zzd(zzjx zzjxVar, zzki zzkiVar, long j) {
        zzkb zzkbVar = zzjxVar.zzg;
        zzyb zzybVar = zzjxVar.zze;
        zzyk zzj = zzkbVar.zzj();
        zzyc zzycVar = zzjxVar.zzf;
        return new zzkh(zzjxVar.zzd, j, zzybVar, zzj, zzjxVar.zzs, zzkiVar, zzycVar);
    }

    static final /* synthetic */ void zzq(zzla zzlaVar) {
        try {
            zzak(zzlaVar);
        } catch (zzhw e) {
            zzea.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final long zzr(zzcc zzccVar, Object obj, long j) {
        zzccVar.zze(zzccVar.zzn(obj, this.zzm).zzc, this.zzl, 0L);
        zzcb zzcbVar = this.zzl;
        if (zzcbVar.zzf != -9223372036854775807L && zzcbVar.zzb()) {
            zzcb zzcbVar2 = this.zzl;
            if (zzcbVar2.zzi) {
                long j2 = zzcbVar2.zzg;
                return zzet.zzr((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - this.zzl.zzf) - j;
            }
        }
        return -9223372036854775807L;
    }

    private final long zzs() {
        return zzt(this.zzw.zzp);
    }

    private final long zzt(long j) {
        zzkh zzd = this.zzr.zzd();
        if (zzd == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzJ - zzd.zze()));
    }

    private final long zzu(zzui zzuiVar, long j, boolean z) throws zzhw {
        zzkk zzkkVar = this.zzr;
        return zzv(zzuiVar, j, zzkkVar.zze() != zzkkVar.zzf(), z);
    }

    private final long zzv(zzui zzuiVar, long j, boolean z, boolean z2) throws zzhw {
        zzW();
        zzab(false, true);
        if (z2 || this.zzw.zze == 3) {
            zzT(2);
        }
        zzkh zze = this.zzr.zze();
        zzkh zzkhVar = zze;
        while (zzkhVar != null && !zzuiVar.equals(zzkhVar.zzf.zza)) {
            zzkhVar = zzkhVar.zzg();
        }
        if (z || zze != zzkhVar || (zzkhVar != null && zzkhVar.zze() + j < 0)) {
            zzle[] zzleVarArr = this.zzb;
            int length = zzleVarArr.length;
            for (int i = 0; i < 2; i++) {
                zzz(zzleVarArr[i]);
            }
            if (zzkhVar != null) {
                while (this.zzr.zze() != zzkhVar) {
                    this.zzr.zza();
                }
                this.zzr.zzq(zzkhVar);
                zzkhVar.zzp(1000000000000L);
                zzA();
            }
        }
        if (zzkhVar != null) {
            this.zzr.zzq(zzkhVar);
            if (!zzkhVar.zzd) {
                zzkhVar.zzf = zzkhVar.zzf.zzb(j);
            } else if (zzkhVar.zze) {
                j = zzkhVar.zza.zze(j);
                zzkhVar.zza.zzj(j - this.zzn, false);
            }
            zzN(j);
            zzH();
        } else {
            this.zzr.zzj();
            zzN(j);
        }
        zzD(false);
        this.zzi.zzi(2);
        return j;
    }

    private final Pair zzw(zzcc zzccVar) {
        long j = 0;
        if (zzccVar.zzo()) {
            return Pair.create(zzkx.zzh(), 0L);
        }
        Pair zzl = zzccVar.zzl(this.zzl, this.zzm, zzccVar.zzg(this.zzF), -9223372036854775807L);
        zzui zzi = this.zzr.zzi(zzccVar, zzl.first, 0L);
        long longValue = ((Long) zzl.second).longValue();
        if (zzi.zzb()) {
            zzccVar.zzn(zzi.zza, this.zzm);
            if (zzi.zzc == this.zzm.zze(zzi.zzb)) {
                this.zzm.zzj();
            }
        } else {
            j = longValue;
        }
        return Pair.create(zzi, Long.valueOf(j));
    }

    private static Pair zzx(zzcc zzccVar, zzjw zzjwVar, boolean z, int i, boolean z2, zzcb zzcbVar, zzca zzcaVar) {
        Pair zzl;
        zzcc zzccVar2 = zzjwVar.zza;
        if (zzccVar.zzo()) {
            return null;
        }
        zzcc zzccVar3 = true == zzccVar2.zzo() ? zzccVar : zzccVar2;
        try {
            zzl = zzccVar3.zzl(zzcbVar, zzcaVar, zzjwVar.zzb, zzjwVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzccVar.equals(zzccVar3)) {
            return zzl;
        }
        if (zzccVar.zza(zzl.first) != -1) {
            return (zzccVar3.zzn(zzl.first, zzcaVar).zzf && zzccVar3.zze(zzcaVar.zzc, zzcbVar, 0L).zzn == zzccVar3.zza(zzl.first)) ? zzccVar.zzl(zzcbVar, zzcaVar, zzccVar.zzn(zzl.first, zzcaVar).zzc, zzjwVar.zzc) : zzl;
        }
        int zzb = zzb(zzcbVar, zzcaVar, i, z2, zzl.first, zzccVar3, zzccVar);
        if (zzb != -1) {
            return zzccVar.zzl(zzcbVar, zzcaVar, zzb, -9223372036854775807L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzkx zzy(zzui zzuiVar, long j, long j2, long j3, boolean z, int i) {
        List list;
        zzyc zzycVar;
        zzwi zzwiVar;
        int i2 = 0;
        this.zzM = (!this.zzM && j == this.zzw.zzr && zzuiVar.equals(this.zzw.zzb)) ? false : true;
        zzM();
        zzkx zzkxVar = this.zzw;
        zzwi zzwiVar2 = zzkxVar.zzh;
        zzyc zzycVar2 = zzkxVar.zzi;
        List list2 = zzkxVar.zzj;
        if (this.zzs.zzj()) {
            zzkh zze = this.zzr.zze();
            zzwiVar2 = zze == null ? zzwi.zza : zze.zzh();
            zzycVar2 = zze == null ? this.zzf : zze.zzi();
            zzxv[] zzxvVarArr = zzycVar2.zzc;
            zzfxo zzfxoVar = new zzfxo();
            boolean z2 = false;
            for (zzxv zzxvVar : zzxvVarArr) {
                if (zzxvVar != null) {
                    zzbk zzbkVar = zzxvVar.zzd(0).zzk;
                    if (zzbkVar == null) {
                        zzfxoVar.zzf(new zzbk(-9223372036854775807L, new zzbj[0]));
                    } else {
                        zzfxoVar.zzf(zzbkVar);
                        z2 = true;
                    }
                }
            }
            zzfxr zzi = z2 ? zzfxoVar.zzi() : zzfxr.zzm();
            if (zze != null) {
                zzki zzkiVar = zze.zzf;
                if (zzkiVar.zzc != j2) {
                    zze.zzf = zzkiVar.zza(j2);
                }
            }
            zzkh zze2 = this.zzr.zze();
            if (zze2 != null) {
                zzyc zzi2 = zze2.zzi();
                while (true) {
                    int length = this.zzb.length;
                    if (i2 >= 2) {
                        break;
                    }
                    if (zzi2.zzb(i2)) {
                        if (this.zzb[i2].zzb() != 1) {
                            break;
                        }
                        int i3 = zzi2.zzb[i2].zzb;
                    }
                    i2++;
                }
            }
            list = zzi;
        } else {
            if (!zzuiVar.equals(this.zzw.zzb)) {
                zzycVar = this.zzf;
                zzwiVar = zzwi.zza;
                list = zzfxr.zzm();
                if (z) {
                    this.zzx.zzd(i);
                }
                return this.zzw.zzb(zzuiVar, j, j2, j3, zzs(), zzwiVar, zzycVar, list);
            }
            list = list2;
        }
        zzwiVar = zzwiVar2;
        zzycVar = zzycVar2;
        if (z) {
        }
        return this.zzw.zzb(zzuiVar, j, j2, j3, zzs(), zzwiVar, zzycVar, list);
    }

    private final void zzz(zzle zzleVar) throws zzhw {
        if (zzae(zzleVar)) {
            this.zzo.zzd(zzleVar);
            zzal(zzleVar);
            zzleVar.zzq();
            this.zzH--;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:424:0x08b5, code lost:
    
        if (r38.zzg.zzi(new com.google.android.gms.internal.ads.zzka(r38.zzu, r38.zzw.zza, r3.zzf.zza, r38.zzJ - r3.zze(), zzs(), r38.zzo.zzc().zzb, r38.zzw.zzl, r38.zzB, r36)) == false) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x08e1, code lost:
    
        if (r4 == false) goto L462;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0608 A[Catch: RuntimeException -> 0x09f8, IOException -> 0x0a23, zzti -> 0x0a2b, zzft -> 0x0a33, zzbo -> 0x0a3b, zzrb -> 0x0a52, zzhw -> 0x0a5c, TryCatch #10 {zzbo -> 0x0a3b, zzft -> 0x0a33, zzhw -> 0x0a5c, zzrb -> 0x0a52, zzti -> 0x0a2b, IOException -> 0x0a23, RuntimeException -> 0x09f8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x0027, B:12:0x003f, B:13:0x0044, B:14:0x0049, B:17:0x0050, B:19:0x0059, B:21:0x0067, B:23:0x006f, B:24:0x007a, B:25:0x008e, B:26:0x00a6, B:27:0x00c2, B:29:0x00d1, B:30:0x00d5, B:31:0x00e6, B:33:0x00f5, B:34:0x0111, B:35:0x0124, B:36:0x012d, B:38:0x013f, B:39:0x014b, B:40:0x015b, B:42:0x0167, B:45:0x0172, B:46:0x0179, B:47:0x0186, B:50:0x018d, B:52:0x0195, B:54:0x0199, B:56:0x019f, B:58:0x01a7, B:60:0x01af, B:62:0x01b2, B:67:0x01b7, B:76:0x01c4, B:78:0x01c5, B:81:0x01cc, B:83:0x01da, B:84:0x01dd, B:86:0x01e2, B:88:0x01f2, B:89:0x01f5, B:90:0x01fa, B:91:0x01ff, B:93:0x020b, B:94:0x0217, B:96:0x0223, B:98:0x024f, B:99:0x026f, B:560:0x0298, B:562:0x029c, B:563:0x029f, B:572:0x02aa, B:100:0x02c0, B:101:0x02c5, B:102:0x02cd, B:103:0x02df, B:105:0x0306, B:113:0x041d, B:114:0x03ea, B:140:0x03e6, B:155:0x042e, B:156:0x043b, B:170:0x0328, B:173:0x033b, B:175:0x034b, B:177:0x0362, B:179:0x036c, B:186:0x043c, B:188:0x0450, B:191:0x045a, B:193:0x0469, B:195:0x0475, B:197:0x048a, B:198:0x048f, B:199:0x0493, B:201:0x0497, B:202:0x04a4, B:205:0x0600, B:207:0x0608, B:209:0x0610, B:212:0x0615, B:213:0x0621, B:215:0x0627, B:217:0x062f, B:222:0x063f, B:224:0x0645, B:226:0x0665, B:228:0x066b, B:221:0x0670, B:235:0x0675, B:237:0x0679, B:283:0x0733, B:284:0x0739, B:288:0x0744, B:290:0x074c, B:291:0x0751, B:293:0x075d, B:294:0x0777, B:296:0x077d, B:298:0x0785, B:300:0x078e, B:303:0x0797, B:307:0x07a6, B:312:0x07b3, B:314:0x07b9, B:322:0x07cc, B:324:0x07cf, B:333:0x07d9, B:335:0x07df, B:339:0x07ec, B:341:0x07f4, B:343:0x07f8, B:344:0x0803, B:346:0x0809, B:347:0x0917, B:350:0x091f, B:352:0x0924, B:354:0x092c, B:356:0x093a, B:358:0x0941, B:362:0x0945, B:364:0x094b, B:366:0x0954, B:368:0x095a, B:370:0x0965, B:371:0x0989, B:373:0x098f, B:376:0x0998, B:379:0x09b2, B:384:0x09ab, B:386:0x09af, B:388:0x096c, B:391:0x097a, B:392:0x0981, B:393:0x0982, B:394:0x0811, B:396:0x0818, B:398:0x081c, B:401:0x08b7, B:403:0x08c3, B:406:0x0828, B:408:0x082c, B:410:0x0840, B:411:0x084e, B:413:0x085a, B:416:0x0863, B:418:0x086d, B:423:0x0878, B:428:0x08d0, B:430:0x08d6, B:432:0x08da, B:435:0x08e3, B:437:0x08f3, B:439:0x08fb, B:441:0x0905, B:443:0x090a, B:445:0x090f, B:446:0x0914, B:448:0x07d2, B:239:0x0683, B:241:0x0687, B:243:0x068f, B:245:0x0695, B:247:0x069f, B:250:0x06a5, B:251:0x06a8, B:253:0x06b0, B:255:0x06c2, B:257:0x06cb, B:259:0x06d3, B:262:0x06dd, B:264:0x0705, B:265:0x0708, B:266:0x0713, B:268:0x0719, B:270:0x071f, B:272:0x0726, B:280:0x0732, B:454:0x04b3, B:456:0x04b9, B:459:0x04bf, B:462:0x04ca, B:464:0x04cf, B:467:0x04dd, B:470:0x04e3, B:472:0x04eb, B:476:0x04ee, B:478:0x04f6, B:480:0x0504, B:482:0x0540, B:484:0x054a, B:487:0x0555, B:489:0x055d, B:491:0x0560, B:494:0x0563, B:496:0x0569, B:498:0x0578, B:500:0x057e, B:502:0x058a, B:504:0x0594, B:506:0x05a5, B:510:0x05ab, B:509:0x05b6, B:515:0x05bb, B:517:0x05c6, B:520:0x05cb, B:522:0x05d1, B:524:0x05d9, B:526:0x05df, B:528:0x05e5, B:532:0x05f3, B:533:0x05fa, B:535:0x05fd, B:541:0x04a1, B:543:0x09b7, B:546:0x09be, B:548:0x09c6, B:551:0x09e6, B:575:0x02ac, B:577:0x02b1, B:578:0x02b4, B:582:0x02bb, B:587:0x02bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0627 A[Catch: RuntimeException -> 0x09f8, IOException -> 0x0a23, zzti -> 0x0a2b, zzft -> 0x0a33, zzbo -> 0x0a3b, zzrb -> 0x0a52, zzhw -> 0x0a5c, TryCatch #10 {zzbo -> 0x0a3b, zzft -> 0x0a33, zzhw -> 0x0a5c, zzrb -> 0x0a52, zzti -> 0x0a2b, IOException -> 0x0a23, RuntimeException -> 0x09f8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x0027, B:12:0x003f, B:13:0x0044, B:14:0x0049, B:17:0x0050, B:19:0x0059, B:21:0x0067, B:23:0x006f, B:24:0x007a, B:25:0x008e, B:26:0x00a6, B:27:0x00c2, B:29:0x00d1, B:30:0x00d5, B:31:0x00e6, B:33:0x00f5, B:34:0x0111, B:35:0x0124, B:36:0x012d, B:38:0x013f, B:39:0x014b, B:40:0x015b, B:42:0x0167, B:45:0x0172, B:46:0x0179, B:47:0x0186, B:50:0x018d, B:52:0x0195, B:54:0x0199, B:56:0x019f, B:58:0x01a7, B:60:0x01af, B:62:0x01b2, B:67:0x01b7, B:76:0x01c4, B:78:0x01c5, B:81:0x01cc, B:83:0x01da, B:84:0x01dd, B:86:0x01e2, B:88:0x01f2, B:89:0x01f5, B:90:0x01fa, B:91:0x01ff, B:93:0x020b, B:94:0x0217, B:96:0x0223, B:98:0x024f, B:99:0x026f, B:560:0x0298, B:562:0x029c, B:563:0x029f, B:572:0x02aa, B:100:0x02c0, B:101:0x02c5, B:102:0x02cd, B:103:0x02df, B:105:0x0306, B:113:0x041d, B:114:0x03ea, B:140:0x03e6, B:155:0x042e, B:156:0x043b, B:170:0x0328, B:173:0x033b, B:175:0x034b, B:177:0x0362, B:179:0x036c, B:186:0x043c, B:188:0x0450, B:191:0x045a, B:193:0x0469, B:195:0x0475, B:197:0x048a, B:198:0x048f, B:199:0x0493, B:201:0x0497, B:202:0x04a4, B:205:0x0600, B:207:0x0608, B:209:0x0610, B:212:0x0615, B:213:0x0621, B:215:0x0627, B:217:0x062f, B:222:0x063f, B:224:0x0645, B:226:0x0665, B:228:0x066b, B:221:0x0670, B:235:0x0675, B:237:0x0679, B:283:0x0733, B:284:0x0739, B:288:0x0744, B:290:0x074c, B:291:0x0751, B:293:0x075d, B:294:0x0777, B:296:0x077d, B:298:0x0785, B:300:0x078e, B:303:0x0797, B:307:0x07a6, B:312:0x07b3, B:314:0x07b9, B:322:0x07cc, B:324:0x07cf, B:333:0x07d9, B:335:0x07df, B:339:0x07ec, B:341:0x07f4, B:343:0x07f8, B:344:0x0803, B:346:0x0809, B:347:0x0917, B:350:0x091f, B:352:0x0924, B:354:0x092c, B:356:0x093a, B:358:0x0941, B:362:0x0945, B:364:0x094b, B:366:0x0954, B:368:0x095a, B:370:0x0965, B:371:0x0989, B:373:0x098f, B:376:0x0998, B:379:0x09b2, B:384:0x09ab, B:386:0x09af, B:388:0x096c, B:391:0x097a, B:392:0x0981, B:393:0x0982, B:394:0x0811, B:396:0x0818, B:398:0x081c, B:401:0x08b7, B:403:0x08c3, B:406:0x0828, B:408:0x082c, B:410:0x0840, B:411:0x084e, B:413:0x085a, B:416:0x0863, B:418:0x086d, B:423:0x0878, B:428:0x08d0, B:430:0x08d6, B:432:0x08da, B:435:0x08e3, B:437:0x08f3, B:439:0x08fb, B:441:0x0905, B:443:0x090a, B:445:0x090f, B:446:0x0914, B:448:0x07d2, B:239:0x0683, B:241:0x0687, B:243:0x068f, B:245:0x0695, B:247:0x069f, B:250:0x06a5, B:251:0x06a8, B:253:0x06b0, B:255:0x06c2, B:257:0x06cb, B:259:0x06d3, B:262:0x06dd, B:264:0x0705, B:265:0x0708, B:266:0x0713, B:268:0x0719, B:270:0x071f, B:272:0x0726, B:280:0x0732, B:454:0x04b3, B:456:0x04b9, B:459:0x04bf, B:462:0x04ca, B:464:0x04cf, B:467:0x04dd, B:470:0x04e3, B:472:0x04eb, B:476:0x04ee, B:478:0x04f6, B:480:0x0504, B:482:0x0540, B:484:0x054a, B:487:0x0555, B:489:0x055d, B:491:0x0560, B:494:0x0563, B:496:0x0569, B:498:0x0578, B:500:0x057e, B:502:0x058a, B:504:0x0594, B:506:0x05a5, B:510:0x05ab, B:509:0x05b6, B:515:0x05bb, B:517:0x05c6, B:520:0x05cb, B:522:0x05d1, B:524:0x05d9, B:526:0x05df, B:528:0x05e5, B:532:0x05f3, B:533:0x05fa, B:535:0x05fd, B:541:0x04a1, B:543:0x09b7, B:546:0x09be, B:548:0x09c6, B:551:0x09e6, B:575:0x02ac, B:577:0x02b1, B:578:0x02b4, B:582:0x02bb, B:587:0x02bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0673 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0683 A[Catch: RuntimeException -> 0x09f8, IOException -> 0x0a23, zzti -> 0x0a2b, zzft -> 0x0a33, zzbo -> 0x0a3b, zzrb -> 0x0a52, zzhw -> 0x0a5c, TryCatch #10 {zzbo -> 0x0a3b, zzft -> 0x0a33, zzhw -> 0x0a5c, zzrb -> 0x0a52, zzti -> 0x0a2b, IOException -> 0x0a23, RuntimeException -> 0x09f8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x0027, B:12:0x003f, B:13:0x0044, B:14:0x0049, B:17:0x0050, B:19:0x0059, B:21:0x0067, B:23:0x006f, B:24:0x007a, B:25:0x008e, B:26:0x00a6, B:27:0x00c2, B:29:0x00d1, B:30:0x00d5, B:31:0x00e6, B:33:0x00f5, B:34:0x0111, B:35:0x0124, B:36:0x012d, B:38:0x013f, B:39:0x014b, B:40:0x015b, B:42:0x0167, B:45:0x0172, B:46:0x0179, B:47:0x0186, B:50:0x018d, B:52:0x0195, B:54:0x0199, B:56:0x019f, B:58:0x01a7, B:60:0x01af, B:62:0x01b2, B:67:0x01b7, B:76:0x01c4, B:78:0x01c5, B:81:0x01cc, B:83:0x01da, B:84:0x01dd, B:86:0x01e2, B:88:0x01f2, B:89:0x01f5, B:90:0x01fa, B:91:0x01ff, B:93:0x020b, B:94:0x0217, B:96:0x0223, B:98:0x024f, B:99:0x026f, B:560:0x0298, B:562:0x029c, B:563:0x029f, B:572:0x02aa, B:100:0x02c0, B:101:0x02c5, B:102:0x02cd, B:103:0x02df, B:105:0x0306, B:113:0x041d, B:114:0x03ea, B:140:0x03e6, B:155:0x042e, B:156:0x043b, B:170:0x0328, B:173:0x033b, B:175:0x034b, B:177:0x0362, B:179:0x036c, B:186:0x043c, B:188:0x0450, B:191:0x045a, B:193:0x0469, B:195:0x0475, B:197:0x048a, B:198:0x048f, B:199:0x0493, B:201:0x0497, B:202:0x04a4, B:205:0x0600, B:207:0x0608, B:209:0x0610, B:212:0x0615, B:213:0x0621, B:215:0x0627, B:217:0x062f, B:222:0x063f, B:224:0x0645, B:226:0x0665, B:228:0x066b, B:221:0x0670, B:235:0x0675, B:237:0x0679, B:283:0x0733, B:284:0x0739, B:288:0x0744, B:290:0x074c, B:291:0x0751, B:293:0x075d, B:294:0x0777, B:296:0x077d, B:298:0x0785, B:300:0x078e, B:303:0x0797, B:307:0x07a6, B:312:0x07b3, B:314:0x07b9, B:322:0x07cc, B:324:0x07cf, B:333:0x07d9, B:335:0x07df, B:339:0x07ec, B:341:0x07f4, B:343:0x07f8, B:344:0x0803, B:346:0x0809, B:347:0x0917, B:350:0x091f, B:352:0x0924, B:354:0x092c, B:356:0x093a, B:358:0x0941, B:362:0x0945, B:364:0x094b, B:366:0x0954, B:368:0x095a, B:370:0x0965, B:371:0x0989, B:373:0x098f, B:376:0x0998, B:379:0x09b2, B:384:0x09ab, B:386:0x09af, B:388:0x096c, B:391:0x097a, B:392:0x0981, B:393:0x0982, B:394:0x0811, B:396:0x0818, B:398:0x081c, B:401:0x08b7, B:403:0x08c3, B:406:0x0828, B:408:0x082c, B:410:0x0840, B:411:0x084e, B:413:0x085a, B:416:0x0863, B:418:0x086d, B:423:0x0878, B:428:0x08d0, B:430:0x08d6, B:432:0x08da, B:435:0x08e3, B:437:0x08f3, B:439:0x08fb, B:441:0x0905, B:443:0x090a, B:445:0x090f, B:446:0x0914, B:448:0x07d2, B:239:0x0683, B:241:0x0687, B:243:0x068f, B:245:0x0695, B:247:0x069f, B:250:0x06a5, B:251:0x06a8, B:253:0x06b0, B:255:0x06c2, B:257:0x06cb, B:259:0x06d3, B:262:0x06dd, B:264:0x0705, B:265:0x0708, B:266:0x0713, B:268:0x0719, B:270:0x071f, B:272:0x0726, B:280:0x0732, B:454:0x04b3, B:456:0x04b9, B:459:0x04bf, B:462:0x04ca, B:464:0x04cf, B:467:0x04dd, B:470:0x04e3, B:472:0x04eb, B:476:0x04ee, B:478:0x04f6, B:480:0x0504, B:482:0x0540, B:484:0x054a, B:487:0x0555, B:489:0x055d, B:491:0x0560, B:494:0x0563, B:496:0x0569, B:498:0x0578, B:500:0x057e, B:502:0x058a, B:504:0x0594, B:506:0x05a5, B:510:0x05ab, B:509:0x05b6, B:515:0x05bb, B:517:0x05c6, B:520:0x05cb, B:522:0x05d1, B:524:0x05d9, B:526:0x05df, B:528:0x05e5, B:532:0x05f3, B:533:0x05fa, B:535:0x05fd, B:541:0x04a1, B:543:0x09b7, B:546:0x09be, B:548:0x09c6, B:551:0x09e6, B:575:0x02ac, B:577:0x02b1, B:578:0x02b4, B:582:0x02bb, B:587:0x02bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06a5 A[Catch: RuntimeException -> 0x09f8, IOException -> 0x0a23, zzti -> 0x0a2b, zzft -> 0x0a33, zzbo -> 0x0a3b, zzrb -> 0x0a52, zzhw -> 0x0a5c, TryCatch #10 {zzbo -> 0x0a3b, zzft -> 0x0a33, zzhw -> 0x0a5c, zzrb -> 0x0a52, zzti -> 0x0a2b, IOException -> 0x0a23, RuntimeException -> 0x09f8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x0027, B:12:0x003f, B:13:0x0044, B:14:0x0049, B:17:0x0050, B:19:0x0059, B:21:0x0067, B:23:0x006f, B:24:0x007a, B:25:0x008e, B:26:0x00a6, B:27:0x00c2, B:29:0x00d1, B:30:0x00d5, B:31:0x00e6, B:33:0x00f5, B:34:0x0111, B:35:0x0124, B:36:0x012d, B:38:0x013f, B:39:0x014b, B:40:0x015b, B:42:0x0167, B:45:0x0172, B:46:0x0179, B:47:0x0186, B:50:0x018d, B:52:0x0195, B:54:0x0199, B:56:0x019f, B:58:0x01a7, B:60:0x01af, B:62:0x01b2, B:67:0x01b7, B:76:0x01c4, B:78:0x01c5, B:81:0x01cc, B:83:0x01da, B:84:0x01dd, B:86:0x01e2, B:88:0x01f2, B:89:0x01f5, B:90:0x01fa, B:91:0x01ff, B:93:0x020b, B:94:0x0217, B:96:0x0223, B:98:0x024f, B:99:0x026f, B:560:0x0298, B:562:0x029c, B:563:0x029f, B:572:0x02aa, B:100:0x02c0, B:101:0x02c5, B:102:0x02cd, B:103:0x02df, B:105:0x0306, B:113:0x041d, B:114:0x03ea, B:140:0x03e6, B:155:0x042e, B:156:0x043b, B:170:0x0328, B:173:0x033b, B:175:0x034b, B:177:0x0362, B:179:0x036c, B:186:0x043c, B:188:0x0450, B:191:0x045a, B:193:0x0469, B:195:0x0475, B:197:0x048a, B:198:0x048f, B:199:0x0493, B:201:0x0497, B:202:0x04a4, B:205:0x0600, B:207:0x0608, B:209:0x0610, B:212:0x0615, B:213:0x0621, B:215:0x0627, B:217:0x062f, B:222:0x063f, B:224:0x0645, B:226:0x0665, B:228:0x066b, B:221:0x0670, B:235:0x0675, B:237:0x0679, B:283:0x0733, B:284:0x0739, B:288:0x0744, B:290:0x074c, B:291:0x0751, B:293:0x075d, B:294:0x0777, B:296:0x077d, B:298:0x0785, B:300:0x078e, B:303:0x0797, B:307:0x07a6, B:312:0x07b3, B:314:0x07b9, B:322:0x07cc, B:324:0x07cf, B:333:0x07d9, B:335:0x07df, B:339:0x07ec, B:341:0x07f4, B:343:0x07f8, B:344:0x0803, B:346:0x0809, B:347:0x0917, B:350:0x091f, B:352:0x0924, B:354:0x092c, B:356:0x093a, B:358:0x0941, B:362:0x0945, B:364:0x094b, B:366:0x0954, B:368:0x095a, B:370:0x0965, B:371:0x0989, B:373:0x098f, B:376:0x0998, B:379:0x09b2, B:384:0x09ab, B:386:0x09af, B:388:0x096c, B:391:0x097a, B:392:0x0981, B:393:0x0982, B:394:0x0811, B:396:0x0818, B:398:0x081c, B:401:0x08b7, B:403:0x08c3, B:406:0x0828, B:408:0x082c, B:410:0x0840, B:411:0x084e, B:413:0x085a, B:416:0x0863, B:418:0x086d, B:423:0x0878, B:428:0x08d0, B:430:0x08d6, B:432:0x08da, B:435:0x08e3, B:437:0x08f3, B:439:0x08fb, B:441:0x0905, B:443:0x090a, B:445:0x090f, B:446:0x0914, B:448:0x07d2, B:239:0x0683, B:241:0x0687, B:243:0x068f, B:245:0x0695, B:247:0x069f, B:250:0x06a5, B:251:0x06a8, B:253:0x06b0, B:255:0x06c2, B:257:0x06cb, B:259:0x06d3, B:262:0x06dd, B:264:0x0705, B:265:0x0708, B:266:0x0713, B:268:0x0719, B:270:0x071f, B:272:0x0726, B:280:0x0732, B:454:0x04b3, B:456:0x04b9, B:459:0x04bf, B:462:0x04ca, B:464:0x04cf, B:467:0x04dd, B:470:0x04e3, B:472:0x04eb, B:476:0x04ee, B:478:0x04f6, B:480:0x0504, B:482:0x0540, B:484:0x054a, B:487:0x0555, B:489:0x055d, B:491:0x0560, B:494:0x0563, B:496:0x0569, B:498:0x0578, B:500:0x057e, B:502:0x058a, B:504:0x0594, B:506:0x05a5, B:510:0x05ab, B:509:0x05b6, B:515:0x05bb, B:517:0x05c6, B:520:0x05cb, B:522:0x05d1, B:524:0x05d9, B:526:0x05df, B:528:0x05e5, B:532:0x05f3, B:533:0x05fa, B:535:0x05fd, B:541:0x04a1, B:543:0x09b7, B:546:0x09be, B:548:0x09c6, B:551:0x09e6, B:575:0x02ac, B:577:0x02b1, B:578:0x02b4, B:582:0x02bb, B:587:0x02bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06b0 A[Catch: RuntimeException -> 0x09f8, IOException -> 0x0a23, zzti -> 0x0a2b, zzft -> 0x0a33, zzbo -> 0x0a3b, zzrb -> 0x0a52, zzhw -> 0x0a5c, TryCatch #10 {zzbo -> 0x0a3b, zzft -> 0x0a33, zzhw -> 0x0a5c, zzrb -> 0x0a52, zzti -> 0x0a2b, IOException -> 0x0a23, RuntimeException -> 0x09f8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x0027, B:12:0x003f, B:13:0x0044, B:14:0x0049, B:17:0x0050, B:19:0x0059, B:21:0x0067, B:23:0x006f, B:24:0x007a, B:25:0x008e, B:26:0x00a6, B:27:0x00c2, B:29:0x00d1, B:30:0x00d5, B:31:0x00e6, B:33:0x00f5, B:34:0x0111, B:35:0x0124, B:36:0x012d, B:38:0x013f, B:39:0x014b, B:40:0x015b, B:42:0x0167, B:45:0x0172, B:46:0x0179, B:47:0x0186, B:50:0x018d, B:52:0x0195, B:54:0x0199, B:56:0x019f, B:58:0x01a7, B:60:0x01af, B:62:0x01b2, B:67:0x01b7, B:76:0x01c4, B:78:0x01c5, B:81:0x01cc, B:83:0x01da, B:84:0x01dd, B:86:0x01e2, B:88:0x01f2, B:89:0x01f5, B:90:0x01fa, B:91:0x01ff, B:93:0x020b, B:94:0x0217, B:96:0x0223, B:98:0x024f, B:99:0x026f, B:560:0x0298, B:562:0x029c, B:563:0x029f, B:572:0x02aa, B:100:0x02c0, B:101:0x02c5, B:102:0x02cd, B:103:0x02df, B:105:0x0306, B:113:0x041d, B:114:0x03ea, B:140:0x03e6, B:155:0x042e, B:156:0x043b, B:170:0x0328, B:173:0x033b, B:175:0x034b, B:177:0x0362, B:179:0x036c, B:186:0x043c, B:188:0x0450, B:191:0x045a, B:193:0x0469, B:195:0x0475, B:197:0x048a, B:198:0x048f, B:199:0x0493, B:201:0x0497, B:202:0x04a4, B:205:0x0600, B:207:0x0608, B:209:0x0610, B:212:0x0615, B:213:0x0621, B:215:0x0627, B:217:0x062f, B:222:0x063f, B:224:0x0645, B:226:0x0665, B:228:0x066b, B:221:0x0670, B:235:0x0675, B:237:0x0679, B:283:0x0733, B:284:0x0739, B:288:0x0744, B:290:0x074c, B:291:0x0751, B:293:0x075d, B:294:0x0777, B:296:0x077d, B:298:0x0785, B:300:0x078e, B:303:0x0797, B:307:0x07a6, B:312:0x07b3, B:314:0x07b9, B:322:0x07cc, B:324:0x07cf, B:333:0x07d9, B:335:0x07df, B:339:0x07ec, B:341:0x07f4, B:343:0x07f8, B:344:0x0803, B:346:0x0809, B:347:0x0917, B:350:0x091f, B:352:0x0924, B:354:0x092c, B:356:0x093a, B:358:0x0941, B:362:0x0945, B:364:0x094b, B:366:0x0954, B:368:0x095a, B:370:0x0965, B:371:0x0989, B:373:0x098f, B:376:0x0998, B:379:0x09b2, B:384:0x09ab, B:386:0x09af, B:388:0x096c, B:391:0x097a, B:392:0x0981, B:393:0x0982, B:394:0x0811, B:396:0x0818, B:398:0x081c, B:401:0x08b7, B:403:0x08c3, B:406:0x0828, B:408:0x082c, B:410:0x0840, B:411:0x084e, B:413:0x085a, B:416:0x0863, B:418:0x086d, B:423:0x0878, B:428:0x08d0, B:430:0x08d6, B:432:0x08da, B:435:0x08e3, B:437:0x08f3, B:439:0x08fb, B:441:0x0905, B:443:0x090a, B:445:0x090f, B:446:0x0914, B:448:0x07d2, B:239:0x0683, B:241:0x0687, B:243:0x068f, B:245:0x0695, B:247:0x069f, B:250:0x06a5, B:251:0x06a8, B:253:0x06b0, B:255:0x06c2, B:257:0x06cb, B:259:0x06d3, B:262:0x06dd, B:264:0x0705, B:265:0x0708, B:266:0x0713, B:268:0x0719, B:270:0x071f, B:272:0x0726, B:280:0x0732, B:454:0x04b3, B:456:0x04b9, B:459:0x04bf, B:462:0x04ca, B:464:0x04cf, B:467:0x04dd, B:470:0x04e3, B:472:0x04eb, B:476:0x04ee, B:478:0x04f6, B:480:0x0504, B:482:0x0540, B:484:0x054a, B:487:0x0555, B:489:0x055d, B:491:0x0560, B:494:0x0563, B:496:0x0569, B:498:0x0578, B:500:0x057e, B:502:0x058a, B:504:0x0594, B:506:0x05a5, B:510:0x05ab, B:509:0x05b6, B:515:0x05bb, B:517:0x05c6, B:520:0x05cb, B:522:0x05d1, B:524:0x05d9, B:526:0x05df, B:528:0x05e5, B:532:0x05f3, B:533:0x05fa, B:535:0x05fd, B:541:0x04a1, B:543:0x09b7, B:546:0x09be, B:548:0x09c6, B:551:0x09e6, B:575:0x02ac, B:577:0x02b1, B:578:0x02b4, B:582:0x02bb, B:587:0x02bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0705 A[Catch: RuntimeException -> 0x09f8, IOException -> 0x0a23, zzti -> 0x0a2b, zzft -> 0x0a33, zzbo -> 0x0a3b, zzrb -> 0x0a52, zzhw -> 0x0a5c, TryCatch #10 {zzbo -> 0x0a3b, zzft -> 0x0a33, zzhw -> 0x0a5c, zzrb -> 0x0a52, zzti -> 0x0a2b, IOException -> 0x0a23, RuntimeException -> 0x09f8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x0027, B:12:0x003f, B:13:0x0044, B:14:0x0049, B:17:0x0050, B:19:0x0059, B:21:0x0067, B:23:0x006f, B:24:0x007a, B:25:0x008e, B:26:0x00a6, B:27:0x00c2, B:29:0x00d1, B:30:0x00d5, B:31:0x00e6, B:33:0x00f5, B:34:0x0111, B:35:0x0124, B:36:0x012d, B:38:0x013f, B:39:0x014b, B:40:0x015b, B:42:0x0167, B:45:0x0172, B:46:0x0179, B:47:0x0186, B:50:0x018d, B:52:0x0195, B:54:0x0199, B:56:0x019f, B:58:0x01a7, B:60:0x01af, B:62:0x01b2, B:67:0x01b7, B:76:0x01c4, B:78:0x01c5, B:81:0x01cc, B:83:0x01da, B:84:0x01dd, B:86:0x01e2, B:88:0x01f2, B:89:0x01f5, B:90:0x01fa, B:91:0x01ff, B:93:0x020b, B:94:0x0217, B:96:0x0223, B:98:0x024f, B:99:0x026f, B:560:0x0298, B:562:0x029c, B:563:0x029f, B:572:0x02aa, B:100:0x02c0, B:101:0x02c5, B:102:0x02cd, B:103:0x02df, B:105:0x0306, B:113:0x041d, B:114:0x03ea, B:140:0x03e6, B:155:0x042e, B:156:0x043b, B:170:0x0328, B:173:0x033b, B:175:0x034b, B:177:0x0362, B:179:0x036c, B:186:0x043c, B:188:0x0450, B:191:0x045a, B:193:0x0469, B:195:0x0475, B:197:0x048a, B:198:0x048f, B:199:0x0493, B:201:0x0497, B:202:0x04a4, B:205:0x0600, B:207:0x0608, B:209:0x0610, B:212:0x0615, B:213:0x0621, B:215:0x0627, B:217:0x062f, B:222:0x063f, B:224:0x0645, B:226:0x0665, B:228:0x066b, B:221:0x0670, B:235:0x0675, B:237:0x0679, B:283:0x0733, B:284:0x0739, B:288:0x0744, B:290:0x074c, B:291:0x0751, B:293:0x075d, B:294:0x0777, B:296:0x077d, B:298:0x0785, B:300:0x078e, B:303:0x0797, B:307:0x07a6, B:312:0x07b3, B:314:0x07b9, B:322:0x07cc, B:324:0x07cf, B:333:0x07d9, B:335:0x07df, B:339:0x07ec, B:341:0x07f4, B:343:0x07f8, B:344:0x0803, B:346:0x0809, B:347:0x0917, B:350:0x091f, B:352:0x0924, B:354:0x092c, B:356:0x093a, B:358:0x0941, B:362:0x0945, B:364:0x094b, B:366:0x0954, B:368:0x095a, B:370:0x0965, B:371:0x0989, B:373:0x098f, B:376:0x0998, B:379:0x09b2, B:384:0x09ab, B:386:0x09af, B:388:0x096c, B:391:0x097a, B:392:0x0981, B:393:0x0982, B:394:0x0811, B:396:0x0818, B:398:0x081c, B:401:0x08b7, B:403:0x08c3, B:406:0x0828, B:408:0x082c, B:410:0x0840, B:411:0x084e, B:413:0x085a, B:416:0x0863, B:418:0x086d, B:423:0x0878, B:428:0x08d0, B:430:0x08d6, B:432:0x08da, B:435:0x08e3, B:437:0x08f3, B:439:0x08fb, B:441:0x0905, B:443:0x090a, B:445:0x090f, B:446:0x0914, B:448:0x07d2, B:239:0x0683, B:241:0x0687, B:243:0x068f, B:245:0x0695, B:247:0x069f, B:250:0x06a5, B:251:0x06a8, B:253:0x06b0, B:255:0x06c2, B:257:0x06cb, B:259:0x06d3, B:262:0x06dd, B:264:0x0705, B:265:0x0708, B:266:0x0713, B:268:0x0719, B:270:0x071f, B:272:0x0726, B:280:0x0732, B:454:0x04b3, B:456:0x04b9, B:459:0x04bf, B:462:0x04ca, B:464:0x04cf, B:467:0x04dd, B:470:0x04e3, B:472:0x04eb, B:476:0x04ee, B:478:0x04f6, B:480:0x0504, B:482:0x0540, B:484:0x054a, B:487:0x0555, B:489:0x055d, B:491:0x0560, B:494:0x0563, B:496:0x0569, B:498:0x0578, B:500:0x057e, B:502:0x058a, B:504:0x0594, B:506:0x05a5, B:510:0x05ab, B:509:0x05b6, B:515:0x05bb, B:517:0x05c6, B:520:0x05cb, B:522:0x05d1, B:524:0x05d9, B:526:0x05df, B:528:0x05e5, B:532:0x05f3, B:533:0x05fa, B:535:0x05fd, B:541:0x04a1, B:543:0x09b7, B:546:0x09be, B:548:0x09c6, B:551:0x09e6, B:575:0x02ac, B:577:0x02b1, B:578:0x02b4, B:582:0x02bb, B:587:0x02bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0719 A[Catch: RuntimeException -> 0x09f8, IOException -> 0x0a23, zzti -> 0x0a2b, zzft -> 0x0a33, zzbo -> 0x0a3b, zzrb -> 0x0a52, zzhw -> 0x0a5c, TryCatch #10 {zzbo -> 0x0a3b, zzft -> 0x0a33, zzhw -> 0x0a5c, zzrb -> 0x0a52, zzti -> 0x0a2b, IOException -> 0x0a23, RuntimeException -> 0x09f8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x0027, B:12:0x003f, B:13:0x0044, B:14:0x0049, B:17:0x0050, B:19:0x0059, B:21:0x0067, B:23:0x006f, B:24:0x007a, B:25:0x008e, B:26:0x00a6, B:27:0x00c2, B:29:0x00d1, B:30:0x00d5, B:31:0x00e6, B:33:0x00f5, B:34:0x0111, B:35:0x0124, B:36:0x012d, B:38:0x013f, B:39:0x014b, B:40:0x015b, B:42:0x0167, B:45:0x0172, B:46:0x0179, B:47:0x0186, B:50:0x018d, B:52:0x0195, B:54:0x0199, B:56:0x019f, B:58:0x01a7, B:60:0x01af, B:62:0x01b2, B:67:0x01b7, B:76:0x01c4, B:78:0x01c5, B:81:0x01cc, B:83:0x01da, B:84:0x01dd, B:86:0x01e2, B:88:0x01f2, B:89:0x01f5, B:90:0x01fa, B:91:0x01ff, B:93:0x020b, B:94:0x0217, B:96:0x0223, B:98:0x024f, B:99:0x026f, B:560:0x0298, B:562:0x029c, B:563:0x029f, B:572:0x02aa, B:100:0x02c0, B:101:0x02c5, B:102:0x02cd, B:103:0x02df, B:105:0x0306, B:113:0x041d, B:114:0x03ea, B:140:0x03e6, B:155:0x042e, B:156:0x043b, B:170:0x0328, B:173:0x033b, B:175:0x034b, B:177:0x0362, B:179:0x036c, B:186:0x043c, B:188:0x0450, B:191:0x045a, B:193:0x0469, B:195:0x0475, B:197:0x048a, B:198:0x048f, B:199:0x0493, B:201:0x0497, B:202:0x04a4, B:205:0x0600, B:207:0x0608, B:209:0x0610, B:212:0x0615, B:213:0x0621, B:215:0x0627, B:217:0x062f, B:222:0x063f, B:224:0x0645, B:226:0x0665, B:228:0x066b, B:221:0x0670, B:235:0x0675, B:237:0x0679, B:283:0x0733, B:284:0x0739, B:288:0x0744, B:290:0x074c, B:291:0x0751, B:293:0x075d, B:294:0x0777, B:296:0x077d, B:298:0x0785, B:300:0x078e, B:303:0x0797, B:307:0x07a6, B:312:0x07b3, B:314:0x07b9, B:322:0x07cc, B:324:0x07cf, B:333:0x07d9, B:335:0x07df, B:339:0x07ec, B:341:0x07f4, B:343:0x07f8, B:344:0x0803, B:346:0x0809, B:347:0x0917, B:350:0x091f, B:352:0x0924, B:354:0x092c, B:356:0x093a, B:358:0x0941, B:362:0x0945, B:364:0x094b, B:366:0x0954, B:368:0x095a, B:370:0x0965, B:371:0x0989, B:373:0x098f, B:376:0x0998, B:379:0x09b2, B:384:0x09ab, B:386:0x09af, B:388:0x096c, B:391:0x097a, B:392:0x0981, B:393:0x0982, B:394:0x0811, B:396:0x0818, B:398:0x081c, B:401:0x08b7, B:403:0x08c3, B:406:0x0828, B:408:0x082c, B:410:0x0840, B:411:0x084e, B:413:0x085a, B:416:0x0863, B:418:0x086d, B:423:0x0878, B:428:0x08d0, B:430:0x08d6, B:432:0x08da, B:435:0x08e3, B:437:0x08f3, B:439:0x08fb, B:441:0x0905, B:443:0x090a, B:445:0x090f, B:446:0x0914, B:448:0x07d2, B:239:0x0683, B:241:0x0687, B:243:0x068f, B:245:0x0695, B:247:0x069f, B:250:0x06a5, B:251:0x06a8, B:253:0x06b0, B:255:0x06c2, B:257:0x06cb, B:259:0x06d3, B:262:0x06dd, B:264:0x0705, B:265:0x0708, B:266:0x0713, B:268:0x0719, B:270:0x071f, B:272:0x0726, B:280:0x0732, B:454:0x04b3, B:456:0x04b9, B:459:0x04bf, B:462:0x04ca, B:464:0x04cf, B:467:0x04dd, B:470:0x04e3, B:472:0x04eb, B:476:0x04ee, B:478:0x04f6, B:480:0x0504, B:482:0x0540, B:484:0x054a, B:487:0x0555, B:489:0x055d, B:491:0x0560, B:494:0x0563, B:496:0x0569, B:498:0x0578, B:500:0x057e, B:502:0x058a, B:504:0x0594, B:506:0x05a5, B:510:0x05ab, B:509:0x05b6, B:515:0x05bb, B:517:0x05c6, B:520:0x05cb, B:522:0x05d1, B:524:0x05d9, B:526:0x05df, B:528:0x05e5, B:532:0x05f3, B:533:0x05fa, B:535:0x05fd, B:541:0x04a1, B:543:0x09b7, B:546:0x09be, B:548:0x09c6, B:551:0x09e6, B:575:0x02ac, B:577:0x02b1, B:578:0x02b4, B:582:0x02bb, B:587:0x02bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0731 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0740 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x074c A[Catch: RuntimeException -> 0x09f8, IOException -> 0x0a23, zzti -> 0x0a2b, zzft -> 0x0a33, zzbo -> 0x0a3b, zzrb -> 0x0a52, zzhw -> 0x0a5c, TryCatch #10 {zzbo -> 0x0a3b, zzft -> 0x0a33, zzhw -> 0x0a5c, zzrb -> 0x0a52, zzti -> 0x0a2b, IOException -> 0x0a23, RuntimeException -> 0x09f8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x0027, B:12:0x003f, B:13:0x0044, B:14:0x0049, B:17:0x0050, B:19:0x0059, B:21:0x0067, B:23:0x006f, B:24:0x007a, B:25:0x008e, B:26:0x00a6, B:27:0x00c2, B:29:0x00d1, B:30:0x00d5, B:31:0x00e6, B:33:0x00f5, B:34:0x0111, B:35:0x0124, B:36:0x012d, B:38:0x013f, B:39:0x014b, B:40:0x015b, B:42:0x0167, B:45:0x0172, B:46:0x0179, B:47:0x0186, B:50:0x018d, B:52:0x0195, B:54:0x0199, B:56:0x019f, B:58:0x01a7, B:60:0x01af, B:62:0x01b2, B:67:0x01b7, B:76:0x01c4, B:78:0x01c5, B:81:0x01cc, B:83:0x01da, B:84:0x01dd, B:86:0x01e2, B:88:0x01f2, B:89:0x01f5, B:90:0x01fa, B:91:0x01ff, B:93:0x020b, B:94:0x0217, B:96:0x0223, B:98:0x024f, B:99:0x026f, B:560:0x0298, B:562:0x029c, B:563:0x029f, B:572:0x02aa, B:100:0x02c0, B:101:0x02c5, B:102:0x02cd, B:103:0x02df, B:105:0x0306, B:113:0x041d, B:114:0x03ea, B:140:0x03e6, B:155:0x042e, B:156:0x043b, B:170:0x0328, B:173:0x033b, B:175:0x034b, B:177:0x0362, B:179:0x036c, B:186:0x043c, B:188:0x0450, B:191:0x045a, B:193:0x0469, B:195:0x0475, B:197:0x048a, B:198:0x048f, B:199:0x0493, B:201:0x0497, B:202:0x04a4, B:205:0x0600, B:207:0x0608, B:209:0x0610, B:212:0x0615, B:213:0x0621, B:215:0x0627, B:217:0x062f, B:222:0x063f, B:224:0x0645, B:226:0x0665, B:228:0x066b, B:221:0x0670, B:235:0x0675, B:237:0x0679, B:283:0x0733, B:284:0x0739, B:288:0x0744, B:290:0x074c, B:291:0x0751, B:293:0x075d, B:294:0x0777, B:296:0x077d, B:298:0x0785, B:300:0x078e, B:303:0x0797, B:307:0x07a6, B:312:0x07b3, B:314:0x07b9, B:322:0x07cc, B:324:0x07cf, B:333:0x07d9, B:335:0x07df, B:339:0x07ec, B:341:0x07f4, B:343:0x07f8, B:344:0x0803, B:346:0x0809, B:347:0x0917, B:350:0x091f, B:352:0x0924, B:354:0x092c, B:356:0x093a, B:358:0x0941, B:362:0x0945, B:364:0x094b, B:366:0x0954, B:368:0x095a, B:370:0x0965, B:371:0x0989, B:373:0x098f, B:376:0x0998, B:379:0x09b2, B:384:0x09ab, B:386:0x09af, B:388:0x096c, B:391:0x097a, B:392:0x0981, B:393:0x0982, B:394:0x0811, B:396:0x0818, B:398:0x081c, B:401:0x08b7, B:403:0x08c3, B:406:0x0828, B:408:0x082c, B:410:0x0840, B:411:0x084e, B:413:0x085a, B:416:0x0863, B:418:0x086d, B:423:0x0878, B:428:0x08d0, B:430:0x08d6, B:432:0x08da, B:435:0x08e3, B:437:0x08f3, B:439:0x08fb, B:441:0x0905, B:443:0x090a, B:445:0x090f, B:446:0x0914, B:448:0x07d2, B:239:0x0683, B:241:0x0687, B:243:0x068f, B:245:0x0695, B:247:0x069f, B:250:0x06a5, B:251:0x06a8, B:253:0x06b0, B:255:0x06c2, B:257:0x06cb, B:259:0x06d3, B:262:0x06dd, B:264:0x0705, B:265:0x0708, B:266:0x0713, B:268:0x0719, B:270:0x071f, B:272:0x0726, B:280:0x0732, B:454:0x04b3, B:456:0x04b9, B:459:0x04bf, B:462:0x04ca, B:464:0x04cf, B:467:0x04dd, B:470:0x04e3, B:472:0x04eb, B:476:0x04ee, B:478:0x04f6, B:480:0x0504, B:482:0x0540, B:484:0x054a, B:487:0x0555, B:489:0x055d, B:491:0x0560, B:494:0x0563, B:496:0x0569, B:498:0x0578, B:500:0x057e, B:502:0x058a, B:504:0x0594, B:506:0x05a5, B:510:0x05ab, B:509:0x05b6, B:515:0x05bb, B:517:0x05c6, B:520:0x05cb, B:522:0x05d1, B:524:0x05d9, B:526:0x05df, B:528:0x05e5, B:532:0x05f3, B:533:0x05fa, B:535:0x05fd, B:541:0x04a1, B:543:0x09b7, B:546:0x09be, B:548:0x09c6, B:551:0x09e6, B:575:0x02ac, B:577:0x02b1, B:578:0x02b4, B:582:0x02bb, B:587:0x02bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0751 A[Catch: RuntimeException -> 0x09f8, IOException -> 0x0a23, zzti -> 0x0a2b, zzft -> 0x0a33, zzbo -> 0x0a3b, zzrb -> 0x0a52, zzhw -> 0x0a5c, TryCatch #10 {zzbo -> 0x0a3b, zzft -> 0x0a33, zzhw -> 0x0a5c, zzrb -> 0x0a52, zzti -> 0x0a2b, IOException -> 0x0a23, RuntimeException -> 0x09f8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x0027, B:12:0x003f, B:13:0x0044, B:14:0x0049, B:17:0x0050, B:19:0x0059, B:21:0x0067, B:23:0x006f, B:24:0x007a, B:25:0x008e, B:26:0x00a6, B:27:0x00c2, B:29:0x00d1, B:30:0x00d5, B:31:0x00e6, B:33:0x00f5, B:34:0x0111, B:35:0x0124, B:36:0x012d, B:38:0x013f, B:39:0x014b, B:40:0x015b, B:42:0x0167, B:45:0x0172, B:46:0x0179, B:47:0x0186, B:50:0x018d, B:52:0x0195, B:54:0x0199, B:56:0x019f, B:58:0x01a7, B:60:0x01af, B:62:0x01b2, B:67:0x01b7, B:76:0x01c4, B:78:0x01c5, B:81:0x01cc, B:83:0x01da, B:84:0x01dd, B:86:0x01e2, B:88:0x01f2, B:89:0x01f5, B:90:0x01fa, B:91:0x01ff, B:93:0x020b, B:94:0x0217, B:96:0x0223, B:98:0x024f, B:99:0x026f, B:560:0x0298, B:562:0x029c, B:563:0x029f, B:572:0x02aa, B:100:0x02c0, B:101:0x02c5, B:102:0x02cd, B:103:0x02df, B:105:0x0306, B:113:0x041d, B:114:0x03ea, B:140:0x03e6, B:155:0x042e, B:156:0x043b, B:170:0x0328, B:173:0x033b, B:175:0x034b, B:177:0x0362, B:179:0x036c, B:186:0x043c, B:188:0x0450, B:191:0x045a, B:193:0x0469, B:195:0x0475, B:197:0x048a, B:198:0x048f, B:199:0x0493, B:201:0x0497, B:202:0x04a4, B:205:0x0600, B:207:0x0608, B:209:0x0610, B:212:0x0615, B:213:0x0621, B:215:0x0627, B:217:0x062f, B:222:0x063f, B:224:0x0645, B:226:0x0665, B:228:0x066b, B:221:0x0670, B:235:0x0675, B:237:0x0679, B:283:0x0733, B:284:0x0739, B:288:0x0744, B:290:0x074c, B:291:0x0751, B:293:0x075d, B:294:0x0777, B:296:0x077d, B:298:0x0785, B:300:0x078e, B:303:0x0797, B:307:0x07a6, B:312:0x07b3, B:314:0x07b9, B:322:0x07cc, B:324:0x07cf, B:333:0x07d9, B:335:0x07df, B:339:0x07ec, B:341:0x07f4, B:343:0x07f8, B:344:0x0803, B:346:0x0809, B:347:0x0917, B:350:0x091f, B:352:0x0924, B:354:0x092c, B:356:0x093a, B:358:0x0941, B:362:0x0945, B:364:0x094b, B:366:0x0954, B:368:0x095a, B:370:0x0965, B:371:0x0989, B:373:0x098f, B:376:0x0998, B:379:0x09b2, B:384:0x09ab, B:386:0x09af, B:388:0x096c, B:391:0x097a, B:392:0x0981, B:393:0x0982, B:394:0x0811, B:396:0x0818, B:398:0x081c, B:401:0x08b7, B:403:0x08c3, B:406:0x0828, B:408:0x082c, B:410:0x0840, B:411:0x084e, B:413:0x085a, B:416:0x0863, B:418:0x086d, B:423:0x0878, B:428:0x08d0, B:430:0x08d6, B:432:0x08da, B:435:0x08e3, B:437:0x08f3, B:439:0x08fb, B:441:0x0905, B:443:0x090a, B:445:0x090f, B:446:0x0914, B:448:0x07d2, B:239:0x0683, B:241:0x0687, B:243:0x068f, B:245:0x0695, B:247:0x069f, B:250:0x06a5, B:251:0x06a8, B:253:0x06b0, B:255:0x06c2, B:257:0x06cb, B:259:0x06d3, B:262:0x06dd, B:264:0x0705, B:265:0x0708, B:266:0x0713, B:268:0x0719, B:270:0x071f, B:272:0x0726, B:280:0x0732, B:454:0x04b3, B:456:0x04b9, B:459:0x04bf, B:462:0x04ca, B:464:0x04cf, B:467:0x04dd, B:470:0x04e3, B:472:0x04eb, B:476:0x04ee, B:478:0x04f6, B:480:0x0504, B:482:0x0540, B:484:0x054a, B:487:0x0555, B:489:0x055d, B:491:0x0560, B:494:0x0563, B:496:0x0569, B:498:0x0578, B:500:0x057e, B:502:0x058a, B:504:0x0594, B:506:0x05a5, B:510:0x05ab, B:509:0x05b6, B:515:0x05bb, B:517:0x05c6, B:520:0x05cb, B:522:0x05d1, B:524:0x05d9, B:526:0x05df, B:528:0x05e5, B:532:0x05f3, B:533:0x05fa, B:535:0x05fd, B:541:0x04a1, B:543:0x09b7, B:546:0x09be, B:548:0x09c6, B:551:0x09e6, B:575:0x02ac, B:577:0x02b1, B:578:0x02b4, B:582:0x02bb, B:587:0x02bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x07cc A[Catch: RuntimeException -> 0x09f8, IOException -> 0x0a23, zzti -> 0x0a2b, zzft -> 0x0a33, zzbo -> 0x0a3b, zzrb -> 0x0a52, zzhw -> 0x0a5c, TryCatch #10 {zzbo -> 0x0a3b, zzft -> 0x0a33, zzhw -> 0x0a5c, zzrb -> 0x0a52, zzti -> 0x0a2b, IOException -> 0x0a23, RuntimeException -> 0x09f8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x0027, B:12:0x003f, B:13:0x0044, B:14:0x0049, B:17:0x0050, B:19:0x0059, B:21:0x0067, B:23:0x006f, B:24:0x007a, B:25:0x008e, B:26:0x00a6, B:27:0x00c2, B:29:0x00d1, B:30:0x00d5, B:31:0x00e6, B:33:0x00f5, B:34:0x0111, B:35:0x0124, B:36:0x012d, B:38:0x013f, B:39:0x014b, B:40:0x015b, B:42:0x0167, B:45:0x0172, B:46:0x0179, B:47:0x0186, B:50:0x018d, B:52:0x0195, B:54:0x0199, B:56:0x019f, B:58:0x01a7, B:60:0x01af, B:62:0x01b2, B:67:0x01b7, B:76:0x01c4, B:78:0x01c5, B:81:0x01cc, B:83:0x01da, B:84:0x01dd, B:86:0x01e2, B:88:0x01f2, B:89:0x01f5, B:90:0x01fa, B:91:0x01ff, B:93:0x020b, B:94:0x0217, B:96:0x0223, B:98:0x024f, B:99:0x026f, B:560:0x0298, B:562:0x029c, B:563:0x029f, B:572:0x02aa, B:100:0x02c0, B:101:0x02c5, B:102:0x02cd, B:103:0x02df, B:105:0x0306, B:113:0x041d, B:114:0x03ea, B:140:0x03e6, B:155:0x042e, B:156:0x043b, B:170:0x0328, B:173:0x033b, B:175:0x034b, B:177:0x0362, B:179:0x036c, B:186:0x043c, B:188:0x0450, B:191:0x045a, B:193:0x0469, B:195:0x0475, B:197:0x048a, B:198:0x048f, B:199:0x0493, B:201:0x0497, B:202:0x04a4, B:205:0x0600, B:207:0x0608, B:209:0x0610, B:212:0x0615, B:213:0x0621, B:215:0x0627, B:217:0x062f, B:222:0x063f, B:224:0x0645, B:226:0x0665, B:228:0x066b, B:221:0x0670, B:235:0x0675, B:237:0x0679, B:283:0x0733, B:284:0x0739, B:288:0x0744, B:290:0x074c, B:291:0x0751, B:293:0x075d, B:294:0x0777, B:296:0x077d, B:298:0x0785, B:300:0x078e, B:303:0x0797, B:307:0x07a6, B:312:0x07b3, B:314:0x07b9, B:322:0x07cc, B:324:0x07cf, B:333:0x07d9, B:335:0x07df, B:339:0x07ec, B:341:0x07f4, B:343:0x07f8, B:344:0x0803, B:346:0x0809, B:347:0x0917, B:350:0x091f, B:352:0x0924, B:354:0x092c, B:356:0x093a, B:358:0x0941, B:362:0x0945, B:364:0x094b, B:366:0x0954, B:368:0x095a, B:370:0x0965, B:371:0x0989, B:373:0x098f, B:376:0x0998, B:379:0x09b2, B:384:0x09ab, B:386:0x09af, B:388:0x096c, B:391:0x097a, B:392:0x0981, B:393:0x0982, B:394:0x0811, B:396:0x0818, B:398:0x081c, B:401:0x08b7, B:403:0x08c3, B:406:0x0828, B:408:0x082c, B:410:0x0840, B:411:0x084e, B:413:0x085a, B:416:0x0863, B:418:0x086d, B:423:0x0878, B:428:0x08d0, B:430:0x08d6, B:432:0x08da, B:435:0x08e3, B:437:0x08f3, B:439:0x08fb, B:441:0x0905, B:443:0x090a, B:445:0x090f, B:446:0x0914, B:448:0x07d2, B:239:0x0683, B:241:0x0687, B:243:0x068f, B:245:0x0695, B:247:0x069f, B:250:0x06a5, B:251:0x06a8, B:253:0x06b0, B:255:0x06c2, B:257:0x06cb, B:259:0x06d3, B:262:0x06dd, B:264:0x0705, B:265:0x0708, B:266:0x0713, B:268:0x0719, B:270:0x071f, B:272:0x0726, B:280:0x0732, B:454:0x04b3, B:456:0x04b9, B:459:0x04bf, B:462:0x04ca, B:464:0x04cf, B:467:0x04dd, B:470:0x04e3, B:472:0x04eb, B:476:0x04ee, B:478:0x04f6, B:480:0x0504, B:482:0x0540, B:484:0x054a, B:487:0x0555, B:489:0x055d, B:491:0x0560, B:494:0x0563, B:496:0x0569, B:498:0x0578, B:500:0x057e, B:502:0x058a, B:504:0x0594, B:506:0x05a5, B:510:0x05ab, B:509:0x05b6, B:515:0x05bb, B:517:0x05c6, B:520:0x05cb, B:522:0x05d1, B:524:0x05d9, B:526:0x05df, B:528:0x05e5, B:532:0x05f3, B:533:0x05fa, B:535:0x05fd, B:541:0x04a1, B:543:0x09b7, B:546:0x09be, B:548:0x09c6, B:551:0x09e6, B:575:0x02ac, B:577:0x02b1, B:578:0x02b4, B:582:0x02bb, B:587:0x02bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x07cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x098f A[Catch: RuntimeException -> 0x09f8, IOException -> 0x0a23, zzti -> 0x0a2b, zzft -> 0x0a33, zzbo -> 0x0a3b, zzrb -> 0x0a52, zzhw -> 0x0a5c, TryCatch #10 {zzbo -> 0x0a3b, zzft -> 0x0a33, zzhw -> 0x0a5c, zzrb -> 0x0a52, zzti -> 0x0a2b, IOException -> 0x0a23, RuntimeException -> 0x09f8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x0027, B:12:0x003f, B:13:0x0044, B:14:0x0049, B:17:0x0050, B:19:0x0059, B:21:0x0067, B:23:0x006f, B:24:0x007a, B:25:0x008e, B:26:0x00a6, B:27:0x00c2, B:29:0x00d1, B:30:0x00d5, B:31:0x00e6, B:33:0x00f5, B:34:0x0111, B:35:0x0124, B:36:0x012d, B:38:0x013f, B:39:0x014b, B:40:0x015b, B:42:0x0167, B:45:0x0172, B:46:0x0179, B:47:0x0186, B:50:0x018d, B:52:0x0195, B:54:0x0199, B:56:0x019f, B:58:0x01a7, B:60:0x01af, B:62:0x01b2, B:67:0x01b7, B:76:0x01c4, B:78:0x01c5, B:81:0x01cc, B:83:0x01da, B:84:0x01dd, B:86:0x01e2, B:88:0x01f2, B:89:0x01f5, B:90:0x01fa, B:91:0x01ff, B:93:0x020b, B:94:0x0217, B:96:0x0223, B:98:0x024f, B:99:0x026f, B:560:0x0298, B:562:0x029c, B:563:0x029f, B:572:0x02aa, B:100:0x02c0, B:101:0x02c5, B:102:0x02cd, B:103:0x02df, B:105:0x0306, B:113:0x041d, B:114:0x03ea, B:140:0x03e6, B:155:0x042e, B:156:0x043b, B:170:0x0328, B:173:0x033b, B:175:0x034b, B:177:0x0362, B:179:0x036c, B:186:0x043c, B:188:0x0450, B:191:0x045a, B:193:0x0469, B:195:0x0475, B:197:0x048a, B:198:0x048f, B:199:0x0493, B:201:0x0497, B:202:0x04a4, B:205:0x0600, B:207:0x0608, B:209:0x0610, B:212:0x0615, B:213:0x0621, B:215:0x0627, B:217:0x062f, B:222:0x063f, B:224:0x0645, B:226:0x0665, B:228:0x066b, B:221:0x0670, B:235:0x0675, B:237:0x0679, B:283:0x0733, B:284:0x0739, B:288:0x0744, B:290:0x074c, B:291:0x0751, B:293:0x075d, B:294:0x0777, B:296:0x077d, B:298:0x0785, B:300:0x078e, B:303:0x0797, B:307:0x07a6, B:312:0x07b3, B:314:0x07b9, B:322:0x07cc, B:324:0x07cf, B:333:0x07d9, B:335:0x07df, B:339:0x07ec, B:341:0x07f4, B:343:0x07f8, B:344:0x0803, B:346:0x0809, B:347:0x0917, B:350:0x091f, B:352:0x0924, B:354:0x092c, B:356:0x093a, B:358:0x0941, B:362:0x0945, B:364:0x094b, B:366:0x0954, B:368:0x095a, B:370:0x0965, B:371:0x0989, B:373:0x098f, B:376:0x0998, B:379:0x09b2, B:384:0x09ab, B:386:0x09af, B:388:0x096c, B:391:0x097a, B:392:0x0981, B:393:0x0982, B:394:0x0811, B:396:0x0818, B:398:0x081c, B:401:0x08b7, B:403:0x08c3, B:406:0x0828, B:408:0x082c, B:410:0x0840, B:411:0x084e, B:413:0x085a, B:416:0x0863, B:418:0x086d, B:423:0x0878, B:428:0x08d0, B:430:0x08d6, B:432:0x08da, B:435:0x08e3, B:437:0x08f3, B:439:0x08fb, B:441:0x0905, B:443:0x090a, B:445:0x090f, B:446:0x0914, B:448:0x07d2, B:239:0x0683, B:241:0x0687, B:243:0x068f, B:245:0x0695, B:247:0x069f, B:250:0x06a5, B:251:0x06a8, B:253:0x06b0, B:255:0x06c2, B:257:0x06cb, B:259:0x06d3, B:262:0x06dd, B:264:0x0705, B:265:0x0708, B:266:0x0713, B:268:0x0719, B:270:0x071f, B:272:0x0726, B:280:0x0732, B:454:0x04b3, B:456:0x04b9, B:459:0x04bf, B:462:0x04ca, B:464:0x04cf, B:467:0x04dd, B:470:0x04e3, B:472:0x04eb, B:476:0x04ee, B:478:0x04f6, B:480:0x0504, B:482:0x0540, B:484:0x054a, B:487:0x0555, B:489:0x055d, B:491:0x0560, B:494:0x0563, B:496:0x0569, B:498:0x0578, B:500:0x057e, B:502:0x058a, B:504:0x0594, B:506:0x05a5, B:510:0x05ab, B:509:0x05b6, B:515:0x05bb, B:517:0x05c6, B:520:0x05cb, B:522:0x05d1, B:524:0x05d9, B:526:0x05df, B:528:0x05e5, B:532:0x05f3, B:533:0x05fa, B:535:0x05fd, B:541:0x04a1, B:543:0x09b7, B:546:0x09be, B:548:0x09c6, B:551:0x09e6, B:575:0x02ac, B:577:0x02b1, B:578:0x02b4, B:582:0x02bb, B:587:0x02bf), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x09a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x09a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x08c3 A[Catch: RuntimeException -> 0x09f8, IOException -> 0x0a23, zzti -> 0x0a2b, zzft -> 0x0a33, zzbo -> 0x0a3b, zzrb -> 0x0a52, zzhw -> 0x0a5c, TryCatch #10 {zzbo -> 0x0a3b, zzft -> 0x0a33, zzhw -> 0x0a5c, zzrb -> 0x0a52, zzti -> 0x0a2b, IOException -> 0x0a23, RuntimeException -> 0x09f8, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:11:0x0027, B:12:0x003f, B:13:0x0044, B:14:0x0049, B:17:0x0050, B:19:0x0059, B:21:0x0067, B:23:0x006f, B:24:0x007a, B:25:0x008e, B:26:0x00a6, B:27:0x00c2, B:29:0x00d1, B:30:0x00d5, B:31:0x00e6, B:33:0x00f5, B:34:0x0111, B:35:0x0124, B:36:0x012d, B:38:0x013f, B:39:0x014b, B:40:0x015b, B:42:0x0167, B:45:0x0172, B:46:0x0179, B:47:0x0186, B:50:0x018d, B:52:0x0195, B:54:0x0199, B:56:0x019f, B:58:0x01a7, B:60:0x01af, B:62:0x01b2, B:67:0x01b7, B:76:0x01c4, B:78:0x01c5, B:81:0x01cc, B:83:0x01da, B:84:0x01dd, B:86:0x01e2, B:88:0x01f2, B:89:0x01f5, B:90:0x01fa, B:91:0x01ff, B:93:0x020b, B:94:0x0217, B:96:0x0223, B:98:0x024f, B:99:0x026f, B:560:0x0298, B:562:0x029c, B:563:0x029f, B:572:0x02aa, B:100:0x02c0, B:101:0x02c5, B:102:0x02cd, B:103:0x02df, B:105:0x0306, B:113:0x041d, B:114:0x03ea, B:140:0x03e6, B:155:0x042e, B:156:0x043b, B:170:0x0328, B:173:0x033b, B:175:0x034b, B:177:0x0362, B:179:0x036c, B:186:0x043c, B:188:0x0450, B:191:0x045a, B:193:0x0469, B:195:0x0475, B:197:0x048a, B:198:0x048f, B:199:0x0493, B:201:0x0497, B:202:0x04a4, B:205:0x0600, B:207:0x0608, B:209:0x0610, B:212:0x0615, B:213:0x0621, B:215:0x0627, B:217:0x062f, B:222:0x063f, B:224:0x0645, B:226:0x0665, B:228:0x066b, B:221:0x0670, B:235:0x0675, B:237:0x0679, B:283:0x0733, B:284:0x0739, B:288:0x0744, B:290:0x074c, B:291:0x0751, B:293:0x075d, B:294:0x0777, B:296:0x077d, B:298:0x0785, B:300:0x078e, B:303:0x0797, B:307:0x07a6, B:312:0x07b3, B:314:0x07b9, B:322:0x07cc, B:324:0x07cf, B:333:0x07d9, B:335:0x07df, B:339:0x07ec, B:341:0x07f4, B:343:0x07f8, B:344:0x0803, B:346:0x0809, B:347:0x0917, B:350:0x091f, B:352:0x0924, B:354:0x092c, B:356:0x093a, B:358:0x0941, B:362:0x0945, B:364:0x094b, B:366:0x0954, B:368:0x095a, B:370:0x0965, B:371:0x0989, B:373:0x098f, B:376:0x0998, B:379:0x09b2, B:384:0x09ab, B:386:0x09af, B:388:0x096c, B:391:0x097a, B:392:0x0981, B:393:0x0982, B:394:0x0811, B:396:0x0818, B:398:0x081c, B:401:0x08b7, B:403:0x08c3, B:406:0x0828, B:408:0x082c, B:410:0x0840, B:411:0x084e, B:413:0x085a, B:416:0x0863, B:418:0x086d, B:423:0x0878, B:428:0x08d0, B:430:0x08d6, B:432:0x08da, B:435:0x08e3, B:437:0x08f3, B:439:0x08fb, B:441:0x0905, B:443:0x090a, B:445:0x090f, B:446:0x0914, B:448:0x07d2, B:239:0x0683, B:241:0x0687, B:243:0x068f, B:245:0x0695, B:247:0x069f, B:250:0x06a5, B:251:0x06a8, B:253:0x06b0, B:255:0x06c2, B:257:0x06cb, B:259:0x06d3, B:262:0x06dd, B:264:0x0705, B:265:0x0708, B:266:0x0713, B:268:0x0719, B:270:0x071f, B:272:0x0726, B:280:0x0732, B:454:0x04b3, B:456:0x04b9, B:459:0x04bf, B:462:0x04ca, B:464:0x04cf, B:467:0x04dd, B:470:0x04e3, B:472:0x04eb, B:476:0x04ee, B:478:0x04f6, B:480:0x0504, B:482:0x0540, B:484:0x054a, B:487:0x0555, B:489:0x055d, B:491:0x0560, B:494:0x0563, B:496:0x0569, B:498:0x0578, B:500:0x057e, B:502:0x058a, B:504:0x0594, B:506:0x05a5, B:510:0x05ab, B:509:0x05b6, B:515:0x05bb, B:517:0x05c6, B:520:0x05cb, B:522:0x05d1, B:524:0x05d9, B:526:0x05df, B:528:0x05e5, B:532:0x05f3, B:533:0x05fa, B:535:0x05fd, B:541:0x04a1, B:543:0x09b7, B:546:0x09be, B:548:0x09c6, B:551:0x09e6, B:575:0x02ac, B:577:0x02b1, B:578:0x02b4, B:582:0x02bb, B:587:0x02bf), top: B:2:0x0006 }] */
    /* JADX WARN: Type inference failed for: r2v44, types: [com.google.android.gms.internal.ads.zzgu, com.google.android.gms.internal.ads.zzyj] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        boolean z;
        boolean z2;
        int i;
        zzkh zzf;
        int i2;
        int i3;
        zzkh zze;
        boolean z3;
        boolean z4;
        int i4;
        boolean z5;
        zzkh zzf2;
        boolean z6;
        zzkh zze2;
        zzkh zzg;
        zzkh zza2;
        boolean z7;
        int i5;
        int i6;
        zzki zzg2;
        long longValue;
        long j;
        boolean z8;
        zzui zzuiVar;
        zzui zzuiVar2;
        Throwable th;
        Throwable th2;
        long j2;
        long j3;
        long zzu;
        long j4;
        zzkx zzkxVar;
        int i7;
        zzkx zzy;
        int i8;
        List list;
        zzwa zzwaVar;
        List list2;
        zzwa zzwaVar2;
        int i9;
        long j5;
        List list3;
        zzwa zzwaVar3;
        try {
            switch (message.what) {
                case 0:
                    this.zzx.zza(1);
                    zzL(false, false, false, true);
                    this.zzg.zzc(this.zzu);
                    zzT(true != this.zzw.zza.zzo() ? 2 : 4);
                    this.zzs.zzg(this.zzh);
                    this.zzi.zzi(2);
                    break;
                case 1:
                    zzS(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    int i10 = 4;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.zzi.zzf(2);
                    if (!this.zzw.zza.zzo() && this.zzs.zzj()) {
                        this.zzr.zzl(this.zzJ);
                        if (this.zzr.zzr() && (zzg2 = this.zzr.zzg(this.zzJ, this.zzw)) != null) {
                            zzkh zzc = this.zzr.zzc(zzg2);
                            zzc.zza.zzl(this, zzg2.zzb);
                            if (this.zzr.zze() == zzc) {
                                zzN(zzg2.zzb);
                            }
                            zzD(false);
                        }
                        if (this.zzD) {
                            this.zzD = zzad();
                            zzX();
                        } else {
                            zzH();
                        }
                        zzkh zzf3 = this.zzr.zzf();
                        if (zzf3 != null) {
                            if (zzf3.zzg() != null && !this.zzA) {
                                zzkh zzf4 = this.zzr.zzf();
                                if (zzf4.zzd) {
                                    int i11 = 0;
                                    while (true) {
                                        zzle[] zzleVarArr = this.zzb;
                                        int length = zzleVarArr.length;
                                        if (i11 < 2) {
                                            zzle zzleVar = zzleVarArr[i11];
                                            zzvx zzvxVar = zzf4.zzc[i11];
                                            if (zzleVar.zzo() == zzvxVar) {
                                                if (zzvxVar == null || zzleVar.zzQ()) {
                                                    i11++;
                                                } else {
                                                    zzf4.zzg();
                                                    boolean z9 = zzf4.zzf.zzf;
                                                }
                                            }
                                        } else if (zzf3.zzg().zzd || this.zzJ >= zzf3.zzg().zzf()) {
                                            zzyc zzi = zzf3.zzi();
                                            zzkh zzb = this.zzr.zzb();
                                            zzyc zzi2 = zzb.zzi();
                                            zzcc zzccVar = this.zzw.zza;
                                            zzyc zzycVar = zzi2;
                                            zzaa(zzccVar, zzb.zzf.zza, zzccVar, zzf3.zzf.zza, -9223372036854775807L, false);
                                            if (!zzb.zzd || zzb.zza.zzd() == -9223372036854775807L) {
                                                int i12 = 0;
                                                while (true) {
                                                    int length2 = this.zzb.length;
                                                    if (i12 < 2) {
                                                        boolean zzb2 = zzi.zzb(i12);
                                                        zzyc zzycVar2 = zzycVar;
                                                        boolean zzb3 = zzycVar2.zzb(i12);
                                                        if (zzb2 && !this.zzb[i12].zzR()) {
                                                            this.zzd[i12].zzb();
                                                            zzli zzliVar = zzi.zzb[i12];
                                                            zzli zzliVar2 = zzycVar2.zzb[i12];
                                                            if (!zzb3 || !zzliVar2.equals(zzliVar)) {
                                                                zzam(this.zzb[i12], zzb.zzf());
                                                            }
                                                        }
                                                        i12++;
                                                        zzycVar = zzycVar2;
                                                    }
                                                }
                                            } else {
                                                long zzf5 = zzb.zzf();
                                                zzle[] zzleVarArr2 = this.zzb;
                                                int length3 = zzleVarArr2.length;
                                                for (int i13 = 0; i13 < 2; i13++) {
                                                    zzle zzleVar2 = zzleVarArr2[i13];
                                                    if (zzleVar2.zzo() != null) {
                                                        zzam(zzleVar2, zzf5);
                                                    }
                                                }
                                                if (!zzb.zzr()) {
                                                    this.zzr.zzq(zzb);
                                                    zzD(false);
                                                    zzH();
                                                }
                                            }
                                        }
                                    }
                                    zzf2 = this.zzr.zzf();
                                    if (zzf2 != null && this.zzr.zze() != zzf2 && !zzf2.zzg) {
                                        zzkh zzf6 = this.zzr.zzf();
                                        zzyc zzi3 = zzf6.zzi();
                                        i6 = 0;
                                        boolean z10 = false;
                                        while (true) {
                                            zzle[] zzleVarArr3 = this.zzb;
                                            int length4 = zzleVarArr3.length;
                                            if (i6 >= 2) {
                                                zzle zzleVar3 = zzleVarArr3[i6];
                                                if (zzae(zzleVar3)) {
                                                    zzvx zzo = zzleVar3.zzo();
                                                    zzvx zzvxVar2 = zzf6.zzc[i6];
                                                    if (!zzi3.zzb(i6) || zzo != zzvxVar2) {
                                                        if (!zzleVar3.zzR()) {
                                                            zzleVar3.zzH(zzaj(zzi3.zzc[i6]), zzf6.zzc[i6], zzf6.zzf(), zzf6.zze(), zzf6.zzf.zza);
                                                        } else if (zzleVar3.zzW()) {
                                                            zzz(zzleVar3);
                                                        } else {
                                                            z10 = true;
                                                        }
                                                    }
                                                }
                                                i6++;
                                            } else if (!z10) {
                                                zzA();
                                            }
                                        }
                                    }
                                    z6 = false;
                                    while (zzah() && !this.zzA && (zze2 = this.zzr.zze()) != null && (zzg = zze2.zzg()) != null && this.zzJ >= zzg.zzf() && zzg.zzg) {
                                        if (z6) {
                                            zzI();
                                        }
                                        zza2 = this.zzr.zza();
                                        if (zza2 != null) {
                                            throw null;
                                        }
                                        if (this.zzw.zzb.zza.equals(zza2.zzf.zza.zza)) {
                                            zzui zzuiVar3 = this.zzw.zzb;
                                            if (zzuiVar3.zzb == -1) {
                                                zzui zzuiVar4 = zza2.zzf.zza;
                                                if (zzuiVar4.zzb == -1 && zzuiVar3.zze != zzuiVar4.zze) {
                                                    z7 = true;
                                                    zzki zzkiVar = zza2.zzf;
                                                    zzui zzuiVar5 = zzkiVar.zza;
                                                    long j6 = zzkiVar.zzb;
                                                    this.zzw = zzy(zzuiVar5, j6, zzkiVar.zzc, j6, !z7, 0);
                                                    zzM();
                                                    zzZ();
                                                    if (this.zzw.zze == 3) {
                                                        zzU();
                                                    }
                                                    zzyc zzi4 = this.zzr.zze().zzi();
                                                    i5 = 0;
                                                    while (true) {
                                                        int length5 = this.zzb.length;
                                                        if (i5 >= 2) {
                                                            if (zzi4.zzb(i5)) {
                                                                this.zzb[i5].zzs();
                                                            }
                                                            i5++;
                                                        }
                                                    }
                                                    z6 = true;
                                                }
                                            }
                                        }
                                        z7 = false;
                                        zzki zzkiVar2 = zza2.zzf;
                                        zzui zzuiVar52 = zzkiVar2.zza;
                                        long j62 = zzkiVar2.zzb;
                                        this.zzw = zzy(zzuiVar52, j62, zzkiVar2.zzc, j62, !z7, 0);
                                        zzM();
                                        zzZ();
                                        if (this.zzw.zze == 3) {
                                        }
                                        zzyc zzi42 = this.zzr.zze().zzi();
                                        i5 = 0;
                                        while (true) {
                                            int length52 = this.zzb.length;
                                            if (i5 >= 2) {
                                                break;
                                            }
                                            i5++;
                                        }
                                        z6 = true;
                                    }
                                    i2 = 3;
                                    i10 = 4;
                                    long j7 = this.zzP.zzb;
                                    i3 = this.zzw.zze;
                                    if (i3 != 1 && i3 != i10) {
                                        zze = this.zzr.zze();
                                        if (zze != null) {
                                            zzP(uptimeMillis);
                                            break;
                                        } else {
                                            Trace.beginSection("doSomeWork");
                                            zzZ();
                                            if (zze.zzd) {
                                                this.zzK = zzet.zzr(SystemClock.elapsedRealtime());
                                                zze.zza.zzj(this.zzw.zzr - this.zzn, false);
                                                z3 = true;
                                                z4 = true;
                                                int i14 = 0;
                                                while (true) {
                                                    zzle[] zzleVarArr4 = this.zzb;
                                                    int length6 = zzleVarArr4.length;
                                                    if (i14 < 2) {
                                                        zzle zzleVar4 = zzleVarArr4[i14];
                                                        if (zzae(zzleVar4)) {
                                                            zzleVar4.zzV(this.zzJ, this.zzK);
                                                            z3 = z3 && zzleVar4.zzW();
                                                            boolean z11 = zze.zzc[i14] != zzleVar4.zzo();
                                                            boolean z12 = !z11 && zzleVar4.zzQ();
                                                            if (!z11 && !z12 && !zzleVar4.zzX() && !zzleVar4.zzW()) {
                                                                z5 = false;
                                                                z4 = !z4 && z5;
                                                                if (z5) {
                                                                    zzleVar4.zzv();
                                                                }
                                                            }
                                                            z5 = true;
                                                            if (z4) {
                                                            }
                                                            if (z5) {
                                                            }
                                                        }
                                                        i14++;
                                                    }
                                                }
                                            } else {
                                                zze.zza.zzk();
                                                z3 = true;
                                                z4 = true;
                                            }
                                            long j8 = zze.zzf.zze;
                                            if (z3 && zze.zzd && (j8 == -9223372036854775807L || j8 <= this.zzw.zzr)) {
                                                if (this.zzA) {
                                                    this.zzA = false;
                                                    zzS(false, this.zzw.zzm, false, 5);
                                                }
                                                if (zze.zzf.zzi) {
                                                    zzT(i10);
                                                    zzW();
                                                    int i15 = 2;
                                                    if (this.zzw.zze == 2) {
                                                        int i16 = 0;
                                                        while (true) {
                                                            zzle[] zzleVarArr5 = this.zzb;
                                                            int length7 = zzleVarArr5.length;
                                                            if (i16 < i15) {
                                                                if (zzae(zzleVarArr5[i16]) && this.zzb[i16].zzo() == zze.zzc[i16]) {
                                                                    this.zzb[i16].zzv();
                                                                }
                                                                i16++;
                                                                i15 = 2;
                                                            } else {
                                                                zzkx zzkxVar2 = this.zzw;
                                                                if (!zzkxVar2.zzg && zzkxVar2.zzq < 500000 && zzad()) {
                                                                    if (this.zzO == -9223372036854775807L) {
                                                                        this.zzO = SystemClock.elapsedRealtime();
                                                                    } else if (SystemClock.elapsedRealtime() - this.zzO >= 4000) {
                                                                        throw new IllegalStateException("Playback stuck buffering and not loading");
                                                                    }
                                                                    boolean z13 = !zzah() && this.zzw.zze == i2;
                                                                    boolean z14 = this.zzw.zzo;
                                                                    i4 = this.zzw.zze;
                                                                    if (i4 != 4 && (z13 || i4 == 2 || (i4 == i2 && this.zzH != 0))) {
                                                                        zzP(uptimeMillis);
                                                                    }
                                                                    Trace.endSection();
                                                                }
                                                            }
                                                        }
                                                    }
                                                    this.zzO = -9223372036854775807L;
                                                    if (zzah()) {
                                                    }
                                                    boolean z142 = this.zzw.zzo;
                                                    i4 = this.zzw.zze;
                                                    if (i4 != 4) {
                                                        zzP(uptimeMillis);
                                                    }
                                                    Trace.endSection();
                                                }
                                            }
                                            zzkx zzkxVar3 = this.zzw;
                                            if (zzkxVar3.zze == 2) {
                                                if (this.zzH == 0) {
                                                    if (zzaf()) {
                                                        zzT(i2);
                                                        this.zzN = null;
                                                        if (zzah()) {
                                                            zzab(false, false);
                                                            this.zzo.zzh();
                                                            zzU();
                                                        }
                                                    }
                                                } else if (z4) {
                                                    if (zzkxVar3.zzg) {
                                                        zzkh zze3 = this.zzr.zze();
                                                        long zzb4 = zzai(this.zzw.zza, zze3.zzf.zza) ? this.zzR.zzb() : -9223372036854775807L;
                                                        zzkh zzd = this.zzr.zzd();
                                                        boolean z15 = zzd.zzr() && zzd.zzf.zzi;
                                                        boolean z16 = zzd.zzf.zza.zzb() && !zzd.zzd;
                                                        if (!z15) {
                                                            if (!z16) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    zzT(i2);
                                                    this.zzN = null;
                                                    if (zzah()) {
                                                    }
                                                }
                                                int i152 = 2;
                                                if (this.zzw.zze == 2) {
                                                }
                                                this.zzO = -9223372036854775807L;
                                                if (zzah()) {
                                                }
                                                boolean z1422 = this.zzw.zzo;
                                                i4 = this.zzw.zze;
                                                if (i4 != 4) {
                                                }
                                                Trace.endSection();
                                            }
                                            if (this.zzw.zze == i2) {
                                                if (this.zzH == 0) {
                                                    if (!zzaf()) {
                                                        zzab(zzah(), false);
                                                        zzT(2);
                                                        if (this.zzB) {
                                                            for (zzkh zze4 = this.zzr.zze(); zze4 != null; zze4 = zze4.zzg()) {
                                                                for (zzxv zzxvVar : zze4.zzi().zzc) {
                                                                }
                                                            }
                                                            this.zzR.zzc();
                                                        }
                                                        zzW();
                                                    }
                                                }
                                            }
                                            int i1522 = 2;
                                            if (this.zzw.zze == 2) {
                                            }
                                            this.zzO = -9223372036854775807L;
                                            if (zzah()) {
                                            }
                                            boolean z14222 = this.zzw.zzo;
                                            i4 = this.zzw.zze;
                                            if (i4 != 4) {
                                            }
                                            Trace.endSection();
                                        }
                                    }
                                }
                            }
                            if (zzf3.zzf.zzi || this.zzA) {
                                int i17 = 0;
                                while (true) {
                                    zzle[] zzleVarArr6 = this.zzb;
                                    int length8 = zzleVarArr6.length;
                                    if (i17 < 2) {
                                        zzle zzleVar5 = zzleVarArr6[i17];
                                        zzvx zzvxVar3 = zzf3.zzc[i17];
                                        if (zzvxVar3 != null && zzleVar5.zzo() == zzvxVar3 && zzleVar5.zzQ()) {
                                            long j9 = zzf3.zzf.zze;
                                            zzam(zzleVar5, (j9 == -9223372036854775807L || j9 == Long.MIN_VALUE) ? -9223372036854775807L : zzf3.zze() + j9);
                                        }
                                        i17++;
                                    }
                                }
                            }
                            zzf2 = this.zzr.zzf();
                            if (zzf2 != null) {
                                zzkh zzf62 = this.zzr.zzf();
                                zzyc zzi32 = zzf62.zzi();
                                i6 = 0;
                                boolean z102 = false;
                                while (true) {
                                    zzle[] zzleVarArr32 = this.zzb;
                                    int length42 = zzleVarArr32.length;
                                    if (i6 >= 2) {
                                    }
                                    i6++;
                                }
                            }
                            z6 = false;
                            while (zzah()) {
                                if (z6) {
                                }
                                zza2 = this.zzr.zza();
                                if (zza2 != null) {
                                }
                            }
                            i2 = 3;
                            i10 = 4;
                            long j72 = this.zzP.zzb;
                            i3 = this.zzw.zze;
                            if (i3 != 1) {
                                zze = this.zzr.zze();
                                if (zze != null) {
                                }
                            }
                        }
                        zzf2 = this.zzr.zzf();
                        if (zzf2 != null) {
                        }
                        z6 = false;
                        while (zzah()) {
                        }
                        i2 = 3;
                        i10 = 4;
                        long j722 = this.zzP.zzb;
                        i3 = this.zzw.zze;
                        if (i3 != 1) {
                        }
                    }
                    i2 = 3;
                    i3 = this.zzw.zze;
                    if (i3 != 1) {
                    }
                    break;
                case 3:
                    zzjw zzjwVar = (zzjw) message.obj;
                    this.zzx.zza(1);
                    Pair zzx = zzx(this.zzw.zza, zzjwVar, true, this.zzE, this.zzF, this.zzl, this.zzm);
                    if (zzx == null) {
                        Pair zzw = zzw(this.zzw.zza);
                        zzuiVar = (zzui) zzw.first;
                        long longValue2 = ((Long) zzw.second).longValue();
                        j = -9223372036854775807L;
                        z8 = !this.zzw.zza.zzo();
                        longValue = longValue2;
                    } else {
                        Object obj = zzx.first;
                        longValue = ((Long) zzx.second).longValue();
                        j = zzjwVar.zzc == -9223372036854775807L ? -9223372036854775807L : longValue;
                        zzui zzi5 = this.zzr.zzi(this.zzw.zza, obj, longValue);
                        if (zzi5.zzb()) {
                            this.zzw.zza.zzn(zzi5.zza, this.zzm);
                            if (this.zzm.zze(zzi5.zzb) == zzi5.zzc) {
                                this.zzm.zzj();
                            }
                            zzuiVar = zzi5;
                            longValue = 0;
                            z8 = true;
                        } else {
                            z8 = zzjwVar.zzc == -9223372036854775807L;
                            zzuiVar = zzi5;
                        }
                    }
                    try {
                        try {
                            if (this.zzw.zza.zzo()) {
                                this.zzI = zzjwVar;
                            } else if (zzx == null) {
                                if (this.zzw.zze != 1) {
                                    zzT(4);
                                }
                                zzL(false, true, false, true);
                            } else {
                                try {
                                    if (zzuiVar.equals(this.zzw.zzb)) {
                                        zzkh zze5 = this.zzr.zze();
                                        j3 = (zze5 == null || !zze5.zzd || longValue == 0) ? longValue : zze5.zza.zza(longValue, this.zzv);
                                        zzuiVar2 = zzuiVar;
                                        try {
                                            if (zzet.zzu(j3) == zzet.zzu(this.zzw.zzr) && ((i7 = (zzkxVar = this.zzw).zze) == 2 || i7 == 3)) {
                                                long j10 = zzkxVar.zzr;
                                                zzy = zzy(zzuiVar2, j10, j, j10, z8, 2);
                                                this.zzw = zzy;
                                                break;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            th = th;
                                            th2 = th;
                                            j2 = longValue;
                                            this.zzw = zzy(zzuiVar2, j2, j, j2, z8, 2);
                                            throw th2;
                                        }
                                    } else {
                                        zzuiVar2 = zzuiVar;
                                        j3 = longValue;
                                    }
                                    zzkx zzkxVar4 = this.zzw;
                                    zzcc zzccVar2 = zzkxVar4.zza;
                                    zzaa(zzccVar2, zzuiVar2, zzccVar2, zzkxVar4.zzb, j, true);
                                    j4 = zzu;
                                    zzy = zzy(zzuiVar2, j4, j, j4, z8, 2);
                                    this.zzw = zzy;
                                } catch (Throwable th4) {
                                    j2 = zzu;
                                    th2 = th4;
                                    this.zzw = zzy(zzuiVar2, j2, j, j2, z8, 2);
                                    throw th2;
                                }
                                zzu = zzu(zzuiVar2, j3, this.zzw.zze == 4);
                                z8 |= longValue != zzu;
                            }
                            j4 = longValue;
                            zzuiVar2 = zzuiVar;
                            zzy = zzy(zzuiVar2, j4, j, j4, z8, 2);
                            this.zzw = zzy;
                        } catch (Throwable th5) {
                            th = th5;
                            zzuiVar2 = zzuiVar;
                            th2 = th;
                            j2 = longValue;
                            this.zzw = zzy(zzuiVar2, j2, j, j2, z8, 2);
                            throw th2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        zzuiVar2 = zzuiVar;
                    }
                    break;
                case 4:
                    zzR((zzbq) message.obj);
                    zzF(this.zzo.zzc(), true);
                    break;
                case 5:
                    this.zzv = (zzlj) message.obj;
                    break;
                case 6:
                    zzV(false, true);
                    break;
                case 7:
                    try {
                        zzL(true, false, true, false);
                        int i18 = 0;
                        while (true) {
                            int length9 = this.zzb.length;
                            if (i18 >= 2) {
                                this.zzg.zzd(this.zzu);
                                zzT(1);
                                HandlerThread handlerThread = this.zzj;
                                if (handlerThread != null) {
                                    handlerThread.quit();
                                }
                                synchronized (this) {
                                    this.zzy = true;
                                    notifyAll();
                                }
                                return true;
                            }
                            this.zzd[i18].zzp();
                            this.zzb[i18].zzG();
                            i18++;
                        }
                    } catch (Throwable th7) {
                        HandlerThread handlerThread2 = this.zzj;
                        if (handlerThread2 != null) {
                            handlerThread2.quit();
                        }
                        synchronized (this) {
                            this.zzy = true;
                            notifyAll();
                            throw th7;
                        }
                    }
                case 8:
                    if (this.zzr.zzp((zzug) message.obj)) {
                        zzkh zzd2 = this.zzr.zzd();
                        zzd2.zzl(this.zzo.zzc().zzb, this.zzw.zza);
                        zzY(zzd2.zzf.zza, zzd2.zzh(), zzd2.zzi());
                        if (zzd2 == this.zzr.zze()) {
                            zzN(zzd2.zzf.zzb);
                            zzA();
                            zzkx zzkxVar5 = this.zzw;
                            zzui zzuiVar6 = zzkxVar5.zzb;
                            long j11 = zzd2.zzf.zzb;
                            this.zzw = zzy(zzuiVar6, j11, zzkxVar5.zzc, j11, false, 5);
                        }
                        zzH();
                        break;
                    }
                    break;
                case 9:
                    if (this.zzr.zzp((zzug) message.obj)) {
                        this.zzr.zzl(this.zzJ);
                        zzH();
                        break;
                    }
                    break;
                case 10:
                    zzJ();
                    break;
                case 11:
                    int i19 = message.arg1;
                    this.zzE = i19;
                    if (!this.zzr.zzt(this.zzw.zza, i19)) {
                        zzQ(true);
                    }
                    zzD(false);
                    break;
                case 12:
                    boolean z17 = message.arg1 != 0;
                    this.zzF = z17;
                    if (!this.zzr.zzu(this.zzw.zza, z17)) {
                        zzQ(true);
                    }
                    zzD(false);
                    break;
                case 13:
                    boolean z18 = message.arg1 != 0;
                    AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                    if (this.zzG != z18) {
                        this.zzG = z18;
                        if (!z18) {
                            zzle[] zzleVarArr7 = this.zzb;
                            int length10 = zzleVarArr7.length;
                            for (int i20 = 0; i20 < 2; i20++) {
                                zzle zzleVar6 = zzleVarArr7[i20];
                                if (!zzae(zzleVar6) && this.zzc.remove(zzleVar6)) {
                                    zzleVar6.zzI();
                                }
                            }
                        }
                    }
                    if (atomicBoolean != null) {
                        synchronized (this) {
                            atomicBoolean.set(true);
                            notifyAll();
                        }
                        break;
                    }
                    break;
                case 14:
                    zzla zzlaVar = (zzla) message.obj;
                    if (zzlaVar.zzb() == this.zzk) {
                        zzak(zzlaVar);
                        int i21 = this.zzw.zze;
                        if (i21 == 3 || i21 == 2) {
                            this.zzi.zzi(2);
                            break;
                        }
                    } else {
                        this.zzi.zzc(15, zzlaVar).zza();
                        break;
                    }
                case 15:
                    final zzla zzlaVar2 = (zzla) message.obj;
                    Looper zzb5 = zzlaVar2.zzb();
                    if (zzb5.getThread().isAlive()) {
                        this.zzq.zzb(zzb5, null).zzh(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzjo
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzjx.zzq(zzlaVar2);
                            }
                        });
                        break;
                    } else {
                        zzea.zzf("TAG", "Trying to send message on a dead thread.");
                        zzlaVar2.zzh(false);
                        break;
                    }
                case 16:
                    zzF((zzbq) message.obj, false);
                    break;
                case 17:
                    zzjs zzjsVar = (zzjs) message.obj;
                    this.zzx.zza(1);
                    i8 = zzjsVar.zzb;
                    if (i8 != -1) {
                        list2 = zzjsVar.zza;
                        zzwaVar2 = zzjsVar.zzd;
                        zzlc zzlcVar = new zzlc(list2, zzwaVar2);
                        i9 = zzjsVar.zzb;
                        j5 = zzjsVar.zzc;
                        this.zzI = new zzjw(zzlcVar, i9, j5);
                    }
                    zzkw zzkwVar = this.zzs;
                    list = zzjsVar.zza;
                    zzwaVar = zzjsVar.zzd;
                    zzE(zzkwVar.zzn(list, zzwaVar), false);
                    break;
                case 18:
                    zzjs zzjsVar2 = (zzjs) message.obj;
                    int i22 = message.arg1;
                    this.zzx.zza(1);
                    zzkw zzkwVar2 = this.zzs;
                    if (i22 == -1) {
                        i22 = zzkwVar2.zza();
                    }
                    list3 = zzjsVar2.zza;
                    zzwaVar3 = zzjsVar2.zzd;
                    zzE(zzkwVar2.zzk(i22, list3, zzwaVar3), false);
                    break;
                case 19:
                    zzjt zzjtVar = (zzjt) message.obj;
                    this.zzx.zza(1);
                    zzkw zzkwVar3 = this.zzs;
                    int i23 = zzjtVar.zza;
                    int i24 = zzjtVar.zzb;
                    int i25 = zzjtVar.zzc;
                    zzwa zzwaVar4 = zzjtVar.zzd;
                    zzE(zzkwVar3.zzl(0, 0, 0, null), false);
                    break;
                case 20:
                    int i26 = message.arg1;
                    int i27 = message.arg2;
                    zzwa zzwaVar5 = (zzwa) message.obj;
                    this.zzx.zza(1);
                    zzE(this.zzs.zzm(i26, i27, zzwaVar5), false);
                    break;
                case 21:
                    zzwa zzwaVar6 = (zzwa) message.obj;
                    this.zzx.zza(1);
                    zzE(this.zzs.zzo(zzwaVar6), false);
                    break;
                case 22:
                    zzE(this.zzs.zzb(), true);
                    break;
                case 23:
                    this.zzz = message.arg1 != 0;
                    zzM();
                    if (this.zzA && this.zzr.zzf() != this.zzr.zze()) {
                        zzQ(true);
                        zzD(false);
                        break;
                    }
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    zzK();
                    break;
                case 26:
                    zzK();
                    break;
                case 27:
                    int i28 = message.arg1;
                    int i29 = message.arg2;
                    List list4 = (List) message.obj;
                    this.zzx.zza(1);
                    zzE(this.zzs.zzc(i28, i29, list4), false);
                    break;
                case 28:
                    zzig zzigVar = (zzig) message.obj;
                    this.zzP = zzigVar;
                    this.zzr.zzn(this.zzw.zza, zzigVar);
                    break;
            }
        } catch (zzbo e) {
            zzC(e, e.zzb == 1 ? true != e.zza ? 3003 : 3001 : 1000);
        } catch (zzft e2) {
            zzC(e2, e2.zza);
        } catch (zzhw e3) {
            zzhw zzhwVar = e3;
            if (zzhwVar.zzc == 1 && (zzf = this.zzr.zzf()) != null) {
                zzhwVar = zzhwVar.zza(zzf.zzf.zza);
            }
            if (zzhwVar.zzi && (this.zzN == null || (i = zzhwVar.zza) == 5004 || i == 5003)) {
                zzea.zzg("ExoPlayerImplInternal", "Recoverable renderer error", zzhwVar);
                zzhw zzhwVar2 = this.zzN;
                if (zzhwVar2 != null) {
                    zzhwVar2.addSuppressed(zzhwVar);
                    zzhwVar = this.zzN;
                } else {
                    this.zzN = zzhwVar;
                }
                zzdt zzdtVar = this.zzi;
                zzdtVar.zzk(zzdtVar.zzc(25, zzhwVar));
            } else {
                zzhw zzhwVar3 = this.zzN;
                if (zzhwVar3 != null) {
                    zzhwVar3.addSuppressed(zzhwVar);
                    zzhwVar = this.zzN;
                }
                zzhw zzhwVar4 = zzhwVar;
                zzea.zzd("ExoPlayerImplInternal", "Playback error", zzhwVar4);
                z = true;
                if (zzhwVar4.zzc == 1) {
                    zzkk zzkkVar = this.zzr;
                    if (zzkkVar.zze() != zzkkVar.zzf()) {
                        while (true) {
                            zzkk zzkkVar2 = this.zzr;
                            if (zzkkVar2.zze() == zzkkVar2.zzf()) {
                                break;
                            }
                            this.zzr.zza();
                        }
                        zzkh zze6 = this.zzr.zze();
                        zze6.getClass();
                        zzki zzkiVar3 = zze6.zzf;
                        zzui zzuiVar7 = zzkiVar3.zza;
                        long j12 = zzkiVar3.zzb;
                        this.zzw = zzy(zzuiVar7, j12, zzkiVar3.zzc, j12, true, 0);
                    }
                    z2 = false;
                    z = true;
                } else {
                    z2 = false;
                }
                zzV(z, z2);
                this.zzw = this.zzw.zzd(zzhwVar4);
            }
        } catch (zzrb e4) {
            zzC(e4, e4.zza);
        } catch (zzti e5) {
            zzC(e5, 1002);
        } catch (IOException e6) {
            zzC(e6, GamesStatusCodes.STATUS_REQUEST_UPDATE_PARTIAL_SUCCESS);
        } catch (RuntimeException e7) {
            zzhw zzd3 = zzhw.zzd(e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            zzea.zzd("ExoPlayerImplInternal", "Playback error", zzd3);
            zzV(true, false);
            this.zzw = this.zzw.zzd(zzd3);
        }
        z = true;
        zzI();
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzhu
    public final void zza(zzbq zzbqVar) {
        this.zzi.zzc(16, zzbqVar).zza();
    }

    public final Looper zzc() {
        return this.zzk;
    }

    final /* synthetic */ Boolean zze() {
        return Boolean.valueOf(this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final /* bridge */ /* synthetic */ void zzf(zzvz zzvzVar) {
        this.zzi.zzc(9, (zzug) zzvzVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public final void zzg() {
        this.zzi.zzf(2);
        this.zzi.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zzuf
    public final void zzh(zzug zzugVar) {
        this.zzi.zzc(8, zzugVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zzi() {
        this.zzi.zzi(10);
    }

    public final void zzj() {
        this.zzi.zzb(0).zza();
    }

    public final void zzk(zzcc zzccVar, int i, long j) {
        this.zzi.zzc(3, new zzjw(zzccVar, i, j)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final synchronized void zzl(zzla zzlaVar) {
        if (!this.zzy && this.zzk.getThread().isAlive()) {
            this.zzi.zzc(14, zzlaVar).zza();
            return;
        }
        zzea.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzlaVar.zzh(false);
    }

    public final void zzm(boolean z, int i) {
        this.zzi.zzd(1, z ? 1 : 0, i).zza();
    }

    public final void zzn() {
        this.zzi.zzb(6).zza();
    }

    public final synchronized boolean zzo() {
        if (!this.zzy && this.zzk.getThread().isAlive()) {
            this.zzi.zzi(7);
            zzac(new zzjn(this), this.zzt);
            return this.zzy;
        }
        return true;
    }

    public final void zzp(List list, int i, long j, zzwa zzwaVar) {
        this.zzi.zzc(17, new zzjs(list, zzwaVar, i, j, null)).zza();
    }
}

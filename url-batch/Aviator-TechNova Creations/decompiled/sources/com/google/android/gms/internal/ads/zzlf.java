package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.WorkRequest;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzlf implements Handler.Callback, zzwh, zzaai, zzmb, zzit, zzmf, zzcc, zzacp {
    private static final long zza = zzfj.zzp(WorkRequest.MIN_BACKOFF_MILLIS);
    private zzmt zzA;
    private boolean zzC;
    private boolean zzD;
    private zzle zzE;
    private int zzF;
    private zzmd zzG;
    private zzlc zzH;
    private boolean zzI;
    private boolean zzK;
    private boolean zzL;
    private boolean zzN;
    private boolean zzQ;
    private int zzR;
    private zzle zzS;
    private long zzT;
    private long zzU;
    private int zzV;
    private boolean zzW;
    private zziw zzX;
    private zzjg zzZ;
    private boolean zzab;
    private final zzip zzad;
    private final zzmp[] zzb;
    private final zzmn[] zzc;
    private final boolean[] zzd;
    private final zzaaj zze;
    private final zzaak zzf;
    private final zzlj zzg;
    private final zzaas zzh;
    private final zzdx zzi;
    private final zzme zzj;
    private final Looper zzk;
    private final zzbe zzl;
    private final zzbd zzm;
    private final long zzn;
    private final zziu zzo;
    private final ArrayList zzp;
    private final zzdn zzq;
    private final zzld zzr;
    private final zzlq zzs;
    private final zzmc zzt;
    private final long zzu;
    private final zzpq zzv;
    private final zzmx zzw;
    private final zzdx zzx;
    private final boolean zzy;
    private final zzcd zzz;
    private long zzaa = -9223372036854775807L;
    private int zzO = 0;
    private boolean zzP = false;
    private boolean zzJ = false;
    private float zzac = 1.0f;
    private zzms zzB = zzms.zza;
    private long zzY = -9223372036854775807L;
    private long zzM = -9223372036854775807L;

    public zzlf(Context context, zzml[] zzmlVarArr, zzml[] zzmlVarArr2, zzaaj zzaajVar, zzaak zzaakVar, zzlj zzljVar, zzaas zzaasVar, int i, boolean z, zzmx zzmxVar, zzmt zzmtVar, zzip zzipVar, long j, boolean z2, boolean z3, Looper looper, zzdn zzdnVar, zzld zzldVar, zzpq zzpqVar, zzme zzmeVar, zzjg zzjgVar, final zzacp zzacpVar) {
        this.zzr = zzldVar;
        this.zze = zzaajVar;
        this.zzf = zzaakVar;
        this.zzg = zzljVar;
        this.zzh = zzaasVar;
        int i2 = 0;
        this.zzA = zzmtVar;
        this.zzad = zzipVar;
        this.zzu = j;
        this.zzq = zzdnVar;
        this.zzv = zzpqVar;
        this.zzZ = zzjgVar;
        this.zzw = zzmxVar;
        this.zzn = zzljVar.zzf(zzpqVar);
        zzljVar.zzg(zzpqVar);
        zzbf zzbfVar = zzbf.zza;
        this.zzG = zzmd.zza(zzaakVar);
        this.zzH = new zzlc(this.zzG);
        int length = zzmlVarArr.length;
        this.zzc = new zzmn[2];
        this.zzd = new boolean[2];
        zzmm zzg = zzaajVar.zzg();
        this.zzb = new zzmp[2];
        boolean z4 = false;
        while (true) {
            int length2 = zzmlVarArr.length;
            if (i2 >= 2) {
                this.zzy = z4;
                this.zzo = new zziu(this, zzdnVar);
                this.zzp = new ArrayList();
                this.zzl = new zzbe();
                this.zzm = new zzbd();
                zzaajVar.zzr(this, zzaasVar);
                this.zzW = true;
                zzdx zzd = zzdnVar.zzd(looper, null);
                this.zzx = zzd;
                this.zzs = new zzlq(zzmxVar, zzd, new zzky(this), zzjgVar);
                this.zzt = new zzmc(this, zzmxVar, zzd, zzpqVar);
                zzme zzmeVar2 = new zzme(null);
                this.zzj = zzmeVar2;
                Looper zza2 = zzmeVar2.zza();
                this.zzk = zza2;
                zzdx zzd2 = zzdnVar.zzd(zza2, this);
                this.zzi = zzd2;
                this.zzz = new zzcd(context, zza2, this);
                zzd2.zzd(35, new zzacp() { // from class: com.google.android.gms.internal.ads.zzku
                    @Override // com.google.android.gms.internal.ads.zzacp
                    public final /* synthetic */ void zzcS(long j2, long j3, zzv zzvVar, MediaFormat mediaFormat) {
                        zzlf.this.zzcS(j2, j3, zzvVar, mediaFormat);
                    }
                }).zza();
                return;
            }
            zzmlVarArr[i2].zzc(i2, zzpqVar, zzdnVar);
            this.zzc[i2] = zzmlVarArr[i2].zzb();
            this.zzc[i2].zzv(zzg);
            zzml zzmlVar = zzmlVarArr2[i2];
            if (zzmlVar != null) {
                zzmlVar.zzc(i2, zzpqVar, zzdnVar);
                z4 = true;
            }
            this.zzb[i2] = new zzmp(zzmlVarArr[i2], zzmlVarArr2[i2], i2);
            i2++;
        }
    }

    private final void zzA(IOException iOException, int i) {
        zzlq zzlqVar = this.zzs;
        zziw zza2 = zziw.zza(iOException, i);
        zzln zzm = zzlqVar.zzm();
        if (zzm != null) {
            zza2 = zza2.zzd(zzm.zzg.zza);
        }
        zzee.zzf("ExoPlayerImplInternal", "Playback error", zza2);
        zzW(false, false);
        this.zzG = this.zzG.zzf(zza2);
    }

    private final void zzB(int i) {
        zzmd zzmdVar = this.zzG;
        if (zzmdVar.zze != i) {
            if (i != 2) {
                this.zzY = -9223372036854775807L;
            }
            if (i != 3) {
                boolean z = zzmdVar.zzp;
            }
            this.zzG = this.zzG.zze(i);
        }
    }

    private final void zzC() {
        this.zzH.zzb(this.zzG);
        if (this.zzH.zzd()) {
            this.zzr.zza(this.zzH);
            this.zzH = new zzlc(this.zzG);
        }
    }

    private final void zzD(float f) throws zziw {
        this.zzac = f;
        float zza2 = f * this.zzz.zza();
        int i = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzmpVarArr[i].zzL(zza2);
            i++;
        }
    }

    private final void zzE(boolean z, int i, boolean z2, int i2) throws zziw {
        this.zzH.zza(z2 ? 1 : 0);
        zzG(z, i, i2);
    }

    private final void zzF() throws zziw {
        zzmd zzmdVar = this.zzG;
        zzG(zzmdVar.zzl, zzmdVar.zzn, zzmdVar.zzm);
    }

    private final void zzG(boolean z, int i, int i2) throws zziw {
        zzH(z, this.zzz.zzc(z, this.zzG.zze), i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzH(boolean z, int i, int i2, int i3) throws zziw {
        boolean z2;
        zzmd zzmdVar;
        zzln zzm;
        if (z) {
            if (i != -1) {
                z2 = true;
                if (i != -1) {
                    i3 = 2;
                } else if (i3 == 2) {
                    i3 = 1;
                }
                boolean z3 = this.zzC;
                if (i != 0) {
                    i2 = 1;
                } else if (i2 == 1) {
                    i2 = z3 ? 4 : 0;
                }
                zzmdVar = this.zzG;
                if (zzmdVar.zzl != z2 && zzmdVar.zzn == i2 && zzmdVar.zzm == i3) {
                    return;
                }
                this.zzG = zzmdVar.zzi(z2, i3, i2);
                zzaC(false, false);
                zzlq zzlqVar = this.zzs;
                for (zzm = zzlqVar.zzm(); zzm != null; zzm = zzm.zzp()) {
                    for (zzaac zzaacVar : zzm.zzr().zzc) {
                    }
                }
                if (zzax()) {
                    zzK();
                    zzL();
                    boolean z4 = this.zzG.zzp;
                    zzlqVar.zzf(this.zzT);
                    return;
                }
                int i4 = this.zzG.zze;
                if (i4 == 3) {
                    this.zzo.zza();
                    zzJ();
                    this.zzi.zzh(2);
                    return;
                } else {
                    if (i4 == 2) {
                        this.zzi.zzh(2);
                        return;
                    }
                    return;
                }
            }
            i = -1;
        }
        z2 = false;
        if (i != -1) {
        }
        boolean z32 = this.zzC;
        if (i != 0) {
        }
        zzmdVar = this.zzG;
        if (zzmdVar.zzl != z2) {
        }
        this.zzG = zzmdVar.zzi(z2, i3, i2);
        zzaC(false, false);
        zzlq zzlqVar2 = this.zzs;
        while (zzm != null) {
        }
        if (zzax()) {
        }
    }

    private final void zzI(boolean z) throws zziw {
        zzwk zzwkVar = this.zzs.zzm().zzg.zza;
        long zzT = zzT(zzwkVar, this.zzG.zzs, true, false);
        if (zzT != this.zzG.zzs) {
            zzmd zzmdVar = this.zzG;
            this.zzG = zzao(zzwkVar, zzT, zzmdVar.zzc, zzmdVar.zzd, z, 5);
        }
    }

    private final void zzJ() throws zziw {
        zzln zzm = this.zzs.zzm();
        if (zzm == null) {
            return;
        }
        zzaak zzr = zzm.zzr();
        int i = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            if (zzr.zza(i)) {
                zzmpVarArr[i].zzv();
            }
            i++;
        }
    }

    private final void zzK() throws zziw {
        this.zzo.zzb();
        int i = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzmpVarArr[i].zzw();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a9, code lost:
    
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzL() throws zziw {
        zzlb zzlbVar;
        zzlq zzlqVar = this.zzs;
        zzln zzm = zzlqVar.zzm();
        if (zzm == null) {
            return;
        }
        long zzh = zzm.zze ? zzm.zza.zzh() : -9223372036854775807L;
        if (zzh != -9223372036854775807L) {
            if (!zzm.zzd()) {
                zzlqVar.zzs(zzm);
                zzas(false);
                zzam();
            }
            zzU(zzh, true);
            if (zzh != this.zzG.zzs) {
                zzmd zzmdVar = this.zzG;
                long j = zzh;
                this.zzG = zzao(zzmdVar.zzb, j, zzmdVar.zzc, j, true, 5);
            }
        } else {
            zziu zziuVar = this.zzo;
            long zzf = zziuVar.zzf(zzm != zzlqVar.zzn());
            this.zzT = zzf;
            long zza2 = zzf - zzm.zza();
            long j2 = this.zzG.zzs;
            ArrayList arrayList = this.zzp;
            if (!arrayList.isEmpty() && !this.zzG.zzb.zzb()) {
                if (this.zzW) {
                    j2--;
                    this.zzW = false;
                }
                zzmd zzmdVar2 = this.zzG;
                int zze = zzmdVar2.zza.zze(zzmdVar2.zzb.zza);
                int min = Math.min(this.zzV, arrayList.size());
                if (min > 0) {
                    zzlbVar = (zzlb) arrayList.get(min - 1);
                    while (zzlbVar != null && (zze < 0 || (zze == 0 && j2 < 0))) {
                        int i = min - 1;
                        if (i > 0) {
                            zzlbVar = (zzlb) arrayList.get(min - 2);
                            min = i;
                        } else {
                            min = i;
                        }
                    }
                    if (min < arrayList.size()) {
                    }
                    this.zzV = min;
                }
                zzlbVar = null;
            }
            if (zziuVar.zzh()) {
                boolean z = !this.zzH.zzc;
                zzmd zzmdVar3 = this.zzG;
                this.zzG = zzao(zzmdVar3.zzb, zza2, zzmdVar3.zzc, zza2, z, 6);
            } else {
                zzmd zzmdVar4 = this.zzG;
                zzmdVar4.zzs = zza2;
                zzmdVar4.zzt = SystemClock.elapsedRealtime();
            }
        }
        this.zzG.zzq = zzlqVar.zzk().zzf();
        this.zzG.zzr = zzat();
        zzmd zzmdVar5 = this.zzG;
        if (zzmdVar5.zzl && zzmdVar5.zze == 3 && zzP(zzmdVar5.zza, zzmdVar5.zzb)) {
            zzmd zzmdVar6 = this.zzG;
            if (zzmdVar6.zzo.zzb == 1.0f) {
                float zzd = this.zzad.zzd(zzO(zzmdVar6.zza, zzmdVar6.zzb.zza, zzmdVar6.zzs), this.zzG.zzr);
                zziu zziuVar2 = this.zzo;
                if (zziuVar2.zzj().zzb != zzd) {
                    zzM(new zzav(zzd, this.zzG.zzo.zzc));
                    zzal(this.zzG.zzo, zziuVar2.zzj().zzb, false, false);
                }
            }
        }
    }

    private final void zzM(zzav zzavVar) {
        this.zzi.zzk(16);
        this.zzo.zzi(zzavVar);
    }

    private final void zzN(final int i, final boolean z) {
        boolean[] zArr = this.zzd;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.zzx.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzlf.this.zzu(i, z);
                }
            });
        }
    }

    private final long zzO(zzbf zzbfVar, Object obj, long j) {
        int i = zzbfVar.zzo(obj, this.zzm).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i, zzbeVar, 0L);
        if (zzbeVar.zzf == -9223372036854775807L || !zzbeVar.zzb() || !zzbeVar.zzi) {
            return -9223372036854775807L;
        }
        long j2 = zzbeVar.zzg;
        String str = zzfj.zza;
        return zzfj.zzq((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - zzbeVar.zzf) - j;
    }

    private final boolean zzP(zzbf zzbfVar, zzwk zzwkVar) {
        if (!zzwkVar.zzb() && !zzbfVar.zzg()) {
            int i = zzbfVar.zzo(zzwkVar.zza, this.zzm).zzc;
            zzbe zzbeVar = this.zzl;
            zzbfVar.zzb(i, zzbeVar, 0L);
            if (zzbeVar.zzb() && zzbeVar.zzi && zzbeVar.zzf != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j) {
        if (zzw()) {
            r2 = this.zzG.zze != 3 ? zza : 1000L;
            zzmp[] zzmpVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                r2 = Math.min(r2, zzfj.zzp(zzmpVarArr[i].zzk(this.zzT, this.zzU)));
            }
            if (this.zzG.zzj()) {
                zzlq zzlqVar = this.zzs;
                if ((zzlqVar.zzm() != null ? zzlqVar.zzm().zzp() : null) != null) {
                    if (this.zzT + (zzfj.zzq(r2) * this.zzG.zzo.zzb) >= r0.zzc()) {
                        r2 = Math.min(r2, zza);
                    }
                }
            }
        } else if (this.zzG.zze != 3 || zzax()) {
            r2 = zza;
        }
        this.zzi.zzj(2, j + r2);
    }

    private final void zzR(zzle zzleVar) throws zziw {
        long longValue;
        long j;
        zzwk zzy;
        boolean z;
        boolean z2;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        zzmd zzmdVar;
        int i;
        if (this.zzD) {
            if (this.zzE != null) {
                this.zzF++;
                this.zzH.zza(1);
            }
            this.zzE = zzleVar;
            return;
        }
        this.zzH.zza(1);
        zzbf zzbfVar = this.zzG.zza;
        int i2 = this.zzO;
        boolean z3 = this.zzP;
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair zzaD = zzaD(zzbfVar, zzleVar, true, i2, z3, zzbeVar, zzbdVar);
        long j7 = -9223372036854775807L;
        if (zzaD == null) {
            Pair zzY = zzY(this.zzG.zza);
            zzwk zzwkVar = (zzwk) zzY.first;
            longValue = ((Long) zzY.second).longValue();
            z = !this.zzG.zza.zzg();
            zzy = zzwkVar;
            j = -9223372036854775807L;
        } else {
            Object obj = zzaD.first;
            longValue = ((Long) zzaD.second).longValue();
            long j8 = zzleVar.zzc;
            if (j8 == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                j = -9223372036854775807L;
                j7 = longValue;
            }
            zzy = this.zzs.zzy(this.zzG.zza, obj, longValue);
            if (zzy.zzb()) {
                this.zzG.zza.zzo(zzy.zza, zzbdVar);
                int i3 = zzy.zzb;
                if (zzbdVar.zzd(i3) == zzy.zzc) {
                    zzbdVar.zzj();
                }
                zza zza2 = zzbdVar.zzg.zza(i3);
                long j9 = zza2.zza;
                long j10 = zza2.zzi;
                j7 = Math.max(j7, 0L);
                longValue = 0;
            } else if (j8 != -9223372036854775807L) {
                z = false;
            }
            z = true;
        }
        try {
            if (this.zzG.zza.zzg()) {
                this.zzS = zzleVar;
            } else if (zzaD == null) {
                if (this.zzG.zze != 1) {
                    zzB(4);
                }
                zzX(false, true, false, true);
            } else {
                if (zzy.equals(this.zzG.zzb)) {
                    zzln zzm = this.zzs.zzm();
                    if (zzm == null || !zzm.zze || longValue == 0) {
                        j6 = longValue;
                    } else {
                        zzwi zzwiVar = zzm.zza;
                        long j11 = zzbeVar.zzm;
                        if (this.zzC && j11 != j) {
                            Double d = this.zzB.zzc;
                        }
                        j6 = zzwiVar.zzk(longValue, this.zzA);
                    }
                    long j12 = j6;
                    if (zzfj.zzp(j6) == zzfj.zzp(this.zzG.zzs) && ((i = (zzmdVar = this.zzG).zze) == 2 || i == 3)) {
                        longValue = zzmdVar.zzs;
                    } else {
                        j3 = j12;
                    }
                } else {
                    j3 = longValue;
                }
                if (this.zzC) {
                    zzmp[] zzmpVarArr = this.zzb;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= 2) {
                            break;
                        }
                        zzmp zzmpVar = zzmpVarArr[i4];
                        if (zzmpVar.zzM() && zzmpVar.zze() == 2) {
                            this.zzD = true;
                            break;
                        }
                        i4++;
                    }
                }
                long zzS = zzS(zzy, j3, this.zzG.zze == 4);
                z2 = (longValue != zzS) | z;
                try {
                    zzmd zzmdVar2 = this.zzG;
                    zzwk zzwkVar2 = zzy;
                    try {
                        zzbf zzbfVar2 = zzmdVar2.zza;
                        long j13 = j7;
                        try {
                            zzag(zzbfVar2, zzwkVar2, zzbfVar2, zzmdVar2.zzb, j13, true);
                            zzy = zzwkVar2;
                            j4 = j13;
                            j5 = zzS;
                            this.zzG = zzao(zzy, j5, j4, j5, z2, 2);
                        } catch (Throwable th) {
                            th = th;
                            zzy = zzwkVar2;
                            j7 = j13;
                            j2 = zzS;
                            this.zzG = zzao(zzy, j2, j7, j2, z2, 2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        zzy = zzwkVar2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            z2 = z;
            j4 = j7;
            j5 = longValue;
            this.zzG = zzao(zzy, j5, j4, j5, z2, 2);
        } catch (Throwable th4) {
            th = th4;
            z2 = z;
            j2 = longValue;
        }
    }

    private final long zzS(zzwk zzwkVar, long j, boolean z) throws zziw {
        zzlq zzlqVar = this.zzs;
        return zzT(zzwkVar, j, zzlqVar.zzm() != zzlqVar.zzn(), z);
    }

    private final long zzT(zzwk zzwkVar, long j, boolean z, boolean z2) throws zziw {
        zzK();
        boolean z3 = true;
        zzaC(false, true);
        if (z2 || this.zzG.zze == 3) {
            zzB(2);
        }
        zzlq zzlqVar = this.zzs;
        zzln zzm = zzlqVar.zzm();
        zzln zzlnVar = zzm;
        while (zzlnVar != null && !zzwkVar.equals(zzlnVar.zzg.zza)) {
            zzlnVar = zzlnVar.zzp();
        }
        if (z || zzm != zzlnVar || (zzlnVar != null && zzlnVar.zza() + j < 0)) {
            zzaa();
            if (zzlnVar != null) {
                while (zzlqVar.zzm() != zzlnVar) {
                    zzlqVar.zzr();
                }
                zzlqVar.zzs(zzlnVar);
                zzlnVar.zzb(1000000000000L);
                zzap();
                zzlnVar.zzh = true;
            }
        }
        zzab();
        if (zzlnVar != null) {
            zzlqVar.zzs(zzlnVar);
            if (!zzlnVar.zze) {
                zzlnVar.zzg = zzlnVar.zzg.zza(j);
            } else if (zzlnVar.zzf) {
                if (this.zzC) {
                    boolean z4 = this.zzB.zzi;
                    if (!this.zzG.zza.zzg() && zzlnVar.zzg.zza.equals(this.zzG.zzb)) {
                        zzmp[] zzmpVarArr = this.zzb;
                        boolean z5 = true;
                        for (int i = 0; i < 2; i++) {
                            zzmp zzmpVar = zzmpVarArr[i];
                            if (zzmpVar.zzM()) {
                                z5 &= zzmpVar.zzF(zzlnVar, j);
                            }
                        }
                        if (z5) {
                            zzwi zzwiVar = zzlnVar.zza;
                            long j2 = this.zzG.zzs;
                            zzmt zzmtVar = zzmt.zzb;
                            if (zzwiVar.zzk(j2, zzmtVar) == zzwiVar.zzk(j, zzmtVar)) {
                                z3 = false;
                            }
                        }
                    }
                }
                zzwi zzwiVar2 = zzlnVar.zza;
                j = zzwiVar2.zzj(j);
                zzwiVar2.zzf(j - this.zzn, false);
            }
            zzU(j, z3);
            zzam();
        } else {
            zzlqVar.zzv();
            zzU(j, true);
        }
        zzas(false);
        this.zzi.zzh(2);
        return j;
    }

    private final void zzU(long j, boolean z) throws zziw {
        zzln zzm = this.zzs.zzm();
        long zza2 = j + (zzm == null ? 1000000000000L : zzm.zza());
        this.zzT = zza2;
        this.zzo.zzc(zza2);
        zzmp[] zzmpVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            zzmpVarArr[i].zzE(zzm, this.zzT, z);
        }
        for (zzln zzm2 = r0.zzm(); zzm2 != null; zzm2 = zzm2.zzp()) {
            for (zzaac zzaacVar : zzm2.zzr().zzc) {
            }
        }
    }

    private final void zzV() throws zziw {
        int i = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzmpVarArr[i].zzz(this.zzC ? this.zzB : null);
            i++;
        }
    }

    private final void zzW(boolean z, boolean z2) {
        zzX(z || !this.zzQ, false, true, false);
        this.zzH.zza(z2 ? 1 : 0);
        this.zzg.zzc(this.zzv);
        this.zzz.zzc(this.zzG.zzl, 1);
        zzB(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        if (r2.equals(r34.zzG.zzb) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzX(boolean z, boolean z2, boolean z3, boolean z4) {
        zzwk zzwkVar;
        zzbf zzbfVar;
        this.zzi.zzk(2);
        this.zzD = false;
        boolean z5 = true;
        if (this.zzE != null) {
            this.zzH.zza(1);
            this.zzE = null;
        }
        this.zzX = null;
        zzaC(false, true);
        this.zzo.zzb();
        this.zzT = 1000000000000L;
        try {
            zzaa();
        } catch (zziw | RuntimeException e) {
            zzee.zzf("ExoPlayerImplInternal", "Disable failed.", e);
        }
        if (z) {
            zzmp[] zzmpVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                try {
                    zzmpVarArr[i].zzG();
                } catch (RuntimeException e2) {
                    zzee.zzf("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.zzR = 0;
        zzmd zzmdVar = this.zzG;
        zzwk zzwkVar2 = zzmdVar.zzb;
        long j = zzmdVar.zzs;
        long j2 = (this.zzG.zzb.zzb() || zzaB(this.zzG, this.zzm)) ? this.zzG.zzc : this.zzG.zzs;
        if (z2) {
            this.zzS = null;
            Pair zzY = zzY(this.zzG.zza);
            zzwkVar2 = (zzwk) zzY.first;
            j = ((Long) zzY.second).longValue();
            j2 = -9223372036854775807L;
        }
        z5 = false;
        long j3 = j;
        long j4 = j2;
        zzlq zzlqVar = this.zzs;
        zzlqVar.zzv();
        this.zzN = false;
        zzbf zzbfVar2 = this.zzG.zza;
        if (z3 && (zzbfVar2 instanceof zzmj)) {
            zzbfVar2 = ((zzmj) zzbfVar2).zzx(this.zzt.zzq());
            if (zzwkVar2.zzb != -1) {
                Object obj = zzwkVar2.zza;
                zzbd zzbdVar = this.zzm;
                zzbfVar2.zzo(obj, zzbdVar);
                zzbe zzbeVar = this.zzl;
                zzbfVar2.zzb(zzbdVar.zzc, zzbeVar, 0L);
                if (zzbeVar.zzb()) {
                    zzbfVar = zzbfVar2;
                    zzwkVar = new zzwk(obj, zzwkVar2.zzd);
                    zzmd zzmdVar2 = this.zzG;
                    int i2 = zzmdVar2.zze;
                    zziw zziwVar = z4 ? null : zzmdVar2.zzf;
                    zzyn zzynVar = !z5 ? zzyn.zza : zzmdVar2.zzh;
                    zzaak zzaakVar = !z5 ? this.zzf : this.zzG.zzi;
                    List zzi = !z5 ? zzguf.zzi() : this.zzG.zzj;
                    zzmd zzmdVar3 = this.zzG;
                    this.zzG = new zzmd(zzbfVar, zzwkVar, j4, j3, i2, zziwVar, false, zzynVar, zzaakVar, zzi, zzwkVar, zzmdVar3.zzl, zzmdVar3.zzm, zzmdVar3.zzn, zzmdVar3.zzo, j3, 0L, j3, 0L, false);
                    if (z3) {
                        return;
                    }
                    zzlqVar.zzj();
                    this.zzt.zzg();
                    return;
                }
            }
        }
        zzwkVar = zzwkVar2;
        zzbfVar = zzbfVar2;
        zzmd zzmdVar22 = this.zzG;
        int i22 = zzmdVar22.zze;
        zziw zziwVar2 = z4 ? null : zzmdVar22.zzf;
        zzyn zzynVar2 = !z5 ? zzyn.zza : zzmdVar22.zzh;
        zzaak zzaakVar2 = !z5 ? this.zzf : this.zzG.zzi;
        List zzi2 = !z5 ? zzguf.zzi() : this.zzG.zzj;
        zzmd zzmdVar32 = this.zzG;
        this.zzG = new zzmd(zzbfVar, zzwkVar, j4, j3, i22, zziwVar2, false, zzynVar2, zzaakVar2, zzi2, zzwkVar, zzmdVar32.zzl, zzmdVar32.zzm, zzmdVar32.zzn, zzmdVar32.zzo, j3, 0L, j3, 0L, false);
        if (z3) {
        }
    }

    private final Pair zzY(zzbf zzbfVar) {
        long j = 0;
        if (zzbfVar.zzg()) {
            return Pair.create(zzmd.zzb(), 0L);
        }
        int zzk = zzbfVar.zzk(this.zzP);
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair zzm = zzbfVar.zzm(zzbeVar, zzbdVar, zzk, -9223372036854775807L);
        zzwk zzy = this.zzs.zzy(zzbfVar, zzm.first, 0L);
        long longValue = ((Long) zzm.second).longValue();
        if (zzy.zzb()) {
            zzbfVar.zzo(zzy.zza, zzbdVar);
            if (zzy.zzc == zzbdVar.zzd(zzy.zzb)) {
                zzbdVar.zzj();
            }
        } else {
            j = longValue;
        }
        return Pair.create(zzy, Long.valueOf(j));
    }

    private final void zzZ(zzbf zzbfVar, zzbf zzbfVar2) {
        if (zzbfVar.zzg() && zzbfVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzp;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
            return;
        }
        zzlb zzlbVar = (zzlb) arrayList.get(size);
        Object obj = zzlbVar.zzb;
        zzmh zzmhVar = zzlbVar.zza;
        String str = zzfj.zza;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaA, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzC) {
            return false;
        }
        boolean z = this.zzB.zzg;
        return true;
    }

    private static boolean zzaB(zzmd zzmdVar, zzbd zzbdVar) {
        zzwk zzwkVar = zzmdVar.zzb;
        zzbf zzbfVar = zzmdVar.zza;
        return zzbfVar.zzg() || zzbfVar.zzo(zzwkVar.zza, zzbdVar).zzf;
    }

    private final void zzaC(boolean z, boolean z2) {
        this.zzL = z;
        long j = -9223372036854775807L;
        if (z && !z2) {
            j = SystemClock.elapsedRealtime();
        }
        this.zzM = j;
    }

    private static Pair zzaD(zzbf zzbfVar, zzle zzleVar, boolean z, int i, boolean z2, zzbe zzbeVar, zzbd zzbdVar) {
        Pair zzm;
        zzbf zzbfVar2;
        zzbf zzbfVar3 = zzleVar.zza;
        if (zzbfVar.zzg()) {
            return null;
        }
        if (true == zzbfVar3.zzg()) {
            zzbfVar3 = zzbfVar;
        }
        try {
            zzm = zzbfVar3.zzm(zzbeVar, zzbdVar, zzleVar.zzb, zzleVar.zzc);
            zzbfVar2 = zzbfVar3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (!zzbfVar.equals(zzbfVar2)) {
            if (zzbfVar.zze(zzm.first) == -1) {
                int zzr = zzr(zzbeVar, zzbdVar, i, z2, zzm.first, zzbfVar2, zzbfVar);
                if (zzr != -1) {
                    return zzbfVar.zzm(zzbeVar, zzbdVar, zzr, -9223372036854775807L);
                }
                return null;
            }
            if (zzbfVar2.zzo(zzm.first, zzbdVar).zzf && zzbfVar2.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar2.zze(zzm.first)) {
                return zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(zzm.first, zzbdVar).zzc, zzleVar.zzc);
            }
        }
        return zzm;
    }

    private static final void zzaE(zzmh zzmhVar) throws zziw {
        zzmhVar.zzh();
        try {
            zzmhVar.zza().zzx(zzmhVar.zzc(), zzmhVar.zze());
        } finally {
            zzmhVar.zzi(true);
        }
    }

    private static final boolean zzaF(zzln zzlnVar) {
        if (zzlnVar != null) {
            try {
                if (zzlnVar.zze) {
                    zzyc[] zzycVarArr = zzlnVar.zzc;
                    for (int i = 0; i < 2; i++) {
                        zzyc zzycVar = zzycVarArr[i];
                        if (zzycVar != null) {
                            zzycVar.zzc();
                        }
                    }
                } else {
                    zzlnVar.zza.zzc();
                }
                if (zzlnVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() throws zziw {
        int i = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i >= 2) {
                this.zzaa = -9223372036854775807L;
                return;
            }
            int zzd = zzmpVarArr[i].zzd();
            zzmpVarArr[i].zzA(this.zzo);
            zzN(i, false);
            this.zzR -= zzd;
            i++;
        }
    }

    private final void zzab() {
        if (this.zzy && zzaz()) {
            zzmp[] zzmpVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                zzmp zzmpVar = zzmpVarArr[i];
                int zzd = zzmpVar.zzd();
                zzmpVar.zzC(this.zzo);
                this.zzR -= zzd - zzmpVar.zzd();
            }
            this.zzaa = -9223372036854775807L;
        }
    }

    private final void zzac() throws zziw {
        zzad();
        zzI(true);
    }

    private final void zzad() throws zziw {
        zzlf zzlfVar;
        int i;
        boolean z;
        zziu zziuVar = this.zzo;
        float f = zziuVar.zzj().zzb;
        zzlq zzlqVar = this.zzs;
        zzln zzm = zzlqVar.zzm();
        zzln zzn = zzlqVar.zzn();
        zzaak zzaakVar = null;
        boolean z2 = true;
        while (zzm != null && zzm.zze) {
            zzmd zzmdVar = this.zzG;
            zzaak zzk = zzm.zzk(f, zzmdVar.zza, zzmdVar.zzl);
            zzaak zzaakVar2 = zzm == zzlqVar.zzm() ? zzk : zzaakVar;
            zzaak zzr = zzm.zzr();
            boolean z3 = false;
            if (zzr != null) {
                zzaac[] zzaacVarArr = zzk.zzc;
                if (zzr.zzc.length == zzaacVarArr.length) {
                    for (int i2 = 0; i2 < zzaacVarArr.length; i2++) {
                        if (zzk.zzb(zzr, i2)) {
                        }
                    }
                    if (zzm != zzn) {
                        z3 = true;
                    }
                    z2 &= z3;
                    zzm = zzm.zzp();
                    zzaakVar = zzaakVar2;
                }
            }
            if (z2) {
                zzln zzm2 = zzlqVar.zzm();
                int zzs = zzlqVar.zzs(zzm2) & 1;
                zzmp[] zzmpVarArr = this.zzb;
                boolean[] zArr = new boolean[2];
                zzaakVar2.getClass();
                long zzm3 = zzm2.zzm(zzaakVar2, this.zzG.zzs, 1 == zzs, zArr);
                zzmd zzmdVar2 = this.zzG;
                if (zzmdVar2.zze == 4 || zzm3 == zzmdVar2.zzs) {
                    z = false;
                } else {
                    z = false;
                    z3 = true;
                }
                zzmd zzmdVar3 = this.zzG;
                boolean z4 = z;
                i = 2;
                zzlfVar = this;
                zzlfVar.zzG = zzao(zzmdVar3.zzb, zzm3, zzmdVar3.zzc, zzmdVar3.zzd, z3, 5);
                if (z3) {
                    zzlfVar.zzU(zzm3, true);
                }
                zzlfVar.zzab();
                boolean[] zArr2 = new boolean[2];
                for (int i3 = z4; i3 < 2; i3++) {
                    int zzd = zzmpVarArr[i3].zzd();
                    zArr2[i3] = zzmpVarArr[i3].zzM();
                    zzmpVarArr[i3].zzD(zzm2.zzc[i3], zziuVar, zzlfVar.zzT, zArr[i3]);
                    if (zzd - zzmpVarArr[i3].zzd() > 0) {
                        zzlfVar.zzN(i3, z4);
                    }
                    zzlfVar.zzR -= zzd - zzmpVarArr[i3].zzd();
                }
                zzlfVar.zzaq(zArr2, zzlfVar.zzT);
                zzm2.zzh = true;
            } else {
                zzlfVar = this;
                i = 2;
                zzlqVar.zzs(zzm);
                if (zzm.zze) {
                    long max = Math.max(zzm.zzg.zzb, zzlfVar.zzT - zzm.zza());
                    if (zzlfVar.zzy && zzlfVar.zzaz() && zzlqVar.zzo() == zzm) {
                        zzlfVar.zzab();
                    }
                    zzm.zzl(zzk, max, false);
                }
            }
            zzlfVar.zzas(true);
            if (zzlfVar.zzG.zze != 4) {
                zzlfVar.zzam();
                zzlfVar.zzL();
                zzlfVar.zzi.zzh(i);
                return;
            }
            return;
        }
    }

    private final boolean zzae() {
        zzln zzm = this.zzs.zzm();
        long j = zzm.zzg.zze;
        if (zzm.zze) {
            return j == -9223372036854775807L || this.zzG.zzs < j || !zzax();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x0218, code lost:
    
        if (r9 >= 0) goto L119;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d5 A[Catch: all -> 0x03a1, TRY_ENTER, TryCatch #0 {all -> 0x03a1, blocks: (B:80:0x02d5, B:81:0x02d9, B:83:0x02df, B:19:0x02f3, B:21:0x02fc, B:23:0x0304, B:25:0x030e, B:27:0x0319, B:30:0x031e), top: B:17:0x0291 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d9 A[Catch: all -> 0x03a1, TryCatch #0 {all -> 0x03a1, blocks: (B:80:0x02d5, B:81:0x02d9, B:83:0x02df, B:19:0x02f3, B:21:0x02fc, B:23:0x0304, B:25:0x030e, B:27:0x0319, B:30:0x031e), top: B:17:0x0291 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x041b  */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33, types: [int] */
    /* JADX WARN: Type inference failed for: r6v42 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzaf(zzbf zzbfVar, boolean z) throws zziw {
        long j;
        boolean zzaB;
        zzwk zzwkVar;
        zzbe zzbeVar;
        zzbf zzbfVar2;
        long j2;
        int i;
        long j3;
        Object obj;
        long j4;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        long j5;
        long j6;
        long j7;
        zzwk zzwkVar2;
        long j8;
        boolean z6;
        boolean z7;
        boolean z8;
        int i3;
        Object obj2;
        long longValue;
        int i4;
        boolean z9;
        boolean z10;
        boolean z11;
        int i5;
        boolean z12;
        int i6;
        zzwk zzwkVar3;
        boolean z13;
        long j9;
        int zzw;
        zzmd zzmdVar = this.zzG;
        zzle zzleVar = this.zzS;
        int i7 = this.zzO;
        boolean z14 = this.zzP;
        if (zzbfVar.zzg()) {
            zzbfVar2 = zzbfVar;
            zzwkVar2 = zzmd.zzb();
            z6 = true;
            z8 = false;
            z7 = false;
            j8 = 0;
            j = -9223372036854775807L;
            j6 = 0;
            j5 = -9223372036854775807L;
        } else {
            zzbd zzbdVar = this.zzm;
            zzwk zzwkVar4 = zzmdVar.zzb;
            j = -9223372036854775807L;
            Object obj3 = zzwkVar4.zza;
            zzaB = zzaB(zzmdVar, zzbdVar);
            long j10 = (zzwkVar4.zzb() || zzaB) ? zzmdVar.zzc : zzmdVar.zzs;
            zzbe zzbeVar2 = this.zzl;
            if (zzleVar != null) {
                zzwkVar = zzwkVar4;
                zzbfVar2 = zzbfVar;
                Pair zzaD = zzaD(zzbfVar2, zzleVar, true, i7, z14, zzbeVar2, zzbdVar);
                if (zzaD == null) {
                    i4 = zzbfVar2.zzk(z14);
                    obj2 = obj3;
                    longValue = j10;
                    z11 = true;
                    z10 = false;
                    z9 = false;
                } else {
                    if (zzleVar.zzc == -9223372036854775807L) {
                        i4 = zzbfVar2.zzo(zzaD.first, zzbdVar).zzc;
                        obj2 = obj3;
                        longValue = j10;
                        z9 = false;
                    } else {
                        obj2 = zzaD.first;
                        longValue = ((Long) zzaD.second).longValue();
                        i4 = -1;
                        z9 = true;
                    }
                    z10 = zzmdVar.zze == 4;
                    z11 = false;
                }
                int i8 = i4;
                obj = obj2;
                zzbeVar = zzbeVar2;
                j3 = longValue;
                i = i8;
                boolean z15 = z9;
                z2 = z11;
                z5 = z10;
                z3 = z15;
                j2 = j10;
            } else {
                zzwkVar = zzwkVar4;
                zzbeVar = zzbeVar2;
                zzbfVar2 = zzbfVar;
                zzbf zzbfVar3 = zzmdVar.zza;
                if (zzbfVar3.zzg()) {
                    i2 = zzbfVar2.zzk(z14);
                } else if (zzbfVar2.zze(obj3) == -1) {
                    int zzr = zzr(zzbeVar, zzbdVar, i7, z14, obj3, zzbfVar3, zzbfVar2);
                    zzbeVar = zzbeVar;
                    zzbfVar2 = zzbfVar2;
                    zzbdVar = zzbdVar;
                    obj3 = obj3;
                    if (zzr == -1) {
                        zzr = zzbfVar2.zzk(z14);
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    i = zzr;
                    z2 = z4;
                    obj = obj3;
                    j3 = j10;
                    j2 = j3;
                    z3 = false;
                    z5 = false;
                } else if (j10 == -9223372036854775807L) {
                    i2 = zzbfVar2.zzo(obj3, zzbdVar).zzc;
                } else if (zzaB) {
                    zzbfVar3.zzo(obj3, zzbdVar);
                    if (zzbfVar3.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar3.zze(obj3)) {
                        Pair zzm = zzbfVar2.zzm(zzbeVar, zzbdVar, zzbfVar2.zzo(obj3, zzbdVar).zzc, j10);
                        j2 = j10;
                        obj = zzm.first;
                        j4 = ((Long) zzm.second).longValue();
                    } else {
                        j2 = j10;
                        if (zzbfVar2.zzo(obj3, zzbdVar).zzd != -9223372036854775807L) {
                            long j11 = zzbdVar.zzd - 1;
                            String str = zzfj.zza;
                            j4 = Math.max(0L, Math.min(j2, j11));
                        } else {
                            j4 = j2;
                        }
                        obj = obj3;
                    }
                    i = -1;
                    j3 = j4;
                    z2 = false;
                    z3 = true;
                    z5 = false;
                } else {
                    j2 = j10;
                    i = -1;
                    j3 = j2;
                    obj = obj3;
                    z2 = false;
                    z3 = false;
                    z5 = false;
                }
                i = i2;
                obj = obj3;
                j3 = j10;
                j2 = j3;
                z2 = false;
                z3 = false;
                z5 = false;
            }
            if (i != -1) {
                Pair zzm2 = zzbfVar2.zzm(zzbeVar, zzbdVar, i, -9223372036854775807L);
                obj = zzm2.first;
                j3 = ((Long) zzm2.second).longValue();
                j5 = -9223372036854775807L;
            } else {
                j5 = j3;
            }
            zzwk zzy = this.zzs.zzy(zzbfVar2, obj, j3);
            int i9 = zzy.zze;
            boolean z16 = i9 == -1 || ((i3 = zzwkVar.zze) != -1 && i9 >= i3);
            boolean equals = obj3.equals(obj);
            boolean z17 = equals && !zzwkVar.zzb() && !zzy.zzb() && z16;
            zzbd zzo = zzbfVar2.zzo(obj, zzbdVar);
            if (!zzaB && j2 == j5 && obj3.equals(zzy.zza)) {
                if (zzwkVar.zzb()) {
                    zzo.zzk(zzwkVar.zzb);
                }
                if (zzy.zzb()) {
                    zzo.zzk(zzy.zzb);
                }
            }
            if (true == z17) {
                zzy = zzwkVar;
            }
            if (zzy.zzb()) {
                if (zzy.equals(zzwkVar)) {
                    j7 = zzmdVar.zzs;
                } else {
                    zzbfVar2.zzo(zzy.zza, zzbdVar);
                    if (zzy.zzc == zzbdVar.zzd(zzy.zzb)) {
                        zzbdVar.zzj();
                    }
                    j7 = 0;
                }
                j6 = 0;
            } else {
                if (equals && zzwkVar.zzb()) {
                    zza zza2 = zzbfVar2.zzo(obj, zzbdVar).zzg.zza(zzwkVar.zzb);
                    long j12 = zza2.zzi;
                    long j13 = zzmdVar.zzc;
                    if (j13 != -9223372036854775807L) {
                        long j14 = zza2.zza;
                        j6 = 0;
                    } else {
                        j6 = 0;
                    }
                    int i10 = zza2.zzb;
                    int i11 = zzwkVar.zzc;
                    if (i10 > i11 && zza2.zze[i11] == 2) {
                        long j15 = zzbfVar2.zzo(obj, zzbdVar).zzd;
                        if (j15 != -9223372036854775807L) {
                            j3 = Math.min(j15 - 1, j3);
                        }
                        j5 = j3;
                        j7 = j5;
                    }
                } else {
                    j6 = 0;
                }
                j7 = j3;
            }
            zzwkVar2 = zzy;
            j8 = j7;
            z6 = z2;
            z7 = z3;
            z8 = z5;
        }
        boolean z18 = (this.zzG.zzb.equals(zzwkVar2) && j8 == this.zzG.zzs) ? false : true;
        if (z6) {
            try {
                if (this.zzG.zze != 1) {
                    i5 = 4;
                    try {
                        zzB(4);
                    } catch (Throwable th) {
                        th = th;
                        i6 = 4;
                        zzwkVar3 = zzwkVar2;
                        zzaB = false;
                        zzmd zzmdVar2 = this.zzG;
                        zzbf zzbfVar4 = zzmdVar2.zza;
                        zzwk zzwkVar5 = zzmdVar2.zzb;
                        zzwk zzwkVar6 = zzwkVar3;
                        zzag(zzbfVar, zzwkVar6, zzbfVar4, zzwkVar5, true != z7 ? j : j8, false);
                        if (!z18) {
                        }
                        zzmd zzmdVar3 = this.zzG;
                        Object obj4 = zzmdVar3.zzb.zza;
                        zzbf zzbfVar5 = zzmdVar3.zza;
                        if (z18) {
                        }
                        this.zzG = zzao(zzwkVar6, j8, j5, r9 ? j8 : this.zzG.zzd, r9, zzbfVar.zze(obj4) == -1 ? i6 : 3);
                        zzaj();
                        zzZ(zzbfVar, this.zzG.zza);
                        this.zzG = this.zzG.zzd(zzbfVar);
                        if (!zzbfVar.zzg()) {
                        }
                        zzas(zzaB);
                        this.zzi.zzh(2);
                        throw th;
                    }
                } else {
                    i5 = 4;
                }
                z12 = false;
                try {
                    zzX(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    i6 = i5;
                    zzaB = z12;
                    zzwkVar3 = zzwkVar2;
                    zzmd zzmdVar22 = this.zzG;
                    zzbf zzbfVar42 = zzmdVar22.zza;
                    zzwk zzwkVar52 = zzmdVar22.zzb;
                    zzwk zzwkVar62 = zzwkVar3;
                    zzag(zzbfVar, zzwkVar62, zzbfVar42, zzwkVar52, true != z7 ? j : j8, false);
                    if (!z18) {
                    }
                    zzmd zzmdVar32 = this.zzG;
                    Object obj42 = zzmdVar32.zzb.zza;
                    zzbf zzbfVar52 = zzmdVar32.zza;
                    if (z18) {
                    }
                    this.zzG = zzao(zzwkVar62, j8, j5, r9 ? j8 : this.zzG.zzd, r9, zzbfVar.zze(obj42) == -1 ? i6 : 3);
                    zzaj();
                    zzZ(zzbfVar, this.zzG.zza);
                    this.zzG = this.zzG.zzd(zzbfVar);
                    if (!zzbfVar.zzg()) {
                    }
                    zzas(zzaB);
                    this.zzi.zzh(2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                i5 = 4;
                z12 = false;
                i6 = i5;
                zzaB = z12;
                zzwkVar3 = zzwkVar2;
                zzmd zzmdVar222 = this.zzG;
                zzbf zzbfVar422 = zzmdVar222.zza;
                zzwk zzwkVar522 = zzmdVar222.zzb;
                zzwk zzwkVar622 = zzwkVar3;
                zzag(zzbfVar, zzwkVar622, zzbfVar422, zzwkVar522, true != z7 ? j : j8, false);
                if (!z18) {
                }
                zzmd zzmdVar322 = this.zzG;
                Object obj422 = zzmdVar322.zzb.zza;
                zzbf zzbfVar522 = zzmdVar322.zza;
                if (z18) {
                }
                this.zzG = zzao(zzwkVar622, j8, j5, r9 ? j8 : this.zzG.zzd, r9, zzbfVar.zze(obj422) == -1 ? i6 : 3);
                zzaj();
                zzZ(zzbfVar, this.zzG.zza);
                this.zzG = this.zzG.zzd(zzbfVar);
                if (!zzbfVar.zzg()) {
                }
                zzas(zzaB);
                this.zzi.zzh(2);
                throw th;
            }
        } else {
            i5 = 4;
            z12 = false;
        }
        zzmp[] zzmpVarArr = this.zzb;
        for (?? r6 = z12; r6 < 2; r6++) {
            zzmpVarArr[r6].zzn(zzbfVar2);
        }
        try {
            if (z18) {
                i6 = i5;
                zzaB = z12;
                if (!zzbfVar2.zzg()) {
                    zzlq zzlqVar = this.zzs;
                    for (zzln zzm3 = zzlqVar.zzm(); zzm3 != null; zzm3 = zzm3.zzp()) {
                        if (zzm3.zzg.zza.equals(zzwkVar2)) {
                            zzm3.zzg = zzlqVar.zzx(zzbfVar2, zzm3.zzg);
                            zzm3.zzs();
                        }
                    }
                    j8 = zzS(zzwkVar2, j8, z8);
                }
            } else {
                try {
                    zzlq zzlqVar2 = this.zzs;
                    long zzah = zzlqVar2.zzn() == null ? j6 : zzah(zzlqVar2.zzn());
                    try {
                        try {
                            if (zzaz() && zzlqVar2.zzo() != null) {
                                j9 = zzah(zzlqVar2.zzo());
                                i6 = i5;
                                z13 = z12;
                                zzaB = z13;
                                zzw = zzlqVar2.zzw(zzbfVar, this.zzT, zzah, j9);
                                zzbfVar2 = zzbfVar;
                                if ((zzw & 1) == 0) {
                                    zzI(zzaB);
                                } else if ((zzw & 2) != 0) {
                                    zzab();
                                }
                            }
                            zzw = zzlqVar2.zzw(zzbfVar, this.zzT, zzah, j9);
                            zzbfVar2 = zzbfVar;
                            if ((zzw & 1) == 0) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            zzwkVar3 = zzwkVar2;
                            zzmd zzmdVar2222 = this.zzG;
                            zzbf zzbfVar4222 = zzmdVar2222.zza;
                            zzwk zzwkVar5222 = zzmdVar2222.zzb;
                            zzwk zzwkVar6222 = zzwkVar3;
                            zzag(zzbfVar, zzwkVar6222, zzbfVar4222, zzwkVar5222, true != z7 ? j : j8, false);
                            if (!z18 || j5 != this.zzG.zzc) {
                                zzmd zzmdVar3222 = this.zzG;
                                Object obj4222 = zzmdVar3222.zzb.zza;
                                zzbf zzbfVar5222 = zzmdVar3222.zza;
                                boolean z19 = (z18 || !z || zzbfVar5222.zzg() || zzbfVar5222.zzo(obj4222, this.zzm).zzf) ? zzaB : true;
                                this.zzG = zzao(zzwkVar6222, j8, j5, z19 ? j8 : this.zzG.zzd, z19, zzbfVar.zze(obj4222) == -1 ? i6 : 3);
                            }
                            zzaj();
                            zzZ(zzbfVar, this.zzG.zza);
                            this.zzG = this.zzG.zzd(zzbfVar);
                            if (!zzbfVar.zzg()) {
                                this.zzS = null;
                            }
                            zzas(zzaB);
                            this.zzi.zzh(2);
                            throw th;
                        }
                        zzaB = z13;
                    } catch (Throwable th5) {
                        th = th5;
                        zzaB = z13;
                    }
                    i6 = i5;
                    z13 = z12;
                    j9 = j6;
                } catch (Throwable th6) {
                    th = th6;
                    i6 = i5;
                    zzaB = z12;
                    zzwkVar3 = zzwkVar2;
                    zzmd zzmdVar22222 = this.zzG;
                    zzbf zzbfVar42222 = zzmdVar22222.zza;
                    zzwk zzwkVar52222 = zzmdVar22222.zzb;
                    zzwk zzwkVar62222 = zzwkVar3;
                    zzag(zzbfVar, zzwkVar62222, zzbfVar42222, zzwkVar52222, true != z7 ? j : j8, false);
                    if (!z18) {
                    }
                    zzmd zzmdVar32222 = this.zzG;
                    Object obj42222 = zzmdVar32222.zzb.zza;
                    zzbf zzbfVar52222 = zzmdVar32222.zza;
                    if (z18) {
                    }
                    this.zzG = zzao(zzwkVar62222, j8, j5, z19 ? j8 : this.zzG.zzd, z19, zzbfVar.zze(obj42222) == -1 ? i6 : 3);
                    zzaj();
                    zzZ(zzbfVar, this.zzG.zza);
                    this.zzG = this.zzG.zzd(zzbfVar);
                    if (!zzbfVar.zzg()) {
                    }
                    zzas(zzaB);
                    this.zzi.zzh(2);
                    throw th;
                }
            }
            zzmd zzmdVar4 = this.zzG;
            zzwk zzwkVar7 = zzwkVar2;
            zzag(zzbfVar2, zzwkVar7, zzmdVar4.zza, zzmdVar4.zzb, true != z7 ? j : j8, false);
            zzbf zzbfVar6 = zzbfVar2;
            if (z18 || j5 != this.zzG.zzc) {
                zzmd zzmdVar5 = this.zzG;
                Object obj5 = zzmdVar5.zzb.zza;
                zzbf zzbfVar7 = zzmdVar5.zza;
                boolean z20 = (!z18 || !z || zzbfVar7.zzg() || zzbfVar7.zzo(obj5, this.zzm).zzf) ? zzaB : true;
                this.zzG = zzao(zzwkVar7, j8, j5, z20 ? j8 : this.zzG.zzd, z20, zzbfVar6.zze(obj5) == -1 ? i6 : 3);
            }
            zzaj();
            zzZ(zzbfVar6, this.zzG.zza);
            this.zzG = this.zzG.zzd(zzbfVar6);
            if (!zzbfVar6.zzg()) {
                this.zzS = null;
            }
            zzas(zzaB);
            this.zzi.zzh(2);
        } catch (Throwable th7) {
            th = th7;
        }
    }

    private final void zzag(zzbf zzbfVar, zzwk zzwkVar, zzbf zzbfVar2, zzwk zzwkVar2, long j, boolean z) throws zziw {
        if (!zzP(zzbfVar, zzwkVar)) {
            zzav zzavVar = zzwkVar.zzb() ? zzav.zza : this.zzG.zzo;
            if (this.zzo.zzj().equals(zzavVar)) {
                return;
            }
            zzM(zzavVar);
            zzal(this.zzG.zzo, zzavVar.zzb, false, false);
            return;
        }
        Object obj = zzwkVar.zza;
        zzbd zzbdVar = this.zzm;
        int i = zzbfVar.zzo(obj, zzbdVar).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i, zzbeVar, 0L);
        zzip zzipVar = this.zzad;
        zzaf zzafVar = zzbeVar.zzj;
        String str = zzfj.zza;
        zzipVar.zza(zzafVar);
        if (j != -9223372036854775807L) {
            zzipVar.zzb(zzO(zzbfVar, obj, j));
            return;
        }
        if (!Objects.equals(!zzbfVar2.zzg() ? zzbfVar2.zzb(zzbfVar2.zzo(zzwkVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb : null, zzbeVar.zzb) || z) {
            zzipVar.zzb(-9223372036854775807L);
        }
    }

    private final long zzah(zzln zzlnVar) {
        if (zzlnVar == null) {
            return 0L;
        }
        long zza2 = zzlnVar.zza();
        if (zzlnVar.zze) {
            int i = 0;
            while (true) {
                zzmp[] zzmpVarArr = this.zzb;
                if (i >= 2) {
                    break;
                }
                if (zzmpVarArr[i].zzp(zzlnVar)) {
                    long zzf = zzmpVarArr[i].zzf(zzlnVar);
                    if (zzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    zza2 = Math.max(zzf, zza2);
                }
                i++;
            }
        }
        return zza2;
    }

    private final void zzai() {
        zzlq zzlqVar = this.zzs;
        zzlqVar.zzt();
        zzln zzl = zzlqVar.zzl();
        if (zzl != null) {
            if (!zzl.zzd || zzl.zze) {
                zzwi zzwiVar = zzl.zza;
                if (zzwiVar.zzn()) {
                    return;
                }
                if (this.zzg.zzj(this.zzv, this.zzG.zza, zzl.zzg.zza, zzl.zze ? zzwiVar.zzi() : 0L)) {
                    if (!zzl.zzd) {
                        zzl.zzt(this, zzl.zzg.zzb);
                        return;
                    }
                    zzlk zzlkVar = new zzlk();
                    zzlkVar.zza(this.zzT - zzl.zza());
                    zzlkVar.zzb(this.zzo.zzj().zzb);
                    zzlkVar.zzc(this.zzM);
                    zzl.zzj(new zzll(zzlkVar, null));
                }
            }
        }
    }

    private final void zzaj() {
        zzln zzm = this.zzs.zzm();
        boolean z = false;
        if (zzm != null && zzm.zzg.zzi && this.zzJ) {
            z = true;
        }
        this.zzK = z;
    }

    private final void zzak(zzav zzavVar, boolean z) throws zziw {
        zzal(zzavVar, zzavVar.zzb, true, z);
    }

    private final void zzal(zzav zzavVar, float f, boolean z, boolean z2) throws zziw {
        int i;
        if (z) {
            if (z2) {
                this.zzH.zza(1);
            }
            zzmd zzmdVar = this.zzG;
            zzbf zzbfVar = zzmdVar.zza;
            zzwk zzwkVar = zzmdVar.zzb;
            long j = zzmdVar.zzc;
            long j2 = zzmdVar.zzd;
            int i2 = zzmdVar.zze;
            zziw zziwVar = zzmdVar.zzf;
            boolean z3 = zzmdVar.zzg;
            zzyn zzynVar = zzmdVar.zzh;
            zzaak zzaakVar = zzmdVar.zzi;
            List list = zzmdVar.zzj;
            zzwk zzwkVar2 = zzmdVar.zzk;
            boolean z4 = zzmdVar.zzl;
            int i3 = zzmdVar.zzm;
            int i4 = zzmdVar.zzn;
            long j3 = zzmdVar.zzq;
            long j4 = zzmdVar.zzr;
            long j5 = zzmdVar.zzs;
            long j6 = zzmdVar.zzt;
            boolean z5 = zzmdVar.zzp;
            this.zzG = new zzmd(zzbfVar, zzwkVar, j, j2, i2, zziwVar, z3, zzynVar, zzaakVar, list, zzwkVar2, z4, i3, i4, zzavVar, j3, j4, j5, j6, false);
        }
        float f2 = zzavVar.zzb;
        zzln zzm = this.zzs.zzm();
        while (true) {
            i = 0;
            if (zzm == null) {
                break;
            }
            zzaac[] zzaacVarArr = zzm.zzr().zzc;
            int length = zzaacVarArr.length;
            while (i < length) {
                zzaac zzaacVar = zzaacVarArr[i];
                i++;
            }
            zzm = zzm.zzp();
        }
        zzmp[] zzmpVarArr = this.zzb;
        while (i < 2) {
            zzmpVarArr[i].zzm(f, f2);
            i++;
        }
    }

    private final void zzam() {
        long zza2;
        long j;
        zzlq zzlqVar = this.zzs;
        boolean z = false;
        if (zzaF(zzlqVar.zzk())) {
            zzln zzk = zzlqVar.zzk();
            long zzau = zzau(zzk.zzg());
            if (zzk == zzlqVar.zzm()) {
                zza2 = this.zzT;
                j = zzk.zza();
            } else {
                zza2 = this.zzT - zzk.zza();
                j = zzk.zzg.zzb;
            }
            zzli zzliVar = new zzli(this.zzv, this.zzG.zza, zzk.zzg.zza, zza2 - j, zzau, this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM);
            zzlj zzljVar = this.zzg;
            boolean zzh = zzljVar.zzh(zzliVar);
            zzln zzm = zzlqVar.zzm();
            if (zzh || !zzm.zze || zzau >= 500000 || this.zzn <= 0) {
                z = zzh;
            } else {
                zzm.zza.zzf(this.zzG.zzs, false);
                z = zzljVar.zzh(zzliVar);
            }
        }
        this.zzN = z;
        if (z) {
            zzln zzk2 = zzlqVar.zzk();
            zzk2.getClass();
            zzlk zzlkVar = new zzlk();
            zzlkVar.zza(this.zzT - zzk2.zza());
            zzlkVar.zzb(this.zzo.zzj().zzb);
            zzlkVar.zzc(this.zzM);
            zzk2.zzj(new zzll(zzlkVar, null));
        }
        zzan();
    }

    private final void zzan() {
        zzln zzk = this.zzs.zzk();
        boolean z = true;
        if (!this.zzN && (zzk == null || !zzk.zza.zzn())) {
            z = false;
        }
        zzmd zzmdVar = this.zzG;
        if (z != zzmdVar.zzg) {
            this.zzG = zzmdVar.zzg(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce A[EDGE_INSN: B:51:0x00ce->B:52:0x00ce BREAK  A[LOOP:1: B:39:0x00af->B:47:0x00cb], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzmd zzao(zzwk zzwkVar, long j, long j2, long j3, boolean z, int i) {
        List list;
        zzaak zzaakVar;
        zzln zzm;
        int i2 = 0;
        this.zzW = (!this.zzW && j == this.zzG.zzs && zzwkVar.equals(this.zzG.zzb)) ? false : true;
        zzaj();
        zzmd zzmdVar = this.zzG;
        zzyn zzynVar = zzmdVar.zzh;
        zzaak zzaakVar2 = zzmdVar.zzi;
        List list2 = zzmdVar.zzj;
        if (this.zzt.zzb()) {
            zzlq zzlqVar = this.zzs;
            zzln zzm2 = zzlqVar.zzm();
            zzyn zzq = zzm2 == null ? zzyn.zza : zzm2.zzq();
            zzaak zzr = zzm2 == null ? this.zzf : zzm2.zzr();
            zzaac[] zzaacVarArr = zzr.zzc;
            zzguc zzgucVar = new zzguc();
            boolean z2 = false;
            for (zzaac zzaacVar : zzaacVarArr) {
                if (zzaacVar != null) {
                    zzap zzapVar = zzaacVar.zzb(0).zzl;
                    if (zzapVar == null) {
                        zzgucVar.zzf(new zzap(-9223372036854775807L, new zzao[0]));
                    } else {
                        zzgucVar.zzf(zzapVar);
                        z2 = true;
                    }
                }
            }
            zzguf zzi = z2 ? zzgucVar.zzi() : zzguf.zzi();
            if (zzm2 != null) {
                zzlo zzloVar = zzm2.zzg;
                if (zzloVar.zzc != j2) {
                    zzm2.zzg = zzloVar.zzb(j2);
                    if (zzlqVar.zzm() == zzlqVar.zzn() && (zzm = zzlqVar.zzm()) != null) {
                        zzaak zzr2 = zzm.zzr();
                        while (true) {
                            zzmp[] zzmpVarArr = this.zzb;
                            if (i2 >= 2) {
                                break;
                            }
                            if (zzr2.zza(i2)) {
                                if (zzmpVarArr[i2].zze() != 1) {
                                    break;
                                }
                                int i3 = zzr2.zzb[i2].zzb;
                            }
                            i2++;
                        }
                    }
                    list = zzi;
                    zzynVar = zzq;
                    zzaakVar = zzr;
                }
            }
            if (zzlqVar.zzm() == zzlqVar.zzn()) {
                zzaak zzr22 = zzm.zzr();
                while (true) {
                    zzmp[] zzmpVarArr2 = this.zzb;
                    if (i2 >= 2) {
                    }
                    i2++;
                }
            }
            list = zzi;
            zzynVar = zzq;
            zzaakVar = zzr;
        } else {
            if (!zzwkVar.equals(this.zzG.zzb)) {
                zzaakVar2 = this.zzf;
                zzynVar = zzyn.zza;
                list2 = zzguf.zzi();
            }
            list = list2;
            zzaakVar = zzaakVar2;
        }
        if (z) {
            this.zzH.zzc(i);
        }
        return this.zzG.zzc(zzwkVar, j, j2, j3, zzat(), zzynVar, zzaakVar, list);
    }

    private final void zzap() throws zziw {
        zzaq(new boolean[2], this.zzs.zzn().zzc());
    }

    private final void zzaq(boolean[] zArr, long j) throws zziw {
        zzmp[] zzmpVarArr;
        long j2;
        zzln zzn = this.zzs.zzn();
        zzaak zzr = zzn.zzr();
        int i = 0;
        while (true) {
            zzmpVarArr = this.zzb;
            if (i >= 2) {
                break;
            }
            if (!zzr.zza(i)) {
                zzmpVarArr[i].zzG();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < 2) {
            if (!zzr.zza(i2) || zzmpVarArr[i2].zzp(zzn)) {
                j2 = j;
            } else {
                j2 = j;
                zzar(zzn, i2, zArr[i2], j2);
            }
            i2++;
            j = j2;
        }
    }

    private final void zzar(zzln zzlnVar, int i, boolean z, long j) throws zziw {
        zzmp zzmpVar = this.zzb[i];
        if (zzmpVar.zzM()) {
            return;
        }
        boolean z2 = zzlnVar == this.zzs.zzm();
        zzaak zzr = zzlnVar.zzr();
        zzmo zzmoVar = zzr.zzb[i];
        zzaac zzaacVar = zzr.zzc[i];
        boolean z3 = zzax() && this.zzG.zze == 3;
        boolean z4 = !z && z3;
        this.zzR++;
        zzmpVar.zzx(zzmoVar, zzaacVar, zzlnVar.zzc[i], this.zzT, z4, z2, j, zzlnVar.zza(), zzlnVar.zzg.zza, this.zzo);
        zzmpVar.zzy(11, new zzkt(this), zzlnVar);
        if (z3 && z2) {
            zzmpVar.zzv();
        }
    }

    private final void zzas(boolean z) {
        zzln zzk = this.zzs.zzk();
        zzwk zzwkVar = zzk == null ? this.zzG.zzb : zzk.zzg.zza;
        boolean equals = this.zzG.zzk.equals(zzwkVar);
        if (!equals) {
            this.zzG = this.zzG.zzh(zzwkVar);
        }
        zzmd zzmdVar = this.zzG;
        zzmdVar.zzq = zzk == null ? zzmdVar.zzs : zzk.zzf();
        this.zzG.zzr = zzat();
        if ((!equals || z) && zzk != null && zzk.zze) {
            zzaw(zzk.zzg.zza, zzk.zzq(), zzk.zzr());
        }
    }

    private final long zzat() {
        return zzau(this.zzG.zzq);
    }

    private final long zzau(long j) {
        zzln zzk = this.zzs.zzk();
        if (zzk == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzT - zzk.zza()));
    }

    private final long zzav(zzln zzlnVar) {
        zzgrc.zzi(zzlnVar.zze);
        return (long) ((zzlnVar.zzc() - this.zzT) / this.zzo.zzj().zzb);
    }

    private final void zzaw(zzwk zzwkVar, zzyn zzynVar, zzaak zzaakVar) {
        long zza2;
        long j;
        zzlq zzlqVar = this.zzs;
        zzln zzk = zzlqVar.zzk();
        zzk.getClass();
        if (zzk == zzlqVar.zzm()) {
            zza2 = this.zzT;
            j = zzk.zza();
        } else {
            zza2 = this.zzT - zzk.zza();
            j = zzk.zzg.zzb;
        }
        this.zzg.zzb(new zzli(this.zzv, this.zzG.zza, zzwkVar, zza2 - j, zzau(zzk.zzf()), this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM), zzynVar, zzaakVar.zzc);
    }

    private final boolean zzax() {
        zzmd zzmdVar = this.zzG;
        return zzmdVar.zzl && zzmdVar.zzn == 0;
    }

    private final void zzay(int i) throws IOException, zziw {
        zzmp zzmpVar = this.zzb[i];
        try {
            zzln zzm = this.zzs.zzm();
            if (zzm == null) {
                throw null;
            }
            zzln zzlnVar = zzm;
            zzmpVar.zzu(zzm);
        } catch (IOException | RuntimeException e) {
            zzmpVar.zze();
            throw e;
        }
    }

    private final boolean zzaz() {
        if (!this.zzy) {
            return false;
        }
        zzmp[] zzmpVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            if (zzmpVarArr[i].zzc()) {
                return true;
            }
        }
        return false;
    }

    static int zzr(zzbe zzbeVar, zzbd zzbdVar, int i, boolean z, Object obj, zzbf zzbfVar, zzbf zzbfVar2) {
        zzbe zzbeVar2 = zzbeVar;
        zzbf zzbfVar3 = zzbfVar;
        Object obj2 = zzbfVar3.zzb(zzbfVar3.zzo(obj, zzbdVar).zzc, zzbeVar, 0L).zzb;
        for (int i2 = 0; i2 < zzbfVar2.zza(); i2++) {
            if (zzbfVar2.zzb(i2, zzbeVar, 0L).zzb.equals(obj2)) {
                return i2;
            }
        }
        int zze = zzbfVar3.zze(obj);
        int zzc = zzbfVar3.zzc();
        int i3 = -1;
        int i4 = 0;
        while (true) {
            if (i4 >= zzc || i3 != -1) {
                break;
            }
            zzbf zzbfVar4 = zzbfVar3;
            int zzl = zzbfVar4.zzl(zze, zzbdVar, zzbeVar2, i, z);
            if (zzl == -1) {
                i3 = -1;
                break;
            }
            i3 = zzbfVar2.zze(zzbfVar4.zzf(zzl));
            i4++;
            zzbfVar3 = zzbfVar4;
            zze = zzl;
            zzbeVar2 = zzbeVar;
        }
        if (i3 == -1) {
            return -1;
        }
        return zzbfVar2.zzd(i3, zzbdVar, false).zzc;
    }

    static final /* synthetic */ void zzz(zzmh zzmhVar) {
        try {
            zzaE(zzmhVar);
        } catch (zziw e) {
            zzee.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:161|(1:162)|(3:642|643|(25:645|(2:647|648)(2:653|(1:655))|649|(1:651)|652|165|166|(1:168)(1:638)|169|(1:636)(2:187|(2:189|(2:190|(3:192|(2:203|204)(4:198|199|200|201)|202)(17:205|206|(2:208|(1:210))|211|(14:451|(3:476|477|(1:479)(2:480|(2:482|(2:483|(2:485|(1:487)(1:488))(3:489|490|(8:504|505|506|(8:512|(3:516|(3:518|(2:520|(2:524|525))(1:529)|527)|530)|531|(1:533)|534|535|(1:537)|538)|541|(1:543)|544|538))))))|453|(3:457|(3:459|(4:466|(1:473)(1:470)|471|472)|463)|475)|214|(2:221|(2:222|(1:224)(2:225|(4:227|(3:229|(2:233|234)|235)|238|239))))|240|(4:(1:254)|255|(10:257|(2:259|(2:261|(8:265|266|(3:270|(1:272)|273)|274|(1:276)|277|(2:278|(3:280|(2:282|283)(1:285)|284))|287)))(1:289)|288|266|(4:268|270|(0)|273)|274|(0)|277|(3:278|(1:1)(0)|284)|287)(3:290|291|292)|241)|294|295|296|(3:298|(2:302|(1:304)(17:305|(2:307|(2:308|(3:310|(2:312|313)(5:315|(1:329)(1:319)|320|(1:328)(1:323)|(2:325|326)(1:327))|314)(2:330|331)))(1:445)|332|(4:340|(1:342)|343|(10:345|346|(2:348|(2:349|(3:351|(2:353|354)(1:356)|355)(3:357|358|(7:366|(1:368)(2:387|(1:389)(2:390|391))|369|(1:386)(1:373)|374|(1:385)|377))))|392|369|(1:371)|386|374|(1:376)(1:385)|377))|393|(2:395|(1:397)(1:(13:404|(7:406|(1:408)(1:424)|409|(1:423)(1:413)|414|(1:422)(1:418)|(1:421))|399|(1:401)|346|(0)|392|369|(0)|386|374|(0)(0)|377)(1:403)))|425|(2:427|(2:429|(4:431|432|(4:434|(4:436|(1:438)|439|440)|441|442)|443))(0))|346|(0)|392|369|(0)|386|374|(0)(0)|377))(1:300)|301)|11|12)|213|214|(4:216|218|221|(3:222|(0)(0)|224))|240|(9:243|245|247|249|251|(0)|255|(0)(0)|241)|450|294|295|296|(0)|11|12)))(1:634))|635|211|(0)|213|214|(0)|240|(1:241)|450|294|295|296|(0)|11|12))|164|165|166|(0)(0)|169|(1:171)|636|635|211|(0)|213|214|(0)|240|(1:241)|450|294|295|296|(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0a04, code lost:
    
        if (r6 != false) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0a31, code lost:
    
        if (r7 == false) goto L531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x088d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0afa, code lost:
    
        r22 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04f2 A[Catch: zziw -> 0x0500, RuntimeException -> 0x088a, IOException -> 0x0b4d, zzvk -> 0x0b54, zzhc -> 0x0b5b, zzat -> 0x0b62, zztg -> 0x0b78, TRY_ENTER, TRY_LEAVE, TryCatch #7 {RuntimeException -> 0x088a, blocks: (B:648:0x04be, B:649:0x04d5, B:651:0x04db, B:652:0x04e0, B:166:0x04ee, B:168:0x04f2, B:169:0x0505, B:171:0x050c, B:173:0x0510, B:175:0x0514, B:177:0x051a, B:179:0x0520, B:181:0x0526, B:183:0x052c, B:185:0x0534, B:187:0x0540, B:189:0x054a, B:190:0x0550, B:192:0x0554, B:194:0x055a, B:196:0x0562, B:198:0x056a, B:638:0x0502, B:653:0x04c4, B:655:0x04ca), top: B:162:0x04a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0758 A[Catch: RuntimeException -> 0x0b17, zziw -> 0x0b19, IOException -> 0x0b4d, zzvk -> 0x0b54, zzhc -> 0x0b5b, zzat -> 0x0b62, zztg -> 0x0b78, TryCatch #34 {zziw -> 0x0b19, RuntimeException -> 0x0b17, blocks: (B:200:0x0581, B:202:0x0590, B:206:0x0599, B:208:0x05aa, B:210:0x05b8, B:211:0x05d0, B:214:0x0752, B:216:0x0758, B:218:0x075e, B:221:0x0763, B:222:0x076e, B:224:0x0772, B:229:0x0797, B:231:0x079d, B:233:0x07a5, B:235:0x07ad, B:239:0x07b0, B:241:0x07b9, B:295:0x0885, B:296:0x089d, B:302:0x08a9, B:304:0x08b1, B:305:0x08b8, B:307:0x08c6, B:308:0x08e0, B:310:0x08e4, B:312:0x08ec, B:314:0x0919, B:315:0x08f2, B:317:0x08fd, B:320:0x0906, B:325:0x0916, B:332:0x092d, B:334:0x0933, B:338:0x093b, B:340:0x0943, B:342:0x0947, B:343:0x0952, B:345:0x0958, B:346:0x0a65, B:349:0x0a6d, B:351:0x0a71, B:353:0x0a79, B:355:0x0a7c, B:358:0x0a80, B:360:0x0a86, B:362:0x0a8f, B:364:0x0a99, B:366:0x0a9f, B:368:0x0aa5, B:369:0x0ac7, B:371:0x0acd, B:374:0x0ad7, B:377:0x0af2, B:383:0x0aeb, B:385:0x0aef, B:387:0x0aac, B:390:0x0aba, B:391:0x0ac2, B:392:0x0ac3, B:393:0x0961, B:395:0x0968, B:397:0x096c, B:399:0x0a06, B:401:0x0a12, B:404:0x0976, B:406:0x097a, B:408:0x098c, B:409:0x0997, B:411:0x09a1, B:414:0x09aa, B:416:0x09b4, B:421:0x09bf, B:425:0x0a1f, B:427:0x0a26, B:429:0x0a2a, B:432:0x0a33, B:434:0x0a43, B:436:0x0a49, B:438:0x0a53, B:440:0x0a58, B:442:0x0a5d, B:443:0x0a62, B:445:0x0924, B:243:0x07c3, B:245:0x07c7, B:247:0x07cd, B:249:0x07d3, B:251:0x07dd, B:254:0x07e3, B:255:0x07e6, B:257:0x07ef, B:259:0x0804, B:261:0x080d, B:263:0x0815, B:266:0x081f, B:268:0x0849, B:270:0x084f, B:272:0x0854, B:274:0x085c, B:276:0x0862, B:277:0x0865, B:278:0x086e, B:280:0x0872, B:282:0x0878, B:284:0x087d, B:292:0x0884, B:451:0x05db, B:485:0x05f4, B:492:0x0605, B:496:0x0617, B:501:0x062d, B:506:0x066c, B:508:0x0673, B:510:0x0677, B:512:0x0687, B:514:0x068b, B:518:0x0692, B:520:0x0698, B:522:0x06b5, B:527:0x06be, B:531:0x06c1, B:533:0x06c8, B:535:0x06d0, B:537:0x06d6, B:539:0x067d, B:543:0x06e4, B:453:0x0716, B:455:0x071f, B:457:0x0723, B:459:0x0728, B:463:0x074f, B:464:0x0731, B:466:0x0737, B:470:0x0745, B:471:0x074c, B:668:0x0afd, B:671:0x0b08), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0772 A[Catch: RuntimeException -> 0x0b17, zziw -> 0x0b19, IOException -> 0x0b4d, zzvk -> 0x0b54, zzhc -> 0x0b5b, zzat -> 0x0b62, zztg -> 0x0b78, LOOP:5: B:222:0x076e->B:224:0x0772, LOOP_END, TryCatch #34 {zziw -> 0x0b19, RuntimeException -> 0x0b17, blocks: (B:200:0x0581, B:202:0x0590, B:206:0x0599, B:208:0x05aa, B:210:0x05b8, B:211:0x05d0, B:214:0x0752, B:216:0x0758, B:218:0x075e, B:221:0x0763, B:222:0x076e, B:224:0x0772, B:229:0x0797, B:231:0x079d, B:233:0x07a5, B:235:0x07ad, B:239:0x07b0, B:241:0x07b9, B:295:0x0885, B:296:0x089d, B:302:0x08a9, B:304:0x08b1, B:305:0x08b8, B:307:0x08c6, B:308:0x08e0, B:310:0x08e4, B:312:0x08ec, B:314:0x0919, B:315:0x08f2, B:317:0x08fd, B:320:0x0906, B:325:0x0916, B:332:0x092d, B:334:0x0933, B:338:0x093b, B:340:0x0943, B:342:0x0947, B:343:0x0952, B:345:0x0958, B:346:0x0a65, B:349:0x0a6d, B:351:0x0a71, B:353:0x0a79, B:355:0x0a7c, B:358:0x0a80, B:360:0x0a86, B:362:0x0a8f, B:364:0x0a99, B:366:0x0a9f, B:368:0x0aa5, B:369:0x0ac7, B:371:0x0acd, B:374:0x0ad7, B:377:0x0af2, B:383:0x0aeb, B:385:0x0aef, B:387:0x0aac, B:390:0x0aba, B:391:0x0ac2, B:392:0x0ac3, B:393:0x0961, B:395:0x0968, B:397:0x096c, B:399:0x0a06, B:401:0x0a12, B:404:0x0976, B:406:0x097a, B:408:0x098c, B:409:0x0997, B:411:0x09a1, B:414:0x09aa, B:416:0x09b4, B:421:0x09bf, B:425:0x0a1f, B:427:0x0a26, B:429:0x0a2a, B:432:0x0a33, B:434:0x0a43, B:436:0x0a49, B:438:0x0a53, B:440:0x0a58, B:442:0x0a5d, B:443:0x0a62, B:445:0x0924, B:243:0x07c3, B:245:0x07c7, B:247:0x07cd, B:249:0x07d3, B:251:0x07dd, B:254:0x07e3, B:255:0x07e6, B:257:0x07ef, B:259:0x0804, B:261:0x080d, B:263:0x0815, B:266:0x081f, B:268:0x0849, B:270:0x084f, B:272:0x0854, B:274:0x085c, B:276:0x0862, B:277:0x0865, B:278:0x086e, B:280:0x0872, B:282:0x0878, B:284:0x087d, B:292:0x0884, B:451:0x05db, B:485:0x05f4, B:492:0x0605, B:496:0x0617, B:501:0x062d, B:506:0x066c, B:508:0x0673, B:510:0x0677, B:512:0x0687, B:514:0x068b, B:518:0x0692, B:520:0x0698, B:522:0x06b5, B:527:0x06be, B:531:0x06c1, B:533:0x06c8, B:535:0x06d0, B:537:0x06d6, B:539:0x067d, B:543:0x06e4, B:453:0x0716, B:455:0x071f, B:457:0x0723, B:459:0x0728, B:463:0x074f, B:464:0x0731, B:466:0x0737, B:470:0x0745, B:471:0x074c, B:668:0x0afd, B:671:0x0b08), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0792 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x07c3 A[Catch: RuntimeException -> 0x0b17, zziw -> 0x0b19, IOException -> 0x0b4d, zzvk -> 0x0b54, zzhc -> 0x0b5b, zzat -> 0x0b62, zztg -> 0x0b78, TryCatch #34 {zziw -> 0x0b19, RuntimeException -> 0x0b17, blocks: (B:200:0x0581, B:202:0x0590, B:206:0x0599, B:208:0x05aa, B:210:0x05b8, B:211:0x05d0, B:214:0x0752, B:216:0x0758, B:218:0x075e, B:221:0x0763, B:222:0x076e, B:224:0x0772, B:229:0x0797, B:231:0x079d, B:233:0x07a5, B:235:0x07ad, B:239:0x07b0, B:241:0x07b9, B:295:0x0885, B:296:0x089d, B:302:0x08a9, B:304:0x08b1, B:305:0x08b8, B:307:0x08c6, B:308:0x08e0, B:310:0x08e4, B:312:0x08ec, B:314:0x0919, B:315:0x08f2, B:317:0x08fd, B:320:0x0906, B:325:0x0916, B:332:0x092d, B:334:0x0933, B:338:0x093b, B:340:0x0943, B:342:0x0947, B:343:0x0952, B:345:0x0958, B:346:0x0a65, B:349:0x0a6d, B:351:0x0a71, B:353:0x0a79, B:355:0x0a7c, B:358:0x0a80, B:360:0x0a86, B:362:0x0a8f, B:364:0x0a99, B:366:0x0a9f, B:368:0x0aa5, B:369:0x0ac7, B:371:0x0acd, B:374:0x0ad7, B:377:0x0af2, B:383:0x0aeb, B:385:0x0aef, B:387:0x0aac, B:390:0x0aba, B:391:0x0ac2, B:392:0x0ac3, B:393:0x0961, B:395:0x0968, B:397:0x096c, B:399:0x0a06, B:401:0x0a12, B:404:0x0976, B:406:0x097a, B:408:0x098c, B:409:0x0997, B:411:0x09a1, B:414:0x09aa, B:416:0x09b4, B:421:0x09bf, B:425:0x0a1f, B:427:0x0a26, B:429:0x0a2a, B:432:0x0a33, B:434:0x0a43, B:436:0x0a49, B:438:0x0a53, B:440:0x0a58, B:442:0x0a5d, B:443:0x0a62, B:445:0x0924, B:243:0x07c3, B:245:0x07c7, B:247:0x07cd, B:249:0x07d3, B:251:0x07dd, B:254:0x07e3, B:255:0x07e6, B:257:0x07ef, B:259:0x0804, B:261:0x080d, B:263:0x0815, B:266:0x081f, B:268:0x0849, B:270:0x084f, B:272:0x0854, B:274:0x085c, B:276:0x0862, B:277:0x0865, B:278:0x086e, B:280:0x0872, B:282:0x0878, B:284:0x087d, B:292:0x0884, B:451:0x05db, B:485:0x05f4, B:492:0x0605, B:496:0x0617, B:501:0x062d, B:506:0x066c, B:508:0x0673, B:510:0x0677, B:512:0x0687, B:514:0x068b, B:518:0x0692, B:520:0x0698, B:522:0x06b5, B:527:0x06be, B:531:0x06c1, B:533:0x06c8, B:535:0x06d0, B:537:0x06d6, B:539:0x067d, B:543:0x06e4, B:453:0x0716, B:455:0x071f, B:457:0x0723, B:459:0x0728, B:463:0x074f, B:464:0x0731, B:466:0x0737, B:470:0x0745, B:471:0x074c, B:668:0x0afd, B:671:0x0b08), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x07e3 A[Catch: RuntimeException -> 0x0b17, zziw -> 0x0b19, IOException -> 0x0b4d, zzvk -> 0x0b54, zzhc -> 0x0b5b, zzat -> 0x0b62, zztg -> 0x0b78, TryCatch #34 {zziw -> 0x0b19, RuntimeException -> 0x0b17, blocks: (B:200:0x0581, B:202:0x0590, B:206:0x0599, B:208:0x05aa, B:210:0x05b8, B:211:0x05d0, B:214:0x0752, B:216:0x0758, B:218:0x075e, B:221:0x0763, B:222:0x076e, B:224:0x0772, B:229:0x0797, B:231:0x079d, B:233:0x07a5, B:235:0x07ad, B:239:0x07b0, B:241:0x07b9, B:295:0x0885, B:296:0x089d, B:302:0x08a9, B:304:0x08b1, B:305:0x08b8, B:307:0x08c6, B:308:0x08e0, B:310:0x08e4, B:312:0x08ec, B:314:0x0919, B:315:0x08f2, B:317:0x08fd, B:320:0x0906, B:325:0x0916, B:332:0x092d, B:334:0x0933, B:338:0x093b, B:340:0x0943, B:342:0x0947, B:343:0x0952, B:345:0x0958, B:346:0x0a65, B:349:0x0a6d, B:351:0x0a71, B:353:0x0a79, B:355:0x0a7c, B:358:0x0a80, B:360:0x0a86, B:362:0x0a8f, B:364:0x0a99, B:366:0x0a9f, B:368:0x0aa5, B:369:0x0ac7, B:371:0x0acd, B:374:0x0ad7, B:377:0x0af2, B:383:0x0aeb, B:385:0x0aef, B:387:0x0aac, B:390:0x0aba, B:391:0x0ac2, B:392:0x0ac3, B:393:0x0961, B:395:0x0968, B:397:0x096c, B:399:0x0a06, B:401:0x0a12, B:404:0x0976, B:406:0x097a, B:408:0x098c, B:409:0x0997, B:411:0x09a1, B:414:0x09aa, B:416:0x09b4, B:421:0x09bf, B:425:0x0a1f, B:427:0x0a26, B:429:0x0a2a, B:432:0x0a33, B:434:0x0a43, B:436:0x0a49, B:438:0x0a53, B:440:0x0a58, B:442:0x0a5d, B:443:0x0a62, B:445:0x0924, B:243:0x07c3, B:245:0x07c7, B:247:0x07cd, B:249:0x07d3, B:251:0x07dd, B:254:0x07e3, B:255:0x07e6, B:257:0x07ef, B:259:0x0804, B:261:0x080d, B:263:0x0815, B:266:0x081f, B:268:0x0849, B:270:0x084f, B:272:0x0854, B:274:0x085c, B:276:0x0862, B:277:0x0865, B:278:0x086e, B:280:0x0872, B:282:0x0878, B:284:0x087d, B:292:0x0884, B:451:0x05db, B:485:0x05f4, B:492:0x0605, B:496:0x0617, B:501:0x062d, B:506:0x066c, B:508:0x0673, B:510:0x0677, B:512:0x0687, B:514:0x068b, B:518:0x0692, B:520:0x0698, B:522:0x06b5, B:527:0x06be, B:531:0x06c1, B:533:0x06c8, B:535:0x06d0, B:537:0x06d6, B:539:0x067d, B:543:0x06e4, B:453:0x0716, B:455:0x071f, B:457:0x0723, B:459:0x0728, B:463:0x074f, B:464:0x0731, B:466:0x0737, B:470:0x0745, B:471:0x074c, B:668:0x0afd, B:671:0x0b08), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07ef A[Catch: RuntimeException -> 0x0b17, zziw -> 0x0b19, IOException -> 0x0b4d, zzvk -> 0x0b54, zzhc -> 0x0b5b, zzat -> 0x0b62, zztg -> 0x0b78, TryCatch #34 {zziw -> 0x0b19, RuntimeException -> 0x0b17, blocks: (B:200:0x0581, B:202:0x0590, B:206:0x0599, B:208:0x05aa, B:210:0x05b8, B:211:0x05d0, B:214:0x0752, B:216:0x0758, B:218:0x075e, B:221:0x0763, B:222:0x076e, B:224:0x0772, B:229:0x0797, B:231:0x079d, B:233:0x07a5, B:235:0x07ad, B:239:0x07b0, B:241:0x07b9, B:295:0x0885, B:296:0x089d, B:302:0x08a9, B:304:0x08b1, B:305:0x08b8, B:307:0x08c6, B:308:0x08e0, B:310:0x08e4, B:312:0x08ec, B:314:0x0919, B:315:0x08f2, B:317:0x08fd, B:320:0x0906, B:325:0x0916, B:332:0x092d, B:334:0x0933, B:338:0x093b, B:340:0x0943, B:342:0x0947, B:343:0x0952, B:345:0x0958, B:346:0x0a65, B:349:0x0a6d, B:351:0x0a71, B:353:0x0a79, B:355:0x0a7c, B:358:0x0a80, B:360:0x0a86, B:362:0x0a8f, B:364:0x0a99, B:366:0x0a9f, B:368:0x0aa5, B:369:0x0ac7, B:371:0x0acd, B:374:0x0ad7, B:377:0x0af2, B:383:0x0aeb, B:385:0x0aef, B:387:0x0aac, B:390:0x0aba, B:391:0x0ac2, B:392:0x0ac3, B:393:0x0961, B:395:0x0968, B:397:0x096c, B:399:0x0a06, B:401:0x0a12, B:404:0x0976, B:406:0x097a, B:408:0x098c, B:409:0x0997, B:411:0x09a1, B:414:0x09aa, B:416:0x09b4, B:421:0x09bf, B:425:0x0a1f, B:427:0x0a26, B:429:0x0a2a, B:432:0x0a33, B:434:0x0a43, B:436:0x0a49, B:438:0x0a53, B:440:0x0a58, B:442:0x0a5d, B:443:0x0a62, B:445:0x0924, B:243:0x07c3, B:245:0x07c7, B:247:0x07cd, B:249:0x07d3, B:251:0x07dd, B:254:0x07e3, B:255:0x07e6, B:257:0x07ef, B:259:0x0804, B:261:0x080d, B:263:0x0815, B:266:0x081f, B:268:0x0849, B:270:0x084f, B:272:0x0854, B:274:0x085c, B:276:0x0862, B:277:0x0865, B:278:0x086e, B:280:0x0872, B:282:0x0878, B:284:0x087d, B:292:0x0884, B:451:0x05db, B:485:0x05f4, B:492:0x0605, B:496:0x0617, B:501:0x062d, B:506:0x066c, B:508:0x0673, B:510:0x0677, B:512:0x0687, B:514:0x068b, B:518:0x0692, B:520:0x0698, B:522:0x06b5, B:527:0x06be, B:531:0x06c1, B:533:0x06c8, B:535:0x06d0, B:537:0x06d6, B:539:0x067d, B:543:0x06e4, B:453:0x0716, B:455:0x071f, B:457:0x0723, B:459:0x0728, B:463:0x074f, B:464:0x0731, B:466:0x0737, B:470:0x0745, B:471:0x074c, B:668:0x0afd, B:671:0x0b08), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0854 A[Catch: RuntimeException -> 0x0b17, zziw -> 0x0b19, IOException -> 0x0b4d, zzvk -> 0x0b54, zzhc -> 0x0b5b, zzat -> 0x0b62, zztg -> 0x0b78, LOOP:8: B:271:0x0852->B:272:0x0854, LOOP_END, TryCatch #34 {zziw -> 0x0b19, RuntimeException -> 0x0b17, blocks: (B:200:0x0581, B:202:0x0590, B:206:0x0599, B:208:0x05aa, B:210:0x05b8, B:211:0x05d0, B:214:0x0752, B:216:0x0758, B:218:0x075e, B:221:0x0763, B:222:0x076e, B:224:0x0772, B:229:0x0797, B:231:0x079d, B:233:0x07a5, B:235:0x07ad, B:239:0x07b0, B:241:0x07b9, B:295:0x0885, B:296:0x089d, B:302:0x08a9, B:304:0x08b1, B:305:0x08b8, B:307:0x08c6, B:308:0x08e0, B:310:0x08e4, B:312:0x08ec, B:314:0x0919, B:315:0x08f2, B:317:0x08fd, B:320:0x0906, B:325:0x0916, B:332:0x092d, B:334:0x0933, B:338:0x093b, B:340:0x0943, B:342:0x0947, B:343:0x0952, B:345:0x0958, B:346:0x0a65, B:349:0x0a6d, B:351:0x0a71, B:353:0x0a79, B:355:0x0a7c, B:358:0x0a80, B:360:0x0a86, B:362:0x0a8f, B:364:0x0a99, B:366:0x0a9f, B:368:0x0aa5, B:369:0x0ac7, B:371:0x0acd, B:374:0x0ad7, B:377:0x0af2, B:383:0x0aeb, B:385:0x0aef, B:387:0x0aac, B:390:0x0aba, B:391:0x0ac2, B:392:0x0ac3, B:393:0x0961, B:395:0x0968, B:397:0x096c, B:399:0x0a06, B:401:0x0a12, B:404:0x0976, B:406:0x097a, B:408:0x098c, B:409:0x0997, B:411:0x09a1, B:414:0x09aa, B:416:0x09b4, B:421:0x09bf, B:425:0x0a1f, B:427:0x0a26, B:429:0x0a2a, B:432:0x0a33, B:434:0x0a43, B:436:0x0a49, B:438:0x0a53, B:440:0x0a58, B:442:0x0a5d, B:443:0x0a62, B:445:0x0924, B:243:0x07c3, B:245:0x07c7, B:247:0x07cd, B:249:0x07d3, B:251:0x07dd, B:254:0x07e3, B:255:0x07e6, B:257:0x07ef, B:259:0x0804, B:261:0x080d, B:263:0x0815, B:266:0x081f, B:268:0x0849, B:270:0x084f, B:272:0x0854, B:274:0x085c, B:276:0x0862, B:277:0x0865, B:278:0x086e, B:280:0x0872, B:282:0x0878, B:284:0x087d, B:292:0x0884, B:451:0x05db, B:485:0x05f4, B:492:0x0605, B:496:0x0617, B:501:0x062d, B:506:0x066c, B:508:0x0673, B:510:0x0677, B:512:0x0687, B:514:0x068b, B:518:0x0692, B:520:0x0698, B:522:0x06b5, B:527:0x06be, B:531:0x06c1, B:533:0x06c8, B:535:0x06d0, B:537:0x06d6, B:539:0x067d, B:543:0x06e4, B:453:0x0716, B:455:0x071f, B:457:0x0723, B:459:0x0728, B:463:0x074f, B:464:0x0731, B:466:0x0737, B:470:0x0745, B:471:0x074c, B:668:0x0afd, B:671:0x0b08), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0862 A[Catch: RuntimeException -> 0x0b17, zziw -> 0x0b19, IOException -> 0x0b4d, zzvk -> 0x0b54, zzhc -> 0x0b5b, zzat -> 0x0b62, zztg -> 0x0b78, TryCatch #34 {zziw -> 0x0b19, RuntimeException -> 0x0b17, blocks: (B:200:0x0581, B:202:0x0590, B:206:0x0599, B:208:0x05aa, B:210:0x05b8, B:211:0x05d0, B:214:0x0752, B:216:0x0758, B:218:0x075e, B:221:0x0763, B:222:0x076e, B:224:0x0772, B:229:0x0797, B:231:0x079d, B:233:0x07a5, B:235:0x07ad, B:239:0x07b0, B:241:0x07b9, B:295:0x0885, B:296:0x089d, B:302:0x08a9, B:304:0x08b1, B:305:0x08b8, B:307:0x08c6, B:308:0x08e0, B:310:0x08e4, B:312:0x08ec, B:314:0x0919, B:315:0x08f2, B:317:0x08fd, B:320:0x0906, B:325:0x0916, B:332:0x092d, B:334:0x0933, B:338:0x093b, B:340:0x0943, B:342:0x0947, B:343:0x0952, B:345:0x0958, B:346:0x0a65, B:349:0x0a6d, B:351:0x0a71, B:353:0x0a79, B:355:0x0a7c, B:358:0x0a80, B:360:0x0a86, B:362:0x0a8f, B:364:0x0a99, B:366:0x0a9f, B:368:0x0aa5, B:369:0x0ac7, B:371:0x0acd, B:374:0x0ad7, B:377:0x0af2, B:383:0x0aeb, B:385:0x0aef, B:387:0x0aac, B:390:0x0aba, B:391:0x0ac2, B:392:0x0ac3, B:393:0x0961, B:395:0x0968, B:397:0x096c, B:399:0x0a06, B:401:0x0a12, B:404:0x0976, B:406:0x097a, B:408:0x098c, B:409:0x0997, B:411:0x09a1, B:414:0x09aa, B:416:0x09b4, B:421:0x09bf, B:425:0x0a1f, B:427:0x0a26, B:429:0x0a2a, B:432:0x0a33, B:434:0x0a43, B:436:0x0a49, B:438:0x0a53, B:440:0x0a58, B:442:0x0a5d, B:443:0x0a62, B:445:0x0924, B:243:0x07c3, B:245:0x07c7, B:247:0x07cd, B:249:0x07d3, B:251:0x07dd, B:254:0x07e3, B:255:0x07e6, B:257:0x07ef, B:259:0x0804, B:261:0x080d, B:263:0x0815, B:266:0x081f, B:268:0x0849, B:270:0x084f, B:272:0x0854, B:274:0x085c, B:276:0x0862, B:277:0x0865, B:278:0x086e, B:280:0x0872, B:282:0x0878, B:284:0x087d, B:292:0x0884, B:451:0x05db, B:485:0x05f4, B:492:0x0605, B:496:0x0617, B:501:0x062d, B:506:0x066c, B:508:0x0673, B:510:0x0677, B:512:0x0687, B:514:0x068b, B:518:0x0692, B:520:0x0698, B:522:0x06b5, B:527:0x06be, B:531:0x06c1, B:533:0x06c8, B:535:0x06d0, B:537:0x06d6, B:539:0x067d, B:543:0x06e4, B:453:0x0716, B:455:0x071f, B:457:0x0723, B:459:0x0728, B:463:0x074f, B:464:0x0731, B:466:0x0737, B:470:0x0745, B:471:0x074c, B:668:0x0afd, B:671:0x0b08), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0872 A[Catch: RuntimeException -> 0x0b17, zziw -> 0x0b19, IOException -> 0x0b4d, zzvk -> 0x0b54, zzhc -> 0x0b5b, zzat -> 0x0b62, zztg -> 0x0b78, TryCatch #34 {zziw -> 0x0b19, RuntimeException -> 0x0b17, blocks: (B:200:0x0581, B:202:0x0590, B:206:0x0599, B:208:0x05aa, B:210:0x05b8, B:211:0x05d0, B:214:0x0752, B:216:0x0758, B:218:0x075e, B:221:0x0763, B:222:0x076e, B:224:0x0772, B:229:0x0797, B:231:0x079d, B:233:0x07a5, B:235:0x07ad, B:239:0x07b0, B:241:0x07b9, B:295:0x0885, B:296:0x089d, B:302:0x08a9, B:304:0x08b1, B:305:0x08b8, B:307:0x08c6, B:308:0x08e0, B:310:0x08e4, B:312:0x08ec, B:314:0x0919, B:315:0x08f2, B:317:0x08fd, B:320:0x0906, B:325:0x0916, B:332:0x092d, B:334:0x0933, B:338:0x093b, B:340:0x0943, B:342:0x0947, B:343:0x0952, B:345:0x0958, B:346:0x0a65, B:349:0x0a6d, B:351:0x0a71, B:353:0x0a79, B:355:0x0a7c, B:358:0x0a80, B:360:0x0a86, B:362:0x0a8f, B:364:0x0a99, B:366:0x0a9f, B:368:0x0aa5, B:369:0x0ac7, B:371:0x0acd, B:374:0x0ad7, B:377:0x0af2, B:383:0x0aeb, B:385:0x0aef, B:387:0x0aac, B:390:0x0aba, B:391:0x0ac2, B:392:0x0ac3, B:393:0x0961, B:395:0x0968, B:397:0x096c, B:399:0x0a06, B:401:0x0a12, B:404:0x0976, B:406:0x097a, B:408:0x098c, B:409:0x0997, B:411:0x09a1, B:414:0x09aa, B:416:0x09b4, B:421:0x09bf, B:425:0x0a1f, B:427:0x0a26, B:429:0x0a2a, B:432:0x0a33, B:434:0x0a43, B:436:0x0a49, B:438:0x0a53, B:440:0x0a58, B:442:0x0a5d, B:443:0x0a62, B:445:0x0924, B:243:0x07c3, B:245:0x07c7, B:247:0x07cd, B:249:0x07d3, B:251:0x07dd, B:254:0x07e3, B:255:0x07e6, B:257:0x07ef, B:259:0x0804, B:261:0x080d, B:263:0x0815, B:266:0x081f, B:268:0x0849, B:270:0x084f, B:272:0x0854, B:274:0x085c, B:276:0x0862, B:277:0x0865, B:278:0x086e, B:280:0x0872, B:282:0x0878, B:284:0x087d, B:292:0x0884, B:451:0x05db, B:485:0x05f4, B:492:0x0605, B:496:0x0617, B:501:0x062d, B:506:0x066c, B:508:0x0673, B:510:0x0677, B:512:0x0687, B:514:0x068b, B:518:0x0692, B:520:0x0698, B:522:0x06b5, B:527:0x06be, B:531:0x06c1, B:533:0x06c8, B:535:0x06d0, B:537:0x06d6, B:539:0x067d, B:543:0x06e4, B:453:0x0716, B:455:0x071f, B:457:0x0723, B:459:0x0728, B:463:0x074f, B:464:0x0731, B:466:0x0737, B:470:0x0745, B:471:0x074c, B:668:0x0afd, B:671:0x0b08), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0883 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0acd A[Catch: RuntimeException -> 0x0b17, zziw -> 0x0b19, IOException -> 0x0b4d, zzvk -> 0x0b54, zzhc -> 0x0b5b, zzat -> 0x0b62, zztg -> 0x0b78, TryCatch #34 {zziw -> 0x0b19, RuntimeException -> 0x0b17, blocks: (B:200:0x0581, B:202:0x0590, B:206:0x0599, B:208:0x05aa, B:210:0x05b8, B:211:0x05d0, B:214:0x0752, B:216:0x0758, B:218:0x075e, B:221:0x0763, B:222:0x076e, B:224:0x0772, B:229:0x0797, B:231:0x079d, B:233:0x07a5, B:235:0x07ad, B:239:0x07b0, B:241:0x07b9, B:295:0x0885, B:296:0x089d, B:302:0x08a9, B:304:0x08b1, B:305:0x08b8, B:307:0x08c6, B:308:0x08e0, B:310:0x08e4, B:312:0x08ec, B:314:0x0919, B:315:0x08f2, B:317:0x08fd, B:320:0x0906, B:325:0x0916, B:332:0x092d, B:334:0x0933, B:338:0x093b, B:340:0x0943, B:342:0x0947, B:343:0x0952, B:345:0x0958, B:346:0x0a65, B:349:0x0a6d, B:351:0x0a71, B:353:0x0a79, B:355:0x0a7c, B:358:0x0a80, B:360:0x0a86, B:362:0x0a8f, B:364:0x0a99, B:366:0x0a9f, B:368:0x0aa5, B:369:0x0ac7, B:371:0x0acd, B:374:0x0ad7, B:377:0x0af2, B:383:0x0aeb, B:385:0x0aef, B:387:0x0aac, B:390:0x0aba, B:391:0x0ac2, B:392:0x0ac3, B:393:0x0961, B:395:0x0968, B:397:0x096c, B:399:0x0a06, B:401:0x0a12, B:404:0x0976, B:406:0x097a, B:408:0x098c, B:409:0x0997, B:411:0x09a1, B:414:0x09aa, B:416:0x09b4, B:421:0x09bf, B:425:0x0a1f, B:427:0x0a26, B:429:0x0a2a, B:432:0x0a33, B:434:0x0a43, B:436:0x0a49, B:438:0x0a53, B:440:0x0a58, B:442:0x0a5d, B:443:0x0a62, B:445:0x0924, B:243:0x07c3, B:245:0x07c7, B:247:0x07cd, B:249:0x07d3, B:251:0x07dd, B:254:0x07e3, B:255:0x07e6, B:257:0x07ef, B:259:0x0804, B:261:0x080d, B:263:0x0815, B:266:0x081f, B:268:0x0849, B:270:0x084f, B:272:0x0854, B:274:0x085c, B:276:0x0862, B:277:0x0865, B:278:0x086e, B:280:0x0872, B:282:0x0878, B:284:0x087d, B:292:0x0884, B:451:0x05db, B:485:0x05f4, B:492:0x0605, B:496:0x0617, B:501:0x062d, B:506:0x066c, B:508:0x0673, B:510:0x0677, B:512:0x0687, B:514:0x068b, B:518:0x0692, B:520:0x0698, B:522:0x06b5, B:527:0x06be, B:531:0x06c1, B:533:0x06c8, B:535:0x06d0, B:537:0x06d6, B:539:0x067d, B:543:0x06e4, B:453:0x0716, B:455:0x071f, B:457:0x0723, B:459:0x0728, B:463:0x074f, B:464:0x0731, B:466:0x0737, B:470:0x0745, B:471:0x074c, B:668:0x0afd, B:671:0x0b08), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0ae2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0ae3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x05db A[Catch: RuntimeException -> 0x0b17, zziw -> 0x0b19, IOException -> 0x0b4d, zzvk -> 0x0b54, zzhc -> 0x0b5b, zzat -> 0x0b62, zztg -> 0x0b78, TRY_LEAVE, TryCatch #34 {zziw -> 0x0b19, RuntimeException -> 0x0b17, blocks: (B:200:0x0581, B:202:0x0590, B:206:0x0599, B:208:0x05aa, B:210:0x05b8, B:211:0x05d0, B:214:0x0752, B:216:0x0758, B:218:0x075e, B:221:0x0763, B:222:0x076e, B:224:0x0772, B:229:0x0797, B:231:0x079d, B:233:0x07a5, B:235:0x07ad, B:239:0x07b0, B:241:0x07b9, B:295:0x0885, B:296:0x089d, B:302:0x08a9, B:304:0x08b1, B:305:0x08b8, B:307:0x08c6, B:308:0x08e0, B:310:0x08e4, B:312:0x08ec, B:314:0x0919, B:315:0x08f2, B:317:0x08fd, B:320:0x0906, B:325:0x0916, B:332:0x092d, B:334:0x0933, B:338:0x093b, B:340:0x0943, B:342:0x0947, B:343:0x0952, B:345:0x0958, B:346:0x0a65, B:349:0x0a6d, B:351:0x0a71, B:353:0x0a79, B:355:0x0a7c, B:358:0x0a80, B:360:0x0a86, B:362:0x0a8f, B:364:0x0a99, B:366:0x0a9f, B:368:0x0aa5, B:369:0x0ac7, B:371:0x0acd, B:374:0x0ad7, B:377:0x0af2, B:383:0x0aeb, B:385:0x0aef, B:387:0x0aac, B:390:0x0aba, B:391:0x0ac2, B:392:0x0ac3, B:393:0x0961, B:395:0x0968, B:397:0x096c, B:399:0x0a06, B:401:0x0a12, B:404:0x0976, B:406:0x097a, B:408:0x098c, B:409:0x0997, B:411:0x09a1, B:414:0x09aa, B:416:0x09b4, B:421:0x09bf, B:425:0x0a1f, B:427:0x0a26, B:429:0x0a2a, B:432:0x0a33, B:434:0x0a43, B:436:0x0a49, B:438:0x0a53, B:440:0x0a58, B:442:0x0a5d, B:443:0x0a62, B:445:0x0924, B:243:0x07c3, B:245:0x07c7, B:247:0x07cd, B:249:0x07d3, B:251:0x07dd, B:254:0x07e3, B:255:0x07e6, B:257:0x07ef, B:259:0x0804, B:261:0x080d, B:263:0x0815, B:266:0x081f, B:268:0x0849, B:270:0x084f, B:272:0x0854, B:274:0x085c, B:276:0x0862, B:277:0x0865, B:278:0x086e, B:280:0x0872, B:282:0x0878, B:284:0x087d, B:292:0x0884, B:451:0x05db, B:485:0x05f4, B:492:0x0605, B:496:0x0617, B:501:0x062d, B:506:0x066c, B:508:0x0673, B:510:0x0677, B:512:0x0687, B:514:0x068b, B:518:0x0692, B:520:0x0698, B:522:0x06b5, B:527:0x06be, B:531:0x06c1, B:533:0x06c8, B:535:0x06d0, B:537:0x06d6, B:539:0x067d, B:543:0x06e4, B:453:0x0716, B:455:0x071f, B:457:0x0723, B:459:0x0728, B:463:0x074f, B:464:0x0731, B:466:0x0737, B:470:0x0745, B:471:0x074c, B:668:0x0afd, B:671:0x0b08), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0b68  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0b72  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0b8c  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0ba5  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0be5 A[ADDED_TO_REGION, LOOP:19: B:581:0x0be5->B:584:0x0bed, LOOP_START, PHI: r2
      0x0be5: PHI (r2v30 com.google.android.gms.internal.ads.zzln) = (r2v28 com.google.android.gms.internal.ads.zzln), (r2v31 com.google.android.gms.internal.ads.zzln) binds: [B:580:0x0be2, B:584:0x0bed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0c0b  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0c15  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0c54  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0b2b  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0502 A[Catch: RuntimeException -> 0x088a, zziw -> 0x088d, IOException -> 0x0b4d, zzvk -> 0x0b54, zzhc -> 0x0b5b, zzat -> 0x0b62, zztg -> 0x0b78, TRY_ENTER, TryCatch #7 {RuntimeException -> 0x088a, blocks: (B:648:0x04be, B:649:0x04d5, B:651:0x04db, B:652:0x04e0, B:166:0x04ee, B:168:0x04f2, B:169:0x0505, B:171:0x050c, B:173:0x0510, B:175:0x0514, B:177:0x051a, B:179:0x0520, B:181:0x0526, B:183:0x052c, B:185:0x0534, B:187:0x0540, B:189:0x054a, B:190:0x0550, B:192:0x0554, B:194:0x055a, B:196:0x0562, B:198:0x056a, B:638:0x0502, B:653:0x04c4, B:655:0x04ca), top: B:162:0x04a8 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        String str;
        String str2;
        String str3;
        String str4;
        zziw zziwVar;
        boolean z;
        int i;
        zzwk zzwkVar;
        zzln zzn;
        zzd zzdVar;
        boolean z2;
        long uptimeMillis;
        zzdx zzdxVar;
        long j;
        zziw zziwVar2;
        long j2;
        int i2;
        long j3;
        boolean z3;
        boolean z4;
        boolean zzi;
        int i3;
        long j4;
        zzlo zzh;
        long j5;
        zzln zzn2;
        int i4;
        zzlq zzlqVar;
        boolean z5;
        zzln zzn3;
        boolean z6;
        zzln zzm;
        zzln zzp;
        zzln zzr;
        char c;
        boolean z7;
        int i5;
        int i6;
        zzln zzn4;
        zzaak zzr2;
        int i7;
        int i8;
        zzmp[] zzmpVarArr;
        zzln zzo;
        long j6;
        long j7;
        String str5;
        String str6 = "ExoPlayerImplInternal";
        int i9 = 2;
        try {
            try {
                try {
                    zzdVar = null;
                    try {
                    } catch (zziw e) {
                        e = e;
                    } catch (RuntimeException e2) {
                        e = e2;
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                }
            } catch (zziw e4) {
                e = e4;
            }
        } catch (zzat e5) {
            e = e5;
        } catch (zzhc e6) {
            e = e6;
        } catch (zztg e7) {
            e = e7;
        } catch (zzvk e8) {
            e = e8;
        } catch (IOException e9) {
            e = e9;
        }
        switch (message.what) {
            case 1:
                zzE(message.arg1 != 0, message.arg2 >> 4, true, message.arg2 & 15);
                z = true;
                zzC();
                return z;
            case 2:
                try {
                    uptimeMillis = SystemClock.uptimeMillis();
                    zzdxVar = this.zzi;
                    zzdxVar.zzk(2);
                } catch (zziw e10) {
                    e = e10;
                    str = "Playback error";
                    break;
                }
                if (!this.zzG.zza.zzg() && this.zzt.zzb()) {
                    zzlq zzlqVar2 = this.zzs;
                    zzlqVar2.zzf(this.zzT);
                    try {
                        try {
                        } catch (RuntimeException e11) {
                            e = e11;
                            str4 = str6;
                            zziw zzc = zziw.zzc(e, (!(e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
                            zzee.zzf(str4, str, zzc);
                            zzW(true, false);
                            this.zzG = this.zzG.zzf(zzc);
                            z = true;
                            zzC();
                            return z;
                        }
                    } catch (zziw e12) {
                        e = e12;
                    }
                    if (zzlqVar2.zzg()) {
                        try {
                            zzh = zzlqVar2.zzh(this.zzT, this.zzG);
                        } catch (zziw e13) {
                            e = e13;
                            str = "Playback error";
                            str3 = "ExoPlayerImplInternal";
                            str2 = str;
                            if (e.zzc == 1 && (zzn = this.zzs.zzn()) != null && e.zzh == null) {
                                e = e.zzd(zzn.zzg.zza);
                            }
                            if (e.zzc == 1 && (zzwkVar = e.zzh) != null) {
                                int i10 = e.zze;
                                zzlq zzlqVar3 = this.zzs;
                                if (zzlqVar3.zzo() != null && zzlqVar3.zzo().zzg.zza.equals(zzwkVar) && this.zzb[i10].zzq(zzlqVar3.zzo())) {
                                    this.zzab = true;
                                    zzab();
                                    zzln zzo2 = zzlqVar3.zzo();
                                    zzln zzm2 = zzlqVar3.zzm();
                                    if (zzlqVar3.zzm() != zzo2) {
                                        while (zzm2 != null && zzm2.zzp() != zzo2) {
                                            zzm2 = zzm2.zzp();
                                        }
                                    }
                                    zzlqVar3.zzs(zzm2);
                                    if (this.zzG.zze != 4) {
                                        zzam();
                                        this.zzi.zzh(2);
                                    }
                                    z = true;
                                    zzC();
                                    return z;
                                }
                            }
                            zziwVar = this.zzX;
                            if (zziwVar != null) {
                                zziwVar.addSuppressed(e);
                                e = this.zzX;
                            }
                            if (e.zzc == 1) {
                                zzlq zzlqVar4 = this.zzs;
                                if (zzlqVar4.zzm() != zzlqVar4.zzn()) {
                                    while (zzlqVar4.zzm() != zzlqVar4.zzn()) {
                                        zzlqVar4.zzr();
                                    }
                                    zzln zzm3 = zzlqVar4.zzm();
                                    zzm3.getClass();
                                    zzC();
                                    zzlo zzloVar = zzm3.zzg;
                                    zzwk zzwkVar2 = zzloVar.zza;
                                    long j8 = zzloVar.zzb;
                                    this.zzG = zzao(zzwkVar2, j8, zzloVar.zzc, j8, true, 0);
                                }
                            }
                            if (e.zzi || !(this.zzX == null || (i = e.zza) == 5004 || i == 5003)) {
                                zzee.zzf(str3, str2, e);
                                z = true;
                                zzW(true, false);
                                this.zzG = this.zzG.zzf(e);
                                zzC();
                                return z;
                            }
                            zzee.zzd(str3, "Recoverable renderer error", e);
                            if (this.zzX == null) {
                                this.zzX = e;
                            }
                            zzdx zzdxVar2 = this.zzi;
                            zzdxVar2.zzg(zzdxVar2.zzd(25, e));
                            z = true;
                            zzC();
                            return z;
                        }
                        if (zzh != null) {
                            zzln zzi2 = zzlqVar2.zzi(zzh);
                            if (zzi2.zzd) {
                                str = "Playback error";
                                if (zzi2.zze) {
                                    zzdxVar.zzd(8, zzi2.zza).zza();
                                }
                            } else {
                                str = "Playback error";
                                zzi2.zzt(this, zzh.zzb);
                            }
                            if (zzlqVar2.zzm() == zzi2) {
                                zzU(zzh.zzb, true);
                            }
                            zzas(false);
                            if (this.zzN) {
                                zzam();
                            } else {
                                this.zzN = zzaF(zzlqVar2.zzk());
                                zzan();
                            }
                            long j9 = 10000000;
                            if (!this.zzK || !this.zzy || this.zzab || zzaz() || (zzo = zzlqVar2.zzo()) == null || zzo != zzlqVar2.zzn() || zzo.zzp() == null || !zzo.zzp().zze || zzav(zzo.zzp()) > 10000000) {
                                j = uptimeMillis;
                            } else {
                                zzlqVar2.zzq();
                                zzln zzo3 = zzlqVar2.zzo();
                                if (zzo3 != null) {
                                    zzaak zzr3 = zzo3.zzr();
                                    long j10 = uptimeMillis;
                                    int i11 = 0;
                                    while (true) {
                                        zzmp[] zzmpVarArr2 = this.zzb;
                                        if (i11 >= 2) {
                                            j = j10;
                                            j5 = j9;
                                            str4 = str6;
                                            j2 = -9223372036854775807L;
                                            if (zzaz()) {
                                                this.zzaa = zzo3.zza.zzh();
                                                if (!zzo3.zzd()) {
                                                    zzlqVar2.zzs(zzo3);
                                                    zzas(false);
                                                    zzam();
                                                }
                                            }
                                            zzn2 = zzlqVar2.zzn();
                                            if (zzn2 != null) {
                                                if (zzn2.zzp() != null) {
                                                    try {
                                                        if (!this.zzK) {
                                                            zzln zzn5 = zzlqVar2.zzn();
                                                            if (zzn5.zze) {
                                                                int i12 = 0;
                                                                while (true) {
                                                                    zzmp[] zzmpVarArr3 = this.zzb;
                                                                    if (i12 < 2) {
                                                                        if (zzmpVarArr3[i12].zzr(zzn5)) {
                                                                            i12++;
                                                                        }
                                                                    } else if ((!zzaz() || zzlqVar2.zzo() != zzlqVar2.zzn()) && ((zzn2.zzp().zze || this.zzT >= zzn2.zzp().zzc()) && (!zzn2.zzp().zze || zzav(zzn2.zzp()) <= j5))) {
                                                                        zzaak zzr4 = zzn2.zzr();
                                                                        zzln zzp2 = zzlqVar2.zzp();
                                                                        zzaak zzr5 = zzp2.zzr();
                                                                        zzbf zzbfVar = this.zzG.zza;
                                                                        i4 = 1;
                                                                        zzag(zzbfVar, zzp2.zzg.zza, zzbfVar, zzn2.zzg.zza, -9223372036854775807L, false);
                                                                        if (zzp2.zze && (((z5 = this.zzy) && this.zzaa != j2) || zzp2.zza.zzh() != j2)) {
                                                                            this.zzaa = j2;
                                                                            if (z5 && !this.zzab) {
                                                                                for (int i13 = 0; i13 < 2; i13++) {
                                                                                    if (zzr5.zza(i13)) {
                                                                                        zzmpVarArr3[i13].zze();
                                                                                        zzaac[] zzaacVarArr = zzr5.zzc;
                                                                                        if (!zzas.zzd(zzaacVarArr[i13].zzc().zzo, zzaacVarArr[i13].zzc().zzk) && !zzmpVarArr3[i13].zzc()) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            long zzc2 = zzp2.zzc();
                                                                            for (int i14 = 0; i14 < 2; i14++) {
                                                                                zzmpVarArr3[i14].zzj(zzc2);
                                                                            }
                                                                            if (!zzp2.zzd()) {
                                                                                zzlqVar2.zzs(zzp2);
                                                                                zzas(false);
                                                                                zzam();
                                                                            }
                                                                            zzlqVar = zzlqVar2;
                                                                        }
                                                                        for (int i15 = 0; i15 < 2; i15++) {
                                                                            zzmpVarArr3[i15].zzi(zzr4, zzr5, zzp2.zzc());
                                                                        }
                                                                        zzlqVar = zzlqVar2;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } catch (zzat e14) {
                                                        e = e14;
                                                        zzA(e, e.zzb != 1 ? true != e.zza ? 3003 : AdError.MEDIATION_ERROR_CODE : 1000);
                                                        z = true;
                                                        zzC();
                                                        return z;
                                                    } catch (zzhc e15) {
                                                        e = e15;
                                                        zzA(e, e.zza);
                                                        z = true;
                                                        zzC();
                                                        return z;
                                                    } catch (zziw e16) {
                                                        e = e16;
                                                        str2 = str;
                                                        str3 = str4;
                                                        if (e.zzc == 1) {
                                                        }
                                                        if (e.zzc == 1) {
                                                        }
                                                        zziwVar = this.zzX;
                                                        if (zziwVar != null) {
                                                        }
                                                        if (e.zzc == 1) {
                                                        }
                                                        if (e.zzi) {
                                                        }
                                                        zzee.zzf(str3, str2, e);
                                                        z = true;
                                                        zzW(true, false);
                                                        this.zzG = this.zzG.zzf(e);
                                                        zzC();
                                                        return z;
                                                    } catch (zztg e17) {
                                                        e = e17;
                                                        zzA(e, e.zza);
                                                        z = true;
                                                        zzC();
                                                        return z;
                                                    } catch (zzvk e18) {
                                                        e = e18;
                                                        zzA(e, 1002);
                                                        z = true;
                                                        zzC();
                                                        return z;
                                                    } catch (IOException e19) {
                                                        e = e19;
                                                        zzA(e, AdError.SERVER_ERROR_CODE);
                                                        z = true;
                                                        zzC();
                                                        return z;
                                                    } catch (RuntimeException e20) {
                                                        e = e20;
                                                        zziw zzc3 = zziw.zzc(e, (!(e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
                                                        zzee.zzf(str4, str, zzc3);
                                                        zzW(true, false);
                                                        this.zzG = this.zzG.zzf(zzc3);
                                                        z = true;
                                                        zzC();
                                                        return z;
                                                    }
                                                }
                                                i4 = 1;
                                                zzlqVar = zzlqVar2;
                                                if (zzn2.zzg.zzj || this.zzK) {
                                                    zzmp[] zzmpVarArr4 = this.zzb;
                                                    for (int i16 = 0; i16 < 2; i16++) {
                                                        zzmp zzmpVar = zzmpVarArr4[i16];
                                                        if (zzmpVar.zzp(zzn2) && zzmpVar.zzg(zzn2)) {
                                                            long j11 = zzn2.zzg.zze;
                                                            zzmpVar.zzh(zzn2, (j11 == j2 || j11 == Long.MIN_VALUE) ? j2 : j11 + zzn2.zza());
                                                        }
                                                    }
                                                }
                                                zzn3 = zzlqVar.zzn();
                                                if (zzn3 != null && zzlqVar.zzm() != zzn3 && !zzn3.zzh) {
                                                    zzn4 = zzlqVar.zzn();
                                                    zzr2 = zzn4.zzr();
                                                    i7 = i4;
                                                    i8 = 0;
                                                    while (true) {
                                                        zzmpVarArr = this.zzb;
                                                        if (i8 >= 2) {
                                                            int zzd = zzmpVarArr[i8].zzd();
                                                            int zzH = zzmpVarArr[i8].zzH(zzn4, zzr2, this.zzo);
                                                            this.zzR -= zzd - zzmpVarArr[i8].zzd();
                                                            i7 &= zzH & 1;
                                                            i8++;
                                                        } else if (i7 != 0) {
                                                            for (int i17 = 0; i17 < 2; i17++) {
                                                                if (zzr2.zza(i17) && !zzmpVarArr[i17].zzp(zzn4)) {
                                                                    zzar(zzn4, i17, false, zzn4.zzc());
                                                                }
                                                            }
                                                            zzlqVar.zzn().zzh = i4;
                                                        }
                                                    }
                                                }
                                                z6 = false;
                                                while (zzax() && !this.zzK && (zzm = zzlqVar.zzm()) != null && (zzp = zzm.zzp()) != null && this.zzT >= zzp.zzc() && zzp.zzh) {
                                                    if (z6) {
                                                        zzC();
                                                    }
                                                    this.zzab = false;
                                                    zzr = zzlqVar.zzr();
                                                    if (zzr != null) {
                                                        throw null;
                                                    }
                                                    zzln zzlnVar = zzr;
                                                    if (this.zzG.zzb.zza.equals(zzr.zzg.zza.zza)) {
                                                        zzwk zzwkVar3 = this.zzG.zzb;
                                                        c = 65535;
                                                        if (zzwkVar3.zzb == -1) {
                                                            zzwk zzwkVar4 = zzr.zzg.zza;
                                                            if (zzwkVar4.zzb == -1 && zzwkVar3.zze != zzwkVar4.zze) {
                                                                z7 = true;
                                                                zzlo zzloVar2 = zzr.zzg;
                                                                boolean z8 = z7;
                                                                zzwk zzwkVar5 = zzloVar2.zza;
                                                                long j12 = zzloVar2.zzb;
                                                                this.zzG = zzao(zzwkVar5, j12, zzloVar2.zzc, j12, !z8, 0);
                                                                zzaj();
                                                                zzL();
                                                                if (zzaz() && zzr == zzlqVar.zzo()) {
                                                                    zzmp[] zzmpVarArr5 = this.zzb;
                                                                    for (i6 = 0; i6 < 2; i6++) {
                                                                        zzmpVarArr5[i6].zzB();
                                                                    }
                                                                }
                                                                if (this.zzG.zze == 3) {
                                                                    zzJ();
                                                                }
                                                                zzaak zzr6 = zzlqVar.zzm().zzr();
                                                                i5 = 0;
                                                                while (true) {
                                                                    zzmp[] zzmpVarArr6 = this.zzb;
                                                                    if (i5 >= 2) {
                                                                        if (zzr6.zza(i5)) {
                                                                            zzmpVarArr6[i5].zzl();
                                                                        }
                                                                        i5++;
                                                                    }
                                                                }
                                                                z6 = true;
                                                            }
                                                        }
                                                    } else {
                                                        c = 65535;
                                                    }
                                                    z7 = false;
                                                    zzlo zzloVar22 = zzr.zzg;
                                                    boolean z82 = z7;
                                                    zzwk zzwkVar52 = zzloVar22.zza;
                                                    long j122 = zzloVar22.zzb;
                                                    this.zzG = zzao(zzwkVar52, j122, zzloVar22.zzc, j122, !z82, 0);
                                                    zzaj();
                                                    zzL();
                                                    if (zzaz()) {
                                                        zzmp[] zzmpVarArr52 = this.zzb;
                                                        while (i6 < 2) {
                                                        }
                                                    }
                                                    if (this.zzG.zze == 3) {
                                                    }
                                                    zzaak zzr62 = zzlqVar.zzm().zzr();
                                                    i5 = 0;
                                                    while (true) {
                                                        zzmp[] zzmpVarArr62 = this.zzb;
                                                        if (i5 >= 2) {
                                                            break;
                                                        }
                                                        i5++;
                                                    }
                                                    z6 = true;
                                                }
                                                zziwVar2 = null;
                                                long j13 = this.zzZ.zzb;
                                                i2 = this.zzG.zze;
                                                z = true;
                                                if (i2 != 1) {
                                                    if (i2 != 4) {
                                                        zzlq zzlqVar5 = this.zzs;
                                                        zzln zzm4 = zzlqVar5.zzm();
                                                        if (zzm4 == null) {
                                                            zzQ(j);
                                                        } else {
                                                            long j14 = j;
                                                            Trace.beginSection("doSomeWork");
                                                            zzL();
                                                            if (zzm4.zze) {
                                                                this.zzU = zzfj.zzq(SystemClock.elapsedRealtime());
                                                                boolean z9 = false;
                                                                zzm4.zza.zzf(this.zzG.zzs - this.zzn, false);
                                                                int i18 = 0;
                                                                z3 = true;
                                                                z4 = true;
                                                                while (true) {
                                                                    zzmp[] zzmpVarArr7 = this.zzb;
                                                                    if (i18 < i9) {
                                                                        zzmp zzmpVar2 = zzmpVarArr7[i18];
                                                                        if (zzmpVar2.zzd() == 0) {
                                                                            zzN(i18, z9);
                                                                            j4 = j2;
                                                                        } else {
                                                                            j4 = j2;
                                                                            zzmpVar2.zzs(this.zzT, this.zzU);
                                                                            z3 = z3 && zzmpVar2.zzo();
                                                                            boolean zzt = zzmpVar2.zzt(zzm4);
                                                                            zzN(i18, zzt);
                                                                            z4 = z4 && zzt;
                                                                            if (!zzt) {
                                                                                zzay(i18);
                                                                            }
                                                                        }
                                                                        i18++;
                                                                        j2 = j4;
                                                                        z9 = false;
                                                                        i9 = 2;
                                                                    } else {
                                                                        j3 = j2;
                                                                    }
                                                                }
                                                            } else {
                                                                j3 = j2;
                                                                zzm4.zza.zzc();
                                                                z3 = true;
                                                                z4 = true;
                                                            }
                                                            long j15 = zzm4.zzg.zze;
                                                            if (z3 && zzm4.zze && (j15 == j3 || j15 <= this.zzG.zzs)) {
                                                                if (this.zzK) {
                                                                    this.zzK = false;
                                                                    zzE(false, this.zzG.zzn, false, 5);
                                                                }
                                                                if (zzm4.zzg.zzj) {
                                                                    zzB(4);
                                                                    zzK();
                                                                    int i19 = 2;
                                                                    if (this.zzG.zze == 2) {
                                                                        int i20 = 0;
                                                                        while (true) {
                                                                            zzmp[] zzmpVarArr8 = this.zzb;
                                                                            if (i20 < i19) {
                                                                                if (zzmpVarArr8[i20].zzp(zzm4)) {
                                                                                    zzay(i20);
                                                                                }
                                                                                i20++;
                                                                                i19 = 2;
                                                                            } else {
                                                                                zzmd zzmdVar = this.zzG;
                                                                                if (!zzmdVar.zzg && zzmdVar.zzr < 500000 && zzaF(zzlqVar5.zzk()) && zzax()) {
                                                                                    if (this.zzY == j3) {
                                                                                        this.zzY = SystemClock.elapsedRealtime();
                                                                                    } else if (SystemClock.elapsedRealtime() - this.zzY >= 4000) {
                                                                                        throw new zzfb(0, 4000);
                                                                                    }
                                                                                    boolean z10 = !zzax() && this.zzG.zze == 3;
                                                                                    boolean z11 = this.zzG.zzp;
                                                                                    i3 = this.zzG.zze;
                                                                                    if (i3 != 4 && (z10 || i3 == 2 || (i3 == 3 && this.zzR != 0))) {
                                                                                        zzQ(j14);
                                                                                    }
                                                                                    Trace.endSection();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    this.zzY = j3;
                                                                    if (zzax()) {
                                                                    }
                                                                    boolean z112 = this.zzG.zzp;
                                                                    i3 = this.zzG.zze;
                                                                    if (i3 != 4) {
                                                                        zzQ(j14);
                                                                    }
                                                                    Trace.endSection();
                                                                }
                                                            }
                                                            zzmd zzmdVar2 = this.zzG;
                                                            if (zzmdVar2.zze == 2) {
                                                                if (this.zzR == 0) {
                                                                    zzi = zzae();
                                                                    break;
                                                                } else if (z4) {
                                                                    if (zzmdVar2.zzg) {
                                                                        zzln zzm5 = zzlqVar5.zzm();
                                                                        long zze = zzP(this.zzG.zza, zzm5.zzg.zza) ? this.zzad.zze() : j3;
                                                                        zzln zzk = zzlqVar5.zzk();
                                                                        boolean z12 = zzk.zzd() && zzk.zzg.zzj;
                                                                        boolean z13 = zzk.zzg.zza.zzb() && !zzk.zze;
                                                                        if (!z12 && !z13) {
                                                                            zzi = this.zzg.zzi(new zzli(this.zzv, this.zzG.zza, zzm5.zzg.zza, this.zzT - zzm5.zza(), zzau(zzk.zzf()), this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zze, this.zzM));
                                                                            break;
                                                                        }
                                                                    }
                                                                    zzB(3);
                                                                    this.zzX = zziwVar2;
                                                                    if (zzax()) {
                                                                        zzaC(false, false);
                                                                        this.zzo.zza();
                                                                        zzJ();
                                                                    }
                                                                    int i192 = 2;
                                                                    if (this.zzG.zze == 2) {
                                                                    }
                                                                    this.zzY = j3;
                                                                    if (zzax()) {
                                                                    }
                                                                    boolean z1122 = this.zzG.zzp;
                                                                    i3 = this.zzG.zze;
                                                                    if (i3 != 4) {
                                                                    }
                                                                    Trace.endSection();
                                                                }
                                                            }
                                                            if (this.zzG.zze == 3) {
                                                                if (this.zzR == 0) {
                                                                    if (!zzae()) {
                                                                        zzaC(zzax(), false);
                                                                        zzB(2);
                                                                        if (this.zzL) {
                                                                            for (zzln zzm6 = zzlqVar5.zzm(); zzm6 != null; zzm6 = zzm6.zzp()) {
                                                                                for (zzaac zzaacVar : zzm6.zzr().zzc) {
                                                                                }
                                                                            }
                                                                            this.zzad.zzc();
                                                                        }
                                                                        zzK();
                                                                    }
                                                                }
                                                            }
                                                            int i1922 = 2;
                                                            if (this.zzG.zze == 2) {
                                                            }
                                                            this.zzY = j3;
                                                            if (zzax()) {
                                                            }
                                                            boolean z11222 = this.zzG.zzp;
                                                            i3 = this.zzG.zze;
                                                            if (i3 != 4) {
                                                            }
                                                            Trace.endSection();
                                                        }
                                                    }
                                                    z = true;
                                                }
                                                zzC();
                                                return z;
                                            }
                                            i4 = 1;
                                            zzlqVar = zzlqVar2;
                                            zzn3 = zzlqVar.zzn();
                                            if (zzn3 != null) {
                                                zzn4 = zzlqVar.zzn();
                                                zzr2 = zzn4.zzr();
                                                i7 = i4;
                                                i8 = 0;
                                                while (true) {
                                                    zzmpVarArr = this.zzb;
                                                    if (i8 >= 2) {
                                                    }
                                                    int zzd2 = zzmpVarArr[i8].zzd();
                                                    int zzH2 = zzmpVarArr[i8].zzH(zzn4, zzr2, this.zzo);
                                                    this.zzR -= zzd2 - zzmpVarArr[i8].zzd();
                                                    i7 &= zzH2 & 1;
                                                    i8++;
                                                }
                                            }
                                            z6 = false;
                                            while (zzax()) {
                                                if (z6) {
                                                }
                                                this.zzab = false;
                                                zzr = zzlqVar.zzr();
                                                if (zzr != null) {
                                                }
                                            }
                                            zziwVar2 = null;
                                            long j132 = this.zzZ.zzb;
                                            i2 = this.zzG.zze;
                                            z = true;
                                            if (i2 != 1) {
                                            }
                                            zzC();
                                            return z;
                                        }
                                        if (zzr3.zza(i11) && zzmpVarArr2[i11].zza() && !zzmpVarArr2[i11].zzc()) {
                                            zzmpVarArr2[i11].zzb();
                                            j7 = j9;
                                            str5 = str6;
                                            j6 = j10;
                                            zzar(zzo3, i11, false, zzo3.zzc());
                                        } else {
                                            j6 = j10;
                                            j7 = j9;
                                            str5 = str6;
                                        }
                                        i11++;
                                        str6 = str5;
                                        j9 = j7;
                                        j10 = j6;
                                    }
                                } else {
                                    j = uptimeMillis;
                                }
                            }
                            j5 = 10000000;
                            str4 = "ExoPlayerImplInternal";
                            j2 = -9223372036854775807L;
                            zzn2 = zzlqVar2.zzn();
                            if (zzn2 != null) {
                            }
                            i4 = 1;
                            zzlqVar = zzlqVar2;
                            zzn3 = zzlqVar.zzn();
                            if (zzn3 != null) {
                            }
                            z6 = false;
                            while (zzax()) {
                            }
                            zziwVar2 = null;
                            long j1322 = this.zzZ.zzb;
                            i2 = this.zzG.zze;
                            z = true;
                            if (i2 != 1) {
                            }
                            zzC();
                            return z;
                        }
                    }
                    str = "Playback error";
                    if (this.zzN) {
                    }
                    long j92 = 10000000;
                    if (this.zzK) {
                    }
                    j = uptimeMillis;
                    j5 = 10000000;
                    str4 = "ExoPlayerImplInternal";
                    j2 = -9223372036854775807L;
                    zzn2 = zzlqVar2.zzn();
                    if (zzn2 != null) {
                    }
                    i4 = 1;
                    zzlqVar = zzlqVar2;
                    zzn3 = zzlqVar.zzn();
                    if (zzn3 != null) {
                    }
                    z6 = false;
                    while (zzax()) {
                    }
                    zziwVar2 = null;
                    long j13222 = this.zzZ.zzb;
                    i2 = this.zzG.zze;
                    z = true;
                    if (i2 != 1) {
                    }
                    zzC();
                    return z;
                }
                j = uptimeMillis;
                zziwVar2 = null;
                j2 = -9223372036854775807L;
                i2 = this.zzG.zze;
                z = true;
                if (i2 != 1) {
                }
                zzC();
                return z;
            case 3:
                z2 = true;
                zzR((zzle) message.obj);
                z = z2;
                zzC();
                return z;
            case 4:
                z2 = true;
                zzM((zzav) message.obj);
                zzak(this.zzo.zzj(), true);
                z = z2;
                zzC();
                return z;
            case 5:
                z2 = true;
                this.zzA = (zzmt) message.obj;
                z = z2;
                zzC();
                return z;
            case 6:
                z2 = true;
                zzW(false, true);
                z = z2;
                zzC();
                return z;
            case 7:
                zzdq zzdqVar = (zzdq) message.obj;
                try {
                    zzX(true, false, true, false);
                    int i21 = 0;
                    while (true) {
                        zzmp[] zzmpVarArr9 = this.zzb;
                        if (i21 >= 2) {
                            this.zzg.zzd(this.zzv);
                            this.zzz.zzd();
                            this.zze.zzb();
                            zzB(1);
                            return true;
                        }
                        this.zzc[i21].zzw();
                        zzmpVarArr9[i21].zzI();
                        i21++;
                    }
                } finally {
                    this.zzi.zzm(null);
                    this.zzj.zzb();
                    zzdqVar.zza();
                }
            case 8:
                try {
                    zzwi zzwiVar = (zzwi) message.obj;
                    zzlq zzlqVar6 = this.zzs;
                    if (zzlqVar6.zzd(zzwiVar)) {
                        zzln zzk2 = zzlqVar6.zzk();
                        if (zzk2 == null) {
                            throw null;
                        }
                        zzln zzlnVar2 = zzk2;
                        if (!zzk2.zze) {
                            float f = this.zzo.zzj().zzb;
                            zzmd zzmdVar3 = this.zzG;
                            zzk2.zzh(f, zzmdVar3.zza, zzmdVar3.zzl);
                        }
                        zzaw(zzk2.zzg.zza, zzk2.zzq(), zzk2.zzr());
                        if (zzk2 == zzlqVar6.zzm()) {
                            zzU(zzk2.zzg.zzb, true);
                            zzap();
                            zzk2.zzh = true;
                            zzmd zzmdVar4 = this.zzG;
                            try {
                                zzwk zzwkVar6 = zzmdVar4.zzb;
                                long j16 = zzk2.zzg.zzb;
                                z2 = true;
                                this.zzG = zzao(zzwkVar6, j16, zzmdVar4.zzc, j16, false, 5);
                            } catch (zzat e21) {
                                e = e21;
                                zzA(e, e.zzb != 1 ? true != e.zza ? 3003 : AdError.MEDIATION_ERROR_CODE : 1000);
                                z = true;
                                zzC();
                                return z;
                            } catch (zzhc e22) {
                                e = e22;
                                zzA(e, e.zza);
                                z = true;
                                zzC();
                                return z;
                            } catch (zziw e23) {
                                e = e23;
                                str2 = "Playback error";
                                str3 = "ExoPlayerImplInternal";
                                if (e.zzc == 1) {
                                }
                                if (e.zzc == 1) {
                                }
                                zziwVar = this.zzX;
                                if (zziwVar != null) {
                                }
                                if (e.zzc == 1) {
                                }
                                if (e.zzi) {
                                }
                                zzee.zzf(str3, str2, e);
                                z = true;
                                zzW(true, false);
                                this.zzG = this.zzG.zzf(e);
                                zzC();
                                return z;
                            } catch (zztg e24) {
                                e = e24;
                                zzA(e, e.zza);
                                z = true;
                                zzC();
                                return z;
                            } catch (zzvk e25) {
                                e = e25;
                                zzA(e, 1002);
                                z = true;
                                zzC();
                                return z;
                            } catch (IOException e26) {
                                e = e26;
                                zzA(e, AdError.SERVER_ERROR_CODE);
                                z = true;
                                zzC();
                                return z;
                            } catch (RuntimeException e27) {
                                e = e27;
                                str = "Playback error";
                                str4 = str6;
                                zziw zzc32 = zziw.zzc(e, (!(e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) ? 1004 : 1000);
                                zzee.zzf(str4, str, zzc32);
                                zzW(true, false);
                                this.zzG = this.zzG.zzf(zzc32);
                                z = true;
                                zzC();
                                return z;
                            }
                        } else {
                            z2 = true;
                        }
                        zzam();
                    } else {
                        z2 = true;
                        zzln zzu = zzlqVar6.zzu(zzwiVar);
                        if (zzu != null) {
                            zzgrc.zzi(!zzu.zze);
                            float f2 = this.zzo.zzj().zzb;
                            zzmd zzmdVar5 = this.zzG;
                            zzu.zzh(f2, zzmdVar5.zza, zzmdVar5.zzl);
                            if (zzlqVar6.zze(zzwiVar)) {
                                zzai();
                            }
                        }
                    }
                    z = z2;
                } catch (zzat e28) {
                    e = e28;
                } catch (zzhc e29) {
                    e = e29;
                } catch (zziw e30) {
                    e = e30;
                } catch (zztg e31) {
                    e = e31;
                } catch (zzvk e32) {
                    e = e32;
                } catch (IOException e33) {
                    e = e33;
                } catch (RuntimeException e34) {
                    e = e34;
                }
                zzC();
                return z;
            case 9:
                zzwi zzwiVar2 = (zzwi) message.obj;
                zzlq zzlqVar7 = this.zzs;
                if (zzlqVar7.zzd(zzwiVar2)) {
                    zzlqVar7.zzf(this.zzT);
                    zzam();
                } else if (zzlqVar7.zze(zzwiVar2)) {
                    zzai();
                }
                z = true;
                zzC();
                return z;
            case 10:
                zzad();
                z = true;
                zzC();
                return z;
            case 11:
                int i22 = message.arg1;
                this.zzO = i22;
                int zza2 = this.zzs.zza(this.zzG.zza, i22);
                if ((zza2 & 1) != 0) {
                    zzI(true);
                } else if ((zza2 & 2) != 0) {
                    zzab();
                }
                zzas(false);
                z = true;
                zzC();
                return z;
            case 12:
                boolean z14 = message.arg1 != 0;
                this.zzP = z14;
                int zzb = this.zzs.zzb(this.zzG.zza, z14);
                if ((zzb & 1) != 0) {
                    zzI(true);
                } else if ((zzb & 2) != 0) {
                    zzab();
                }
                zzas(false);
                z = true;
                zzC();
                return z;
            case 13:
                boolean z15 = message.arg1 != 0;
                zzdq zzdqVar2 = (zzdq) message.obj;
                if (this.zzQ != z15) {
                    this.zzQ = z15;
                    if (!z15) {
                        zzmp[] zzmpVarArr10 = this.zzb;
                        for (int i23 = 0; i23 < 2; i23++) {
                            zzmpVarArr10[i23].zzG();
                        }
                    }
                }
                if (zzdqVar2 != null) {
                    zzdqVar2.zza();
                }
                z = true;
                zzC();
                return z;
            case 14:
                zzmh zzmhVar = (zzmh) message.obj;
                if (zzmhVar.zzf() == this.zzk) {
                    zzaE(zzmhVar);
                    int i24 = this.zzG.zze;
                    if (i24 == 3 || i24 == 2) {
                        this.zzi.zzh(2);
                    }
                } else {
                    this.zzi.zzd(15, zzmhVar).zza();
                }
                z = true;
                zzC();
                return z;
            case 15:
                final zzmh zzmhVar2 = (zzmh) message.obj;
                Looper zzf = zzmhVar2.zzf();
                if (zzf.getThread().isAlive()) {
                    this.zzq.zzd(zzf, null).zzn(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzkx
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzlf.zzz(zzmhVar2);
                        }
                    });
                } else {
                    zzee.zzc("TAG", "Trying to send message on a dead thread.");
                    zzmhVar2.zzi(false);
                }
                z = true;
                zzC();
                return z;
            case 16:
                zzak((zzav) message.obj, false);
                z = true;
                zzC();
                return z;
            case 17:
                zzkz zzkzVar = (zzkz) message.obj;
                this.zzH.zza(1);
                if (zzkzVar.zzb() != -1) {
                    this.zzS = new zzle(new zzmj(zzkzVar.zza(), zzkzVar.zzd()), zzkzVar.zzb(), zzkzVar.zzc());
                }
                zzaf(this.zzt.zzl(zzkzVar.zza(), zzkzVar.zzd()), false);
                z = true;
                zzC();
                return z;
            case 18:
                zzkz zzkzVar2 = (zzkz) message.obj;
                int i25 = message.arg1;
                this.zzH.zza(1);
                zzmc zzmcVar = this.zzt;
                if (i25 == -1) {
                    i25 = zzmcVar.zzc();
                }
                zzaf(zzmcVar.zzm(i25, zzkzVar2.zza(), zzkzVar2.zzd()), false);
                z = true;
                zzC();
                return z;
            case 19:
                zzla zzlaVar = (zzla) message.obj;
                this.zzH.zza(1);
                zzmc zzmcVar2 = this.zzt;
                int i26 = zzlaVar.zza;
                int i27 = zzlaVar.zzb;
                int i28 = zzlaVar.zzc;
                zzyf zzyfVar = zzlaVar.zzd;
                zzaf(zzmcVar2.zzo(0, 0, 0, null), false);
                z = true;
                zzC();
                return z;
            case 20:
                int i29 = message.arg1;
                int i30 = message.arg2;
                zzyf zzyfVar2 = (zzyf) message.obj;
                this.zzH.zza(1);
                zzaf(this.zzt.zzn(i29, i30, zzyfVar2), false);
                z = true;
                zzC();
                return z;
            case 21:
                zzyf zzyfVar3 = (zzyf) message.obj;
                this.zzH.zza(1);
                zzaf(this.zzt.zzp(zzyfVar3), false);
                z = true;
                zzC();
                return z;
            case 22:
                zzaf(this.zzt.zzh(), true);
                z = true;
                zzC();
                return z;
            case 23:
                this.zzJ = message.arg1 != 0;
                zzaj();
                if (this.zzK) {
                    zzlq zzlqVar8 = this.zzs;
                    if (zzlqVar8.zzn() != zzlqVar8.zzm()) {
                        zzI(true);
                        zzas(false);
                    }
                }
                z = true;
                zzC();
                return z;
            case 24:
            default:
                return false;
            case 25:
                zzac();
                z = true;
                zzC();
                return z;
            case 26:
                zzac();
                z = true;
                zzC();
                return z;
            case 27:
                int i31 = message.arg1;
                int i32 = message.arg2;
                List list = (List) message.obj;
                this.zzH.zza(1);
                zzaf(this.zzt.zza(i31, i32, list), false);
                z = true;
                zzC();
                return z;
            case 28:
                zzjg zzjgVar = (zzjg) message.obj;
                this.zzZ = zzjgVar;
                this.zzs.zzc(this.zzG.zza, zzjgVar);
                z = true;
                zzC();
                return z;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                this.zzH.zza(1);
                zzX(false, false, false, true);
                this.zzg.zza(this.zzv);
                zzB(true != this.zzG.zza.zzg() ? 2 : 4);
                zzF();
                this.zzt.zzd(this.zzh.zze());
                this.zzi.zzh(2);
                z = true;
                zzC();
                return z;
            case 30:
                Pair pair = (Pair) message.obj;
                Object obj = pair.first;
                zzdq zzdqVar3 = (zzdq) pair.second;
                zzmp[] zzmpVarArr11 = this.zzb;
                for (int i33 = 0; i33 < 2; i33++) {
                    zzmpVarArr11[i33].zzJ(obj);
                }
                int i34 = this.zzG.zze;
                if (i34 == 3 || i34 == 2) {
                    this.zzi.zzh(2);
                }
                if (zzdqVar3 != null) {
                    zzdqVar3.zza();
                }
                z = true;
                zzC();
                return z;
            case 31:
                zzd zzdVar2 = (zzd) message.obj;
                int i35 = message.arg1;
                this.zze.zze(zzdVar2);
                zzcd zzcdVar = this.zzz;
                if (i35 != 0) {
                    zzdVar = zzdVar2;
                }
                zzcdVar.zzb(zzdVar);
                zzF();
                z = true;
                zzC();
                return z;
            case 32:
                zzD(((Float) message.obj).floatValue());
                z = true;
                zzC();
                return z;
            case 33:
                int i36 = message.arg1;
                zzmd zzmdVar6 = this.zzG;
                zzH(zzmdVar6.zzl, i36, zzmdVar6.zzn, zzmdVar6.zzm);
                z = true;
                zzC();
                return z;
            case 34:
                zzD(this.zzac);
                z = true;
                zzC();
                return z;
            case 35:
                zzacp zzacpVar = (zzacp) message.obj;
                zzmp[] zzmpVarArr12 = this.zzb;
                for (int i37 = 0; i37 < 2; i37++) {
                    zzmpVarArr12[i37].zzK(zzacpVar);
                }
                z = true;
                zzC();
                return z;
            case 36:
                boolean booleanValue = ((Boolean) message.obj).booleanValue();
                if (!booleanValue) {
                    if (this.zzE != null && this.zzD && !this.zzi.zzb(37)) {
                        this.zzF++;
                    }
                    final int i38 = this.zzF;
                    if (i38 > 0) {
                        this.zzx.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkw
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzlf.this.zzv(i38);
                            }
                        });
                    }
                    this.zzF = 0;
                    this.zzD = false;
                    this.zzi.zzk(37);
                    zzle zzleVar = this.zzE;
                    if (zzleVar != null) {
                        zzR(zzleVar);
                        this.zzE = null;
                        this.zzD = false;
                    }
                }
                this.zzC = booleanValue;
                zzV();
                z = true;
                zzC();
                return z;
            case 37:
                this.zzD = false;
                zzle zzleVar2 = this.zzE;
                if (zzleVar2 != null) {
                    zzR(zzleVar2);
                    this.zzE = null;
                }
                z = true;
                zzC();
                return z;
            case 38:
                this.zzB = (zzms) message.obj;
                zzV();
                z = true;
                zzC();
                return z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(float f) {
        this.zzi.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zzb(int i) {
        this.zzi.zze(33, i, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzit
    public final void zzc(zzav zzavVar) {
        this.zzi.zzd(16, zzavVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzacp
    public final void zzcS(long j, long j2, zzv zzvVar, MediaFormat mediaFormat) {
        if (this.zzD) {
            this.zzi.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzi.zzc(29).zza();
    }

    public final void zze(boolean z, int i, int i2) {
        this.zzi.zze(1, z ? 1 : 0, (i2 << 4) | 1).zza();
    }

    public final void zzf(zzbf zzbfVar, int i, long j) {
        this.zzi.zzd(3, new zzle(zzbfVar, i, j)).zza();
    }

    public final void zzg(zzms zzmsVar) {
        this.zzi.zzd(38, zzmsVar).zza();
    }

    public final void zzh() {
        this.zzi.zzc(6).zza();
    }

    public final void zzi(zzd zzdVar, boolean z) {
        this.zzi.zzf(31, 0, 0, zzdVar).zza();
    }

    public final void zzj(float f) {
        this.zzi.zzd(32, Float.valueOf(f)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzk(zzmh zzmhVar) {
        if (!this.zzI && this.zzk.getThread().isAlive()) {
            this.zzi.zzd(14, zzmhVar).zza();
        } else {
            zzee.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzmhVar.zzi(false);
        }
    }

    public final boolean zzl(Object obj, long j) {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        zzdq zzdqVar = new zzdq(this.zzq);
        this.zzi.zzd(30, new Pair(obj, zzdqVar)).zza();
        if (j != -9223372036854775807L) {
            return zzdqVar.zze(j);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzI = true;
        zzdq zzdqVar = new zzdq(this.zzq);
        this.zzi.zzd(7, zzdqVar).zza();
        return zzdqVar.zze(this.zzu);
    }

    public final Looper zzn() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzo() {
        zzdx zzdxVar = this.zzi;
        zzdxVar.zzk(2);
        zzdxVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzp(zzwi zzwiVar) {
        this.zzi.zzd(8, zzwiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final void zzq() {
        this.zzi.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final /* bridge */ /* synthetic */ void zzs(zzye zzyeVar) {
        this.zzi.zzd(9, (zzwi) zzyeVar).zza();
    }

    final /* synthetic */ zzln zzt(zzlo zzloVar, long j) {
        zzaan zze = this.zzg.zze(this.zzv);
        long j2 = this.zzZ.zzb;
        zzaak zzaakVar = this.zzf;
        zzmc zzmcVar = this.zzt;
        return new zzln(this.zzc, j, this.zze, zze, zzmcVar, zzloVar, zzaakVar, -9223372036854775807L);
    }

    final /* synthetic */ void zzu(int i, boolean z) {
        this.zzw.zzB(i, this.zzb[i].zze(), z);
    }

    final /* synthetic */ void zzv(int i) {
        this.zzw.zzW(i);
    }

    final /* synthetic */ zzdx zzx() {
        return this.zzi;
    }

    public final void zzy(List list, int i, long j, zzyf zzyfVar) {
        this.zzi.zzd(17, new zzkz(list, zzyfVar, i, j, null)).zza();
    }
}

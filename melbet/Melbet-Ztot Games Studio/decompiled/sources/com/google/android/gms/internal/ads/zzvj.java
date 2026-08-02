package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzvj implements zzug, zzacn, zzyp, zzyu, zzvv {
    private static final Map zzb;
    private static final zzaf zzc;
    private zzadi zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzE;
    private boolean zzF;
    private int zzG;
    private boolean zzH;
    private long zzI;
    private boolean zzK;
    private int zzL;
    private boolean zzM;
    private boolean zzN;
    private final zzyk zzO;
    private final Uri zzd;
    private final zzfs zze;
    private final zzri zzf;
    private final zzur zzg;
    private final zzrd zzh;
    private final zzvf zzi;
    private final long zzj;
    private final long zzk;
    private final zzuy zzm;
    private zzuf zzr;
    private zzafn zzs;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private zzvi zzz;
    private final zzyx zzl = new zzyx("ProgressiveMediaPeriod");
    private final zzdm zzn = new zzdm(zzdj.zza);
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzva
        @Override // java.lang.Runnable
        public final void run() {
            zzvj.this.zzU();
        }
    };
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvb
        @Override // java.lang.Runnable
        public final void run() {
            zzvj.this.zzE();
        }
    };
    private final Handler zzq = zzet.zzx(null);
    private zzvh[] zzu = new zzvh[0];
    private zzvw[] zzt = new zzvw[0];
    private long zzJ = -9223372036854775807L;
    private int zzD = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzad zzadVar = new zzad();
        zzadVar.zzK("icy");
        zzadVar.zzX("application/x-icy");
        zzc = zzadVar.zzad();
    }

    public zzvj(Uri uri, zzfs zzfsVar, zzuy zzuyVar, zzri zzriVar, zzrd zzrdVar, zzyo zzyoVar, zzur zzurVar, zzvf zzvfVar, zzyk zzykVar, String str, int i, long j) {
        this.zzd = uri;
        this.zze = zzfsVar;
        this.zzf = zzriVar;
        this.zzh = zzrdVar;
        this.zzg = zzurVar;
        this.zzi = zzvfVar;
        this.zzO = zzykVar;
        this.zzj = i;
        this.zzm = zzuyVar;
        this.zzk = j;
    }

    static /* bridge */ /* synthetic */ void zzC(final zzvj zzvjVar) {
        zzvjVar.zzq.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzuz
            @Override // java.lang.Runnable
            public final void run() {
                zzvj.this.zzF();
            }
        });
    }

    private final int zzQ() {
        int i = 0;
        for (zzvw zzvwVar : this.zzt) {
            i += zzvwVar.zzd();
        }
        return i;
    }

    private final long zzR(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (true) {
            zzvw[] zzvwVarArr = this.zzt;
            if (i >= zzvwVarArr.length) {
                return j;
            }
            if (!z) {
                zzvi zzviVar = this.zzz;
                zzviVar.getClass();
                i = zzviVar.zzc[i] ? 0 : i + 1;
            }
            j = Math.max(j, zzvwVarArr[i].zzh());
        }
    }

    private final zzadp zzS(zzvh zzvhVar) {
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            if (zzvhVar.equals(this.zzu[i])) {
                return this.zzt[i];
            }
        }
        zzvw zzvwVar = new zzvw(this.zzO, this.zzf, this.zzh);
        zzvwVar.zzu(this);
        int i2 = length + 1;
        zzvh[] zzvhVarArr = (zzvh[]) Arrays.copyOf(this.zzu, i2);
        zzvhVarArr[length] = zzvhVar;
        int i3 = zzet.zza;
        this.zzu = zzvhVarArr;
        zzvw[] zzvwVarArr = (zzvw[]) Arrays.copyOf(this.zzt, i2);
        zzvwVarArr[length] = zzvwVar;
        this.zzt = zzvwVarArr;
        return zzvwVar;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzT() {
        zzdi.zzf(this.zzw);
        this.zzz.getClass();
        this.zzA.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU() {
        int i;
        if (this.zzN || this.zzw || !this.zzv || this.zzA == null) {
            return;
        }
        for (zzvw zzvwVar : this.zzt) {
            if (zzvwVar.zzi() == null) {
                return;
            }
        }
        this.zzn.zzc();
        int length = this.zzt.length;
        zzcd[] zzcdVarArr = new zzcd[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzaf zzi = this.zzt[i2].zzi();
            zzi.getClass();
            String str = zzi.zzm;
            boolean zzg = zzbn.zzg(str);
            boolean z = zzg || zzbn.zzi(str);
            zArr[i2] = z;
            this.zzx = z | this.zzx;
            this.zzy = this.zzk != -9223372036854775807L && length == 1 && zzbn.zzh(str);
            zzafn zzafnVar = this.zzs;
            if (zzafnVar != null) {
                if (zzg || this.zzu[i2].zzb) {
                    zzbk zzbkVar = zzi.zzk;
                    zzbk zzbkVar2 = zzbkVar == null ? new zzbk(-9223372036854775807L, zzafnVar) : zzbkVar.zzc(zzafnVar);
                    zzad zzb2 = zzi.zzb();
                    zzb2.zzQ(zzbkVar2);
                    zzi = zzb2.zzad();
                }
                if (zzg && zzi.zzg == -1 && zzi.zzh == -1 && (i = zzafnVar.zza) != -1) {
                    zzad zzb3 = zzi.zzb();
                    zzb3.zzx(i);
                    zzi = zzb3.zzad();
                }
            }
            zzcdVarArr[i2] = new zzcd(Integer.toString(i2), zzi.zzc(this.zzf.zza(zzi)));
        }
        this.zzz = new zzvi(new zzwi(zzcdVarArr), zArr);
        if (this.zzy && this.zzB == -9223372036854775807L) {
            this.zzB = this.zzk;
            this.zzA = new zzvd(this, this.zzA);
        }
        this.zzi.zza(this.zzB, this.zzA.zzh(), this.zzC);
        this.zzw = true;
        zzuf zzufVar = this.zzr;
        zzufVar.getClass();
        zzufVar.zzh(this);
    }

    private final void zzV(int i) {
        zzT();
        zzvi zzviVar = this.zzz;
        boolean[] zArr = zzviVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzaf zzb2 = zzviVar.zza.zzb(i).zzb(0);
        this.zzg.zzc(new zzue(1, zzbn.zzb(zzb2.zzm), zzb2, 0, null, zzet.zzu(this.zzI), -9223372036854775807L));
        zArr[i] = true;
    }

    private final void zzW(int i) {
        zzT();
        boolean[] zArr = this.zzz.zzb;
        if (this.zzK && zArr[i] && !this.zzt[i].zzx(false)) {
            this.zzJ = 0L;
            this.zzK = false;
            this.zzF = true;
            this.zzI = 0L;
            this.zzL = 0;
            for (zzvw zzvwVar : this.zzt) {
                zzvwVar.zzp(false);
            }
            zzuf zzufVar = this.zzr;
            zzufVar.getClass();
            zzufVar.zzf(this);
        }
    }

    private final void zzX() {
        zzfy zzfyVar;
        long j;
        long j2;
        zzve zzveVar = new zzve(this, this.zzd, this.zze, this.zzm, this, this.zzn);
        if (this.zzw) {
            zzdi.zzf(zzY());
            long j3 = this.zzB;
            if (j3 != -9223372036854775807L && this.zzJ > j3) {
                this.zzM = true;
                this.zzJ = -9223372036854775807L;
                return;
            }
            zzadi zzadiVar = this.zzA;
            zzadiVar.getClass();
            zzve.zzf(zzveVar, zzadiVar.zzg(this.zzJ).zza.zzc, this.zzJ);
            for (zzvw zzvwVar : this.zzt) {
                zzvwVar.zzt(this.zzJ);
            }
            this.zzJ = -9223372036854775807L;
        }
        this.zzL = zzQ();
        long zza = this.zzl.zza(zzveVar, this, zzyo.zza(this.zzD));
        zzfyVar = zzveVar.zzl;
        zzur zzurVar = this.zzg;
        j = zzveVar.zzb;
        zztz zztzVar = new zztz(j, zzfyVar, zza);
        j2 = zzveVar.zzk;
        zzurVar.zzg(zztzVar, new zzue(1, -1, null, 0, null, zzet.zzu(j2), zzet.zzu(this.zzB)));
    }

    private final boolean zzY() {
        return this.zzJ != -9223372036854775807L;
    }

    private final boolean zzZ() {
        return this.zzF || zzY();
    }

    static /* bridge */ /* synthetic */ long zzr(zzvj zzvjVar, boolean z) {
        return zzvjVar.zzR(true);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzD() {
        this.zzv = true;
        this.zzq.post(this.zzo);
    }

    final /* synthetic */ void zzF() {
        this.zzH = true;
    }

    final void zzH() throws IOException {
        this.zzl.zzi(zzyo.zza(this.zzD));
    }

    final void zzI(int i) throws IOException {
        this.zzt[i].zzm();
        zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final /* bridge */ /* synthetic */ void zzJ(zzyt zzytVar, long j, long j2, boolean z) {
        zzgt zzgtVar;
        long j3;
        zzfy zzfyVar;
        long j4;
        long unused;
        zzve zzveVar = (zzve) zzytVar;
        zzgtVar = zzveVar.zzd;
        j3 = zzveVar.zzb;
        zzfyVar = zzveVar.zzl;
        zztz zztzVar = new zztz(j3, zzfyVar, zzgtVar.zzh(), zzgtVar.zzi(), j, j2, zzgtVar.zzg());
        unused = zzveVar.zzb;
        j4 = zzveVar.zzk;
        this.zzg.zzd(zztzVar, new zzue(1, -1, null, 0, null, zzet.zzu(j4), zzet.zzu(this.zzB)));
        if (z) {
            return;
        }
        for (zzvw zzvwVar : this.zzt) {
            zzvwVar.zzp(false);
        }
        if (this.zzG > 0) {
            zzuf zzufVar = this.zzr;
            zzufVar.getClass();
            zzufVar.zzf(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final /* bridge */ /* synthetic */ void zzK(zzyt zzytVar, long j, long j2) {
        zzgt zzgtVar;
        long j3;
        zzfy zzfyVar;
        long j4;
        zzadi zzadiVar;
        long unused;
        if (this.zzB == -9223372036854775807L && (zzadiVar = this.zzA) != null) {
            boolean zzh = zzadiVar.zzh();
            long zzR = zzR(true);
            long j5 = zzR == Long.MIN_VALUE ? 0L : zzR + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzB = j5;
            this.zzi.zza(j5, zzh, this.zzC);
        }
        zzve zzveVar = (zzve) zzytVar;
        zzgtVar = zzveVar.zzd;
        j3 = zzveVar.zzb;
        zzfyVar = zzveVar.zzl;
        zztz zztzVar = new zztz(j3, zzfyVar, zzgtVar.zzh(), zzgtVar.zzi(), j, j2, zzgtVar.zzg());
        unused = zzveVar.zzb;
        zzur zzurVar = this.zzg;
        j4 = zzveVar.zzk;
        zzurVar.zze(zztzVar, new zzue(1, -1, null, 0, null, zzet.zzu(j4), zzet.zzu(this.zzB)));
        this.zzM = true;
        zzuf zzufVar = this.zzr;
        zzufVar.getClass();
        zzufVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zzL() {
        for (zzvw zzvwVar : this.zzt) {
            zzvwVar.zzo();
        }
        this.zzm.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzvv
    public final void zzM(zzaf zzafVar) {
        this.zzq.post(this.zzo);
    }

    public final void zzN() {
        if (this.zzw) {
            for (zzvw zzvwVar : this.zzt) {
                zzvwVar.zzn();
            }
        }
        this.zzl.zzj(this);
        this.zzq.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzN = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzO(final zzadi zzadiVar) {
        this.zzq.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvc
            @Override // java.lang.Runnable
            public final void run() {
                zzvj.this.zzG(zzadiVar);
            }
        });
    }

    final boolean zzP(int i) {
        return !zzZ() && this.zzt[i].zzx(this.zzM);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zza(long j, zzlj zzljVar) {
        zzT();
        if (!this.zzA.zzh()) {
            return 0L;
        }
        zzadg zzg = this.zzA.zzg(j);
        zzadj zzadjVar = zzg.zza;
        zzadj zzadjVar2 = zzg.zzb;
        long j2 = zzljVar.zzc;
        if (j2 == 0) {
            if (zzljVar.zzd == 0) {
                return j;
            }
            j2 = 0;
        }
        long j3 = zzadjVar.zzb;
        int i = zzet.zza;
        long j4 = j - j2;
        long j5 = zzljVar.zzd;
        long j6 = j + j5;
        long j7 = j ^ j6;
        long j8 = j5 ^ j6;
        if (((j ^ j2) & (j ^ j4)) < 0) {
            j4 = Long.MIN_VALUE;
        }
        if ((j7 & j8) < 0) {
            j6 = Long.MAX_VALUE;
        }
        boolean z = j4 <= j3 && j3 <= j6;
        long j9 = zzadjVar2.zzb;
        boolean z2 = j4 <= j9 && j9 <= j6;
        if (z && z2) {
            if (Math.abs(j3 - j) > Math.abs(j9 - j)) {
                return j9;
            }
        } else if (!z) {
            return z2 ? j9 : j4;
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final long zzb() {
        long j;
        zzT();
        if (this.zzM || this.zzG == 0) {
            return Long.MIN_VALUE;
        }
        if (zzY()) {
            return this.zzJ;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzvi zzviVar = this.zzz;
                if (zzviVar.zzb[i] && zzviVar.zzc[i] && !this.zzt[i].zzw()) {
                    j = Math.min(j, this.zzt[i].zzh());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = zzR(false);
        }
        return j == Long.MIN_VALUE ? this.zzI : j;
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zzd() {
        if (!this.zzF) {
            return -9223372036854775807L;
        }
        if (!this.zzM && zzQ() <= this.zzL) {
            return -9223372036854775807L;
        }
        this.zzF = false;
        return this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final long zze(long j) {
        int i;
        zzT();
        boolean[] zArr = this.zzz.zzb;
        if (true != this.zzA.zzh()) {
            j = 0;
        }
        this.zzF = false;
        this.zzI = j;
        if (zzY()) {
            this.zzJ = j;
            return j;
        }
        if (this.zzD != 7) {
            int length = this.zzt.length;
            while (i < length) {
                zzvw zzvwVar = this.zzt[i];
                i = ((this.zzy ? zzvwVar.zzy(zzvwVar.zza()) : zzvwVar.zzz(j, false)) || (!zArr[i] && this.zzx)) ? i + 1 : 0;
            }
            return j;
        }
        this.zzK = false;
        this.zzJ = j;
        this.zzM = false;
        zzyx zzyxVar = this.zzl;
        if (zzyxVar.zzl()) {
            for (zzvw zzvwVar2 : this.zzt) {
                zzvwVar2.zzk();
            }
            this.zzl.zzg();
        } else {
            zzyxVar.zzh();
            for (zzvw zzvwVar3 : this.zzt) {
                zzvwVar3.zzp(false);
            }
        }
        return j;
    }

    final int zzf(int i, zzjz zzjzVar, zzhd zzhdVar, int i2) {
        if (zzZ()) {
            return -3;
        }
        zzV(i);
        int zze = this.zzt[i].zze(zzjzVar, zzhdVar, i2, this.zzM);
        if (zze == -3) {
            zzW(i);
        }
        return zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r2 == 0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    @Override // com.google.android.gms.internal.ads.zzug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzg(zzxv[] zzxvVarArr, boolean[] zArr, zzvx[] zzvxVarArr, boolean[] zArr2, long j) {
        boolean z;
        int i;
        zzxv zzxvVar;
        int i2;
        zzT();
        zzvi zzviVar = this.zzz;
        zzwi zzwiVar = zzviVar.zza;
        boolean[] zArr3 = zzviVar.zzc;
        int i3 = this.zzG;
        int i4 = 0;
        for (int i5 = 0; i5 < zzxvVarArr.length; i5++) {
            zzvx zzvxVar = zzvxVarArr[i5];
            if (zzvxVar != null && (zzxvVarArr[i5] == null || !zArr[i5])) {
                i2 = ((zzvg) zzvxVar).zzb;
                zzdi.zzf(zArr3[i2]);
                this.zzG--;
                zArr3[i2] = false;
                zzvxVarArr[i5] = null;
            }
        }
        if (!this.zzy) {
            if (!this.zzE) {
                if (j == 0) {
                    j = 0;
                }
                z = true;
            }
            for (i = 0; i < zzxvVarArr.length; i++) {
                if (zzvxVarArr[i] == null && (zzxvVar = zzxvVarArr[i]) != null) {
                    zzdi.zzf(zzxvVar.zzc() == 1);
                    zzdi.zzf(zzxvVar.zza(0) == 0);
                    int zza = zzwiVar.zza(zzxvVar.zze());
                    zzdi.zzf(!zArr3[zza]);
                    this.zzG++;
                    zArr3[zza] = true;
                    zzvxVarArr[i] = new zzvg(this, zza);
                    zArr2[i] = true;
                    if (!z) {
                        zzvw zzvwVar = this.zzt[zza];
                        z = (zzvwVar.zzb() == 0 || zzvwVar.zzz(j, true)) ? false : true;
                    }
                }
            }
            if (this.zzG != 0) {
                this.zzK = false;
                this.zzF = false;
                if (this.zzl.zzl()) {
                    zzvw[] zzvwVarArr = this.zzt;
                    int length = zzvwVarArr.length;
                    while (i4 < length) {
                        zzvwVarArr[i4].zzk();
                        i4++;
                    }
                    this.zzl.zzg();
                } else {
                    for (zzvw zzvwVar2 : this.zzt) {
                        zzvwVar2.zzp(false);
                    }
                }
            } else if (z) {
                j = zze(j);
                while (i4 < zzvxVarArr.length) {
                    if (zzvxVarArr[i4] != null) {
                        zArr2[i4] = true;
                    }
                    i4++;
                }
            }
            this.zzE = true;
            return j;
        }
        z = false;
        while (i < zzxvVarArr.length) {
        }
        if (this.zzG != 0) {
        }
        this.zzE = true;
        return j;
    }

    final int zzh(int i, long j) {
        if (zzZ()) {
            return 0;
        }
        zzV(i);
        zzvw zzvwVar = this.zzt[i];
        int zzc2 = zzvwVar.zzc(j, this.zzM);
        zzvwVar.zzv(zzc2);
        if (zzc2 != 0) {
            return zzc2;
        }
        zzW(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final zzwi zzi() {
        zzT();
        return this.zzz.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzj(long j, boolean z) {
        if (this.zzy) {
            return;
        }
        zzT();
        if (zzY()) {
            return;
        }
        boolean[] zArr = this.zzz.zzc;
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            this.zzt[i].zzj(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzk() throws IOException {
        zzH();
        if (this.zzM && !this.zzw) {
            throw zzbo.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzl(zzuf zzufVar, long j) {
        this.zzr = zzufVar;
        this.zzn.zze();
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final void zzm(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final boolean zzo(zzkf zzkfVar) {
        if (this.zzM) {
            return false;
        }
        zzyx zzyxVar = this.zzl;
        if (zzyxVar.zzk() || this.zzK) {
            return false;
        }
        if (this.zzw && this.zzG == 0) {
            return false;
        }
        boolean zze = this.zzn.zze();
        if (zzyxVar.zzl()) {
            return zze;
        }
        zzX();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvz
    public final boolean zzp() {
        return this.zzl.zzl() && this.zzn.zzd();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    @Override // com.google.android.gms.internal.ads.zzyp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ zzyr zzu(zzyt zzytVar, long j, long j2, IOException iOException, int i) {
        zzgt zzgtVar;
        long j3;
        zzfy zzfyVar;
        long j4;
        zzyr zzb2;
        zzadi zzadiVar;
        boolean zzc2;
        long j5;
        long unused;
        long unused2;
        zzve zzveVar = (zzve) zzytVar;
        zzgtVar = zzveVar.zzd;
        j3 = zzveVar.zzb;
        zzfyVar = zzveVar.zzl;
        zztz zztzVar = new zztz(j3, zzfyVar, zzgtVar.zzh(), zzgtVar.zzi(), j, j2, zzgtVar.zzg());
        unused = zzveVar.zzk;
        int i2 = zzet.zza;
        if (!(iOException instanceof zzbo) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof zzgk) && !(iOException instanceof zzyw)) {
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof zzft) || ((zzft) th).zza != 2008) {
                }
            }
            j4 = Math.min((i - 1) * 1000, 5000);
            if (j4 != -9223372036854775807L) {
                zzb2 = zzyx.zzb;
            } else {
                int zzQ = zzQ();
                boolean z = zzQ > this.zzL;
                if (this.zzH || !((zzadiVar = this.zzA) == null || zzadiVar.zza() == -9223372036854775807L)) {
                    this.zzL = zzQ;
                } else {
                    boolean z2 = this.zzw;
                    if (!z2 || zzZ()) {
                        this.zzF = z2;
                        this.zzI = 0L;
                        this.zzL = 0;
                        for (zzvw zzvwVar : this.zzt) {
                            zzvwVar.zzp(false);
                        }
                        zzve.zzf(zzveVar, 0L, 0L);
                    } else {
                        this.zzK = true;
                        zzb2 = zzyx.zza;
                    }
                }
                zzb2 = zzyx.zzb(z, j4);
            }
            zzc2 = true ^ zzb2.zzc();
            zzur zzurVar = this.zzg;
            j5 = zzveVar.zzk;
            zzurVar.zzf(zztzVar, new zzue(1, -1, null, 0, null, zzet.zzu(j5), zzet.zzu(this.zzB)), iOException, zzc2);
            if (zzc2) {
                unused2 = zzveVar.zzb;
            }
            return zzb2;
        }
        j4 = -9223372036854775807L;
        if (j4 != -9223372036854775807L) {
        }
        zzc2 = true ^ zzb2.zzc();
        zzur zzurVar2 = this.zzg;
        j5 = zzveVar.zzk;
        zzurVar2.zzf(zztzVar, new zzue(1, -1, null, 0, null, zzet.zzu(j5), zzet.zzu(this.zzB)), iOException, zzc2);
        if (zzc2) {
        }
        return zzb2;
    }

    final zzadp zzv() {
        return zzS(new zzvh(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final zzadp zzw(int i, int i2) {
        return zzS(new zzvh(i, false));
    }

    final /* synthetic */ void zzE() {
        if (this.zzN) {
            return;
        }
        zzuf zzufVar = this.zzr;
        zzufVar.getClass();
        zzufVar.zzf(this);
    }

    final /* synthetic */ void zzG(zzadi zzadiVar) {
        this.zzA = this.zzs == null ? zzadiVar : new zzadh(-9223372036854775807L, 0L);
        this.zzB = zzadiVar.zza();
        boolean z = false;
        if (!this.zzH && zzadiVar.zza() == -9223372036854775807L) {
            z = true;
        }
        this.zzC = z;
        this.zzD = true == z ? 7 : 1;
        if (this.zzw) {
            this.zzi.zza(this.zzB, zzadiVar.zzh(), this.zzC);
        } else {
            zzU();
        }
    }
}

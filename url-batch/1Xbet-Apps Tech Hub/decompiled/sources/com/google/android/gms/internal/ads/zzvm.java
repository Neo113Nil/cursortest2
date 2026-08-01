package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzvm implements zzui, zzach, zzys, zzyx, zzvy {
    private static final Map zzb;
    private static final zzam zzc;
    private long zzA;
    private boolean zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private int zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private boolean zzJ;
    private int zzK;
    private boolean zzL;
    private boolean zzM;
    private final zzyr zzN;
    private final zzyn zzO;
    private final Uri zzd;
    private final zzgq zze;
    private final zzrr zzf;
    private final zzut zzg;
    private final zzrl zzh;
    private final zzvi zzi;
    private final long zzj;
    private final zzza zzk = new zzza("ProgressiveMediaPeriod");
    private final zzvb zzl;
    private final zzei zzm;
    private final Runnable zzn;
    private final Runnable zzo;
    private final Handler zzp;
    private final boolean zzq;
    private zzuh zzr;
    private zzafk zzs;
    private zzvz[] zzt;
    private zzvk[] zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private zzvl zzy;
    private zzade zzz;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzak zzakVar = new zzak();
        zzakVar.zzJ("icy");
        zzakVar.zzU("application/x-icy");
        zzc = zzakVar.zzac();
    }

    public zzvm(Uri uri, zzgq zzgqVar, zzvb zzvbVar, zzrr zzrrVar, zzrl zzrlVar, zzyr zzyrVar, zzut zzutVar, zzvi zzviVar, zzyn zzynVar, String str, int i, long j) {
        this.zzd = uri;
        this.zze = zzgqVar;
        this.zzf = zzrrVar;
        this.zzh = zzrlVar;
        this.zzN = zzyrVar;
        this.zzg = zzutVar;
        this.zzi = zzviVar;
        this.zzO = zzynVar;
        this.zzj = i;
        this.zzl = zzvbVar;
        this.zzA = j;
        this.zzq = j != -9223372036854775807L;
        this.zzm = new zzei(zzeg.zza);
        this.zzn = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvd
            @Override // java.lang.Runnable
            public final void run() {
                zzvm.this.zzU();
            }
        };
        this.zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzve
            @Override // java.lang.Runnable
            public final void run() {
                zzvm.this.zzE();
            }
        };
        this.zzp = zzfs.zzw(null);
        this.zzu = new zzvk[0];
        this.zzt = new zzvz[0];
        this.zzI = -9223372036854775807L;
        this.zzC = 1;
    }

    static /* bridge */ /* synthetic */ void zzC(final zzvm zzvmVar) {
        zzvmVar.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvc
            @Override // java.lang.Runnable
            public final void run() {
                zzvm.this.zzF();
            }
        });
    }

    private final int zzQ() {
        int i = 0;
        for (zzvz zzvzVar : this.zzt) {
            i += zzvzVar.zzd();
        }
        return i;
    }

    private final long zzR(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (true) {
            zzvz[] zzvzVarArr = this.zzt;
            if (i >= zzvzVarArr.length) {
                return j;
            }
            if (!z) {
                zzvl zzvlVar = this.zzy;
                zzvlVar.getClass();
                i = zzvlVar.zzc[i] ? 0 : i + 1;
            }
            j = Math.max(j, zzvzVarArr[i].zzh());
        }
    }

    private final zzadk zzS(zzvk zzvkVar) {
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            if (zzvkVar.equals(this.zzu[i])) {
                return this.zzt[i];
            }
        }
        zzvz zzvzVar = new zzvz(this.zzO, this.zzf, this.zzh);
        zzvzVar.zzv(this);
        int i2 = length + 1;
        zzvk[] zzvkVarArr = (zzvk[]) Arrays.copyOf(this.zzu, i2);
        zzvkVarArr[length] = zzvkVar;
        int i3 = zzfs.zza;
        this.zzu = zzvkVarArr;
        zzvz[] zzvzVarArr = (zzvz[]) Arrays.copyOf(this.zzt, i2);
        zzvzVarArr[length] = zzvzVar;
        this.zzt = zzvzVarArr;
        return zzvzVar;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzT() {
        zzef.zzf(this.zzw);
        this.zzy.getClass();
        this.zzz.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU() {
        int i;
        if (this.zzM || this.zzw || !this.zzv || this.zzz == null) {
            return;
        }
        for (zzvz zzvzVar : this.zzt) {
            if (zzvzVar.zzi() == null) {
                return;
            }
        }
        this.zzm.zzc();
        int length = this.zzt.length;
        zzdc[] zzdcVarArr = new zzdc[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzam zzi = this.zzt[i2].zzi();
            zzi.getClass();
            String str = zzi.zzm;
            boolean zzf = zzce.zzf(str);
            boolean z = zzf || zzce.zzg(str);
            zArr[i2] = z;
            this.zzx = z | this.zzx;
            zzafk zzafkVar = this.zzs;
            if (zzafkVar != null) {
                if (zzf || this.zzu[i2].zzb) {
                    zzcb zzcbVar = zzi.zzk;
                    zzcb zzcbVar2 = zzcbVar == null ? new zzcb(-9223372036854775807L, zzafkVar) : zzcbVar.zzc(zzafkVar);
                    zzak zzb2 = zzi.zzb();
                    zzb2.zzO(zzcbVar2);
                    zzi = zzb2.zzac();
                }
                if (zzf && zzi.zzg == -1 && zzi.zzh == -1 && (i = zzafkVar.zza) != -1) {
                    zzak zzb3 = zzi.zzb();
                    zzb3.zzx(i);
                    zzi = zzb3.zzac();
                }
            }
            zzdcVarArr[i2] = new zzdc(Integer.toString(i2), zzi.zzc(this.zzf.zza(zzi)));
        }
        this.zzy = new zzvl(new zzwl(zzdcVarArr), zArr);
        this.zzw = true;
        zzuh zzuhVar = this.zzr;
        zzuhVar.getClass();
        zzuhVar.zzh(this);
    }

    private final void zzV(int i) {
        zzT();
        zzvl zzvlVar = this.zzy;
        boolean[] zArr = zzvlVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzam zzb2 = zzvlVar.zza.zzb(i).zzb(0);
        this.zzg.zzc(new zzug(1, zzce.zzb(zzb2.zzm), zzb2, 0, null, zzfs.zzt(this.zzH), -9223372036854775807L));
        zArr[i] = true;
    }

    private final void zzW(int i) {
        zzT();
        boolean[] zArr = this.zzy.zzb;
        if (this.zzJ && zArr[i] && !this.zzt[i].zzy(false)) {
            this.zzI = 0L;
            this.zzJ = false;
            this.zzE = true;
            this.zzH = 0L;
            this.zzK = 0;
            for (zzvz zzvzVar : this.zzt) {
                zzvzVar.zzq(false);
            }
            zzuh zzuhVar = this.zzr;
            zzuhVar.getClass();
            zzuhVar.zzf(this);
        }
    }

    private final void zzX() {
        zzgv zzgvVar;
        long j;
        long j2;
        zzvh zzvhVar = new zzvh(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzw) {
            zzef.zzf(zzY());
            long j3 = this.zzA;
            if (j3 != -9223372036854775807L && this.zzI > j3) {
                this.zzL = true;
                this.zzI = -9223372036854775807L;
                return;
            }
            zzade zzadeVar = this.zzz;
            zzadeVar.getClass();
            zzvh.zzf(zzvhVar, zzadeVar.zzg(this.zzI).zza.zzc, this.zzI);
            for (zzvz zzvzVar : this.zzt) {
                zzvzVar.zzu(this.zzI);
            }
            this.zzI = -9223372036854775807L;
        }
        this.zzK = zzQ();
        long zza = this.zzk.zza(zzvhVar, this, zzyr.zza(this.zzC));
        zzgvVar = zzvhVar.zzl;
        zzut zzutVar = this.zzg;
        j = zzvhVar.zzb;
        zzub zzubVar = new zzub(j, zzgvVar, zzgvVar.zza, Collections.emptyMap(), zza, 0L, 0L);
        j2 = zzvhVar.zzk;
        zzutVar.zzg(zzubVar, new zzug(1, -1, null, 0, null, zzfs.zzt(j2), zzfs.zzt(this.zzA)));
    }

    private final boolean zzY() {
        return this.zzI != -9223372036854775807L;
    }

    private final boolean zzZ() {
        return this.zzE || zzY();
    }

    static /* bridge */ /* synthetic */ long zzr(zzvm zzvmVar, boolean z) {
        return zzvmVar.zzR(true);
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void zzD() {
        this.zzv = true;
        this.zzp.post(this.zzn);
    }

    final /* synthetic */ void zzF() {
        this.zzG = true;
    }

    final void zzH() throws IOException {
        this.zzk.zzi(zzyr.zza(this.zzC));
    }

    final void zzI(int i) throws IOException {
        this.zzt[i].zzn();
        zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final /* bridge */ /* synthetic */ void zzJ(zzyw zzywVar, long j, long j2, boolean z) {
        zzhr zzhrVar;
        long j3;
        zzgv zzgvVar;
        long j4;
        long unused;
        zzvh zzvhVar = (zzvh) zzywVar;
        zzhrVar = zzvhVar.zzd;
        j3 = zzvhVar.zzb;
        zzgvVar = zzvhVar.zzl;
        zzub zzubVar = new zzub(j3, zzgvVar, zzhrVar.zzh(), zzhrVar.zzi(), j, j2, zzhrVar.zzg());
        unused = zzvhVar.zzb;
        j4 = zzvhVar.zzk;
        this.zzg.zzd(zzubVar, new zzug(1, -1, null, 0, null, zzfs.zzt(j4), zzfs.zzt(this.zzA)));
        if (z) {
            return;
        }
        for (zzvz zzvzVar : this.zzt) {
            zzvzVar.zzq(false);
        }
        if (this.zzF > 0) {
            zzuh zzuhVar = this.zzr;
            zzuhVar.getClass();
            zzuhVar.zzf(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final /* bridge */ /* synthetic */ void zzK(zzyw zzywVar, long j, long j2) {
        zzhr zzhrVar;
        long j3;
        zzgv zzgvVar;
        long j4;
        zzade zzadeVar;
        long unused;
        if (this.zzA == -9223372036854775807L && (zzadeVar = this.zzz) != null) {
            boolean zzh = zzadeVar.zzh();
            long zzR = zzR(true);
            long j5 = zzR == Long.MIN_VALUE ? 0L : zzR + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzA = j5;
            this.zzi.zza(j5, zzh, this.zzB);
        }
        zzvh zzvhVar = (zzvh) zzywVar;
        zzhrVar = zzvhVar.zzd;
        j3 = zzvhVar.zzb;
        zzgvVar = zzvhVar.zzl;
        zzub zzubVar = new zzub(j3, zzgvVar, zzhrVar.zzh(), zzhrVar.zzi(), j, j2, zzhrVar.zzg());
        unused = zzvhVar.zzb;
        zzut zzutVar = this.zzg;
        j4 = zzvhVar.zzk;
        zzutVar.zze(zzubVar, new zzug(1, -1, null, 0, null, zzfs.zzt(j4), zzfs.zzt(this.zzA)));
        this.zzL = true;
        zzuh zzuhVar = this.zzr;
        zzuhVar.getClass();
        zzuhVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzyx
    public final void zzL() {
        for (zzvz zzvzVar : this.zzt) {
            zzvzVar.zzp();
        }
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzM(zzam zzamVar) {
        this.zzp.post(this.zzn);
    }

    public final void zzN() {
        if (this.zzw) {
            for (zzvz zzvzVar : this.zzt) {
                zzvzVar.zzo();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzM = true;
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final void zzO(final zzade zzadeVar) {
        this.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvf
            @Override // java.lang.Runnable
            public final void run() {
                zzvm.this.zzG(zzadeVar);
            }
        });
    }

    final boolean zzP(int i) {
        return !zzZ() && this.zzt[i].zzy(this.zzL);
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final long zza(long j, zzmd zzmdVar) {
        zzT();
        if (!this.zzz.zzh()) {
            return 0L;
        }
        zzadc zzg = this.zzz.zzg(j);
        zzadf zzadfVar = zzg.zza;
        zzadf zzadfVar2 = zzg.zzb;
        long j2 = zzmdVar.zzf;
        if (j2 == 0) {
            if (zzmdVar.zzg == 0) {
                return j;
            }
            j2 = 0;
        }
        long j3 = zzadfVar.zzb;
        int i = zzfs.zza;
        long j4 = j - j2;
        long j5 = zzmdVar.zzg;
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
        long j9 = zzadfVar2.zzb;
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

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final long zzb() {
        long j;
        zzT();
        if (this.zzL || this.zzF == 0) {
            return Long.MIN_VALUE;
        }
        if (zzY()) {
            return this.zzI;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzvl zzvlVar = this.zzy;
                if (zzvlVar.zzb[i] && zzvlVar.zzc[i] && !this.zzt[i].zzx()) {
                    j = Math.min(j, this.zzt[i].zzh());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = zzR(false);
        }
        return j == Long.MIN_VALUE ? this.zzH : j;
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final long zzd() {
        if (!this.zzE) {
            return -9223372036854775807L;
        }
        if (!this.zzL && zzQ() <= this.zzK) {
            return -9223372036854775807L;
        }
        this.zzE = false;
        return this.zzH;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final long zze(long j) {
        int i;
        zzT();
        boolean[] zArr = this.zzy.zzb;
        if (true != this.zzz.zzh()) {
            j = 0;
        }
        this.zzE = false;
        this.zzH = j;
        if (zzY()) {
            this.zzI = j;
            return j;
        }
        if (this.zzC != 7) {
            int length = this.zzt.length;
            for (0; i < length; i + 1) {
                zzvz zzvzVar = this.zzt[i];
                i = ((this.zzq ? zzvzVar.zzz(zzvzVar.zza()) : zzvzVar.zzA(j, false)) || (!zArr[i] && this.zzx)) ? i + 1 : 0;
            }
            return j;
        }
        this.zzJ = false;
        this.zzI = j;
        this.zzL = false;
        zzza zzzaVar = this.zzk;
        if (zzzaVar.zzl()) {
            for (zzvz zzvzVar2 : this.zzt) {
                zzvzVar2.zzk();
            }
            this.zzk.zzg();
        } else {
            zzzaVar.zzh();
            for (zzvz zzvzVar3 : this.zzt) {
                zzvzVar3.zzq(false);
            }
        }
        return j;
    }

    final int zzf(int i, zzkv zzkvVar, zzib zzibVar, int i2) {
        if (zzZ()) {
            return -3;
        }
        zzV(i);
        int zze = this.zzt[i].zze(zzkvVar, zzibVar, i2, this.zzL);
        if (zze == -3) {
            zzW(i);
        }
        return zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r2 == 0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    @Override // com.google.android.gms.internal.ads.zzui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzg(zzxy[] zzxyVarArr, boolean[] zArr, zzwa[] zzwaVarArr, boolean[] zArr2, long j) {
        boolean z;
        int i;
        zzxy zzxyVar;
        int i2;
        zzT();
        zzvl zzvlVar = this.zzy;
        zzwl zzwlVar = zzvlVar.zza;
        boolean[] zArr3 = zzvlVar.zzc;
        int i3 = this.zzF;
        int i4 = 0;
        for (int i5 = 0; i5 < zzxyVarArr.length; i5++) {
            zzwa zzwaVar = zzwaVarArr[i5];
            if (zzwaVar != null && (zzxyVarArr[i5] == null || !zArr[i5])) {
                i2 = ((zzvj) zzwaVar).zzb;
                zzef.zzf(zArr3[i2]);
                this.zzF--;
                zArr3[i2] = false;
                zzwaVarArr[i5] = null;
            }
        }
        if (!this.zzq) {
            if (!this.zzD) {
                if (j == 0) {
                    z = false;
                    j = 0;
                    for (i = 0; i < zzxyVarArr.length; i++) {
                        if (zzwaVarArr[i] == null && (zzxyVar = zzxyVarArr[i]) != null) {
                            zzef.zzf(zzxyVar.zzc() == 1);
                            zzef.zzf(zzxyVar.zza(0) == 0);
                            int zza = zzwlVar.zza(zzxyVar.zze());
                            zzef.zzf(!zArr3[zza]);
                            this.zzF++;
                            zArr3[zza] = true;
                            zzwaVarArr[i] = new zzvj(this, zza);
                            zArr2[i] = true;
                            if (!z) {
                                zzvz zzvzVar = this.zzt[zza];
                                z = (zzvzVar.zzb() == 0 || zzvzVar.zzA(j, true)) ? false : true;
                            }
                        }
                    }
                    if (this.zzF == 0) {
                        this.zzJ = false;
                        this.zzE = false;
                        if (this.zzk.zzl()) {
                            zzvz[] zzvzVarArr = this.zzt;
                            int length = zzvzVarArr.length;
                            while (i4 < length) {
                                zzvzVarArr[i4].zzk();
                                i4++;
                            }
                            this.zzk.zzg();
                        } else {
                            for (zzvz zzvzVar2 : this.zzt) {
                                zzvzVar2.zzq(false);
                            }
                        }
                    } else if (z) {
                        j = zze(j);
                        while (i4 < zzwaVarArr.length) {
                            if (zzwaVarArr[i4] != null) {
                                zArr2[i4] = true;
                            }
                            i4++;
                        }
                    }
                    this.zzD = true;
                    return j;
                }
            }
            z = true;
            while (i < zzxyVarArr.length) {
            }
            if (this.zzF == 0) {
            }
            this.zzD = true;
            return j;
        }
        z = false;
        while (i < zzxyVarArr.length) {
        }
        if (this.zzF == 0) {
        }
        this.zzD = true;
        return j;
    }

    final int zzh(int i, long j) {
        if (zzZ()) {
            return 0;
        }
        zzV(i);
        zzvz zzvzVar = this.zzt[i];
        int zzc2 = zzvzVar.zzc(j, this.zzL);
        zzvzVar.zzw(zzc2);
        if (zzc2 != 0) {
            return zzc2;
        }
        zzW(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final zzwl zzi() {
        zzT();
        return this.zzy.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzj(long j, boolean z) {
        if (this.zzq) {
            return;
        }
        zzT();
        if (zzY()) {
            return;
        }
        boolean[] zArr = this.zzy.zzc;
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            this.zzt[i].zzj(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzk() throws IOException {
        zzH();
        if (this.zzL && !this.zzw) {
            throw zzcf.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzl(zzuh zzuhVar, long j) {
        this.zzr = zzuhVar;
        this.zzm.zze();
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final void zzm(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final boolean zzo(zzla zzlaVar) {
        if (this.zzL) {
            return false;
        }
        zzza zzzaVar = this.zzk;
        if (zzzaVar.zzk() || this.zzJ) {
            return false;
        }
        if (this.zzw && this.zzF == 0) {
            return false;
        }
        boolean zze = this.zzm.zze();
        if (zzzaVar.zzl()) {
            return zze;
        }
        zzX();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ zzyu zzu(zzyw zzywVar, long j, long j2, IOException iOException, int i) {
        zzhr zzhrVar;
        long j3;
        zzgv zzgvVar;
        long j4;
        zzyu zzb2;
        zzade zzadeVar;
        boolean z;
        long j5;
        long unused;
        long unused2;
        zzvh zzvhVar = (zzvh) zzywVar;
        zzhrVar = zzvhVar.zzd;
        j3 = zzvhVar.zzb;
        zzgvVar = zzvhVar.zzl;
        zzub zzubVar = new zzub(j3, zzgvVar, zzhrVar.zzh(), zzhrVar.zzi(), j, j2, zzhrVar.zzg());
        unused = zzvhVar.zzk;
        int i2 = zzfs.zza;
        if (!(iOException instanceof zzcf) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof zzhi) && !(iOException instanceof zzyz)) {
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof zzgr) || ((zzgr) th).zza != 2008) {
                }
            }
            j4 = Math.min((i - 1) * 1000, PAGErrorCode.LOAD_FACTORY_NULL_CODE);
            if (j4 != -9223372036854775807L) {
                zzb2 = zzza.zzd;
            } else {
                int zzQ = zzQ();
                boolean z2 = zzQ > this.zzK;
                if (this.zzG || !((zzadeVar = this.zzz) == null || zzadeVar.zza() == -9223372036854775807L)) {
                    this.zzK = zzQ;
                } else {
                    boolean z3 = this.zzw;
                    if (!z3 || zzZ()) {
                        this.zzE = z3;
                        this.zzH = 0L;
                        this.zzK = 0;
                        for (zzvz zzvzVar : this.zzt) {
                            zzvzVar.zzq(false);
                        }
                        zzvh.zzf(zzvhVar, 0L, 0L);
                    } else {
                        this.zzJ = true;
                        zzb2 = zzza.zzc;
                    }
                }
                zzb2 = zzza.zzb(z2, j4);
            }
            z = !zzb2.zzc();
            zzut zzutVar = this.zzg;
            j5 = zzvhVar.zzk;
            zzutVar.zzf(zzubVar, new zzug(1, -1, null, 0, null, zzfs.zzt(j5), zzfs.zzt(this.zzA)), iOException, z);
            if (z) {
                unused2 = zzvhVar.zzb;
            }
            return zzb2;
        }
        j4 = -9223372036854775807L;
        if (j4 != -9223372036854775807L) {
        }
        z = !zzb2.zzc();
        zzut zzutVar2 = this.zzg;
        j5 = zzvhVar.zzk;
        zzutVar2.zzf(zzubVar, new zzug(1, -1, null, 0, null, zzfs.zzt(j5), zzfs.zzt(this.zzA)), iOException, z);
        if (z) {
        }
        return zzb2;
    }

    final zzadk zzv() {
        return zzS(new zzvk(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzach
    public final zzadk zzw(int i, int i2) {
        return zzS(new zzvk(i, false));
    }

    final /* synthetic */ void zzE() {
        if (this.zzM) {
            return;
        }
        zzuh zzuhVar = this.zzr;
        zzuhVar.getClass();
        zzuhVar.zzf(this);
    }

    final /* synthetic */ void zzG(zzade zzadeVar) {
        this.zzz = this.zzs == null ? zzadeVar : new zzadd(-9223372036854775807L, 0L);
        if (zzadeVar.zza() == -9223372036854775807L && this.zzA != -9223372036854775807L) {
            this.zzz = new zzvg(this, this.zzz);
        }
        this.zzA = this.zzz.zza();
        boolean z = false;
        if (!this.zzG && zzadeVar.zza() == -9223372036854775807L) {
            z = true;
        }
        this.zzB = z;
        this.zzC = true == z ? 7 : 1;
        this.zzi.zza(this.zzA, zzadeVar.zzh(), this.zzB);
        if (this.zzw) {
            return;
        }
        zzU();
    }
}

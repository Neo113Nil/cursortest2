package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzvz implements zzadk {
    private boolean zzB;
    private zzrs zzC;
    private final zzvt zza;
    private final zzrr zzd;
    private final zzrl zze;
    private zzvy zzf;
    private zzam zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    private zzam zzy;
    private zzam zzz;
    private final zzvv zzb = new zzvv();
    private int zzh = 1000;
    private long[] zzi = new long[1000];
    private long[] zzj = new long[1000];
    private long[] zzm = new long[1000];
    private int[] zzl = new int[1000];
    private int[] zzk = new int[1000];
    private zzadj[] zzn = new zzadj[1000];
    private final zzwg zzc = new zzwg(new zzej() { // from class: com.google.android.gms.internal.ads.zzvu
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;
    private boolean zzA = true;

    protected zzvz(zzyn zzynVar, zzrr zzrrVar, zzrl zzrlVar) {
        this.zzd = zzrrVar;
        this.zze = zzrlVar;
        this.zza = new zzvt(zzynVar);
    }

    private final int zzB(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.zzm[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.zzl[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.zzh) {
                i = 0;
            }
        }
        return i3;
    }

    private final int zzC(int i) {
        int i2 = this.zzq + i;
        int i3 = this.zzh;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private final synchronized int zzD(zzkv zzkvVar, zzib zzibVar, boolean z, boolean z2, zzvv zzvvVar) {
        zzibVar.zzd = false;
        if (!zzL()) {
            if (!z2 && !this.zzv) {
                zzam zzamVar = this.zzz;
                if (zzamVar == null || (!z && zzamVar == this.zzg)) {
                    return -3;
                }
                zzI(zzamVar, zzkvVar);
                return -5;
            }
            zzibVar.zzc(4);
            zzibVar.zze = Long.MIN_VALUE;
            return -4;
        }
        zzam zzamVar2 = ((zzvx) this.zzc.zza(this.zzp + this.zzr)).zza;
        if (!z && zzamVar2 == this.zzg) {
            int zzC = zzC(this.zzr);
            if (!zzM(zzC)) {
                zzibVar.zzd = true;
                return -3;
            }
            zzibVar.zzc(this.zzl[zzC]);
            if (this.zzr == this.zzo - 1 && (z2 || this.zzv)) {
                zzibVar.zza(536870912);
            }
            long j = this.zzm[zzC];
            zzibVar.zze = j;
            if (j < this.zzs) {
                zzibVar.zza(Integer.MIN_VALUE);
            }
            zzvvVar.zza = this.zzk[zzC];
            zzvvVar.zzb = this.zzj[zzC];
            zzvvVar.zzc = this.zzn[zzC];
            return -4;
        }
        zzI(zzamVar2, zzkvVar);
        return -5;
    }

    private final synchronized long zzE(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.zzo;
        if (i2 != 0) {
            long[] jArr = this.zzm;
            int i3 = this.zzq;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.zzr) != i2) {
                    i2 = i + 1;
                }
                int zzB = zzB(i3, i2, j, false);
                if (zzB != -1) {
                    return zzG(zzB);
                }
            }
        }
        return -1L;
    }

    private final synchronized long zzF() {
        int i = this.zzo;
        if (i == 0) {
            return -1L;
        }
        return zzG(i);
    }

    private final synchronized void zzH(long j, int i, long j2, int i2, zzadj zzadjVar) {
        int i3 = this.zzo;
        if (i3 > 0) {
            int zzC = zzC(i3 - 1);
            zzef.zzd(this.zzj[zzC] + ((long) this.zzk[zzC]) <= j2);
        }
        this.zzv = (536870912 & i) != 0;
        this.zzu = Math.max(this.zzu, j);
        int zzC2 = zzC(this.zzo);
        this.zzm[zzC2] = j;
        this.zzj[zzC2] = j2;
        this.zzk[zzC2] = i2;
        this.zzl[zzC2] = i;
        this.zzn[zzC2] = zzadjVar;
        this.zzi[zzC2] = 0;
        if (this.zzc.zzf() || !((zzvx) this.zzc.zzb()).zza.equals(this.zzz)) {
            zzam zzamVar = this.zzz;
            zzamVar.getClass();
            this.zzc.zzc(this.zzp + this.zzo, new zzvx(zzamVar, zzrq.zzb, null));
        }
        int i4 = this.zzo + 1;
        this.zzo = i4;
        int i5 = this.zzh;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            zzadj[] zzadjVarArr = new zzadj[i6];
            int i7 = this.zzq;
            int i8 = i5 - i7;
            System.arraycopy(this.zzj, i7, jArr2, 0, i8);
            System.arraycopy(this.zzm, this.zzq, jArr3, 0, i8);
            System.arraycopy(this.zzl, this.zzq, iArr, 0, i8);
            System.arraycopy(this.zzk, this.zzq, iArr2, 0, i8);
            System.arraycopy(this.zzn, this.zzq, zzadjVarArr, 0, i8);
            System.arraycopy(this.zzi, this.zzq, jArr, 0, i8);
            int i9 = this.zzq;
            System.arraycopy(this.zzj, 0, jArr2, i8, i9);
            System.arraycopy(this.zzm, 0, jArr3, i8, i9);
            System.arraycopy(this.zzl, 0, iArr, i8, i9);
            System.arraycopy(this.zzk, 0, iArr2, i8, i9);
            System.arraycopy(this.zzn, 0, zzadjVarArr, i8, i9);
            System.arraycopy(this.zzi, 0, jArr, i8, i9);
            this.zzj = jArr2;
            this.zzm = jArr3;
            this.zzl = iArr;
            this.zzk = iArr2;
            this.zzn = zzadjVarArr;
            this.zzi = jArr;
            this.zzq = 0;
            this.zzh = i6;
        }
    }

    private final void zzI(zzam zzamVar, zzkv zzkvVar) {
        zzam zzamVar2 = this.zzg;
        zzad zzadVar = zzamVar2 == null ? null : zzamVar2.zzp;
        this.zzg = zzamVar;
        zzad zzadVar2 = zzamVar.zzp;
        zzkvVar.zza = zzamVar.zzc(this.zzd.zza(zzamVar));
        zzkvVar.zzb = this.zzC;
        if (zzamVar2 == null || !zzfs.zzF(zzadVar, zzadVar2)) {
            zzrs zzrsVar = zzamVar.zzp != null ? new zzrs(new zzrj(new zzru(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE)) : null;
            this.zzC = zzrsVar;
            zzkvVar.zzb = zzrsVar;
        }
    }

    private final void zzJ() {
        if (this.zzC != null) {
            this.zzC = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzK() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzL() {
        return this.zzr != this.zzo;
    }

    private final boolean zzM(int i) {
        if (this.zzC != null) {
            return (this.zzl[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzN(zzam zzamVar) {
        this.zzx = false;
        if (zzfs.zzF(zzamVar, this.zzz)) {
            return false;
        }
        if (this.zzc.zzf() || !((zzvx) this.zzc.zzb()).zza.equals(zzamVar)) {
            this.zzz = zzamVar;
        } else {
            this.zzz = ((zzvx) this.zzc.zzb()).zza;
        }
        boolean z = this.zzA;
        zzam zzamVar2 = this.zzz;
        this.zzA = z & zzce.zze(zzamVar2.zzm, zzamVar2.zzj);
        this.zzB = false;
        return true;
    }

    static /* synthetic */ void zzm(zzvx zzvxVar) {
        zzrq zzrqVar = zzvxVar.zzb;
        int i = zzrp.zza;
    }

    public final synchronized boolean zzA(long j, boolean z) {
        int zzB;
        zzK();
        int i = this.zzr;
        int zzC = zzC(i);
        if (zzL() && j >= this.zzm[zzC]) {
            if (j > this.zzu) {
                if (z) {
                    z = true;
                }
            }
            if (this.zzA) {
                zzB = this.zzo - i;
                int i2 = 0;
                while (true) {
                    if (i2 < zzB) {
                        if (this.zzm[zzC] >= j) {
                            zzB = i2;
                            break;
                        }
                        zzC++;
                        if (zzC == this.zzh) {
                            zzC = 0;
                        }
                        i2++;
                    } else if (!z) {
                        zzB = -1;
                    }
                }
            } else {
                zzB = zzB(zzC, this.zzo - i, j, true);
            }
            if (zzB != -1) {
                this.zzs = j;
                this.zzr += zzB;
                return true;
            }
        }
        return false;
    }

    public final int zza() {
        return this.zzp;
    }

    public final int zzb() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzc(long j, boolean z) {
        int i = this.zzr;
        int zzC = zzC(i);
        if (zzL() && j >= this.zzm[zzC]) {
            if (j > this.zzu && z) {
                return this.zzo - i;
            }
            int zzB = zzB(zzC, this.zzo - i, j, true);
            if (zzB == -1) {
                return 0;
            }
            return zzB;
        }
        return 0;
    }

    public final int zzd() {
        return this.zzp + this.zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r9 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zze(zzkv zzkvVar, zzib zzibVar, int i, boolean z) {
        int zzD = zzD(zzkvVar, zzibVar, (i & 2) != 0, z, this.zzb);
        if (zzD != -4) {
            return zzD;
        }
        if (!zzibVar.zzf()) {
            int i2 = i & 1;
            if ((i & 4) == 0) {
                if (i2 == 0) {
                    this.zza.zze(zzibVar, this.zzb);
                    this.zzr++;
                    return -4;
                }
                this.zza.zzd(zzibVar, this.zzb);
            }
        }
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final /* synthetic */ int zzf(zzt zztVar, int i, boolean z) {
        return zzadi.zza(this, zztVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final int zzg(zzt zztVar, int i, boolean z, int i2) throws IOException {
        return this.zza.zza(zztVar, i, z);
    }

    public final synchronized long zzh() {
        return this.zzu;
    }

    public final synchronized zzam zzi() {
        if (this.zzx) {
            return null;
        }
        return this.zzz;
    }

    public final void zzj(long j, boolean z, boolean z2) {
        this.zza.zzc(zzE(j, false, z2));
    }

    public final void zzk() {
        this.zza.zzc(zzF());
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final void zzl(zzam zzamVar) {
        this.zzy = zzamVar;
        boolean zzN = zzN(zzamVar);
        zzvy zzvyVar = this.zzf;
        if (zzvyVar == null || !zzN) {
            return;
        }
        zzvyVar.zzM(zzamVar);
    }

    public final void zzn() throws IOException {
        zzrs zzrsVar = this.zzC;
        if (zzrsVar != null) {
            throw zzrsVar.zza();
        }
    }

    public final void zzo() {
        zzk();
        zzJ();
    }

    public final void zzp() {
        zzq(true);
        zzJ();
    }

    public final void zzq(boolean z) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z) {
            this.zzy = null;
            this.zzz = null;
            this.zzx = true;
            this.zzA = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final /* synthetic */ void zzr(zzfj zzfjVar, int i) {
        zzadi.zzb(this, zzfjVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final void zzs(zzfj zzfjVar, int i, int i2) {
        this.zza.zzh(zzfjVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final void zzt(long j, int i, int i2, int i3, zzadj zzadjVar) {
        if (this.zzw) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.zzw = false;
            }
        }
        if (this.zzA) {
            if (j < this.zzs) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.zzB) {
                    zzez.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(String.valueOf(this.zzz))));
                    this.zzB = true;
                }
                i |= 1;
            }
        }
        zzH(j, i, (this.zza.zzb() - i2) - i3, i2, zzadjVar);
    }

    public final void zzu(long j) {
        this.zzs = j;
    }

    public final void zzv(zzvy zzvyVar) {
        this.zzf = zzvyVar;
    }

    public final synchronized void zzw(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.zzr + i <= this.zzo) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzef.zzd(z);
        this.zzr += i;
    }

    public final synchronized boolean zzx() {
        return this.zzv;
    }

    public final synchronized boolean zzy(boolean z) {
        boolean z2 = true;
        if (zzL()) {
            if (((zzvx) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
                return true;
            }
            return zzM(zzC(this.zzr));
        }
        if (!z && !this.zzv) {
            zzam zzamVar = this.zzz;
            if (zzamVar == null) {
                z2 = false;
            } else if (zzamVar == this.zzg) {
                return false;
            }
        }
        return z2;
    }

    public final synchronized boolean zzz(int i) {
        zzK();
        int i2 = this.zzp;
        if (i >= i2 && i <= this.zzo + i2) {
            this.zzs = Long.MIN_VALUE;
            this.zzr = i - i2;
            return true;
        }
        return false;
    }

    private final long zzG(int i) {
        long j = this.zzt;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int zzC = zzC(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                j2 = Math.max(j2, this.zzm[zzC]);
                if ((this.zzl[zzC] & 1) != 0) {
                    break;
                }
                zzC--;
                if (zzC == -1) {
                    zzC = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j, j2);
        this.zzo -= i;
        int i3 = this.zzp + i;
        this.zzp = i3;
        int i4 = this.zzq + i;
        this.zzq = i4;
        int i5 = this.zzh;
        if (i4 >= i5) {
            this.zzq = i4 - i5;
        }
        int i6 = this.zzr - i;
        this.zzr = i6;
        if (i6 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i3);
        if (this.zzo != 0) {
            return this.zzj[this.zzq];
        }
        int i7 = this.zzq;
        if (i7 == 0) {
            i7 = this.zzh;
        }
        return this.zzj[i7 - 1] + this.zzk[r12];
    }
}

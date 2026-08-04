package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzwe implements zzaeb {
    private boolean zzB;
    private final zzvz zza;
    private final zzru zzd;
    private final zzrp zze;
    private zzwd zzf;
    private zzu zzg;
    private zzrn zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzw;
    private zzu zzz;
    private final zzwa zzb = new zzwa();
    private int zzi = 1000;
    private long[] zzj = new long[1000];
    private long[] zzk = new long[1000];
    private long[] zzn = new long[1000];
    private int[] zzm = new int[1000];
    private int[] zzl = new int[1000];
    private zzaea[] zzo = new zzaea[1000];
    private final zzwl zzc = new zzwl(zzwb.zza);
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private boolean zzy = true;
    private boolean zzx = true;
    private boolean zzA = true;

    protected zzwe(zzyv zzyvVar, zzru zzruVar, zzrp zzrpVar) {
        this.zzd = zzruVar;
        this.zze = zzrpVar;
        this.zza = new zzvz(zzyvVar);
    }

    private final synchronized void zzA() {
        this.zzs = 0;
        this.zza.zzb();
    }

    private final synchronized int zzB(zzkh zzkhVar, zzhg zzhgVar, boolean z, boolean z2, zzwa zzwaVar) {
        zzhgVar.zzd = false;
        if (!zzH()) {
            if (!z2 && !this.zzw) {
                zzu zzuVar = this.zzz;
                if (zzuVar == null || (!z && zzuVar == this.zzg)) {
                    return -3;
                }
                zzu zzuVar2 = zzuVar;
                zzI(zzuVar, zzkhVar);
                return -5;
            }
            zzhgVar.zzg(4);
            zzhgVar.zze = Long.MIN_VALUE;
            return -4;
        }
        zzu zzuVar3 = ((zzwc) this.zzc.zza(this.zzq + this.zzs)).zza;
        if (!z && zzuVar3 == this.zzg) {
            int zzM = zzM(this.zzs);
            if (!zzJ(zzM)) {
                zzhgVar.zzd = true;
                return -3;
            }
            zzhgVar.zzg(this.zzm[zzM]);
            if (this.zzs == this.zzp - 1 && (z2 || this.zzw)) {
                zzhgVar.zzh(536870912);
            }
            zzhgVar.zze = this.zzn[zzM];
            zzwaVar.zza = this.zzl[zzM];
            zzwaVar.zzb = this.zzk[zzM];
            zzwaVar.zzc = this.zzo[zzM];
            return -4;
        }
        zzI(zzuVar3, zzkhVar);
        return -5;
    }

    private final synchronized boolean zzC(zzu zzuVar) {
        this.zzy = false;
        if (Objects.equals(zzuVar, this.zzz)) {
            return false;
        }
        zzwl zzwlVar = this.zzc;
        if (zzwlVar.zzf() || !((zzwc) zzwlVar.zzc()).zza.equals(zzuVar)) {
            this.zzz = zzuVar;
        } else {
            this.zzz = ((zzwc) zzwlVar.zzc()).zza;
        }
        boolean z = this.zzA;
        zzu zzuVar2 = this.zzz;
        this.zzA = z & zzar.zzd(zzuVar2.zzo, zzuVar2.zzk);
        this.zzB = false;
        return true;
    }

    private final synchronized long zzD(long j, boolean z, boolean z2) {
        Throwable th;
        try {
            try {
                int i = this.zzp;
                if (i != 0) {
                    long[] jArr = this.zzn;
                    int i2 = this.zzr;
                    if (j >= jArr[i2]) {
                        if (z2) {
                            try {
                                int i3 = this.zzs;
                                if (i3 != i) {
                                    i = i3 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int zzK = zzK(i2, i, j, false);
                        if (zzK != -1) {
                            return zzL(zzK);
                        }
                        return -1L;
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final synchronized long zzE() {
        int i = this.zzp;
        if (i == 0) {
            return -1L;
        }
        return zzL(i);
    }

    private final void zzF() {
        if (this.zzh != null) {
            this.zzh = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzG(long j, int i, long j2, int i2, zzaea zzaeaVar) {
        int i3 = this.zzp;
        if (i3 > 0) {
            int zzM = zzM(i3 - 1);
            zzghc.zza(this.zzk[zzM] + ((long) this.zzl[zzM]) <= j2);
        }
        this.zzw = (536870912 & i) != 0;
        this.zzv = Math.max(this.zzv, j);
        int zzM2 = zzM(this.zzp);
        this.zzn[zzM2] = j;
        this.zzk[zzM2] = j2;
        this.zzl[zzM2] = i2;
        this.zzm[zzM2] = i;
        this.zzo[zzM2] = zzaeaVar;
        this.zzj[zzM2] = 0;
        zzwl zzwlVar = this.zzc;
        if (zzwlVar.zzf() || !((zzwc) zzwlVar.zzc()).zza.equals(this.zzz)) {
            zzu zzuVar = this.zzz;
            if (zzuVar == null) {
                throw null;
            }
            zzu zzuVar2 = zzuVar;
            zzwlVar.zzb(this.zzq + this.zzp, new zzwc(zzuVar, zzrt.zzb, null));
        }
        int i4 = this.zzp + 1;
        this.zzp = i4;
        int i5 = this.zzi;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            zzaea[] zzaeaVarArr = new zzaea[i6];
            int i7 = this.zzr;
            int i8 = i5 - i7;
            System.arraycopy(this.zzk, i7, jArr2, 0, i8);
            System.arraycopy(this.zzn, this.zzr, jArr3, 0, i8);
            System.arraycopy(this.zzm, this.zzr, iArr, 0, i8);
            System.arraycopy(this.zzl, this.zzr, iArr2, 0, i8);
            System.arraycopy(this.zzo, this.zzr, zzaeaVarArr, 0, i8);
            System.arraycopy(this.zzj, this.zzr, jArr, 0, i8);
            int i9 = this.zzr;
            System.arraycopy(this.zzk, 0, jArr2, i8, i9);
            System.arraycopy(this.zzn, 0, jArr3, i8, i9);
            System.arraycopy(this.zzm, 0, iArr, i8, i9);
            System.arraycopy(this.zzl, 0, iArr2, i8, i9);
            System.arraycopy(this.zzo, 0, zzaeaVarArr, i8, i9);
            System.arraycopy(this.zzj, 0, jArr, i8, i9);
            this.zzk = jArr2;
            this.zzn = jArr3;
            this.zzm = iArr;
            this.zzl = iArr2;
            this.zzo = zzaeaVarArr;
            this.zzj = jArr;
            this.zzr = 0;
            this.zzi = i6;
        }
    }

    private final boolean zzH() {
        return this.zzs != this.zzp;
    }

    private final void zzI(zzu zzuVar, zzkh zzkhVar) {
        zzu zzuVar2 = this.zzg;
        zzp zzpVar = zzuVar2 == null ? null : zzuVar2.zzs;
        this.zzg = zzuVar;
        zzp zzpVar2 = zzuVar.zzs;
        zzru zzruVar = this.zzd;
        zzkhVar.zzb = zzuVar.zzb(zzruVar.zzb(zzuVar));
        zzkhVar.zza = this.zzh;
        if (zzuVar2 == null || !Objects.equals(zzpVar, zzpVar2)) {
            zzrn zza = zzruVar.zza(this.zze, zzuVar);
            this.zzh = zza;
            zzkhVar.zza = zza;
        }
    }

    private final boolean zzJ(int i) {
        if (this.zzh == null) {
            return true;
        }
        int i2 = this.zzm[i];
        return false;
    }

    private final int zzK(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.zzn[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.zzm[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.zzi) {
                i = 0;
            }
        }
        return i3;
    }

    private final int zzM(int i) {
        int i2 = this.zzr + i;
        int i3 = this.zzi;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final void zza() {
        zzb(true);
        zzF();
    }

    public final void zzb(boolean z) {
        this.zza.zza();
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzx = true;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = Long.MIN_VALUE;
        this.zzw = false;
        this.zzc.zze();
        if (z) {
            this.zzz = null;
            this.zzy = true;
            this.zzA = true;
        }
    }

    public final void zzc(long j) {
        this.zzt = j;
    }

    public final int zzd() {
        return this.zzq + this.zzp;
    }

    public final void zze() {
        zzs();
        zzF();
    }

    public final void zzf() throws IOException {
        zzrn zzrnVar = this.zzh;
        if (zzrnVar != null) {
            throw zzrnVar.zza();
        }
    }

    public final int zzg() {
        return this.zzq;
    }

    public final int zzh() {
        return this.zzq + this.zzs;
    }

    public final synchronized zzu zzi() {
        if (this.zzy) {
            return null;
        }
        return this.zzz;
    }

    public final synchronized long zzj() {
        return this.zzv;
    }

    public final synchronized boolean zzk() {
        return this.zzw;
    }

    public final synchronized boolean zzl(boolean z) {
        boolean z2 = true;
        if (zzH()) {
            if (((zzwc) this.zzc.zza(this.zzq + this.zzs)).zza != this.zzg) {
                return true;
            }
            return zzJ(zzM(this.zzs));
        }
        if (!z && !this.zzw) {
            zzu zzuVar = this.zzz;
            if (zzuVar == null) {
                z2 = false;
            } else if (zzuVar == this.zzg) {
                return false;
            }
        }
        return z2;
    }

    public final int zzm(zzkh zzkhVar, zzhg zzhgVar, int i, boolean z) {
        boolean z2 = (i & 2) != 0;
        zzwa zzwaVar = this.zzb;
        int zzB = zzB(zzkhVar, zzhgVar, z2, z, zzwaVar);
        if (zzB != -4) {
            return zzB;
        }
        if (!zzhgVar.zzb()) {
            int i2 = i & 1;
            if ((i & 4) == 0) {
                if (i2 != 0) {
                    this.zza.zzd(zzhgVar, zzwaVar);
                    return -4;
                }
                this.zza.zzc(zzhgVar, zzwaVar);
            } else if (i2 != 0) {
                return -4;
            }
            this.zzs++;
        }
        return -4;
    }

    public final synchronized boolean zzn(int i) {
        zzA();
        int i2 = this.zzq;
        if (i >= i2 && i <= this.zzp + i2) {
            this.zzt = Long.MIN_VALUE;
            this.zzs = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean zzo(long j, boolean z) {
        Throwable th;
        zzwe zzweVar;
        long j2;
        int i;
        try {
            try {
                zzA();
                int i2 = this.zzs;
                int zzM = zzM(i2);
                if (zzH() && j >= this.zzn[zzM]) {
                    if (j > this.zzv) {
                        if (z) {
                            z = true;
                        }
                    }
                    if (this.zzA) {
                        try {
                            int i3 = this.zzp - i2;
                            int i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    if (this.zzn[zzM] >= j) {
                                        zzweVar = this;
                                        j2 = j;
                                        i = i4;
                                        break;
                                    }
                                    zzM++;
                                    if (zzM == this.zzi) {
                                        zzM = 0;
                                    }
                                    i4++;
                                } else if (z) {
                                    j2 = j;
                                    i = i3;
                                    zzweVar = this;
                                } else {
                                    zzweVar = this;
                                    j2 = j;
                                    i = -1;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        zzweVar = this;
                        j2 = j;
                        i = zzweVar.zzK(zzM, this.zzp - i2, j2, true);
                    }
                    if (i == -1) {
                        return false;
                    }
                    zzweVar.zzt = j2;
                    zzweVar.zzs += i;
                    return true;
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized int zzp(long j, boolean z) {
        Throwable th;
        try {
            try {
                int i = this.zzs;
                int zzM = zzM(i);
                if (zzH() && j >= this.zzn[zzM]) {
                    if (j <= this.zzv || !z) {
                        int zzK = zzK(zzM, this.zzp - i, j, true);
                        if (zzK == -1) {
                            return 0;
                        }
                        return zzK;
                    }
                    try {
                        return this.zzp - i;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                return 0;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized void zzq(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.zzs + i <= this.zzp) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzghc.zza(z);
        this.zzs += i;
    }

    public final void zzr(long j, boolean z, boolean z2) {
        this.zza.zze(zzD(j, false, z2));
    }

    public final void zzs() {
        this.zza.zze(zzE());
    }

    public final void zzt(zzwd zzwdVar) {
        this.zzf = zzwdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzu(zzu zzuVar) {
        boolean zzC = zzC(zzuVar);
        zzwd zzwdVar = this.zzf;
        if (zzwdVar == null || !zzC) {
            return;
        }
        zzwdVar.zzy(zzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final int zzv(zzi zziVar, int i, boolean z, int i2) throws IOException {
        return this.zza.zzg(zziVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzw(zzef zzefVar, int i, int i2) {
        this.zza.zzh(zzefVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzx(long j, int i, int i2, int i3, zzaea zzaeaVar) {
        if (this.zzx) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.zzx = false;
            }
        }
        if (this.zzA) {
            if (j < this.zzt) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.zzB) {
                    String valueOf = String.valueOf(this.zzz);
                    String.valueOf(valueOf);
                    zzds.zzc("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(valueOf)));
                    this.zzB = true;
                }
                i |= 1;
            }
        }
        zzG(j, i, (this.zza.zzf() - i2) - i3, i2, zzaeaVar);
    }

    private final long zzL(int i) {
        long j = this.zzu;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int zzM = zzM(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                j2 = Math.max(j2, this.zzn[zzM]);
                if ((this.zzm[zzM] & 1) != 0) {
                    break;
                }
                zzM--;
                if (zzM == -1) {
                    zzM = this.zzi - 1;
                }
            }
        }
        this.zzu = Math.max(j, j2);
        this.zzp -= i;
        int i3 = this.zzq + i;
        this.zzq = i3;
        int i4 = this.zzr + i;
        this.zzr = i4;
        int i5 = this.zzi;
        if (i4 >= i5) {
            this.zzr = i4 - i5;
        }
        int i6 = this.zzs - i;
        this.zzs = i6;
        if (i6 < 0) {
            this.zzs = 0;
        }
        this.zzc.zzd(i3);
        if (this.zzp != 0) {
            return this.zzk[this.zzr];
        }
        int i7 = this.zzr;
        if (i7 == 0) {
            i7 = this.zzi;
        }
        return this.zzk[i7 - 1] + this.zzl[r12];
    }
}

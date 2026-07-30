package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzyb implements zzagh {
    private boolean zzB;
    private final zzxw zza;
    private final zzto zzd;
    private final zztj zze;
    private zzya zzf;
    private zzv zzg;
    private zzth zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzw;
    private zzv zzz;
    private final zzxx zzb = new zzxx();
    private int zzi = 1000;
    private long[] zzj = new long[1000];
    private long[] zzk = new long[1000];
    private long[] zzn = new long[1000];
    private int[] zzm = new int[1000];
    private int[] zzl = new int[1000];
    private zzagg[] zzo = new zzagg[1000];
    private final zzyi zzc = new zzyi(zzxy.zza);
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private boolean zzy = true;
    private boolean zzx = true;
    private boolean zzA = true;

    protected zzyb(zzaan zzaanVar, zzto zztoVar, zztj zztjVar) {
        this.zzd = zztoVar;
        this.zze = zztjVar;
        this.zza = new zzxw(zzaanVar);
    }

    private final synchronized void zzA() {
        this.zzs = 0;
        this.zza.zzb();
    }

    private final synchronized int zzB(zzlh zzlhVar, zzih zzihVar, boolean z, boolean z2, zzxx zzxxVar) {
        zzihVar.zzd = false;
        if (!zzH()) {
            if (!z2 && !this.zzw) {
                zzv zzvVar = this.zzz;
                if (zzvVar == null || (!z && zzvVar == this.zzg)) {
                    return -3;
                }
                zzv zzvVar2 = zzvVar;
                zzI(zzvVar, zzlhVar);
                return -5;
            }
            zzihVar.zzg(4);
            zzihVar.zze = Long.MIN_VALUE;
            return -4;
        }
        zzv zzvVar3 = ((zzxz) this.zzc.zza(this.zzq + this.zzs)).zza;
        if (!z && zzvVar3 == this.zzg) {
            int zzM = zzM(this.zzs);
            if (!zzJ(zzM)) {
                zzihVar.zzd = true;
                return -3;
            }
            zzihVar.zzg(this.zzm[zzM]);
            if (this.zzs == this.zzp - 1 && (z2 || this.zzw)) {
                zzihVar.zzh(536870912);
            }
            zzihVar.zze = this.zzn[zzM];
            zzxxVar.zza = this.zzl[zzM];
            zzxxVar.zzb = this.zzk[zzM];
            zzxxVar.zzc = this.zzo[zzM];
            return -4;
        }
        zzI(zzvVar3, zzlhVar);
        return -5;
    }

    private final synchronized boolean zzC(zzv zzvVar) {
        this.zzy = false;
        if (Objects.equals(zzvVar, this.zzz)) {
            return false;
        }
        zzyi zzyiVar = this.zzc;
        if (zzyiVar.zzf() || !((zzxz) zzyiVar.zzc()).zza.equals(zzvVar)) {
            this.zzz = zzvVar;
        } else {
            this.zzz = ((zzxz) zzyiVar.zzc()).zza;
        }
        boolean z = this.zzA;
        zzv zzvVar2 = this.zzz;
        this.zzA = z & zzas.zzd(zzvVar2.zzo, zzvVar2.zzk);
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

    private final synchronized void zzG(long j, int i, long j2, int i2, zzagg zzaggVar) {
        int i3 = this.zzp;
        if (i3 > 0) {
            int zzM = zzM(i3 - 1);
            zzgrc.zza(this.zzk[zzM] + ((long) this.zzl[zzM]) <= j2);
        }
        this.zzw = (536870912 & i) != 0;
        this.zzv = Math.max(this.zzv, j);
        int zzM2 = zzM(this.zzp);
        this.zzn[zzM2] = j;
        this.zzk[zzM2] = j2;
        this.zzl[zzM2] = i2;
        this.zzm[zzM2] = i;
        this.zzo[zzM2] = zzaggVar;
        this.zzj[zzM2] = 0;
        zzyi zzyiVar = this.zzc;
        if (zzyiVar.zzf() || !((zzxz) zzyiVar.zzc()).zza.equals(this.zzz)) {
            zzv zzvVar = this.zzz;
            if (zzvVar == null) {
                throw null;
            }
            zzv zzvVar2 = zzvVar;
            zzyiVar.zzb(this.zzq + this.zzp, new zzxz(zzvVar, zztn.zzb, null));
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
            zzagg[] zzaggVarArr = new zzagg[i6];
            int i7 = this.zzr;
            int i8 = i5 - i7;
            System.arraycopy(this.zzk, i7, jArr2, 0, i8);
            System.arraycopy(this.zzn, this.zzr, jArr3, 0, i8);
            System.arraycopy(this.zzm, this.zzr, iArr, 0, i8);
            System.arraycopy(this.zzl, this.zzr, iArr2, 0, i8);
            System.arraycopy(this.zzo, this.zzr, zzaggVarArr, 0, i8);
            System.arraycopy(this.zzj, this.zzr, jArr, 0, i8);
            int i9 = this.zzr;
            System.arraycopy(this.zzk, 0, jArr2, i8, i9);
            System.arraycopy(this.zzn, 0, jArr3, i8, i9);
            System.arraycopy(this.zzm, 0, iArr, i8, i9);
            System.arraycopy(this.zzl, 0, iArr2, i8, i9);
            System.arraycopy(this.zzo, 0, zzaggVarArr, i8, i9);
            System.arraycopy(this.zzj, 0, jArr, i8, i9);
            this.zzk = jArr2;
            this.zzn = jArr3;
            this.zzm = iArr;
            this.zzl = iArr2;
            this.zzo = zzaggVarArr;
            this.zzj = jArr;
            this.zzr = 0;
            this.zzi = i6;
        }
    }

    private final boolean zzH() {
        return this.zzs != this.zzp;
    }

    private final void zzI(zzv zzvVar, zzlh zzlhVar) {
        zzv zzvVar2 = this.zzg;
        zzq zzqVar = zzvVar2 == null ? null : zzvVar2.zzs;
        this.zzg = zzvVar;
        zzq zzqVar2 = zzvVar.zzs;
        zzto zztoVar = this.zzd;
        zzlhVar.zzb = zzvVar.zzb(zztoVar.zzb(zzvVar));
        zzlhVar.zza = this.zzh;
        if (zzvVar2 == null || !Objects.equals(zzqVar, zzqVar2)) {
            zzth zza = zztoVar.zza(this.zze, zzvVar);
            this.zzh = zza;
            zzlhVar.zza = zza;
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

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzb(zzj zzjVar, int i, boolean z, int i2) throws IOException {
        return this.zza.zzg(zzjVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzd(zzer zzerVar, int i, int i2) {
        this.zza.zzh(zzerVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, int i, int i2, int i3, zzagg zzaggVar) {
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
                    zzee.zzc("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(valueOf)));
                    this.zzB = true;
                }
                i |= 1;
            }
        }
        zzG(j, i, (this.zza.zzf() - i2) - i3, i2, zzaggVar);
    }

    public final void zzf() {
        zzg(true);
        zzF();
    }

    public final void zzg(boolean z) {
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

    public final void zzh(long j) {
        this.zzt = j;
    }

    public final int zzi() {
        return this.zzq + this.zzp;
    }

    public final void zzj() {
        zzx();
        zzF();
    }

    public final void zzk() throws IOException {
        zzth zzthVar = this.zzh;
        if (zzthVar != null) {
            throw zzthVar.zza();
        }
    }

    public final int zzl() {
        return this.zzq;
    }

    public final int zzm() {
        return this.zzq + this.zzs;
    }

    public final synchronized zzv zzn() {
        if (this.zzy) {
            return null;
        }
        return this.zzz;
    }

    public final synchronized long zzo() {
        return this.zzv;
    }

    public final synchronized boolean zzp() {
        return this.zzw;
    }

    public final synchronized boolean zzq(boolean z) {
        boolean z2 = true;
        if (zzH()) {
            if (((zzxz) this.zzc.zza(this.zzq + this.zzs)).zza != this.zzg) {
                return true;
            }
            return zzJ(zzM(this.zzs));
        }
        if (!z && !this.zzw) {
            zzv zzvVar = this.zzz;
            if (zzvVar == null) {
                z2 = false;
            } else if (zzvVar == this.zzg) {
                return false;
            }
        }
        return z2;
    }

    public final int zzr(zzlh zzlhVar, zzih zzihVar, int i, boolean z) {
        boolean z2 = (i & 2) != 0;
        zzxx zzxxVar = this.zzb;
        int zzB = zzB(zzlhVar, zzihVar, z2, z, zzxxVar);
        if (zzB != -4) {
            return zzB;
        }
        if (!zzihVar.zzb()) {
            int i2 = i & 1;
            if ((i & 4) == 0) {
                if (i2 != 0) {
                    this.zza.zzd(zzihVar, zzxxVar);
                    return -4;
                }
                this.zza.zzc(zzihVar, zzxxVar);
            } else if (i2 != 0) {
                return -4;
            }
            this.zzs++;
        }
        return -4;
    }

    public final synchronized boolean zzs(int i) {
        zzA();
        int i2 = this.zzq;
        if (i >= i2 && i <= this.zzp + i2) {
            this.zzt = Long.MIN_VALUE;
            this.zzs = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean zzt(long j, boolean z) {
        Throwable th;
        zzyb zzybVar;
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
                                        zzybVar = this;
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
                                    zzybVar = this;
                                } else {
                                    zzybVar = this;
                                    j2 = j;
                                    i = -1;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        zzybVar = this;
                        j2 = j;
                        i = zzybVar.zzK(zzM, this.zzp - i2, j2, true);
                    }
                    if (i == -1) {
                        return false;
                    }
                    zzybVar.zzt = j2;
                    zzybVar.zzs += i;
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

    public final synchronized int zzu(long j, boolean z) {
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

    public final synchronized void zzv(int i) {
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
        zzgrc.zza(z);
        this.zzs += i;
    }

    public final void zzw(long j, boolean z, boolean z2) {
        this.zza.zze(zzD(j, false, z2));
    }

    public final void zzx() {
        this.zza.zze(zzE());
    }

    public final void zzy(zzya zzyaVar) {
        this.zzf = zzyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzz(zzv zzvVar) {
        boolean zzC = zzC(zzvVar);
        zzya zzyaVar = this.zzf;
        if (zzyaVar == null || !zzC) {
            return;
        }
        zzyaVar.zzy(zzvVar);
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

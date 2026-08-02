package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzaiq implements zzack, zzadi {
    private zzagr zzA;
    private final zzajy zza;
    private final int zzb;
    private final zzek zzc;
    private final zzek zzd;
    private final zzek zze;
    private final zzek zzf;
    private final ArrayDeque zzg;
    private final zzaiu zzh;
    private final List zzi;
    private zzfxr zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private int zzn;
    private zzek zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private zzacn zzu;
    private zzaip[] zzv;
    private long[][] zzw;
    private int zzx;
    private long zzy;
    private int zzz;

    @Deprecated
    public zzaiq() {
        this(zzajy.zza, 16);
    }

    private static int zzk(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzl(zzaiz zzaizVar, long j) {
        int zza = zzaizVar.zza(j);
        return zza == -1 ? zzaizVar.zzb(j) : zza;
    }

    private static long zzm(zzaiz zzaizVar, long j, long j2) {
        int zzl = zzl(zzaizVar, j);
        return zzl == -1 ? j2 : Math.min(zzaizVar.zzc[zzl], j2);
    }

    private final void zzn() {
        this.zzk = 0;
        this.zzn = 0;
    }

    private final void zzo(long j) throws zzbo {
        zzbk zzbkVar;
        long j2;
        List list;
        zzbk zzbkVar2;
        int i;
        int i2;
        while (!this.zzg.isEmpty() && ((zzahv) this.zzg.peek()).zza == j) {
            zzahv zzahvVar = (zzahv) this.zzg.pop();
            if (zzahvVar.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i3 = this.zzz;
                zzacy zzacyVar = new zzacy();
                zzahw zzb = zzahvVar.zzb(1969517665);
                if (zzb != null) {
                    zzbk zzb2 = zzaif.zzb(zzb);
                    zzacyVar.zzb(zzb2);
                    zzbkVar = zzb2;
                } else {
                    zzbkVar = null;
                }
                zzahv zza = zzahvVar.zza(1835365473);
                zzbk zza2 = zza != null ? zzaif.zza(zza) : null;
                zzbj[] zzbjVarArr = new zzbj[1];
                zzahw zzb3 = zzahvVar.zzb(1836476516);
                zzb3.getClass();
                boolean z = i3 == 1;
                zzbjVarArr[0] = zzaif.zzc(zzb3.zza);
                zzbk zzbkVar3 = new zzbk(-9223372036854775807L, zzbjVarArr);
                zzbk zzbkVar4 = zzbkVar;
                long j3 = -9223372036854775807L;
                List zzd = zzaif.zzd(zzahvVar, zzacyVar, -9223372036854775807L, null, 1 == (this.zzb & 1), z, new zzful() { // from class: com.google.android.gms.internal.ads.zzaio
                    @Override // com.google.android.gms.internal.ads.zzful
                    public final Object apply(Object obj) {
                        return (zzaiw) obj;
                    }
                });
                long j4 = -9223372036854775807L;
                int i4 = 0;
                int i5 = -1;
                int i6 = 0;
                while (true) {
                    j2 = 0;
                    if (i6 >= zzd.size()) {
                        break;
                    }
                    zzaiz zzaizVar = (zzaiz) zzd.get(i6);
                    if (zzaizVar.zzb == 0) {
                        list = zzd;
                    } else {
                        zzaiw zzaiwVar = zzaizVar.zza;
                        list = zzd;
                        long j5 = zzaiwVar.zze;
                        if (j5 == j3) {
                            j5 = zzaizVar.zzh;
                        }
                        long max = Math.max(j4, j5);
                        int i7 = i4 + 1;
                        zzaip zzaipVar = new zzaip(zzaiwVar, zzaizVar, this.zzu.zzw(i4, zzaiwVar.zzb));
                        int i8 = "audio/true-hd".equals(zzaiwVar.zzf.zzm) ? zzaizVar.zze * 16 : zzaizVar.zze + 30;
                        zzad zzb4 = zzaiwVar.zzf.zzb();
                        zzb4.zzP(i8);
                        if (zzaiwVar.zzb == 2) {
                            if ((this.zzb & 8) != 0) {
                                zzb4.zzV(zzaiwVar.zzf.zzf | (i5 == -1 ? 1 : 2));
                            }
                            if (j5 > 0 && (i2 = zzaizVar.zzb) > 0) {
                                zzb4.zzH(i2 / (j5 / 1000000.0f));
                            }
                        }
                        if (zzaiwVar.zzb == 1 && zzacyVar.zza()) {
                            zzb4.zzF(zzacyVar.zza);
                            zzb4.zzG(zzacyVar.zzb);
                        }
                        int i9 = zzaiwVar.zzb;
                        zzbk[] zzbkVarArr = new zzbk[3];
                        if (this.zzi.isEmpty()) {
                            i = 0;
                            zzbkVar2 = null;
                        } else {
                            zzbkVar2 = new zzbk(this.zzi);
                            i = 0;
                        }
                        zzbkVarArr[i] = zzbkVar2;
                        zzbkVarArr[1] = zzbkVar4;
                        zzbkVarArr[2] = zzbkVar3;
                        int i10 = i5;
                        zzbk zzbkVar5 = new zzbk(-9223372036854775807L, new zzbj[i]);
                        if (zza2 != null) {
                            for (int i11 = 0; i11 < zza2.zza(); i11++) {
                                zzbj zzb5 = zza2.zzb(i11);
                                if (zzb5 instanceof zzex) {
                                    zzex zzexVar = (zzex) zzb5;
                                    if (!zzexVar.zza.equals("com.android.capture.fps")) {
                                        zzbkVar5 = zzbkVar5.zzc(zzexVar);
                                    } else if (i9 == 2) {
                                        zzbkVar5 = zzbkVar5.zzc(zzexVar);
                                    }
                                }
                            }
                        }
                        for (int i12 = 0; i12 < 3; i12++) {
                            zzbkVar5 = zzbkVar5.zzd(zzbkVarArr[i12]);
                        }
                        if (zzbkVar5.zza() > 0) {
                            zzb4.zzQ(zzbkVar5);
                        }
                        zzaipVar.zzc.zzl(zzb4.zzad());
                        if (zzaiwVar.zzb == 2 && i10 == -1) {
                            i5 = arrayList.size();
                            arrayList.add(zzaipVar);
                            i4 = i7;
                            j4 = max;
                        }
                        i5 = i10;
                        arrayList.add(zzaipVar);
                        i4 = i7;
                        j4 = max;
                    }
                    i6++;
                    zzd = list;
                    j3 = -9223372036854775807L;
                }
                this.zzx = i5;
                this.zzy = j4;
                zzaip[] zzaipVarArr = (zzaip[]) arrayList.toArray(new zzaip[0]);
                this.zzv = zzaipVarArr;
                int length = zzaipVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i13 = 0; i13 < zzaipVarArr.length; i13++) {
                    jArr[i13] = new long[zzaipVarArr[i13].zzb.zzb];
                    jArr2[i13] = zzaipVarArr[i13].zzb.zzf[0];
                }
                int i14 = 0;
                while (i14 < zzaipVarArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i15 = -1;
                    for (int i16 = 0; i16 < zzaipVarArr.length; i16++) {
                        if (!zArr[i16]) {
                            long j7 = jArr2[i16];
                            if (j7 <= j6) {
                                i15 = i16;
                                j6 = j7;
                            }
                        }
                    }
                    int i17 = iArr[i15];
                    long[] jArr3 = jArr[i15];
                    jArr3[i17] = j2;
                    zzaiz zzaizVar2 = zzaipVarArr[i15].zzb;
                    j2 += zzaizVar2.zzd[i17];
                    int i18 = i17 + 1;
                    iArr[i15] = i18;
                    if (i18 < jArr3.length) {
                        jArr2[i15] = zzaizVar2.zzf[i18];
                    } else {
                        zArr[i15] = true;
                        i14++;
                    }
                }
                this.zzw = jArr;
                this.zzu.zzD();
                this.zzu.zzO(this);
                this.zzg.clear();
                this.zzk = 2;
            } else if (!this.zzg.isEmpty()) {
                ((zzahv) this.zzg.peek()).zzc(zzahvVar);
            }
        }
        if (this.zzk != 2) {
            zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        if ((this.zzb & 16) == 0) {
            zzacnVar = new zzakc(zzacnVar, this.zza);
        }
        this.zzu = zzacnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j) {
        long j2;
        long j3;
        int zzb;
        zzaip[] zzaipVarArr = this.zzv;
        if (zzaipVarArr.length == 0) {
            zzadj zzadjVar = zzadj.zza;
            return new zzadg(zzadjVar, zzadjVar);
        }
        int i = this.zzx;
        long j4 = -1;
        if (i != -1) {
            zzaiz zzaizVar = zzaipVarArr[i].zzb;
            int zzl = zzl(zzaizVar, j);
            if (zzl == -1) {
                zzadj zzadjVar2 = zzadj.zza;
                return new zzadg(zzadjVar2, zzadjVar2);
            }
            long j5 = zzaizVar.zzf[zzl];
            j2 = zzaizVar.zzc[zzl];
            if (j5 >= j || zzl >= zzaizVar.zzb - 1 || (zzb = zzaizVar.zzb(j)) == -1 || zzb == zzl) {
                j3 = -9223372036854775807L;
            } else {
                j3 = zzaizVar.zzf[zzb];
                j4 = zzaizVar.zzc[zzb];
            }
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            zzaip[] zzaipVarArr2 = this.zzv;
            if (i2 >= zzaipVarArr2.length) {
                break;
            }
            if (i2 != this.zzx) {
                zzaiz zzaizVar2 = zzaipVarArr2[i2].zzb;
                long zzm = zzm(zzaizVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = zzm(zzaizVar2, j3, j4);
                }
                j2 = zzm;
            }
            i2++;
        }
        zzadj zzadjVar3 = new zzadj(j, j2);
        return j3 == -9223372036854775807L ? new zzadg(zzadjVar3, zzadjVar3) : new zzadg(zzadjVar3, new zzadj(j3, j4));
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j, long j2) {
        this.zzg.clear();
        this.zzn = 0;
        this.zzp = -1;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        if (j == 0) {
            if (this.zzk != 3) {
                zzn();
                return;
            } else {
                this.zzh.zzb();
                this.zzi.clear();
                return;
            }
        }
        for (zzaip zzaipVar : this.zzv) {
            zzaiz zzaizVar = zzaipVar.zzb;
            int zza = zzaizVar.zza(j2);
            if (zza == -1) {
                zza = zzaizVar.zzb(j2);
            }
            zzaipVar.zze = zza;
            zzadq zzadqVar = zzaipVar.zzd;
            if (zzadqVar != null) {
                zzadqVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) throws IOException {
        zzadm zzb = zzaiv.zzb(zzaclVar, (this.zzb & 2) != 0);
        this.zzj = zzb != null ? zzfxr.zzn(zzb) : zzfxr.zzm();
        return zzb == null;
    }

    public zzaiq(zzajy zzajyVar, int i) {
        this.zza = zzajyVar;
        this.zzb = i;
        this.zzj = zzfxr.zzm();
        this.zzk = (i & 4) != 0 ? 3 : 0;
        this.zzh = new zzaiu();
        this.zzi = new ArrayList();
        this.zzf = new zzek(16);
        this.zzg = new ArrayDeque();
        this.zzc = new zzek(zzfh.zza);
        this.zzd = new zzek(4);
        this.zze = new zzek();
        this.zzp = -1;
        this.zzu = zzacn.zza;
        this.zzv = new zzaip[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x03e4, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:214:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0095 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
        boolean z;
        boolean z2;
        while (true) {
            int i = this.zzk;
            if (i == 0) {
                if (this.zzn == 0) {
                    if (!zzaclVar.zzn(this.zzf.zzM(), 0, 8, true)) {
                        if (this.zzz != 2 || (this.zzb & 2) == 0) {
                            return -1;
                        }
                        zzadp zzw = this.zzu.zzw(0, 4);
                        zzagr zzagrVar = this.zzA;
                        zzbk zzbkVar = zzagrVar == null ? null : new zzbk(-9223372036854775807L, zzagrVar);
                        zzad zzadVar = new zzad();
                        zzadVar.zzQ(zzbkVar);
                        zzw.zzl(zzadVar.zzad());
                        this.zzu.zzD();
                        this.zzu.zzO(new zzadh(-9223372036854775807L, 0L));
                        return -1;
                    }
                    this.zzn = 8;
                    this.zzf.zzK(0);
                    this.zzm = this.zzf.zzu();
                    this.zzl = this.zzf.zzg();
                }
                long j = this.zzm;
                if (j == 1) {
                    zzaclVar.zzi(this.zzf.zzM(), 8, 8);
                    this.zzn += 8;
                    this.zzm = this.zzf.zzv();
                } else if (j == 0) {
                    long zzd = zzaclVar.zzd();
                    if (zzd == -1) {
                        zzahv zzahvVar = (zzahv) this.zzg.peek();
                        zzd = zzahvVar != null ? zzahvVar.zza : -1L;
                    }
                    if (zzd != -1) {
                        this.zzm = (zzd - zzaclVar.zzf()) + this.zzn;
                    }
                }
                long j2 = this.zzm;
                int i2 = this.zzn;
                if (j2 < i2) {
                    throw zzbo.zzc("Atom size less than header length (unsupported).");
                }
                int i3 = this.zzl;
                if (i3 == 1836019574 || i3 == 1953653099 || i3 == 1835297121 || i3 == 1835626086 || i3 == 1937007212 || i3 == 1701082227 || i3 == 1835365473) {
                    long zzf = zzaclVar.zzf();
                    long j3 = this.zzm;
                    long j4 = zzf + j3;
                    long j5 = this.zzn;
                    if (j3 != j5 && this.zzl == 1835365473) {
                        this.zze.zzH(8);
                        zzaclVar.zzh(this.zze.zzM(), 0, 8);
                        zzaif.zze(this.zze);
                        zzaclVar.zzk(this.zze.zzd());
                        zzaclVar.zzj();
                    }
                    long j6 = j4 - j5;
                    this.zzg.push(new zzahv(this.zzl, j6));
                    if (this.zzm == this.zzn) {
                        zzo(j6);
                    } else {
                        zzn();
                    }
                } else if (i3 == 1835296868 || i3 == 1836476516 || i3 == 1751411826 || i3 == 1937011556 || i3 == 1937011827 || i3 == 1937011571 || i3 == 1668576371 || i3 == 1701606260 || i3 == 1937011555 || i3 == 1937011578 || i3 == 1937013298 || i3 == 1937007471 || i3 == 1668232756 || i3 == 1953196132 || i3 == 1718909296 || i3 == 1969517665 || i3 == 1801812339 || i3 == 1768715124) {
                    boolean z3 = false;
                    zzdi.zzf(z3);
                    zzdi.zzf(this.zzm <= 2147483647L);
                    zzek zzekVar = new zzek((int) this.zzm);
                    System.arraycopy(this.zzf.zzM(), 0, zzekVar.zzM(), 0, 8);
                    this.zzo = zzekVar;
                    this.zzk = 1;
                } else {
                    long zzf2 = zzaclVar.zzf();
                    long j7 = this.zzn;
                    long j8 = zzf2 - j7;
                    if (this.zzl == 1836086884) {
                        this.zzA = new zzagr(0L, j8, -9223372036854775807L, j8 + j7, this.zzm - j7);
                    }
                    this.zzo = null;
                    this.zzk = 1;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        this.zzh.zza(zzaclVar, zzadfVar, this.zzi);
                        if (zzadfVar.zza == 0) {
                            zzn();
                        }
                        return 1;
                    }
                    long zzf3 = zzaclVar.zzf();
                    int i4 = this.zzp;
                    if (i4 == -1) {
                        long j9 = Long.MAX_VALUE;
                        long j10 = Long.MAX_VALUE;
                        long j11 = Long.MAX_VALUE;
                        int i5 = 0;
                        boolean z4 = true;
                        int i6 = -1;
                        int i7 = -1;
                        boolean z5 = true;
                        while (true) {
                            zzaip[] zzaipVarArr = this.zzv;
                            if (i5 >= zzaipVarArr.length) {
                                break;
                            }
                            zzaip zzaipVar = zzaipVarArr[i5];
                            int i8 = zzaipVar.zze;
                            zzaiz zzaizVar = zzaipVar.zzb;
                            if (i8 != zzaizVar.zzb) {
                                long j12 = zzaizVar.zzc[i8];
                                long[][] jArr = this.zzw;
                                int i9 = zzet.zza;
                                long j13 = jArr[i5][i8];
                                long j14 = j12 - zzf3;
                                boolean z6 = j14 < 0 || j14 >= 262144;
                                if (z6) {
                                    z = z5;
                                } else {
                                    if (!z5) {
                                        z = false;
                                    }
                                    z5 = z6;
                                    i7 = i5;
                                    j11 = j14;
                                    j10 = j13;
                                    if (j13 < j9) {
                                        z4 = z6;
                                        i6 = i5;
                                        j9 = j13;
                                    }
                                }
                                if (z6 != z || j14 >= j11) {
                                    z5 = z;
                                    if (j13 < j9) {
                                    }
                                }
                                z5 = z6;
                                i7 = i5;
                                j11 = j14;
                                j10 = j13;
                                if (j13 < j9) {
                                }
                            }
                            i5++;
                        }
                        i4 = (j9 == Long.MAX_VALUE || !z4 || j10 < j9 + 10485760) ? i7 : i6;
                        this.zzp = i4;
                        if (i4 == -1) {
                            return -1;
                        }
                    }
                    zzaip zzaipVar2 = this.zzv[i4];
                    zzadp zzadpVar = zzaipVar2.zzc;
                    int i10 = zzaipVar2.zze;
                    zzaiz zzaizVar2 = zzaipVar2.zzb;
                    long j15 = zzaizVar2.zzc[i10];
                    int i11 = zzaizVar2.zzd[i10];
                    zzadq zzadqVar = zzaipVar2.zzd;
                    long j16 = (j15 - zzf3) + this.zzq;
                    if (j16 < 0 || j16 >= 262144) {
                        zzadfVar.zza = j15;
                        return 1;
                    }
                    if (zzaipVar2.zza.zzg == 1) {
                        j16 += 8;
                        i11 -= 8;
                    }
                    zzaclVar.zzk((int) j16);
                    zzaiw zzaiwVar = zzaipVar2.zza;
                    int i12 = zzaiwVar.zzj;
                    if (i12 == 0) {
                        if ("audio/ac4".equals(zzaiwVar.zzf.zzm)) {
                            if (this.zzr == 0) {
                                zzabm.zzb(i11, this.zze);
                                zzadpVar.zzq(this.zze, 7);
                                this.zzr += 7;
                            }
                            i11 += 7;
                        } else if (zzadqVar != null) {
                            zzadqVar.zzd(zzaclVar);
                        }
                        while (true) {
                            int i13 = this.zzr;
                            if (i13 >= i11) {
                                break;
                            }
                            int zzf4 = zzadpVar.zzf(zzaclVar, i11 - i13, false);
                            this.zzq += zzf4;
                            this.zzr += zzf4;
                            this.zzs -= zzf4;
                        }
                    } else {
                        byte[] zzM = this.zzd.zzM();
                        zzM[0] = 0;
                        zzM[1] = 0;
                        zzM[2] = 0;
                        int i14 = 4 - i12;
                        while (this.zzr < i11) {
                            int i15 = this.zzs;
                            if (i15 == 0) {
                                zzaclVar.zzi(zzM, i14, i12);
                                this.zzq += i12;
                                this.zzd.zzK(0);
                                int zzg = this.zzd.zzg();
                                if (zzg < 0) {
                                    throw zzbo.zza("Invalid NAL length", null);
                                }
                                this.zzs = zzg;
                                this.zzc.zzK(0);
                                zzadpVar.zzq(this.zzc, 4);
                                this.zzr += 4;
                                i11 += i14;
                            } else {
                                int zzf5 = zzadpVar.zzf(zzaclVar, i15, false);
                                this.zzq += zzf5;
                                this.zzr += zzf5;
                                this.zzs -= zzf5;
                            }
                        }
                    }
                    zzaiz zzaizVar3 = zzaipVar2.zzb;
                    long j17 = zzaizVar3.zzf[i10];
                    int i16 = zzaizVar3.zzg[i10];
                    if (zzadqVar != null) {
                        zzadqVar.zzc(zzadpVar, j17, i16, i11, 0, null);
                        if (i10 + 1 == zzaipVar2.zzb.zzb) {
                            zzadqVar.zza(zzadpVar, null);
                        }
                    } else {
                        zzadpVar.zzs(j17, i16, i11, 0, null);
                    }
                    zzaipVar2.zze++;
                    this.zzp = -1;
                    this.zzq = 0;
                    this.zzr = 0;
                    this.zzs = 0;
                    return 0;
                }
                long j18 = this.zzm - this.zzn;
                long zzf6 = zzaclVar.zzf() + j18;
                zzek zzekVar2 = this.zzo;
                if (zzekVar2 != null) {
                    zzaclVar.zzi(zzekVar2.zzM(), this.zzn, (int) j18);
                    if (this.zzl == 1718909296) {
                        this.zzt = true;
                        zzekVar2.zzK(8);
                        int zzk = zzk(zzekVar2.zzg());
                        if (zzk == 0) {
                            zzekVar2.zzL(4);
                            while (true) {
                                if (zzekVar2.zzb() <= 0) {
                                    zzk = 0;
                                    break;
                                }
                                zzk = zzk(zzekVar2.zzg());
                                if (zzk != 0) {
                                    break;
                                }
                            }
                        }
                        this.zzz = zzk;
                    } else if (!this.zzg.isEmpty()) {
                        ((zzahv) this.zzg.peek()).zzd(new zzahw(this.zzl, zzekVar2));
                    }
                } else {
                    if (!this.zzt && this.zzl == 1835295092) {
                        this.zzz = 1;
                    }
                    if (j18 < 262144) {
                        zzaclVar.zzk((int) j18);
                    } else {
                        zzadfVar.zza = zzaclVar.zzf() + j18;
                        z2 = true;
                        zzo(zzf6);
                        if (z2 && this.zzk != 2) {
                            return 1;
                        }
                    }
                }
                z2 = false;
                zzo(zzf6);
                if (z2) {
                    return 1;
                }
                continue;
            }
        }
    }
}

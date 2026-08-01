package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzail implements zzace, zzade {
    public static final zzacl zza = new zzacl() { // from class: com.google.android.gms.internal.ads.zzaij
        @Override // com.google.android.gms.internal.ads.zzacl
        public final /* synthetic */ zzace[] zza(Uri uri, Map map) {
            int i = zzack.zza;
            zzacl zzaclVar = zzail.zza;
            return new zzace[]{new zzail(0)};
        }
    };
    private final zzfj zzb;
    private final zzfj zzc;
    private final zzfj zzd;
    private final zzfj zze;
    private final ArrayDeque zzf;
    private final zzain zzg;
    private final List zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private int zzl;
    private zzfj zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private zzach zzs;
    private zzaik[] zzt;
    private long[][] zzu;
    private int zzv;
    private long zzw;
    private int zzx;
    private zzago zzy;

    public zzail() {
        this(0);
    }

    private static int zzf(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzi(zzais zzaisVar, long j) {
        int zza2 = zzaisVar.zza(j);
        return zza2 == -1 ? zzaisVar.zzb(j) : zza2;
    }

    private static long zzj(zzais zzaisVar, long j, long j2) {
        int zzi = zzi(zzaisVar, j);
        return zzi == -1 ? j2 : Math.min(zzaisVar.zzc[zzi], j2);
    }

    private final void zzk() {
        this.zzi = 0;
        this.zzl = 0;
    }

    private final void zzl(long j) throws zzcf {
        zzcb zzcbVar;
        long j2;
        List list;
        int i;
        int i2;
        zzcb zzcbVar2;
        int i3;
        zzacu zzacuVar;
        while (!this.zzf.isEmpty() && ((zzahq) this.zzf.peek()).zza == j) {
            zzahq zzahqVar = (zzahq) this.zzf.pop();
            if (zzahqVar.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i4 = this.zzx;
                zzacu zzacuVar2 = new zzacu();
                zzahr zzb = zzahqVar.zzb(1969517665);
                if (zzb != null) {
                    zzcb zzb2 = zzaia.zzb(zzb);
                    zzacuVar2.zzb(zzb2);
                    zzcbVar = zzb2;
                } else {
                    zzcbVar = null;
                }
                zzahq zza2 = zzahqVar.zza(1835365473);
                zzcb zza3 = zza2 != null ? zzaia.zza(zza2) : null;
                zzca[] zzcaVarArr = new zzca[1];
                zzahr zzb3 = zzahqVar.zzb(1836476516);
                zzb3.getClass();
                boolean z = i4 == 1;
                zzcaVarArr[0] = zzaia.zzc(zzb3.zza);
                zzcb zzcbVar3 = new zzcb(-9223372036854775807L, zzcaVarArr);
                zzcb zzcbVar4 = zzcbVar;
                long j3 = -9223372036854775807L;
                List zzd = zzaia.zzd(zzahqVar, zzacuVar2, -9223372036854775807L, null, false, z, new zzftn() { // from class: com.google.android.gms.internal.ads.zzaii
                    @Override // com.google.android.gms.internal.ads.zzftn
                    public final Object apply(Object obj) {
                        zzaip zzaipVar = (zzaip) obj;
                        zzacl zzaclVar = zzail.zza;
                        return zzaipVar;
                    }
                });
                int size = zzd.size();
                long j4 = -9223372036854775807L;
                int i5 = -1;
                int i6 = 0;
                while (true) {
                    j2 = 0;
                    if (i6 >= size) {
                        break;
                    }
                    zzais zzaisVar = (zzais) zzd.get(i6);
                    if (zzaisVar.zzb == 0) {
                        list = zzd;
                        i = size;
                        zzacuVar = zzacuVar2;
                    } else {
                        zzaip zzaipVar = zzaisVar.zza;
                        list = zzd;
                        long j5 = zzaipVar.zze;
                        if (j5 == j3) {
                            j5 = zzaisVar.zzh;
                        }
                        long max = Math.max(j4, j5);
                        i = size;
                        zzaik zzaikVar = new zzaik(zzaipVar, zzaisVar, this.zzs.zzw(i6, zzaipVar.zzb));
                        int i7 = "audio/true-hd".equals(zzaipVar.zzf.zzm) ? zzaisVar.zze * 16 : zzaisVar.zze + 30;
                        zzak zzb4 = zzaipVar.zzf.zzb();
                        zzb4.zzN(i7);
                        if (zzaipVar.zzb != 2 || j5 <= 0) {
                            i2 = 1;
                        } else {
                            int i8 = zzaisVar.zzb;
                            i2 = 1;
                            if (i8 > 1) {
                                zzb4.zzG(i8 / (j5 / 1000000.0f));
                            }
                        }
                        int i9 = zzaipVar.zzb;
                        int i10 = zzaih.zzb;
                        if (i9 == i2 && zzacuVar2.zza()) {
                            zzb4.zzE(zzacuVar2.zza);
                            zzb4.zzF(zzacuVar2.zzb);
                        }
                        int i11 = zzaipVar.zzb;
                        zzcb[] zzcbVarArr = new zzcb[3];
                        if (this.zzh.isEmpty()) {
                            i3 = 0;
                            zzcbVar2 = null;
                        } else {
                            zzcbVar2 = new zzcb(this.zzh);
                            i3 = 0;
                        }
                        zzcbVarArr[i3] = zzcbVar2;
                        zzcbVarArr[i2] = zzcbVar4;
                        zzcbVarArr[2] = zzcbVar3;
                        zzacuVar = zzacuVar2;
                        zzcb zzcbVar5 = new zzcb(-9223372036854775807L, new zzca[i3]);
                        if (zza3 != null) {
                            for (int i12 = i3; i12 < zza3.zza(); i12++) {
                                zzca zzb5 = zza3.zzb(i12);
                                if (zzb5 instanceof zzfw) {
                                    zzfw zzfwVar = (zzfw) zzb5;
                                    if (!zzfwVar.zza.equals("com.android.capture.fps")) {
                                        zzcbVar5 = zzcbVar5.zzc(zzfwVar);
                                    } else if (i11 == 2) {
                                        zzcbVar5 = zzcbVar5.zzc(zzfwVar);
                                    }
                                }
                            }
                        }
                        for (int i13 = 0; i13 < 3; i13++) {
                            zzcbVar5 = zzcbVar5.zzd(zzcbVarArr[i13]);
                        }
                        if (zzcbVar5.zza() > 0) {
                            zzb4.zzO(zzcbVar5);
                        }
                        zzaikVar.zzc.zzl(zzb4.zzac());
                        if (zzaipVar.zzb == 2 && i5 == -1) {
                            i5 = arrayList.size();
                        }
                        arrayList.add(zzaikVar);
                        j4 = max;
                    }
                    i6++;
                    zzacuVar2 = zzacuVar;
                    zzd = list;
                    size = i;
                    j3 = -9223372036854775807L;
                }
                this.zzv = i5;
                this.zzw = j4;
                zzaik[] zzaikVarArr = (zzaik[]) arrayList.toArray(new zzaik[0]);
                this.zzt = zzaikVarArr;
                int length = zzaikVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i14 = 0; i14 < zzaikVarArr.length; i14++) {
                    jArr[i14] = new long[zzaikVarArr[i14].zzb.zzb];
                    jArr2[i14] = zzaikVarArr[i14].zzb.zzf[0];
                }
                int i15 = 0;
                while (i15 < zzaikVarArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i16 = -1;
                    for (int i17 = 0; i17 < zzaikVarArr.length; i17++) {
                        if (!zArr[i17]) {
                            long j7 = jArr2[i17];
                            if (j7 <= j6) {
                                i16 = i17;
                                j6 = j7;
                            }
                        }
                    }
                    int i18 = iArr[i16];
                    long[] jArr3 = jArr[i16];
                    jArr3[i18] = j2;
                    zzais zzaisVar2 = zzaikVarArr[i16].zzb;
                    j2 += zzaisVar2.zzd[i18];
                    int i19 = i18 + 1;
                    iArr[i16] = i19;
                    if (i19 < jArr3.length) {
                        jArr2[i16] = zzaisVar2.zzf[i19];
                    } else {
                        zArr[i16] = true;
                        i15++;
                    }
                }
                this.zzu = jArr;
                this.zzs.zzD();
                this.zzs.zzO(this);
                this.zzf.clear();
                this.zzi = 2;
            } else if (!this.zzf.isEmpty()) {
                ((zzahq) this.zzf.peek()).zzc(zzahqVar);
            }
        }
        if (this.zzi != 2) {
            zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final long zza() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzc(zzach zzachVar) {
        this.zzs = zzachVar;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzd(long j, long j2) {
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if (j == 0) {
            zzk();
            return;
        }
        for (zzaik zzaikVar : this.zzt) {
            zzais zzaisVar = zzaikVar.zzb;
            int zza2 = zzaisVar.zza(j2);
            if (zza2 == -1) {
                zza2 = zzaisVar.zzb(j2);
            }
            zzaikVar.zze = zza2;
            zzadl zzadlVar = zzaikVar.zzd;
            if (zzadlVar != null) {
                zzadlVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final boolean zze(zzacf zzacfVar) throws IOException {
        return zzaio.zzb(zzacfVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final zzadc zzg(long j) {
        long j2;
        long j3;
        int zzb;
        zzaik[] zzaikVarArr = this.zzt;
        if (zzaikVarArr.length == 0) {
            zzadf zzadfVar = zzadf.zza;
            return new zzadc(zzadfVar, zzadfVar);
        }
        int i = this.zzv;
        long j4 = -1;
        if (i != -1) {
            zzais zzaisVar = zzaikVarArr[i].zzb;
            int zzi = zzi(zzaisVar, j);
            if (zzi == -1) {
                zzadf zzadfVar2 = zzadf.zza;
                return new zzadc(zzadfVar2, zzadfVar2);
            }
            long j5 = zzaisVar.zzf[zzi];
            j2 = zzaisVar.zzc[zzi];
            if (j5 >= j || zzi >= zzaisVar.zzb - 1 || (zzb = zzaisVar.zzb(j)) == -1 || zzb == zzi) {
                j3 = -9223372036854775807L;
            } else {
                j3 = zzaisVar.zzf[zzb];
                j4 = zzaisVar.zzc[zzb];
            }
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            zzaik[] zzaikVarArr2 = this.zzt;
            if (i2 >= zzaikVarArr2.length) {
                break;
            }
            if (i2 != this.zzv) {
                zzais zzaisVar2 = zzaikVarArr2[i2].zzb;
                long zzj = zzj(zzaisVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = zzj(zzaisVar2, j3, j4);
                }
                j2 = zzj;
            }
            i2++;
        }
        zzadf zzadfVar3 = new zzadf(j, j2);
        return j3 == -9223372036854775807L ? new zzadc(zzadfVar3, zzadfVar3) : new zzadc(zzadfVar3, new zzadf(j3, j4));
    }

    @Override // com.google.android.gms.internal.ads.zzade
    public final boolean zzh() {
        return true;
    }

    public zzail(int i) {
        this.zzi = 0;
        this.zzg = new zzain();
        this.zzh = new ArrayList();
        this.zze = new zzfj(16);
        this.zzf = new ArrayDeque();
        this.zzb = new zzfj(zzgg.zza);
        this.zzc = new zzfj(4);
        this.zzd = new zzfj();
        this.zzn = -1;
        this.zzs = zzach.zza;
        this.zzt = new zzaik[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x038a, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:198:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0081 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzace
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        boolean z;
        boolean z2;
        while (true) {
            int i = this.zzi;
            if (i == 0) {
                if (this.zzl == 0) {
                    if (!zzacfVar.zzn(this.zze.zzI(), 0, 8, true)) {
                        return -1;
                    }
                    this.zzl = 8;
                    this.zze.zzG(0);
                    this.zzk = this.zze.zzt();
                    this.zzj = this.zze.zzf();
                }
                long j = this.zzk;
                if (j == 1) {
                    zzacfVar.zzi(this.zze.zzI(), 8, 8);
                    this.zzl += 8;
                    this.zzk = this.zze.zzu();
                } else if (j == 0) {
                    long zzd = zzacfVar.zzd();
                    if (zzd == -1) {
                        zzahq zzahqVar = (zzahq) this.zzf.peek();
                        zzd = zzahqVar != null ? zzahqVar.zza : -1L;
                    }
                    if (zzd != -1) {
                        this.zzk = (zzd - zzacfVar.zzf()) + this.zzl;
                    }
                }
                long j2 = this.zzk;
                int i2 = this.zzl;
                if (j2 < i2) {
                    throw zzcf.zzc("Atom size less than header length (unsupported).");
                }
                int i3 = this.zzj;
                if (i3 == 1836019574 || i3 == 1953653099 || i3 == 1835297121 || i3 == 1835626086 || i3 == 1937007212 || i3 == 1701082227 || i3 == 1835365473) {
                    long zzf = zzacfVar.zzf();
                    long j3 = this.zzk;
                    long j4 = zzf + j3;
                    long j5 = this.zzl;
                    if (j3 != j5 && this.zzj == 1835365473) {
                        this.zzd.zzD(8);
                        zzacfVar.zzh(this.zzd.zzI(), 0, 8);
                        zzaia.zze(this.zzd);
                        zzacfVar.zzk(this.zzd.zzc());
                        zzacfVar.zzj();
                    }
                    long j6 = j4 - j5;
                    this.zzf.push(new zzahq(this.zzj, j6));
                    if (this.zzk == this.zzl) {
                        zzl(j6);
                    } else {
                        zzk();
                    }
                } else if (i3 == 1835296868 || i3 == 1836476516 || i3 == 1751411826 || i3 == 1937011556 || i3 == 1937011827 || i3 == 1937011571 || i3 == 1668576371 || i3 == 1701606260 || i3 == 1937011555 || i3 == 1937011578 || i3 == 1937013298 || i3 == 1937007471 || i3 == 1668232756 || i3 == 1953196132 || i3 == 1718909296 || i3 == 1969517665 || i3 == 1801812339 || i3 == 1768715124) {
                    boolean z3 = false;
                    zzef.zzf(z3);
                    zzef.zzf(this.zzk <= 2147483647L);
                    zzfj zzfjVar = new zzfj((int) this.zzk);
                    System.arraycopy(this.zze.zzI(), 0, zzfjVar.zzI(), 0, 8);
                    this.zzm = zzfjVar;
                    this.zzi = 1;
                } else {
                    long zzf2 = zzacfVar.zzf();
                    long j7 = this.zzl;
                    long j8 = zzf2 - j7;
                    if (this.zzj == 1836086884) {
                        this.zzy = new zzago(0L, j8, -9223372036854775807L, j8 + j7, this.zzk - j7);
                    }
                    this.zzm = null;
                    this.zzi = 1;
                }
            } else {
                if (i != 1) {
                    long zzf3 = zzacfVar.zzf();
                    int i4 = this.zzn;
                    if (i4 == -1) {
                        int i5 = -1;
                        int i6 = -1;
                        boolean z4 = true;
                        boolean z5 = true;
                        long j9 = Long.MAX_VALUE;
                        long j10 = Long.MAX_VALUE;
                        long j11 = Long.MAX_VALUE;
                        int i7 = 0;
                        while (true) {
                            zzaik[] zzaikVarArr = this.zzt;
                            if (i7 >= zzaikVarArr.length) {
                                break;
                            }
                            zzaik zzaikVar = zzaikVarArr[i7];
                            int i8 = zzaikVar.zze;
                            zzais zzaisVar = zzaikVar.zzb;
                            if (i8 != zzaisVar.zzb) {
                                long j12 = zzaisVar.zzc[i8];
                                long[][] jArr = this.zzu;
                                int i9 = zzfs.zza;
                                long j13 = jArr[i7][i8];
                                long j14 = j12 - zzf3;
                                boolean z6 = j14 < 0 || j14 >= 262144;
                                if (z6) {
                                    z = z5;
                                } else {
                                    if (!z5) {
                                        z = false;
                                    }
                                    z5 = z6;
                                    i6 = i7;
                                    j11 = j14;
                                    j10 = j13;
                                    if (j13 < j9) {
                                        z4 = z6;
                                        i5 = i7;
                                        j9 = j13;
                                    }
                                }
                                if (z6 != z || j14 >= j11) {
                                    z5 = z;
                                    if (j13 < j9) {
                                    }
                                }
                                z5 = z6;
                                i6 = i7;
                                j11 = j14;
                                j10 = j13;
                                if (j13 < j9) {
                                }
                            }
                            i7++;
                        }
                        i4 = (j9 == Long.MAX_VALUE || !z4 || j10 < j9 + 10485760) ? i6 : i5;
                        this.zzn = i4;
                        if (i4 == -1) {
                            return -1;
                        }
                    }
                    zzaik zzaikVar2 = this.zzt[i4];
                    zzadk zzadkVar = zzaikVar2.zzc;
                    int i10 = zzaikVar2.zze;
                    zzais zzaisVar2 = zzaikVar2.zzb;
                    long j15 = zzaisVar2.zzc[i10];
                    int i11 = zzaisVar2.zzd[i10];
                    zzadl zzadlVar = zzaikVar2.zzd;
                    long j16 = (j15 - zzf3) + this.zzo;
                    if (j16 < 0 || j16 >= 262144) {
                        zzadbVar.zza = j15;
                        return 1;
                    }
                    if (zzaikVar2.zza.zzg == 1) {
                        j16 += 8;
                        i11 -= 8;
                    }
                    zzacfVar.zzk((int) j16);
                    zzaip zzaipVar = zzaikVar2.zza;
                    int i12 = zzaipVar.zzj;
                    if (i12 == 0) {
                        if ("audio/ac4".equals(zzaipVar.zzf.zzm)) {
                            if (this.zzp == 0) {
                                zzabi.zzb(i11, this.zzd);
                                zzadkVar.zzr(this.zzd, 7);
                                this.zzp += 7;
                            }
                            i11 += 7;
                        } else if (zzadlVar != null) {
                            zzadlVar.zzd(zzacfVar);
                        }
                        while (true) {
                            int i13 = this.zzp;
                            if (i13 >= i11) {
                                break;
                            }
                            int zzf4 = zzadkVar.zzf(zzacfVar, i11 - i13, false);
                            this.zzo += zzf4;
                            this.zzp += zzf4;
                            this.zzq -= zzf4;
                        }
                    } else {
                        byte[] zzI = this.zzc.zzI();
                        zzI[0] = 0;
                        zzI[1] = 0;
                        zzI[2] = 0;
                        int i14 = 4 - i12;
                        while (this.zzp < i11) {
                            int i15 = this.zzq;
                            if (i15 == 0) {
                                zzacfVar.zzi(zzI, i14, i12);
                                this.zzo += i12;
                                this.zzc.zzG(0);
                                int zzf5 = this.zzc.zzf();
                                if (zzf5 < 0) {
                                    throw zzcf.zza("Invalid NAL length", null);
                                }
                                this.zzq = zzf5;
                                this.zzb.zzG(0);
                                zzadkVar.zzr(this.zzb, 4);
                                this.zzp += 4;
                                i11 += i14;
                            } else {
                                int zzf6 = zzadkVar.zzf(zzacfVar, i15, false);
                                this.zzo += zzf6;
                                this.zzp += zzf6;
                                this.zzq -= zzf6;
                            }
                        }
                    }
                    zzais zzaisVar3 = zzaikVar2.zzb;
                    long j17 = zzaisVar3.zzf[i10];
                    int i16 = zzaisVar3.zzg[i10];
                    if (zzadlVar != null) {
                        zzadlVar.zzc(zzadkVar, j17, i16, i11, 0, null);
                        if (i10 + 1 == zzaikVar2.zzb.zzb) {
                            zzadlVar.zza(zzadkVar, null);
                        }
                    } else {
                        zzadkVar.zzt(j17, i16, i11, 0, null);
                    }
                    zzaikVar2.zze++;
                    this.zzn = -1;
                    this.zzo = 0;
                    this.zzp = 0;
                    this.zzq = 0;
                    return 0;
                }
                long j18 = this.zzk - this.zzl;
                long zzf7 = zzacfVar.zzf() + j18;
                zzfj zzfjVar2 = this.zzm;
                if (zzfjVar2 != null) {
                    zzacfVar.zzi(zzfjVar2.zzI(), this.zzl, (int) j18);
                    if (this.zzj == 1718909296) {
                        this.zzr = true;
                        zzfjVar2.zzG(8);
                        int zzf8 = zzf(zzfjVar2.zzf());
                        if (zzf8 == 0) {
                            zzfjVar2.zzH(4);
                            while (true) {
                                if (zzfjVar2.zza() <= 0) {
                                    zzf8 = 0;
                                    break;
                                }
                                zzf8 = zzf(zzfjVar2.zzf());
                                if (zzf8 != 0) {
                                    break;
                                }
                            }
                        }
                        this.zzx = zzf8;
                    } else if (!this.zzf.isEmpty()) {
                        ((zzahq) this.zzf.peek()).zzd(new zzahr(this.zzj, zzfjVar2));
                    }
                } else {
                    if (!this.zzr && this.zzj == 1835295092) {
                        this.zzx = 1;
                    }
                    if (j18 < 262144) {
                        zzacfVar.zzk((int) j18);
                    } else {
                        zzadbVar.zza = zzacfVar.zzf() + j18;
                        z2 = true;
                        zzl(zzf7);
                        if (z2 && this.zzi != 2) {
                            return 1;
                        }
                    }
                }
                z2 = false;
                zzl(zzf7);
                if (z2) {
                    return 1;
                }
                continue;
            }
        }
    }
}

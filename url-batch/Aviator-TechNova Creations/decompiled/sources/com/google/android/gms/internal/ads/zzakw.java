package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzakw implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private int zzA;
    private zzahv zzB;
    private final zzamd zzb;
    private final int zzc;
    private final zzer zzd;
    private final zzer zze;
    private final zzer zzf;
    private final zzer zzg;
    private final ArrayDeque zzh;
    private final zzala zzi;
    private final List zzj;
    private zzguf zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;
    private zzer zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private long zzw;
    private zzaex zzx;
    private zzakv[] zzy;
    private long[][] zzz;

    static {
        int i = zzaks.zza;
    }

    @Deprecated
    public zzakw() {
        this(zzamd.zza, 16);
    }

    static /* synthetic */ long zzh(zzalf zzalfVar, long j, long j2) {
        int zzl = zzl(zzalfVar, j);
        return zzl == -1 ? j2 : Math.min(zzalfVar.zzc[zzl], j2);
    }

    private final void zzj() {
        this.zzl = 0;
        this.zzo = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzk(long j) throws zzat {
        zzap zzapVar;
        long j2;
        ArrayDeque arrayDeque;
        int i;
        List list;
        zzakv zzakvVar;
        zzagh zzaghVar;
        long j3;
        int i2;
        long j4;
        zzap zzapVar2;
        ArrayList arrayList;
        while (true) {
            ArrayDeque arrayDeque2 = this.zzh;
            if (arrayDeque2.isEmpty() || ((zzfu) arrayDeque2.peek()).zza != j) {
                break;
            }
            zzfu zzfuVar = (zzfu) arrayDeque2.pop();
            if (zzfuVar.zzd == 1836019574) {
                zzfu zzd = zzfuVar.zzd(1835365473);
                new ArrayList();
                zzap zze = zzd != null ? zzakh.zze(zzd) : null;
                ArrayList arrayList2 = new ArrayList();
                boolean z = this.zzA == 1;
                zzafn zzafnVar = new zzafn();
                zzfv zzc = zzfuVar.zzc(1969517665);
                if (zzc != null) {
                    zzap zzc2 = zzakh.zzc(zzc);
                    zzafnVar.zza(zzc2);
                    zzapVar = zzc2;
                } else {
                    zzapVar = null;
                }
                zzfv zzc3 = zzfuVar.zzc(1836476516);
                zzc3.getClass();
                zzap zzapVar3 = new zzap(-9223372036854775807L, zzakh.zzd(zzc3.zza));
                int i3 = this.zzc;
                ArrayList arrayList3 = arrayList2;
                long j5 = -9223372036854775807L;
                List zzb = zzakh.zzb(zzfuVar, zzafnVar, -9223372036854775807L, null, 1 == (i3 & 1), z, zzakt.zza, false);
                String zza2 = zzakr.zza(zzb);
                long j6 = -9223372036854775807L;
                int i4 = 0;
                int i5 = 0;
                int i6 = -1;
                while (true) {
                    j2 = 0;
                    if (i4 >= zzb.size()) {
                        break;
                    }
                    zzalf zzalfVar = (zzalf) zzb.get(i4);
                    long j7 = j5;
                    int i7 = zzalfVar.zzb;
                    if (i7 == 0) {
                        arrayDeque = arrayDeque2;
                        list = zzb;
                        i = i4;
                        arrayList = arrayList3;
                        j4 = j7;
                    } else {
                        zzalc zzalcVar = zzalfVar.zza;
                        zzaex zzaexVar = this.zzx;
                        int i8 = i5 + 1;
                        arrayDeque = arrayDeque2;
                        int i9 = zzalcVar.zzb;
                        zzakv zzakvVar2 = new zzakv(zzalcVar, zzalfVar, zzaexVar.zzu(i5, i9));
                        List list2 = zzb;
                        long j8 = zzalcVar.zze;
                        if (j8 == j7) {
                            j8 = zzalfVar.zzi;
                        }
                        i = i4;
                        zzagh zzaghVar2 = zzakvVar2.zzc;
                        zzaghVar2.zzN(j8);
                        long max = Math.max(j6, j8);
                        zzv zzvVar = zzalcVar.zzg;
                        list = list2;
                        String str = zzvVar.zzo;
                        int i10 = "audio/true-hd".equals(str) ? zzalfVar.zze * 16 : zzalfVar.zze + 30;
                        zzt zza3 = zzvVar.zza();
                        zza3.zzn(i10);
                        if (i9 == 2) {
                            int i11 = zzvVar.zzf;
                            if ((i3 & 8) != 0) {
                                i11 |= i6 == -1 ? 1 : 2;
                            }
                            zza3.zzg(i11);
                            i9 = 2;
                        }
                        if (zzas.zzb(str)) {
                            boolean z2 = zzalfVar.zzj;
                            if (!z2) {
                                i7 = zzalfVar.zzh.length;
                            }
                            int min = Math.min(i7, 20);
                            zzgrc.zzi(j8 != j7);
                            zzakvVar = zzakvVar2;
                            zzaghVar = zzaghVar2;
                            long min2 = Math.min(j8, 10000000L);
                            int i12 = 0;
                            int i13 = -1;
                            for (int i14 = 0; i14 < min; i14++) {
                                int i15 = z2 ? i14 : zzalfVar.zzh[i14];
                                long j9 = zzalfVar.zzf[i15];
                                if (j9 > min2) {
                                    break;
                                }
                                if (j9 >= 0 && (i2 = zzalfVar.zzd[i15]) > i12) {
                                    i12 = i2;
                                    i13 = i15;
                                }
                            }
                            if (i13 != -1) {
                                j3 = zzalfVar.zzf[i13];
                                if (j3 == j7) {
                                    zzao[] zzaoVarArr = {new zzahx(j3)};
                                    j4 = j7;
                                    zzapVar2 = new zzap(j4, zzaoVarArr);
                                } else {
                                    j4 = j7;
                                    zzapVar2 = null;
                                }
                                zzakq.zzb(i9, zzafnVar, zza3);
                                zzap zzapVar4 = zzvVar.zzl;
                                List list3 = this.zzj;
                                zzap[] zzapVarArr = new zzap[4];
                                zzapVarArr[0] = !list3.isEmpty() ? null : new zzap(list3);
                                zzapVarArr[1] = zzapVar;
                                zzapVarArr[2] = zzapVar3;
                                zzapVarArr[3] = zzapVar2;
                                zzakq.zza(i9, zze, zza3, zzapVar4, zzapVarArr);
                                zza3.zzl(zza2);
                                if (Objects.equals(str, "audio/mpeg")) {
                                    zzaghVar.zzz(zza3.zzM());
                                } else {
                                    zzakvVar.zzf = zza3.zzM();
                                }
                                if (i9 == 2 && i6 == -1) {
                                    i6 = arrayList3.size();
                                }
                                arrayList = arrayList3;
                                arrayList.add(zzakvVar);
                                i5 = i8;
                                j6 = max;
                            }
                        } else {
                            zzakvVar = zzakvVar2;
                            zzaghVar = zzaghVar2;
                        }
                        j3 = j7;
                        if (j3 == j7) {
                        }
                        zzakq.zzb(i9, zzafnVar, zza3);
                        zzap zzapVar42 = zzvVar.zzl;
                        List list32 = this.zzj;
                        zzap[] zzapVarArr2 = new zzap[4];
                        zzapVarArr2[0] = !list32.isEmpty() ? null : new zzap(list32);
                        zzapVarArr2[1] = zzapVar;
                        zzapVarArr2[2] = zzapVar3;
                        zzapVarArr2[3] = zzapVar2;
                        zzakq.zza(i9, zze, zza3, zzapVar42, zzapVarArr2);
                        zza3.zzl(zza2);
                        if (Objects.equals(str, "audio/mpeg")) {
                        }
                        if (i9 == 2) {
                            i6 = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(zzakvVar);
                        i5 = i8;
                        j6 = max;
                    }
                    arrayList3 = arrayList;
                    j5 = j4;
                    arrayDeque2 = arrayDeque;
                    i4 = i + 1;
                    zzb = list;
                }
                ArrayDeque arrayDeque3 = arrayDeque2;
                int i16 = -1;
                zzakv[] zzakvVarArr = (zzakv[]) arrayList3.toArray(new zzakv[0]);
                this.zzy = zzakvVarArr;
                int length = zzakvVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i17 = 0; i17 < zzakvVarArr.length; i17++) {
                    jArr[i17] = new long[zzakvVarArr[i17].zzb.zzb];
                    jArr2[i17] = zzakvVarArr[i17].zzb.zzf[0];
                }
                int i18 = 0;
                while (i18 < zzakvVarArr.length) {
                    long j10 = Long.MAX_VALUE;
                    int i19 = i16;
                    for (int i20 = 0; i20 < zzakvVarArr.length; i20++) {
                        if (!zArr[i20]) {
                            long j11 = jArr2[i20];
                            if (j11 <= j10) {
                                i19 = i20;
                                j10 = j11;
                            }
                        }
                    }
                    int i21 = iArr[i19];
                    long[] jArr3 = jArr[i19];
                    jArr3[i21] = j2;
                    zzalf zzalfVar2 = zzakvVarArr[i19].zzb;
                    zzakv[] zzakvVarArr2 = zzakvVarArr;
                    j2 += zzalfVar2.zzd[i21];
                    int i22 = i21 + 1;
                    iArr[i19] = i22;
                    if (i22 < jArr3.length) {
                        jArr2[i19] = zzalfVar2.zzf[i22];
                    } else {
                        zArr[i19] = true;
                        i18++;
                    }
                    zzakvVarArr = zzakvVarArr2;
                    i16 = -1;
                }
                this.zzz = jArr;
                this.zzx.zzv();
                this.zzx.zzw(new zzaku(j6, this.zzy, i6));
                arrayDeque3.clear();
                this.zzl = 2;
            } else if (!arrayDeque2.isEmpty()) {
                ((zzfu) arrayDeque2.peek()).zzb(zzfuVar);
            }
        }
        if (this.zzl != 2) {
            zzj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(zzalf zzalfVar, long j) {
        int zza2 = zzalfVar.zza(j);
        return zza2 == -1 ? zzalfVar.zzb(j) : zza2;
    }

    private static int zzm(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzagc zzb = zzalb.zzb(zzaevVar, (this.zzc & 2) != 0);
        this.zzk = zzb != null ? zzguf.zzj(zzb) : zzguf.zzi();
        return zzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ List zzb() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        if ((this.zzc & 16) == 0) {
            zzaexVar = new zzamg(zzaexVar, this.zzb);
        }
        this.zzx = zzaexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j, long j2) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = false;
        if (j == 0) {
            if (this.zzl != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzakv zzakvVar : this.zzy) {
            zzalf zzalfVar = zzakvVar.zzb;
            int zza2 = zzalfVar.zza(j2);
            if (zza2 == -1) {
                zza2 = zzalfVar.zzb(j2);
            }
            zzakvVar.zze = zza2;
            zzagi zzagiVar = zzakvVar.zzd;
            if (zzagiVar != null) {
                zzagiVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public zzakw(zzamd zzamdVar, int i) {
        this.zzb = zzamdVar;
        this.zzc = i;
        this.zzk = zzguf.zzi();
        this.zzl = (i & 4) != 0 ? 3 : 0;
        this.zzi = new zzala();
        this.zzj = new ArrayList();
        this.zzg = new zzer(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzer(zzgm.zza);
        this.zze = new zzer(6);
        this.zzf = new zzer();
        this.zzq = -1;
        this.zzx = zzaex.zza;
        this.zzy = new zzakv[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x04b6, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x009a A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        long j;
        long j2;
        zzagh zzaghVar;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        while (true) {
            int i4 = this.zzl;
            long j3 = 0;
            if (i4 == 0) {
                if (this.zzo == 0) {
                    zzer zzerVar = this.zzg;
                    if (!zzaevVar.zzb(zzerVar.zzi(), 0, 8, true)) {
                        if (this.zzA != 2 || (this.zzc & 2) == 0) {
                            return -1;
                        }
                        zzagh zzu = this.zzx.zzu(0, 4);
                        zzahv zzahvVar = this.zzB;
                        zzap zzapVar = zzahvVar == null ? null : new zzap(-9223372036854775807L, zzahvVar);
                        zzt zztVar = new zzt();
                        zztVar.zzk(zzapVar);
                        zzu.zzz(zztVar.zzM());
                        this.zzx.zzv();
                        this.zzx.zzw(new zzafx(-9223372036854775807L, 0L));
                        return -1;
                    }
                    this.zzo = 8;
                    zzerVar.zzh(0);
                    this.zzn = zzerVar.zzz();
                    this.zzm = zzerVar.zzB();
                }
                long j4 = this.zzn;
                if (j4 == 1) {
                    zzer zzerVar2 = this.zzg;
                    zzaevVar.zzc(zzerVar2.zzi(), 8, 8);
                    this.zzo += 8;
                    this.zzn = zzerVar2.zzJ();
                } else if (j4 == 0) {
                    long zzo = zzaevVar.zzo();
                    if (zzo == -1) {
                        zzfu zzfuVar = (zzfu) this.zzh.peek();
                        zzo = zzfuVar != null ? zzfuVar.zza : -1L;
                    }
                    if (zzo != -1) {
                        this.zzn = (zzo - zzaevVar.zzn()) + this.zzo;
                    }
                }
                long j5 = this.zzn;
                int i5 = this.zzo;
                long j6 = i5;
                if (j5 < j6) {
                    if (this.zzm != 1718773093 || i5 != 8) {
                        break;
                    }
                    this.zzn = j6;
                    i5 = 8;
                }
                int i6 = this.zzm;
                if (i6 == 1836019574 || i6 == 1953653099 || i6 == 1835297121 || i6 == 1835626086 || i6 == 1937007212 || i6 == 1701082227 || i6 == 1835365473 || i6 == 1635284069) {
                    long zzn = zzaevVar.zzn();
                    long j7 = this.zzn;
                    long j8 = zzn + j7;
                    long j9 = this.zzo;
                    if (j7 != j9 && this.zzm == 1835365473) {
                        zzer zzerVar3 = this.zzf;
                        zzerVar3.zza(8);
                        zzaevVar.zzi(zzerVar3.zzi(), 0, 8);
                        zzakh.zzf(zzerVar3);
                        zzaevVar.zzf(zzerVar3.zzg());
                        zzaevVar.zzl();
                    }
                    long j10 = j8 - j9;
                    this.zzh.push(new zzfu(this.zzm, j10));
                    if (this.zzn == this.zzo) {
                        zzk(j10);
                    } else {
                        zzj();
                    }
                } else if (i6 == 1835296868 || i6 == 1836476516 || i6 == 1751411826 || i6 == 1937011556 || i6 == 1937011827 || i6 == 1937011571 || i6 == 1668576371 || i6 == 1701606260 || i6 == 1937011555 || i6 == 1937011578 || i6 == 1937013298 || i6 == 1937007471 || i6 == 1668232756 || i6 == 1953196132 || i6 == 1718909296 || i6 == 1969517665 || i6 == 1801812339 || i6 == 1768715124) {
                    boolean z3 = false;
                    zzgrc.zzi(z3);
                    zzgrc.zzi(this.zzn <= 2147483647L);
                    zzer zzerVar4 = new zzer((int) this.zzn);
                    System.arraycopy(this.zzg.zzi(), 0, zzerVar4.zzi(), 0, 8);
                    this.zzp = zzerVar4;
                    this.zzl = 1;
                } else {
                    long zzn2 = zzaevVar.zzn();
                    long j11 = this.zzo;
                    long j12 = zzn2 - j11;
                    if (this.zzm == 1836086884) {
                        this.zzB = new zzahv(0L, j12, -9223372036854775807L, j12 + j11, this.zzn - j11);
                    }
                    this.zzp = null;
                    this.zzl = 1;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        this.zzi.zzb(zzaevVar, zzafvVar, this.zzj);
                        if (zzafvVar.zza == 0) {
                            zzj();
                        }
                        return 1;
                    }
                    long zzn3 = zzaevVar.zzn();
                    int i7 = this.zzq;
                    if (i7 == -1) {
                        int i8 = -1;
                        int i9 = -1;
                        boolean z4 = true;
                        boolean z5 = true;
                        long j13 = Long.MAX_VALUE;
                        long j14 = Long.MAX_VALUE;
                        long j15 = Long.MAX_VALUE;
                        int i10 = 0;
                        j2 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                        while (true) {
                            zzakv[] zzakvVarArr = this.zzy;
                            if (i10 >= zzakvVarArr.length) {
                                break;
                            }
                            zzakv zzakvVar = zzakvVarArr[i10];
                            int i11 = zzakvVar.zze;
                            zzalf zzalfVar = zzakvVar.zzb;
                            long j16 = j3;
                            if (i11 != zzalfVar.zzb) {
                                long j17 = zzalfVar.zzc[i11];
                                long[][] jArr = this.zzz;
                                jArr.getClass();
                                long j18 = jArr[i10][i11];
                                long j19 = j17 - zzn3;
                                boolean z6 = j19 < j16 || j19 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                if (z6) {
                                    z = z5;
                                } else {
                                    if (!z5) {
                                        z = false;
                                    }
                                    z5 = z6;
                                    i9 = i10;
                                    j14 = j18;
                                    j15 = j19;
                                    if (j18 < j13) {
                                        z4 = z6;
                                        i8 = i10;
                                        j13 = j18;
                                    }
                                }
                                if (z6 != z || j19 >= j15) {
                                    z5 = z;
                                    if (j18 < j13) {
                                    }
                                }
                                z5 = z6;
                                i9 = i10;
                                j14 = j18;
                                j15 = j19;
                                if (j18 < j13) {
                                }
                            }
                            i10++;
                            j3 = j16;
                        }
                        j = j3;
                        i7 = (j13 == Long.MAX_VALUE || !z4 || j14 < j13 + 10485760) ? i9 : i8;
                        this.zzq = i7;
                        if (i7 == -1) {
                            return -1;
                        }
                    } else {
                        j = 0;
                        j2 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                    }
                    zzakv zzakvVar2 = this.zzy[i7];
                    zzagh zzaghVar2 = zzakvVar2.zzc;
                    int i12 = zzakvVar2.zze;
                    zzalf zzalfVar2 = zzakvVar2.zzb;
                    long j20 = zzalfVar2.zzc[i12] + this.zzw;
                    int[] iArr = zzalfVar2.zzd;
                    int i13 = iArr[i12];
                    zzagi zzagiVar = zzakvVar2.zzd;
                    zzagh zzaghVar3 = zzaghVar2;
                    int i14 = 0;
                    long j21 = (j20 - zzn3) + this.zzr;
                    if (j21 < j || j21 >= j2) {
                        zzafvVar.zza = j20;
                        return 1;
                    }
                    zzalc zzalcVar = zzakvVar2.zza;
                    if (zzalcVar.zzh == 1) {
                        j21 += 8;
                        i13 -= 8;
                    }
                    int i15 = i13;
                    zzaevVar.zzf((int) j21);
                    zzv zzvVar = zzalcVar.zzg;
                    String str = zzvVar.zzo;
                    if (!Objects.equals(str, "video/avc")) {
                        Objects.equals(str, "video/hevc");
                    }
                    this.zzu = true;
                    int i16 = zzalcVar.zzk;
                    if (i16 == 0) {
                        zzaghVar = zzaghVar3;
                        if ("audio/ac4".equals(str)) {
                            if (this.zzs == 0) {
                                zzer zzerVar5 = this.zzf;
                                zzady.zzc(i15, zzerVar5);
                                zzaghVar.zzc(zzerVar5, 7);
                                this.zzs += 7;
                            }
                            i15 += 7;
                        } else if (zzakvVar2.zzf != null && Objects.equals(str, "audio/mpeg")) {
                            zzv zzvVar2 = zzakvVar2.zzf;
                            zzer zzerVar6 = this.zzf;
                            zzerVar6.zza(4);
                            zzaevVar.zzi(zzerVar6.zzi(), 0, 4);
                            zzaevVar.zzl();
                            zzafr zzafrVar = new zzafr();
                            if (zzafrVar.zza(zzerVar6.zzB()) && !Objects.equals(zzvVar2.zzo, zzafrVar.zzb)) {
                                zzt zza2 = zzvVar2.zza();
                                String str2 = zzafrVar.zzb;
                                str2.getClass();
                                zza2.zzm(str2);
                                zzvVar2 = zza2.zzM();
                            }
                            zzaghVar.zzz(zzvVar2);
                            zzakvVar2.zzf = null;
                        } else if (zzagiVar != null) {
                            zzagiVar.zzb(zzaevVar);
                        }
                        while (true) {
                            int i17 = this.zzs;
                            if (i17 >= i15) {
                                break;
                            }
                            int zza3 = zzaghVar.zza(zzaevVar, i15 - i17, false);
                            this.zzr += zza3;
                            this.zzs += zza3;
                            this.zzt -= zza3;
                        }
                    } else {
                        zzer zzerVar7 = this.zze;
                        byte[] zzi = zzerVar7.zzi();
                        zzi[0] = 0;
                        zzi[1] = 0;
                        zzi[2] = 0;
                        int i18 = 4 - i16;
                        i15 += i18;
                        while (this.zzs < i15) {
                            int i19 = this.zzt;
                            if (i19 == 0) {
                                if (this.zzu || zzgm.zzc(zzvVar) + i16 > iArr[i12] - this.zzr) {
                                    i2 = i16;
                                    i3 = i14;
                                } else {
                                    i3 = zzgm.zzc(zzvVar);
                                    i2 = i16 + i3;
                                }
                                zzaevVar.zzc(zzi, i18, i2);
                                this.zzr += i2;
                                int i20 = i14;
                                zzerVar7.zzh(i20);
                                int zzB = zzerVar7.zzB();
                                if (zzB < 0) {
                                    throw zzat.zzb("Invalid NAL length", null);
                                }
                                this.zzt = zzB - i3;
                                zzer zzerVar8 = this.zzd;
                                zzerVar8.zzh(i20);
                                i = i16;
                                zzagh zzaghVar4 = zzaghVar3;
                                zzaghVar4.zzc(zzerVar8, 4);
                                this.zzs += 4;
                                if (i3 > 0) {
                                    zzaghVar4.zzc(zzerVar7, i3);
                                    this.zzs += i3;
                                    if (zzgm.zzd(zzi, 4, i3, zzvVar)) {
                                        this.zzu = true;
                                        zzaghVar3 = zzaghVar4;
                                        i16 = i;
                                        i14 = 0;
                                    }
                                }
                                zzaghVar3 = zzaghVar4;
                            } else {
                                i = i16;
                                int zza4 = zzaghVar3.zza(zzaevVar, i19, i14);
                                this.zzr += zza4;
                                this.zzs += zza4;
                                this.zzt -= zza4;
                            }
                            i16 = i;
                            i14 = 0;
                        }
                        zzaghVar = zzaghVar3;
                    }
                    int i21 = i15;
                    long j22 = zzalfVar2.zzf[i12];
                    int i22 = zzalfVar2.zzg[i12];
                    if (!this.zzu) {
                        i22 |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    int i23 = i22;
                    if (zzagiVar != null) {
                        zzagh zzaghVar5 = zzaghVar;
                        zzagiVar.zzc(zzaghVar5, j22, i23, i21, 0, null);
                        if (i12 + 1 == zzalfVar2.zzb) {
                            zzagiVar.zzd(zzaghVar5, null);
                        }
                    } else {
                        zzaghVar.zze(j22, i23, i21, 0, null);
                    }
                    zzakvVar2.zze++;
                    this.zzq = -1;
                    this.zzr = 0;
                    this.zzs = 0;
                    this.zzt = 0;
                    this.zzu = false;
                    return 0;
                }
                long j23 = this.zzn - this.zzo;
                long zzn4 = zzaevVar.zzn() + j23;
                zzer zzerVar9 = this.zzp;
                if (zzerVar9 != null) {
                    zzaevVar.zzc(zzerVar9.zzi(), this.zzo, (int) j23);
                    if (this.zzm == 1718909296) {
                        this.zzv = true;
                        zzerVar9.zzh(8);
                        int zzm = zzm(zzerVar9.zzB());
                        if (zzm == 0) {
                            zzerVar9.zzk(4);
                            while (true) {
                                if (zzerVar9.zzd() <= 0) {
                                    zzm = 0;
                                    break;
                                }
                                zzm = zzm(zzerVar9.zzB());
                                if (zzm != 0) {
                                    break;
                                }
                            }
                        }
                        this.zzA = zzm;
                    } else {
                        ArrayDeque arrayDeque = this.zzh;
                        if (!arrayDeque.isEmpty()) {
                            ((zzfu) arrayDeque.peek()).zza(new zzfv(this.zzm, zzerVar9));
                        }
                    }
                } else {
                    if (!this.zzv && this.zzm == 1835295092) {
                        this.zzA = 1;
                    }
                    if (j23 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        zzaevVar.zzf((int) j23);
                    } else {
                        zzafvVar.zza = zzaevVar.zzn() + j23;
                        z2 = true;
                        zzk(zzn4);
                        if (z2 && this.zzl != 2) {
                            return 1;
                        }
                    }
                }
                z2 = false;
                zzk(zzn4);
                if (z2) {
                    return 1;
                }
                continue;
            }
        }
        throw zzat.zzc("Atom size less than header length (unsupported).");
    }
}

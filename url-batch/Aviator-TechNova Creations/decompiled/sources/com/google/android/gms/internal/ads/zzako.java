package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzako implements zzaeu {
    private static final byte[] zza;
    private static final zzv zzb;
    private long zzA;
    private long zzB;
    private zzakn zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzaex zzI;
    private zzagh[] zzJ;
    private zzagh[] zzK;
    private boolean zzL;
    private long zzM;
    private final zzamd zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzer zzg;
    private final zzer zzh;
    private final zzer zzi;
    private final byte[] zzj;
    private final zzer zzk;
    private final zzahz zzl;
    private final zzer zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzgq zzp;
    private final zzaej zzq;
    private zzguf zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private zzer zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        int i = zzakk.zza;
        zza = new byte[]{-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
        zzt zztVar = new zzt();
        zztVar.zzm("application/x-emsg");
        zzb = zztVar.zzM();
    }

    @Deprecated
    public zzako() {
        this(zzamd.zza, 32, null, null, zzguf.zzi(), null);
    }

    private final void zzi() {
        this.zzs = 0;
        this.zzv = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x03da, code lost:
    
        if ((com.google.android.gms.internal.ads.zzfj.zzt(r42, 1000000, r5.zzd, java.math.RoundingMode.DOWN) + com.google.android.gms.internal.ads.zzfj.zzt(r2[0], 1000000, r5.zzc, java.math.RoundingMode.DOWN)) < r5.zze) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0781, code lost:
    
        zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0784, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0415  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzj(long j) throws zzat {
        zzap zzapVar;
        int i;
        List list;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z4;
        long[] jArr;
        while (true) {
            ArrayDeque arrayDeque = this.zzn;
            if (arrayDeque.isEmpty() || ((zzfu) arrayDeque.peek()).zza != j) {
                break;
            }
            zzfu zzfuVar = (zzfu) arrayDeque.pop();
            int i22 = zzfuVar.zzd;
            int i23 = 12;
            int i24 = 8;
            boolean z5 = true;
            if (i22 == 1836019574) {
                zzq zzn = zzn(zzfuVar.zzb);
                zzfu zzd = zzfuVar.zzd(1836475768);
                zzd.getClass();
                SparseArray sparseArray = new SparseArray();
                List list2 = zzd.zzb;
                int size = list2.size();
                int i25 = 0;
                long j2 = -9223372036854775807L;
                while (i25 < size) {
                    zzfv zzfvVar = (zzfv) list2.get(i25);
                    int i26 = zzfvVar.zzd;
                    if (i26 == 1953654136) {
                        zzer zzerVar = zzfvVar.zza;
                        zzerVar.zzh(i23);
                        Pair create = Pair.create(Integer.valueOf(zzerVar.zzB()), new zzaki(zzerVar.zzB() - 1, zzerVar.zzB(), zzerVar.zzB(), zzerVar.zzB()));
                        sparseArray.put(((Integer) create.first).intValue(), (zzaki) create.second);
                    } else if (i26 == 1835362404) {
                        zzer zzerVar2 = zzfvVar.zza;
                        zzerVar2.zzh(8);
                        j2 = zzakh.zza(zzerVar2.zzB()) == 0 ? zzerVar2.zzz() : zzerVar2.zzJ();
                    }
                    i25++;
                    i23 = 12;
                }
                zzfu zzd2 = zzfuVar.zzd(1835365473);
                zzap zze = zzd2 != null ? zzakh.zze(zzd2) : null;
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
                zzap zzapVar2 = new zzap(-9223372036854775807L, zzakh.zzd(zzc3.zza));
                List zzb2 = zzakh.zzb(zzfuVar, zzafnVar, j2, zzn, (this.zzd & 16) != 0, false, new zzgqt(this) { // from class: com.google.android.gms.internal.ads.zzakj
                    @Override // com.google.android.gms.internal.ads.zzgqt
                    public final /* synthetic */ Object apply(Object obj) {
                        return (zzalc) obj;
                    }
                }, false);
                int size2 = zzb2.size();
                SparseArray sparseArray2 = this.zzf;
                if (sparseArray2.size() == 0) {
                    String zza2 = zzakr.zza(zzb2);
                    int i27 = 0;
                    while (i27 < size2) {
                        zzalf zzalfVar = (zzalf) zzb2.get(i27);
                        zzalc zzalcVar = zzalfVar.zza;
                        zzaex zzaexVar = this.zzI;
                        int i28 = zzalcVar.zzb;
                        zzagh zzu = zzaexVar.zzu(i27, i28);
                        boolean z6 = z5;
                        long j3 = zzalcVar.zze;
                        zzu.zzN(j3);
                        int i29 = i27;
                        zzv zzvVar = zzalcVar.zzg;
                        zzap zzapVar3 = zzapVar2;
                        zzt zza3 = zzvVar.zza();
                        zza3.zzl(zza2);
                        zzakq.zzb(i28, zzafnVar, zza3);
                        zzafn zzafnVar2 = zzafnVar;
                        String str = zza2;
                        zzap[] zzapVarArr = new zzap[2];
                        zzapVarArr[0] = zzapVar;
                        zzapVarArr[z6 ? 1 : 0] = zzapVar3;
                        zzakq.zza(i28, zze, zza3, zzvVar.zzl, zzapVarArr);
                        int i30 = zzalcVar.zza;
                        sparseArray2.put(i30, new zzakn(zzu, zzalfVar, zzo(sparseArray, i30), zza3.zzM()));
                        this.zzA = Math.max(this.zzA, j3);
                        i27 = i29 + 1;
                        z5 = z6 ? 1 : 0;
                        zzafnVar = zzafnVar2;
                        zzapVar2 = zzapVar3;
                        zza2 = str;
                    }
                    this.zzI.zzv();
                } else {
                    zzgrc.zzi(sparseArray2.size() == size2);
                    for (int i31 = 0; i31 < size2; i31++) {
                        zzalf zzalfVar2 = (zzalf) zzb2.get(i31);
                        int i32 = zzalfVar2.zza.zza;
                        ((zzakn) sparseArray2.get(i32)).zza(zzalfVar2, zzo(sparseArray, i32));
                    }
                }
            } else {
                boolean z7 = true;
                int i33 = 16;
                int i34 = 0;
                if (i22 == 1836019558) {
                    SparseArray sparseArray3 = this.zzf;
                    int i35 = this.zzd;
                    byte[] bArr2 = this.zzj;
                    List list3 = zzfuVar.zzc;
                    int size3 = list3.size();
                    int i36 = 0;
                    while (i36 < size3) {
                        zzfu zzfuVar2 = (zzfu) list3.get(i36);
                        if (zzfuVar2.zzd == 1953653094) {
                            zzfv zzc4 = zzfuVar2.zzc(1952868452);
                            zzc4.getClass();
                            zzer zzerVar3 = zzc4.zza;
                            zzerVar3.zzh(i24);
                            int zzB = zzerVar3.zzB();
                            int i37 = zzakh.zza;
                            zzakn zzaknVar = (zzakn) sparseArray3.get(zzerVar3.zzB());
                            if (zzaknVar == null) {
                                zzaknVar = null;
                            } else {
                                if ((zzB & 1) != 0) {
                                    long zzJ = zzerVar3.zzJ();
                                    zzale zzaleVar = zzaknVar.zzb;
                                    zzaleVar.zzb = zzJ;
                                    zzaleVar.zzc = zzJ;
                                }
                                zzaki zzakiVar = zzaknVar.zze;
                                zzaknVar.zzb.zza = new zzaki((zzB & 2) != 0 ? zzerVar3.zzB() - 1 : zzakiVar.zza, (zzB & 8) != 0 ? zzerVar3.zzB() : zzakiVar.zzb, (zzB & 16) != 0 ? zzerVar3.zzB() : zzakiVar.zzc, (zzB & 32) != 0 ? zzerVar3.zzB() : zzakiVar.zzd);
                            }
                            if (zzaknVar == null) {
                                i = i35;
                                list = list3;
                                i2 = size3;
                                i3 = i36;
                                z = z7;
                                i5 = i33;
                                i6 = i34;
                                i4 = 8;
                            } else {
                                zzale zzaleVar2 = zzaknVar.zzb;
                                long j4 = zzaleVar2.zzp;
                                boolean z8 = zzaleVar2.zzq;
                                zzaknVar.zzc();
                                boolean z9 = z7;
                                zzaknVar.zzl(z9);
                                zzfv zzc5 = zzfuVar2.zzc(1952867444);
                                if (zzc5 == null || (i35 & 2) != 0) {
                                    zzaleVar2.zzp = j4;
                                    zzaleVar2.zzq = z8;
                                } else {
                                    zzer zzerVar4 = zzc5.zza;
                                    zzerVar4.zzh(8);
                                    zzaleVar2.zzp = zzakh.zza(zzerVar4.zzB()) == z9 ? zzerVar4.zzJ() : zzerVar4.zzz();
                                    zzaleVar2.zzq = z9;
                                }
                                List list4 = zzfuVar2.zzb;
                                int size4 = list4.size();
                                i = i35;
                                int i38 = i34;
                                int i39 = i38;
                                int i40 = i39;
                                while (true) {
                                    i7 = 1953658222;
                                    if (i38 >= size4) {
                                        break;
                                    }
                                    List list5 = list3;
                                    zzfv zzfvVar2 = (zzfv) list4.get(i38);
                                    int i41 = size3;
                                    if (zzfvVar2.zzd == 1953658222) {
                                        zzer zzerVar5 = zzfvVar2.zza;
                                        zzerVar5.zzh(12);
                                        int zzH = zzerVar5.zzH();
                                        if (zzH > 0) {
                                            i40 += zzH;
                                            i39++;
                                        }
                                    }
                                    i38++;
                                    size3 = i41;
                                    list3 = list5;
                                }
                                list = list3;
                                i2 = size3;
                                int i42 = i34;
                                zzaknVar.zzh = i42;
                                zzaknVar.zzg = i42;
                                zzaknVar.zzf = i42;
                                zzaleVar2.zzd = i39;
                                zzaleVar2.zze = i40;
                                if (zzaleVar2.zzg.length < i39) {
                                    zzaleVar2.zzf = new long[i39];
                                    zzaleVar2.zzg = new int[i39];
                                }
                                if (zzaleVar2.zzh.length < i40) {
                                    int i43 = (i40 * Opcodes.LUSHR) / 100;
                                    zzaleVar2.zzh = new int[i43];
                                    zzaleVar2.zzi = new long[i43];
                                    zzaleVar2.zzj = new boolean[i43];
                                    zzaleVar2.zzl = new boolean[i43];
                                }
                                int i44 = 0;
                                int i45 = 0;
                                int i46 = 0;
                                while (i44 < size4) {
                                    long j5 = 0;
                                    zzfv zzfvVar3 = (zzfv) list4.get(i44);
                                    if (zzfvVar3.zzd == i7) {
                                        int i47 = i45 + 1;
                                        zzer zzerVar6 = zzfvVar3.zza;
                                        zzerVar6.zzh(8);
                                        int zzB2 = zzerVar6.zzB();
                                        i9 = i44;
                                        zzalc zzalcVar2 = zzaknVar.zzd.zza;
                                        int i48 = i45;
                                        zzaki zzakiVar2 = zzaleVar2.zza;
                                        String str2 = zzfj.zza;
                                        i10 = i36;
                                        zzaleVar2.zzg[i48] = zzerVar6.zzH();
                                        long[] jArr2 = zzaleVar2.zzf;
                                        int i49 = i46;
                                        long j6 = zzaleVar2.zzb;
                                        jArr2[i48] = j6;
                                        if ((zzB2 & 1) != 0) {
                                            jArr2[i48] = j6 + zzerVar6.zzB();
                                        }
                                        boolean z10 = (zzB2 & 4) != 0;
                                        int i50 = zzakiVar2.zzd;
                                        int zzB3 = z10 ? zzerVar6.zzB() : i50;
                                        boolean z11 = z10;
                                        int i51 = zzB2 & 256;
                                        int i52 = zzB2 & 512;
                                        int i53 = zzB2 & 1024;
                                        int i54 = zzB2 & 2048;
                                        long[] jArr3 = zzalcVar2.zzi;
                                        if (jArr3 != null) {
                                            i11 = i53;
                                            if (jArr3.length == 1 && (jArr = zzalcVar2.zzj) != null) {
                                                long j7 = jArr3[0];
                                                if (j7 == 0) {
                                                    i12 = i50;
                                                    i13 = zzB3;
                                                } else {
                                                    i12 = i50;
                                                    i13 = zzB3;
                                                }
                                                j5 = jArr[0];
                                                int[] iArr = zzaleVar2.zzh;
                                                long[] jArr4 = zzaleVar2.zzi;
                                                boolean[] zArr = zzaleVar2.zzj;
                                                int i55 = i12;
                                                boolean z12 = (zzalcVar2.zzb == 2 || (i & 1) == 0) ? false : true;
                                                i14 = i49 + zzaleVar2.zzg[i48];
                                                long j8 = zzalcVar2.zzc;
                                                long j9 = zzaleVar2.zzp;
                                                i15 = i49;
                                                while (i15 < i14) {
                                                    if (i51 != 0) {
                                                        z3 = z12;
                                                        i16 = zzerVar6.zzB();
                                                    } else {
                                                        z3 = z12;
                                                        i16 = zzakiVar2.zzb;
                                                    }
                                                    zzk(i16);
                                                    if (i52 != 0) {
                                                        i17 = i15;
                                                        i18 = zzerVar6.zzB();
                                                    } else {
                                                        i17 = i15;
                                                        i18 = zzakiVar2.zzc;
                                                    }
                                                    zzk(i18);
                                                    if (i11 != 0) {
                                                        i19 = zzerVar6.zzB();
                                                    } else {
                                                        if (i17 == 0) {
                                                            if (z11) {
                                                                i19 = i13;
                                                                i17 = 0;
                                                            } else {
                                                                i17 = 0;
                                                            }
                                                        }
                                                        i19 = i55;
                                                    }
                                                    if (i54 != 0) {
                                                        i20 = i18;
                                                        i21 = zzerVar6.zzB();
                                                    } else {
                                                        i20 = i18;
                                                        i21 = 0;
                                                    }
                                                    zzaki zzakiVar3 = zzakiVar2;
                                                    long zzt = zzfj.zzt((i21 + j9) - j5, 1000000L, j8, RoundingMode.DOWN);
                                                    jArr4[i17] = zzt;
                                                    if (!zzaleVar2.zzq) {
                                                        jArr4[i17] = zzt + zzaknVar.zzd.zzi;
                                                    }
                                                    iArr[i17] = i20;
                                                    if (((i19 >> 16) & 1) == 0) {
                                                        if (!z3) {
                                                            z4 = true;
                                                        } else if (i17 == 0) {
                                                            z4 = true;
                                                            i17 = 0;
                                                        }
                                                        zArr[i17] = z4;
                                                        j9 += i16;
                                                        i15 = i17 + 1;
                                                        z12 = z3;
                                                        zzakiVar2 = zzakiVar3;
                                                    }
                                                    z4 = false;
                                                    zArr[i17] = z4;
                                                    j9 += i16;
                                                    i15 = i17 + 1;
                                                    z12 = z3;
                                                    zzakiVar2 = zzakiVar3;
                                                }
                                                zzaleVar2.zzp = j9;
                                                i46 = i14;
                                                i45 = i47;
                                            }
                                        } else {
                                            i11 = i53;
                                        }
                                        i12 = i50;
                                        i13 = zzB3;
                                        int[] iArr2 = zzaleVar2.zzh;
                                        long[] jArr42 = zzaleVar2.zzi;
                                        boolean[] zArr2 = zzaleVar2.zzj;
                                        int i552 = i12;
                                        if (zzalcVar2.zzb == 2) {
                                        }
                                        i14 = i49 + zzaleVar2.zzg[i48];
                                        long j82 = zzalcVar2.zzc;
                                        long j92 = zzaleVar2.zzp;
                                        i15 = i49;
                                        while (i15 < i14) {
                                        }
                                        zzaleVar2.zzp = j92;
                                        i46 = i14;
                                        i45 = i47;
                                    } else {
                                        i9 = i44;
                                        i10 = i36;
                                    }
                                    i44 = i9 + 1;
                                    i36 = i10;
                                    i7 = 1953658222;
                                }
                                i3 = i36;
                                zzalc zzalcVar3 = zzaknVar.zzd.zza;
                                zzaki zzakiVar4 = zzaleVar2.zza;
                                zzakiVar4.getClass();
                                zzald zza4 = zzalcVar3.zza(zzakiVar4.zza);
                                zzfv zzc6 = zzfuVar2.zzc(1935763834);
                                if (zzc6 != null) {
                                    zza4.getClass();
                                    int i56 = zza4.zzd;
                                    zzer zzerVar7 = zzc6.zza;
                                    zzerVar7.zzh(8);
                                    if ((zzerVar7.zzB() & 1) == 1) {
                                        zzerVar7.zzk(8);
                                    }
                                    int zzs = zzerVar7.zzs();
                                    int zzH2 = zzerVar7.zzH();
                                    int i57 = zzaleVar2.zze;
                                    if (zzH2 > i57) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(zzH2).length() + 56 + String.valueOf(i57).length());
                                        sb.append("Saiz sample count ");
                                        sb.append(zzH2);
                                        sb.append(" is greater than fragment sample count");
                                        sb.append(i57);
                                        throw zzat.zzb(sb.toString(), null);
                                    }
                                    if (zzs == 0) {
                                        boolean[] zArr3 = zzaleVar2.zzl;
                                        i8 = 0;
                                        for (int i58 = 0; i58 < zzH2; i58++) {
                                            int zzs2 = zzerVar7.zzs();
                                            i8 += zzs2;
                                            zArr3[i58] = zzs2 > i56;
                                        }
                                        z2 = false;
                                    } else {
                                        boolean z13 = zzs > i56;
                                        i8 = zzs * zzH2;
                                        z2 = false;
                                        Arrays.fill(zzaleVar2.zzl, 0, zzH2, z13);
                                    }
                                    Arrays.fill(zzaleVar2.zzl, zzH2, zzaleVar2.zze, z2);
                                    if (i8 > 0) {
                                        zzaleVar2.zza(i8);
                                    }
                                }
                                zzfv zzc7 = zzfuVar2.zzc(1935763823);
                                if (zzc7 != null) {
                                    zzer zzerVar8 = zzc7.zza;
                                    zzerVar8.zzh(8);
                                    int zzB4 = zzerVar8.zzB();
                                    if ((zzB4 & 1) == 1) {
                                        zzerVar8.zzk(8);
                                    }
                                    int zzH3 = zzerVar8.zzH();
                                    if (zzH3 != 1) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(zzH3).length() + 29);
                                        sb2.append("Unexpected saio entry count: ");
                                        sb2.append(zzH3);
                                        throw zzat.zzb(sb2.toString(), null);
                                    }
                                    zzaleVar2.zzc += zzakh.zza(zzB4) == 0 ? zzerVar8.zzz() : zzerVar8.zzJ();
                                }
                                zzfv zzc8 = zzfuVar2.zzc(1936027235);
                                if (zzc8 != null) {
                                    zzl(zzc8.zza, 0, zzaleVar2);
                                }
                                String str3 = zza4 != null ? zza4.zzb : null;
                                zzer zzerVar9 = null;
                                zzer zzerVar10 = null;
                                for (int i59 = 0; i59 < list4.size(); i59++) {
                                    zzfv zzfvVar4 = (zzfv) list4.get(i59);
                                    zzer zzerVar11 = zzfvVar4.zza;
                                    int i60 = zzfvVar4.zzd;
                                    if (i60 == 1935828848) {
                                        zzerVar11.zzh(12);
                                        if (zzerVar11.zzB() == 1936025959) {
                                            zzerVar9 = zzerVar11;
                                        }
                                    } else if (i60 == 1936158820) {
                                        zzerVar11.zzh(12);
                                        if (zzerVar11.zzB() == 1936025959) {
                                            zzerVar10 = zzerVar11;
                                        }
                                    }
                                }
                                if (zzerVar9 == null || zzerVar10 == null) {
                                    z = true;
                                } else {
                                    zzerVar9.zzh(8);
                                    int zza5 = zzakh.zza(zzerVar9.zzB());
                                    zzerVar9.zzk(4);
                                    if (zza5 == 1) {
                                        zzerVar9.zzk(4);
                                    }
                                    if (zzerVar9.zzB() != 1) {
                                        throw zzat.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzerVar10.zzh(8);
                                    int zza6 = zzakh.zza(zzerVar10.zzB());
                                    zzerVar10.zzk(4);
                                    if (zza6 == 1) {
                                        if (zzerVar10.zzz() == 0) {
                                            throw zzat.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (zza6 >= 2) {
                                        zzerVar10.zzk(4);
                                    }
                                    if (zzerVar10.zzz() != 1) {
                                        throw zzat.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    z = true;
                                    zzerVar10.zzk(1);
                                    int zzs3 = zzerVar10.zzs();
                                    int i61 = (zzs3 & 240) >> 4;
                                    int i62 = zzs3 & 15;
                                    if (zzerVar10.zzs() == 1) {
                                        int zzs4 = zzerVar10.zzs();
                                        int i63 = i33;
                                        byte[] bArr3 = new byte[i63];
                                        zzerVar10.zzm(bArr3, 0, i63);
                                        if (zzs4 == 0) {
                                            int zzs5 = zzerVar10.zzs();
                                            byte[] bArr4 = new byte[zzs5];
                                            zzerVar10.zzm(bArr4, 0, zzs5);
                                            bArr = bArr4;
                                        } else {
                                            bArr = null;
                                        }
                                        zzaleVar2.zzk = true;
                                        zzaleVar2.zzm = new zzald(true, str3, zzs4, bArr3, i61, i62, bArr);
                                    }
                                }
                                int size5 = list4.size();
                                for (int i64 = 0; i64 < size5; i64++) {
                                    zzfv zzfvVar5 = (zzfv) list4.get(i64);
                                    if (zzfvVar5.zzd == 1970628964) {
                                        zzer zzerVar12 = zzfvVar5.zza;
                                        zzerVar12.zzh(8);
                                        zzerVar12.zzm(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zza)) {
                                            zzl(zzerVar12, 16, zzaleVar2);
                                        }
                                    }
                                }
                                i4 = 8;
                                i6 = 0;
                                i5 = 16;
                                i36 = i3 + 1;
                                i24 = i4;
                                i34 = i6;
                                z7 = z;
                                i33 = i5;
                                i35 = i;
                                size3 = i2;
                                list3 = list;
                            }
                        } else {
                            i = i35;
                            list = list3;
                            i2 = size3;
                            i3 = i36;
                            i4 = i24;
                            z = z7;
                            i5 = i33;
                            i6 = i34;
                        }
                        i36 = i3 + 1;
                        i24 = i4;
                        i34 = i6;
                        z7 = z;
                        i33 = i5;
                        i35 = i;
                        size3 = i2;
                        list3 = list;
                    }
                    int i65 = i34;
                    zzq zzn2 = zzn(zzfuVar.zzb);
                    if (zzn2 != null) {
                        int size6 = sparseArray3.size();
                        for (int i66 = i65; i66 < size6; i66++) {
                            ((zzakn) sparseArray3.valueAt(i66)).zzb(zzn2);
                        }
                    }
                    if (this.zzz != -9223372036854775807L) {
                        int size7 = sparseArray3.size();
                        for (int i67 = i65; i67 < size7; i67++) {
                            zzakn zzaknVar2 = (zzakn) sparseArray3.valueAt(i67);
                            long j10 = this.zzz;
                            int i68 = zzaknVar2.zzf;
                            while (true) {
                                zzale zzaleVar3 = zzaknVar2.zzb;
                                if (i68 < zzaleVar3.zze && zzaleVar3.zzi[i68] <= j10) {
                                    if (zzaleVar3.zzj[i68]) {
                                        zzaknVar2.zzi = i68;
                                    }
                                    i68++;
                                }
                            }
                        }
                        this.zzz = -9223372036854775807L;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((zzfu) arrayDeque.peek()).zzb(zzfuVar);
                }
            }
        }
    }

    private static int zzk(int i) throws zzat {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw zzat.zzb(sb.toString(), null);
    }

    private static void zzl(zzer zzerVar, int i, zzale zzaleVar) throws zzat {
        zzerVar.zzh(i + 8);
        int zzB = zzerVar.zzB();
        int i2 = zzakh.zza;
        if ((zzB & 1) != 0) {
            throw zzat.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zzB & 2) != 0;
        int zzH = zzerVar.zzH();
        if (zzH == 0) {
            Arrays.fill(zzaleVar.zzl, 0, zzaleVar.zze, false);
            return;
        }
        int i3 = zzaleVar.zze;
        if (zzH != i3) {
            StringBuilder sb = new StringBuilder(String.valueOf(zzH).length() + 58 + String.valueOf(i3).length());
            sb.append("Senc sample count ");
            sb.append(zzH);
            sb.append(" is different from fragment sample count");
            sb.append(i3);
            throw zzat.zzb(sb.toString(), null);
        }
        Arrays.fill(zzaleVar.zzl, 0, zzH, z);
        zzaleVar.zza(zzerVar.zzd());
        zzer zzerVar2 = zzaleVar.zzn;
        zzerVar.zzm(zzerVar2.zzi(), 0, zzerVar2.zze());
        zzerVar2.zzh(0);
        zzaleVar.zzo = false;
    }

    private static Pair zzm(zzer zzerVar, long j) throws zzat {
        long zzJ;
        long zzJ2;
        zzer zzerVar2 = zzerVar;
        zzerVar2.zzh(8);
        int zza2 = zzakh.zza(zzerVar2.zzB());
        zzerVar2.zzk(4);
        long zzz = zzerVar2.zzz();
        if (zza2 == 0) {
            zzJ = zzerVar2.zzz();
            zzJ2 = zzerVar2.zzz();
        } else {
            zzJ = zzerVar2.zzJ();
            zzJ2 = zzerVar2.zzJ();
        }
        long j2 = j + zzJ2;
        long zzt = zzfj.zzt(zzJ, 1000000L, zzz, RoundingMode.DOWN);
        zzerVar2.zzk(2);
        int zzt2 = zzerVar2.zzt();
        int[] iArr = new int[zzt2];
        long[] jArr = new long[zzt2];
        long[] jArr2 = new long[zzt2];
        long[] jArr3 = new long[zzt2];
        long j3 = j2;
        long j4 = zzt;
        int i = 0;
        while (i < zzt2) {
            int zzB = zzerVar2.zzB();
            if ((Integer.MIN_VALUE & zzB) != 0) {
                throw zzat.zzb("Unhandled indirect reference", null);
            }
            long zzz2 = zzerVar2.zzz();
            iArr[i] = zzB & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            zzJ += zzz2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long zzt3 = zzfj.zzt(zzJ, 1000000L, zzz, RoundingMode.DOWN);
            jArr4[i] = zzt3 - jArr5[i];
            zzerVar2.zzk(4);
            j3 += iArr[i];
            i++;
            zzerVar2 = zzerVar;
            zzt2 = zzt2;
            j4 = zzt3;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(zzt), new zzaei(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzq zzn(List list) {
        int i;
        UUID[] uuidArr;
        zzaky zzakyVar;
        UUID uuid;
        int size = list.size();
        int i2 = 0;
        ArrayList arrayList = null;
        while (i2 < size) {
            zzfv zzfvVar = (zzfv) list.get(i2);
            if (zzfvVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] zzi = zzfvVar.zza.zzi();
                zzer zzerVar = new zzer(zzi);
                if (zzerVar.zze() >= 32) {
                    zzerVar.zzh(0);
                    int zzd = zzerVar.zzd();
                    int zzB = zzerVar.zzB();
                    if (zzB != zzd) {
                        StringBuilder sb = new StringBuilder(String.valueOf(zzB).length() + 52 + String.valueOf(zzd).length());
                        sb.append("Advertised atom size (");
                        sb.append(zzB);
                        sb.append(") does not match buffer size: ");
                        sb.append(zzd);
                        zzee.zzc("PsshAtomUtil", sb.toString());
                    } else {
                        int zzB2 = zzerVar.zzB();
                        if (zzB2 != 1886614376) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(zzB2).length() + 23);
                            sb2.append("Atom type is not pssh: ");
                            sb2.append(zzB2);
                            zzee.zzc("PsshAtomUtil", sb2.toString());
                        } else {
                            int zza2 = zzakh.zza(zzerVar.zzB());
                            if (zza2 > 1) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(zza2).length() + 26);
                                sb3.append("Unsupported pssh version: ");
                                sb3.append(zza2);
                                zzee.zzc("PsshAtomUtil", sb3.toString());
                            } else {
                                UUID uuid2 = new UUID(zzerVar.zzD(), zzerVar.zzD());
                                if (zza2 == 1) {
                                    int zzH = zzerVar.zzH();
                                    uuidArr = new UUID[zzH];
                                    int i3 = 0;
                                    while (i3 < zzH) {
                                        UUID[] uuidArr2 = uuidArr;
                                        int i4 = i3;
                                        uuidArr2[i4] = new UUID(zzerVar.zzD(), zzerVar.zzD());
                                        i3 = i4 + 1;
                                        i2 = i2;
                                        uuidArr = uuidArr2;
                                    }
                                } else {
                                    uuidArr = null;
                                }
                                i = i2;
                                int zzH2 = zzerVar.zzH();
                                int zzd2 = zzerVar.zzd();
                                if (zzH2 != zzd2) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(zzH2).length() + 49 + String.valueOf(zzd2).length());
                                    sb4.append("Atom data size (");
                                    sb4.append(zzH2);
                                    sb4.append(") does not match the bytes left: ");
                                    sb4.append(zzd2);
                                    zzee.zzc("PsshAtomUtil", sb4.toString());
                                    zzakyVar = null;
                                    uuid = zzakyVar == null ? null : zzakyVar.zza;
                                    if (uuid == null) {
                                        zzee.zzc("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                    } else {
                                        arrayList.add(new zzp(uuid, null, "video/mp4", zzi));
                                        i2 = i + 1;
                                    }
                                } else {
                                    byte[] bArr = new byte[zzH2];
                                    zzerVar.zzm(bArr, 0, zzH2);
                                    zzakyVar = new zzaky(uuid2, zza2, bArr, uuidArr);
                                    if (zzakyVar == null) {
                                    }
                                    if (uuid == null) {
                                    }
                                }
                            }
                        }
                    }
                }
                i = i2;
                zzakyVar = null;
                if (zzakyVar == null) {
                }
                if (uuid == null) {
                }
            } else {
                i = i2;
            }
            i2 = i + 1;
        }
        if (arrayList == null) {
            return null;
        }
        return new zzq(arrayList);
    }

    private static final zzaki zzo(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzaki) sparseArray.valueAt(0);
        }
        zzaki zzakiVar = (zzaki) sparseArray.get(i);
        zzakiVar.getClass();
        return zzakiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzagc zza2 = zzalb.zza(zzaevVar);
        this.zzr = zza2 != null ? zzguf.zzj(zza2) : zzguf.zzi();
        return zza2 == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ List zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        int i;
        int i2 = this.zzd;
        if ((i2 & 32) == 0) {
            zzaexVar = new zzamg(zzaexVar, this.zzc);
        }
        this.zzI = zzaexVar;
        zzi();
        zzagh[] zzaghVarArr = new zzagh[2];
        this.zzJ = zzaghVarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            zzaghVarArr[0] = this.zzI.zzu(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        zzagh[] zzaghVarArr2 = (zzagh[]) zzfj.zzb(this.zzJ, i);
        this.zzJ = zzaghVarArr2;
        for (zzagh zzaghVar : zzaghVarArr2) {
            zzaghVar.zzz(zzb);
        }
        List list = this.zze;
        this.zzK = new zzagh[list.size()];
        while (i4 < this.zzK.length) {
            zzagh zzu = this.zzI.zzu(i3, 3);
            zzu.zzz((zzv) list.get(i4));
            this.zzK[i4] = zzu;
            i4++;
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:334:0x009c, code lost:
    
        r5 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x009f, code lost:
    
        if (r30.zzs != 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x00a1, code lost:
    
        r30.zzD = r2.zzf();
        r4 = r2.zzd.zza.zzg.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x00b5, code lost:
    
        if (java.util.Objects.equals(r4, "video/avc") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x00b7, code lost:
    
        java.util.Objects.equals(r4, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x00bc, code lost:
    
        r30.zzG = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x00c2, code lost:
    
        if (r2.zzf >= r2.zzi) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x00c4, code lost:
    
        r31.zzf(r30.zzD);
        r1 = r2.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x00cd, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x00d0, code lost:
    
        r4 = r2.zzb;
        r5 = r4.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x00d6, code lost:
    
        if (r1 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x00d8, code lost:
    
        r5.zzk(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x00e1, code lost:
    
        if (r4.zzb(r2.zzf) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x00e3, code lost:
    
        r5.zzk(r5.zzt() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x00f0, code lost:
    
        if (r2.zzh() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x00f2, code lost:
    
        r30.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x00f4, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x02cd, code lost:
    
        r30.zzs = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x02d1, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x00fd, code lost:
    
        if (r2.zzd.zza.zzh != 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x00ff, code lost:
    
        r30.zzD -= 8;
        r31.zzf(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0116, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzg.zzo) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0118, code lost:
    
        r30.zzE = r2.zzi(r30.zzD, 7);
        r4 = r30.zzD;
        r8 = r30.zzk;
        com.google.android.gms.internal.ads.zzady.zzc(r4, r8);
        r2.zza.zzc(r8, 7);
        r4 = r30.zzE + 7;
        r30.zzE = r4;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x013d, code lost:
    
        r30.zzD += r4;
        r30.zzs = 4;
        r30.zzF = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0134, code lost:
    
        r6 = 0;
        r4 = r2.zzi(r30.zzD, 0);
        r30.zzE = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0146, code lost:
    
        r4 = r2.zzd.zza;
        r6 = r2.zza;
        r10 = r2.zzd();
        r8 = r4.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0152, code lost:
    
        if (r8 != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0154, code lost:
    
        r4 = r30.zzE;
        r5 = r30.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0158, code lost:
    
        if (r4 >= r5) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x015a, code lost:
    
        r30.zzE += r6.zza(r31, r5 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x026c, code lost:
    
        r1 = r2.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0272, code lost:
    
        if (r30.zzG != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0274, code lost:
    
        r1 = r1 | androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0277, code lost:
    
        r22 = r1;
        r1 = r2.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x027d, code lost:
    
        if (r1 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x027f, code lost:
    
        r25 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0286, code lost:
    
        r6.zze(r10, r22, r30.zzD, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0293, code lost:
    
        r1 = r30.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0299, code lost:
    
        if (r1.isEmpty() != false) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x029b, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzakm) r1.removeFirst();
        r3 = r30.zzy;
        r8 = r1.zzc;
        r30.zzy = r3 - r8;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x02ac, code lost:
    
        if (r1.zzb == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x02ae, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x02b0, code lost:
    
        r5 = r3;
        r1 = r30.zzJ;
        r3 = r1.length;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x02b5, code lost:
    
        if (r11 >= r3) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x02b7, code lost:
    
        r1[r11].zze(r5, 1, r8, r30.zzy, null);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x02c7, code lost:
    
        if (r2.zzh() != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x02c9, code lost:
    
        r30.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x02cc, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0284, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0166, code lost:
    
        r13 = r30.zzh;
        r14 = r13.zzi();
        r14[0] = 0;
        r14[1] = 0;
        r14[r17] = 0;
        r12 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0179, code lost:
    
        if (r30.zzE >= r30.zzD) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x017b, code lost:
    
        r3 = r30.zzF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x017d, code lost:
    
        if (r3 != 0) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0182, code lost:
    
        if (r30.zzK.length > 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0186, code lost:
    
        if (r30.zzG != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0197, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0198, code lost:
    
        r31.zzc(r14, r12, r8 + r3);
        r13.zzh(0);
        r9 = r13.zzB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x01a5, code lost:
    
        if (r9 < 0) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x01a7, code lost:
    
        r30.zzF = r9 - r3;
        r9 = r30.zzg;
        r9.zzh(0);
        r6.zzc(r9, r5);
        r30.zzE += r5;
        r30.zzD += r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x01bf, code lost:
    
        if (r30.zzK.length <= 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x01c1, code lost:
    
        if (r3 <= 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x01cb, code lost:
    
        if (com.google.android.gms.internal.ads.zzgm.zzb(r4.zzg, r14[r5]) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x01cd, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x01d0, code lost:
    
        r30.zzH = r7;
        r6.zzc(r13, r3);
        r30.zzE += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x01da, code lost:
    
        if (r3 <= 0) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x01de, code lost:
    
        if (r30.zzG != false) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x01e6, code lost:
    
        if (com.google.android.gms.internal.ads.zzgm.zzd(r14, r5, r3, r4.zzg) == false) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x01e8, code lost:
    
        r30.zzG = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x01cf, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x01f6, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzb("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0188, code lost:
    
        r3 = com.google.android.gms.internal.ads.zzgm.zzc(r4.zzg);
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0195, code lost:
    
        if ((r8 + r3) <= (r30.zzD - r30.zzE)) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x01f9, code lost:
    
        if (r30.zzH == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x01fb, code lost:
    
        r7 = r30.zzi;
        r7.zza(r3);
        r31.zzc(r7.zzi(), 0, r30.zzF);
        r6.zzc(r7, r30.zzF);
        r3 = r30.zzF;
        r32 = r5;
        r5 = com.google.android.gms.internal.ads.zzgm.zza(r7.zzi(), r7.zze());
        r7.zzh(0);
        r7.zzf(r5);
        r5 = r4.zzg.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x022a, code lost:
    
        if (r5 != (-1)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x022c, code lost:
    
        r5 = r30.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0232, code lost:
    
        if (r5.zzb() == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0234, code lost:
    
        r5.zza(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0243, code lost:
    
        r5 = r30.zzp;
        r5.zzc(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x024e, code lost:
    
        if ((r2.zzg() & 4) == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0250, code lost:
    
        r5.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x025b, code lost:
    
        r30.zzE += r3;
        r30.zzF -= r3;
        r5 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0238, code lost:
    
        r9 = r30.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x023e, code lost:
    
        if (r9.zzb() == r5) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0240, code lost:
    
        r9.zza(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0254, code lost:
    
        r32 = r5;
        r3 = r6.zza(r31, r3, false);
     */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        char c;
        String zzM;
        String zzM2;
        long zzt;
        long zzz;
        long j;
        long j2;
        while (true) {
            int i = this.zzs;
            char c2 = 2;
            if (i == 0) {
                if (this.zzv == 0) {
                    zzer zzerVar = this.zzm;
                    if (!zzaevVar.zzb(zzerVar.zzi(), 0, 8, true)) {
                        if (this.zzM == -1) {
                            this.zzp.zze();
                            return -1;
                        }
                        zzafvVar.zza = 0L;
                        this.zzM = -1L;
                        this.zzI.zzw(this.zzq.zzb());
                        return 1;
                    }
                    this.zzv = 8;
                    zzerVar.zzh(0);
                    this.zzu = zzerVar.zzz();
                    this.zzt = zzerVar.zzB();
                }
                long j3 = this.zzu;
                if (j3 == 1) {
                    zzer zzerVar2 = this.zzm;
                    zzaevVar.zzc(zzerVar2.zzi(), 8, 8);
                    this.zzv += 8;
                    this.zzu = zzerVar2.zzJ();
                } else if (j3 == 0) {
                    long zzo = zzaevVar.zzo();
                    if (zzo == -1) {
                        ArrayDeque arrayDeque = this.zzn;
                        zzo = !arrayDeque.isEmpty() ? ((zzfu) arrayDeque.peek()).zza : -1L;
                    }
                    if (zzo != -1) {
                        this.zzu = (zzo - zzaevVar.zzn()) + this.zzv;
                    }
                }
                long j4 = this.zzu;
                int i2 = this.zzv;
                long j5 = i2;
                if (j4 < j5) {
                    if (this.zzt != 1718773093 || i2 != 8) {
                        break;
                    }
                    this.zzu = j5;
                    j4 = j5;
                }
                if (this.zzM != -1) {
                    if (this.zzt == 1936286840) {
                        zzer zzerVar3 = this.zzk;
                        zzerVar3.zza((int) j4);
                        System.arraycopy(this.zzm.zzi(), 0, zzerVar3.zzi(), 0, 8);
                        zzaevVar.zzc(zzerVar3.zzi(), 8, (int) (this.zzu - this.zzv));
                        this.zzq.zza((zzaei) zzm(new zzfv(1936286840, zzerVar3).zza, zzaevVar.zzm()).second);
                    } else {
                        zzaevVar.zze((int) (j4 - j5), true);
                    }
                    zzi();
                } else {
                    long zzn = zzaevVar.zzn() - j5;
                    int i3 = this.zzt;
                    if ((i3 == 1836019558 || i3 == 1835295092) && !this.zzL) {
                        this.zzI.zzw(new zzafx(this.zzA, zzn));
                        this.zzL = true;
                    }
                    if (this.zzt == 1836019558) {
                        SparseArray sparseArray = this.zzf;
                        int size = sparseArray.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            zzale zzaleVar = ((zzakn) sparseArray.valueAt(i4)).zzb;
                            zzaleVar.zzc = zzn;
                            zzaleVar.zzb = zzn;
                        }
                    }
                    int i5 = this.zzt;
                    if (i5 == 1835295092) {
                        this.zzC = null;
                        this.zzx = zzn + this.zzu;
                        this.zzs = 2;
                    } else if (i5 == 1836019574 || i5 == 1953653099 || i5 == 1835297121 || i5 == 1835626086 || i5 == 1937007212 || i5 == 1836019558 || i5 == 1953653094 || i5 == 1836475768 || i5 == 1701082227 || i5 == 1835365473) {
                        long zzn2 = zzaevVar.zzn();
                        long j6 = this.zzu;
                        long j7 = zzn2 + j6;
                        if (j6 != this.zzv && i5 == 1835365473) {
                            zzer zzerVar4 = this.zzk;
                            zzerVar4.zza(8);
                            zzaevVar.zzi(zzerVar4.zzi(), 0, 8);
                            zzakh.zzf(zzerVar4);
                            zzaevVar.zzf(zzerVar4.zzg());
                            zzaevVar.zzl();
                        }
                        long j8 = j7 - 8;
                        this.zzn.push(new zzfu(this.zzt, j8));
                        if (this.zzu == this.zzv) {
                            zzj(j8);
                        } else {
                            zzi();
                        }
                    } else if (i5 == 1751411826 || i5 == 1835296868 || i5 == 1836476516 || i5 == 1936286840 || i5 == 1937011556 || i5 == 1937011827 || i5 == 1668576371 || i5 == 1937011555 || i5 == 1937011578 || i5 == 1937013298 || i5 == 1937007471 || i5 == 1668232756 || i5 == 1937011571 || i5 == 1952867444 || i5 == 1952868452 || i5 == 1953196132 || i5 == 1953654136 || i5 == 1953658222 || i5 == 1886614376 || i5 == 1935763834 || i5 == 1935763823 || i5 == 1936027235 || i5 == 1970628964 || i5 == 1935828848 || i5 == 1936158820 || i5 == 1701606260 || i5 == 1835362404 || i5 == 1701671783 || i5 == 1969517665 || i5 == 1801812339 || i5 == 1768715124) {
                        if (this.zzv != 8) {
                            throw zzat.zzc("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.zzu > 2147483647L) {
                            throw zzat.zzc("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        zzer zzerVar5 = new zzer((int) this.zzu);
                        System.arraycopy(this.zzm.zzi(), 0, zzerVar5.zzi(), 0, 8);
                        this.zzw = zzerVar5;
                        this.zzs = 1;
                    } else {
                        if (this.zzu > 2147483647L) {
                            throw zzat.zzc("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.zzw = null;
                        this.zzs = 1;
                    }
                }
            } else if (i != 1) {
                long j9 = Long.MAX_VALUE;
                if (i != 2) {
                    zzakn zzaknVar = this.zzC;
                    if (zzaknVar != null) {
                        c = 2;
                        break;
                    }
                    SparseArray sparseArray2 = this.zzf;
                    int size2 = sparseArray2.size();
                    long j10 = Long.MAX_VALUE;
                    int i6 = 0;
                    zzakn zzaknVar2 = null;
                    while (i6 < size2) {
                        char c3 = c2;
                        zzakn zzaknVar3 = (zzakn) sparseArray2.valueAt(i6);
                        if ((zzaknVar3.zzk() || zzaknVar3.zzf != zzaknVar3.zzd.zzb) && (!zzaknVar3.zzk() || zzaknVar3.zzh != zzaknVar3.zzb.zzd)) {
                            long zze = zzaknVar3.zze();
                            if (zze < j10) {
                                zzaknVar2 = zzaknVar3;
                                j10 = zze;
                            }
                        }
                        i6++;
                        c2 = c3;
                    }
                    c = c2;
                    if (zzaknVar2 == null) {
                        int zzn3 = (int) (this.zzx - zzaevVar.zzn());
                        if (zzn3 < 0) {
                            throw zzat.zzb("Offset to end of mdat was negative.", null);
                        }
                        zzaevVar.zzf(zzn3);
                        zzi();
                    } else {
                        int zze2 = (int) (zzaknVar2.zze() - zzaevVar.zzn());
                        if (zze2 < 0) {
                            zzee.zzc("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            zze2 = 0;
                        }
                        zzaevVar.zzf(zze2);
                        this.zzC = zzaknVar2;
                        zzaknVar = zzaknVar2;
                    }
                } else {
                    SparseArray sparseArray3 = this.zzf;
                    int size3 = sparseArray3.size();
                    zzakn zzaknVar4 = null;
                    for (int i7 = 0; i7 < size3; i7++) {
                        zzale zzaleVar2 = ((zzakn) sparseArray3.valueAt(i7)).zzb;
                        if (zzaleVar2.zzo) {
                            long j11 = zzaleVar2.zzc;
                            if (j11 < j9) {
                                zzaknVar4 = (zzakn) sparseArray3.valueAt(i7);
                                j9 = j11;
                            }
                        }
                    }
                    if (zzaknVar4 == null) {
                        this.zzs = 3;
                    } else {
                        int zzn4 = (int) (j9 - zzaevVar.zzn());
                        if (zzn4 < 0) {
                            throw zzat.zzb("Offset to encryption data was negative.", null);
                        }
                        zzaevVar.zzf(zzn4);
                        zzale zzaleVar3 = zzaknVar4.zzb;
                        zzer zzerVar6 = zzaleVar3.zzn;
                        zzaevVar.zzc(zzerVar6.zzi(), 0, zzerVar6.zze());
                        zzerVar6.zzh(0);
                        zzaleVar3.zzo = false;
                    }
                }
            } else {
                long j12 = this.zzu - this.zzv;
                zzer zzerVar7 = this.zzw;
                int i8 = (int) j12;
                if (zzerVar7 != null) {
                    zzaevVar.zzc(zzerVar7.zzi(), 8, i8);
                    zzfv zzfvVar = new zzfv(this.zzt, zzerVar7);
                    ArrayDeque arrayDeque2 = this.zzn;
                    if (arrayDeque2.isEmpty()) {
                        int i9 = zzfvVar.zzd;
                        if (i9 == 1936286840) {
                            Pair zzm = zzm(zzfvVar.zza, zzaevVar.zzn());
                            this.zzq.zza((zzaei) zzm.second);
                            if (!this.zzL) {
                                this.zzB = ((Long) zzm.first).longValue();
                                this.zzI.zzw((zzafy) zzm.second);
                                this.zzL = true;
                            }
                        } else if (i9 == 1701671783) {
                            zzer zzerVar8 = zzfvVar.zza;
                            if (this.zzJ.length != 0) {
                                zzerVar8.zzh(8);
                                int zza2 = zzakh.zza(zzerVar8.zzB());
                                if (zza2 == 0) {
                                    zzM = zzerVar8.zzM((char) 0);
                                    zzM.getClass();
                                    zzM2 = zzerVar8.zzM((char) 0);
                                    zzM2.getClass();
                                    long zzz2 = zzerVar8.zzz();
                                    long zzt2 = zzfj.zzt(zzerVar8.zzz(), 1000000L, zzz2, RoundingMode.DOWN);
                                    long j13 = this.zzB;
                                    long j14 = j13 != -9223372036854775807L ? j13 + zzt2 : -9223372036854775807L;
                                    zzt = zzfj.zzt(zzerVar8.zzz(), 1000L, zzz2, RoundingMode.DOWN);
                                    zzz = zzerVar8.zzz();
                                    j = zzt2;
                                    j2 = j14;
                                } else if (zza2 != 1) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 35);
                                    sb.append("Skipping unsupported emsg version: ");
                                    sb.append(zza2);
                                    zzee.zzc("FragmentedMp4Extractor", sb.toString());
                                } else {
                                    long zzz3 = zzerVar8.zzz();
                                    long zzt3 = zzfj.zzt(zzerVar8.zzJ(), 1000000L, zzz3, RoundingMode.DOWN);
                                    long zzt4 = zzfj.zzt(zzerVar8.zzz(), 1000L, zzz3, RoundingMode.DOWN);
                                    long zzz4 = zzerVar8.zzz();
                                    zzM = zzerVar8.zzM((char) 0);
                                    zzM.getClass();
                                    zzM2 = zzerVar8.zzM((char) 0);
                                    zzM2.getClass();
                                    zzt = zzt4;
                                    zzz = zzz4;
                                    j = -9223372036854775807L;
                                    j2 = zzt3;
                                }
                                String str = zzM;
                                String str2 = zzM2;
                                byte[] bArr = new byte[zzerVar8.zzd()];
                                zzerVar8.zzm(bArr, 0, zzerVar8.zzd());
                                zzer zzerVar9 = new zzer(this.zzl.zza(new zzahy(str, str2, zzt, zzz, bArr)));
                                int zzd = zzerVar9.zzd();
                                for (zzagh zzaghVar : this.zzJ) {
                                    zzerVar9.zzh(0);
                                    zzaghVar.zzc(zzerVar9, zzd);
                                }
                                if (j2 == -9223372036854775807L) {
                                    this.zzo.addLast(new zzakm(j, true, zzd));
                                    this.zzy += zzd;
                                } else {
                                    ArrayDeque arrayDeque3 = this.zzo;
                                    if (arrayDeque3.isEmpty()) {
                                        for (zzagh zzaghVar2 : this.zzJ) {
                                            zzaghVar2.zze(j2, 1, zzd, 0, null);
                                        }
                                    } else {
                                        arrayDeque3.addLast(new zzakm(j2, false, zzd));
                                        this.zzy += zzd;
                                    }
                                }
                            }
                        }
                    } else {
                        ((zzfu) arrayDeque2.peek()).zza(zzfvVar);
                    }
                } else {
                    zzaevVar.zzf(i8);
                }
                zzj(zzaevVar.zzn());
            }
        }
        throw zzat.zzc("Atom size less than header length (unsupported).");
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j, long j2) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((zzakn) sparseArray.valueAt(i)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j2;
        this.zzn.clear();
        zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    final /* synthetic */ void zzh(long j, zzer zzerVar) {
        zzaeh.zza(j, zzerVar, this.zzK);
    }

    public zzako(zzamd zzamdVar, int i, zzfg zzfgVar, zzalc zzalcVar, List list, zzagh zzaghVar) {
        this.zzc = zzamdVar;
        this.zzd = i;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzahz();
        this.zzm = new zzer(16);
        this.zzg = new zzer(zzgm.zza);
        this.zzh = new zzer(6);
        this.zzi = new zzer();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzer(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzguf.zzi();
        this.zzA = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzI = zzaex.zza;
        this.zzJ = new zzagh[0];
        this.zzK = new zzagh[0];
        this.zzp = new zzgq(new zzgp() { // from class: com.google.android.gms.internal.ads.zzakl
            @Override // com.google.android.gms.internal.ads.zzgp
            public final /* synthetic */ void zza(long j, zzer zzerVar) {
                zzako.this.zzh(j, zzerVar);
            }
        });
        this.zzq = new zzaej();
        this.zzM = -1L;
    }
}

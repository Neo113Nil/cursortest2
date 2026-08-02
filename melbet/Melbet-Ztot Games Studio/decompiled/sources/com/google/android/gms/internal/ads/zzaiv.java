package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzaiv {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzadm zza(zzacl zzaclVar) throws IOException {
        return zzc(zzaclVar, true, false);
    }

    public static zzadm zzb(zzacl zzaclVar, boolean z) throws IOException {
        return zzc(zzaclVar, false, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x011c, code lost:
    
        if (r11 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0120, code lost:
    
        return com.google.android.gms.internal.ads.zzair.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0123, code lost:
    
        if (r25 == r4) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0125, code lost:
    
        if (r4 == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return com.google.android.gms.internal.ads.zzaim.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012c, code lost:
    
        return com.google.android.gms.internal.ads.zzaim.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011b, code lost:
    
        r4 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzadm zzc(zzacl zzaclVar, boolean z, boolean z2) throws IOException {
        int i;
        long j;
        int i2;
        int[] iArr;
        long zzd = zzaclVar.zzd();
        long j2 = 4096;
        long j3 = -1;
        if (zzd != -1 && zzd <= 4096) {
            j2 = zzd;
        }
        zzek zzekVar = new zzek(64);
        int i3 = (int) j2;
        int i4 = 0;
        int i5 = 0;
        boolean z3 = false;
        while (true) {
            if (i5 >= i3) {
                break;
            }
            zzekVar.zzH(8);
            if (!zzaclVar.zzm(zzekVar.zzM(), i4, 8, true)) {
                break;
            }
            long zzu = zzekVar.zzu();
            int zzg = zzekVar.zzg();
            if (zzu == 1) {
                zzaclVar.zzh(zzekVar.zzM(), 8, 8);
                i2 = 16;
                zzekVar.zzJ(16);
                i = i3;
                j = zzekVar.zzt();
            } else {
                if (zzu == 0) {
                    long zzd2 = zzaclVar.zzd();
                    if (zzd2 != j3) {
                        zzu = (zzd2 - zzaclVar.zze()) + 8;
                    }
                }
                i = i3;
                j = zzu;
                i2 = 8;
            }
            long j4 = i2;
            if (j < j4) {
                return new zzaig(zzg, j, i2);
            }
            i5 += i2;
            if (zzg == 1836019574) {
                i3 = i + ((int) j);
                if (zzd != -1 && i3 > zzd) {
                    i3 = (int) zzd;
                }
                i4 = 0;
            } else {
                if (zzg == 1836019558 || zzg == 1836475768) {
                    break;
                }
                z3 |= !(zzg != 1835295092);
                long j5 = zzd;
                int i6 = i;
                if ((i5 + j) - j4 >= i6) {
                    i4 = 0;
                    break;
                }
                int i7 = (int) (j - j4);
                i5 += i7;
                if (zzg != 1718909296) {
                    i4 = 0;
                    if (i7 != 0) {
                        zzaclVar.zzg(i7);
                    }
                } else {
                    if (i7 < 8) {
                        return new zzaig(1718909296, i7, 8);
                    }
                    zzekVar.zzH(i7);
                    i4 = 0;
                    zzaclVar.zzh(zzekVar.zzM(), 0, i7);
                    int zzg2 = zzekVar.zzg();
                    boolean zzd3 = zzd(zzg2, z2) | z3;
                    zzekVar.zzL(4);
                    int zzb = zzekVar.zzb() / 4;
                    if (!zzd3 && zzb > 0) {
                        iArr = new int[zzb];
                        int i8 = 0;
                        while (true) {
                            if (i8 >= zzb) {
                                break;
                            }
                            int zzg3 = zzekVar.zzg();
                            iArr[i8] = zzg3;
                            if (zzd(zzg3, z2)) {
                                zzd3 = true;
                                break;
                            }
                            i8++;
                        }
                    } else {
                        iArr = null;
                    }
                    if (!zzd3) {
                        return new zzaja(zzg2, iArr);
                    }
                    z3 = zzd3;
                }
                i3 = i6;
                zzd = j5;
            }
            j3 = -1;
        }
    }

    private static boolean zzd(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = zza;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }
}

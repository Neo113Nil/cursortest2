package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaio {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean zza(zzacf zzacfVar) throws IOException {
        return zzc(zzacfVar, true, false);
    }

    public static boolean zzb(zzacf zzacfVar, boolean z) throws IOException {
        return zzc(zzacfVar, false, false);
    }

    private static boolean zzc(zzacf zzacfVar, boolean z, boolean z2) throws IOException {
        long j;
        int i;
        zzfj zzfjVar;
        boolean z3;
        long zzd = zzacfVar.zzd();
        long j2 = -1;
        long j3 = 4096;
        if (zzd != -1 && zzd <= 4096) {
            j3 = zzd;
        }
        zzfj zzfjVar2 = new zzfj(64);
        int i2 = (int) j3;
        boolean z4 = false;
        int i3 = 0;
        boolean z5 = false;
        while (i3 < i2) {
            zzfjVar2.zzD(8);
            if (!zzacfVar.zzm(zzfjVar2.zzI(), z4 ? 1 : 0, 8, true)) {
                break;
            }
            long zzt = zzfjVar2.zzt();
            int zzf = zzfjVar2.zzf();
            if (zzt == 1) {
                zzacfVar.zzh(zzfjVar2.zzI(), 8, 8);
                i = 16;
                zzfjVar2.zzF(16);
                j = zzfjVar2.zzs();
            } else {
                if (zzt == 0) {
                    long zzd2 = zzacfVar.zzd();
                    if (zzd2 != j2) {
                        zzt = (zzd2 - zzacfVar.zze()) + 8;
                    }
                }
                j = zzt;
                i = 8;
            }
            long j4 = i;
            if (j < j4) {
                return z4;
            }
            i3 += i;
            if (zzf == 1836019574) {
                i2 += (int) j;
                if (zzd != -1 && i2 > zzd) {
                    i2 = (int) zzd;
                }
                j2 = -1;
            } else {
                if (zzf == 1836019558 || zzf == 1836475768) {
                    z4 = true;
                    break;
                }
                z5 |= !(zzf == 1835295092 ? z4 ? 1 : 0 : true);
                zzfj zzfjVar3 = zzfjVar2;
                if ((i3 + j) - j4 >= i2) {
                    break;
                }
                int i4 = (int) (j - j4);
                i3 += i4;
                if (zzf != 1718909296) {
                    zzfjVar = zzfjVar3;
                    if (i4 != 0) {
                        zzacfVar.zzg(i4);
                    }
                } else {
                    if (i4 < 8) {
                        return false;
                    }
                    zzfjVar = zzfjVar3;
                    zzfjVar.zzD(i4);
                    zzacfVar.zzh(zzfjVar.zzI(), 0, i4);
                    int i5 = i4 >> 2;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (i6 != 1) {
                            int zzf2 = zzfjVar.zzf();
                            if ((zzf2 >>> 8) != 3368816) {
                                if (zzf2 == 1751476579) {
                                    zzf2 = 1751476579;
                                }
                                int[] iArr = zza;
                                for (int i7 = 0; i7 < 29; i7++) {
                                    if (iArr[i7] != zzf2) {
                                    }
                                }
                            }
                            z3 = true;
                            break;
                        }
                        zzfjVar.zzH(4);
                    }
                    z3 = z5;
                    if (!z3) {
                        return false;
                    }
                    z5 = z3;
                }
                zzfjVar2 = zzfjVar;
                j2 = -1;
                z4 = false;
            }
        }
        z4 = false;
        return z5 && z == z4;
    }
}

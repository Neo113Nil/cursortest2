package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzalb {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzagc zza(zzaev zzaevVar) throws IOException {
        return zzc(zzaevVar, true, false);
    }

    public static zzagc zzb(zzaev zzaevVar, boolean z) throws IOException {
        return zzc(zzaevVar, false, z);
    }

    private static zzagc zzc(zzaev zzaevVar, boolean z, boolean z2) throws IOException {
        zzagc zzagcVar;
        long j;
        zzer zzerVar;
        int i;
        int i2;
        long j2;
        int i3;
        int i4;
        int[] iArr;
        long zzo = zzaevVar.zzo();
        long j3 = -1;
        long j4 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (zzo != -1 && zzo <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j4 = zzo;
        }
        zzer zzerVar2 = new zzer(64);
        int i5 = (int) j4;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i5) {
            zzerVar2.zza(8);
            if (!zzaevVar.zzh(zzerVar2.zzi(), i6, 8, true)) {
                break;
            }
            long zzz = zzerVar2.zzz();
            int zzB = zzerVar2.zzB();
            if (zzz == 1) {
                j = j3;
                zzaevVar.zzi(zzerVar2.zzi(), 8, 8);
                i = 16;
                zzerVar2.zzf(16);
                zzz = zzerVar2.zzD();
                zzerVar = zzerVar2;
            } else {
                j = j3;
                if (zzz == 0) {
                    long zzo2 = zzaevVar.zzo();
                    if (zzo2 != j) {
                        zzz = (zzo2 - zzaevVar.zzm()) + 8;
                    }
                }
                zzerVar = zzerVar2;
                i = 8;
            }
            long j5 = zzz;
            zzagcVar = null;
            long j6 = i;
            if (j5 < j6) {
                i2 = 1;
                if (zzB == 1718773093) {
                    if (i == 8) {
                        j5 = 8;
                        zzB = 1718773093;
                    } else {
                        zzB = 1718773093;
                    }
                }
                return new zzajv(zzB, j5, i);
            }
            i2 = 1;
            i7 += i;
            if (zzB == 1836019574) {
                i5 += (int) j5;
                if (zzo != -1 && i5 > zzo) {
                    i5 = (int) zzo;
                }
                zzerVar2 = zzerVar;
                j3 = j;
                i6 = 0;
            } else {
                if (zzB == 1953653099 || zzB == 1835297121 || zzB == 1835626086) {
                    j2 = zzo;
                    i3 = 0;
                } else {
                    if (zzB == 1836019558 || zzB == 1836475768) {
                        i6 = i2;
                        break;
                    }
                    i8 |= (zzB == 1835295092 ? 0 : i2) ^ 1;
                    if (zzB == 1937007212) {
                        if (j5 > 1000000) {
                            i6 = 0;
                            break;
                        }
                        zzB = 1937007212;
                    }
                    j2 = zzo;
                    if ((i7 + j5) - j6 >= i5) {
                        i6 = 0;
                        break;
                    }
                    int i9 = (int) (j5 - j6);
                    i7 += i9;
                    if (zzB != 1718909296) {
                        i3 = 0;
                        if (i9 != 0) {
                            zzaevVar.zzk(i9);
                        }
                    } else {
                        if (i9 < 8) {
                            return new zzajv(1718909296, i9, 8);
                        }
                        zzerVar.zza(i9);
                        i3 = 0;
                        zzaevVar.zzi(zzerVar.zzi(), 0, i9);
                        int zzB2 = zzerVar.zzB();
                        int i10 = (zzd(zzB2, z2) ? 1 : 0) | i8;
                        zzerVar.zzk(4);
                        int zzd = zzerVar.zzd() / 4;
                        if (i10 == 0 && zzd > 0) {
                            iArr = new int[zzd];
                            int i11 = 0;
                            while (true) {
                                if (i11 >= zzd) {
                                    i4 = i10;
                                    break;
                                }
                                int zzB3 = zzerVar.zzB();
                                iArr[i11] = zzB3;
                                if (zzd(zzB3, z2)) {
                                    i4 = i2;
                                    break;
                                }
                                i11++;
                            }
                        } else {
                            i4 = i10;
                            iArr = null;
                        }
                        if (i4 == 0) {
                            return new zzalg(zzB2, iArr);
                        }
                        i8 = i4;
                    }
                }
                i6 = i3;
                zzerVar2 = zzerVar;
                zzo = j2;
                j3 = j;
            }
        }
        zzagcVar = null;
        return i8 == 0 ? zzakx.zza : z != i6 ? i6 != 0 ? zzakp.zza : zzakp.zzb : zzagcVar;
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

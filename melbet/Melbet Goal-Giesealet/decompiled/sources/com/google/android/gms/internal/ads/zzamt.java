package com.google.android.gms.internal.ads;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.ViewUtils;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzamt {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(zzee zzeeVar, zzamr zzamrVar) throws zzas {
        long zzk;
        zzeeVar.zze();
        int zzf = zzf(zzeeVar, 3, 8, 8);
        zzamrVar.zza = zzf;
        if (zzf == -1) {
            return false;
        }
        zzghc.zza(Math.max(Math.max(2, 8), 32) <= 63);
        Math.addExact(Math.addExact(3L, 255L), 4294967296L);
        if (zzeeVar.zzc() >= 2) {
            zzk = zzeeVar.zzk(2);
            if (zzk == 3) {
                if (zzeeVar.zzc() >= 8) {
                    long zzk2 = zzeeVar.zzk(8);
                    long j = zzk2 + 3;
                    if (zzk2 != 255) {
                        zzk = j;
                    } else if (zzeeVar.zzc() >= 32) {
                        zzk = j + zzeeVar.zzk(32);
                    }
                }
            }
            zzamrVar.zzb = zzk;
            if (zzk != -1) {
                return false;
            }
            if (zzk > 16) {
                StringBuilder sb = new StringBuilder(String.valueOf(zzk).length() + 49);
                sb.append("Contains sub-stream with an invalid packet label ");
                sb.append(zzk);
                throw zzas.zzc(sb.toString());
            }
            if (zzk == 0) {
                int i = zzamrVar.zza;
                if (i == 1) {
                    throw zzas.zzb("Mpegh3daConfig packet with invalid packet label 0", null);
                }
                if (i == 2) {
                    throw zzas.zzb("Mpegh3daFrame packet with invalid packet label 0", null);
                }
                if (i == 17) {
                    throw zzas.zzb("AudioTruncation packet with invalid packet label 0", null);
                }
            }
            int zzf2 = zzf(zzeeVar, 11, 24, 24);
            zzamrVar.zzc = zzf2;
            return zzf2 != -1;
        }
        zzk = -1;
        zzamrVar.zzb = zzk;
        if (zzk != -1) {
        }
    }

    public static zzams zzb(zzee zzeeVar) throws zzas {
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        int i5;
        char c2;
        int zzj = zzeeVar.zzj(8);
        int i6 = 5;
        int zzj2 = zzeeVar.zzj(5);
        if (zzj2 != 31) {
            switch (zzj2) {
                case 0:
                    i = 96000;
                    break;
                case 1:
                    i = 88200;
                    break;
                case 2:
                    i = 64000;
                    break;
                case 3:
                    i = 48000;
                    break;
                case 4:
                    i = 44100;
                    break;
                case 5:
                    i = 32000;
                    break;
                case 6:
                    i = 24000;
                    break;
                case 7:
                    i = 22050;
                    break;
                case 8:
                    i = 16000;
                    break;
                case 9:
                    i = 12000;
                    break;
                case 10:
                    i = 11025;
                    break;
                case 11:
                    i = 8000;
                    break;
                case 12:
                    i = 7350;
                    break;
                case 13:
                case 14:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(zzj2).length() + 32);
                    sb.append("Unsupported sampling rate index ");
                    sb.append(zzj2);
                    throw zzas.zzc(sb.toString());
                case 15:
                    i = 57600;
                    break;
                case 16:
                    i = 51200;
                    break;
                case 17:
                    i = 40000;
                    break;
                case 18:
                    i = 38400;
                    break;
                case 19:
                    i = 34150;
                    break;
                case 20:
                    i = 28800;
                    break;
                case 21:
                    i = 25600;
                    break;
                case 22:
                    i = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
                    break;
                case 23:
                    i = 19200;
                    break;
                case 24:
                    i = 17075;
                    break;
                case 25:
                    i = 14400;
                    break;
                case 26:
                    i = 12800;
                    break;
                case 27:
                    i = 9600;
                    break;
            }
        } else {
            i = zzeeVar.zzj(24);
        }
        int zzj3 = zzeeVar.zzj(3);
        int i7 = 1;
        if (zzj3 == 0) {
            i2 = ViewUtils.EDGE_TO_EDGE_FLAGS;
        } else if (zzj3 == 1) {
            i2 = 1024;
        } else if (zzj3 == 2 || zzj3 == 3) {
            i2 = 2048;
        } else {
            if (zzj3 != 4) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(zzj3).length() + 36);
                sb2.append("Unsupported coreSbrFrameLengthIndex ");
                sb2.append(zzj3);
                throw zzas.zzc(sb2.toString());
            }
            i2 = 4096;
        }
        if (zzj3 == 0 || zzj3 == 1) {
            c = 0;
        } else if (zzj3 == 2) {
            c = 2;
        } else if (zzj3 == 3) {
            c = 3;
        } else {
            if (zzj3 != 4) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(zzj3).length() + 36);
                sb3.append("Unsupported coreSbrFrameLengthIndex ");
                sb3.append(zzj3);
                throw zzas.zzc(sb3.toString());
            }
            c = 1;
        }
        zzeeVar.zzh(2);
        zzc(zzeeVar);
        int zzj4 = zzeeVar.zzj(5);
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = 16;
            if (i8 < zzj4 + 1) {
                int zzj5 = zzeeVar.zzj(3);
                i9 += zzf(zzeeVar, 5, 8, 16) + 1;
                if ((zzj5 == 0 || zzj5 == 2) && zzeeVar.zzi()) {
                    zzc(zzeeVar);
                }
                i8++;
            } else {
                int zzf = zzf(zzeeVar, 4, 8, 16) + 1;
                zzeeVar.zzg();
                int i11 = 0;
                while (true) {
                    double d = 2.0d;
                    if (i11 >= zzf) {
                        int i12 = zzj;
                        byte[] bArr = null;
                        if (zzeeVar.zzi()) {
                            int zzf2 = zzf(zzeeVar, 2, 4, 8) + 1;
                            for (int i13 = 0; i13 < zzf2; i13++) {
                                int zzf3 = zzf(zzeeVar, 4, 8, 16);
                                int zzf4 = zzf(zzeeVar, 4, 8, 16);
                                if (zzf3 == 7) {
                                    int zzj6 = zzeeVar.zzj(4) + 1;
                                    zzeeVar.zzh(4);
                                    byte[] bArr2 = new byte[zzj6];
                                    for (int i14 = 0; i14 < zzj6; i14++) {
                                        bArr2[i14] = (byte) zzeeVar.zzj(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzeeVar.zzh(zzf4 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (i) {
                            case 14700:
                            case 16000:
                                d = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d = 1.0d;
                                break;
                            default:
                                StringBuilder sb4 = new StringBuilder(String.valueOf(i).length() + 26);
                                sb4.append("Unsupported sampling rate ");
                                sb4.append(i);
                                throw zzas.zzc(sb4.toString());
                        }
                        return new zzams(i12, (int) (i * d), (int) (i2 * d), bArr3, null);
                    }
                    int zzj7 = zzeeVar.zzj(2);
                    if (zzj7 == 0) {
                        i3 = zzj;
                        i4 = i7;
                        zzd(zzeeVar);
                        if (c > 0) {
                            zze(zzeeVar);
                        }
                    } else if (zzj7 == i7) {
                        i4 = i7;
                        if (zzd(zzeeVar)) {
                            zzeeVar.zzg();
                        }
                        if (c > 0) {
                            zze(zzeeVar);
                            i5 = zzeeVar.zzj(2);
                            c2 = c;
                        } else {
                            i5 = 0;
                            c2 = 0;
                        }
                        if (i5 > 0) {
                            zzeeVar.zzh(6);
                            int zzj8 = zzeeVar.zzj(2);
                            zzeeVar.zzh(4);
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(i6);
                            }
                            if (i5 == 2 || i5 == 3) {
                                zzeeVar.zzh(6);
                            }
                            if (zzj8 == 2) {
                                zzeeVar.zzg();
                            }
                        }
                        i3 = zzj;
                        int floor = ((int) Math.floor(Math.log(i9 - 1) / Math.log(2.0d))) + 1;
                        int zzj9 = zzeeVar.zzj(2);
                        if (zzj9 > 0 && zzeeVar.zzi()) {
                            zzeeVar.zzh(floor);
                        }
                        if (zzeeVar.zzi()) {
                            zzeeVar.zzh(floor);
                        }
                        if (c2 == 0 && zzj9 == 0) {
                            zzeeVar.zzg();
                        }
                    } else if (zzj7 != 3) {
                        i3 = zzj;
                        i4 = i7;
                    } else {
                        zzf(zzeeVar, 4, 8, i10);
                        int zzf5 = zzf(zzeeVar, 4, 8, i10);
                        i4 = i7;
                        if (zzeeVar.zzi()) {
                            zzf(zzeeVar, 8, i10, 0);
                        }
                        zzeeVar.zzg();
                        if (zzf5 > 0) {
                            zzeeVar.zzh(zzf5 * 8);
                        }
                        i3 = zzj;
                    }
                    i11++;
                    zzj = i3;
                    i7 = i4;
                    i6 = 5;
                    i10 = 16;
                }
            }
        }
    }

    private static void zzc(zzee zzeeVar) {
        int zzj;
        int zzj2 = zzeeVar.zzj(2);
        if (zzj2 == 0) {
            zzeeVar.zzh(6);
            return;
        }
        int zzf = zzf(zzeeVar, 5, 8, 16) + 1;
        if (zzj2 == 1) {
            zzeeVar.zzh(zzf * 7);
            return;
        }
        if (zzj2 == 2) {
            boolean zzi = zzeeVar.zzi();
            int i = true != zzi ? 5 : 1;
            int i2 = true == zzi ? 7 : 5;
            int i3 = true == zzi ? 8 : 6;
            int i4 = 0;
            while (i4 < zzf) {
                if (zzeeVar.zzi()) {
                    zzeeVar.zzh(7);
                    zzj = 0;
                } else {
                    if (zzeeVar.zzj(2) == 3 && zzeeVar.zzj(i2) * i != 0) {
                        zzeeVar.zzg();
                    }
                    zzj = zzeeVar.zzj(i3) * i;
                    if (zzj != 0 && zzj != 180) {
                        zzeeVar.zzg();
                    }
                    zzeeVar.zzg();
                }
                if (zzj != 0 && zzj != 180 && zzeeVar.zzi()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    private static boolean zzd(zzee zzeeVar) {
        zzeeVar.zzh(3);
        boolean zzi = zzeeVar.zzi();
        if (zzi) {
            zzeeVar.zzh(13);
        }
        return zzi;
    }

    private static void zze(zzee zzeeVar) {
        zzeeVar.zzh(3);
        zzeeVar.zzh(8);
        boolean zzi = zzeeVar.zzi();
        boolean zzi2 = zzeeVar.zzi();
        if (zzi) {
            zzeeVar.zzh(5);
        }
        if (zzi2) {
            zzeeVar.zzh(6);
        }
    }

    private static int zzf(zzee zzeeVar, int i, int i2, int i3) {
        zzghc.zza(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        Math.addExact(Math.addExact(i4, i5), 1 << i3);
        if (zzeeVar.zzc() < i) {
            return -1;
        }
        int zzj = zzeeVar.zzj(i);
        if (zzj != i4) {
            return zzj;
        }
        if (zzeeVar.zzc() < i2) {
            return -1;
        }
        int zzj2 = zzeeVar.zzj(i2);
        int i6 = zzj + zzj2;
        if (zzj2 != i5) {
            return i6;
        }
        if (zzeeVar.zzc() < i3) {
            return -1;
        }
        return i6 + zzeeVar.zzj(i3);
    }
}

package com.google.android.gms.internal.ads;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.gms.games.GamesStatusCodes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzamw {
    public static zzamv zza(zzej zzejVar) throws zzbo {
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        char c2;
        int zzd = zzejVar.zzd(8);
        int i5 = 5;
        int zzd2 = zzejVar.zzd(5);
        if (zzd2 != 31) {
            switch (zzd2) {
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
                    i = GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY;
                    break;
                case 12:
                    i = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw zzbo.zzc("Unsupported sampling rate index " + zzd2);
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
            i = zzejVar.zzd(24);
        }
        int zzd3 = zzejVar.zzd(3);
        int i6 = 1;
        if (zzd3 == 0) {
            i2 = 768;
        } else if (zzd3 == 1) {
            i2 = 1024;
        } else if (zzd3 == 2 || zzd3 == 3) {
            i2 = 2048;
        } else {
            if (zzd3 != 4) {
                throw zzbo.zzc("Unsupported coreSbrFrameLengthIndex " + zzd3);
            }
            i2 = 4096;
        }
        if (zzd3 == 0 || zzd3 == 1) {
            c = 0;
        } else if (zzd3 == 2) {
            c = 2;
        } else if (zzd3 == 3) {
            c = 3;
        } else {
            if (zzd3 != 4) {
                throw zzbo.zzc("Unsupported coreSbrFrameLengthIndex " + zzd3);
            }
            c = 1;
        }
        zzejVar.zzn(2);
        zze(zzejVar);
        int zzd4 = zzejVar.zzd(5);
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = 16;
            if (i7 < zzd4 + 1) {
                int zzd5 = zzejVar.zzd(3);
                i8 += zzc(zzejVar, 5, 8, 16) + 1;
                if ((zzd5 == 0 || zzd5 == 2) && zzejVar.zzp()) {
                    zze(zzejVar);
                }
                i7++;
            } else {
                int zzc = zzc(zzejVar, 4, 8, 16) + 1;
                zzejVar.zzm();
                int i10 = 0;
                while (true) {
                    double d = 2.0d;
                    if (i10 >= zzc) {
                        int i11 = zzd;
                        byte[] bArr = null;
                        if (zzejVar.zzp()) {
                            int zzc2 = zzc(zzejVar, 2, 4, 8) + 1;
                            for (int i12 = 0; i12 < zzc2; i12++) {
                                int zzc3 = zzc(zzejVar, 4, 8, 16);
                                int zzc4 = zzc(zzejVar, 4, 8, 16);
                                if (zzc3 == 7) {
                                    int zzd6 = zzejVar.zzd(4) + 1;
                                    zzejVar.zzn(4);
                                    byte[] bArr2 = new byte[zzd6];
                                    for (int i13 = 0; i13 < zzd6; i13++) {
                                        bArr2[i13] = (byte) zzejVar.zzd(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzejVar.zzn(zzc4 * 8);
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
                                throw zzbo.zzc("Unsupported sampling rate " + i);
                        }
                        return new zzamv(i11, (int) (i * d), (int) (i2 * d), bArr3, null);
                    }
                    int zzd7 = zzejVar.zzd(2);
                    if (zzd7 == 0) {
                        i3 = zzd;
                        zzf(zzejVar);
                        if (c > 0) {
                            zzd(zzejVar);
                        }
                    } else if (zzd7 != i6) {
                        if (zzd7 == 3) {
                            zzc(zzejVar, 4, 8, i9);
                            int zzc5 = zzc(zzejVar, 4, 8, i9);
                            if (zzejVar.zzp()) {
                                zzc(zzejVar, 8, i9, 0);
                            }
                            zzejVar.zzm();
                            if (zzc5 > 0) {
                                zzejVar.zzn(zzc5 * 8);
                            }
                        }
                        i3 = zzd;
                    } else {
                        if (zzf(zzejVar)) {
                            zzejVar.zzm();
                        }
                        if (c > 0) {
                            zzd(zzejVar);
                            i4 = zzejVar.zzd(2);
                            c2 = c;
                        } else {
                            i4 = 0;
                            c2 = 0;
                        }
                        if (i4 > 0) {
                            zzejVar.zzn(6);
                            int zzd8 = zzejVar.zzd(2);
                            zzejVar.zzn(4);
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(i5);
                            }
                            if (i4 == 2 || i4 == 3) {
                                zzejVar.zzn(6);
                            }
                            if (zzd8 == 2) {
                                zzejVar.zzm();
                            }
                        }
                        i3 = zzd;
                        int floor = ((int) Math.floor(Math.log(i8 - 1) / Math.log(2.0d))) + 1;
                        int zzd9 = zzejVar.zzd(2);
                        if (zzd9 > 0 && zzejVar.zzp()) {
                            zzejVar.zzn(floor);
                        }
                        if (zzejVar.zzp()) {
                            zzejVar.zzn(floor);
                        }
                        if (c2 == 0 && zzd9 == 0) {
                            zzejVar.zzm();
                        }
                    }
                    i10++;
                    zzd = i3;
                    i5 = 5;
                    i6 = 1;
                    i9 = 16;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzb(zzej zzejVar, zzamt zzamtVar) throws zzbo {
        long zze;
        zzejVar.zzb();
        int zzc = zzc(zzejVar, 3, 8, 8);
        zzamtVar.zza = zzc;
        if (zzc == -1) {
            return false;
        }
        zzdi.zzd(Math.max(Math.max(2, 8), 32) <= 63);
        zzgaj.zza(zzgaj.zza(3L, 255L), 4294967296L);
        if (zzejVar.zza() >= 2) {
            zze = zzejVar.zze(2);
            if (zze == 3) {
                if (zzejVar.zza() >= 8) {
                    long zze2 = zzejVar.zze(8);
                    long j = 3 + zze2;
                    if (zze2 != 255) {
                        zze = j;
                    } else if (zzejVar.zza() >= 32) {
                        zze = zzejVar.zze(32) + j;
                    }
                }
            }
            zzamtVar.zzb = zze;
            if (zze != -1) {
                return false;
            }
            if (zze > 16) {
                throw zzbo.zzc("Contains sub-stream with an invalid packet label " + zze);
            }
            if (zze == 0) {
                int i = zzamtVar.zza;
                if (i == 1) {
                    throw zzbo.zza("Mpegh3daConfig packet with invalid packet label 0", null);
                }
                if (i == 2) {
                    throw zzbo.zza("Mpegh3daFrame packet with invalid packet label 0", null);
                }
                if (i == 17) {
                    throw zzbo.zza("AudioTruncation packet with invalid packet label 0", null);
                }
            }
            int zzc2 = zzc(zzejVar, 11, 24, 24);
            zzamtVar.zzc = zzc2;
            return zzc2 != -1;
        }
        zze = -1;
        zzamtVar.zzb = zze;
        if (zze != -1) {
        }
    }

    private static int zzc(zzej zzejVar, int i, int i2, int i3) {
        zzdi.zzd(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        zzgah.zza(zzgah.zza(i4, i5), 1 << i3);
        if (zzejVar.zza() < i) {
            return -1;
        }
        int zzd = zzejVar.zzd(i);
        if (zzd != i4) {
            return zzd;
        }
        if (zzejVar.zza() < i2) {
            return -1;
        }
        int zzd2 = zzejVar.zzd(i2);
        int i6 = zzd + zzd2;
        if (zzd2 != i5) {
            return i6;
        }
        if (zzejVar.zza() < i3) {
            return -1;
        }
        return i6 + zzejVar.zzd(i3);
    }

    private static void zzd(zzej zzejVar) {
        zzejVar.zzn(3);
        zzejVar.zzn(8);
        boolean zzp = zzejVar.zzp();
        boolean zzp2 = zzejVar.zzp();
        if (zzp) {
            zzejVar.zzn(5);
        }
        if (zzp2) {
            zzejVar.zzn(6);
        }
    }

    private static void zze(zzej zzejVar) {
        int zzd;
        int zzd2 = zzejVar.zzd(2);
        if (zzd2 == 0) {
            zzejVar.zzn(6);
            return;
        }
        int zzc = zzc(zzejVar, 5, 8, 16) + 1;
        if (zzd2 == 1) {
            zzejVar.zzn(zzc * 7);
            return;
        }
        if (zzd2 == 2) {
            boolean zzp = zzejVar.zzp();
            int i = true != zzp ? 5 : 1;
            int i2 = true == zzp ? 7 : 5;
            int i3 = true == zzp ? 8 : 6;
            int i4 = 0;
            while (i4 < zzc) {
                if (zzejVar.zzp()) {
                    zzejVar.zzn(7);
                    zzd = 0;
                } else {
                    if (zzejVar.zzd(2) == 3 && zzejVar.zzd(i2) * i != 0) {
                        zzejVar.zzm();
                    }
                    zzd = zzejVar.zzd(i3) * i;
                    if (zzd != 0 && zzd != 180) {
                        zzejVar.zzm();
                    }
                    zzejVar.zzm();
                }
                if (zzd != 0 && zzd != 180 && zzejVar.zzp()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    private static boolean zzf(zzej zzejVar) {
        zzejVar.zzn(3);
        boolean zzp = zzejVar.zzp();
        if (zzp) {
            zzejVar.zzn(13);
        }
        return zzp;
    }
}

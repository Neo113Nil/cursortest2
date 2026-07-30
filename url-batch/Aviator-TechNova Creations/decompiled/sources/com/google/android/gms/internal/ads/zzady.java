package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzady {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {AdError.CACHE_ERROR_CODE, AdError.SERVER_ERROR_CODE, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Removed duplicated region for block: B:100:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0338  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzv zza(zzer zzerVar, String str, String str2, zzq zzqVar) throws zzat {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean zzi;
        int i7;
        int zzj;
        int zzj2;
        int i8;
        int i9;
        boolean z;
        int i10;
        int i11;
        int i12;
        int i13;
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzerVar);
        int zzc = zzeqVar.zzc();
        int zzj3 = zzeqVar.zzj(3);
        if (zzj3 > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(zzj3).length() + 30);
            sb.append("Unsupported AC-4 DSI version: ");
            sb.append(zzj3);
            throw zzat.zzc(sb.toString());
        }
        int zzj4 = zzeqVar.zzj(7);
        int i14 = true != zzeqVar.zzi() ? 44100 : 48000;
        zzeqVar.zzh(4);
        int zzj5 = zzeqVar.zzj(9);
        if (zzj4 > 1) {
            if (zzj3 == 0) {
                throw zzat.zzc("Invalid AC-4 DSI version: 0");
            }
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(16);
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(128);
                }
            }
        }
        if (zzj3 == 1) {
            if (!zzg(zzeqVar)) {
                throw zzat.zzc("Invalid AC-4 DSI bitrate.");
            }
            zzeqVar.zzm();
        }
        zzadw zzadwVar = new zzadw(null);
        for (int i15 = 0; i15 < zzj5; i15++) {
            if (zzj3 == 0) {
                zzi = zzeqVar.zzi();
                i7 = 8;
                zzj = zzeqVar.zzj(5);
                zzj2 = zzeqVar.zzj(5);
                i8 = 0;
                i9 = 0;
                z = false;
            } else {
                int zzj6 = zzeqVar.zzj(8);
                i8 = zzeqVar.zzj(8);
                i7 = 8;
                if (i8 == 255) {
                    i8 = zzeqVar.zzj(16) + 255;
                }
                if (zzj6 > 2) {
                    zzeqVar.zzh(i8 * 8);
                } else {
                    int zzc2 = (zzc - zzeqVar.zzc()) / 8;
                    zzj = zzeqVar.zzj(5);
                    zzj2 = zzj6;
                    z = zzj == 31;
                    i9 = zzc2;
                    zzi = false;
                }
            }
            zzadwVar.zzf = zzj2;
            if (zzi || z || zzj != 6) {
                zzadwVar.zzg = zzeqVar.zzj(3);
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(5);
                }
                zzeqVar.zzh(2);
                if (zzj3 == 1) {
                    if (zzj2 != 1) {
                        if (zzj2 == 2) {
                            zzj2 = 2;
                        }
                    }
                    zzeqVar.zzh(2);
                }
                zzeqVar.zzh(5);
                zzeqVar.zzh(10);
                if (zzj3 == 1) {
                    if (zzj2 > 0) {
                        zzadwVar.zza = zzeqVar.zzi();
                    }
                    if (zzadwVar.zza) {
                        if (zzj2 != 1) {
                            i11 = 2;
                            if (zzj2 == 2) {
                                i13 = 2;
                            } else {
                                i10 = zzc;
                                i13 = zzj2;
                                zzeqVar.zzh(24);
                                i12 = 1;
                            }
                        } else {
                            i13 = 1;
                        }
                        i10 = zzc;
                        int zzj7 = zzeqVar.zzj(5);
                        if (zzj7 >= 0 && zzj7 <= 15) {
                            zzadwVar.zzb = zzj7;
                        }
                        if (zzj7 < 11 || zzj7 > 14) {
                            i11 = 2;
                        } else {
                            zzadwVar.zzd = zzeqVar.zzi();
                            i11 = 2;
                            zzadwVar.zze = zzeqVar.zzj(2);
                        }
                        zzeqVar.zzh(24);
                        i12 = 1;
                    } else {
                        i10 = zzc;
                        i11 = 2;
                        i12 = 1;
                        i13 = zzj2;
                    }
                    if (zzj2 == i12 || zzj2 == i11) {
                        if (zzeqVar.zzi() && zzeqVar.zzi()) {
                            zzeqVar.zzh(i11);
                        }
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzg();
                            int i16 = i7;
                            int zzj8 = zzeqVar.zzj(i16);
                            int i17 = 0;
                            while (i17 < zzj8) {
                                zzeqVar.zzh(i16);
                                i17++;
                                i16 = 8;
                            }
                        }
                    }
                    zzj2 = i13;
                } else {
                    i10 = zzc;
                }
                if (!zzi && !z) {
                    zzeqVar.zzg();
                    if (zzj == 0 || zzj == 1 || zzj == 2) {
                        if (zzj2 == 0) {
                            for (int i18 = 0; i18 < 2; i18++) {
                                zzd(zzeqVar, zzadwVar);
                            }
                            zzj2 = 0;
                            zzeqVar.zzg();
                            if (!zzeqVar.zzi()) {
                            }
                        } else {
                            for (int i19 = 0; i19 < 2; i19++) {
                                zze(zzeqVar, zzadwVar);
                            }
                            zzeqVar.zzg();
                            if (!zzeqVar.zzi()) {
                            }
                        }
                    } else if (zzj != 3 && zzj != 4) {
                        if (zzj != 5) {
                            int zzj9 = zzeqVar.zzj(7);
                            for (int i20 = 0; i20 < zzj9; i20++) {
                                zzeqVar.zzh(8);
                            }
                        } else if (zzj2 == 0) {
                            zzd(zzeqVar, zzadwVar);
                            zzj2 = 0;
                        } else {
                            int zzj10 = zzeqVar.zzj(3);
                            for (int i21 = 0; i21 < zzj10 + 2; i21++) {
                                zze(zzeqVar, zzadwVar);
                            }
                        }
                        zzeqVar.zzg();
                        if (!zzeqVar.zzi()) {
                        }
                    } else if (zzj2 == 0) {
                        for (int i22 = 0; i22 < 3; i22++) {
                            zzd(zzeqVar, zzadwVar);
                        }
                        zzj2 = 0;
                        zzeqVar.zzg();
                        if (!zzeqVar.zzi()) {
                        }
                    } else {
                        for (int i23 = 0; i23 < 3; i23++) {
                            zze(zzeqVar, zzadwVar);
                        }
                        zzeqVar.zzg();
                        if (!zzeqVar.zzi()) {
                        }
                    }
                } else if (zzj2 == 0) {
                    zzd(zzeqVar, zzadwVar);
                    zzj2 = 0;
                    zzeqVar.zzg();
                    if (!zzeqVar.zzi()) {
                        i3 = 7;
                        if (zzj2 > 0) {
                            if (zzeqVar.zzi() && !zzg(zzeqVar)) {
                                throw zzat.zzc("Can't parse bitrate DSI.");
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzm();
                                zzeqVar.zzo(zzeqVar.zzj(16));
                                i = 5;
                                int zzj11 = zzeqVar.zzj(5);
                                for (int i24 = 0; i24 < zzj11; i24++) {
                                    zzeqVar.zzh(3);
                                    zzeqVar.zzh(8);
                                }
                                i2 = 8;
                                zzeqVar.zzm();
                                if (zzj3 == 1) {
                                    int zzc3 = ((i10 - zzeqVar.zzc()) / i2) - i9;
                                    if (i8 < zzc3) {
                                        throw zzat.zzc("pres_bytes is smaller than presentation bytes read.");
                                    }
                                    zzeqVar.zzo(i8 - zzc3);
                                }
                                if (zzadwVar.zza) {
                                    i4 = -1;
                                    if (zzadwVar.zzb == -1) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(i15).length() + 45);
                                        sb2.append("Can't determine channel mode of presentation ");
                                        sb2.append(i15);
                                        throw zzat.zzc(sb2.toString());
                                    }
                                }
                                i4 = -1;
                            }
                        }
                        i2 = 8;
                        i = 5;
                        zzeqVar.zzm();
                        if (zzj3 == 1) {
                        }
                        if (zzadwVar.zza) {
                        }
                        i4 = -1;
                    }
                } else {
                    zze(zzeqVar, zzadwVar);
                    zzeqVar.zzg();
                    if (!zzeqVar.zzi()) {
                    }
                }
                if (zzadwVar.zza) {
                    int i25 = zzadwVar.zzb;
                    boolean z2 = zzadwVar.zzd;
                    int i26 = zzadwVar.zze;
                    switch (i25) {
                        case 0:
                            i4 = 1;
                            break;
                        case 1:
                            i4 = 2;
                            break;
                        case 2:
                            i4 = 3;
                            break;
                        case 3:
                            i4 = i;
                            break;
                        case 4:
                            i4 = 6;
                            break;
                        case 5:
                        case 7:
                        case 9:
                            i4 = i3;
                            break;
                        case 6:
                        case 8:
                        case 10:
                            i4 = i2;
                            break;
                        case 11:
                            i4 = 11;
                            break;
                        case 12:
                            i4 = 12;
                            break;
                        case 13:
                            i4 = 13;
                            break;
                        case 14:
                            i4 = 14;
                            break;
                        case 15:
                            i4 = 24;
                            break;
                    }
                    if (i25 == 11 || i25 == 12 || i25 == 13 || i25 == 14) {
                        if (!z2) {
                            i4 -= 2;
                        }
                        i6 = i4;
                        if (i26 == 0) {
                            i6 -= 4;
                        } else if (i26 == 1) {
                            i6 -= 2;
                        }
                    } else {
                        i6 = i4;
                    }
                } else {
                    int i27 = zzadwVar.zzc;
                    if (i27 > 0) {
                        i6 = i27 + 1;
                        if (zzadwVar.zzg == 4 && i6 == 17) {
                            i6 = 21;
                        }
                    } else {
                        int i28 = zzadwVar.zzg;
                        if (i28 == 0) {
                            i5 = 2;
                        } else if (i28 != 1) {
                            i5 = 2;
                            if (i28 == 2) {
                                i6 = i2;
                            } else if (i28 == 3) {
                                i6 = 10;
                            } else if (i28 != 4) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(i28).length() + 33);
                                sb3.append("AC-4 level ");
                                sb3.append(i28);
                                sb3.append(" has not been defined.");
                                zzee.zzc("Ac4Util", sb3.toString());
                            } else {
                                i6 = 12;
                            }
                        } else {
                            i6 = 6;
                        }
                        i6 = i5;
                    }
                }
                if (i6 <= 0) {
                    throw zzat.zzc("Cannot determine channel count of presentation.");
                }
                Object[] objArr = {Integer.valueOf(zzj4), Integer.valueOf(zzadwVar.zzf), Integer.valueOf(zzadwVar.zzg)};
                String str3 = zzfj.zza;
                String format = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                zzt zztVar = new zzt();
                zztVar.zza(str);
                zztVar.zzm("audio/ac4");
                zztVar.zzE(i6);
                zztVar.zzF(i14);
                zztVar.zzq(zzqVar);
                zztVar.zze(str2);
                zztVar.zzj(format);
                return zztVar.zzM();
            }
            i10 = zzc;
            i3 = 7;
            int zzj12 = zzeqVar.zzj(7);
            for (int i29 = 0; i29 < zzj12; i29++) {
                zzeqVar.zzh(15);
            }
            if (zzj2 > 0) {
            }
            i2 = 8;
            i = 5;
            zzeqVar.zzm();
            if (zzj3 == 1) {
            }
            if (zzadwVar.zza) {
            }
            i4 = -1;
            if (zzadwVar.zza) {
            }
            if (i6 <= 0) {
            }
        }
        i = 5;
        i2 = 8;
        i3 = 7;
        i4 = -1;
        if (zzadwVar.zza) {
        }
        if (i6 <= 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (r11 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0095, code lost:
    
        if (r11 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009a, code lost:
    
        if (r11 != 8) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzadx zzb(zzeq zzeqVar) {
        int i;
        int i2;
        int zzj;
        int zzj2 = zzeqVar.zzj(16);
        int zzj3 = zzeqVar.zzj(16);
        if (zzj3 == 65535) {
            zzj3 = zzeqVar.zzj(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = zzj3 + i;
        if (zzj2 == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int zzj4 = zzeqVar.zzj(2);
        int i5 = 0;
        if (zzj4 == 3) {
            int i6 = 0;
            while (true) {
                zzj = i6 + zzeqVar.zzj(2);
                if (!zzeqVar.zzi()) {
                    break;
                }
                i6 = (zzj + 1) << 2;
            }
            zzj4 = zzj + 3;
        }
        int i7 = zzj4;
        int zzj5 = zzeqVar.zzj(10);
        if (zzeqVar.zzi() && zzeqVar.zzj(3) > 0) {
            zzeqVar.zzh(2);
        }
        int i8 = 44100;
        if (true != zzeqVar.zzi()) {
            i2 = 44100;
        } else {
            i2 = 44100;
            i8 = 48000;
        }
        int zzj6 = zzeqVar.zzj(4);
        if (i8 == i2 && zzj6 == 13) {
            i5 = zzb[13];
        } else if (i8 == 48000 && zzj6 < 14) {
            i5 = zzb[zzj6];
            int i9 = zzj5 % 5;
            if (i9 != 1) {
                if (i9 == 2) {
                    if (zzj6 != 8) {
                    }
                    i5++;
                } else if (i9 != 3) {
                    if (i9 == 4) {
                        if (zzj6 != 3) {
                            if (zzj6 != 8) {
                            }
                        }
                        i5++;
                    }
                }
            }
            if (zzj6 != 3) {
            }
            i5++;
        }
        return new zzadx(i7, 2, i8, i4, i5, null);
    }

    public static void zzc(int i, zzer zzerVar) {
        zzerVar.zza(7);
        byte[] zzi = zzerVar.zzi();
        zzi[0] = -84;
        zzi[1] = 64;
        zzi[2] = -1;
        zzi[3] = -1;
        zzi[4] = (byte) ((i >> 16) & 255);
        zzi[5] = (byte) ((i >> 8) & 255);
        zzi[6] = (byte) (i & 255);
    }

    private static void zzd(zzeq zzeqVar, zzadw zzadwVar) throws zzat {
        int zzj = zzeqVar.zzj(5);
        zzeqVar.zzh(2);
        if (zzeqVar.zzi()) {
            zzeqVar.zzh(5);
        }
        if (zzj >= 7 && zzj <= 10) {
            zzeqVar.zzg();
        }
        if (zzeqVar.zzi()) {
            int zzj2 = zzeqVar.zzj(3);
            if (zzadwVar.zzb == -1 && zzj >= 0 && zzj <= 15 && (zzj2 == 0 || zzj2 == 1)) {
                zzadwVar.zzb = zzj;
            }
            if (zzeqVar.zzi()) {
                zzf(zzeqVar);
            }
        }
    }

    private static void zze(zzeq zzeqVar, zzadw zzadwVar) throws zzat {
        zzeqVar.zzh(2);
        boolean zzi = zzeqVar.zzi();
        int zzj = zzeqVar.zzj(8);
        for (int i = 0; i < zzj; i++) {
            zzeqVar.zzh(2);
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(5);
            }
            if (zzi) {
                zzeqVar.zzh(24);
            } else {
                if (zzeqVar.zzi()) {
                    if (!zzeqVar.zzi()) {
                        zzeqVar.zzh(4);
                    }
                    zzadwVar.zzc = zzeqVar.zzj(6) + 1;
                }
                zzeqVar.zzh(4);
            }
        }
        if (zzeqVar.zzi()) {
            zzeqVar.zzh(3);
            if (zzeqVar.zzi()) {
                zzf(zzeqVar);
            }
        }
    }

    private static void zzf(zzeq zzeqVar) throws zzat {
        int zzj = zzeqVar.zzj(6);
        if (zzj < 2 || zzj > 42) {
            throw zzat.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(zzj)));
        }
        zzeqVar.zzh(zzj * 8);
    }

    private static boolean zzg(zzeq zzeqVar) {
        if (zzeqVar.zzc() < 66) {
            return false;
        }
        zzeqVar.zzh(66);
        return true;
    }
}

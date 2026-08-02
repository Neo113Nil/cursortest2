package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzfh {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        zzdi.zzf(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            zzf(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            zzf(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            zzf(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    zzf(zArr);
                    return i6;
                }
                i5 = i6;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzfe zzc(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        zzfi zzfiVar = new zzfi(bArr, i, i2);
        int i12 = 4;
        zzfiVar.zze(4);
        int zza2 = zzfiVar.zza(3);
        zzfiVar.zzd();
        int zza3 = zzfiVar.zza(2);
        boolean zzf = zzfiVar.zzf();
        int zza4 = zzfiVar.zza(5);
        int i13 = 0;
        for (int i14 = 0; i14 < 32; i14++) {
            if (zzfiVar.zzf()) {
                i13 |= 1 << i14;
            }
        }
        int i15 = 6;
        int[] iArr2 = new int[6];
        for (int i16 = 0; i16 < 6; i16++) {
            iArr2[i16] = zzfiVar.zza(8);
        }
        int zza5 = zzfiVar.zza(8);
        int i17 = 0;
        for (int i18 = 0; i18 < zza2; i18++) {
            if (zzfiVar.zzf()) {
                i17 += 89;
            }
            if (zzfiVar.zzf()) {
                i17 += 8;
            }
        }
        zzfiVar.zze(i17);
        if (zza2 > 0) {
            int i19 = 8 - zza2;
            zzfiVar.zze(i19 + i19);
        }
        int zzc2 = zzfiVar.zzc();
        int zzc3 = zzfiVar.zzc();
        if (zzc3 == 3) {
            zzfiVar.zzd();
            zzc3 = 3;
        }
        int zzc4 = zzfiVar.zzc();
        int zzc5 = zzfiVar.zzc();
        if (zzfiVar.zzf()) {
            int zzc6 = zzfiVar.zzc();
            int zzc7 = zzfiVar.zzc();
            int zzc8 = zzfiVar.zzc();
            int zzc9 = zzfiVar.zzc();
            if (zzc3 != 1) {
                if (zzc3 == 2) {
                    zzc3 = 2;
                } else {
                    i11 = 1;
                    zzc4 -= i11 * (zzc6 + zzc7);
                    zzc5 -= (zzc3 != 1 ? 2 : 1) * (zzc8 + zzc9);
                }
            }
            i11 = 2;
            zzc4 -= i11 * (zzc6 + zzc7);
            zzc5 -= (zzc3 != 1 ? 2 : 1) * (zzc8 + zzc9);
        }
        int i20 = zzc4;
        int i21 = zzc3;
        int i22 = zzc5;
        int zzc10 = zzfiVar.zzc();
        int zzc11 = zzfiVar.zzc();
        int zzc12 = zzfiVar.zzc();
        for (int i23 = true != zzfiVar.zzf() ? zza2 : 0; i23 <= zza2; i23++) {
            zzfiVar.zzc();
            zzfiVar.zzc();
            zzfiVar.zzc();
        }
        zzfiVar.zzc();
        zzfiVar.zzc();
        zzfiVar.zzc();
        zzfiVar.zzc();
        zzfiVar.zzc();
        zzfiVar.zzc();
        if (zzfiVar.zzf() && zzfiVar.zzf()) {
            int i24 = 0;
            while (i24 < i12) {
                int i25 = 0;
                while (i25 < i15) {
                    if (zzfiVar.zzf()) {
                        int min = Math.min(64, 1 << ((i24 + i24) + 4));
                        if (i24 > 1) {
                            zzfiVar.zzb();
                        }
                        for (int i26 = 0; i26 < min; i26++) {
                            zzfiVar.zzb();
                        }
                    } else {
                        zzfiVar.zzc();
                    }
                    i25 += i24 == 3 ? 3 : 1;
                    i15 = 6;
                }
                i24++;
                i12 = 4;
                i15 = 6;
            }
        }
        zzfiVar.zze(2);
        if (zzfiVar.zzf()) {
            zzfiVar.zze(8);
            zzfiVar.zzc();
            zzfiVar.zzc();
            zzfiVar.zzd();
        }
        int zzc13 = zzfiVar.zzc();
        int i27 = 0;
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i28 = -1;
        int i29 = -1;
        int i30 = -1;
        while (i27 < zzc13) {
            if (i27 == 0 || !zzfiVar.zzf()) {
                i7 = zzc13;
                i8 = i13;
                i9 = i21;
                iArr = iArr2;
                int zzc14 = zzfiVar.zzc();
                int zzc15 = zzfiVar.zzc();
                int[] iArr5 = new int[zzc14];
                int i31 = 0;
                while (i31 < zzc14) {
                    iArr5[i31] = (i31 > 0 ? iArr5[i31 - 1] : 0) - (zzfiVar.zzc() + 1);
                    zzfiVar.zzd();
                    i31++;
                }
                int[] iArr6 = new int[zzc15];
                int i32 = 0;
                while (i32 < zzc15) {
                    iArr6[i32] = (i32 > 0 ? iArr6[i32 - 1] : 0) + zzfiVar.zzc() + 1;
                    zzfiVar.zzd();
                    i32++;
                }
                i30 = zzc15;
                iArr4 = iArr6;
                i29 = zzc14;
                iArr3 = iArr5;
            } else {
                int i33 = i29 + i30;
                boolean zzf2 = zzfiVar.zzf();
                int zzc16 = zzfiVar.zzc() + 1;
                int i34 = 1 - ((zzf2 ? 1 : 0) + (zzf2 ? 1 : 0));
                int i35 = i33 + 1;
                i7 = zzc13;
                boolean[] zArr = new boolean[i35];
                iArr = iArr2;
                for (int i36 = 0; i36 <= i33; i36++) {
                    if (zzfiVar.zzf()) {
                        zArr[i36] = true;
                    } else {
                        zArr[i36] = zzfiVar.zzf();
                    }
                }
                int i37 = i30 - 1;
                int[] iArr7 = new int[i35];
                int[] iArr8 = new int[i35];
                int i38 = 0;
                while (true) {
                    i10 = i34 * zzc16;
                    if (i37 < 0) {
                        break;
                    }
                    int i39 = iArr4[i37] + i10;
                    if (i39 < 0 && zArr[i29 + i37]) {
                        iArr7[i38] = i39;
                        i38++;
                    }
                    i37--;
                }
                if (i10 < 0 && zArr[i33]) {
                    iArr7[i38] = i10;
                    i38++;
                }
                i8 = i13;
                i9 = i21;
                int i40 = i38;
                for (int i41 = 0; i41 < i29; i41++) {
                    int i42 = iArr3[i41] + i10;
                    if (i42 < 0 && zArr[i41]) {
                        iArr7[i40] = i42;
                        i40++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr7, i40);
                int i43 = 0;
                for (int i44 = i29 - 1; i44 >= 0; i44--) {
                    int i45 = iArr3[i44] + i10;
                    if (i45 > 0 && zArr[i44]) {
                        iArr8[i43] = i45;
                        i43++;
                    }
                }
                if (i10 > 0 && zArr[i33]) {
                    iArr8[i43] = i10;
                    i43++;
                }
                int i46 = i43;
                for (int i47 = 0; i47 < i30; i47++) {
                    int i48 = iArr4[i47] + i10;
                    if (i48 > 0 && zArr[i29 + i47]) {
                        iArr8[i46] = i48;
                        i46++;
                    }
                }
                iArr4 = Arrays.copyOf(iArr8, i46);
                i30 = i46;
                iArr3 = copyOf;
                i29 = i40;
            }
            i27++;
            i21 = i9;
            i13 = i8;
            zzc13 = i7;
            iArr2 = iArr;
        }
        int i49 = i13;
        int i50 = i21;
        int[] iArr9 = iArr2;
        if (zzfiVar.zzf()) {
            int zzc17 = zzfiVar.zzc();
            for (int i51 = 0; i51 < zzc17; i51++) {
                zzfiVar.zze(zzc12 + 5);
            }
        }
        zzfiVar.zze(2);
        float f = 1.0f;
        if (zzfiVar.zzf()) {
            if (zzfiVar.zzf()) {
                int zza6 = zzfiVar.zza(8);
                if (zza6 == 255) {
                    int zza7 = zzfiVar.zza(16);
                    int zza8 = zzfiVar.zza(16);
                    if (zza7 != 0 && zza8 != 0) {
                        f = zza7 / zza8;
                    }
                } else if (zza6 < 17) {
                    f = zzb[zza6];
                } else {
                    zzea.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + zza6);
                }
            }
            if (zzfiVar.zzf()) {
                zzfiVar.zzd();
            }
            if (zzfiVar.zzf()) {
                zzfiVar.zze(3);
                int i52 = true != zzfiVar.zzf() ? 2 : 1;
                if (zzfiVar.zzf()) {
                    int zza9 = zzfiVar.zza(8);
                    int zza10 = zzfiVar.zza(8);
                    zzfiVar.zze(8);
                    int zza11 = zzo.zza(zza9);
                    i6 = zzo.zzb(zza10);
                    i4 = zza11;
                    i28 = i52;
                    if (zzfiVar.zzf()) {
                        zzfiVar.zzc();
                        zzfiVar.zzc();
                    }
                    zzfiVar.zzd();
                    if (zzfiVar.zzf()) {
                        i22 += i22;
                    }
                    i5 = i6;
                    i3 = i22;
                } else {
                    i28 = i52;
                }
            }
            i4 = -1;
            i6 = -1;
            if (zzfiVar.zzf()) {
            }
            zzfiVar.zzd();
            if (zzfiVar.zzf()) {
            }
            i5 = i6;
            i3 = i22;
        } else {
            i3 = i22;
            i4 = -1;
            i5 = -1;
        }
        return new zzfe(zza3, zzf, zza4, i49, i50, zzc10, zzc11, iArr9, zza5, zzc2, i20, i3, f, i4, i28, i5);
    }

    public static zzff zzd(byte[] bArr, int i, int i2) {
        zzfi zzfiVar = new zzfi(bArr, 4, i2);
        int zzc2 = zzfiVar.zzc();
        int zzc3 = zzfiVar.zzc();
        zzfiVar.zzd();
        return new zzff(zzc2, zzc3, zzfiVar.zzf());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzfg zze(byte[] bArr, int i, int i2) {
        int zzc2;
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int zzc3;
        int i6;
        int i7;
        boolean z3;
        boolean zzf;
        int i8;
        float f;
        int i9;
        int i10;
        float f2;
        int i11;
        int i12;
        zzfi zzfiVar = new zzfi(bArr, i, i2);
        int zza2 = zzfiVar.zza(8);
        int zza3 = zzfiVar.zza(8);
        int zza4 = zzfiVar.zza(8);
        int zzc4 = zzfiVar.zzc();
        int i13 = 1;
        if (zza2 != 100 && zza2 != 110 && zza2 != 122 && zza2 != 244 && zza2 != 44 && zza2 != 83 && zza2 != 86 && zza2 != 118 && zza2 != 128) {
            if (zza2 != 138) {
                zzc2 = 1;
                i4 = 0;
                i5 = 0;
                z2 = false;
                int zzc5 = zzfiVar.zzc() + 4;
                zzc3 = zzfiVar.zzc();
                if (zzc3 != 0) {
                    i6 = zza3;
                    i7 = zzfiVar.zzc() + 4;
                } else {
                    if (zzc3 == 1) {
                        boolean zzf2 = zzfiVar.zzf();
                        zzfiVar.zzb();
                        zzfiVar.zzb();
                        long zzc6 = zzfiVar.zzc();
                        i6 = zza3;
                        for (int i14 = 0; i14 < zzc6; i14++) {
                            zzfiVar.zzc();
                        }
                        z3 = zzf2;
                        zzc3 = 1;
                        i7 = 0;
                        int zzc7 = zzfiVar.zzc();
                        zzfiVar.zzd();
                        int zzc8 = zzfiVar.zzc() + 1;
                        int zzc9 = zzfiVar.zzc() + 1;
                        zzf = zzfiVar.zzf();
                        int i15 = 2 - (zzf ? 1 : 0);
                        if (!zzf) {
                            zzfiVar.zzd();
                        }
                        zzfiVar.zzd();
                        int i16 = zzc8 * 16;
                        int i17 = zzc9 * i15 * 16;
                        if (zzfiVar.zzf()) {
                            int zzc10 = zzfiVar.zzc();
                            int zzc11 = zzfiVar.zzc();
                            int zzc12 = zzfiVar.zzc();
                            int zzc13 = zzfiVar.zzc();
                            if (zzc2 != 0) {
                                if (zzc2 == 3) {
                                    i11 = 1;
                                    i12 = 1;
                                } else {
                                    i11 = 1;
                                    i12 = 2;
                                }
                                i15 *= zzc2 == i11 ? 2 : 1;
                                i13 = i12;
                            }
                            i16 -= (zzc10 + zzc11) * i13;
                            i17 -= (zzc12 + zzc13) * i15;
                        }
                        int i18 = i16;
                        int i19 = i17;
                        if (zzfiVar.zzf()) {
                            if (zzfiVar.zzf()) {
                                int zza5 = zzfiVar.zza(8);
                                if (zza5 == 255) {
                                    int zza6 = zzfiVar.zza(16);
                                    int zza7 = zzfiVar.zza(16);
                                    if (zza6 != 0 && zza7 != 0) {
                                        f2 = zza6 / zza7;
                                        if (zzfiVar.zzf()) {
                                            zzfiVar.zzd();
                                        }
                                        if (zzfiVar.zzf()) {
                                            zzfiVar.zze(3);
                                            i9 = true == zzfiVar.zzf() ? 1 : 2;
                                            if (zzfiVar.zzf()) {
                                                int zza8 = zzfiVar.zza(8);
                                                int zza9 = zzfiVar.zza(8);
                                                zzfiVar.zze(8);
                                                i8 = zzo.zza(zza8);
                                                i10 = zzo.zzb(zza9);
                                                f = f2;
                                            } else {
                                                f = f2;
                                                i8 = -1;
                                                i10 = -1;
                                            }
                                        } else {
                                            f = f2;
                                            i8 = -1;
                                        }
                                    }
                                } else if (zza5 < 17) {
                                    f2 = zzb[zza5];
                                    if (zzfiVar.zzf()) {
                                    }
                                    if (zzfiVar.zzf()) {
                                    }
                                } else {
                                    zzea.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + zza5);
                                }
                                return new zzfg(zza2, i6, zza4, zzc4, zzc7, i18, i19, f, i4, i5, z2, zzf, zzc5, zzc3, i7, z3, i8, i9, i10);
                            }
                            f2 = 1.0f;
                            if (zzfiVar.zzf()) {
                            }
                            if (zzfiVar.zzf()) {
                            }
                        } else {
                            i8 = -1;
                            f = 1.0f;
                        }
                        i9 = -1;
                        i10 = -1;
                        return new zzfg(zza2, i6, zza4, zzc4, zzc7, i18, i19, f, i4, i5, z2, zzf, zzc5, zzc3, i7, z3, i8, i9, i10);
                    }
                    i6 = zza3;
                    i7 = 0;
                }
                z3 = false;
                int zzc72 = zzfiVar.zzc();
                zzfiVar.zzd();
                int zzc82 = zzfiVar.zzc() + 1;
                int zzc92 = zzfiVar.zzc() + 1;
                zzf = zzfiVar.zzf();
                int i152 = 2 - (zzf ? 1 : 0);
                if (!zzf) {
                }
                zzfiVar.zzd();
                int i162 = zzc82 * 16;
                int i172 = zzc92 * i152 * 16;
                if (zzfiVar.zzf()) {
                }
                int i182 = i162;
                int i192 = i172;
                if (zzfiVar.zzf()) {
                }
                i9 = -1;
                i10 = -1;
                return new zzfg(zza2, i6, zza4, zzc4, zzc72, i182, i192, f, i4, i5, z2, zzf, zzc5, zzc3, i7, z3, i8, i9, i10);
            }
            zza2 = 138;
        }
        zzc2 = zzfiVar.zzc();
        if (zzc2 == 3) {
            z = zzfiVar.zzf();
            i3 = 3;
        } else {
            i3 = zzc2;
            z = false;
        }
        int zzc14 = zzfiVar.zzc();
        int zzc15 = zzfiVar.zzc();
        zzfiVar.zzd();
        if (zzfiVar.zzf()) {
            int i20 = i3 != 3 ? 8 : 12;
            int i21 = 0;
            while (i21 < i20) {
                if (zzfiVar.zzf()) {
                    int i22 = i21 < 6 ? 16 : 64;
                    int i23 = 8;
                    int i24 = 8;
                    for (int i25 = 0; i25 < i22; i25++) {
                        if (i23 != 0) {
                            i23 = ((i24 + zzfiVar.zzb()) + 256) % 256;
                        }
                        if (i23 != 0) {
                            i24 = i23;
                        }
                    }
                }
                i21++;
            }
        }
        i4 = zzc14;
        i5 = zzc15;
        z2 = z;
        int zzc52 = zzfiVar.zzc() + 4;
        zzc3 = zzfiVar.zzc();
        if (zzc3 != 0) {
        }
        z3 = false;
        int zzc722 = zzfiVar.zzc();
        zzfiVar.zzd();
        int zzc822 = zzfiVar.zzc() + 1;
        int zzc922 = zzfiVar.zzc() + 1;
        zzf = zzfiVar.zzf();
        int i1522 = 2 - (zzf ? 1 : 0);
        if (!zzf) {
        }
        zzfiVar.zzd();
        int i1622 = zzc822 * 16;
        int i1722 = zzc922 * i1522 * 16;
        if (zzfiVar.zzf()) {
        }
        int i1822 = i1622;
        int i1922 = i1722;
        if (zzfiVar.zzf()) {
        }
        i9 = -1;
        i10 = -1;
        return new zzfg(zza2, i6, zza4, zzc4, zzc722, i1822, i1922, f, i4, i5, z2, zzf, zzc52, zzc3, i7, z3, i8, i9, i10);
    }

    public static void zzf(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int zzb(byte[] bArr, int i) {
        int i2;
        synchronized (zzc) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    try {
                        if (i3 >= i - 2) {
                            i3 = i;
                            break;
                        }
                        int i5 = i3 + 1;
                        if (bArr[i3] == 0 && bArr[i5] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3 = i5;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i4) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = zzd[i8] - i6;
                System.arraycopy(bArr, i6, bArr, i7, i9);
                int i10 = i7 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i7 = i10 + 2;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }
}

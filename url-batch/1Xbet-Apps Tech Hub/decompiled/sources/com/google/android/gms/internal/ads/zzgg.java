package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgg {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        zzef.zzf(i3 >= 0);
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

    public static zzgd zzc(byte[] bArr, int i, int i2) {
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
        zzgh zzghVar = new zzgh(bArr, i, i2);
        int i12 = 4;
        zzghVar.zze(4);
        int zza2 = zzghVar.zza(3);
        zzghVar.zzd();
        int zza3 = zzghVar.zza(2);
        boolean zzf = zzghVar.zzf();
        int zza4 = zzghVar.zza(5);
        int i13 = 0;
        for (int i14 = 0; i14 < 32; i14++) {
            if (zzghVar.zzf()) {
                i13 |= 1 << i14;
            }
        }
        int i15 = 6;
        int[] iArr2 = new int[6];
        for (int i16 = 0; i16 < 6; i16++) {
            iArr2[i16] = zzghVar.zza(8);
        }
        int zza5 = zzghVar.zza(8);
        int i17 = 0;
        for (int i18 = 0; i18 < zza2; i18++) {
            if (zzghVar.zzf()) {
                i17 += 89;
            }
            if (zzghVar.zzf()) {
                i17 += 8;
            }
        }
        zzghVar.zze(i17);
        if (zza2 > 0) {
            int i19 = 8 - zza2;
            zzghVar.zze(i19 + i19);
        }
        int zzc2 = zzghVar.zzc();
        int zzc3 = zzghVar.zzc();
        if (zzc3 == 3) {
            zzghVar.zzd();
            zzc3 = 3;
        }
        int zzc4 = zzghVar.zzc();
        int zzc5 = zzghVar.zzc();
        if (zzghVar.zzf()) {
            int zzc6 = zzghVar.zzc();
            int zzc7 = zzghVar.zzc();
            int zzc8 = zzghVar.zzc();
            int zzc9 = zzghVar.zzc();
            if (zzc3 == 1) {
                i11 = 2;
            } else if (zzc3 == 2) {
                zzc3 = 2;
                i11 = 2;
            } else {
                i11 = 1;
            }
            zzc4 -= i11 * (zzc6 + zzc7);
            zzc5 -= (zzc3 == 1 ? 2 : 1) * (zzc8 + zzc9);
        }
        int i20 = zzc4;
        int i21 = zzc3;
        int i22 = zzc5;
        int zzc10 = zzghVar.zzc();
        int zzc11 = zzghVar.zzc();
        int zzc12 = zzghVar.zzc();
        for (int i23 = true != zzghVar.zzf() ? zza2 : 0; i23 <= zza2; i23++) {
            zzghVar.zzc();
            zzghVar.zzc();
            zzghVar.zzc();
        }
        zzghVar.zzc();
        zzghVar.zzc();
        zzghVar.zzc();
        zzghVar.zzc();
        zzghVar.zzc();
        zzghVar.zzc();
        if (zzghVar.zzf() && zzghVar.zzf()) {
            int i24 = 0;
            while (i24 < i12) {
                int i25 = 0;
                while (i25 < i15) {
                    if (zzghVar.zzf()) {
                        int min = Math.min(64, 1 << ((i24 + i24) + 4));
                        if (i24 > 1) {
                            zzghVar.zzb();
                        }
                        for (int i26 = 0; i26 < min; i26++) {
                            zzghVar.zzb();
                        }
                    } else {
                        zzghVar.zzc();
                    }
                    i25 += i24 == 3 ? 3 : 1;
                    i15 = 6;
                }
                i24++;
                i12 = 4;
                i15 = 6;
            }
        }
        zzghVar.zze(2);
        if (zzghVar.zzf()) {
            zzghVar.zze(8);
            zzghVar.zzc();
            zzghVar.zzc();
            zzghVar.zzd();
        }
        int zzc13 = zzghVar.zzc();
        int i27 = 0;
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i28 = -1;
        int i29 = -1;
        int i30 = -1;
        while (i27 < zzc13) {
            if (i27 == 0 || !zzghVar.zzf()) {
                i7 = zzc13;
                i8 = i13;
                i9 = i21;
                iArr = iArr2;
                int zzc14 = zzghVar.zzc();
                int zzc15 = zzghVar.zzc();
                int[] iArr5 = new int[zzc14];
                int i31 = 0;
                while (i31 < zzc14) {
                    iArr5[i31] = (i31 > 0 ? iArr5[i31 - 1] : 0) - (zzghVar.zzc() + 1);
                    zzghVar.zzd();
                    i31++;
                }
                int[] iArr6 = new int[zzc15];
                int i32 = 0;
                while (i32 < zzc15) {
                    iArr6[i32] = (i32 > 0 ? iArr6[i32 - 1] : 0) + zzghVar.zzc() + 1;
                    zzghVar.zzd();
                    i32++;
                }
                i30 = zzc15;
                iArr4 = iArr6;
                i29 = zzc14;
                iArr3 = iArr5;
            } else {
                int i33 = i29 + i30;
                boolean zzf2 = zzghVar.zzf();
                int zzc16 = zzghVar.zzc() + 1;
                int i34 = 1 - ((zzf2 ? 1 : 0) + (zzf2 ? 1 : 0));
                int i35 = i33 + 1;
                i7 = zzc13;
                boolean[] zArr = new boolean[i35];
                iArr = iArr2;
                for (int i36 = 0; i36 <= i33; i36++) {
                    if (zzghVar.zzf()) {
                        zArr[i36] = true;
                    } else {
                        zArr[i36] = zzghVar.zzf();
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
        if (zzghVar.zzf()) {
            int zzc17 = zzghVar.zzc();
            for (int i51 = 0; i51 < zzc17; i51++) {
                zzghVar.zze(zzc12 + 5);
            }
        }
        zzghVar.zze(2);
        float f = 1.0f;
        if (zzghVar.zzf()) {
            if (zzghVar.zzf()) {
                int zza6 = zzghVar.zza(8);
                if (zza6 == 255) {
                    int zza7 = zzghVar.zza(16);
                    int zza8 = zzghVar.zza(16);
                    if (zza7 != 0 && zza8 != 0) {
                        f = zza7 / zza8;
                    }
                } else if (zza6 < 17) {
                    f = zzb[zza6];
                } else {
                    zzez.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + zza6);
                }
            }
            if (zzghVar.zzf()) {
                zzghVar.zzd();
            }
            if (zzghVar.zzf()) {
                zzghVar.zze(3);
                int i52 = true != zzghVar.zzf() ? 2 : 1;
                if (zzghVar.zzf()) {
                    int zza9 = zzghVar.zza(8);
                    int zza10 = zzghVar.zza(8);
                    zzghVar.zze(8);
                    int zza11 = zzs.zza(zza9);
                    i6 = zzs.zzb(zza10);
                    i4 = zza11;
                } else {
                    i4 = -1;
                    i6 = -1;
                }
                i28 = i52;
            } else {
                i4 = -1;
                i6 = -1;
            }
            if (zzghVar.zzf()) {
                zzghVar.zzc();
                zzghVar.zzc();
            }
            zzghVar.zzd();
            if (zzghVar.zzf()) {
                i22 += i22;
            }
            i5 = i6;
            i3 = i22;
        } else {
            i3 = i22;
            i4 = -1;
            i5 = -1;
        }
        return new zzgd(zza3, zzf, zza4, i49, i50, zzc10, zzc11, iArr9, zza5, zzc2, i20, i3, f, i4, i28, i5);
    }

    public static zzge zzd(byte[] bArr, int i, int i2) {
        zzgh zzghVar = new zzgh(bArr, 4, i2);
        int zzc2 = zzghVar.zzc();
        int zzc3 = zzghVar.zzc();
        zzghVar.zzd();
        return new zzge(zzc2, zzc3, zzghVar.zzf());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgf zze(byte[] bArr, int i, int i2) {
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
        int i9;
        int i10;
        float f;
        float f2;
        int i11;
        int i12;
        zzgh zzghVar = new zzgh(bArr, i, i2);
        int i13 = 8;
        int zza2 = zzghVar.zza(8);
        int zza3 = zzghVar.zza(8);
        int zza4 = zzghVar.zza(8);
        int zzc4 = zzghVar.zzc();
        int i14 = 1;
        if (zza2 != 100 && zza2 != 110 && zza2 != 122 && zza2 != 244 && zza2 != 44 && zza2 != 83 && zza2 != 86 && zza2 != 118 && zza2 != 128) {
            if (zza2 != 138) {
                zzc2 = 1;
                i4 = 0;
                i5 = 0;
                z2 = false;
                int zzc5 = zzghVar.zzc() + 4;
                zzc3 = zzghVar.zzc();
                if (zzc3 != 0) {
                    i6 = zza3;
                    i7 = zzghVar.zzc() + 4;
                } else {
                    if (zzc3 == 1) {
                        boolean zzf2 = zzghVar.zzf();
                        zzghVar.zzb();
                        zzghVar.zzb();
                        long zzc6 = zzghVar.zzc();
                        i6 = zza3;
                        for (int i15 = 0; i15 < zzc6; i15++) {
                            zzghVar.zzc();
                        }
                        z3 = zzf2;
                        zzc3 = 1;
                        i7 = 0;
                        int zzc7 = zzghVar.zzc();
                        zzghVar.zzd();
                        int zzc8 = zzghVar.zzc() + 1;
                        int zzc9 = zzghVar.zzc() + 1;
                        zzf = zzghVar.zzf();
                        int i16 = 2 - (zzf ? 1 : 0);
                        if (!zzf) {
                            zzghVar.zzd();
                        }
                        zzghVar.zzd();
                        int i17 = zzc8 * 16;
                        int i18 = zzc9 * i16 * 16;
                        if (zzghVar.zzf()) {
                            int zzc10 = zzghVar.zzc();
                            int zzc11 = zzghVar.zzc();
                            int zzc12 = zzghVar.zzc();
                            int zzc13 = zzghVar.zzc();
                            if (zzc2 != 0) {
                                if (zzc2 == 3) {
                                    i12 = 1;
                                    i11 = 1;
                                } else {
                                    i11 = 2;
                                    i12 = 1;
                                }
                                i16 *= zzc2 == i12 ? 2 : 1;
                                i14 = i11;
                            }
                            i17 -= (zzc10 + zzc11) * i14;
                            i18 -= (zzc12 + zzc13) * i16;
                        }
                        int i19 = i17;
                        int i20 = i18;
                        if (zzghVar.zzf()) {
                            if (zzghVar.zzf()) {
                                int zza5 = zzghVar.zza(8);
                                if (zza5 == 255) {
                                    int zza6 = zzghVar.zza(16);
                                    int zza7 = zzghVar.zza(16);
                                    if (zza6 != 0 && zza7 != 0) {
                                        f2 = zza6 / zza7;
                                        if (zzghVar.zzf()) {
                                            zzghVar.zzd();
                                        }
                                        if (zzghVar.zzf()) {
                                            zzghVar.zze(3);
                                            i9 = true == zzghVar.zzf() ? 1 : 2;
                                            if (zzghVar.zzf()) {
                                                int zza8 = zzghVar.zza(8);
                                                int zza9 = zzghVar.zza(8);
                                                zzghVar.zze(8);
                                                i8 = zzs.zza(zza8);
                                                i10 = zzs.zzb(zza9);
                                                f = f2;
                                            } else {
                                                f = f2;
                                                i8 = -1;
                                                i10 = -1;
                                            }
                                        } else {
                                            f = f2;
                                            i8 = -1;
                                            i9 = -1;
                                            i10 = -1;
                                        }
                                    }
                                } else if (zza5 < 17) {
                                    f2 = zzb[zza5];
                                    if (zzghVar.zzf()) {
                                    }
                                    if (zzghVar.zzf()) {
                                    }
                                } else {
                                    zzez.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + zza5);
                                }
                            }
                            f2 = 1.0f;
                            if (zzghVar.zzf()) {
                            }
                            if (zzghVar.zzf()) {
                            }
                        } else {
                            i8 = -1;
                            i9 = -1;
                            i10 = -1;
                            f = 1.0f;
                        }
                        return new zzgf(zza2, i6, zza4, zzc4, zzc7, i19, i20, f, i4, i5, z2, zzf, zzc5, zzc3, i7, z3, i8, i9, i10);
                    }
                    i6 = zza3;
                    i7 = 0;
                }
                z3 = false;
                int zzc72 = zzghVar.zzc();
                zzghVar.zzd();
                int zzc82 = zzghVar.zzc() + 1;
                int zzc92 = zzghVar.zzc() + 1;
                zzf = zzghVar.zzf();
                int i162 = 2 - (zzf ? 1 : 0);
                if (!zzf) {
                }
                zzghVar.zzd();
                int i172 = zzc82 * 16;
                int i182 = zzc92 * i162 * 16;
                if (zzghVar.zzf()) {
                }
                int i192 = i172;
                int i202 = i182;
                if (zzghVar.zzf()) {
                }
                return new zzgf(zza2, i6, zza4, zzc4, zzc72, i192, i202, f, i4, i5, z2, zzf, zzc5, zzc3, i7, z3, i8, i9, i10);
            }
            zza2 = 138;
        }
        zzc2 = zzghVar.zzc();
        if (zzc2 == 3) {
            z = zzghVar.zzf();
            i3 = 3;
        } else {
            i3 = zzc2;
            z = false;
        }
        int zzc14 = zzghVar.zzc();
        int zzc15 = zzghVar.zzc();
        zzghVar.zzd();
        if (zzghVar.zzf()) {
            int i21 = i3 != 3 ? 8 : 12;
            int i22 = 0;
            while (i22 < i21) {
                if (zzghVar.zzf()) {
                    int i23 = i22 < 6 ? 16 : 64;
                    int i24 = i13;
                    int i25 = i24;
                    for (int i26 = 0; i26 < i23; i26++) {
                        if (i24 != 0) {
                            i24 = ((i25 + zzghVar.zzb()) + 256) % 256;
                        }
                        if (i24 != 0) {
                            i25 = i24;
                        }
                    }
                }
                i22++;
                i13 = 8;
            }
        }
        i4 = zzc14;
        i5 = zzc15;
        z2 = z;
        int zzc52 = zzghVar.zzc() + 4;
        zzc3 = zzghVar.zzc();
        if (zzc3 != 0) {
        }
        z3 = false;
        int zzc722 = zzghVar.zzc();
        zzghVar.zzd();
        int zzc822 = zzghVar.zzc() + 1;
        int zzc922 = zzghVar.zzc() + 1;
        zzf = zzghVar.zzf();
        int i1622 = 2 - (zzf ? 1 : 0);
        if (!zzf) {
        }
        zzghVar.zzd();
        int i1722 = zzc822 * 16;
        int i1822 = zzc922 * i1622 * 16;
        if (zzghVar.zzf()) {
        }
        int i1922 = i1722;
        int i2022 = i1822;
        if (zzghVar.zzf()) {
        }
        return new zzgf(zza2, i6, zza4, zzc4, zzc722, i1922, i2022, f, i4, i5, z2, zzf, zzc52, zzc3, i7, z3, i8, i9, i10);
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
                i7 = i11 + 1;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }
}

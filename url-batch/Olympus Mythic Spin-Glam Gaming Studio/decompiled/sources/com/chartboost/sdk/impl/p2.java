package com.chartboost.sdk.impl;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class p2 {
    public static final Bitmap a(Bitmap source, int i) {
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int width = source.getWidth();
            int height = source.getHeight();
            int max = Math.max(1, (int) (width * 0.25f));
            int max2 = Math.max(1, (int) (height * 0.25f));
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(source, max, max2, true);
            Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
            if (createScaledBitmap == source) {
                return null;
            }
            int min = Math.min(i, Math.min(max, max2) / 2);
            if (min >= 1) {
                b(createScaledBitmap, min);
            }
            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
            Intrinsics.checkNotNullExpressionValue(createScaledBitmap2, "createScaledBitmap(...)");
            if (createScaledBitmap != createScaledBitmap2) {
                createScaledBitmap.recycle();
            }
            if (createScaledBitmap2 == source) {
                return null;
            }
            return createScaledBitmap2;
        } catch (Exception e) {
            xb.e("blurBitmap failed: " + e.getMessage(), null, 2, null);
            return null;
        }
    }

    public static final void b(Bitmap bitmap, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i25 = width * height;
        int[] iArr2 = new int[i25];
        bitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i26 = (i24 * 2) + 1;
        int i27 = i24 + 1;
        int i28 = i27 * i27;
        int[] iArr3 = new int[i25];
        int[] iArr4 = new int[i25];
        int[] iArr5 = new int[i25];
        int[] iArr6 = new int[i26 * 3];
        int i29 = 0;
        int i30 = 0;
        while (i30 < height) {
            int i31 = i30 * width;
            int i32 = -i24;
            if (i32 <= i24) {
                i15 = i29;
                i16 = i15;
                i17 = i16;
                i18 = i17;
                i19 = i18;
                i20 = i19;
                i21 = i20;
                i22 = i21;
                i23 = i22;
                while (true) {
                    i13 = height;
                    i14 = i30;
                    int i33 = iArr2[Math.min(width - 1, Math.max(i32, i29)) + i31];
                    int i34 = (i32 + i24) * 3;
                    int i35 = (i33 >> 16) & 255;
                    iArr = iArr2;
                    int i36 = (i33 >> 8) & 255;
                    int i37 = i33 & 255;
                    iArr6[i34] = i35;
                    iArr6[i34 + 1] = i36;
                    iArr6[i34 + 2] = i37;
                    int abs = i27 - Math.abs(i32);
                    i17 += i35 * abs;
                    i16 += i36 * abs;
                    i15 += abs * i37;
                    if (i32 > 0) {
                        i23 += i35;
                        i22 += i36;
                        i21 += i37;
                    } else {
                        i20 += i35;
                        i19 += i36;
                        i18 += i37;
                    }
                    if (i32 == i24) {
                        break;
                    }
                    i32++;
                    height = i13;
                    i30 = i14;
                    iArr2 = iArr;
                    i29 = 0;
                }
            } else {
                i13 = height;
                i14 = i30;
                iArr = iArr2;
                i15 = 0;
                i16 = 0;
                i17 = 0;
                i18 = 0;
                i19 = 0;
                i20 = 0;
                i21 = 0;
                i22 = 0;
                i23 = 0;
            }
            int i38 = i24;
            int i39 = 0;
            while (i39 < width) {
                int i40 = i31 + i39;
                iArr3[i40] = i17 / i28;
                iArr4[i40] = i16 / i28;
                iArr5[i40] = i15 / i28;
                int i41 = i17 - i20;
                int i42 = i16 - i19;
                int i43 = i15 - i18;
                int i44 = (((i38 - i24) + i26) % i26) * 3;
                int i45 = i20 - iArr6[i44];
                int i46 = i44 + 1;
                int i47 = i19 - iArr6[i46];
                int i48 = i44 + 2;
                int i49 = i18 - iArr6[i48];
                int i50 = i28;
                int i51 = i27;
                int i52 = iArr[Math.min(i39 + i24 + 1, width - 1) + i31];
                int i53 = (i52 >> 16) & 255;
                int i54 = i31;
                int i55 = (i52 >> 8) & 255;
                int i56 = i52 & 255;
                iArr6[i44] = i53;
                iArr6[i46] = i55;
                iArr6[i48] = i56;
                int i57 = i23 + i53;
                int i58 = i22 + i55;
                int i59 = i21 + i56;
                i17 = i41 + i57;
                i16 = i42 + i58;
                i15 = i43 + i59;
                i38 = (i38 + 1) % i26;
                int i60 = i38 * 3;
                int i61 = iArr6[i60];
                i20 = i45 + i61;
                int i62 = iArr6[i60 + 1];
                i19 = i47 + i62;
                int i63 = iArr6[i60 + 2];
                i18 = i49 + i63;
                i23 = i57 - i61;
                i22 = i58 - i62;
                i21 = i59 - i63;
                i39++;
                i27 = i51;
                i28 = i50;
                i31 = i54;
            }
            i30 = i14 + 1;
            height = i13;
            iArr2 = iArr;
            i29 = 0;
        }
        int i64 = i27;
        int i65 = i28;
        int i66 = height;
        int[] iArr7 = iArr2;
        int i67 = 0;
        while (i67 < width) {
            int i68 = -i24;
            if (i68 <= i24) {
                i5 = 0;
                i6 = 0;
                i7 = 0;
                int i69 = 0;
                i8 = 0;
                i9 = 0;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                while (true) {
                    i2 = i26;
                    int i70 = i69;
                    int i71 = i8;
                    i3 = 0;
                    int min = (Math.min(i66 - 1, Math.max(i68, 0)) * width) + i67;
                    int i72 = (i68 + i24) * 3;
                    int i73 = iArr3[min];
                    int i74 = iArr4[min];
                    int i75 = iArr5[min];
                    iArr6[i72] = i73;
                    iArr6[i72 + 1] = i74;
                    iArr6[i72 + 2] = i75;
                    int abs2 = i64 - Math.abs(i68);
                    i7 += i73 * abs2;
                    i6 += i74 * abs2;
                    i5 += abs2 * i75;
                    if (i68 > 0) {
                        i12 += i73;
                        i11 += i74;
                        i10 += i75;
                        i4 = i70;
                        i8 = i71;
                    } else {
                        i9 += i73;
                        i8 = i71 + i74;
                        i4 = i70 + i75;
                    }
                    if (i68 == i24) {
                        break;
                    }
                    i68++;
                    i69 = i4;
                    i26 = i2;
                }
            } else {
                i2 = i26;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 0;
                i8 = 0;
                i9 = 0;
                i10 = 0;
                i11 = 0;
                i12 = 0;
            }
            int i76 = i24;
            int i77 = i66;
            while (i3 < i77) {
                int i78 = (i3 * width) + i67;
                iArr7[i78] = (iArr7[i78] & (-16777216)) | ((i7 / i65) << 16) | ((i6 / i65) << 8) | (i5 / i65);
                int i79 = i7 - i9;
                int i80 = i6 - i8;
                int i81 = i5 - i4;
                int i82 = (((i76 - i24) + i2) % i2) * 3;
                int i83 = i9 - iArr6[i82];
                int i84 = i82 + 1;
                int i85 = i8 - iArr6[i84];
                int i86 = i82 + 2;
                int i87 = i4 - iArr6[i86];
                int i88 = i3;
                int min2 = (Math.min(i3 + i24 + 1, i77 - 1) * width) + i67;
                int i89 = iArr3[min2];
                int i90 = iArr4[min2];
                int i91 = iArr5[min2];
                iArr6[i82] = i89;
                iArr6[i84] = i90;
                iArr6[i86] = i91;
                int i92 = i12 + i89;
                int i93 = i11 + i90;
                int i94 = i10 + i91;
                i7 = i79 + i92;
                i6 = i80 + i93;
                i5 = i81 + i94;
                i76 = (i76 + 1) % i2;
                int i95 = i76 * 3;
                int i96 = iArr6[i95];
                i9 = i83 + i96;
                int i97 = iArr6[i95 + 1];
                i8 = i85 + i97;
                int i98 = iArr6[i95 + 2];
                i4 = i87 + i98;
                i12 = i92 - i96;
                i11 = i93 - i97;
                i10 = i94 - i98;
                i3 = i88 + 1;
                i24 = i;
            }
            i67++;
            i24 = i;
            i66 = i77;
            i26 = i2;
        }
        bitmap.setPixels(iArr7, 0, width, 0, 0, width, i66);
    }

    public static /* synthetic */ Bitmap a(Bitmap bitmap, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8;
        }
        return a(bitmap, i);
    }
}

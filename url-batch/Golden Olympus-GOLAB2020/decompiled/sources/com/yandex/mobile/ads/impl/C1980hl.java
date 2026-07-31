package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import j2.AbstractC3185a;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.hl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1980hl {
    @NotNull
    public static Bitmap a(@NotNull Bitmap originalBitmap, double d4) {
        Intrinsics.checkNotNullParameter(originalBitmap, "originalBitmap");
        try {
            return b(originalBitmap, d4);
        } catch (Throwable unused) {
            return originalBitmap;
        }
    }

    private static Bitmap b(Bitmap bitmap, double d4) {
        int i4;
        int i5;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, AbstractC3185a.b(bitmap.getWidth() * d4), AbstractC3185a.b(bitmap.getHeight() * d4), false);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        int i6 = 1;
        Bitmap copy = createScaledBitmap.copy(createScaledBitmap.getConfig(), true);
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i7 = width * height;
        int[] iArr = new int[i7];
        copy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i8 = width - 1;
        int i9 = height - 1;
        int[] iArr2 = new int[i7];
        int[] iArr3 = new int[i7];
        int[] iArr4 = new int[i7];
        int[] iArr5 = new int[kotlin.ranges.g.d(width, height)];
        int[] iArr6 = new int[1024];
        for (int i10 = 0; i10 < 1024; i10++) {
            iArr6[i10] = i10 / 4;
        }
        char c4 = 3;
        int[][] iArr7 = new int[3][];
        for (int i11 = 0; i11 < 3; i11++) {
            iArr7[i11] = new int[3];
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < height) {
            char c5 = c4;
            int i15 = -1;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            while (i15 <= i6) {
                int[] iArr8 = iArr4;
                int i25 = i6;
                int i26 = iArr[kotlin.ranges.g.g(i8, kotlin.ranges.g.d(i15, 0)) + i13];
                int i27 = i15 + 1;
                int[] iArr9 = iArr7[i27];
                iArr9[0] = (i26 & 16711680) >> 16;
                iArr9[i25] = (i26 & 65280) >> 8;
                iArr9[2] = i26 & KotlinVersion.MAX_COMPONENT_VALUE;
                int abs = 2 - StrictMath.abs(i15);
                int i28 = iArr9[0];
                i16 = (i28 * abs) + i16;
                int i29 = iArr9[i25];
                i17 = (i29 * abs) + i17;
                int i30 = iArr9[2];
                i18 = (abs * i30) + i18;
                if (i15 > 0) {
                    i24 += i28;
                    i23 += i29;
                    i22 += i30;
                } else {
                    i21 += i28;
                    i20 += i29;
                    i19 += i30;
                }
                i6 = i25;
                iArr4 = iArr8;
                i15 = i27;
            }
            int[] iArr10 = iArr4;
            int i31 = i6;
            int i32 = 0;
            while (i32 < width) {
                iArr2[i13] = iArr6[i16];
                iArr3[i13] = iArr6[i17];
                iArr10[i13] = iArr6[i18];
                int i33 = i16 - i21;
                int i34 = i17 - i20;
                int i35 = i18 - i19;
                int[] iArr11 = iArr7[(i6 + 2) % 3];
                int i36 = i21 - iArr11[0];
                int i37 = i20 - iArr11[i31];
                int i38 = i19 - iArr11[2];
                if (i12 == 0) {
                    i5 = i32;
                    iArr5[i5] = Math.min(i5 + 2, i8);
                } else {
                    i5 = i32;
                }
                int i39 = iArr[i14 + iArr5[i5]];
                int i40 = (i39 & 16711680) >> 16;
                iArr11[0] = i40;
                int i41 = (i39 & 65280) >> 8;
                iArr11[i31] = i41;
                int i42 = i39 & KotlinVersion.MAX_COMPONENT_VALUE;
                iArr11[2] = i42;
                int i43 = i24 + i40;
                int i44 = i23 + i41;
                int i45 = i22 + i42;
                i16 = i33 + i43;
                i17 = i34 + i44;
                i18 = i35 + i45;
                i6 = (i6 + 1) % 3;
                int[] iArr12 = iArr7[i6 % 3];
                int i46 = iArr12[0];
                i21 = i36 + i46;
                int i47 = iArr12[i31];
                i20 = i37 + i47;
                int i48 = iArr12[2];
                i19 = i38 + i48;
                i24 = i43 - i46;
                i23 = i44 - i47;
                i22 = i45 - i48;
                i13++;
                i32 = i5 + 1;
            }
            i14 += width;
            i12++;
            c4 = c5;
            i6 = i31;
            iArr4 = iArr10;
        }
        int[] iArr13 = iArr4;
        int i49 = i6;
        int i50 = 0;
        while (i50 < width) {
            int i51 = width * (-1);
            int i52 = -1;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            for (int i62 = i49; i52 <= i62; i62 = 1) {
                int max = Math.max(0, i51) + i50;
                int i63 = i52 + 1;
                int[] iArr14 = iArr7[i63];
                iArr14[0] = iArr2[max];
                iArr14[i62] = iArr3[max];
                iArr14[2] = iArr13[max];
                int abs2 = 2 - StrictMath.abs(i52);
                i59 = (iArr2[max] * abs2) + i59;
                i60 = (iArr3[max] * abs2) + i60;
                i61 = (iArr13[max] * abs2) + i61;
                if (i52 > 0) {
                    i58 += iArr14[0];
                    i57 += iArr14[1];
                    i56 += iArr14[2];
                } else {
                    i55 += iArr14[0];
                    i54 += iArr14[1];
                    i53 += iArr14[2];
                }
                if (i52 < i9) {
                    i51 += width;
                }
                i52 = i63;
            }
            int i64 = i59;
            int i65 = i61;
            int i66 = 1;
            int i67 = i50;
            int i68 = i58;
            int i69 = i57;
            int i70 = i56;
            int i71 = i55;
            int i72 = i54;
            int i73 = i53;
            for (int i74 = 0; i74 < height; i74++) {
                iArr[i67] = (iArr[i67] & (-16777216)) | (iArr6[i64] << 16) | (iArr6[i60] << 8) | iArr6[i65];
                int i75 = i64 - i71;
                int i76 = i60 - i72;
                int i77 = i65 - i73;
                int[] iArr15 = iArr7[(i66 + 2) % 3];
                int i78 = i71 - iArr15[0];
                int i79 = i72 - iArr15[1];
                int i80 = i73 - iArr15[2];
                if (i50 == 0) {
                    i4 = i75;
                    iArr5[i74] = Math.min(i74 + 2, i9) * width;
                } else {
                    i4 = i75;
                }
                int i81 = iArr5[i74] + i50;
                int i82 = iArr2[i81];
                iArr15[0] = i82;
                int i83 = iArr3[i81];
                iArr15[1] = i83;
                int i84 = iArr13[i81];
                iArr15[2] = i84;
                int i85 = i68 + i82;
                int i86 = i69 + i83;
                int i87 = i70 + i84;
                i64 = i4 + i85;
                i60 = i76 + i86;
                i65 = i77 + i87;
                i66 = (i66 + 1) % 3;
                int[] iArr16 = iArr7[i66];
                int i88 = iArr16[0];
                i71 = i78 + i88;
                int i89 = iArr16[1];
                i72 = i79 + i89;
                int i90 = iArr16[2];
                i73 = i80 + i90;
                i68 = i85 - i88;
                i69 = i86 - i89;
                i70 = i87 - i90;
                i67 += width;
            }
            i50++;
            i49 = 1;
        }
        copy.setPixels(iArr, 0, width, 0, 0, width, height);
        Intrinsics.checkNotNull(copy);
        return copy;
    }
}

package com.google.zxing.common;

import com.google.zxing.NotFoundException;

/* loaded from: classes4.dex */
public abstract class GridSampler {
    private static GridSampler gridSampler = new DefaultGridSampler();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static void checkAndNudgePoints(BitMatrix bitMatrix, float[] fArr) {
        int width = bitMatrix.getWidth();
        int height = bitMatrix.getHeight();
        boolean z7 = true;
        for (int i8 = 0; i8 < fArr.length && z7; i8 += 2) {
            int i9 = (int) fArr[i8];
            int i10 = i8 + 1;
            int i11 = (int) fArr[i10];
            if (i9 < -1 || i9 > width || i11 < -1 || i11 > height) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i9 == -1) {
                fArr[i8] = 0.0f;
            } else if (i9 == width) {
                fArr[i8] = width - 1;
            } else {
                z7 = false;
                if (i11 != -1) {
                    fArr[i10] = 0.0f;
                } else if (i11 == height) {
                    fArr[i10] = height - 1;
                }
                z7 = true;
            }
            z7 = true;
            if (i11 != -1) {
            }
            z7 = true;
        }
        boolean z8 = true;
        for (int length = fArr.length - 2; length >= 0 && z8; length -= 2) {
            int i12 = (int) fArr[length];
            int i13 = length + 1;
            int i14 = (int) fArr[i13];
            if (i12 < -1 || i12 > width || i14 < -1 || i14 > height) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i12 == -1) {
                fArr[length] = 0.0f;
            } else if (i12 == width) {
                fArr[length] = width - 1;
            } else {
                z8 = false;
                if (i14 != -1) {
                    fArr[i13] = 0.0f;
                } else if (i14 == height) {
                    fArr[i13] = height - 1;
                }
                z8 = true;
            }
            z8 = true;
            if (i14 != -1) {
            }
            z8 = true;
        }
    }

    public static GridSampler getInstance() {
        return gridSampler;
    }

    public static void setGridSampler(GridSampler gridSampler2) {
        gridSampler = gridSampler2;
    }

    public abstract BitMatrix sampleGrid(BitMatrix bitMatrix, int i8, int i9, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23);

    public abstract BitMatrix sampleGrid(BitMatrix bitMatrix, int i8, int i9, PerspectiveTransform perspectiveTransform);
}

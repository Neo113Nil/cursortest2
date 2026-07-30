package com.google.zxing.common;

import com.google.zxing.NotFoundException;

/* loaded from: classes4.dex */
public final class DefaultGridSampler extends GridSampler {
    @Override // com.google.zxing.common.GridSampler
    public BitMatrix sampleGrid(BitMatrix bitMatrix, int i8, int i9, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23) {
        return sampleGrid(bitMatrix, i8, i9, PerspectiveTransform.quadrilateralToQuadrilateral(f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23));
    }

    @Override // com.google.zxing.common.GridSampler
    public BitMatrix sampleGrid(BitMatrix bitMatrix, int i8, int i9, PerspectiveTransform perspectiveTransform) {
        if (i8 > 0 && i9 > 0) {
            BitMatrix bitMatrix2 = new BitMatrix(i8, i9);
            int i10 = i8 * 2;
            float[] fArr = new float[i10];
            for (int i11 = 0; i11 < i9; i11++) {
                float f8 = i11 + 0.5f;
                for (int i12 = 0; i12 < i10; i12 += 2) {
                    fArr[i12] = (i12 / 2) + 0.5f;
                    fArr[i12 + 1] = f8;
                }
                perspectiveTransform.transformPoints(fArr);
                GridSampler.checkAndNudgePoints(bitMatrix, fArr);
                for (int i13 = 0; i13 < i10; i13 += 2) {
                    try {
                        if (bitMatrix.get((int) fArr[i13], (int) fArr[i13 + 1])) {
                            bitMatrix2.set(i13 / 2, i11);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                }
            }
            return bitMatrix2;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

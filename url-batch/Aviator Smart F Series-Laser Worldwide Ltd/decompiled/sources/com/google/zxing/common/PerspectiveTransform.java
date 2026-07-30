package com.google.zxing.common;

/* loaded from: classes4.dex */
public final class PerspectiveTransform {
    private final float a11;
    private final float a12;
    private final float a13;
    private final float a21;
    private final float a22;
    private final float a23;
    private final float a31;
    private final float a32;
    private final float a33;

    private PerspectiveTransform(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.a11 = f8;
        this.a12 = f11;
        this.a13 = f14;
        this.a21 = f9;
        this.a22 = f12;
        this.a23 = f15;
        this.a31 = f10;
        this.a32 = f13;
        this.a33 = f16;
    }

    public static PerspectiveTransform quadrilateralToQuadrilateral(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23) {
        return squareToQuadrilateral(f16, f17, f18, f19, f20, f21, f22, f23).times(quadrilateralToSquare(f8, f9, f10, f11, f12, f13, f14, f15));
    }

    public static PerspectiveTransform quadrilateralToSquare(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        return squareToQuadrilateral(f8, f9, f10, f11, f12, f13, f14, f15).buildAdjoint();
    }

    public static PerspectiveTransform squareToQuadrilateral(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = ((f8 - f10) + f12) - f14;
        float f17 = ((f9 - f11) + f13) - f15;
        if (f16 == 0.0f && f17 == 0.0f) {
            return new PerspectiveTransform(f10 - f8, f12 - f10, f8, f11 - f9, f13 - f11, f9, 0.0f, 0.0f, 1.0f);
        }
        float f18 = f10 - f12;
        float f19 = f14 - f12;
        float f20 = f11 - f13;
        float f21 = f15 - f13;
        float f22 = (f18 * f21) - (f19 * f20);
        float f23 = ((f21 * f16) - (f19 * f17)) / f22;
        float f24 = ((f18 * f17) - (f16 * f20)) / f22;
        return new PerspectiveTransform((f23 * f10) + (f10 - f8), (f24 * f14) + (f14 - f8), f8, (f11 - f9) + (f23 * f11), (f15 - f9) + (f24 * f15), f9, f23, f24, 1.0f);
    }

    PerspectiveTransform buildAdjoint() {
        float f8 = this.a22;
        float f9 = this.a33;
        float f10 = this.a23;
        float f11 = this.a32;
        float f12 = (f8 * f9) - (f10 * f11);
        float f13 = this.a31;
        float f14 = this.a21;
        float f15 = (f10 * f13) - (f14 * f9);
        float f16 = (f14 * f11) - (f8 * f13);
        float f17 = this.a13;
        float f18 = this.a12;
        float f19 = (f17 * f11) - (f18 * f9);
        float f20 = this.a11;
        return new PerspectiveTransform(f12, f15, f16, f19, (f9 * f20) - (f17 * f13), (f13 * f18) - (f11 * f20), (f18 * f10) - (f17 * f8), (f17 * f14) - (f10 * f20), (f20 * f8) - (f18 * f14));
    }

    PerspectiveTransform times(PerspectiveTransform perspectiveTransform) {
        float f8 = this.a11;
        float f9 = perspectiveTransform.a11;
        float f10 = this.a21;
        float f11 = perspectiveTransform.a12;
        float f12 = this.a31;
        float f13 = perspectiveTransform.a13;
        float f14 = (f8 * f9) + (f10 * f11) + (f12 * f13);
        float f15 = perspectiveTransform.a21;
        float f16 = perspectiveTransform.a22;
        float f17 = perspectiveTransform.a23;
        float f18 = (f8 * f15) + (f10 * f16) + (f12 * f17);
        float f19 = perspectiveTransform.a31;
        float f20 = perspectiveTransform.a32;
        float f21 = perspectiveTransform.a33;
        float f22 = (f8 * f19) + (f10 * f20) + (f12 * f21);
        float f23 = this.a12;
        float f24 = this.a22;
        float f25 = this.a32;
        float f26 = (f23 * f9) + (f24 * f11) + (f25 * f13);
        float f27 = (f23 * f15) + (f24 * f16) + (f25 * f17);
        float f28 = (f25 * f21) + (f23 * f19) + (f24 * f20);
        float f29 = this.a13;
        float f30 = this.a23;
        float f31 = (f9 * f29) + (f11 * f30);
        float f32 = this.a33;
        return new PerspectiveTransform(f14, f18, f22, f26, f27, f28, (f13 * f32) + f31, (f15 * f29) + (f16 * f30) + (f17 * f32), (f29 * f19) + (f30 * f20) + (f32 * f21));
    }

    public void transformPoints(float[] fArr) {
        int length = fArr.length;
        float f8 = this.a11;
        float f9 = this.a12;
        float f10 = this.a13;
        float f11 = this.a21;
        float f12 = this.a22;
        float f13 = this.a23;
        float f14 = this.a31;
        float f15 = this.a32;
        float f16 = this.a33;
        for (int i8 = 0; i8 < length; i8 += 2) {
            float f17 = fArr[i8];
            int i9 = i8 + 1;
            float f18 = fArr[i9];
            float f19 = (f10 * f17) + (f13 * f18) + f16;
            fArr[i8] = (((f8 * f17) + (f11 * f18)) + f14) / f19;
            fArr[i9] = (((f17 * f9) + (f18 * f12)) + f15) / f19;
        }
    }

    public void transformPoints(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            float f8 = fArr[i8];
            float f9 = fArr2[i8];
            float f10 = (this.a13 * f8) + (this.a23 * f9) + this.a33;
            fArr[i8] = (((this.a11 * f8) + (this.a21 * f9)) + this.a31) / f10;
            fArr2[i8] = (((this.a12 * f8) + (this.a22 * f9)) + this.a32) / f10;
        }
    }
}

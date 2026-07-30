package com.baidu.ar.arplay.representation;

/* loaded from: classes.dex */
public final class Matrix {
    private static final float[] TEMP_MATRIX_ARRAY = new float[32];

    private Matrix() {
    }

    public static void frustumM(float[] fArr, int i8, float f8, float f9, float f10, float f11, float f12, float f13) {
        if (f8 == f9) {
            throw new IllegalArgumentException("left == right");
        }
        if (f11 == f10) {
            throw new IllegalArgumentException("top == bottom");
        }
        if (f12 == f13) {
            throw new IllegalArgumentException("near == far");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("near <= 0.0f");
        }
        if (f13 <= 0.0f) {
            throw new IllegalArgumentException("far <= 0.0f");
        }
        float f14 = 1.0f / (f9 - f8);
        float f15 = 1.0f / (f11 - f10);
        float f16 = 1.0f / (f12 - f13);
        float f17 = (f9 + f8) * f14 * 2.0f;
        float f18 = (f11 + f10) * f15;
        fArr[i8] = f12 * f14 * 2.0f;
        fArr[i8 + 5] = f12 * f15 * 2.0f;
        fArr[i8 + 8] = f17;
        fArr[i8 + 9] = f18;
        fArr[i8 + 10] = (f13 + f12) * f16;
        fArr[i8 + 14] = f13 * f12 * f16 * 2.0f;
        fArr[i8 + 11] = -1.0f;
        fArr[i8 + 1] = 0.0f;
        fArr[i8 + 2] = 0.0f;
        fArr[i8 + 3] = 0.0f;
        fArr[i8 + 4] = 0.0f;
        fArr[i8 + 6] = 0.0f;
        fArr[i8 + 7] = 0.0f;
        fArr[i8 + 12] = 0.0f;
        fArr[i8 + 13] = 0.0f;
        fArr[i8 + 15] = 0.0f;
    }

    public static boolean invertM(float[] fArr, int i8, float[] fArr2, int i9) {
        float f8 = fArr2[i9];
        float f9 = fArr2[i9 + 1];
        float f10 = fArr2[i9 + 2];
        float f11 = fArr2[i9 + 3];
        float f12 = fArr2[i9 + 4];
        float f13 = fArr2[i9 + 5];
        float f14 = fArr2[i9 + 6];
        float f15 = fArr2[i9 + 7];
        float f16 = fArr2[i9 + 8];
        float f17 = fArr2[i9 + 9];
        float f18 = fArr2[i9 + 10];
        float f19 = fArr2[i9 + 11];
        float f20 = fArr2[i9 + 12];
        float f21 = fArr2[i9 + 13];
        float f22 = fArr2[i9 + 14];
        float f23 = fArr2[i9 + 15];
        float f24 = f18 * f23;
        float f25 = f22 * f19;
        float f26 = f14 * f23;
        float f27 = f22 * f15;
        float f28 = f14 * f19;
        float f29 = f18 * f15;
        float f30 = f10 * f23;
        float f31 = f22 * f11;
        float f32 = f10 * f19;
        float f33 = f18 * f11;
        float f34 = f10 * f15;
        float f35 = f14 * f11;
        float f36 = (((f24 * f13) + (f27 * f17)) + (f28 * f21)) - (((f25 * f13) + (f26 * f17)) + (f29 * f21));
        float f37 = (((f25 * f9) + (f30 * f17)) + (f33 * f21)) - (((f24 * f9) + (f31 * f17)) + (f32 * f21));
        float f38 = (((f26 * f9) + (f31 * f13)) + (f34 * f21)) - (((f27 * f9) + (f30 * f13)) + (f35 * f21));
        float f39 = (((f29 * f9) + (f32 * f13)) + (f35 * f17)) - (((f28 * f9) + (f33 * f13)) + (f34 * f17));
        float f40 = (((f25 * f12) + (f26 * f16)) + (f29 * f20)) - (((f24 * f12) + (f27 * f16)) + (f28 * f20));
        float f41 = (((f24 * f8) + (f31 * f16)) + (f32 * f20)) - (((f25 * f8) + (f30 * f16)) + (f33 * f20));
        float f42 = (((f27 * f8) + (f30 * f12)) + (f35 * f20)) - (((f26 * f8) + (f31 * f12)) + (f34 * f20));
        float f43 = (((f28 * f8) + (f33 * f12)) + (f34 * f16)) - (((f29 * f8) + (f32 * f12)) + (f35 * f16));
        float f44 = f16 * f21;
        float f45 = f20 * f17;
        float f46 = f12 * f21;
        float f47 = f20 * f13;
        float f48 = f12 * f17;
        float f49 = f16 * f13;
        float f50 = f21 * f8;
        float f51 = f20 * f9;
        float f52 = f17 * f8;
        float f53 = f16 * f9;
        float f54 = f13 * f8;
        float f55 = f9 * f12;
        float f56 = (((f44 * f15) + (f47 * f19)) + (f48 * f23)) - (((f45 * f15) + (f46 * f19)) + (f49 * f23));
        float f57 = (((f45 * f11) + (f50 * f19)) + (f53 * f23)) - (((f44 * f11) + (f51 * f19)) + (f52 * f23));
        float f58 = (((f46 * f11) + (f51 * f15)) + (f54 * f23)) - (((f47 * f11) + (f50 * f15)) + (f23 * f55));
        float f59 = (((f49 * f11) + (f52 * f15)) + (f55 * f19)) - (((f11 * f48) + (f15 * f53)) + (f19 * f54));
        float f60 = (((f46 * f18) + (f49 * f22)) + (f45 * f14)) - (((f48 * f22) + (f44 * f14)) + (f47 * f18));
        float f61 = (((f52 * f22) + (f44 * f10)) + (f51 * f18)) - (((f50 * f18) + (f53 * f22)) + (f45 * f10));
        float f62 = (((f50 * f14) + (f55 * f22)) + (f47 * f10)) - (((f22 * f54) + (f46 * f10)) + (f51 * f14));
        float f63 = (((f54 * f18) + (f48 * f10)) + (f53 * f14)) - (((f52 * f14) + (f55 * f18)) + (f49 * f10));
        float f64 = (f8 * f36) + (f12 * f37) + (f16 * f38) + (f20 * f39);
        if (f64 == 0.0f) {
            return false;
        }
        float f65 = 1.0f / f64;
        fArr[i8] = f36 * f65;
        fArr[i8 + 1] = f37 * f65;
        fArr[i8 + 2] = f38 * f65;
        fArr[i8 + 3] = f39 * f65;
        fArr[i8 + 4] = f40 * f65;
        fArr[i8 + 5] = f41 * f65;
        fArr[i8 + 6] = f42 * f65;
        fArr[i8 + 7] = f43 * f65;
        fArr[i8 + 8] = f56 * f65;
        fArr[i8 + 9] = f57 * f65;
        fArr[i8 + 10] = f58 * f65;
        fArr[i8 + 11] = f59 * f65;
        fArr[i8 + 12] = f60 * f65;
        fArr[i8 + 13] = f61 * f65;
        fArr[i8 + 14] = f62 * f65;
        fArr[i8 + 15] = f63 * f65;
        return true;
    }

    public static float length(float f8, float f9, float f10) {
        return (float) Math.sqrt((f8 * f8) + (f9 * f9) + (f10 * f10));
    }

    public static void multiplyMM(float[] fArr, int i8, float[] fArr2, int i9, float[] fArr3, int i10) {
        int i11 = i9 + 4;
        int i12 = i10 + 1;
        int i13 = i9 + 8;
        int i14 = i10 + 2;
        int i15 = i9 + 12;
        int i16 = i10 + 3;
        fArr[i8] = (fArr2[i9] * fArr3[i10]) + (fArr2[i11] * fArr3[i12]) + (fArr2[i13] * fArr3[i14]) + (fArr2[i15] * fArr3[i16]);
        int i17 = i9 + 1;
        int i18 = i9 + 5;
        int i19 = i9 + 9;
        int i20 = i9 + 13;
        fArr[i8 + 1] = (fArr2[i17] * fArr3[i10]) + (fArr2[i18] * fArr3[i12]) + (fArr2[i19] * fArr3[i14]) + (fArr2[i20] * fArr3[i16]);
        int i21 = i9 + 2;
        int i22 = i9 + 6;
        int i23 = i9 + 10;
        int i24 = i9 + 14;
        fArr[i8 + 2] = (fArr2[i21] * fArr3[i10]) + (fArr2[i22] * fArr3[i12]) + (fArr2[i23] * fArr3[i14]) + (fArr2[i24] * fArr3[i16]);
        int i25 = i9 + 3;
        int i26 = i9 + 7;
        float f8 = (fArr2[i25] * fArr3[i10]) + (fArr2[i26] * fArr3[i12]);
        int i27 = i9 + 11;
        float f9 = f8 + (fArr2[i27] * fArr3[i14]);
        int i28 = i9 + 15;
        fArr[i8 + 3] = f9 + (fArr2[i28] * fArr3[i16]);
        int i29 = i10 + 4;
        int i30 = i10 + 5;
        int i31 = i10 + 6;
        int i32 = i10 + 7;
        fArr[i8 + 4] = (fArr2[i9] * fArr3[i29]) + (fArr2[i11] * fArr3[i30]) + (fArr2[i13] * fArr3[i31]) + (fArr2[i15] * fArr3[i32]);
        fArr[i8 + 5] = (fArr2[i17] * fArr3[i29]) + (fArr2[i18] * fArr3[i30]) + (fArr2[i19] * fArr3[i31]) + (fArr2[i20] * fArr3[i32]);
        fArr[i8 + 6] = (fArr2[i21] * fArr3[i29]) + (fArr2[i22] * fArr3[i30]) + (fArr2[i23] * fArr3[i31]) + (fArr2[i24] * fArr3[i32]);
        fArr[i8 + 7] = (fArr2[i25] * fArr3[i29]) + (fArr2[i26] * fArr3[i30]) + (fArr2[i27] * fArr3[i31]) + (fArr2[i28] * fArr3[i32]);
        int i33 = i10 + 8;
        int i34 = i10 + 9;
        int i35 = i10 + 10;
        int i36 = i10 + 11;
        fArr[i8 + 8] = (fArr2[i9] * fArr3[i33]) + (fArr2[i11] * fArr3[i34]) + (fArr2[i13] * fArr3[i35]) + (fArr2[i15] * fArr3[i36]);
        fArr[i8 + 9] = (fArr2[i17] * fArr3[i33]) + (fArr2[i18] * fArr3[i34]) + (fArr2[i19] * fArr3[i35]) + (fArr2[i20] * fArr3[i36]);
        fArr[i8 + 10] = (fArr2[i21] * fArr3[i33]) + (fArr2[i22] * fArr3[i34]) + (fArr2[i23] * fArr3[i35]) + (fArr2[i24] * fArr3[i36]);
        fArr[i8 + 11] = (fArr2[i25] * fArr3[i33]) + (fArr2[i26] * fArr3[i34]) + (fArr2[i27] * fArr3[i35]) + (fArr2[i28] * fArr3[i36]);
        int i37 = i10 + 12;
        int i38 = i10 + 13;
        float f10 = (fArr2[i9] * fArr3[i37]) + (fArr2[i11] * fArr3[i38]);
        float f11 = fArr2[i13];
        int i39 = i10 + 14;
        float f12 = f10 + (f11 * fArr3[i39]);
        float f13 = fArr2[i15];
        int i40 = i10 + 15;
        fArr[i8 + 12] = f12 + (f13 * fArr3[i40]);
        fArr[i8 + 13] = (fArr2[i17] * fArr3[i37]) + (fArr2[i18] * fArr3[i38]) + (fArr2[i19] * fArr3[i39]) + (fArr2[i20] * fArr3[i40]);
        fArr[i8 + 14] = (fArr2[i21] * fArr3[i37]) + (fArr2[i22] * fArr3[i38]) + (fArr2[i23] * fArr3[i39]) + (fArr2[i24] * fArr3[i40]);
        fArr[i8 + 15] = (fArr2[i25] * fArr3[i37]) + (fArr2[i26] * fArr3[i38]) + (fArr2[i27] * fArr3[i39]) + (fArr2[i28] * fArr3[i40]);
    }

    public static void multiplyMV(float[] fArr, int i8, float[] fArr2, int i9, float[] fArr3, int i10) {
        int i11 = i10 + 1;
        int i12 = i10 + 2;
        int i13 = i10 + 3;
        fArr[i8] = (fArr2[i9] * fArr3[i10]) + (fArr2[i9 + 4] * fArr3[i11]) + (fArr2[i9 + 8] * fArr3[i12]) + (fArr2[i9 + 12] * fArr3[i13]);
        fArr[i8 + 1] = (fArr2[i9 + 1] * fArr3[i10]) + (fArr2[i9 + 5] * fArr3[i11]) + (fArr2[i9 + 9] * fArr3[i12]) + (fArr2[i9 + 13] * fArr3[i13]);
        fArr[i8 + 2] = (fArr2[i9 + 2] * fArr3[i10]) + (fArr2[i9 + 6] * fArr3[i11]) + (fArr2[i9 + 10] * fArr3[i12]) + (fArr2[i9 + 14] * fArr3[i13]);
        fArr[i8 + 3] = (fArr2[i9 + 3] * fArr3[i10]) + (fArr2[i9 + 7] * fArr3[i11]) + (fArr2[i9 + 11] * fArr3[i12]) + (fArr2[i9 + 15] * fArr3[i13]);
    }

    public static void multiplyMV3(float[] fArr, float[] fArr2, float[] fArr3, float f8) {
        float f9 = fArr2[0] * fArr3[0];
        float f10 = fArr2[4];
        float f11 = fArr3[1];
        float f12 = f9 + (f10 * f11);
        float f13 = fArr2[8];
        float f14 = fArr3[2];
        fArr[0] = f12 + (f13 * f14) + (fArr2[12] * f8);
        float f15 = fArr2[1];
        float f16 = fArr3[0];
        fArr[1] = (f15 * f16) + (fArr2[5] * f11) + (fArr2[9] * f14) + (fArr2[13] * f8);
        fArr[2] = (fArr2[2] * f16) + (fArr2[6] * fArr3[1]) + (fArr2[10] * f14) + (fArr2[14] * f8);
    }

    public static void orthoM(float[] fArr, int i8, float f8, float f9, float f10, float f11, float f12, float f13) {
        if (f8 == f9) {
            throw new IllegalArgumentException("left == right");
        }
        if (f10 == f11) {
            throw new IllegalArgumentException("bottom == top");
        }
        if (f12 == f13) {
            throw new IllegalArgumentException("near == far");
        }
        float f14 = 1.0f / (f9 - f8);
        float f15 = 1.0f / (f11 - f10);
        float f16 = 1.0f / (f13 - f12);
        float f17 = (-(f9 + f8)) * f14;
        float f18 = (-(f11 + f10)) * f15;
        fArr[i8] = f14 * 2.0f;
        fArr[i8 + 5] = 2.0f * f15;
        fArr[i8 + 10] = (-2.0f) * f16;
        fArr[i8 + 12] = f17;
        fArr[i8 + 13] = f18;
        fArr[i8 + 14] = (-(f13 + f12)) * f16;
        fArr[i8 + 15] = 1.0f;
        fArr[i8 + 1] = 0.0f;
        fArr[i8 + 2] = 0.0f;
        fArr[i8 + 3] = 0.0f;
        fArr[i8 + 4] = 0.0f;
        fArr[i8 + 6] = 0.0f;
        fArr[i8 + 7] = 0.0f;
        fArr[i8 + 8] = 0.0f;
        fArr[i8 + 9] = 0.0f;
        fArr[i8 + 11] = 0.0f;
    }

    public static void perspectiveM(float[] fArr, int i8, float f8, float f9, float f10, float f11) {
        float tan = 1.0f / ((float) Math.tan(f8 * 0.008726646259971648d));
        float f12 = 1.0f / (f10 - f11);
        fArr[i8] = tan / f9;
        fArr[i8 + 1] = 0.0f;
        fArr[i8 + 2] = 0.0f;
        fArr[i8 + 3] = 0.0f;
        fArr[i8 + 4] = 0.0f;
        fArr[i8 + 5] = tan;
        fArr[i8 + 6] = 0.0f;
        fArr[i8 + 7] = 0.0f;
        fArr[i8 + 8] = 0.0f;
        fArr[i8 + 9] = 0.0f;
        fArr[i8 + 10] = (f11 + f10) * f12;
        fArr[i8 + 11] = -1.0f;
        fArr[i8 + 12] = 0.0f;
        fArr[i8 + 13] = 0.0f;
        fArr[i8 + 14] = f11 * 2.0f * f10 * f12;
        fArr[i8 + 15] = 0.0f;
    }

    public static void rotateM(float[] fArr, int i8, float f8, float f9, float f10, float f11) {
        float[] fArr2 = TEMP_MATRIX_ARRAY;
        synchronized (fArr2) {
            setRotateM(fArr2, 0, f8, f9, f10, f11);
            multiplyMM(fArr2, 16, fArr, i8, fArr2, 0);
            System.arraycopy(fArr2, 16, fArr, i8, 16);
        }
    }

    public static void scaleM(float[] fArr, int i8, float f8, float f9, float f10) {
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = i8 + i9;
            fArr[i10] = fArr[i10] * f8;
            int i11 = i10 + 4;
            fArr[i11] = fArr[i11] * f9;
            int i12 = i10 + 8;
            fArr[i12] = fArr[i12] * f10;
        }
    }

    public static void setIdentityM(float[] fArr, int i8) {
        for (int i9 = 0; i9 < 16; i9++) {
            fArr[i8 + i9] = 0.0f;
        }
        for (int i10 = 0; i10 < 16; i10 += 5) {
            fArr[i8 + i10] = 1.0f;
        }
    }

    public static void setLookAtM(float[] fArr, int i8, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = f11 - f8;
        float f18 = f12 - f9;
        float f19 = f13 - f10;
        float length = length(f17, f18, f19) != 0.0f ? 1.0f / length(f17, f18, f19) : 1.0f;
        float f20 = f17 * length;
        float f21 = f18 * length;
        float f22 = f19 * length;
        float f23 = (f21 * f16) - (f22 * f15);
        float f24 = (f22 * f14) - (f20 * f16);
        float f25 = (f20 * f15) - (f21 * f14);
        float length2 = length(f23, f24, f25) != 0.0f ? 1.0f / length(f23, f24, f25) : 1.0f;
        float f26 = f23 * length2;
        float f27 = f24 * length2;
        float f28 = f25 * length2;
        fArr[i8] = f26;
        fArr[i8 + 1] = (f27 * f22) - (f28 * f21);
        fArr[i8 + 2] = -f20;
        fArr[i8 + 3] = 0.0f;
        fArr[i8 + 4] = f27;
        fArr[i8 + 5] = (f28 * f20) - (f26 * f22);
        fArr[i8 + 6] = -f21;
        fArr[i8 + 7] = 0.0f;
        fArr[i8 + 8] = f28;
        fArr[i8 + 9] = (f26 * f21) - (f27 * f20);
        fArr[i8 + 10] = -f22;
        fArr[i8 + 11] = 0.0f;
        fArr[i8 + 12] = 0.0f;
        fArr[i8 + 13] = 0.0f;
        fArr[i8 + 14] = 0.0f;
        fArr[i8 + 15] = 1.0f;
        translateM(fArr, i8, -f8, -f9, -f10);
    }

    public static void setRotateEulerM(float[] fArr, int i8, float f8, float f9, float f10) {
        double d8 = f8 * 0.017453292f;
        float cos = (float) Math.cos(d8);
        float sin = (float) Math.sin(d8);
        double d9 = f9 * 0.017453292f;
        float cos2 = (float) Math.cos(d9);
        float sin2 = (float) Math.sin(d9);
        double d10 = f10 * 0.017453292f;
        float cos3 = (float) Math.cos(d10);
        float sin3 = (float) Math.sin(d10);
        float f11 = cos * sin2;
        float f12 = sin * sin2;
        fArr[i8] = cos2 * cos3;
        fArr[i8 + 1] = (-cos2) * sin3;
        fArr[i8 + 2] = sin2;
        fArr[i8 + 3] = 0.0f;
        fArr[i8 + 4] = (f11 * cos3) + (cos * sin3);
        fArr[i8 + 5] = ((-f11) * sin3) + (cos * cos3);
        fArr[i8 + 6] = (-sin) * cos2;
        fArr[i8 + 7] = 0.0f;
        fArr[i8 + 8] = ((-f12) * cos3) + (sin * sin3);
        fArr[i8 + 9] = (f12 * sin3) + (sin * cos3);
        fArr[i8 + 10] = cos * cos2;
        fArr[i8 + 11] = 0.0f;
        fArr[i8 + 12] = 0.0f;
        fArr[i8 + 13] = 0.0f;
        fArr[i8 + 14] = 0.0f;
        fArr[i8 + 15] = 1.0f;
    }

    public static void setRotateM(float[] fArr, int i8, float f8, float f9, float f10, float f11) {
        fArr[i8 + 3] = 0.0f;
        fArr[i8 + 7] = 0.0f;
        fArr[i8 + 11] = 0.0f;
        fArr[i8 + 12] = 0.0f;
        fArr[i8 + 13] = 0.0f;
        fArr[i8 + 14] = 0.0f;
        fArr[i8 + 15] = 1.0f;
        double d8 = f8 * 0.017453292f;
        float sin = (float) Math.sin(d8);
        float cos = (float) Math.cos(d8);
        if (1.0f == f9 && 0.0f == f10 && 0.0f == f11) {
            fArr[i8 + 5] = cos;
            fArr[i8 + 10] = cos;
            fArr[i8 + 6] = sin;
            fArr[i8 + 9] = -sin;
            fArr[i8 + 1] = 0.0f;
            fArr[i8 + 2] = 0.0f;
            fArr[i8 + 4] = 0.0f;
            fArr[i8 + 8] = 0.0f;
            fArr[i8] = 1.0f;
            return;
        }
        if (0.0f == f9 && 1.0f == f10 && 0.0f == f11) {
            fArr[i8] = cos;
            fArr[i8 + 10] = cos;
            fArr[i8 + 8] = sin;
            fArr[i8 + 2] = -sin;
            fArr[i8 + 1] = 0.0f;
            fArr[i8 + 4] = 0.0f;
            fArr[i8 + 6] = 0.0f;
            fArr[i8 + 9] = 0.0f;
            fArr[i8 + 5] = 1.0f;
            return;
        }
        if (0.0f == f9 && 0.0f == f10 && 1.0f == f11) {
            fArr[i8] = cos;
            fArr[i8 + 5] = cos;
            fArr[i8 + 1] = sin;
            fArr[i8 + 4] = -sin;
            fArr[i8 + 2] = 0.0f;
            fArr[i8 + 6] = 0.0f;
            fArr[i8 + 8] = 0.0f;
            fArr[i8 + 9] = 0.0f;
            fArr[i8 + 10] = 1.0f;
            return;
        }
        float length = length(f9, f10, f11);
        if (1.0f != length) {
            float f12 = 1.0f / length;
            f9 *= f12;
            f10 *= f12;
            f11 *= f12;
        }
        float f13 = 1.0f - cos;
        float f14 = f9 * sin;
        float f15 = f10 * sin;
        float f16 = sin * f11;
        fArr[i8] = (f9 * f9 * f13) + cos;
        float f17 = f9 * f10 * f13;
        fArr[i8 + 4] = f17 - f16;
        float f18 = f11 * f9 * f13;
        fArr[i8 + 8] = f18 + f15;
        fArr[i8 + 1] = f17 + f16;
        fArr[i8 + 5] = (f10 * f10 * f13) + cos;
        float f19 = f10 * f11 * f13;
        fArr[i8 + 9] = f19 - f14;
        fArr[i8 + 2] = f18 - f15;
        fArr[i8 + 6] = f19 + f14;
        fArr[i8 + 10] = (f11 * f11 * f13) + cos;
    }

    public static void translateM(float[] fArr, int i8, float f8, float f9, float f10) {
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = i8 + i9;
            int i11 = i10 + 12;
            fArr[i11] = fArr[i11] + (fArr[i10] * f8) + (fArr[i10 + 4] * f9) + (fArr[i10 + 8] * f10);
        }
    }

    public static void transposeM(float[] fArr, int i8, float[] fArr2, int i9) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = (i10 * 4) + i9;
            fArr[i10 + i8] = fArr2[i11];
            fArr[i10 + 4 + i8] = fArr2[i11 + 1];
            fArr[i10 + 8 + i8] = fArr2[i11 + 2];
            fArr[i10 + 12 + i8] = fArr2[i11 + 3];
        }
    }

    public static void multiplyMM(float[] fArr, float[] fArr2, float[] fArr3) {
        float f8 = fArr2[0] * fArr3[0];
        float f9 = fArr2[4];
        float f10 = fArr3[1];
        float f11 = fArr2[8];
        float f12 = fArr3[2];
        float f13 = fArr2[12];
        float f14 = fArr3[3];
        fArr[0] = f8 + (f9 * f10) + (f11 * f12) + (f13 * f14);
        float f15 = fArr2[1];
        float f16 = fArr3[0];
        float f17 = fArr2[5];
        float f18 = fArr2[9];
        float f19 = fArr2[13];
        fArr[1] = (f15 * f16) + (f10 * f17) + (f18 * f12) + (f19 * f14);
        float f20 = fArr2[2] * f16;
        float f21 = fArr2[6];
        float f22 = fArr3[1];
        float f23 = fArr2[10];
        float f24 = fArr2[14];
        fArr[2] = f20 + (f21 * f22) + (f12 * f23) + (f24 * f14);
        float f25 = fArr2[3] * f16;
        float f26 = fArr2[7];
        float f27 = fArr2[11];
        float f28 = f25 + (f22 * f26) + (fArr3[2] * f27);
        float f29 = fArr2[15];
        fArr[3] = f28 + (f14 * f29);
        float f30 = fArr2[0];
        float f31 = fArr3[4] * f30;
        float f32 = fArr3[5];
        float f33 = f31 + (f9 * f32);
        float f34 = fArr3[6];
        float f35 = fArr3[7];
        fArr[4] = f33 + (f11 * f34) + (f13 * f35);
        float f36 = fArr2[1];
        float f37 = fArr3[4];
        fArr[5] = (f36 * f37) + (f17 * f32) + (f18 * f34) + (f19 * f35);
        float f38 = fArr2[2];
        float f39 = fArr3[5];
        fArr[6] = (f38 * f37) + (f21 * f39) + (f34 * f23) + (f24 * f35);
        float f40 = fArr2[3];
        fArr[7] = (f37 * f40) + (f26 * f39) + (fArr3[6] * f27) + (f35 * f29);
        float f41 = fArr3[8] * f30;
        float f42 = fArr2[4];
        float f43 = fArr3[9];
        float f44 = fArr3[10];
        float f45 = f41 + (f42 * f43) + (f11 * f44);
        float f46 = fArr3[11];
        fArr[8] = f45 + (f13 * f46);
        float f47 = fArr3[8];
        float f48 = fArr2[5];
        fArr[9] = (f36 * f47) + (f43 * f48) + (f18 * f44) + (f19 * f46);
        float f49 = fArr2[6];
        float f50 = fArr3[9];
        fArr[10] = (f38 * f47) + (f49 * f50) + (f23 * f44) + (f24 * f46);
        float f51 = fArr2[7];
        fArr[11] = (f47 * f40) + (f50 * f51) + (f27 * fArr3[10]) + (f46 * f29);
        float f52 = f30 * fArr3[12];
        float f53 = fArr3[13];
        float f54 = f52 + (f42 * f53);
        float f55 = fArr2[8];
        float f56 = fArr3[14];
        float f57 = f54 + (f55 * f56);
        float f58 = fArr3[15];
        fArr[12] = f57 + (f13 * f58);
        float f59 = fArr3[12];
        fArr[13] = (f36 * f59) + (f48 * f53) + (fArr2[9] * f56) + (f19 * f58);
        float f60 = fArr3[13];
        fArr[14] = (f38 * f59) + (f49 * f60) + (fArr2[10] * f56) + (f24 * f58);
        fArr[15] = (f40 * f59) + (f51 * f60) + (fArr2[11] * fArr3[14]) + (f29 * f58);
    }

    public static void multiplyMV(float[] fArr, float[] fArr2, float[] fArr3) {
        float f8 = fArr2[0] * fArr3[0];
        float f9 = fArr2[4];
        float f10 = fArr3[1];
        float f11 = f8 + (f9 * f10);
        float f12 = fArr2[8];
        float f13 = fArr3[2];
        float f14 = f11 + (f12 * f13);
        float f15 = fArr2[12];
        float f16 = fArr3[3];
        fArr[0] = f14 + (f15 * f16);
        float f17 = fArr2[1];
        float f18 = fArr3[0];
        fArr[1] = (f17 * f18) + (fArr2[5] * f10) + (fArr2[9] * f13) + (fArr2[13] * f16);
        float f19 = fArr2[2] * f18;
        float f20 = fArr2[6];
        float f21 = fArr3[1];
        fArr[2] = f19 + (f20 * f21) + (fArr2[10] * f13) + (fArr2[14] * f16);
        fArr[3] = (fArr2[3] * f18) + (fArr2[7] * f21) + (fArr2[11] * fArr3[2]) + (fArr2[15] * f16);
    }

    public static void rotateM(float[] fArr, int i8, float[] fArr2, int i9, float f8, float f9, float f10, float f11) {
        float[] fArr3 = TEMP_MATRIX_ARRAY;
        synchronized (fArr3) {
            setRotateM(fArr3, 0, f8, f9, f10, f11);
            multiplyMM(fArr, i8, fArr2, i9, fArr3, 0);
        }
    }

    public static void scaleM(float[] fArr, int i8, float[] fArr2, int i9, float f8, float f9, float f10) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i8 + i10;
            int i12 = i9 + i10;
            fArr[i11] = fArr2[i12] * f8;
            fArr[i11 + 4] = fArr2[i12 + 4] * f9;
            fArr[i11 + 8] = fArr2[i12 + 8] * f10;
            fArr[i11 + 12] = fArr2[i12 + 12];
        }
    }

    public static void translateM(float[] fArr, int i8, float[] fArr2, int i9, float f8, float f9, float f10) {
        for (int i10 = 0; i10 < 12; i10++) {
            fArr[i8 + i10] = fArr2[i9 + i10];
        }
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i9 + i11;
            fArr[i8 + i11 + 12] = (fArr2[i12] * f8) + (fArr2[i12 + 4] * f9) + (fArr2[i12 + 8] * f10) + fArr2[i12 + 12];
        }
    }
}

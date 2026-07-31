package i3;

import android.graphics.Path;
import android.util.Log;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final char f3426a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f3427b;

    public e(char c8, float[] fArr) {
        this.f3426a = c8;
        this.f3427b = fArr;
    }

    public static void a(Path path, float f6, float f8, float f9, float f10, float f11, float f12, float f13, boolean z3, boolean z7) {
        double d8;
        double d9;
        double radians = Math.toRadians(f13);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d10 = f6;
        double d11 = f8;
        double d12 = f11;
        double d13 = ((d11 * sin) + (d10 * cos)) / d12;
        double d14 = f12;
        double d15 = ((d11 * cos) + ((-f6) * sin)) / d14;
        double d16 = f10;
        double d17 = ((d16 * sin) + (f9 * cos)) / d12;
        double d18 = ((d16 * cos) + ((-f9) * sin)) / d14;
        double d19 = d13 - d17;
        double d20 = d15 - d18;
        double d21 = (d13 + d17) / 2.0d;
        double d22 = (d15 + d18) / 2.0d;
        double d23 = (d20 * d20) + (d19 * d19);
        if (d23 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d24 = (1.0d / d23) - 0.25d;
        if (d24 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d23);
            float sqrt = (float) (Math.sqrt(d23) / 1.99999d);
            a(path, f6, f8, f9, f10, f11 * sqrt, sqrt * f12, f13, z3, z7);
            return;
        }
        double sqrt2 = Math.sqrt(d24);
        double d25 = sqrt2 * d19;
        double d26 = sqrt2 * d20;
        if (z3 == z7) {
            d8 = d21 - d26;
            d9 = d22 + d25;
        } else {
            d8 = d21 + d26;
            d9 = d22 - d25;
        }
        double atan2 = Math.atan2(d15 - d9, d13 - d8);
        double atan22 = Math.atan2(d18 - d9, d17 - d8) - atan2;
        if (z7 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d27 = d8 * d12;
        double d28 = d9 * d14;
        double d29 = (d27 * cos) - (d28 * sin);
        double d30 = (d28 * cos) + (d27 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d31 = -d12;
        double d32 = d31 * cos2;
        double d33 = d14 * sin2;
        double d34 = (d32 * sin3) - (d33 * cos3);
        double d35 = d31 * sin2;
        double d36 = d14 * cos2;
        double d37 = atan22 / ceil;
        double d38 = (cos3 * d36) + (sin3 * d35);
        double d39 = d10;
        double d40 = d11;
        int i = 0;
        double d41 = atan2;
        while (i < ceil) {
            double d42 = d41 + d37;
            double sin4 = Math.sin(d42);
            double cos4 = Math.cos(d42);
            int i8 = ceil;
            double d43 = (((d12 * cos2) * cos4) + d29) - (d33 * sin4);
            double d44 = (d36 * sin4) + (d12 * sin2 * cos4) + d30;
            double d45 = (d32 * sin4) - (d33 * cos4);
            double d46 = (cos4 * d36) + (sin4 * d35);
            double d47 = d42 - d41;
            double tan = Math.tan(d47 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d47)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d34 * sqrt3) + d39), (float) ((d38 * sqrt3) + d40), (float) (d43 - (sqrt3 * d45)), (float) (d44 - (sqrt3 * d46)), (float) d43, (float) d44);
            i++;
            d40 = d44;
            cos2 = cos2;
            d35 = d35;
            d41 = d42;
            d38 = d46;
            d39 = d43;
            ceil = i8;
            d34 = d45;
            d37 = d37;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(e[] eVarArr, Path path) {
        int i;
        float[] fArr;
        int i8;
        e eVar;
        int i9;
        char c8;
        float f6;
        float f8;
        e eVar2;
        boolean z3;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        e[] eVarArr2 = eVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = eVarArr2.length;
        int i10 = 0;
        int i11 = 0;
        char c9 = 'm';
        while (i11 < length) {
            e eVar3 = eVarArr2[i11];
            char c10 = eVar3.f3426a;
            float[] fArr3 = eVar3.f3427b;
            float f17 = fArr2[i10];
            float f18 = fArr2[1];
            float f19 = fArr2[2];
            float f20 = fArr2[3];
            float f21 = fArr2[4];
            int i12 = i10;
            float f22 = fArr2[5];
            switch (c10) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f21, f22);
                    f17 = f21;
                    f19 = f17;
                    f18 = f22;
                    f20 = f18;
                default:
                    i = 2;
                    break;
            }
            float f23 = f21;
            float f24 = f22;
            float f25 = f17;
            float f26 = f18;
            int i13 = i12;
            while (i13 < fArr3.length) {
                if (c10 == 'A') {
                    fArr = fArr3;
                    i8 = i13;
                    eVar = eVar3;
                    float f27 = f25;
                    float f28 = f26;
                    i9 = i11;
                    c8 = c10;
                    int i14 = i8 + 5;
                    int i15 = i8 + 6;
                    a(path, f27, f28, fArr[i14], fArr[i15], fArr[i8], fArr[i8 + 1], fArr[i8 + 2], fArr[i8 + 3] != 0.0f ? 1 : i12, fArr[i8 + 4] != 0.0f ? 1 : i12);
                    f19 = fArr[i14];
                    f6 = fArr[i15];
                    f20 = f6;
                    f8 = f19;
                } else if (c10 == 'C') {
                    fArr = fArr3;
                    i8 = i13;
                    i9 = i11;
                    eVar = eVar3;
                    c8 = c10;
                    int i16 = i8 + 2;
                    int i17 = i8 + 3;
                    int i18 = i8 + 4;
                    int i19 = i8 + 5;
                    path2.cubicTo(fArr[i8], fArr[i8 + 1], fArr[i16], fArr[i17], fArr[i18], fArr[i19]);
                    float f29 = fArr[i18];
                    float f30 = fArr[i19];
                    f19 = fArr[i16];
                    f20 = fArr[i17];
                    f6 = f30;
                    f8 = f29;
                } else if (c10 == 'H') {
                    fArr = fArr3;
                    i8 = i13;
                    eVar = eVar3;
                    c8 = c10;
                    f6 = f26;
                    i9 = i11;
                    path2.lineTo(fArr[i8], f6);
                    f8 = fArr[i8];
                } else if (c10 == 'Q') {
                    fArr = fArr3;
                    i8 = i13;
                    i9 = i11;
                    eVar = eVar3;
                    c8 = c10;
                    int i20 = i8 + 1;
                    int i21 = i8 + 2;
                    int i22 = i8 + 3;
                    path2.quadTo(fArr[i8], fArr[i20], fArr[i21], fArr[i22]);
                    float f31 = fArr[i8];
                    float f32 = fArr[i20];
                    float f33 = fArr[i21];
                    float f34 = fArr[i22];
                    f19 = f31;
                    f20 = f32;
                    f8 = f33;
                    f6 = f34;
                } else if (c10 == 'V') {
                    fArr = fArr3;
                    i8 = i13;
                    i9 = i11;
                    eVar = eVar3;
                    f8 = f25;
                    c8 = c10;
                    path2.lineTo(f8, fArr[i8]);
                    f6 = fArr[i8];
                } else if (c10 != 'a') {
                    if (c10 == 'c') {
                        fArr = fArr3;
                        i8 = i13;
                        int i23 = i8 + 2;
                        int i24 = i8 + 3;
                        int i25 = i8 + 4;
                        int i26 = i8 + 5;
                        path2.rCubicTo(fArr[i8], fArr[i8 + 1], fArr[i23], fArr[i24], fArr[i25], fArr[i26]);
                        float f35 = fArr[i23] + f25;
                        float f36 = fArr[i24] + f26;
                        f25 += fArr[i25];
                        f26 += fArr[i26];
                        f19 = f35;
                        f20 = f36;
                    } else if (c10 != 'h') {
                        if (c10 != 'q') {
                            if (c10 != 'v') {
                                if (c10 == 'L') {
                                    fArr = fArr3;
                                    i8 = i13;
                                    int i27 = i8 + 1;
                                    path2.lineTo(fArr[i8], fArr[i27]);
                                    f8 = fArr[i8];
                                    f6 = fArr[i27];
                                } else if (c10 == 'M') {
                                    fArr = fArr3;
                                    i8 = i13;
                                    f8 = fArr[i8];
                                    f6 = fArr[i8 + 1];
                                    if (i8 > 0) {
                                        path2.lineTo(f8, f6);
                                    } else {
                                        path2.moveTo(f8, f6);
                                        f23 = f8;
                                        f24 = f6;
                                    }
                                } else if (c10 != 'S') {
                                    if (c10 == 'T') {
                                        fArr = fArr3;
                                        i8 = i13;
                                        if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                            f25 = (f25 * 2.0f) - f19;
                                            f26 = (f26 * 2.0f) - f20;
                                        }
                                        int i28 = i8 + 1;
                                        path2.quadTo(f25, f26, fArr[i8], fArr[i28]);
                                        f8 = fArr[i8];
                                        f6 = fArr[i28];
                                        eVar = eVar3;
                                        f19 = f25;
                                        f20 = f26;
                                    } else if (c10 == 'l') {
                                        fArr = fArr3;
                                        i8 = i13;
                                        int i29 = i8 + 1;
                                        path2.rLineTo(fArr[i8], fArr[i29]);
                                        f25 += fArr[i8];
                                        f12 = fArr[i29];
                                    } else if (c10 == 'm') {
                                        fArr = fArr3;
                                        i8 = i13;
                                        float f37 = fArr[i8];
                                        f25 += f37;
                                        float f38 = fArr[i8 + 1];
                                        f26 += f38;
                                        if (i8 > 0) {
                                            path2.rLineTo(f37, f38);
                                        } else {
                                            path2.rMoveTo(f37, f38);
                                            eVar = eVar3;
                                            f8 = f25;
                                            f23 = f8;
                                            f6 = f26;
                                            f24 = f6;
                                        }
                                    } else if (c10 != 's') {
                                        if (c10 != 't') {
                                            fArr = fArr3;
                                            i8 = i13;
                                            eVar = eVar3;
                                            f8 = f25;
                                        } else {
                                            if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                                f15 = f25 - f19;
                                                f16 = f26 - f20;
                                            } else {
                                                f16 = 0.0f;
                                                f15 = 0.0f;
                                            }
                                            int i30 = i13 + 1;
                                            path2.rQuadTo(f15, f16, fArr3[i13], fArr3[i30]);
                                            float f39 = f15 + f25;
                                            float f40 = f16 + f26;
                                            float f41 = f25 + fArr3[i13];
                                            f26 += fArr3[i30];
                                            f20 = f40;
                                            fArr = fArr3;
                                            i8 = i13;
                                            eVar = eVar3;
                                            f8 = f41;
                                            f19 = f39;
                                        }
                                        f6 = f26;
                                    } else {
                                        if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                            f13 = f26 - f20;
                                            f14 = f25 - f19;
                                        } else {
                                            f14 = 0.0f;
                                            f13 = 0.0f;
                                        }
                                        int i31 = i13;
                                        int i32 = i31 + 1;
                                        int i33 = i31 + 2;
                                        int i34 = i31 + 3;
                                        fArr = fArr3;
                                        i8 = i31;
                                        path2.rCubicTo(f14, f13, fArr3[i31], fArr3[i32], fArr3[i33], fArr3[i34]);
                                        f9 = fArr[i8] + f25;
                                        f10 = fArr[i32] + f26;
                                        f25 += fArr[i33];
                                        f11 = fArr[i34];
                                    }
                                    i9 = i11;
                                    c8 = c10;
                                } else {
                                    fArr = fArr3;
                                    i8 = i13;
                                    if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                        f25 = (f25 * 2.0f) - f19;
                                        f26 = (f26 * 2.0f) - f20;
                                    }
                                    float f42 = f25;
                                    float f43 = f26;
                                    int i35 = i8 + 1;
                                    int i36 = i8 + 2;
                                    int i37 = i8 + 3;
                                    path2.cubicTo(f42, f43, fArr[i8], fArr[i35], fArr[i36], fArr[i37]);
                                    f19 = fArr[i8];
                                    f20 = fArr[i35];
                                    f8 = fArr[i36];
                                    f6 = fArr[i37];
                                }
                                i9 = i11;
                                eVar = eVar3;
                                c8 = c10;
                            } else {
                                fArr = fArr3;
                                i8 = i13;
                                path2.rLineTo(0.0f, fArr[i8]);
                                f12 = fArr[i8];
                            }
                            f26 += f12;
                        } else {
                            fArr = fArr3;
                            i8 = i13;
                            int i38 = i8 + 1;
                            int i39 = i8 + 2;
                            int i40 = i8 + 3;
                            path2.rQuadTo(fArr[i8], fArr[i38], fArr[i39], fArr[i40]);
                            f9 = fArr[i8] + f25;
                            f10 = fArr[i38] + f26;
                            f25 += fArr[i39];
                            f11 = fArr[i40];
                        }
                        f26 += f11;
                        f19 = f9;
                        f20 = f10;
                    } else {
                        fArr = fArr3;
                        i8 = i13;
                        path2.rLineTo(fArr[i8], 0.0f);
                        f25 += fArr[i8];
                    }
                    eVar = eVar3;
                    f8 = f25;
                    f6 = f26;
                    i9 = i11;
                    c8 = c10;
                } else {
                    fArr = fArr3;
                    i8 = i13;
                    int i41 = i8 + 5;
                    float f44 = fArr[i41] + f25;
                    int i42 = i8 + 6;
                    float f45 = fArr[i42] + f26;
                    float f46 = fArr[i8];
                    float f47 = fArr[i8 + 1];
                    float f48 = fArr[i8 + 2];
                    if (fArr[i8 + 3] != 0.0f) {
                        eVar2 = eVar3;
                        z3 = 1;
                    } else {
                        eVar2 = eVar3;
                        z3 = i12;
                    }
                    eVar = eVar2;
                    float f49 = f25;
                    c8 = c10;
                    float f50 = f26;
                    i9 = i11;
                    a(path, f49, f50, f44, f45, f46, f47, f48, z3, fArr[i8 + 4] != 0.0f ? 1 : i12);
                    f8 = f49 + fArr[i41];
                    f6 = f50 + fArr[i42];
                    f19 = f8;
                    f20 = f6;
                }
                i13 = i8 + i;
                path2 = path;
                eVar3 = eVar;
                c10 = c8;
                i11 = i9;
                f25 = f8;
                f26 = f6;
                c9 = c10;
                fArr3 = fArr;
            }
            fArr2[i12] = f25;
            fArr2[1] = f26;
            fArr2[2] = f19;
            fArr2[3] = f20;
            fArr2[4] = f23;
            fArr2[5] = f24;
            c9 = eVar3.f3426a;
            i11++;
            eVarArr2 = eVarArr;
            path2 = path;
            i10 = i12;
        }
    }
}

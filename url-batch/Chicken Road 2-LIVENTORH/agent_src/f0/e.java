package f0;

import a.y;
import android.graphics.Path;
import android.util.Log;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public char f1270a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f1271b;

    public e(char c4, float[] fArr) {
        this.f1270a = c4;
        this.f1271b = fArr;
    }

    public static void a(Path path, float f2, float f4, float f5, float f6, float f7, float f8, float f9, boolean z3, boolean z4) {
        double d;
        double d3;
        double radians = Math.toRadians(f9);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d4 = f2;
        double d5 = f4;
        double d6 = f7;
        double d7 = ((d5 * sin) + (d4 * cos)) / d6;
        double d8 = f8;
        double d9 = ((d5 * cos) + ((-f2) * sin)) / d8;
        double d10 = f6;
        double d11 = ((d10 * sin) + (f5 * cos)) / d6;
        double d12 = ((d10 * cos) + ((-f5) * sin)) / d8;
        double d13 = d7 - d11;
        double d14 = d9 - d12;
        double d15 = (d7 + d11) / 2.0d;
        double d16 = (d9 + d12) / 2.0d;
        double d17 = (d14 * d14) + (d13 * d13);
        if (d17 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d18 = (1.0d / d17) - 0.25d;
        if (d18 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d17);
            float sqrt = (float) (Math.sqrt(d17) / 1.99999d);
            a(path, f2, f4, f5, f6, f7 * sqrt, sqrt * f8, f9, z3, z4);
            return;
        }
        double sqrt2 = Math.sqrt(d18);
        double d19 = sqrt2 * d13;
        double d20 = sqrt2 * d14;
        if (z3 == z4) {
            d = d15 - d20;
            d3 = d16 + d19;
        } else {
            d = d15 + d20;
            d3 = d16 - d19;
        }
        double atan2 = Math.atan2(d9 - d3, d7 - d);
        double atan22 = Math.atan2(d12 - d3, d11 - d) - atan2;
        if (z4 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d21 = d * d6;
        double d22 = d3 * d8;
        double d23 = (d21 * cos) - (d22 * sin);
        double d24 = (d22 * cos) + (d21 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d25 = -d6;
        double d26 = d25 * cos2;
        double d27 = d8 * sin2;
        double d28 = (d26 * sin3) - (d27 * cos3);
        double d29 = d25 * sin2;
        double d30 = d8 * cos2;
        double d31 = atan22 / ceil;
        double d32 = (cos3 * d30) + (sin3 * d29);
        double d33 = d4;
        double d34 = d5;
        int i = 0;
        double d35 = atan2;
        while (i < ceil) {
            double d36 = d35 + d31;
            double sin4 = Math.sin(d36);
            double cos4 = Math.cos(d36);
            int i4 = ceil;
            double d37 = (((d6 * cos2) * cos4) + d23) - (d27 * sin4);
            double d38 = (d30 * sin4) + (d6 * sin2 * cos4) + d24;
            double d39 = (d26 * sin4) - (d27 * cos4);
            double d40 = (cos4 * d30) + (sin4 * d29);
            double d41 = d36 - d35;
            double tan = Math.tan(d41 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d41)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d28 * sqrt3) + d33), (float) ((d32 * sqrt3) + d34), (float) (d37 - (sqrt3 * d39)), (float) (d38 - (sqrt3 * d40)), (float) d37, (float) d38);
            i++;
            d34 = d38;
            cos2 = cos2;
            d29 = d29;
            d35 = d36;
            d32 = d40;
            d33 = d37;
            ceil = i4;
            d28 = d39;
            d31 = d31;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(e[] eVarArr, Path path) {
        int i;
        float[] fArr;
        int i4;
        e eVar;
        int i5;
        char c4;
        float f2;
        float f4;
        e eVar2;
        boolean z3;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        e[] eVarArr2 = eVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = eVarArr2.length;
        int i6 = 0;
        int i7 = 0;
        char c5 = 'm';
        while (i7 < length) {
            e eVar3 = eVarArr2[i7];
            char c6 = eVar3.f1270a;
            float[] fArr3 = eVar3.f1271b;
            float f13 = fArr2[i6];
            float f14 = fArr2[1];
            float f15 = fArr2[2];
            float f16 = fArr2[3];
            float f17 = fArr2[4];
            int i8 = i6;
            float f18 = fArr2[5];
            switch (c6) {
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
                    path2.moveTo(f17, f18);
                    f13 = f17;
                    f15 = f13;
                    f14 = f18;
                    f16 = f14;
                default:
                    i = 2;
                    break;
            }
            float f19 = f17;
            float f20 = f18;
            float f21 = f13;
            float f22 = f14;
            int i9 = i8;
            while (i9 < fArr3.length) {
                if (c6 == 'A') {
                    fArr = fArr3;
                    i4 = i9;
                    eVar = eVar3;
                    float f23 = f21;
                    float f24 = f22;
                    i5 = i7;
                    c4 = c6;
                    int i10 = i4 + 5;
                    int i11 = i4 + 6;
                    a(path, f23, f24, fArr[i10], fArr[i11], fArr[i4], fArr[i4 + 1], fArr[i4 + 2], fArr[i4 + 3] != 0.0f ? 1 : i8, fArr[i4 + 4] != 0.0f ? 1 : i8);
                    f15 = fArr[i10];
                    f2 = fArr[i11];
                    f16 = f2;
                    f4 = f15;
                } else if (c6 == 'C') {
                    fArr = fArr3;
                    i4 = i9;
                    i5 = i7;
                    eVar = eVar3;
                    c4 = c6;
                    int i12 = i4 + 2;
                    int i13 = i4 + 3;
                    int i14 = i4 + 4;
                    int i15 = i4 + 5;
                    path2.cubicTo(fArr[i4], fArr[i4 + 1], fArr[i12], fArr[i13], fArr[i14], fArr[i15]);
                    float f25 = fArr[i14];
                    float f26 = fArr[i15];
                    f15 = fArr[i12];
                    f16 = fArr[i13];
                    f2 = f26;
                    f4 = f25;
                } else if (c6 == 'H') {
                    fArr = fArr3;
                    i4 = i9;
                    eVar = eVar3;
                    c4 = c6;
                    f2 = f22;
                    i5 = i7;
                    path2.lineTo(fArr[i4], f2);
                    f4 = fArr[i4];
                } else if (c6 == 'Q') {
                    fArr = fArr3;
                    i4 = i9;
                    i5 = i7;
                    eVar = eVar3;
                    c4 = c6;
                    int i16 = i4 + 1;
                    int i17 = i4 + 2;
                    int i18 = i4 + 3;
                    path2.quadTo(fArr[i4], fArr[i16], fArr[i17], fArr[i18]);
                    float f27 = fArr[i4];
                    float f28 = fArr[i16];
                    float f29 = fArr[i17];
                    float f30 = fArr[i18];
                    f15 = f27;
                    f16 = f28;
                    f4 = f29;
                    f2 = f30;
                } else if (c6 == 'V') {
                    fArr = fArr3;
                    i4 = i9;
                    i5 = i7;
                    eVar = eVar3;
                    f4 = f21;
                    c4 = c6;
                    path2.lineTo(f4, fArr[i4]);
                    f2 = fArr[i4];
                } else if (c6 != 'a') {
                    if (c6 == 'c') {
                        fArr = fArr3;
                        i4 = i9;
                        int i19 = i4 + 2;
                        int i20 = i4 + 3;
                        int i21 = i4 + 4;
                        int i22 = i4 + 5;
                        path2.rCubicTo(fArr[i4], fArr[i4 + 1], fArr[i19], fArr[i20], fArr[i21], fArr[i22]);
                        float f31 = fArr[i19] + f21;
                        float f32 = fArr[i20] + f22;
                        f21 += fArr[i21];
                        f22 += fArr[i22];
                        f15 = f31;
                        f16 = f32;
                    } else if (c6 != 'h') {
                        if (c6 != 'q') {
                            if (c6 != 'v') {
                                if (c6 == 'L') {
                                    fArr = fArr3;
                                    i4 = i9;
                                    int i23 = i4 + 1;
                                    path2.lineTo(fArr[i4], fArr[i23]);
                                    f4 = fArr[i4];
                                    f2 = fArr[i23];
                                } else if (c6 == 'M') {
                                    fArr = fArr3;
                                    i4 = i9;
                                    f4 = fArr[i4];
                                    f2 = fArr[i4 + 1];
                                    if (i4 > 0) {
                                        path2.lineTo(f4, f2);
                                    } else {
                                        path2.moveTo(f4, f2);
                                        f19 = f4;
                                        f20 = f2;
                                    }
                                } else if (c6 != 'S') {
                                    if (c6 == 'T') {
                                        fArr = fArr3;
                                        i4 = i9;
                                        if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                            f21 = (f21 * 2.0f) - f15;
                                            f22 = (f22 * 2.0f) - f16;
                                        }
                                        int i24 = i4 + 1;
                                        path2.quadTo(f21, f22, fArr[i4], fArr[i24]);
                                        f4 = fArr[i4];
                                        f2 = fArr[i24];
                                        eVar = eVar3;
                                        f15 = f21;
                                        f16 = f22;
                                    } else if (c6 == 'l') {
                                        fArr = fArr3;
                                        i4 = i9;
                                        int i25 = i4 + 1;
                                        path2.rLineTo(fArr[i4], fArr[i25]);
                                        f21 += fArr[i4];
                                        f8 = fArr[i25];
                                    } else if (c6 == 'm') {
                                        fArr = fArr3;
                                        i4 = i9;
                                        float f33 = fArr[i4];
                                        f21 += f33;
                                        float f34 = fArr[i4 + 1];
                                        f22 += f34;
                                        if (i4 > 0) {
                                            path2.rLineTo(f33, f34);
                                        } else {
                                            path2.rMoveTo(f33, f34);
                                            eVar = eVar3;
                                            f4 = f21;
                                            f19 = f4;
                                            f2 = f22;
                                            f20 = f2;
                                        }
                                    } else if (c6 != 's') {
                                        if (c6 != 't') {
                                            fArr = fArr3;
                                            i4 = i9;
                                            eVar = eVar3;
                                            f4 = f21;
                                        } else {
                                            if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                f11 = f21 - f15;
                                                f12 = f22 - f16;
                                            } else {
                                                f12 = 0.0f;
                                                f11 = 0.0f;
                                            }
                                            int i26 = i9 + 1;
                                            path2.rQuadTo(f11, f12, fArr3[i9], fArr3[i26]);
                                            float f35 = f11 + f21;
                                            float f36 = f12 + f22;
                                            float f37 = f21 + fArr3[i9];
                                            f22 += fArr3[i26];
                                            f16 = f36;
                                            fArr = fArr3;
                                            i4 = i9;
                                            eVar = eVar3;
                                            f4 = f37;
                                            f15 = f35;
                                        }
                                        f2 = f22;
                                    } else {
                                        if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                            f9 = f22 - f16;
                                            f10 = f21 - f15;
                                        } else {
                                            f10 = 0.0f;
                                            f9 = 0.0f;
                                        }
                                        int i27 = i9;
                                        int i28 = i27 + 1;
                                        int i29 = i27 + 2;
                                        int i30 = i27 + 3;
                                        fArr = fArr3;
                                        i4 = i27;
                                        path2.rCubicTo(f10, f9, fArr3[i27], fArr3[i28], fArr3[i29], fArr3[i30]);
                                        f5 = fArr[i4] + f21;
                                        f6 = fArr[i28] + f22;
                                        f21 += fArr[i29];
                                        f7 = fArr[i30];
                                    }
                                    i5 = i7;
                                    c4 = c6;
                                } else {
                                    fArr = fArr3;
                                    i4 = i9;
                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                        f21 = (f21 * 2.0f) - f15;
                                        f22 = (f22 * 2.0f) - f16;
                                    }
                                    float f38 = f21;
                                    float f39 = f22;
                                    int i31 = i4 + 1;
                                    int i32 = i4 + 2;
                                    int i33 = i4 + 3;
                                    path2.cubicTo(f38, f39, fArr[i4], fArr[i31], fArr[i32], fArr[i33]);
                                    f15 = fArr[i4];
                                    f16 = fArr[i31];
                                    f4 = fArr[i32];
                                    f2 = fArr[i33];
                                }
                                i5 = i7;
                                eVar = eVar3;
                                c4 = c6;
                            } else {
                                fArr = fArr3;
                                i4 = i9;
                                path2.rLineTo(0.0f, fArr[i4]);
                                f8 = fArr[i4];
                            }
                            f22 += f8;
                        } else {
                            fArr = fArr3;
                            i4 = i9;
                            int i34 = i4 + 1;
                            int i35 = i4 + 2;
                            int i36 = i4 + 3;
                            path2.rQuadTo(fArr[i4], fArr[i34], fArr[i35], fArr[i36]);
                            f5 = fArr[i4] + f21;
                            f6 = fArr[i34] + f22;
                            f21 += fArr[i35];
                            f7 = fArr[i36];
                        }
                        f22 += f7;
                        f15 = f5;
                        f16 = f6;
                    } else {
                        fArr = fArr3;
                        i4 = i9;
                        path2.rLineTo(fArr[i4], 0.0f);
                        f21 += fArr[i4];
                    }
                    eVar = eVar3;
                    f4 = f21;
                    f2 = f22;
                    i5 = i7;
                    c4 = c6;
                } else {
                    fArr = fArr3;
                    i4 = i9;
                    int i37 = i4 + 5;
                    float f40 = fArr[i37] + f21;
                    int i38 = i4 + 6;
                    float f41 = fArr[i38] + f22;
                    float f42 = fArr[i4];
                    float f43 = fArr[i4 + 1];
                    float f44 = fArr[i4 + 2];
                    if (fArr[i4 + 3] != 0.0f) {
                        eVar2 = eVar3;
                        z3 = 1;
                    } else {
                        eVar2 = eVar3;
                        z3 = i8;
                    }
                    eVar = eVar2;
                    float f45 = f21;
                    c4 = c6;
                    float f46 = f22;
                    i5 = i7;
                    a(path, f45, f46, f40, f41, f42, f43, f44, z3, fArr[i4 + 4] != 0.0f ? 1 : i8);
                    f4 = f45 + fArr[i37];
                    f2 = f46 + fArr[i38];
                    f15 = f4;
                    f16 = f2;
                }
                i9 = i4 + i;
                path2 = path;
                eVar3 = eVar;
                c6 = c4;
                i7 = i5;
                f21 = f4;
                f22 = f2;
                c5 = c6;
                fArr3 = fArr;
            }
            fArr2[i8] = f21;
            fArr2[1] = f22;
            fArr2[2] = f15;
            fArr2[3] = f16;
            fArr2[4] = f19;
            fArr2[5] = f20;
            c5 = eVar3.f1270a;
            i7++;
            eVarArr2 = eVarArr;
            path2 = path;
            i6 = i8;
        }
    }

    public e(e eVar) {
        this.f1270a = eVar.f1270a;
        float[] fArr = eVar.f1271b;
        this.f1271b = y.n(fArr, fArr.length);
    }
}

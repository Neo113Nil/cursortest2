package f0;

import android.graphics.Path;
import android.util.Log;
import b4.l;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public char f1418a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f1419b;

    public d(char c5, float[] fArr) {
        this.f1418a = c5;
        this.f1419b = fArr;
    }

    public static void a(Path path, float f5, float f6, float f7, float f8, float f9, float f10, float f11, boolean z4, boolean z5) {
        double d;
        double d5;
        double radians = Math.toRadians(f11);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d6 = f5;
        double d7 = f6;
        double d8 = f9;
        double d9 = ((d7 * sin) + (d6 * cos)) / d8;
        double d10 = f10;
        double d11 = ((d7 * cos) + ((-f5) * sin)) / d10;
        double d12 = f8;
        double d13 = ((d12 * sin) + (f7 * cos)) / d8;
        double d14 = ((d12 * cos) + ((-f7) * sin)) / d10;
        double d15 = d9 - d13;
        double d16 = d11 - d14;
        double d17 = (d9 + d13) / 2.0d;
        double d18 = (d11 + d14) / 2.0d;
        double d19 = (d16 * d16) + (d15 * d15);
        if (d19 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d19);
            float sqrt = (float) (Math.sqrt(d19) / 1.99999d);
            a(path, f5, f6, f7, f8, f9 * sqrt, sqrt * f10, f11, z4, z5);
            return;
        }
        double sqrt2 = Math.sqrt(d20);
        double d21 = sqrt2 * d15;
        double d22 = sqrt2 * d16;
        if (z4 == z5) {
            d = d17 - d22;
            d5 = d18 + d21;
        } else {
            d = d17 + d22;
            d5 = d18 - d21;
        }
        double atan2 = Math.atan2(d11 - d5, d9 - d);
        double atan22 = Math.atan2(d14 - d5, d13 - d) - atan2;
        if (z5 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d23 = d * d8;
        double d24 = d5 * d10;
        double d25 = (d23 * cos) - (d24 * sin);
        double d26 = (d24 * cos) + (d23 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d27 = -d8;
        double d28 = d27 * cos2;
        double d29 = d10 * sin2;
        double d30 = (d28 * sin3) - (d29 * cos3);
        double d31 = d27 * sin2;
        double d32 = d10 * cos2;
        double d33 = atan22 / ceil;
        double d34 = (cos3 * d32) + (sin3 * d31);
        double d35 = d6;
        double d36 = d7;
        int i = 0;
        double d37 = atan2;
        while (i < ceil) {
            double d38 = d37 + d33;
            double sin4 = Math.sin(d38);
            double cos4 = Math.cos(d38);
            int i4 = ceil;
            double d39 = (((d8 * cos2) * cos4) + d25) - (d29 * sin4);
            double d40 = (d32 * sin4) + (d8 * sin2 * cos4) + d26;
            double d41 = (d28 * sin4) - (d29 * cos4);
            double d42 = (cos4 * d32) + (sin4 * d31);
            double d43 = d38 - d37;
            double tan = Math.tan(d43 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d43)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d30 * sqrt3) + d35), (float) ((d34 * sqrt3) + d36), (float) (d39 - (sqrt3 * d41)), (float) (d40 - (sqrt3 * d42)), (float) d39, (float) d40);
            i++;
            d36 = d40;
            cos2 = cos2;
            d31 = d31;
            d37 = d38;
            d34 = d42;
            d35 = d39;
            ceil = i4;
            d30 = d41;
            d33 = d33;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(d[] dVarArr, Path path) {
        int i;
        float[] fArr;
        int i4;
        d dVar;
        int i5;
        char c5;
        float f5;
        float f6;
        d dVar2;
        boolean z4;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        d[] dVarArr2 = dVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = dVarArr2.length;
        int i6 = 0;
        int i7 = 0;
        char c6 = 'm';
        while (i7 < length) {
            d dVar3 = dVarArr2[i7];
            char c7 = dVar3.f1418a;
            float[] fArr3 = dVar3.f1419b;
            float f15 = fArr2[i6];
            float f16 = fArr2[1];
            float f17 = fArr2[2];
            float f18 = fArr2[3];
            float f19 = fArr2[4];
            int i8 = i6;
            float f20 = fArr2[5];
            switch (c7) {
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
                    path2.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                default:
                    i = 2;
                    break;
            }
            float f21 = f19;
            float f22 = f20;
            float f23 = f15;
            float f24 = f16;
            int i9 = i8;
            while (i9 < fArr3.length) {
                if (c7 == 'A') {
                    fArr = fArr3;
                    i4 = i9;
                    dVar = dVar3;
                    float f25 = f23;
                    float f26 = f24;
                    i5 = i7;
                    c5 = c7;
                    int i10 = i4 + 5;
                    int i11 = i4 + 6;
                    a(path, f25, f26, fArr[i10], fArr[i11], fArr[i4], fArr[i4 + 1], fArr[i4 + 2], fArr[i4 + 3] != 0.0f ? 1 : i8, fArr[i4 + 4] != 0.0f ? 1 : i8);
                    f17 = fArr[i10];
                    f5 = fArr[i11];
                    f18 = f5;
                    f6 = f17;
                } else if (c7 == 'C') {
                    fArr = fArr3;
                    i4 = i9;
                    i5 = i7;
                    dVar = dVar3;
                    c5 = c7;
                    int i12 = i4 + 2;
                    int i13 = i4 + 3;
                    int i14 = i4 + 4;
                    int i15 = i4 + 5;
                    path2.cubicTo(fArr[i4], fArr[i4 + 1], fArr[i12], fArr[i13], fArr[i14], fArr[i15]);
                    float f27 = fArr[i14];
                    float f28 = fArr[i15];
                    f17 = fArr[i12];
                    f18 = fArr[i13];
                    f5 = f28;
                    f6 = f27;
                } else if (c7 == 'H') {
                    fArr = fArr3;
                    i4 = i9;
                    dVar = dVar3;
                    c5 = c7;
                    f5 = f24;
                    i5 = i7;
                    path2.lineTo(fArr[i4], f5);
                    f6 = fArr[i4];
                } else if (c7 == 'Q') {
                    fArr = fArr3;
                    i4 = i9;
                    i5 = i7;
                    dVar = dVar3;
                    c5 = c7;
                    int i16 = i4 + 1;
                    int i17 = i4 + 2;
                    int i18 = i4 + 3;
                    path2.quadTo(fArr[i4], fArr[i16], fArr[i17], fArr[i18]);
                    float f29 = fArr[i4];
                    float f30 = fArr[i16];
                    float f31 = fArr[i17];
                    float f32 = fArr[i18];
                    f17 = f29;
                    f18 = f30;
                    f6 = f31;
                    f5 = f32;
                } else if (c7 == 'V') {
                    fArr = fArr3;
                    i4 = i9;
                    i5 = i7;
                    dVar = dVar3;
                    f6 = f23;
                    c5 = c7;
                    path2.lineTo(f6, fArr[i4]);
                    f5 = fArr[i4];
                } else if (c7 != 'a') {
                    if (c7 == 'c') {
                        fArr = fArr3;
                        i4 = i9;
                        int i19 = i4 + 2;
                        int i20 = i4 + 3;
                        int i21 = i4 + 4;
                        int i22 = i4 + 5;
                        path2.rCubicTo(fArr[i4], fArr[i4 + 1], fArr[i19], fArr[i20], fArr[i21], fArr[i22]);
                        float f33 = fArr[i19] + f23;
                        float f34 = fArr[i20] + f24;
                        f23 += fArr[i21];
                        f24 += fArr[i22];
                        f17 = f33;
                        f18 = f34;
                    } else if (c7 != 'h') {
                        if (c7 != 'q') {
                            if (c7 != 'v') {
                                if (c7 == 'L') {
                                    fArr = fArr3;
                                    i4 = i9;
                                    int i23 = i4 + 1;
                                    path2.lineTo(fArr[i4], fArr[i23]);
                                    f6 = fArr[i4];
                                    f5 = fArr[i23];
                                } else if (c7 == 'M') {
                                    fArr = fArr3;
                                    i4 = i9;
                                    f6 = fArr[i4];
                                    f5 = fArr[i4 + 1];
                                    if (i4 > 0) {
                                        path2.lineTo(f6, f5);
                                    } else {
                                        path2.moveTo(f6, f5);
                                        f21 = f6;
                                        f22 = f5;
                                    }
                                } else if (c7 != 'S') {
                                    if (c7 == 'T') {
                                        fArr = fArr3;
                                        i4 = i9;
                                        if (c6 == 'q' || c6 == 't' || c6 == 'Q' || c6 == 'T') {
                                            f23 = (f23 * 2.0f) - f17;
                                            f24 = (f24 * 2.0f) - f18;
                                        }
                                        int i24 = i4 + 1;
                                        path2.quadTo(f23, f24, fArr[i4], fArr[i24]);
                                        f6 = fArr[i4];
                                        f5 = fArr[i24];
                                        dVar = dVar3;
                                        f17 = f23;
                                        f18 = f24;
                                    } else if (c7 == 'l') {
                                        fArr = fArr3;
                                        i4 = i9;
                                        int i25 = i4 + 1;
                                        path2.rLineTo(fArr[i4], fArr[i25]);
                                        f23 += fArr[i4];
                                        f10 = fArr[i25];
                                    } else if (c7 == 'm') {
                                        fArr = fArr3;
                                        i4 = i9;
                                        float f35 = fArr[i4];
                                        f23 += f35;
                                        float f36 = fArr[i4 + 1];
                                        f24 += f36;
                                        if (i4 > 0) {
                                            path2.rLineTo(f35, f36);
                                        } else {
                                            path2.rMoveTo(f35, f36);
                                            dVar = dVar3;
                                            f6 = f23;
                                            f21 = f6;
                                            f5 = f24;
                                            f22 = f5;
                                        }
                                    } else if (c7 != 's') {
                                        if (c7 != 't') {
                                            fArr = fArr3;
                                            i4 = i9;
                                            dVar = dVar3;
                                            f6 = f23;
                                        } else {
                                            if (c6 == 'q' || c6 == 't' || c6 == 'Q' || c6 == 'T') {
                                                f13 = f23 - f17;
                                                f14 = f24 - f18;
                                            } else {
                                                f14 = 0.0f;
                                                f13 = 0.0f;
                                            }
                                            int i26 = i9 + 1;
                                            path2.rQuadTo(f13, f14, fArr3[i9], fArr3[i26]);
                                            float f37 = f13 + f23;
                                            float f38 = f14 + f24;
                                            float f39 = f23 + fArr3[i9];
                                            f24 += fArr3[i26];
                                            f18 = f38;
                                            fArr = fArr3;
                                            i4 = i9;
                                            dVar = dVar3;
                                            f6 = f39;
                                            f17 = f37;
                                        }
                                        f5 = f24;
                                    } else {
                                        if (c6 == 'c' || c6 == 's' || c6 == 'C' || c6 == 'S') {
                                            f11 = f24 - f18;
                                            f12 = f23 - f17;
                                        } else {
                                            f12 = 0.0f;
                                            f11 = 0.0f;
                                        }
                                        int i27 = i9;
                                        int i28 = i27 + 1;
                                        int i29 = i27 + 2;
                                        int i30 = i27 + 3;
                                        fArr = fArr3;
                                        i4 = i27;
                                        path2.rCubicTo(f12, f11, fArr3[i27], fArr3[i28], fArr3[i29], fArr3[i30]);
                                        f7 = fArr[i4] + f23;
                                        f8 = fArr[i28] + f24;
                                        f23 += fArr[i29];
                                        f9 = fArr[i30];
                                    }
                                    i5 = i7;
                                    c5 = c7;
                                } else {
                                    fArr = fArr3;
                                    i4 = i9;
                                    if (c6 == 'c' || c6 == 's' || c6 == 'C' || c6 == 'S') {
                                        f23 = (f23 * 2.0f) - f17;
                                        f24 = (f24 * 2.0f) - f18;
                                    }
                                    float f40 = f23;
                                    float f41 = f24;
                                    int i31 = i4 + 1;
                                    int i32 = i4 + 2;
                                    int i33 = i4 + 3;
                                    path2.cubicTo(f40, f41, fArr[i4], fArr[i31], fArr[i32], fArr[i33]);
                                    f17 = fArr[i4];
                                    f18 = fArr[i31];
                                    f6 = fArr[i32];
                                    f5 = fArr[i33];
                                }
                                i5 = i7;
                                dVar = dVar3;
                                c5 = c7;
                            } else {
                                fArr = fArr3;
                                i4 = i9;
                                path2.rLineTo(0.0f, fArr[i4]);
                                f10 = fArr[i4];
                            }
                            f24 += f10;
                        } else {
                            fArr = fArr3;
                            i4 = i9;
                            int i34 = i4 + 1;
                            int i35 = i4 + 2;
                            int i36 = i4 + 3;
                            path2.rQuadTo(fArr[i4], fArr[i34], fArr[i35], fArr[i36]);
                            f7 = fArr[i4] + f23;
                            f8 = fArr[i34] + f24;
                            f23 += fArr[i35];
                            f9 = fArr[i36];
                        }
                        f24 += f9;
                        f17 = f7;
                        f18 = f8;
                    } else {
                        fArr = fArr3;
                        i4 = i9;
                        path2.rLineTo(fArr[i4], 0.0f);
                        f23 += fArr[i4];
                    }
                    dVar = dVar3;
                    f6 = f23;
                    f5 = f24;
                    i5 = i7;
                    c5 = c7;
                } else {
                    fArr = fArr3;
                    i4 = i9;
                    int i37 = i4 + 5;
                    float f42 = fArr[i37] + f23;
                    int i38 = i4 + 6;
                    float f43 = fArr[i38] + f24;
                    float f44 = fArr[i4];
                    float f45 = fArr[i4 + 1];
                    float f46 = fArr[i4 + 2];
                    if (fArr[i4 + 3] != 0.0f) {
                        dVar2 = dVar3;
                        z4 = 1;
                    } else {
                        dVar2 = dVar3;
                        z4 = i8;
                    }
                    dVar = dVar2;
                    float f47 = f23;
                    c5 = c7;
                    float f48 = f24;
                    i5 = i7;
                    a(path, f47, f48, f42, f43, f44, f45, f46, z4, fArr[i4 + 4] != 0.0f ? 1 : i8);
                    f6 = f47 + fArr[i37];
                    f5 = f48 + fArr[i38];
                    f17 = f6;
                    f18 = f5;
                }
                i9 = i4 + i;
                path2 = path;
                dVar3 = dVar;
                c7 = c5;
                i7 = i5;
                f23 = f6;
                f24 = f5;
                c6 = c7;
                fArr3 = fArr;
            }
            fArr2[i8] = f23;
            fArr2[1] = f24;
            fArr2[2] = f17;
            fArr2[3] = f18;
            fArr2[4] = f21;
            fArr2[5] = f22;
            c6 = dVar3.f1418a;
            i7++;
            dVarArr2 = dVarArr;
            path2 = path;
            i6 = i8;
        }
    }

    public d(d dVar) {
        this.f1418a = dVar.f1418a;
        float[] fArr = dVar.f1419b;
        this.f1419b = l.j(fArr, fArr.length);
    }
}

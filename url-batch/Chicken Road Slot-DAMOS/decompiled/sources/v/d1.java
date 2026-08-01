package v;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9778a = 0;

    static {
        char c10;
        int i3;
        float[] fArr;
        s7.c0[] c0VarArr;
        char c11;
        int i10;
        boolean z10;
        float[][] fArr2 = {new float[2], new float[2]};
        int i11 = new int[2][0];
        char c12 = 3;
        int i12 = 1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2 || i11 == 3) {
                    c10 = 2;
                } else if (i11 == 4) {
                    c10 = 4;
                } else if (i11 == 5) {
                    c10 = 5;
                }
            }
            c10 = 1;
        } else {
            c10 = 3;
        }
        float[] fArr3 = fArr2[0];
        float[] fArr4 = fArr2[1];
        int length = (fArr3.length % 2) + (fArr3.length / 2);
        s7.c0[] c0VarArr2 = new s7.c0[length];
        int i13 = 0;
        while (i13 < length) {
            int i14 = i13 * 2;
            float f3 = fArr3[i14];
            int i15 = i14 + 1;
            float f10 = fArr3[i15];
            float f11 = fArr4[i14];
            float f12 = fArr4[i15];
            s7.c0 c0Var = new s7.c0(22);
            float f13 = f11 - f3;
            float f14 = f12 - f10;
            float[] fArr5 = new float[101];
            if (c10 != c12 && Math.abs(f13) >= 0.001f && Math.abs(f14) >= 0.001f) {
                float f15 = f10 - f12;
                float[] fArr6 = c.f9753i;
                int i16 = 90;
                float f16 = 90;
                int i17 = i12;
                float f17 = f15;
                float f18 = 0.0f;
                float f19 = 0.0f;
                while (true) {
                    i3 = i12;
                    fArr = fArr3;
                    c0VarArr = c0VarArr2;
                    c11 = c10;
                    double d10 = (float) (((i17 * 90.0d) / i16) * 0.017453292519943295d);
                    float sin = ((float) Math.sin(d10)) * f13;
                    float cos = ((float) Math.cos(d10)) * f15;
                    float f20 = cos - f17;
                    i10 = i13;
                    f18 += (float) Math.hypot(sin - f19, f20);
                    fArr6[i17] = f18;
                    if (i17 == 90) {
                        break;
                    }
                    i17++;
                    i16 = 90;
                    f19 = sin;
                    i13 = i10;
                    c10 = c11;
                    i12 = i3;
                    fArr3 = fArr;
                    f17 = cos;
                    c0VarArr2 = c0VarArr;
                }
                int i18 = i3;
                while (true) {
                    fArr6[i18] = fArr6[i18] / f18;
                    if (i18 == 90) {
                        break;
                    } else {
                        i18++;
                    }
                }
                for (int i19 = 0; i19 < 101; i19++) {
                    float f21 = i19 / 100.0f;
                    int binarySearch = Arrays.binarySearch(fArr6, 0, 91, f21);
                    if (binarySearch >= 0) {
                        fArr5[i19] = binarySearch / f16;
                    } else if (binarySearch == -1) {
                        fArr5[i19] = 0.0f;
                    } else {
                        int i20 = -binarySearch;
                        int i21 = i20 - 2;
                        float f22 = i21;
                        float f23 = fArr6[i21];
                        fArr5[i19] = (((f21 - f23) / (fArr6[i20 - 1] - f23)) + f22) / f16;
                    }
                }
                z10 = false;
            } else {
                c0VarArr = c0VarArr2;
                c11 = c10;
                i3 = i12;
                fArr = fArr3;
                i10 = i13;
                z10 = false;
                Math.hypot(f14, f13);
            }
            c0VarArr[i10] = c0Var;
            i13 = i10 + 1;
            c10 = c11;
            c0VarArr2 = c0VarArr;
            i12 = i3;
            fArr3 = fArr;
            c12 = 3;
        }
    }
}

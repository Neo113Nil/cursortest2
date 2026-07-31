package r;

import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6442a = 0;

    static {
        char c8;
        int i;
        float[] fArr;
        p.b[] bVarArr;
        char c9;
        int i8;
        boolean z3;
        float[][] fArr2 = {new float[2], new float[2]};
        int i9 = new int[2][0];
        char c10 = 3;
        int i10 = 1;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2 || i9 == 3) {
                    c8 = 2;
                } else if (i9 == 4) {
                    c8 = 4;
                } else if (i9 == 5) {
                    c8 = 5;
                }
            }
            c8 = 1;
        } else {
            c8 = 3;
        }
        float[] fArr3 = fArr2[0];
        float[] fArr4 = fArr2[1];
        int length = (fArr3.length % 2) + (fArr3.length / 2);
        p.b[] bVarArr2 = new p.b[length];
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 * 2;
            float f6 = fArr3[i12];
            int i13 = i12 + 1;
            float f8 = fArr3[i13];
            float f9 = fArr4[i12];
            float f10 = fArr4[i13];
            p.b bVar = new p.b(2);
            float f11 = f9 - f6;
            float f12 = f10 - f8;
            float[] fArr5 = new float[101];
            if (c8 != c10 && Math.abs(f11) >= 0.001f && Math.abs(f12) >= 0.001f) {
                float f13 = f8 - f10;
                float[] fArr6 = d.i;
                int i14 = 90;
                float f14 = 90;
                int i15 = i10;
                float f15 = f13;
                float f16 = 0.0f;
                float f17 = 0.0f;
                while (true) {
                    i = i10;
                    fArr = fArr3;
                    bVarArr = bVarArr2;
                    c9 = c8;
                    double radians = (float) Math.toRadians((i15 * 90.0d) / i14);
                    float sin = ((float) Math.sin(radians)) * f11;
                    float cos = ((float) Math.cos(radians)) * f13;
                    float f18 = cos - f15;
                    i8 = i11;
                    f16 += (float) Math.hypot(sin - f17, f18);
                    fArr6[i15] = f16;
                    if (i15 == 90) {
                        break;
                    }
                    i15++;
                    i14 = 90;
                    f17 = sin;
                    i11 = i8;
                    c8 = c9;
                    i10 = i;
                    fArr3 = fArr;
                    f15 = cos;
                    bVarArr2 = bVarArr;
                }
                int i16 = i;
                while (true) {
                    fArr6[i16] = fArr6[i16] / f16;
                    if (i16 == 90) {
                        break;
                    } else {
                        i16++;
                    }
                }
                for (int i17 = 0; i17 < 101; i17++) {
                    float f19 = i17 / 100.0f;
                    int binarySearch = Arrays.binarySearch(fArr6, 0, 91, f19);
                    if (binarySearch >= 0) {
                        fArr5[i17] = binarySearch / f14;
                    } else if (binarySearch == -1) {
                        fArr5[i17] = 0.0f;
                    } else {
                        int i18 = -binarySearch;
                        int i19 = i18 - 2;
                        float f20 = i19;
                        float f21 = fArr6[i19];
                        fArr5[i17] = (((f19 - f21) / (fArr6[i18 - 1] - f21)) + f20) / f14;
                    }
                }
                z3 = false;
            } else {
                bVarArr = bVarArr2;
                c9 = c8;
                i = i10;
                fArr = fArr3;
                i8 = i11;
                z3 = false;
                Math.hypot(f12, f11);
            }
            bVarArr[i8] = bVar;
            i11 = i8 + 1;
            c8 = c9;
            bVarArr2 = bVarArr;
            i10 = i;
            fArr3 = fArr;
            c10 = 3;
        }
    }
}

package k;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0736b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f7274a;

    static {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float[] fArr = new float[101];
        f7274a = fArr;
        float[] fArr2 = new float[101];
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i2 = 0; i2 < 100; i2++) {
            float f14 = i2 / 100;
            float f15 = 1.0f;
            while (true) {
                f4 = ((f15 - f12) / 2.0f) + f12;
                f5 = 1.0f - f4;
                f6 = f4 * 3.0f * f5;
                f7 = f4 * f4 * f4;
                float f16 = (((f4 * 0.35000002f) + (f5 * 0.175f)) * f6) + f7;
                if (Math.abs(f16 - f14) < 1.0E-5d) {
                    break;
                } else if (f16 > f14) {
                    f15 = f4;
                } else {
                    f12 = f4;
                }
            }
            float f17 = 0.5f;
            fArr[i2] = (((f5 * 0.5f) + f4) * f6) + f7;
            float f18 = 1.0f;
            while (true) {
                f8 = ((f18 - f13) / 2.0f) + f13;
                f9 = 1.0f - f8;
                f10 = f8 * 3.0f * f9;
                f11 = f8 * f8 * f8;
                float f19 = (((f9 * f17) + f8) * f10) + f11;
                if (Math.abs(f19 - f14) >= 1.0E-5d) {
                    if (f19 > f14) {
                        f18 = f8;
                    } else {
                        f13 = f8;
                    }
                    f17 = 0.5f;
                }
            }
            fArr2[i2] = (((f8 * 0.35000002f) + (f9 * 0.175f)) * f10) + f11;
        }
        fArr2[100] = 1.0f;
        fArr[100] = 1.0f;
    }

    public static C0735a a(float f4) {
        float f5 = 0.0f;
        float f6 = 1.0f;
        float d4 = kotlin.ranges.b.d(f4, 0.0f, 1.0f);
        float f7 = 100;
        int i2 = (int) (f7 * d4);
        if (i2 < 100) {
            float f8 = i2 / f7;
            int i4 = i2 + 1;
            float f9 = i4 / f7;
            float[] fArr = f7274a;
            float f10 = fArr[i2];
            float f11 = (fArr[i4] - f10) / (f9 - f8);
            float f12 = ((d4 - f8) * f11) + f10;
            f5 = f11;
            f6 = f12;
        }
        return new C0735a(f6, f5);
    }
}

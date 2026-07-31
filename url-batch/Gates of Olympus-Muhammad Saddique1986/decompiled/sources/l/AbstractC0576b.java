package l;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0576b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f6474a;

    static {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float[] fArr = new float[101];
        f6474a = fArr;
        float[] fArr2 = new float[101];
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (int i3 = 0; i3 < 100; i3++) {
            float f13 = i3 / 100;
            float f14 = 1.0f;
            while (true) {
                f3 = ((f14 - f11) / 2.0f) + f11;
                f4 = 1.0f - f3;
                f5 = f3 * 3.0f * f4;
                f6 = f3 * f3 * f3;
                float f15 = (((f3 * 0.35000002f) + (f4 * 0.175f)) * f5) + f6;
                if (Math.abs(f15 - f13) < 1.0E-5d) {
                    break;
                } else if (f15 > f13) {
                    f14 = f3;
                } else {
                    f11 = f3;
                }
            }
            float f16 = 0.5f;
            fArr[i3] = (((f4 * 0.5f) + f3) * f5) + f6;
            float f17 = 1.0f;
            while (true) {
                f7 = ((f17 - f12) / 2.0f) + f12;
                f8 = 1.0f - f7;
                f9 = f7 * 3.0f * f8;
                f10 = f7 * f7 * f7;
                float f18 = (((f8 * f16) + f7) * f9) + f10;
                if (Math.abs(f18 - f13) >= 1.0E-5d) {
                    if (f18 > f13) {
                        f17 = f7;
                    } else {
                        f12 = f7;
                    }
                    f16 = 0.5f;
                }
            }
            fArr2[i3] = (((f7 * 0.35000002f) + (f8 * 0.175f)) * f9) + f10;
        }
        fArr2[100] = 1.0f;
        fArr[100] = 1.0f;
    }

    public static C0575a a(float f3) {
        float f4 = 0.0f;
        float f5 = 1.0f;
        float x3 = O2.d.x(f3, 0.0f, 1.0f);
        float f6 = 100;
        int i3 = (int) (f6 * x3);
        if (i3 < 100) {
            float f7 = i3 / f6;
            int i4 = i3 + 1;
            float f8 = i4 / f6;
            float[] fArr = f6474a;
            float f9 = fArr[i3];
            float f10 = (fArr[i4] - f9) / (f8 - f7);
            float f11 = ((x3 - f7) * f10) + f9;
            f4 = f10;
            f5 = f11;
        }
        return new C0575a(f5, f4);
    }
}

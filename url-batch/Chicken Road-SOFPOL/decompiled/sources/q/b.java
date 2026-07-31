package q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f5800a;

    static {
        float f6;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float[] fArr = new float[101];
        f5800a = fArr;
        float[] fArr2 = new float[101];
        float f16 = 0.0f;
        int i = 0;
        float f17 = 0.0f;
        while (true) {
            float f18 = 1.0f;
            if (i >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f19 = i / 100;
            float f20 = 1.0f;
            while (true) {
                f6 = ((f20 - f16) / 2.0f) + f16;
                f8 = f18 - f6;
                f9 = f6 * 3.0f * f8;
                f10 = f6 * f6 * f6;
                float f21 = (((f6 * 0.35000002f) + (f8 * 0.175f)) * f9) + f10;
                f11 = f18;
                if (Math.abs(f21 - f19) < 1.0E-5d) {
                    break;
                }
                if (f21 > f19) {
                    f20 = f6;
                } else {
                    f16 = f6;
                }
                f18 = f11;
            }
            float f22 = 0.5f;
            fArr[i] = (((f8 * 0.5f) + f6) * f9) + f10;
            float f23 = f11;
            while (true) {
                f12 = ((f23 - f17) / 2.0f) + f17;
                f13 = f11 - f12;
                f14 = f12 * 3.0f * f13;
                f15 = f12 * f12 * f12;
                float f24 = (((f13 * f22) + f12) * f14) + f15;
                float f25 = f23;
                if (Math.abs(f24 - f19) >= 1.0E-5d) {
                    if (f24 > f19) {
                        f23 = f12;
                    } else {
                        f17 = f12;
                        f23 = f25;
                    }
                    f22 = 0.5f;
                }
            }
            fArr2[i] = (((f12 * 0.35000002f) + (f13 * 0.175f)) * f14) + f15;
            i++;
        }
    }

    public static a a(float f6) {
        float f8 = 0.0f;
        float f9 = 1.0f;
        float s5 = r2.o.s(f6, 0.0f, 1.0f);
        float f10 = 100;
        int i = (int) (f10 * s5);
        if (i < 100) {
            float f11 = i / f10;
            int i8 = i + 1;
            float f12 = i8 / f10;
            float[] fArr = f5800a;
            float f13 = fArr[i];
            float f14 = (fArr[i8] - f13) / (f12 - f11);
            float f15 = ((s5 - f11) * f14) + f13;
            f8 = f14;
            f9 = f15;
        }
        return new a(f9, f8);
    }
}

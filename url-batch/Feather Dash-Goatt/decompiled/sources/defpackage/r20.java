package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class r20 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile lc1 b = new lc1();
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.c(115, new s20(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.c(130, new s20(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.c(150, new s20(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.c(180, new s20(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.c(200, new s20(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.d[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        q80.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static q20 a(float f) {
        float f2;
        q20 q20Var;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        q20 q20Var2 = (q20) b.b(i);
        if (q20Var2 != null) {
            return q20Var2;
        }
        lc1 lc1Var = b;
        int o = p4.o(lc1Var.d, lc1Var.g, i);
        if (o >= 0) {
            return (q20) b.d(o);
        }
        int i2 = -(o + 1);
        int i3 = i2 - 1;
        if (i2 >= b.g) {
            s20 s20Var = new s20(new float[]{1.0f}, new float[]{f});
            b(f, s20Var);
            return s20Var;
        }
        if (i3 < 0) {
            q20Var = new s20(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = b.d[i3] / 100.0f;
            q20Var = (q20) b.d(i3);
        }
        float f3 = b.d[i2] / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, f2 == f3 ? 0.0f : (f - f2) / (f3 - f2))) * 1.0f) + 0.0f;
        q20 q20Var3 = (q20) b.d(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            float b2 = q20Var.b(f4);
            fArr2[i4] = ((q20Var3.b(f4) - b2) * max) + b2;
        }
        s20 s20Var2 = new s20(fArr, fArr2);
        b(f, s20Var2);
        return s20Var2;
    }

    public static void b(float f, s20 s20Var) {
        synchronized (c) {
            lc1 clone = b.clone();
            clone.c((int) (f * 100.0f), s20Var);
            b = clone;
        }
    }
}

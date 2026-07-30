package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class dq0 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile yn2 b = new yn2(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.e(115, new eq0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.e(130, new eq0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.e(150, new eq0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.e(180, new eq0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.e(200, new eq0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            Unit unit = Unit.a;
        }
        if ((b.d(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        j21.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static cq0 a(float f) {
        float d;
        cq0 cq0Var;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        cq0 cq0Var2 = (cq0) b.c(i);
        if (cq0Var2 != null) {
            return cq0Var2;
        }
        yn2 yn2Var = b;
        if (yn2Var.m) {
            ll3.g(yn2Var);
        }
        int o = yk3.o(yn2Var.p, i, yn2Var.n);
        if (o >= 0) {
            return (cq0) b.g(o);
        }
        int i2 = -(o + 1);
        int i3 = i2 - 1;
        if (i2 >= b.f()) {
            eq0 eq0Var = new eq0(new float[]{1.0f}, new float[]{f});
            b(f, eq0Var);
            return eq0Var;
        }
        if (i3 < 0) {
            cq0Var = new eq0(fArr, fArr);
            d = 1.0f;
        } else {
            d = b.d(i3) / 100.0f;
            cq0Var = (cq0) b.g(i3);
        }
        float d2 = b.d(i2) / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, d == d2 ? 0.0f : (f - d) / (d2 - d))) * 1.0f) + 0.0f;
        cq0 cq0Var3 = (cq0) b.g(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float b2 = cq0Var.b(f2);
            fArr2[i4] = ((cq0Var3.b(f2) - b2) * max) + b2;
        }
        eq0 eq0Var2 = new eq0(fArr, fArr2);
        b(f, eq0Var2);
        return eq0Var2;
    }

    public static void b(float f, eq0 eq0Var) {
        synchronized (c) {
            yn2 clone = b.clone();
            clone.e((int) (f * 100.0f), eq0Var);
            b = clone;
            Unit unit = Unit.a;
        }
    }
}

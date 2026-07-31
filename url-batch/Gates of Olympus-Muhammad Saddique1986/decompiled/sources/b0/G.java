package b0;

import a0.C0237b;
import a0.C0238c;
import java.util.Arrays;
import n2.AbstractC0731k;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f5350a;

    public static float[] a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long b(long j3, float[] fArr) {
        float d3 = C0238c.d(j3);
        float e3 = C0238c.e(j3);
        float f3 = 1 / (((fArr[7] * e3) + (fArr[3] * d3)) + fArr[15]);
        if (Float.isInfinite(f3) || Float.isNaN(f3)) {
            f3 = 0.0f;
        }
        return l0.c.e(((fArr[4] * e3) + (fArr[0] * d3) + fArr[12]) * f3, ((fArr[5] * e3) + (fArr[1] * d3) + fArr[13]) * f3);
    }

    public static final void c(float[] fArr, C0237b c0237b) {
        long b3 = b(l0.c.e(c0237b.f4718a, c0237b.f4719b), fArr);
        long b4 = b(l0.c.e(c0237b.f4718a, c0237b.f4721d), fArr);
        long b5 = b(l0.c.e(c0237b.f4720c, c0237b.f4719b), fArr);
        long b6 = b(l0.c.e(c0237b.f4720c, c0237b.f4721d), fArr);
        c0237b.f4718a = Math.min(Math.min(C0238c.d(b3), C0238c.d(b4)), Math.min(C0238c.d(b5), C0238c.d(b6)));
        c0237b.f4719b = Math.min(Math.min(C0238c.e(b3), C0238c.e(b4)), Math.min(C0238c.e(b5), C0238c.e(b6)));
        c0237b.f4720c = Math.max(Math.max(C0238c.d(b3), C0238c.d(b4)), Math.max(C0238c.d(b5), C0238c.d(b6)));
        c0237b.f4721d = Math.max(Math.max(C0238c.e(b3), C0238c.e(b4)), Math.max(C0238c.e(b5), C0238c.e(b6)));
    }

    public static final void d(float[] fArr) {
        int i3 = 0;
        while (i3 < 4) {
            int i4 = 0;
            while (i4 < 4) {
                fArr[(i4 * 4) + i3] = i3 == i4 ? 1.0f : 0.0f;
                i4++;
            }
            i3++;
        }
    }

    public static final void e(float[] fArr, float f3) {
        double d3 = (f3 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d3);
        float sin = (float) Math.sin(d3);
        float f4 = fArr[0];
        float f5 = fArr[4];
        float f6 = (sin * f5) + (cos * f4);
        float f7 = -sin;
        float f8 = fArr[1];
        float f9 = fArr[5];
        float f10 = (sin * f9) + (cos * f8);
        float f11 = fArr[2];
        float f12 = fArr[6];
        float f13 = (sin * f12) + (cos * f11);
        float f14 = fArr[3];
        float f15 = fArr[7];
        fArr[0] = f6;
        fArr[1] = f10;
        fArr[2] = f13;
        fArr[3] = (sin * f15) + (cos * f14);
        fArr[4] = (f5 * cos) + (f4 * f7);
        fArr[5] = (f9 * cos) + (f8 * f7);
        fArr[6] = (f12 * cos) + (f11 * f7);
        fArr[7] = (cos * f15) + (f7 * f14);
    }

    public static final void f(float[] fArr, float f3, float f4, float f5) {
        fArr[0] = fArr[0] * f3;
        fArr[1] = fArr[1] * f3;
        fArr[2] = fArr[2] * f3;
        fArr[3] = fArr[3] * f3;
        fArr[4] = fArr[4] * f4;
        fArr[5] = fArr[5] * f4;
        fArr[6] = fArr[6] * f4;
        fArr[7] = fArr[7] * f4;
        fArr[8] = fArr[8] * f5;
        fArr[9] = fArr[9] * f5;
        fArr[10] = fArr[10] * f5;
        fArr[11] = fArr[11] * f5;
    }

    public static final void g(float[] fArr, float[] fArr2) {
        float k3 = M.k(fArr, 0, fArr2, 0);
        float k4 = M.k(fArr, 0, fArr2, 1);
        float k5 = M.k(fArr, 0, fArr2, 2);
        float k6 = M.k(fArr, 0, fArr2, 3);
        float k7 = M.k(fArr, 1, fArr2, 0);
        float k8 = M.k(fArr, 1, fArr2, 1);
        float k9 = M.k(fArr, 1, fArr2, 2);
        float k10 = M.k(fArr, 1, fArr2, 3);
        float k11 = M.k(fArr, 2, fArr2, 0);
        float k12 = M.k(fArr, 2, fArr2, 1);
        float k13 = M.k(fArr, 2, fArr2, 2);
        float k14 = M.k(fArr, 2, fArr2, 3);
        float k15 = M.k(fArr, 3, fArr2, 0);
        float k16 = M.k(fArr, 3, fArr2, 1);
        float k17 = M.k(fArr, 3, fArr2, 2);
        float k18 = M.k(fArr, 3, fArr2, 3);
        fArr[0] = k3;
        fArr[1] = k4;
        fArr[2] = k5;
        fArr[3] = k6;
        fArr[4] = k7;
        fArr[5] = k8;
        fArr[6] = k9;
        fArr[7] = k10;
        fArr[8] = k11;
        fArr[9] = k12;
        fArr[10] = k13;
        fArr[11] = k14;
        fArr[12] = k15;
        fArr[13] = k16;
        fArr[14] = k17;
        fArr[15] = k18;
    }

    public static final void h(float[] fArr, float f3, float f4, float f5) {
        float f6 = (fArr[8] * f5) + (fArr[4] * f4) + (fArr[0] * f3) + fArr[12];
        float f7 = (fArr[9] * f5) + (fArr[5] * f4) + (fArr[1] * f3) + fArr[13];
        float f8 = (fArr[10] * f5) + (fArr[6] * f4) + (fArr[2] * f3) + fArr[14];
        float f9 = (fArr[11] * f5) + (fArr[7] * f4) + (fArr[3] * f3) + fArr[15];
        fArr[12] = f6;
        fArr[13] = f7;
        fArr[14] = f8;
        fArr[15] = f9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof G) {
            return f2.j.a(this.f5350a, ((G) obj).f5350a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5350a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |");
        float[] fArr = this.f5350a;
        sb.append(fArr[0]);
        sb.append(' ');
        sb.append(fArr[1]);
        sb.append(' ');
        sb.append(fArr[2]);
        sb.append(' ');
        sb.append(fArr[3]);
        sb.append("|\n            |");
        sb.append(fArr[4]);
        sb.append(' ');
        sb.append(fArr[5]);
        sb.append(' ');
        sb.append(fArr[6]);
        sb.append(' ');
        sb.append(fArr[7]);
        sb.append("|\n            |");
        sb.append(fArr[8]);
        sb.append(' ');
        sb.append(fArr[9]);
        sb.append(' ');
        sb.append(fArr[10]);
        sb.append(' ');
        sb.append(fArr[11]);
        sb.append("|\n            |");
        sb.append(fArr[12]);
        sb.append(' ');
        sb.append(fArr[13]);
        sb.append(' ');
        sb.append(fArr[14]);
        sb.append(' ');
        sb.append(fArr[15]);
        sb.append("|\n        ");
        return AbstractC0731k.p(sb.toString());
    }
}

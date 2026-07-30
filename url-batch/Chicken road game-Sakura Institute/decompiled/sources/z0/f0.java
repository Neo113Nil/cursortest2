package z0;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f9990a;

    public static float[] a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long b(long j8, float[] fArr) {
        float d8 = y0.c.d(j8);
        float e9 = y0.c.e(j8);
        float f9 = 1 / (((fArr[7] * e9) + (fArr[3] * d8)) + fArr[15]);
        if (Float.isInfinite(f9) || Float.isNaN(f9)) {
            f9 = 0.0f;
        }
        return u3.r.a(((fArr[4] * e9) + (fArr[0] * d8) + fArr[12]) * f9, ((fArr[5] * e9) + (fArr[1] * d8) + fArr[13]) * f9);
    }

    public static final void c(float[] fArr, y0.b bVar) {
        long b9 = b(u3.r.a(bVar.f9774a, bVar.f9775b), fArr);
        long b10 = b(u3.r.a(bVar.f9774a, bVar.f9777d), fArr);
        long b11 = b(u3.r.a(bVar.f9776c, bVar.f9775b), fArr);
        long b12 = b(u3.r.a(bVar.f9776c, bVar.f9777d), fArr);
        bVar.f9774a = Math.min(Math.min(y0.c.d(b9), y0.c.d(b10)), Math.min(y0.c.d(b11), y0.c.d(b12)));
        bVar.f9775b = Math.min(Math.min(y0.c.e(b9), y0.c.e(b10)), Math.min(y0.c.e(b11), y0.c.e(b12)));
        bVar.f9776c = Math.max(Math.max(y0.c.d(b9), y0.c.d(b10)), Math.max(y0.c.d(b11), y0.c.d(b12)));
        bVar.f9777d = Math.max(Math.max(y0.c.e(b9), y0.c.e(b10)), Math.max(y0.c.e(b11), y0.c.e(b12)));
    }

    public static final void d(float[] fArr) {
        int i7 = 0;
        while (i7 < 4) {
            int i8 = 0;
            while (i8 < 4) {
                fArr[(i8 * 4) + i7] = i7 == i8 ? 1.0f : 0.0f;
                i8++;
            }
            i7++;
        }
    }

    public static final void e(float[] fArr, float f9) {
        double d8 = (f9 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d8);
        float sin = (float) Math.sin(d8);
        float f10 = fArr[0];
        float f11 = fArr[4];
        float f12 = (sin * f11) + (cos * f10);
        float f13 = -sin;
        float f14 = fArr[1];
        float f15 = fArr[5];
        float f16 = (sin * f15) + (cos * f14);
        float f17 = fArr[2];
        float f18 = fArr[6];
        float f19 = (sin * f18) + (cos * f17);
        float f20 = fArr[3];
        float f21 = fArr[7];
        fArr[0] = f12;
        fArr[1] = f16;
        fArr[2] = f19;
        fArr[3] = (sin * f21) + (cos * f20);
        fArr[4] = (f11 * cos) + (f10 * f13);
        fArr[5] = (f15 * cos) + (f14 * f13);
        fArr[6] = (f18 * cos) + (f17 * f13);
        fArr[7] = (cos * f21) + (f13 * f20);
    }

    public static final void f(float[] fArr, float f9, float f10) {
        fArr[0] = fArr[0] * f9;
        fArr[1] = fArr[1] * f9;
        fArr[2] = fArr[2] * f9;
        fArr[3] = fArr[3] * f9;
        fArr[4] = fArr[4] * f10;
        fArr[5] = fArr[5] * f10;
        fArr[6] = fArr[6] * f10;
        fArr[7] = fArr[7] * f10;
        fArr[8] = fArr[8] * 1.0f;
        fArr[9] = fArr[9] * 1.0f;
        fArr[10] = fArr[10] * 1.0f;
        fArr[11] = fArr[11] * 1.0f;
    }

    public static final void g(float[] fArr, float[] fArr2) {
        float j8 = l0.j(fArr, 0, fArr2, 0);
        float j9 = l0.j(fArr, 0, fArr2, 1);
        float j10 = l0.j(fArr, 0, fArr2, 2);
        float j11 = l0.j(fArr, 0, fArr2, 3);
        float j12 = l0.j(fArr, 1, fArr2, 0);
        float j13 = l0.j(fArr, 1, fArr2, 1);
        float j14 = l0.j(fArr, 1, fArr2, 2);
        float j15 = l0.j(fArr, 1, fArr2, 3);
        float j16 = l0.j(fArr, 2, fArr2, 0);
        float j17 = l0.j(fArr, 2, fArr2, 1);
        float j18 = l0.j(fArr, 2, fArr2, 2);
        float j19 = l0.j(fArr, 2, fArr2, 3);
        float j20 = l0.j(fArr, 3, fArr2, 0);
        float j21 = l0.j(fArr, 3, fArr2, 1);
        float j22 = l0.j(fArr, 3, fArr2, 2);
        float j23 = l0.j(fArr, 3, fArr2, 3);
        fArr[0] = j8;
        fArr[1] = j9;
        fArr[2] = j10;
        fArr[3] = j11;
        fArr[4] = j12;
        fArr[5] = j13;
        fArr[6] = j14;
        fArr[7] = j15;
        fArr[8] = j16;
        fArr[9] = j17;
        fArr[10] = j18;
        fArr[11] = j19;
        fArr[12] = j20;
        fArr[13] = j21;
        fArr[14] = j22;
        fArr[15] = j23;
    }

    public static final void h(float[] fArr, float f9, float f10) {
        float f11 = (fArr[8] * 0.0f) + (fArr[4] * f10) + (fArr[0] * f9) + fArr[12];
        float f12 = (fArr[9] * 0.0f) + (fArr[5] * f10) + (fArr[1] * f9) + fArr[13];
        float f13 = (fArr[10] * 0.0f) + (fArr[6] * f10) + (fArr[2] * f9) + fArr[14];
        float f14 = (fArr[11] * 0.0f) + (fArr[7] * f10) + (fArr[3] * f9) + fArr[15];
        fArr[12] = f11;
        fArr[13] = f12;
        fArr[14] = f13;
        fArr[15] = f14;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f0) {
            return r6.k.a(this.f9990a, ((f0) obj).f9990a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9990a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |");
        float[] fArr = this.f9990a;
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
        return z6.i.m(sb.toString());
    }
}

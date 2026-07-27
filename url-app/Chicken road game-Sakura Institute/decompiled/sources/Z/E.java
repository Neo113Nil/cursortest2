package Z;

import a.AbstractC0345a;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f4456a;

    public static float[] a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long b(long j4, float[] fArr) {
        float d4 = Y.c.d(j4);
        float e4 = Y.c.e(j4);
        float f4 = 1 / (((fArr[7] * e4) + (fArr[3] * d4)) + fArr[15]);
        if (Float.isInfinite(f4) || Float.isNaN(f4)) {
            f4 = 0.0f;
        }
        return AbstractC0345a.c(((fArr[4] * e4) + (fArr[0] * d4) + fArr[12]) * f4, ((fArr[5] * e4) + (fArr[1] * d4) + fArr[13]) * f4);
    }

    public static final void c(float[] fArr, Y.b bVar) {
        long b4 = b(AbstractC0345a.c(bVar.f4368a, bVar.f4369b), fArr);
        long b5 = b(AbstractC0345a.c(bVar.f4368a, bVar.f4371d), fArr);
        long b6 = b(AbstractC0345a.c(bVar.f4370c, bVar.f4369b), fArr);
        long b7 = b(AbstractC0345a.c(bVar.f4370c, bVar.f4371d), fArr);
        bVar.f4368a = Math.min(Math.min(Y.c.d(b4), Y.c.d(b5)), Math.min(Y.c.d(b6), Y.c.d(b7)));
        bVar.f4369b = Math.min(Math.min(Y.c.e(b4), Y.c.e(b5)), Math.min(Y.c.e(b6), Y.c.e(b7)));
        bVar.f4370c = Math.max(Math.max(Y.c.d(b4), Y.c.d(b5)), Math.max(Y.c.d(b6), Y.c.d(b7)));
        bVar.f4371d = Math.max(Math.max(Y.c.e(b4), Y.c.e(b5)), Math.max(Y.c.e(b6), Y.c.e(b7)));
    }

    public static final void d(float[] fArr) {
        int i2 = 0;
        while (i2 < 4) {
            int i4 = 0;
            while (i4 < 4) {
                fArr[(i4 * 4) + i2] = i2 == i4 ? 1.0f : 0.0f;
                i4++;
            }
            i2++;
        }
    }

    public static final void e(float[] fArr, float f4) {
        double d4 = (f4 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d4);
        float sin = (float) Math.sin(d4);
        float f5 = fArr[0];
        float f6 = fArr[4];
        float f7 = (sin * f6) + (cos * f5);
        float f8 = -sin;
        float f9 = fArr[1];
        float f10 = fArr[5];
        float f11 = (sin * f10) + (cos * f9);
        float f12 = fArr[2];
        float f13 = fArr[6];
        float f14 = (sin * f13) + (cos * f12);
        float f15 = fArr[3];
        float f16 = fArr[7];
        fArr[0] = f7;
        fArr[1] = f11;
        fArr[2] = f14;
        fArr[3] = (sin * f16) + (cos * f15);
        fArr[4] = (f6 * cos) + (f5 * f8);
        fArr[5] = (f10 * cos) + (f9 * f8);
        fArr[6] = (f13 * cos) + (f12 * f8);
        fArr[7] = (cos * f16) + (f8 * f15);
    }

    public static final void f(float[] fArr, float f4, float f5, float f6) {
        fArr[0] = fArr[0] * f4;
        fArr[1] = fArr[1] * f4;
        fArr[2] = fArr[2] * f4;
        fArr[3] = fArr[3] * f4;
        fArr[4] = fArr[4] * f5;
        fArr[5] = fArr[5] * f5;
        fArr[6] = fArr[6] * f5;
        fArr[7] = fArr[7] * f5;
        fArr[8] = fArr[8] * f6;
        fArr[9] = fArr[9] * f6;
        fArr[10] = fArr[10] * f6;
        fArr[11] = fArr[11] * f6;
    }

    public static final void g(float[] fArr, float[] fArr2) {
        float j4 = K.j(fArr, 0, fArr2, 0);
        float j5 = K.j(fArr, 0, fArr2, 1);
        float j6 = K.j(fArr, 0, fArr2, 2);
        float j7 = K.j(fArr, 0, fArr2, 3);
        float j8 = K.j(fArr, 1, fArr2, 0);
        float j9 = K.j(fArr, 1, fArr2, 1);
        float j10 = K.j(fArr, 1, fArr2, 2);
        float j11 = K.j(fArr, 1, fArr2, 3);
        float j12 = K.j(fArr, 2, fArr2, 0);
        float j13 = K.j(fArr, 2, fArr2, 1);
        float j14 = K.j(fArr, 2, fArr2, 2);
        float j15 = K.j(fArr, 2, fArr2, 3);
        float j16 = K.j(fArr, 3, fArr2, 0);
        float j17 = K.j(fArr, 3, fArr2, 1);
        float j18 = K.j(fArr, 3, fArr2, 2);
        float j19 = K.j(fArr, 3, fArr2, 3);
        fArr[0] = j4;
        fArr[1] = j5;
        fArr[2] = j6;
        fArr[3] = j7;
        fArr[4] = j8;
        fArr[5] = j9;
        fArr[6] = j10;
        fArr[7] = j11;
        fArr[8] = j12;
        fArr[9] = j13;
        fArr[10] = j14;
        fArr[11] = j15;
        fArr[12] = j16;
        fArr[13] = j17;
        fArr[14] = j18;
        fArr[15] = j19;
    }

    public static final void h(float[] fArr, float f4, float f5, float f6) {
        float f7 = (fArr[8] * f6) + (fArr[4] * f5) + (fArr[0] * f4) + fArr[12];
        float f8 = (fArr[9] * f6) + (fArr[5] * f5) + (fArr[1] * f4) + fArr[13];
        float f9 = (fArr[10] * f6) + (fArr[6] * f5) + (fArr[2] * f4) + fArr[14];
        float f10 = (fArr[11] * f6) + (fArr[7] * f5) + (fArr[3] * f4) + fArr[15];
        fArr[12] = f7;
        fArr[13] = f8;
        fArr[14] = f9;
        fArr[15] = f10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof E) {
            return Intrinsics.a(this.f4456a, ((E) obj).f4456a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4456a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |");
        float[] fArr = this.f4456a;
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
        return kotlin.text.n.b(sb.toString());
    }
}

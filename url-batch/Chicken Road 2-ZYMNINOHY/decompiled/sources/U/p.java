package U;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p implements q {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f3069a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f3070b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f3071c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f3072d;

    /* renamed from: e, reason: collision with root package name */
    public double f3073e;

    /* renamed from: f, reason: collision with root package name */
    public double f3074f;

    /* renamed from: g, reason: collision with root package name */
    public double f3075g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s f3076h;

    public p(s sVar) {
        this.f3076h = sVar;
        int i4 = sVar.f3092h;
        this.f3069a = new float[i4];
        int i5 = i4 * sVar.f3086b;
        this.f3070b = new float[i5];
        this.f3071c = new float[i5];
        this.f3072d = new float[i5];
    }

    @Override // U.q
    public final void a(int i4, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f3070b;
        s sVar = this.f3076h;
        asFloatBuffer.get(fArr, sVar.f3094j * sVar.f3086b, i4 / 4);
        byteBuffer.position(byteBuffer.position() + i4);
    }

    @Override // U.q
    public final void b(int i4, ByteBuffer byteBuffer) {
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f3071c;
        s sVar = this.f3076h;
        asFloatBuffer.put(fArr, 0, sVar.f3086b * i4);
        byteBuffer.position((i4 * 4 * sVar.f3086b) + byteBuffer.position());
    }

    @Override // U.q
    public final void c(int i4, long j4, long j5) {
        int i5 = 0;
        while (true) {
            s sVar = this.f3076h;
            int i6 = sVar.f3086b;
            if (i5 >= i6) {
                return;
            }
            float[] fArr = this.f3071c;
            int i7 = (sVar.f3095k * i6) + i5;
            float[] fArr2 = this.f3072d;
            int i8 = (i4 * i6) + i5;
            float f4 = fArr2[i8];
            float f5 = fArr2[i8 + i6];
            long j6 = sVar.n * j4;
            long j7 = (r1 + 1) * j5;
            long j8 = j7 - j6;
            fArr[i7] = (((r10 - j8) * f5) + (j8 * f4)) / (j7 - (sVar.f3097m * j5));
            i5++;
        }
    }

    @Override // U.q
    public final void d(int i4, int i5) {
        for (int i6 = 0; i6 < this.f3076h.f3086b * i5; i6++) {
            this.f3070b[i4 + i6] = 0.0f;
        }
    }

    @Override // U.q
    public final void e(int i4, int i5) {
        s sVar = this.f3076h;
        int i6 = sVar.f3092h / i5;
        int i7 = sVar.f3086b;
        int i8 = i5 * i7;
        int i9 = i4 * i7;
        for (int i10 = 0; i10 < i6; i10++) {
            double d4 = 0.0d;
            for (int i11 = 0; i11 < i8; i11++) {
                d4 += this.f3070b[(i10 * i8) + i9 + i11];
            }
            this.f3069a[i10] = (float) (d4 / i8);
        }
    }

    @Override // U.q
    public final int f(int i4, int i5, int i6) {
        return s(this.f3070b, i4, i5, i6);
    }

    @Override // U.q
    public final void flush() {
        this.f3075g = 0.0d;
        this.f3073e = 0.0d;
        this.f3074f = 0.0d;
    }

    @Override // U.q
    public final void g() {
        this.f3075g = this.f3073e;
    }

    @Override // U.q
    public final Object h() {
        return this.f3070b;
    }

    @Override // U.q
    public final Object i() {
        return this.f3071c;
    }

    @Override // U.q
    public final void j(int i4) {
        this.f3071c = r(this.f3071c, this.f3076h.f3095k, i4);
    }

    @Override // U.q
    public final boolean k() {
        double d4 = this.f3073e;
        return d4 != 0.0d && this.f3076h.f3098p != 0 && this.f3074f <= d4 * 3.0d && d4 * 2.0d > this.f3075g * 3.0d;
    }

    @Override // U.q
    public final Object l() {
        return this.f3072d;
    }

    @Override // U.q
    public final void m(int i4, int i5, int i6, int i7, int i8) {
        float[] fArr = this.f3071c;
        float[] fArr2 = this.f3070b;
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i6 * i5) + i9;
            int i11 = (i8 * i5) + i9;
            int i12 = (i7 * i5) + i9;
            for (int i13 = 0; i13 < i4; i13++) {
                fArr[i10] = ((fArr2[i11] * i13) + (fArr2[i12] * (i4 - i13))) / i4;
                i10 += i5;
                i12 += i5;
                i11 += i5;
            }
        }
    }

    @Override // U.q
    public final void n(int i4) {
        this.f3072d = r(this.f3072d, this.f3076h.f3096l, i4);
    }

    @Override // U.q
    public final int o() {
        return 4;
    }

    @Override // U.q
    public final void p(int i4) {
        this.f3070b = r(this.f3070b, this.f3076h.f3094j, i4);
    }

    @Override // U.q
    public final int q(int i4, int i5) {
        return s(this.f3069a, 0, i4, i5);
    }

    public final float[] r(float[] fArr, int i4, int i5) {
        int length = fArr.length;
        int i6 = this.f3076h.f3086b;
        int i7 = length / i6;
        return i4 + i5 <= i7 ? fArr : Arrays.copyOf(fArr, (((i7 * 3) / 2) + i5) * i6);
    }

    public final int s(float[] fArr, int i4, int i5, int i6) {
        int i7 = this.f3076h.f3086b * i4;
        double d4 = 1.0d;
        int i8 = 0;
        double d5 = 0.0d;
        int i9 = 255;
        int i10 = i5;
        while (i10 <= i6) {
            double d6 = 0.0d;
            for (int i11 = 0; i11 < i10; i11++) {
                d6 += Math.abs(fArr[i7 + i11] - fArr[(i7 + i10) + i11]);
            }
            int i12 = i7;
            double d7 = i10;
            if (i8 * d6 < d4 * d7) {
                i8 = i10;
                d4 = d6;
            }
            if (i9 * d6 > d7 * d5) {
                i9 = i10;
                d5 = d6;
            }
            i10++;
            i7 = i12;
        }
        this.f3073e = d4 / i8;
        this.f3074f = d5 / i9;
        return i8;
    }
}

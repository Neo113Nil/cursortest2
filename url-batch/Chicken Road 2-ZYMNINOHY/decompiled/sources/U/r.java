package U;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final short[] f3077a;

    /* renamed from: b, reason: collision with root package name */
    public short[] f3078b;

    /* renamed from: c, reason: collision with root package name */
    public short[] f3079c;

    /* renamed from: d, reason: collision with root package name */
    public short[] f3080d;

    /* renamed from: e, reason: collision with root package name */
    public int f3081e;

    /* renamed from: f, reason: collision with root package name */
    public int f3082f;

    /* renamed from: g, reason: collision with root package name */
    public int f3083g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s f3084h;

    public r(s sVar) {
        this.f3084h = sVar;
        int i4 = sVar.f3092h;
        this.f3077a = new short[i4];
        int i5 = i4 * sVar.f3086b;
        this.f3078b = new short[i5];
        this.f3079c = new short[i5];
        this.f3080d = new short[i5];
    }

    @Override // U.q
    public final void a(int i4, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = this.f3078b;
        s sVar = this.f3084h;
        asShortBuffer.get(sArr, sVar.f3094j * sVar.f3086b, i4 / 2);
        byteBuffer.position(byteBuffer.position() + i4);
    }

    @Override // U.q
    public final void b(int i4, ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = this.f3079c;
        s sVar = this.f3084h;
        asShortBuffer.put(sArr, 0, sVar.f3086b * i4);
        byteBuffer.position((i4 * 2 * sVar.f3086b) + byteBuffer.position());
    }

    @Override // U.q
    public final void c(int i4, long j4, long j5) {
        int i5 = 0;
        while (true) {
            s sVar = this.f3084h;
            int i6 = sVar.f3086b;
            if (i5 >= i6) {
                return;
            }
            short[] sArr = this.f3079c;
            int i7 = (sVar.f3095k * i6) + i5;
            short[] sArr2 = this.f3080d;
            int i8 = (i4 * i6) + i5;
            short s4 = sArr2[i8];
            short s5 = sArr2[i8 + i6];
            long j6 = sVar.n * j4;
            long j7 = (r1 + 1) * j5;
            long j8 = j7 - j6;
            long j9 = j7 - (sVar.f3097m * j5);
            sArr[i7] = (short) ((((j9 - j8) * s5) + (s4 * j8)) / j9);
            i5++;
        }
    }

    @Override // U.q
    public final void d(int i4, int i5) {
        for (int i6 = 0; i6 < this.f3084h.f3086b * i5; i6++) {
            this.f3078b[i4 + i6] = 0;
        }
    }

    @Override // U.q
    public final void e(int i4, int i5) {
        short[] sArr = this.f3078b;
        s sVar = this.f3084h;
        int i6 = sVar.f3092h / i5;
        int i7 = sVar.f3086b;
        int i8 = i5 * i7;
        int i9 = i4 * i7;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                i11 += sArr[(i10 * i8) + i9 + i12];
            }
            this.f3077a[i10] = (short) (i11 / i8);
        }
    }

    @Override // U.q
    public final int f(int i4, int i5, int i6) {
        return s(this.f3078b, i4, i5, i6);
    }

    @Override // U.q
    public final void flush() {
        this.f3083g = 0;
        this.f3081e = 0;
        this.f3082f = 0;
    }

    @Override // U.q
    public final void g() {
        this.f3083g = this.f3081e;
    }

    @Override // U.q
    public final Object h() {
        return this.f3078b;
    }

    @Override // U.q
    public final Object i() {
        return this.f3079c;
    }

    @Override // U.q
    public final void j(int i4) {
        this.f3079c = r(this.f3079c, this.f3084h.f3095k, i4);
    }

    @Override // U.q
    public final boolean k() {
        int i4 = this.f3081e;
        return i4 != 0 && this.f3084h.f3098p != 0 && this.f3082f <= i4 * 3 && i4 * 2 > this.f3083g * 3;
    }

    @Override // U.q
    public final Object l() {
        return this.f3080d;
    }

    @Override // U.q
    public final void m(int i4, int i5, int i6, int i7, int i8) {
        short[] sArr = this.f3079c;
        short[] sArr2 = this.f3078b;
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i6 * i5) + i9;
            int i11 = (i8 * i5) + i9;
            int i12 = (i7 * i5) + i9;
            for (int i13 = 0; i13 < i4; i13++) {
                sArr[i10] = (short) (((sArr2[i11] * i13) + ((i4 - i13) * sArr2[i12])) / i4);
                i10 += i5;
                i12 += i5;
                i11 += i5;
            }
        }
    }

    @Override // U.q
    public final void n(int i4) {
        this.f3080d = r(this.f3080d, this.f3084h.f3096l, i4);
    }

    @Override // U.q
    public final int o() {
        return 2;
    }

    @Override // U.q
    public final void p(int i4) {
        this.f3078b = r(this.f3078b, this.f3084h.f3094j, i4);
    }

    @Override // U.q
    public final int q(int i4, int i5) {
        return s(this.f3077a, 0, i4, i5);
    }

    public final short[] r(short[] sArr, int i4, int i5) {
        int length = sArr.length;
        int i6 = this.f3084h.f3086b;
        int i7 = length / i6;
        return i4 + i5 <= i7 ? sArr : Arrays.copyOf(sArr, (((i7 * 3) / 2) + i5) * i6);
    }

    public final int s(short[] sArr, int i4, int i5, int i6) {
        int i7 = i4 * this.f3084h.f3086b;
        int i8 = KotlinVersion.MAX_COMPONENT_VALUE;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        while (i5 <= i6) {
            int i12 = 0;
            for (int i13 = 0; i13 < i5; i13++) {
                i12 += Math.abs(sArr[i7 + i13] - sArr[(i7 + i5) + i13]);
            }
            if (i12 * i10 < i9 * i5) {
                i10 = i5;
                i9 = i12;
            }
            if (i12 * i8 > i11 * i5) {
                i8 = i5;
                i11 = i12;
            }
            i5++;
        }
        this.f3081e = i9 / i10;
        this.f3082f = i11 / i8;
        return i10;
    }
}

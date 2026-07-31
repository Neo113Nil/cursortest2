package t0;

import c4.w0;
import o2.m0;
import t0.z;

/* loaded from: classes.dex */
public class a0 implements z.d {

    /* renamed from: b, reason: collision with root package name */
    protected final int f21670b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f21671c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f21672d;

    /* renamed from: e, reason: collision with root package name */
    protected final int f21673e;

    /* renamed from: f, reason: collision with root package name */
    protected final int f21674f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21675g;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f21676a = 250000;

        /* renamed from: b, reason: collision with root package name */
        private int f21677b = 750000;

        /* renamed from: c, reason: collision with root package name */
        private int f21678c = 4;

        /* renamed from: d, reason: collision with root package name */
        private int f21679d = 250000;

        /* renamed from: e, reason: collision with root package name */
        private int f21680e = 50000000;

        /* renamed from: f, reason: collision with root package name */
        private int f21681f = 2;

        public a0 g() {
            return new a0(this);
        }
    }

    protected a0(a aVar) {
        this.f21670b = aVar.f21676a;
        this.f21671c = aVar.f21677b;
        this.f21672d = aVar.f21678c;
        this.f21673e = aVar.f21679d;
        this.f21674f = aVar.f21680e;
        this.f21675g = aVar.f21681f;
    }

    protected static int b(int i7, int i8, int i9) {
        return o4.d.d(((i7 * i8) * i9) / 1000000);
    }

    protected static int d(int i7) {
        switch (i7) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case w0.f2149o /* 7 */:
                return 192000;
            case w0.f2150p /* 8 */:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    @Override // t0.z.d
    public int a(int i7, int i8, int i9, int i10, int i11, double d7) {
        Double.isNaN(c(i7, i8, i9, i10, i11));
        return (((Math.max(i7, (int) (r2 * d7)) + i10) - 1) / i10) * i10;
    }

    protected int c(int i7, int i8, int i9, int i10, int i11) {
        if (i9 == 0) {
            return g(i7, i11, i10);
        }
        if (i9 == 1) {
            return e(i8);
        }
        if (i9 == 2) {
            return f(i8);
        }
        throw new IllegalArgumentException();
    }

    protected int e(int i7) {
        return o4.d.d((this.f21674f * d(i7)) / 1000000);
    }

    protected int f(int i7) {
        int i8 = this.f21673e;
        if (i7 == 5) {
            i8 *= this.f21675g;
        }
        return o4.d.d((i8 * d(i7)) / 1000000);
    }

    protected int g(int i7, int i8, int i9) {
        return m0.q(i7 * this.f21672d, b(this.f21670b, i8, i9), b(this.f21671c, i8, i9));
    }
}

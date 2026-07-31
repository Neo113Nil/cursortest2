package y0;

import java.util.Arrays;
import o2.m0;
import w0.b0;
import w0.c0;
import w0.e0;
import w0.m;

/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    protected final e0 f23226a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23227b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23228c;

    /* renamed from: d, reason: collision with root package name */
    private final long f23229d;

    /* renamed from: e, reason: collision with root package name */
    private final int f23230e;

    /* renamed from: f, reason: collision with root package name */
    private int f23231f;

    /* renamed from: g, reason: collision with root package name */
    private int f23232g;

    /* renamed from: h, reason: collision with root package name */
    private int f23233h;

    /* renamed from: i, reason: collision with root package name */
    private int f23234i;

    /* renamed from: j, reason: collision with root package name */
    private int f23235j;

    /* renamed from: k, reason: collision with root package name */
    private long[] f23236k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f23237l;

    public e(int i7, int i8, long j7, int i9, e0 e0Var) {
        boolean z6 = true;
        if (i8 != 1 && i8 != 2) {
            z6 = false;
        }
        o2.a.a(z6);
        this.f23229d = j7;
        this.f23230e = i9;
        this.f23226a = e0Var;
        this.f23227b = d(i7, i8 == 2 ? 1667497984 : 1651965952);
        this.f23228c = i8 == 2 ? d(i7, 1650720768) : -1;
        this.f23236k = new long[512];
        this.f23237l = new int[512];
    }

    private static int d(int i7, int i8) {
        return (((i7 % 10) + 48) << 8) | ((i7 / 10) + 48) | i8;
    }

    private long e(int i7) {
        return (this.f23229d * i7) / this.f23230e;
    }

    private c0 h(int i7) {
        return new c0(this.f23237l[i7] * g(), this.f23236k[i7]);
    }

    public void a() {
        this.f23233h++;
    }

    public void b(long j7) {
        if (this.f23235j == this.f23237l.length) {
            long[] jArr = this.f23236k;
            this.f23236k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f23237l;
            this.f23237l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f23236k;
        int i7 = this.f23235j;
        jArr2[i7] = j7;
        this.f23237l[i7] = this.f23234i;
        this.f23235j = i7 + 1;
    }

    public void c() {
        this.f23236k = Arrays.copyOf(this.f23236k, this.f23235j);
        this.f23237l = Arrays.copyOf(this.f23237l, this.f23235j);
    }

    public long f() {
        return e(this.f23233h);
    }

    public long g() {
        return e(1);
    }

    public b0.a i(long j7) {
        int g7 = (int) (j7 / g());
        int h7 = m0.h(this.f23237l, g7, true, true);
        if (this.f23237l[h7] == g7) {
            return new b0.a(h(h7));
        }
        c0 h8 = h(h7);
        int i7 = h7 + 1;
        return i7 < this.f23236k.length ? new b0.a(h8, h(i7)) : new b0.a(h8);
    }

    public boolean j(int i7) {
        return this.f23227b == i7 || this.f23228c == i7;
    }

    public void k() {
        this.f23234i++;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f23237l, this.f23233h) >= 0;
    }

    public boolean m(m mVar) {
        int i7 = this.f23232g;
        int a7 = i7 - this.f23226a.a(mVar, i7, false);
        this.f23232g = a7;
        boolean z6 = a7 == 0;
        if (z6) {
            if (this.f23231f > 0) {
                this.f23226a.b(f(), l() ? 1 : 0, this.f23231f, 0, null);
            }
            a();
        }
        return z6;
    }

    public void n(int i7) {
        this.f23231f = i7;
        this.f23232g = i7;
    }

    public void o(long j7) {
        int i7;
        if (this.f23235j == 0) {
            i7 = 0;
        } else {
            i7 = this.f23237l[m0.i(this.f23236k, j7, true, true)];
        }
        this.f23233h = i7;
    }
}

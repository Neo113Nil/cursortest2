package f0;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096b {

    /* renamed from: a, reason: collision with root package name */
    public long f2221a = 0;

    /* renamed from: b, reason: collision with root package name */
    public C0096b f2222b;

    public final void a(int i) {
        if (i < 64) {
            this.f2221a &= ~(1 << i);
            return;
        }
        C0096b c0096b = this.f2222b;
        if (c0096b != null) {
            c0096b.a(i - 64);
        }
    }

    public final int b(int i) {
        C0096b c0096b = this.f2222b;
        if (c0096b == null) {
            return i >= 64 ? Long.bitCount(this.f2221a) : Long.bitCount(this.f2221a & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f2221a & ((1 << i) - 1));
        }
        return Long.bitCount(this.f2221a) + c0096b.b(i - 64);
    }

    public final void c() {
        if (this.f2222b == null) {
            this.f2222b = new C0096b();
        }
    }

    public final boolean d(int i) {
        if (i < 64) {
            return (this.f2221a & (1 << i)) != 0;
        }
        c();
        return this.f2222b.d(i - 64);
    }

    public final void e(int i, boolean z2) {
        if (i >= 64) {
            c();
            this.f2222b.e(i - 64, z2);
            return;
        }
        long j2 = this.f2221a;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i) - 1;
        this.f2221a = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            h(i);
        } else {
            a(i);
        }
        if (z3 || this.f2222b != null) {
            c();
            this.f2222b.e(0, z3);
        }
    }

    public final boolean f(int i) {
        if (i >= 64) {
            c();
            return this.f2222b.f(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f2221a;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f2221a = j4;
        long j5 = j2 - 1;
        this.f2221a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0096b c0096b = this.f2222b;
        if (c0096b != null) {
            if (c0096b.d(0)) {
                h(63);
            }
            this.f2222b.f(0);
        }
        return z2;
    }

    public final void g() {
        this.f2221a = 0L;
        C0096b c0096b = this.f2222b;
        if (c0096b != null) {
            c0096b.g();
        }
    }

    public final void h(int i) {
        if (i < 64) {
            this.f2221a |= 1 << i;
        } else {
            c();
            this.f2222b.h(i - 64);
        }
    }

    public final String toString() {
        if (this.f2222b == null) {
            return Long.toBinaryString(this.f2221a);
        }
        return this.f2222b.toString() + "xx" + Long.toBinaryString(this.f2221a);
    }
}

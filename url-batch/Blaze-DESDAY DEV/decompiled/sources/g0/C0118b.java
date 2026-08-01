package g0;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2382a;

    /* renamed from: b, reason: collision with root package name */
    public long f2383b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2384c;

    public C0118b(E1.p pVar) {
        this.f2382a = 1;
        g1.d.e(pVar, "source");
        this.f2384c = pVar;
        this.f2383b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.f2383b &= ~(1 << i);
            return;
        }
        C0118b c0118b = (C0118b) this.f2384c;
        if (c0118b != null) {
            c0118b.a(i - 64);
        }
    }

    public int b(int i) {
        C0118b c0118b = (C0118b) this.f2384c;
        if (c0118b == null) {
            return i >= 64 ? Long.bitCount(this.f2383b) : Long.bitCount(this.f2383b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f2383b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f2383b) + c0118b.b(i - 64);
    }

    public void c() {
        if (((C0118b) this.f2384c) == null) {
            this.f2384c = new C0118b();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return (this.f2383b & (1 << i)) != 0;
        }
        c();
        return ((C0118b) this.f2384c).d(i - 64);
    }

    public void e(int i, boolean z2) {
        if (i >= 64) {
            c();
            ((C0118b) this.f2384c).e(i - 64, z2);
            return;
        }
        long j2 = this.f2383b;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i) - 1;
        this.f2383b = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            i(i);
        } else {
            a(i);
        }
        if (z3 || ((C0118b) this.f2384c) != null) {
            c();
            ((C0118b) this.f2384c).e(0, z3);
        }
    }

    public r1.k f() {
        r1.g gVar = new r1.g(1);
        while (true) {
            String o2 = ((E1.p) this.f2384c).o(this.f2383b);
            this.f2383b -= o2.length();
            if (o2.length() == 0) {
                return gVar.d();
            }
            int D2 = n1.d.D(o2, ':', 1, false, 4);
            if (D2 != -1) {
                String substring = o2.substring(0, D2);
                g1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = o2.substring(D2 + 1);
                g1.d.d(substring2, "this as java.lang.String).substring(startIndex)");
                gVar.c(substring, substring2);
            } else if (o2.charAt(0) == ':') {
                String substring3 = o2.substring(1);
                g1.d.d(substring3, "this as java.lang.String).substring(startIndex)");
                gVar.c("", substring3);
            } else {
                gVar.c("", o2);
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((C0118b) this.f2384c).g(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f2383b;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f2383b = j4;
        long j5 = j2 - 1;
        this.f2383b = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0118b c0118b = (C0118b) this.f2384c;
        if (c0118b != null) {
            if (c0118b.d(0)) {
                i(63);
            }
            ((C0118b) this.f2384c).g(0);
        }
        return z2;
    }

    public void h() {
        this.f2383b = 0L;
        C0118b c0118b = (C0118b) this.f2384c;
        if (c0118b != null) {
            c0118b.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.f2383b |= 1 << i;
        } else {
            c();
            ((C0118b) this.f2384c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.f2382a) {
            case 0:
                if (((C0118b) this.f2384c) == null) {
                    return Long.toBinaryString(this.f2383b);
                }
                return ((C0118b) this.f2384c).toString() + "xx" + Long.toBinaryString(this.f2383b);
            default:
                return super.toString();
        }
    }

    public C0118b() {
        this.f2382a = 0;
        this.f2383b = 0L;
    }
}

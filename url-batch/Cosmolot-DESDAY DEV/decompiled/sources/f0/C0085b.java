package f0;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2029a;

    /* renamed from: b, reason: collision with root package name */
    public long f2030b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2031c;

    public C0085b(v1.o oVar) {
        this.f2029a = 1;
        X0.e.e(oVar, "source");
        this.f2031c = oVar;
        this.f2030b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.f2030b &= ~(1 << i);
            return;
        }
        C0085b c0085b = (C0085b) this.f2031c;
        if (c0085b != null) {
            c0085b.a(i - 64);
        }
    }

    public int b(int i) {
        C0085b c0085b = (C0085b) this.f2031c;
        if (c0085b == null) {
            return i >= 64 ? Long.bitCount(this.f2030b) : Long.bitCount(this.f2030b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f2030b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f2030b) + c0085b.b(i - 64);
    }

    public void c() {
        if (((C0085b) this.f2031c) == null) {
            this.f2031c = new C0085b();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return (this.f2030b & (1 << i)) != 0;
        }
        c();
        return ((C0085b) this.f2031c).d(i - 64);
    }

    public void e(int i, boolean z2) {
        if (i >= 64) {
            c();
            ((C0085b) this.f2031c).e(i - 64, z2);
            return;
        }
        long j2 = this.f2030b;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i) - 1;
        this.f2030b = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            i(i);
        } else {
            a(i);
        }
        if (z3 || ((C0085b) this.f2031c) != null) {
            c();
            ((C0085b) this.f2031c).e(0, z3);
        }
    }

    public i1.k f() {
        B0.d dVar = new B0.d(27);
        while (true) {
            String m2 = ((v1.o) this.f2031c).m(this.f2030b);
            this.f2030b -= m2.length();
            if (m2.length() == 0) {
                return dVar.r();
            }
            int n02 = e1.d.n0(m2, ':', 1, false, 4);
            if (n02 != -1) {
                String substring = m2.substring(0, n02);
                X0.e.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = m2.substring(n02 + 1);
                X0.e.d(substring2, "this as java.lang.String).substring(startIndex)");
                dVar.q(substring, substring2);
            } else if (m2.charAt(0) == ':') {
                String substring3 = m2.substring(1);
                X0.e.d(substring3, "this as java.lang.String).substring(startIndex)");
                dVar.q("", substring3);
            } else {
                dVar.q("", m2);
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((C0085b) this.f2031c).g(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f2030b;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f2030b = j4;
        long j5 = j2 - 1;
        this.f2030b = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0085b c0085b = (C0085b) this.f2031c;
        if (c0085b != null) {
            if (c0085b.d(0)) {
                i(63);
            }
            ((C0085b) this.f2031c).g(0);
        }
        return z2;
    }

    public void h() {
        this.f2030b = 0L;
        C0085b c0085b = (C0085b) this.f2031c;
        if (c0085b != null) {
            c0085b.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.f2030b |= 1 << i;
        } else {
            c();
            ((C0085b) this.f2031c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.f2029a) {
            case 0:
                if (((C0085b) this.f2031c) == null) {
                    return Long.toBinaryString(this.f2030b);
                }
                return ((C0085b) this.f2031c).toString() + "xx" + Long.toBinaryString(this.f2030b);
            default:
                return super.toString();
        }
    }

    public C0085b() {
        this.f2029a = 0;
        this.f2030b = 0L;
    }
}

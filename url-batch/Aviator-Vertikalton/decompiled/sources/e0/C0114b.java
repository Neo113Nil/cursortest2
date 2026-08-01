package e0;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2193a;

    /* renamed from: b, reason: collision with root package name */
    public long f2194b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2195c;

    public C0114b(v1.q qVar) {
        this.f2193a = 1;
        X0.f.e(qVar, "source");
        this.f2195c = qVar;
        this.f2194b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.f2194b &= ~(1 << i);
            return;
        }
        C0114b c0114b = (C0114b) this.f2195c;
        if (c0114b != null) {
            c0114b.a(i - 64);
        }
    }

    public int b(int i) {
        C0114b c0114b = (C0114b) this.f2195c;
        if (c0114b == null) {
            return i >= 64 ? Long.bitCount(this.f2194b) : Long.bitCount(this.f2194b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f2194b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f2194b) + c0114b.b(i - 64);
    }

    public void c() {
        if (((C0114b) this.f2195c) == null) {
            this.f2195c = new C0114b();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return (this.f2194b & (1 << i)) != 0;
        }
        c();
        return ((C0114b) this.f2195c).d(i - 64);
    }

    public void e(int i, boolean z2) {
        if (i >= 64) {
            c();
            ((C0114b) this.f2195c).e(i - 64, z2);
            return;
        }
        long j2 = this.f2194b;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i) - 1;
        this.f2194b = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            i(i);
        } else {
            a(i);
        }
        if (z3 || ((C0114b) this.f2195c) != null) {
            c();
            ((C0114b) this.f2195c).e(0, z3);
        }
    }

    public i1.n f() {
        B0.d dVar = new B0.d(26);
        while (true) {
            String o2 = ((v1.q) this.f2195c).o(this.f2194b);
            this.f2194b -= o2.length();
            if (o2.length() == 0) {
                return dVar.t();
            }
            int E02 = e1.d.E0(o2, ':', 1, false, 4);
            if (E02 != -1) {
                String substring = o2.substring(0, E02);
                X0.f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = o2.substring(E02 + 1);
                X0.f.d(substring2, "this as java.lang.String).substring(startIndex)");
                dVar.s(substring, substring2);
            } else if (o2.charAt(0) == ':') {
                String substring3 = o2.substring(1);
                X0.f.d(substring3, "this as java.lang.String).substring(startIndex)");
                dVar.s("", substring3);
            } else {
                dVar.s("", o2);
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((C0114b) this.f2195c).g(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f2194b;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f2194b = j4;
        long j5 = j2 - 1;
        this.f2194b = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0114b c0114b = (C0114b) this.f2195c;
        if (c0114b != null) {
            if (c0114b.d(0)) {
                i(63);
            }
            ((C0114b) this.f2195c).g(0);
        }
        return z2;
    }

    public void h() {
        this.f2194b = 0L;
        C0114b c0114b = (C0114b) this.f2195c;
        if (c0114b != null) {
            c0114b.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.f2194b |= 1 << i;
        } else {
            c();
            ((C0114b) this.f2195c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.f2193a) {
            case 0:
                if (((C0114b) this.f2195c) == null) {
                    return Long.toBinaryString(this.f2194b);
                }
                return ((C0114b) this.f2195c).toString() + "xx" + Long.toBinaryString(this.f2194b);
            default:
                return super.toString();
        }
    }

    public C0114b() {
        this.f2193a = 0;
        this.f2194b = 0L;
    }
}

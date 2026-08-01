package f0;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0091b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2097a;

    /* renamed from: b, reason: collision with root package name */
    public long f2098b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2099c;

    public C0091b(x1.p pVar) {
        this.f2097a = 1;
        Z0.d.e(pVar, "source");
        this.f2099c = pVar;
        this.f2098b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.f2098b &= ~(1 << i);
            return;
        }
        C0091b c0091b = (C0091b) this.f2099c;
        if (c0091b != null) {
            c0091b.a(i - 64);
        }
    }

    public int b(int i) {
        C0091b c0091b = (C0091b) this.f2099c;
        if (c0091b == null) {
            return i >= 64 ? Long.bitCount(this.f2098b) : Long.bitCount(this.f2098b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f2098b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f2098b) + c0091b.b(i - 64);
    }

    public void c() {
        if (((C0091b) this.f2099c) == null) {
            this.f2099c = new C0091b();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return (this.f2098b & (1 << i)) != 0;
        }
        c();
        return ((C0091b) this.f2099c).d(i - 64);
    }

    public void e(int i, boolean z2) {
        if (i >= 64) {
            c();
            ((C0091b) this.f2099c).e(i - 64, z2);
            return;
        }
        long j2 = this.f2098b;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i) - 1;
        this.f2098b = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            i(i);
        } else {
            a(i);
        }
        if (z3 || ((C0091b) this.f2099c) != null) {
            c();
            ((C0091b) this.f2099c).e(0, z3);
        }
    }

    public k1.l f() {
        C.g gVar = new C.g(28);
        while (true) {
            String o2 = ((x1.p) this.f2099c).o(this.f2098b);
            this.f2098b -= o2.length();
            if (o2.length() == 0) {
                return gVar.t();
            }
            int x02 = g1.d.x0(o2, ':', 1, false, 4);
            if (x02 != -1) {
                String substring = o2.substring(0, x02);
                Z0.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = o2.substring(x02 + 1);
                Z0.d.d(substring2, "this as java.lang.String).substring(startIndex)");
                gVar.s(substring, substring2);
            } else if (o2.charAt(0) == ':') {
                String substring3 = o2.substring(1);
                Z0.d.d(substring3, "this as java.lang.String).substring(startIndex)");
                gVar.s("", substring3);
            } else {
                gVar.s("", o2);
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((C0091b) this.f2099c).g(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f2098b;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f2098b = j4;
        long j5 = j2 - 1;
        this.f2098b = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0091b c0091b = (C0091b) this.f2099c;
        if (c0091b != null) {
            if (c0091b.d(0)) {
                i(63);
            }
            ((C0091b) this.f2099c).g(0);
        }
        return z2;
    }

    public void h() {
        this.f2098b = 0L;
        C0091b c0091b = (C0091b) this.f2099c;
        if (c0091b != null) {
            c0091b.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.f2098b |= 1 << i;
        } else {
            c();
            ((C0091b) this.f2099c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.f2097a) {
            case 0:
                if (((C0091b) this.f2099c) == null) {
                    return Long.toBinaryString(this.f2098b);
                }
                return ((C0091b) this.f2099c).toString() + "xx" + Long.toBinaryString(this.f2098b);
            default:
                return super.toString();
        }
    }

    public C0091b() {
        this.f2097a = 0;
        this.f2098b = 0L;
    }
}

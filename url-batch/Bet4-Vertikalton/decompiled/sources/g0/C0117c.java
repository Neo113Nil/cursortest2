package g0;

/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2335a;

    /* renamed from: b, reason: collision with root package name */
    public long f2336b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2337c;

    public C0117c(B1.p pVar) {
        this.f2335a = 1;
        d1.d.e(pVar, "source");
        this.f2337c = pVar;
        this.f2336b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.f2336b &= ~(1 << i);
            return;
        }
        C0117c c0117c = (C0117c) this.f2337c;
        if (c0117c != null) {
            c0117c.a(i - 64);
        }
    }

    public int b(int i) {
        C0117c c0117c = (C0117c) this.f2337c;
        if (c0117c == null) {
            return i >= 64 ? Long.bitCount(this.f2336b) : Long.bitCount(this.f2336b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f2336b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f2336b) + c0117c.b(i - 64);
    }

    public void c() {
        if (((C0117c) this.f2337c) == null) {
            this.f2337c = new C0117c();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return (this.f2336b & (1 << i)) != 0;
        }
        c();
        return ((C0117c) this.f2337c).d(i - 64);
    }

    public void e(int i, boolean z2) {
        if (i >= 64) {
            c();
            ((C0117c) this.f2337c).e(i - 64, z2);
            return;
        }
        long j2 = this.f2336b;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i) - 1;
        this.f2336b = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            i(i);
        } else {
            a(i);
        }
        if (z3 || ((C0117c) this.f2337c) != null) {
            c();
            ((C0117c) this.f2337c).e(0, z3);
        }
    }

    public o1.j f() {
        l.Z z2 = new l.Z(2);
        while (true) {
            String o2 = ((B1.p) this.f2337c).o(this.f2336b);
            this.f2336b -= o2.length();
            if (o2.length() == 0) {
                return z2.g();
            }
            int D2 = k1.d.D(o2, ':', 1, false, 4);
            if (D2 != -1) {
                String substring = o2.substring(0, D2);
                d1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = o2.substring(D2 + 1);
                d1.d.d(substring2, "this as java.lang.String).substring(startIndex)");
                z2.f(substring, substring2);
            } else if (o2.charAt(0) == ':') {
                String substring3 = o2.substring(1);
                d1.d.d(substring3, "this as java.lang.String).substring(startIndex)");
                z2.f("", substring3);
            } else {
                z2.f("", o2);
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((C0117c) this.f2337c).g(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f2336b;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f2336b = j4;
        long j5 = j2 - 1;
        this.f2336b = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0117c c0117c = (C0117c) this.f2337c;
        if (c0117c != null) {
            if (c0117c.d(0)) {
                i(63);
            }
            ((C0117c) this.f2337c).g(0);
        }
        return z2;
    }

    public void h() {
        this.f2336b = 0L;
        C0117c c0117c = (C0117c) this.f2337c;
        if (c0117c != null) {
            c0117c.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.f2336b |= 1 << i;
        } else {
            c();
            ((C0117c) this.f2337c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.f2335a) {
            case 0:
                if (((C0117c) this.f2337c) == null) {
                    return Long.toBinaryString(this.f2336b);
                }
                return ((C0117c) this.f2337c).toString() + "xx" + Long.toBinaryString(this.f2336b);
            default:
                return super.toString();
        }
    }

    public C0117c() {
        this.f2335a = 0;
        this.f2336b = 0L;
    }
}

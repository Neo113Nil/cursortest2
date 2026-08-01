package f0;

import l.C0207a0;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2098a;

    /* renamed from: b, reason: collision with root package name */
    public long f2099b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2100c;

    public C0093b(z1.p pVar) {
        this.f2098a = 1;
        b1.d.e(pVar, "source");
        this.f2100c = pVar;
        this.f2099b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.f2099b &= ~(1 << i);
            return;
        }
        C0093b c0093b = (C0093b) this.f2100c;
        if (c0093b != null) {
            c0093b.a(i - 64);
        }
    }

    public int b(int i) {
        C0093b c0093b = (C0093b) this.f2100c;
        if (c0093b == null) {
            return i >= 64 ? Long.bitCount(this.f2099b) : Long.bitCount(this.f2099b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f2099b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f2099b) + c0093b.b(i - 64);
    }

    public void c() {
        if (((C0093b) this.f2100c) == null) {
            this.f2100c = new C0093b();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return (this.f2099b & (1 << i)) != 0;
        }
        c();
        return ((C0093b) this.f2100c).d(i - 64);
    }

    public void e(int i, boolean z2) {
        if (i >= 64) {
            c();
            ((C0093b) this.f2100c).e(i - 64, z2);
            return;
        }
        long j2 = this.f2099b;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i) - 1;
        this.f2099b = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            i(i);
        } else {
            a(i);
        }
        if (z3 || ((C0093b) this.f2100c) != null) {
            c();
            ((C0093b) this.f2100c).e(0, z3);
        }
    }

    public m1.j f() {
        C0207a0 c0207a0 = new C0207a0(2);
        while (true) {
            String o2 = ((z1.p) this.f2100c).o(this.f2099b);
            this.f2099b -= o2.length();
            if (o2.length() == 0) {
                return c0207a0.g();
            }
            int t02 = i1.d.t0(o2, ':', 1, false, 4);
            if (t02 != -1) {
                String substring = o2.substring(0, t02);
                b1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = o2.substring(t02 + 1);
                b1.d.d(substring2, "this as java.lang.String).substring(startIndex)");
                c0207a0.f(substring, substring2);
            } else if (o2.charAt(0) == ':') {
                String substring3 = o2.substring(1);
                b1.d.d(substring3, "this as java.lang.String).substring(startIndex)");
                c0207a0.f("", substring3);
            } else {
                c0207a0.f("", o2);
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((C0093b) this.f2100c).g(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f2099b;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f2099b = j4;
        long j5 = j2 - 1;
        this.f2099b = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0093b c0093b = (C0093b) this.f2100c;
        if (c0093b != null) {
            if (c0093b.d(0)) {
                i(63);
            }
            ((C0093b) this.f2100c).g(0);
        }
        return z2;
    }

    public void h() {
        this.f2099b = 0L;
        C0093b c0093b = (C0093b) this.f2100c;
        if (c0093b != null) {
            c0093b.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.f2099b |= 1 << i;
        } else {
            c();
            ((C0093b) this.f2100c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.f2098a) {
            case 0:
                if (((C0093b) this.f2100c) == null) {
                    return Long.toBinaryString(this.f2099b);
                }
                return ((C0093b) this.f2100c).toString() + "xx" + Long.toBinaryString(this.f2099b);
            default:
                return super.toString();
        }
    }

    public C0093b() {
        this.f2098a = 0;
        this.f2099b = 0L;
    }
}

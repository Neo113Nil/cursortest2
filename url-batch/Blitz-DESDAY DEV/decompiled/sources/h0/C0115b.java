package h0;

import l.C0176a0;

/* renamed from: h0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2454a;

    /* renamed from: b, reason: collision with root package name */
    public long f2455b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2456c;

    public C0115b(E1.p pVar) {
        this.f2454a = 1;
        g1.d.e(pVar, "source");
        this.f2456c = pVar;
        this.f2455b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.f2455b &= ~(1 << i);
            return;
        }
        C0115b c0115b = (C0115b) this.f2456c;
        if (c0115b != null) {
            c0115b.a(i - 64);
        }
    }

    public int b(int i) {
        C0115b c0115b = (C0115b) this.f2456c;
        if (c0115b == null) {
            return i >= 64 ? Long.bitCount(this.f2455b) : Long.bitCount(this.f2455b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f2455b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f2455b) + c0115b.b(i - 64);
    }

    public void c() {
        if (((C0115b) this.f2456c) == null) {
            this.f2456c = new C0115b();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return (this.f2455b & (1 << i)) != 0;
        }
        c();
        return ((C0115b) this.f2456c).d(i - 64);
    }

    public void e(int i, boolean z2) {
        if (i >= 64) {
            c();
            ((C0115b) this.f2456c).e(i - 64, z2);
            return;
        }
        long j2 = this.f2455b;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i) - 1;
        this.f2455b = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            i(i);
        } else {
            a(i);
        }
        if (z3 || ((C0115b) this.f2456c) != null) {
            c();
            ((C0115b) this.f2456c).e(0, z3);
        }
    }

    public r1.j f() {
        C0176a0 c0176a0 = new C0176a0(2);
        while (true) {
            String o2 = ((E1.p) this.f2456c).o(this.f2455b);
            this.f2455b -= o2.length();
            if (o2.length() == 0) {
                return c0176a0.g();
            }
            int G2 = n1.d.G(o2, ':', 1, false, 4);
            if (G2 != -1) {
                String substring = o2.substring(0, G2);
                g1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = o2.substring(G2 + 1);
                g1.d.d(substring2, "this as java.lang.String).substring(startIndex)");
                c0176a0.f(substring, substring2);
            } else if (o2.charAt(0) == ':') {
                String substring3 = o2.substring(1);
                g1.d.d(substring3, "this as java.lang.String).substring(startIndex)");
                c0176a0.f("", substring3);
            } else {
                c0176a0.f("", o2);
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((C0115b) this.f2456c).g(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f2455b;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f2455b = j4;
        long j5 = j2 - 1;
        this.f2455b = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0115b c0115b = (C0115b) this.f2456c;
        if (c0115b != null) {
            if (c0115b.d(0)) {
                i(63);
            }
            ((C0115b) this.f2456c).g(0);
        }
        return z2;
    }

    public void h() {
        this.f2455b = 0L;
        C0115b c0115b = (C0115b) this.f2456c;
        if (c0115b != null) {
            c0115b.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.f2455b |= 1 << i;
        } else {
            c();
            ((C0115b) this.f2456c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.f2454a) {
            case 0:
                if (((C0115b) this.f2456c) == null) {
                    return Long.toBinaryString(this.f2455b);
                }
                return ((C0115b) this.f2456c).toString() + "xx" + Long.toBinaryString(this.f2455b);
            default:
                return super.toString();
        }
    }

    public C0115b() {
        this.f2454a = 0;
        this.f2455b = 0L;
    }
}

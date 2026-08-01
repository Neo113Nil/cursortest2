package h0;

import m.C0202a0;

/* renamed from: h0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2472a;

    /* renamed from: b, reason: collision with root package name */
    public long f2473b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2474c;

    public C0120b(F1.p pVar) {
        this.f2472a = 1;
        h1.d.e(pVar, "source");
        this.f2474c = pVar;
        this.f2473b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.f2473b &= ~(1 << i);
            return;
        }
        C0120b c0120b = (C0120b) this.f2474c;
        if (c0120b != null) {
            c0120b.a(i - 64);
        }
    }

    public int b(int i) {
        C0120b c0120b = (C0120b) this.f2474c;
        if (c0120b == null) {
            return i >= 64 ? Long.bitCount(this.f2473b) : Long.bitCount(this.f2473b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f2473b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f2473b) + c0120b.b(i - 64);
    }

    public void c() {
        if (((C0120b) this.f2474c) == null) {
            this.f2474c = new C0120b();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return (this.f2473b & (1 << i)) != 0;
        }
        c();
        return ((C0120b) this.f2474c).d(i - 64);
    }

    public void e(int i, boolean z2) {
        if (i >= 64) {
            c();
            ((C0120b) this.f2474c).e(i - 64, z2);
            return;
        }
        long j2 = this.f2473b;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i) - 1;
        this.f2473b = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            i(i);
        } else {
            a(i);
        }
        if (z3 || ((C0120b) this.f2474c) != null) {
            c();
            ((C0120b) this.f2474c).e(0, z3);
        }
    }

    public s1.j f() {
        C0202a0 c0202a0 = new C0202a0(2);
        while (true) {
            String o2 = ((F1.p) this.f2474c).o(this.f2473b);
            this.f2473b -= o2.length();
            if (o2.length() == 0) {
                return c0202a0.g();
            }
            int D2 = o1.d.D(o2, ':', 1, false, 4);
            if (D2 != -1) {
                String substring = o2.substring(0, D2);
                h1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = o2.substring(D2 + 1);
                h1.d.d(substring2, "this as java.lang.String).substring(startIndex)");
                c0202a0.f(substring, substring2);
            } else if (o2.charAt(0) == ':') {
                String substring3 = o2.substring(1);
                h1.d.d(substring3, "this as java.lang.String).substring(startIndex)");
                c0202a0.f("", substring3);
            } else {
                c0202a0.f("", o2);
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((C0120b) this.f2474c).g(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f2473b;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f2473b = j4;
        long j5 = j2 - 1;
        this.f2473b = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0120b c0120b = (C0120b) this.f2474c;
        if (c0120b != null) {
            if (c0120b.d(0)) {
                i(63);
            }
            ((C0120b) this.f2474c).g(0);
        }
        return z2;
    }

    public void h() {
        this.f2473b = 0L;
        C0120b c0120b = (C0120b) this.f2474c;
        if (c0120b != null) {
            c0120b.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.f2473b |= 1 << i;
        } else {
            c();
            ((C0120b) this.f2474c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.f2472a) {
            case 0:
                if (((C0120b) this.f2474c) == null) {
                    return Long.toBinaryString(this.f2473b);
                }
                return ((C0120b) this.f2474c).toString() + "xx" + Long.toBinaryString(this.f2473b);
            default:
                return super.toString();
        }
    }

    public C0120b() {
        this.f2472a = 0;
        this.f2473b = 0L;
    }
}

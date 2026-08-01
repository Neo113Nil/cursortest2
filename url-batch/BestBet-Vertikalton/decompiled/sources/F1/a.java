package F1;

import M1.p;
import k.C0191o;
import z1.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268a;

    /* renamed from: b, reason: collision with root package name */
    public long f269b;

    /* renamed from: c, reason: collision with root package name */
    public Object f270c;

    public a(p pVar) {
        this.f268a = 0;
        k1.e.e(pVar, "source");
        this.f270c = pVar;
        this.f269b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.f269b &= ~(1 << i);
            return;
        }
        a aVar = (a) this.f270c;
        if (aVar != null) {
            aVar.a(i - 64);
        }
    }

    public int b(int i) {
        a aVar = (a) this.f270c;
        if (aVar == null) {
            return i >= 64 ? Long.bitCount(this.f269b) : Long.bitCount(this.f269b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f269b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f269b) + aVar.b(i - 64);
    }

    public void c() {
        if (((a) this.f270c) == null) {
            this.f270c = new a();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return (this.f269b & (1 << i)) != 0;
        }
        c();
        return ((a) this.f270c).d(i - 64);
    }

    public void e(int i, boolean z2) {
        if (i >= 64) {
            c();
            ((a) this.f270c).e(i - 64, z2);
            return;
        }
        long j2 = this.f269b;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i) - 1;
        this.f269b = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            i(i);
        } else {
            a(i);
        }
        if (z3 || ((a) this.f270c) != null) {
            c();
            ((a) this.f270c).e(0, z3);
        }
    }

    public j f() {
        C0191o c0191o = new C0191o(7);
        while (true) {
            String u2 = ((p) this.f270c).u(this.f269b);
            this.f269b -= u2.length();
            if (u2.length() == 0) {
                return c0191o.j();
            }
            int I2 = r1.d.I(u2, ':', 1, false, 4);
            if (I2 != -1) {
                String substring = u2.substring(0, I2);
                k1.e.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = u2.substring(I2 + 1);
                k1.e.d(substring2, "this as java.lang.String).substring(startIndex)");
                c0191o.i(substring, substring2);
            } else if (u2.charAt(0) == ':') {
                String substring3 = u2.substring(1);
                k1.e.d(substring3, "this as java.lang.String).substring(startIndex)");
                c0191o.i("", substring3);
            } else {
                c0191o.i("", u2);
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((a) this.f270c).g(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f269b;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f269b = j4;
        long j5 = j2 - 1;
        this.f269b = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        a aVar = (a) this.f270c;
        if (aVar != null) {
            if (aVar.d(0)) {
                i(63);
            }
            ((a) this.f270c).g(0);
        }
        return z2;
    }

    public void h() {
        this.f269b = 0L;
        a aVar = (a) this.f270c;
        if (aVar != null) {
            aVar.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.f269b |= 1 << i;
        } else {
            c();
            ((a) this.f270c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.f268a) {
            case 1:
                if (((a) this.f270c) == null) {
                    return Long.toBinaryString(this.f269b);
                }
                return ((a) this.f270c).toString() + "xx" + Long.toBinaryString(this.f269b);
            default:
                return super.toString();
        }
    }

    public a() {
        this.f268a = 1;
        this.f269b = 0L;
    }
}

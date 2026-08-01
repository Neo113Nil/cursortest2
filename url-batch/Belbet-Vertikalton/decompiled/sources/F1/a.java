package F1;

import M1.p;
import j1.h;
import n.C0288n;
import z1.m;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316a;

    /* renamed from: b, reason: collision with root package name */
    public long f317b;

    /* renamed from: c, reason: collision with root package name */
    public Object f318c;

    public a(p pVar) {
        this.f316a = 0;
        h.e(pVar, "source");
        this.f318c = pVar;
        this.f317b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.f317b &= ~(1 << i);
            return;
        }
        a aVar = (a) this.f318c;
        if (aVar != null) {
            aVar.a(i - 64);
        }
    }

    public int b(int i) {
        a aVar = (a) this.f318c;
        if (aVar == null) {
            return i >= 64 ? Long.bitCount(this.f317b) : Long.bitCount(this.f317b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f317b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f317b) + aVar.b(i - 64);
    }

    public void c() {
        if (((a) this.f318c) == null) {
            this.f318c = new a();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return (this.f317b & (1 << i)) != 0;
        }
        c();
        return ((a) this.f318c).d(i - 64);
    }

    public void e(int i, boolean z2) {
        if (i >= 64) {
            c();
            ((a) this.f318c).e(i - 64, z2);
            return;
        }
        long j = this.f317b;
        boolean z3 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f317b = ((j & (~j2)) << 1) | (j & j2);
        if (z2) {
            i(i);
        } else {
            a(i);
        }
        if (z3 || ((a) this.f318c) != null) {
            c();
            ((a) this.f318c).e(0, z3);
        }
    }

    public m f() {
        C0288n c0288n = new C0288n(8);
        while (true) {
            String G2 = ((p) this.f318c).G(this.f317b);
            this.f317b -= G2.length();
            if (G2.length() == 0) {
                return c0288n.i();
            }
            int y02 = q1.e.y0(G2, ':', 1, false, 4);
            if (y02 != -1) {
                String substring = G2.substring(0, y02);
                h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = G2.substring(y02 + 1);
                h.d(substring2, "this as java.lang.String).substring(startIndex)");
                c0288n.h(substring, substring2);
            } else if (G2.charAt(0) == ':') {
                String substring3 = G2.substring(1);
                h.d(substring3, "this as java.lang.String).substring(startIndex)");
                c0288n.h("", substring3);
            } else {
                c0288n.h("", G2);
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((a) this.f318c).g(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f317b;
        boolean z2 = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f317b = j3;
        long j4 = j - 1;
        this.f317b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        a aVar = (a) this.f318c;
        if (aVar != null) {
            if (aVar.d(0)) {
                i(63);
            }
            ((a) this.f318c).g(0);
        }
        return z2;
    }

    public void h() {
        this.f317b = 0L;
        a aVar = (a) this.f318c;
        if (aVar != null) {
            aVar.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.f317b |= 1 << i;
        } else {
            c();
            ((a) this.f318c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.f316a) {
            case 1:
                if (((a) this.f318c) == null) {
                    return Long.toBinaryString(this.f317b);
                }
                return ((a) this.f318c).toString() + "xx" + Long.toBinaryString(this.f317b);
            default:
                return super.toString();
        }
    }

    public a() {
        this.f316a = 1;
        this.f317b = 0L;
    }
}

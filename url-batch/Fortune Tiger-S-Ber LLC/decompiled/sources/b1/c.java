package b1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f743a;

    /* renamed from: b, reason: collision with root package name */
    public long f744b;
    public Object c;

    public c(p3.h hVar) {
        this.f743a = 1;
        u2.c.e(hVar, "source");
        this.c = hVar;
        this.f744b = 262144L;
    }

    public void a(int i4) {
        if (i4 < 64) {
            this.f744b &= ~(1 << i4);
            return;
        }
        c cVar = (c) this.c;
        if (cVar != null) {
            cVar.a(i4 - 64);
        }
    }

    public int b(int i4) {
        c cVar = (c) this.c;
        if (cVar == null) {
            return i4 >= 64 ? Long.bitCount(this.f744b) : Long.bitCount(this.f744b & ((1 << i4) - 1));
        }
        if (i4 < 64) {
            return Long.bitCount(this.f744b & ((1 << i4) - 1));
        }
        return Long.bitCount(this.f744b) + cVar.b(i4 - 64);
    }

    public void c() {
        if (((c) this.c) == null) {
            this.c = new c();
        }
    }

    public boolean d(int i4) {
        if (i4 < 64) {
            return (this.f744b & (1 << i4)) != 0;
        }
        c();
        return ((c) this.c).d(i4 - 64);
    }

    public void e(int i4, boolean z3) {
        if (i4 >= 64) {
            c();
            ((c) this.c).e(i4 - 64, z3);
            return;
        }
        long j4 = this.f744b;
        boolean z4 = (Long.MIN_VALUE & j4) != 0;
        long j5 = (1 << i4) - 1;
        this.f744b = ((j4 & (~j5)) << 1) | (j4 & j5);
        if (z3) {
            i(i4);
        } else {
            a(i4);
        }
        if (z4 || ((c) this.c) != null) {
            c();
            ((c) this.c).e(0, z4);
        }
    }

    public c3.k f() {
        a2.e eVar = new a2.e(10);
        while (true) {
            String h = ((p3.h) this.c).h(this.f744b);
            this.f744b -= h.length();
            if (h.length() == 0) {
                return eVar.u();
            }
            int g02 = b3.e.g0(h, ':', 1, 4);
            if (g02 != -1) {
                String substring = h.substring(0, g02);
                u2.c.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = h.substring(g02 + 1);
                u2.c.d(substring2, "this as java.lang.String).substring(startIndex)");
                eVar.t(substring, substring2);
            } else if (h.charAt(0) == ':') {
                String substring3 = h.substring(1);
                u2.c.d(substring3, "this as java.lang.String).substring(startIndex)");
                eVar.t("", substring3);
            } else {
                eVar.t("", h);
            }
        }
    }

    public boolean g(int i4) {
        if (i4 >= 64) {
            c();
            return ((c) this.c).g(i4 - 64);
        }
        long j4 = 1 << i4;
        long j5 = this.f744b;
        boolean z3 = (j5 & j4) != 0;
        long j6 = j5 & (~j4);
        this.f744b = j6;
        long j7 = j4 - 1;
        this.f744b = (j6 & j7) | Long.rotateRight((~j7) & j6, 1);
        c cVar = (c) this.c;
        if (cVar != null) {
            if (cVar.d(0)) {
                i(63);
            }
            ((c) this.c).g(0);
        }
        return z3;
    }

    public void h() {
        this.f744b = 0L;
        c cVar = (c) this.c;
        if (cVar != null) {
            cVar.h();
        }
    }

    public void i(int i4) {
        if (i4 < 64) {
            this.f744b |= 1 << i4;
        } else {
            c();
            ((c) this.c).i(i4 - 64);
        }
    }

    public String toString() {
        switch (this.f743a) {
            case 0:
                if (((c) this.c) == null) {
                    return Long.toBinaryString(this.f744b);
                }
                return ((c) this.c).toString() + "xx" + Long.toBinaryString(this.f744b);
            default:
                return super.toString();
        }
    }

    public c() {
        this.f743a = 0;
        this.f744b = 0L;
    }
}

package f0;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2140a;

    /* renamed from: b, reason: collision with root package name */
    public long f2141b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2142c;

    public C0088b(z1.p pVar) {
        this.f2140a = 1;
        b1.d.e(pVar, "source");
        this.f2142c = pVar;
        this.f2141b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.f2141b &= ~(1 << i);
            return;
        }
        C0088b c0088b = (C0088b) this.f2142c;
        if (c0088b != null) {
            c0088b.a(i - 64);
        }
    }

    public int b(int i) {
        C0088b c0088b = (C0088b) this.f2142c;
        if (c0088b == null) {
            return i >= 64 ? Long.bitCount(this.f2141b) : Long.bitCount(this.f2141b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f2141b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f2141b) + c0088b.b(i - 64);
    }

    public void c() {
        if (((C0088b) this.f2142c) == null) {
            this.f2142c = new C0088b();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return (this.f2141b & (1 << i)) != 0;
        }
        c();
        return ((C0088b) this.f2142c).d(i - 64);
    }

    public void e(int i, boolean z2) {
        if (i >= 64) {
            c();
            ((C0088b) this.f2142c).e(i - 64, z2);
            return;
        }
        long j2 = this.f2141b;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i) - 1;
        this.f2141b = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            i(i);
        } else {
            a(i);
        }
        if (z3 || ((C0088b) this.f2142c) != null) {
            c();
            ((C0088b) this.f2142c).e(0, z3);
        }
    }

    public m1.k f() {
        m1.g gVar = new m1.g(1);
        while (true) {
            String o2 = ((z1.p) this.f2142c).o(this.f2141b);
            this.f2141b -= o2.length();
            if (o2.length() == 0) {
                return gVar.d();
            }
            int B02 = i1.d.B0(o2, ':', 1, false, 4);
            if (B02 != -1) {
                String substring = o2.substring(0, B02);
                b1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = o2.substring(B02 + 1);
                b1.d.d(substring2, "this as java.lang.String).substring(startIndex)");
                gVar.c(substring, substring2);
            } else if (o2.charAt(0) == ':') {
                String substring3 = o2.substring(1);
                b1.d.d(substring3, "this as java.lang.String).substring(startIndex)");
                gVar.c("", substring3);
            } else {
                gVar.c("", o2);
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((C0088b) this.f2142c).g(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f2141b;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f2141b = j4;
        long j5 = j2 - 1;
        this.f2141b = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0088b c0088b = (C0088b) this.f2142c;
        if (c0088b != null) {
            if (c0088b.d(0)) {
                i(63);
            }
            ((C0088b) this.f2142c).g(0);
        }
        return z2;
    }

    public void h() {
        this.f2141b = 0L;
        C0088b c0088b = (C0088b) this.f2142c;
        if (c0088b != null) {
            c0088b.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.f2141b |= 1 << i;
        } else {
            c();
            ((C0088b) this.f2142c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.f2140a) {
            case 0:
                if (((C0088b) this.f2142c) == null) {
                    return Long.toBinaryString(this.f2141b);
                }
                return ((C0088b) this.f2142c).toString() + "xx" + Long.toBinaryString(this.f2141b);
            default:
                return super.toString();
        }
    }

    public C0088b() {
        this.f2140a = 0;
        this.f2141b = 0L;
    }
}

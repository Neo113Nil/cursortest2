package f0;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2165a;

    /* renamed from: b, reason: collision with root package name */
    public long f2166b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2167c;

    public C0092b(C1.p pVar) {
        this.f2165a = 1;
        e1.d.e(pVar, "source");
        this.f2167c = pVar;
        this.f2166b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.f2166b &= ~(1 << i);
            return;
        }
        C0092b c0092b = (C0092b) this.f2167c;
        if (c0092b != null) {
            c0092b.a(i - 64);
        }
    }

    public int b(int i) {
        C0092b c0092b = (C0092b) this.f2167c;
        if (c0092b == null) {
            return i >= 64 ? Long.bitCount(this.f2166b) : Long.bitCount(this.f2166b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f2166b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f2166b) + c0092b.b(i - 64);
    }

    public void c() {
        if (((C0092b) this.f2167c) == null) {
            this.f2167c = new C0092b();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return (this.f2166b & (1 << i)) != 0;
        }
        c();
        return ((C0092b) this.f2167c).d(i - 64);
    }

    public void e(int i, boolean z2) {
        if (i >= 64) {
            c();
            ((C0092b) this.f2167c).e(i - 64, z2);
            return;
        }
        long j2 = this.f2166b;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i) - 1;
        this.f2166b = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            i(i);
        } else {
            a(i);
        }
        if (z3 || ((C0092b) this.f2167c) != null) {
            c();
            ((C0092b) this.f2167c).e(0, z3);
        }
    }

    public p1.k f() {
        p1.g gVar = new p1.g(1);
        while (true) {
            String o2 = ((C1.p) this.f2167c).o(this.f2166b);
            this.f2166b -= o2.length();
            if (o2.length() == 0) {
                return gVar.d();
            }
            int z2 = l1.d.z(o2, ':', 1, false, 4);
            if (z2 != -1) {
                String substring = o2.substring(0, z2);
                e1.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = o2.substring(z2 + 1);
                e1.d.d(substring2, "this as java.lang.String).substring(startIndex)");
                gVar.c(substring, substring2);
            } else if (o2.charAt(0) == ':') {
                String substring3 = o2.substring(1);
                e1.d.d(substring3, "this as java.lang.String).substring(startIndex)");
                gVar.c("", substring3);
            } else {
                gVar.c("", o2);
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((C0092b) this.f2167c).g(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f2166b;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f2166b = j4;
        long j5 = j2 - 1;
        this.f2166b = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0092b c0092b = (C0092b) this.f2167c;
        if (c0092b != null) {
            if (c0092b.d(0)) {
                i(63);
            }
            ((C0092b) this.f2167c).g(0);
        }
        return z2;
    }

    public void h() {
        this.f2166b = 0L;
        C0092b c0092b = (C0092b) this.f2167c;
        if (c0092b != null) {
            c0092b.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.f2166b |= 1 << i;
        } else {
            c();
            ((C0092b) this.f2167c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.f2165a) {
            case 0:
                if (((C0092b) this.f2167c) == null) {
                    return Long.toBinaryString(this.f2166b);
                }
                return ((C0092b) this.f2167c).toString() + "xx" + Long.toBinaryString(this.f2166b);
            default:
                return super.toString();
        }
    }

    public C0092b() {
        this.f2165a = 0;
        this.f2166b = 0L;
    }
}

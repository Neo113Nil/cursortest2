package g1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1660a;

    /* renamed from: b, reason: collision with root package name */
    public long f1661b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1662c;

    public g(g4.h hVar) {
        this.f1660a = 1;
        i3.d.e(hVar, "source");
        this.f1662c = hVar;
        this.f1661b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.f1661b &= ~(1 << i);
            return;
        }
        g gVar = (g) this.f1662c;
        if (gVar != null) {
            gVar.a(i - 64);
        }
    }

    public int b(int i) {
        g gVar = (g) this.f1662c;
        if (gVar == null) {
            return i >= 64 ? Long.bitCount(this.f1661b) : Long.bitCount(this.f1661b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f1661b & ((1 << i) - 1));
        }
        return Long.bitCount(this.f1661b) + gVar.b(i - 64);
    }

    public void c() {
        if (((g) this.f1662c) == null) {
            this.f1662c = new g();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return (this.f1661b & (1 << i)) != 0;
        }
        c();
        return ((g) this.f1662c).d(i - 64);
    }

    public void e(int i, boolean z4) {
        if (i >= 64) {
            c();
            ((g) this.f1662c).e(i - 64, z4);
            return;
        }
        long j2 = this.f1661b;
        boolean z5 = (Long.MIN_VALUE & j2) != 0;
        long j4 = (1 << i) - 1;
        this.f1661b = ((j2 & (~j4)) << 1) | (j2 & j4);
        if (z4) {
            i(i);
        } else {
            a(i);
        }
        if (z5 || ((g) this.f1662c) != null) {
            c();
            ((g) this.f1662c).e(0, z5);
        }
    }

    public t3.j f() {
        q3.a aVar = new q3.a(5);
        while (true) {
            String g3 = ((g4.h) this.f1662c).g(this.f1661b);
            this.f1661b -= g3.length();
            if (g3.length() == 0) {
                return aVar.f();
            }
            int w02 = p3.d.w0(g3, ':', 1, 4);
            if (w02 != -1) {
                String substring = g3.substring(0, w02);
                i3.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = g3.substring(w02 + 1);
                i3.d.d(substring2, "this as java.lang.String).substring(startIndex)");
                aVar.e(substring, substring2);
            } else if (g3.charAt(0) == ':') {
                String substring3 = g3.substring(1);
                i3.d.d(substring3, "this as java.lang.String).substring(startIndex)");
                aVar.e("", substring3);
            } else {
                aVar.e("", g3);
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((g) this.f1662c).g(i - 64);
        }
        long j2 = 1 << i;
        long j4 = this.f1661b;
        boolean z4 = (j4 & j2) != 0;
        long j5 = j4 & (~j2);
        this.f1661b = j5;
        long j6 = j2 - 1;
        this.f1661b = (j5 & j6) | Long.rotateRight((~j6) & j5, 1);
        g gVar = (g) this.f1662c;
        if (gVar != null) {
            if (gVar.d(0)) {
                i(63);
            }
            ((g) this.f1662c).g(0);
        }
        return z4;
    }

    public void h() {
        this.f1661b = 0L;
        g gVar = (g) this.f1662c;
        if (gVar != null) {
            gVar.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.f1661b |= 1 << i;
        } else {
            c();
            ((g) this.f1662c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.f1660a) {
            case 0:
                if (((g) this.f1662c) == null) {
                    return Long.toBinaryString(this.f1661b);
                }
                return ((g) this.f1662c).toString() + "xx" + Long.toBinaryString(this.f1661b);
            default:
                return super.toString();
        }
    }

    public g() {
        this.f1660a = 0;
        this.f1661b = 0L;
    }
}

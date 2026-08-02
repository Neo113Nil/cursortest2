package G0;

import G3.m;
import G3.n;
import W.J;
import a.AbstractC0124a;
import d0.i;
import w3.AbstractC1510g;
import y0.D;
import y0.F;
import y0.j;
import y0.o;
import y0.p;
import y0.y;

/* loaded from: classes.dex */
public final class c implements i, o, p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f827a;

    /* renamed from: b, reason: collision with root package name */
    public long f828b;

    /* renamed from: c, reason: collision with root package name */
    public Object f829c;

    public /* synthetic */ c(long j4, Object obj, int i4) {
        this.f827a = i4;
        this.f828b = j4;
        this.f829c = obj;
    }

    @Override // d0.i
    public long A() {
        return 0L;
    }

    @Override // d0.i
    public long C(long j4) {
        return ((j) this.f829c).f16160a;
    }

    @Override // d0.i
    public long D(long j4, long j5) {
        return ((j) this.f829c).f16160a;
    }

    @Override // y0.o
    public void E(byte[] bArr, int i4, int i5) {
        ((o) this.f829c).E(bArr, i4, i5);
    }

    public int F(int i4) {
        c cVar = (c) this.f829c;
        if (cVar == null) {
            return i4 >= 64 ? Long.bitCount(this.f828b) : Long.bitCount(this.f828b & ((1 << i4) - 1));
        }
        if (i4 < 64) {
            return Long.bitCount(this.f828b & ((1 << i4) - 1));
        }
        return Long.bitCount(this.f828b) + cVar.F(i4 - 64);
    }

    public boolean G(int i4) {
        if (i4 < 64) {
            return (this.f828b & (1 << i4)) != 0;
        }
        if (((c) this.f829c) == null) {
            this.f829c = new c();
        }
        return ((c) this.f829c).G(i4 - 64);
    }

    public n H() {
        m mVar = new m(0);
        while (true) {
            String g4 = ((T3.i) this.f829c).g(this.f828b);
            this.f828b -= g4.length();
            if (g4.length() == 0) {
                return mVar.g();
            }
            int g02 = AbstractC1510g.g0(g4, ':', 1, 4);
            if (g02 != -1) {
                String substring = g4.substring(0, g02);
                kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = g4.substring(g02 + 1);
                kotlin.jvm.internal.i.d(substring2, "this as java.lang.String).substring(startIndex)");
                mVar.f(substring, substring2);
            } else if (g4.charAt(0) == ':') {
                String substring3 = g4.substring(1);
                kotlin.jvm.internal.i.d(substring3, "this as java.lang.String).substring(startIndex)");
                mVar.f("", substring3);
            } else {
                mVar.f("", g4);
            }
        }
    }

    public void I() {
        this.f828b = 0L;
        c cVar = (c) this.f829c;
        if (cVar != null) {
            cVar.I();
        }
    }

    @Override // d0.i
    public long a(long j4) {
        return ((j) this.f829c).f16164e[(int) j4] - this.f828b;
    }

    @Override // y0.o
    public boolean d(byte[] bArr, int i4, int i5, boolean z) {
        return ((o) this.f829c).d(bArr, 0, i5, z);
    }

    @Override // d0.i
    public long f(long j4, long j5) {
        return ((j) this.f829c).f16163d[(int) j4];
    }

    @Override // d0.i
    public long g(long j4, long j5) {
        return 0L;
    }

    @Override // y0.o
    public long getLength() {
        return ((o) this.f829c).getLength() - this.f828b;
    }

    @Override // y0.o
    public long getPosition() {
        return ((o) this.f829c).getPosition() - this.f828b;
    }

    @Override // d0.i
    public long h(long j4, long j5) {
        return -9223372036854775807L;
    }

    @Override // d0.i
    public e0.j i(long j4) {
        return new e0.j(((j) this.f829c).f16162c[(int) j4], r1.f16161b[r7], null);
    }

    @Override // y0.o
    public boolean k(int i4, boolean z) {
        return ((o) this.f829c).k(i4, true);
    }

    @Override // y0.o
    public boolean l(byte[] bArr, int i4, int i5, boolean z) {
        return ((o) this.f829c).l(bArr, i4, i5, z);
    }

    @Override // y0.o
    public long m() {
        return ((o) this.f829c).m() - this.f828b;
    }

    @Override // y0.o
    public void o(int i4) {
        ((o) this.f829c).o(i4);
    }

    @Override // d0.i
    public long p(long j4, long j5) {
        j jVar = (j) this.f829c;
        return J.f(jVar.f16164e, j4 + this.f828b, true);
    }

    @Override // y0.o
    public int q(int i4) {
        return ((o) this.f829c).q(i4);
    }

    @Override // y0.p
    public void r() {
        ((p) this.f829c).r();
    }

    @Override // T.InterfaceC0090h
    public int read(byte[] bArr, int i4, int i5) {
        return ((o) this.f829c).read(bArr, i4, i5);
    }

    @Override // y0.o
    public void readFully(byte[] bArr, int i4, int i5) {
        ((o) this.f829c).readFully(bArr, i4, i5);
    }

    @Override // y0.o
    public int s(byte[] bArr, int i4, int i5) {
        return ((o) this.f829c).s(bArr, i4, i5);
    }

    public String toString() {
        switch (this.f827a) {
            case 3:
                if (((c) this.f829c) == null) {
                    return Long.toBinaryString(this.f828b);
                }
                return ((c) this.f829c).toString() + "xx" + Long.toBinaryString(this.f828b);
            default:
                return super.toString();
        }
    }

    @Override // y0.o
    public void u() {
        ((o) this.f829c).u();
    }

    @Override // y0.o
    public void v(int i4) {
        ((o) this.f829c).v(i4);
    }

    @Override // d0.i
    public boolean w() {
        return true;
    }

    @Override // y0.p
    public void x(y yVar) {
        ((p) this.f829c).x(new D(this, yVar, yVar));
    }

    @Override // y0.p
    public F z(int i4, int i5) {
        return ((p) this.f829c).z(i4, i5);
    }

    public /* synthetic */ c(Object obj, long j4, int i4) {
        this.f827a = i4;
        this.f829c = obj;
        this.f828b = j4;
    }

    public c(T3.i source) {
        this.f827a = 1;
        kotlin.jvm.internal.i.e(source, "source");
        this.f829c = source;
        this.f828b = 262144L;
    }

    public c(o oVar, long j4) {
        this.f827a = 5;
        this.f829c = oVar;
        AbstractC0124a.h(oVar.getPosition() >= j4);
        this.f828b = j4;
    }

    public c() {
        this.f827a = 3;
        this.f828b = 0L;
    }
}

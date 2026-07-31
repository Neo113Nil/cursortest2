package c1;

import java.util.ArrayDeque;
import r0.n2;
import w0.m;

/* loaded from: classes.dex */
final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f1743a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<b> f1744b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private final g f1745c = new g();

    /* renamed from: d, reason: collision with root package name */
    private c1.b f1746d;

    /* renamed from: e, reason: collision with root package name */
    private int f1747e;

    /* renamed from: f, reason: collision with root package name */
    private int f1748f;

    /* renamed from: g, reason: collision with root package name */
    private long f1749g;

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f1750a;

        /* renamed from: b, reason: collision with root package name */
        private final long f1751b;

        private b(int i7, long j7) {
            this.f1750a = i7;
            this.f1751b = j7;
        }
    }

    private long d(m mVar) {
        mVar.h();
        while (true) {
            mVar.n(this.f1743a, 0, 4);
            int c7 = g.c(this.f1743a[0]);
            if (c7 != -1 && c7 <= 4) {
                int a7 = (int) g.a(this.f1743a, c7, false);
                if (this.f1746d.d(a7)) {
                    mVar.i(c7);
                    return a7;
                }
            }
            mVar.i(1);
        }
    }

    private double e(m mVar, int i7) {
        return i7 == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(f(mVar, i7));
    }

    private long f(m mVar, int i7) {
        mVar.readFully(this.f1743a, 0, i7);
        long j7 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j7 = (j7 << 8) | (this.f1743a[i8] & 255);
        }
        return j7;
    }

    private static String g(m mVar, int i7) {
        if (i7 == 0) {
            return "";
        }
        byte[] bArr = new byte[i7];
        mVar.readFully(bArr, 0, i7);
        while (i7 > 0 && bArr[i7 - 1] == 0) {
            i7--;
        }
        return new String(bArr, 0, i7);
    }

    @Override // c1.c
    public void a() {
        this.f1747e = 0;
        this.f1744b.clear();
        this.f1745c.e();
    }

    @Override // c1.c
    public boolean b(m mVar) {
        o2.a.h(this.f1746d);
        while (true) {
            b peek = this.f1744b.peek();
            if (peek != null && mVar.p() >= peek.f1751b) {
                this.f1746d.a(this.f1744b.pop().f1750a);
                return true;
            }
            if (this.f1747e == 0) {
                long d7 = this.f1745c.d(mVar, true, false, 4);
                if (d7 == -2) {
                    d7 = d(mVar);
                }
                if (d7 == -1) {
                    return false;
                }
                this.f1748f = (int) d7;
                this.f1747e = 1;
            }
            if (this.f1747e == 1) {
                this.f1749g = this.f1745c.d(mVar, false, true, 8);
                this.f1747e = 2;
            }
            int b7 = this.f1746d.b(this.f1748f);
            if (b7 != 0) {
                if (b7 == 1) {
                    long p7 = mVar.p();
                    this.f1744b.push(new b(this.f1748f, this.f1749g + p7));
                    this.f1746d.g(this.f1748f, p7, this.f1749g);
                    this.f1747e = 0;
                    return true;
                }
                if (b7 == 2) {
                    long j7 = this.f1749g;
                    if (j7 <= 8) {
                        this.f1746d.h(this.f1748f, f(mVar, (int) j7));
                        this.f1747e = 0;
                        return true;
                    }
                    throw n2.a("Invalid integer size: " + this.f1749g, null);
                }
                if (b7 == 3) {
                    long j8 = this.f1749g;
                    if (j8 <= 2147483647L) {
                        this.f1746d.f(this.f1748f, g(mVar, (int) j8));
                        this.f1747e = 0;
                        return true;
                    }
                    throw n2.a("String element size: " + this.f1749g, null);
                }
                if (b7 == 4) {
                    this.f1746d.e(this.f1748f, (int) this.f1749g, mVar);
                    this.f1747e = 0;
                    return true;
                }
                if (b7 != 5) {
                    throw n2.a("Invalid element type " + b7, null);
                }
                long j9 = this.f1749g;
                if (j9 == 4 || j9 == 8) {
                    this.f1746d.c(this.f1748f, e(mVar, (int) j9));
                    this.f1747e = 0;
                    return true;
                }
                throw n2.a("Invalid float size: " + this.f1749g, null);
            }
            mVar.i((int) this.f1749g);
            this.f1747e = 0;
        }
    }

    @Override // c1.c
    public void c(c1.b bVar) {
        this.f1746d = bVar;
    }
}

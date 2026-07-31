package S2;

import S2.d;
import S2.f;
import java.math.BigInteger;
import java.util.Random;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    protected X2.a f9245a;

    /* renamed from: b, reason: collision with root package name */
    protected S2.d f9246b;

    /* renamed from: c, reason: collision with root package name */
    protected S2.d f9247c;

    /* renamed from: d, reason: collision with root package name */
    protected BigInteger f9248d;

    /* renamed from: e, reason: collision with root package name */
    protected BigInteger f9249e;

    /* renamed from: f, reason: collision with root package name */
    protected int f9250f = 0;

    /* renamed from: g, reason: collision with root package name */
    protected W2.a f9251g = null;

    public static abstract class a extends c {

        /* renamed from: h, reason: collision with root package name */
        private BigInteger[] f9252h;

        protected a(int i4, int i5, int i6, int i7) {
            super(y(i4, i5, i6, i7));
            this.f9252h = null;
        }

        private static X2.a y(int i4, int i5, int i6, int i7) {
            if (i5 == 0) {
                throw new IllegalArgumentException("k1 must be > 0");
            }
            if (i6 == 0) {
                if (i7 == 0) {
                    return X2.b.a(new int[]{0, i5, i4});
                }
                throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
            }
            if (i6 <= i5) {
                throw new IllegalArgumentException("k2 must be > k1");
            }
            if (i7 > i6) {
                return X2.b.a(new int[]{0, i5, i6, i7, i4});
            }
            throw new IllegalArgumentException("k3 must be > k2");
        }

        private S2.d z(S2.d dVar) {
            S2.d dVar2;
            if (dVar.h()) {
                return dVar;
            }
            S2.d j4 = j(S2.b.f9239a);
            int p4 = p();
            Random random = new Random();
            do {
                S2.d j5 = j(new BigInteger(p4, random));
                S2.d dVar3 = dVar;
                dVar2 = j4;
                for (int i4 = 1; i4 < p4; i4++) {
                    S2.d n4 = dVar3.n();
                    dVar2 = dVar2.n().a(n4.i(j5));
                    dVar3 = n4.a(dVar);
                }
                if (!dVar3.h()) {
                    return null;
                }
            } while (dVar2.n().a(dVar2).h());
            return dVar2;
        }

        @Override // S2.c
        public f e(BigInteger bigInteger, BigInteger bigInteger2, boolean z4) {
            S2.d j4 = j(bigInteger);
            S2.d j5 = j(bigInteger2);
            int n4 = n();
            if (n4 == 5 || n4 == 6) {
                if (!j4.h()) {
                    j5 = j5.d(j4).a(j4);
                } else if (!j5.n().equals(l())) {
                    throw new IllegalArgumentException();
                }
            }
            return f(j4, j5, z4);
        }

        @Override // S2.c
        protected f h(int i4, BigInteger bigInteger) {
            S2.d dVar;
            S2.d j4 = j(bigInteger);
            if (j4.h()) {
                dVar = l().m();
            } else {
                S2.d z4 = z(j4.n().f().i(l()).a(k()).a(j4));
                if (z4 != null) {
                    if (z4.q() != (i4 == 1)) {
                        z4 = z4.b();
                    }
                    int n4 = n();
                    dVar = (n4 == 5 || n4 == 6) ? z4.a(j4) : z4.i(j4);
                } else {
                    dVar = null;
                }
            }
            if (dVar != null) {
                return f(j4, dVar, true);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }
    }

    public static abstract class b extends c {
        protected b(BigInteger bigInteger) {
            super(X2.b.b(bigInteger));
        }

        @Override // S2.c
        protected f h(int i4, BigInteger bigInteger) {
            S2.d j4 = j(bigInteger);
            S2.d m4 = j4.n().a(this.f9246b).i(j4).a(this.f9247c).m();
            if (m4 == null) {
                throw new IllegalArgumentException("Invalid point compression");
            }
            if (m4.q() != (i4 == 1)) {
                m4 = m4.l();
            }
            return f(j4, m4, true);
        }
    }

    /* renamed from: S2.c$c, reason: collision with other inner class name */
    public class C0064c {

        /* renamed from: a, reason: collision with root package name */
        protected int f9253a;

        /* renamed from: b, reason: collision with root package name */
        protected W2.a f9254b;

        C0064c(int i4, W2.a aVar, S2.e eVar) {
            this.f9253a = i4;
            this.f9254b = aVar;
        }

        public c a() {
            if (!c.this.v(this.f9253a)) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            c b4 = c.this.b();
            if (b4 == c.this) {
                throw new IllegalStateException("implementation returned current curve");
            }
            synchronized (b4) {
                b4.f9250f = this.f9253a;
                b4.f9251g = this.f9254b;
            }
            return b4;
        }

        public C0064c b(W2.a aVar) {
            this.f9254b = aVar;
            return this;
        }
    }

    public static class d extends a {

        /* renamed from: i, reason: collision with root package name */
        private int f9256i;

        /* renamed from: j, reason: collision with root package name */
        private int f9257j;

        /* renamed from: k, reason: collision with root package name */
        private int f9258k;

        /* renamed from: l, reason: collision with root package name */
        private int f9259l;

        /* renamed from: m, reason: collision with root package name */
        private f.c f9260m;

        public d(int i4, int i5, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i4, i5, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        @Override // S2.c
        protected c b() {
            return new d(this.f9256i, this.f9257j, this.f9258k, this.f9259l, this.f9246b, this.f9247c, this.f9248d, this.f9249e);
        }

        @Override // S2.c
        protected f f(S2.d dVar, S2.d dVar2, boolean z4) {
            return new f.c(this, dVar, dVar2, z4);
        }

        @Override // S2.c
        public S2.d j(BigInteger bigInteger) {
            return new d.a(this.f9256i, this.f9257j, this.f9258k, this.f9259l, bigInteger);
        }

        @Override // S2.c
        public int p() {
            return this.f9256i;
        }

        @Override // S2.c
        public f q() {
            return this.f9260m;
        }

        @Override // S2.c
        public boolean v(int i4) {
            return i4 == 0 || i4 == 1 || i4 == 6;
        }

        public d(int i4, int i5, int i6, int i7, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i4, i5, i6, i7);
            this.f9256i = i4;
            this.f9257j = i5;
            this.f9258k = i6;
            this.f9259l = i7;
            this.f9248d = bigInteger3;
            this.f9249e = bigInteger4;
            this.f9260m = new f.c(this, null, null);
            this.f9246b = j(bigInteger);
            this.f9247c = j(bigInteger2);
            this.f9250f = 6;
        }

        protected d(int i4, int i5, int i6, int i7, S2.d dVar, S2.d dVar2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i4, i5, i6, i7);
            this.f9256i = i4;
            this.f9257j = i5;
            this.f9258k = i6;
            this.f9259l = i7;
            this.f9248d = bigInteger;
            this.f9249e = bigInteger2;
            this.f9260m = new f.c(this, null, null);
            this.f9246b = dVar;
            this.f9247c = dVar2;
            this.f9250f = 6;
        }
    }

    protected c(X2.a aVar) {
        this.f9245a = aVar;
    }

    protected void a(f[] fVarArr, int i4, int i5) {
        if (fVarArr == null) {
            throw new IllegalArgumentException("'points' cannot be null");
        }
        if (i4 < 0 || i5 < 0 || i4 > fVarArr.length - i5) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        for (int i6 = 0; i6 < i5; i6++) {
            f fVar = fVarArr[i4 + i6];
            if (fVar != null && this != fVar.g()) {
                throw new IllegalArgumentException("'points' entries must be null or on this curve");
            }
        }
    }

    protected abstract c b();

    public synchronized C0064c c() {
        return new C0064c(this.f9250f, this.f9251g, null);
    }

    public f d(BigInteger bigInteger, BigInteger bigInteger2) {
        return e(bigInteger, bigInteger2, false);
    }

    public f e(BigInteger bigInteger, BigInteger bigInteger2, boolean z4) {
        return f(j(bigInteger), j(bigInteger2), z4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && i((c) obj);
        }
        return true;
    }

    protected abstract f f(S2.d dVar, S2.d dVar2, boolean z4);

    public f g(byte[] bArr) {
        f q4;
        int p4 = (p() + 7) / 8;
        byte b4 = bArr[0];
        if (b4 != 0) {
            if (b4 == 2 || b4 == 3) {
                if (bArr.length != p4 + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                q4 = h(b4 & 1, Z2.b.a(bArr, 1, p4));
                if (!q4.u()) {
                    throw new IllegalArgumentException("Invalid point");
                }
            } else if (b4 != 4) {
                if (b4 != 6 && b4 != 7) {
                    throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b4, 16));
                }
                if (bArr.length != (p4 * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
                BigInteger a4 = Z2.b.a(bArr, 1, p4);
                BigInteger a5 = Z2.b.a(bArr, p4 + 1, p4);
                if (a5.testBit(0) != (b4 == 7)) {
                    throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                }
                q4 = w(a4, a5);
            } else {
                if (bArr.length != (p4 * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
                q4 = w(Z2.b.a(bArr, 1, p4), Z2.b.a(bArr, p4 + 1, p4));
            }
        } else {
            if (bArr.length != 1) {
                throw new IllegalArgumentException("Incorrect length for infinity encoding");
            }
            q4 = q();
        }
        if (b4 == 0 || !q4.o()) {
            return q4;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    protected abstract f h(int i4, BigInteger bigInteger);

    public int hashCode() {
        return (o().hashCode() ^ Z2.c.a(k().r().hashCode(), 8)) ^ Z2.c.a(l().r().hashCode(), 16);
    }

    public boolean i(c cVar) {
        if (this != cVar) {
            return cVar != null && o().equals(cVar.o()) && k().r().equals(cVar.k().r()) && l().r().equals(cVar.l().r());
        }
        return true;
    }

    public abstract S2.d j(BigInteger bigInteger);

    public S2.d k() {
        return this.f9246b;
    }

    public S2.d l() {
        return this.f9247c;
    }

    public BigInteger m() {
        return this.f9249e;
    }

    public int n() {
        return this.f9250f;
    }

    public X2.a o() {
        return this.f9245a;
    }

    public abstract int p();

    public abstract f q();

    public BigInteger r() {
        return this.f9248d;
    }

    public f s(f fVar) {
        if (this == fVar.g()) {
            return fVar;
        }
        if (fVar.o()) {
            return q();
        }
        f s4 = fVar.s();
        return x(s4.l().r(), s4.m().r(), s4.f9276e);
    }

    public void t(f[] fVarArr) {
        u(fVarArr, 0, fVarArr.length, null);
    }

    public void u(f[] fVarArr, int i4, int i5, S2.d dVar) {
        a(fVarArr, i4, i5);
        int n4 = n();
        if (n4 == 0 || n4 == 5) {
            if (dVar != null) {
                throw new IllegalArgumentException("'iso' not valid for affine coordinates");
            }
            return;
        }
        S2.d[] dVarArr = new S2.d[i5];
        int[] iArr = new int[i5];
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            int i8 = i4 + i7;
            f fVar = fVarArr[i8];
            if (fVar != null && (dVar != null || !fVar.p())) {
                dVarArr[i6] = fVar.n(0);
                iArr[i6] = i8;
                i6++;
            }
        }
        if (i6 == 0) {
            return;
        }
        S2.a.e(dVarArr, 0, i6, dVar);
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = iArr[i9];
            fVarArr[i10] = fVarArr[i10].t(dVarArr[i9]);
        }
    }

    public abstract boolean v(int i4);

    public f w(BigInteger bigInteger, BigInteger bigInteger2) {
        f d4 = d(bigInteger, bigInteger2);
        if (d4.q()) {
            return d4;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public f x(BigInteger bigInteger, BigInteger bigInteger2, boolean z4) {
        f e4 = e(bigInteger, bigInteger2, z4);
        if (e4.q()) {
            return e4;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public static class e extends b {

        /* renamed from: h, reason: collision with root package name */
        BigInteger f9261h;

        /* renamed from: i, reason: collision with root package name */
        BigInteger f9262i;

        /* renamed from: j, reason: collision with root package name */
        f.d f9263j;

        public e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.f9261h = bigInteger;
            this.f9262i = d.b.s(bigInteger);
            this.f9263j = new f.d(this, null, null);
            this.f9246b = j(bigInteger2);
            this.f9247c = j(bigInteger3);
            this.f9248d = bigInteger4;
            this.f9249e = bigInteger5;
            this.f9250f = 4;
        }

        @Override // S2.c
        protected c b() {
            return new e(this.f9261h, this.f9262i, this.f9246b, this.f9247c, this.f9248d, this.f9249e);
        }

        @Override // S2.c
        protected f f(S2.d dVar, S2.d dVar2, boolean z4) {
            return new f.d(this, dVar, dVar2, z4);
        }

        @Override // S2.c
        public S2.d j(BigInteger bigInteger) {
            return new d.b(this.f9261h, this.f9262i, bigInteger);
        }

        @Override // S2.c
        public int p() {
            return this.f9261h.bitLength();
        }

        @Override // S2.c
        public f q() {
            return this.f9263j;
        }

        @Override // S2.c
        public f s(f fVar) {
            int n4;
            return (this == fVar.g() || n() != 2 || fVar.o() || !((n4 = fVar.g().n()) == 2 || n4 == 3 || n4 == 4)) ? super.s(fVar) : new f.d(this, j(fVar.f9273b.r()), j(fVar.f9274c.r()), new S2.d[]{j(fVar.f9275d[0].r())}, fVar.f9276e);
        }

        @Override // S2.c
        public boolean v(int i4) {
            return i4 == 0 || i4 == 1 || i4 == 2 || i4 == 4;
        }

        protected e(BigInteger bigInteger, BigInteger bigInteger2, S2.d dVar, S2.d dVar2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.f9261h = bigInteger;
            this.f9262i = bigInteger2;
            this.f9263j = new f.d(this, null, null);
            this.f9246b = dVar;
            this.f9247c = dVar2;
            this.f9248d = bigInteger3;
            this.f9249e = bigInteger4;
            this.f9250f = 4;
        }
    }
}

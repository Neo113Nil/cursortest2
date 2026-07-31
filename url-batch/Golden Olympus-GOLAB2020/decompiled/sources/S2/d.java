package S2;

import Y2.m;
import java.math.BigInteger;
import java.util.Random;

/* loaded from: classes3.dex */
public abstract class d implements S2.b {

    public static class b extends d {

        /* renamed from: g, reason: collision with root package name */
        BigInteger f9268g;

        /* renamed from: h, reason: collision with root package name */
        BigInteger f9269h;

        /* renamed from: i, reason: collision with root package name */
        BigInteger f9270i;

        b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.f9268g = bigInteger;
            this.f9269h = bigInteger2;
            this.f9270i = bigInteger3;
        }

        static BigInteger s(BigInteger bigInteger) {
            int bitLength = bigInteger.bitLength();
            if (bitLength < 96 || bigInteger.shiftRight(bitLength - 64).longValue() != -1) {
                return null;
            }
            return S2.b.f9240b.shiftLeft(bitLength).subtract(bigInteger);
        }

        private d t(d dVar) {
            if (dVar.n().equals(this)) {
                return dVar;
            }
            return null;
        }

        private BigInteger[] u(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int bitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigInteger4 = S2.b.f9240b;
            BigInteger bigInteger5 = bigInteger;
            BigInteger bigInteger6 = bigInteger4;
            BigInteger bigInteger7 = S2.b.f9241c;
            BigInteger bigInteger8 = bigInteger6;
            for (int i4 = bitLength - 1; i4 >= lowestSetBit + 1; i4--) {
                bigInteger4 = z(bigInteger4, bigInteger8);
                if (bigInteger3.testBit(i4)) {
                    bigInteger8 = z(bigInteger4, bigInteger2);
                    bigInteger6 = z(bigInteger6, bigInteger5);
                    bigInteger7 = A(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger5 = A(bigInteger5.multiply(bigInteger5).subtract(bigInteger8.shiftLeft(1)));
                } else {
                    BigInteger A4 = A(bigInteger6.multiply(bigInteger7).subtract(bigInteger4));
                    BigInteger A5 = A(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger7 = A(bigInteger7.multiply(bigInteger7).subtract(bigInteger4.shiftLeft(1)));
                    bigInteger5 = A5;
                    bigInteger6 = A4;
                    bigInteger8 = bigInteger4;
                }
            }
            BigInteger z4 = z(bigInteger4, bigInteger8);
            BigInteger z5 = z(z4, bigInteger2);
            BigInteger A6 = A(bigInteger6.multiply(bigInteger7).subtract(z4));
            BigInteger A7 = A(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(z4)));
            BigInteger z6 = z(z4, z5);
            for (int i5 = 1; i5 <= lowestSetBit; i5++) {
                A6 = z(A6, A7);
                A7 = A(A7.multiply(A7).subtract(z6.shiftLeft(1)));
                z6 = z(z6, z6);
            }
            return new BigInteger[]{A6, A7};
        }

        protected BigInteger A(BigInteger bigInteger) {
            if (this.f9269h == null) {
                return bigInteger.mod(this.f9268g);
            }
            boolean z4 = bigInteger.signum() < 0;
            if (z4) {
                bigInteger = bigInteger.abs();
            }
            int bitLength = this.f9268g.bitLength();
            boolean equals = this.f9269h.equals(S2.b.f9240b);
            while (bigInteger.bitLength() > bitLength + 1) {
                BigInteger shiftRight = bigInteger.shiftRight(bitLength);
                BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
                if (!equals) {
                    shiftRight = shiftRight.multiply(this.f9269h);
                }
                bigInteger = shiftRight.add(subtract);
            }
            while (bigInteger.compareTo(this.f9268g) >= 0) {
                bigInteger = bigInteger.subtract(this.f9268g);
            }
            return (!z4 || bigInteger.signum() == 0) ? bigInteger : this.f9268g.subtract(bigInteger);
        }

        protected BigInteger B(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger subtract = bigInteger.subtract(bigInteger2);
            return subtract.signum() < 0 ? subtract.add(this.f9268g) : subtract;
        }

        @Override // S2.d
        public d a(d dVar) {
            return new b(this.f9268g, this.f9269h, v(this.f9270i, dVar.r()));
        }

        @Override // S2.d
        public d b() {
            BigInteger add = this.f9270i.add(S2.b.f9240b);
            if (add.compareTo(this.f9268g) == 0) {
                add = S2.b.f9239a;
            }
            return new b(this.f9268g, this.f9269h, add);
        }

        @Override // S2.d
        public d d(d dVar) {
            return new b(this.f9268g, this.f9269h, z(this.f9270i, y(dVar.r())));
        }

        @Override // S2.d
        public int e() {
            return this.f9268g.bitLength();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f9268g.equals(bVar.f9268g) && this.f9270i.equals(bVar.f9270i);
        }

        @Override // S2.d
        public d f() {
            return new b(this.f9268g, this.f9269h, y(this.f9270i));
        }

        public int hashCode() {
            return this.f9268g.hashCode() ^ this.f9270i.hashCode();
        }

        @Override // S2.d
        public d i(d dVar) {
            return new b(this.f9268g, this.f9269h, z(this.f9270i, dVar.r()));
        }

        @Override // S2.d
        public d j(d dVar, d dVar2, d dVar3) {
            BigInteger bigInteger = this.f9270i;
            BigInteger r4 = dVar.r();
            BigInteger r5 = dVar2.r();
            BigInteger r6 = dVar3.r();
            return new b(this.f9268g, this.f9269h, A(bigInteger.multiply(r4).subtract(r5.multiply(r6))));
        }

        @Override // S2.d
        public d k(d dVar, d dVar2, d dVar3) {
            BigInteger bigInteger = this.f9270i;
            BigInteger r4 = dVar.r();
            BigInteger r5 = dVar2.r();
            BigInteger r6 = dVar3.r();
            return new b(this.f9268g, this.f9269h, A(bigInteger.multiply(r4).add(r5.multiply(r6))));
        }

        @Override // S2.d
        public d l() {
            if (this.f9270i.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.f9268g;
            return new b(bigInteger, this.f9269h, bigInteger.subtract(this.f9270i));
        }

        @Override // S2.d
        public d m() {
            if (h() || g()) {
                return this;
            }
            if (!this.f9268g.testBit(0)) {
                throw new RuntimeException("not done yet");
            }
            if (this.f9268g.testBit(1)) {
                BigInteger add = this.f9268g.shiftRight(2).add(S2.b.f9240b);
                BigInteger bigInteger = this.f9268g;
                return t(new b(bigInteger, this.f9269h, this.f9270i.modPow(add, bigInteger)));
            }
            if (this.f9268g.testBit(2)) {
                BigInteger modPow = this.f9270i.modPow(this.f9268g.shiftRight(3), this.f9268g);
                BigInteger z4 = z(modPow, this.f9270i);
                if (z(z4, modPow).equals(S2.b.f9240b)) {
                    return t(new b(this.f9268g, this.f9269h, z4));
                }
                return t(new b(this.f9268g, this.f9269h, z(z4, S2.b.f9241c.modPow(this.f9268g.shiftRight(2), this.f9268g))));
            }
            BigInteger shiftRight = this.f9268g.shiftRight(1);
            BigInteger modPow2 = this.f9270i.modPow(shiftRight, this.f9268g);
            BigInteger bigInteger2 = S2.b.f9240b;
            if (!modPow2.equals(bigInteger2)) {
                return null;
            }
            BigInteger bigInteger3 = this.f9270i;
            BigInteger w4 = w(w(bigInteger3));
            BigInteger add2 = shiftRight.add(bigInteger2);
            BigInteger subtract = this.f9268g.subtract(bigInteger2);
            Random random = new Random();
            while (true) {
                BigInteger bigInteger4 = new BigInteger(this.f9268g.bitLength(), random);
                if (bigInteger4.compareTo(this.f9268g) < 0 && A(bigInteger4.multiply(bigInteger4).subtract(w4)).modPow(shiftRight, this.f9268g).equals(subtract)) {
                    BigInteger[] u4 = u(bigInteger4, bigInteger3, add2);
                    BigInteger bigInteger5 = u4[0];
                    BigInteger bigInteger6 = u4[1];
                    if (z(bigInteger6, bigInteger6).equals(w4)) {
                        return new b(this.f9268g, this.f9269h, x(bigInteger6));
                    }
                    if (!bigInteger5.equals(S2.b.f9240b) && !bigInteger5.equals(subtract)) {
                        return null;
                    }
                }
            }
        }

        @Override // S2.d
        public d n() {
            BigInteger bigInteger = this.f9268g;
            BigInteger bigInteger2 = this.f9269h;
            BigInteger bigInteger3 = this.f9270i;
            return new b(bigInteger, bigInteger2, z(bigInteger3, bigInteger3));
        }

        @Override // S2.d
        public d o(d dVar, d dVar2) {
            BigInteger bigInteger = this.f9270i;
            BigInteger r4 = dVar.r();
            BigInteger r5 = dVar2.r();
            return new b(this.f9268g, this.f9269h, A(bigInteger.multiply(bigInteger).add(r4.multiply(r5))));
        }

        @Override // S2.d
        public d p(d dVar) {
            return new b(this.f9268g, this.f9269h, B(this.f9270i, dVar.r()));
        }

        @Override // S2.d
        public BigInteger r() {
            return this.f9270i;
        }

        protected BigInteger v(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger add = bigInteger.add(bigInteger2);
            return add.compareTo(this.f9268g) >= 0 ? add.subtract(this.f9268g) : add;
        }

        protected BigInteger w(BigInteger bigInteger) {
            BigInteger shiftLeft = bigInteger.shiftLeft(1);
            return shiftLeft.compareTo(this.f9268g) >= 0 ? shiftLeft.subtract(this.f9268g) : shiftLeft;
        }

        protected BigInteger x(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f9268g.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        protected BigInteger y(BigInteger bigInteger) {
            int e4 = e();
            int i4 = (e4 + 31) >> 5;
            int[] n4 = m.n(e4, this.f9268g);
            int[] n5 = m.n(e4, bigInteger);
            int[] i5 = m.i(i4);
            Y2.b.d(n4, n5, i5);
            return m.O(i4, i5);
        }

        protected BigInteger z(BigInteger bigInteger, BigInteger bigInteger2) {
            return A(bigInteger.multiply(bigInteger2));
        }
    }

    public abstract d a(d dVar);

    public abstract d b();

    public int c() {
        return r().bitLength();
    }

    public abstract d d(d dVar);

    public abstract int e();

    public abstract d f();

    public boolean g() {
        return c() == 1;
    }

    public boolean h() {
        return r().signum() == 0;
    }

    public abstract d i(d dVar);

    public d j(d dVar, d dVar2, d dVar3) {
        return i(dVar).p(dVar2.i(dVar3));
    }

    public d k(d dVar, d dVar2, d dVar3) {
        return i(dVar).a(dVar2.i(dVar3));
    }

    public abstract d l();

    public abstract d m();

    public abstract d n();

    public d o(d dVar, d dVar2) {
        return n().a(dVar.i(dVar2));
    }

    public abstract d p(d dVar);

    public boolean q() {
        return r().testBit(0);
    }

    public abstract BigInteger r();

    public String toString() {
        return r().toString(16);
    }

    public static class a extends d {

        /* renamed from: g, reason: collision with root package name */
        private int f9264g;

        /* renamed from: h, reason: collision with root package name */
        private int f9265h;

        /* renamed from: i, reason: collision with root package name */
        private int[] f9266i;

        /* renamed from: j, reason: collision with root package name */
        private h f9267j;

        public a(int i4, int i5, int i6, int i7, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i4) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i6 == 0 && i7 == 0) {
                this.f9264g = 2;
                this.f9266i = new int[]{i5};
            } else {
                if (i6 >= i7) {
                    throw new IllegalArgumentException("k2 must be smaller than k3");
                }
                if (i6 <= 0) {
                    throw new IllegalArgumentException("k2 must be larger than 0");
                }
                this.f9264g = 3;
                this.f9266i = new int[]{i5, i6, i7};
            }
            this.f9265h = i4;
            this.f9267j = new h(bigInteger);
        }

        public static void s(d dVar, d dVar2) {
            if (!(dVar instanceof a) || !(dVar2 instanceof a)) {
                throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
            }
            a aVar = (a) dVar;
            a aVar2 = (a) dVar2;
            if (aVar.f9264g != aVar2.f9264g) {
                throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
            }
            if (aVar.f9265h != aVar2.f9265h || !Z2.a.b(aVar.f9266i, aVar2.f9266i)) {
                throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
            }
        }

        @Override // S2.d
        public d a(d dVar) {
            h hVar = (h) this.f9267j.clone();
            hVar.g(((a) dVar).f9267j, 0);
            return new a(this.f9265h, this.f9266i, hVar);
        }

        @Override // S2.d
        public d b() {
            return new a(this.f9265h, this.f9266i, this.f9267j.e());
        }

        @Override // S2.d
        public int c() {
            return this.f9267j.k();
        }

        @Override // S2.d
        public d d(d dVar) {
            return i(dVar.f());
        }

        @Override // S2.d
        public int e() {
            return this.f9265h;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9265h == aVar.f9265h && this.f9264g == aVar.f9264g && Z2.a.b(this.f9266i, aVar.f9266i) && this.f9267j.equals(aVar.f9267j);
        }

        @Override // S2.d
        public d f() {
            int i4 = this.f9265h;
            int[] iArr = this.f9266i;
            return new a(i4, iArr, this.f9267j.u(i4, iArr));
        }

        @Override // S2.d
        public boolean g() {
            return this.f9267j.s();
        }

        @Override // S2.d
        public boolean h() {
            return this.f9267j.t();
        }

        public int hashCode() {
            return (this.f9267j.hashCode() ^ this.f9265h) ^ Z2.a.i(this.f9266i);
        }

        @Override // S2.d
        public d i(d dVar) {
            int i4 = this.f9265h;
            int[] iArr = this.f9266i;
            return new a(i4, iArr, this.f9267j.v(((a) dVar).f9267j, i4, iArr));
        }

        @Override // S2.d
        public d j(d dVar, d dVar2, d dVar3) {
            return k(dVar, dVar2, dVar3);
        }

        @Override // S2.d
        public d k(d dVar, d dVar2, d dVar3) {
            h hVar = this.f9267j;
            h hVar2 = ((a) dVar).f9267j;
            h hVar3 = ((a) dVar2).f9267j;
            h hVar4 = ((a) dVar3).f9267j;
            h y4 = hVar.y(hVar2, this.f9265h, this.f9266i);
            h y5 = hVar3.y(hVar4, this.f9265h, this.f9266i);
            if (y4 == hVar || y4 == hVar2) {
                y4 = (h) y4.clone();
            }
            y4.g(y5, 0);
            y4.A(this.f9265h, this.f9266i);
            return new a(this.f9265h, this.f9266i, y4);
        }

        @Override // S2.d
        public d m() {
            return (this.f9267j.t() || this.f9267j.s()) ? this : t(this.f9265h - 1);
        }

        @Override // S2.d
        public d n() {
            int i4 = this.f9265h;
            int[] iArr = this.f9266i;
            return new a(i4, iArr, this.f9267j.w(i4, iArr));
        }

        @Override // S2.d
        public d o(d dVar, d dVar2) {
            h hVar = this.f9267j;
            h hVar2 = ((a) dVar).f9267j;
            h hVar3 = ((a) dVar2).f9267j;
            h K3 = hVar.K(this.f9265h, this.f9266i);
            h y4 = hVar2.y(hVar3, this.f9265h, this.f9266i);
            if (K3 == hVar) {
                K3 = (h) K3.clone();
            }
            K3.g(y4, 0);
            K3.A(this.f9265h, this.f9266i);
            return new a(this.f9265h, this.f9266i, K3);
        }

        @Override // S2.d
        public d p(d dVar) {
            return a(dVar);
        }

        @Override // S2.d
        public boolean q() {
            return this.f9267j.N();
        }

        @Override // S2.d
        public BigInteger r() {
            return this.f9267j.O();
        }

        public d t(int i4) {
            if (i4 < 1) {
                return this;
            }
            int i5 = this.f9265h;
            int[] iArr = this.f9266i;
            return new a(i5, iArr, this.f9267j.x(i4, i5, iArr));
        }

        private a(int i4, int[] iArr, h hVar) {
            this.f9265h = i4;
            this.f9264g = iArr.length == 1 ? 2 : 3;
            this.f9266i = iArr;
            this.f9267j = hVar;
        }

        @Override // S2.d
        public d l() {
            return this;
        }
    }
}

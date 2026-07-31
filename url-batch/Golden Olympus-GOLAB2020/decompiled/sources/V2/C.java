package V2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class C extends S2.d {

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f9480h = A.f9475i;

    /* renamed from: g, reason: collision with root package name */
    protected int[] f9481g;

    public C(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f9480h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.f9481g = B.d(bigInteger);
    }

    private static void s(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7) {
        B.e(iArr5, iArr3, iArr7);
        B.e(iArr7, iArr, iArr7);
        B.e(iArr4, iArr2, iArr6);
        B.a(iArr6, iArr7, iArr6);
        B.e(iArr4, iArr3, iArr7);
        Y2.f.c(iArr6, iArr4);
        B.e(iArr5, iArr2, iArr5);
        B.a(iArr5, iArr7, iArr5);
        B.j(iArr5, iArr6);
        B.e(iArr6, iArr, iArr6);
    }

    private static void t(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        Y2.f.c(iArr, iArr4);
        int[] d4 = Y2.f.d();
        int[] d5 = Y2.f.d();
        for (int i4 = 0; i4 < 7; i4++) {
            Y2.f.c(iArr2, d4);
            Y2.f.c(iArr3, d5);
            int i5 = 1 << i4;
            while (true) {
                i5--;
                if (i5 >= 0) {
                    u(iArr2, iArr3, iArr4, iArr5);
                }
            }
            s(iArr, d4, d5, iArr2, iArr3, iArr4, iArr5);
        }
    }

    private static void u(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        B.e(iArr2, iArr, iArr2);
        B.n(iArr2, iArr2);
        B.j(iArr, iArr4);
        B.a(iArr3, iArr4, iArr);
        B.e(iArr3, iArr4, iArr3);
        B.i(Y2.m.F(7, iArr3, 2, 0), iArr3);
    }

    private static boolean v(int[] iArr) {
        int[] d4 = Y2.f.d();
        int[] d5 = Y2.f.d();
        Y2.f.c(iArr, d4);
        for (int i4 = 0; i4 < 7; i4++) {
            Y2.f.c(d4, d5);
            B.k(d4, 1 << i4, d4);
            B.e(d4, d5, d4);
        }
        B.k(d4, 95, d4);
        return Y2.f.j(d4);
    }

    private static boolean w(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] d4 = Y2.f.d();
        Y2.f.c(iArr2, d4);
        int[] d5 = Y2.f.d();
        d5[0] = 1;
        int[] d6 = Y2.f.d();
        t(iArr, d4, d5, d6, iArr3);
        int[] d7 = Y2.f.d();
        int[] d8 = Y2.f.d();
        for (int i4 = 1; i4 < 96; i4++) {
            Y2.f.c(d4, d7);
            Y2.f.c(d5, d8);
            u(d4, d5, d6, iArr3);
            if (Y2.f.k(d4)) {
                Y2.b.d(B.f9477a, d8, iArr3);
                B.e(iArr3, d7, iArr3);
                return true;
            }
        }
        return false;
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        int[] d4 = Y2.f.d();
        B.a(this.f9481g, ((C) dVar).f9481g, d4);
        return new C(d4);
    }

    @Override // S2.d
    public S2.d b() {
        int[] d4 = Y2.f.d();
        B.b(this.f9481g, d4);
        return new C(d4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        int[] d4 = Y2.f.d();
        Y2.b.d(B.f9477a, ((C) dVar).f9481g, d4);
        B.e(d4, this.f9481g, d4);
        return new C(d4);
    }

    @Override // S2.d
    public int e() {
        return f9480h.bitLength();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C) {
            return Y2.f.f(this.f9481g, ((C) obj).f9481g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        int[] d4 = Y2.f.d();
        Y2.b.d(B.f9477a, this.f9481g, d4);
        return new C(d4);
    }

    @Override // S2.d
    public boolean g() {
        return Y2.f.j(this.f9481g);
    }

    @Override // S2.d
    public boolean h() {
        return Y2.f.k(this.f9481g);
    }

    public int hashCode() {
        return f9480h.hashCode() ^ Z2.a.j(this.f9481g, 0, 7);
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        int[] d4 = Y2.f.d();
        B.e(this.f9481g, ((C) dVar).f9481g, d4);
        return new C(d4);
    }

    @Override // S2.d
    public S2.d l() {
        int[] d4 = Y2.f.d();
        B.g(this.f9481g, d4);
        return new C(d4);
    }

    @Override // S2.d
    public S2.d m() {
        int[] iArr = this.f9481g;
        if (Y2.f.k(iArr) || Y2.f.j(iArr)) {
            return this;
        }
        int[] d4 = Y2.f.d();
        B.g(iArr, d4);
        int[] e4 = Y2.b.e(B.f9477a);
        int[] d5 = Y2.f.d();
        if (!v(iArr)) {
            return null;
        }
        while (!w(d4, e4, d5)) {
            B.b(e4, e4);
        }
        B.j(d5, e4);
        if (Y2.f.f(iArr, e4)) {
            return new C(d5);
        }
        return null;
    }

    @Override // S2.d
    public S2.d n() {
        int[] d4 = Y2.f.d();
        B.j(this.f9481g, d4);
        return new C(d4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        int[] d4 = Y2.f.d();
        B.m(this.f9481g, ((C) dVar).f9481g, d4);
        return new C(d4);
    }

    @Override // S2.d
    public boolean q() {
        return Y2.f.h(this.f9481g, 0) == 1;
    }

    @Override // S2.d
    public BigInteger r() {
        return Y2.f.t(this.f9481g);
    }

    protected C(int[] iArr) {
        this.f9481g = iArr;
    }
}

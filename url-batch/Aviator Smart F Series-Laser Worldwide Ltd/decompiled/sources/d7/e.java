package d7;

import org.bouncycastle.pqc.math.linearalgebra.n;

/* loaded from: classes5.dex */
public class e implements org.bouncycastle.crypto.c {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private org.bouncycastle.crypto.e digest;
    private int fieldPoly;

    /* renamed from: m, reason: collision with root package name */
    private int f16629m;

    /* renamed from: n, reason: collision with root package name */
    private int f16630n;

    /* renamed from: t, reason: collision with root package name */
    private int f16631t;

    public e() {
        this(11, 50);
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f16629m;
    }

    public int getN() {
        return this.f16630n;
    }

    public int getT() {
        return this.f16631t;
    }

    public e(int i8) {
        this(i8, (org.bouncycastle.crypto.e) null);
    }

    public e(int i8, int i9) {
        this(i8, i9, (org.bouncycastle.crypto.e) null);
    }

    public e(int i8, int i9, int i10) {
        this(i8, i9, i10, null);
    }

    public e(int i8, int i9, int i10, org.bouncycastle.crypto.e eVar) {
        this.f16629m = i8;
        if (i8 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i8 > 32) {
            throw new IllegalArgumentException(" m is too large");
        }
        int i11 = 1 << i8;
        this.f16630n = i11;
        this.f16631t = i9;
        if (i9 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i9 > i11) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        if (n.degree(i10) != i8 || !n.isIrreducible(i10)) {
            throw new IllegalArgumentException("polynomial is not a field polynomial for GF(2^m)");
        }
        this.fieldPoly = i10;
        this.digest = eVar;
    }

    public e(int i8, int i9, org.bouncycastle.crypto.e eVar) {
        if (i8 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i8 > 32) {
            throw new IllegalArgumentException("m is too large");
        }
        this.f16629m = i8;
        int i10 = 1 << i8;
        this.f16630n = i10;
        if (i9 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i9 > i10) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        this.f16631t = i9;
        this.fieldPoly = n.getIrreduciblePolynomial(i8);
        this.digest = eVar;
    }

    public e(int i8, org.bouncycastle.crypto.e eVar) {
        if (i8 < 1) {
            throw new IllegalArgumentException("key size must be positive");
        }
        this.f16629m = 0;
        this.f16630n = 1;
        while (true) {
            int i9 = this.f16630n;
            if (i9 >= i8) {
                int i10 = i9 >>> 1;
                this.f16631t = i10;
                int i11 = this.f16629m;
                this.f16631t = i10 / i11;
                this.fieldPoly = n.getIrreduciblePolynomial(i11);
                this.digest = eVar;
                return;
            }
            this.f16630n = i9 << 1;
            this.f16629m++;
        }
    }

    public e(org.bouncycastle.crypto.e eVar) {
        this(11, 50, eVar);
    }
}

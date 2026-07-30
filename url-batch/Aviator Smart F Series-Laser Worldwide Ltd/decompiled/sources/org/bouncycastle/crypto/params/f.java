package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class f implements org.bouncycastle.math.ec.d {
    private final org.bouncycastle.math.ec.i G;
    private final org.bouncycastle.math.ec.e curve;

    /* renamed from: h, reason: collision with root package name */
    private final BigInteger f17128h;
    private BigInteger hInv;

    /* renamed from: n, reason: collision with root package name */
    private final BigInteger f17129n;
    private final byte[] seed;

    public f(org.bouncycastle.asn1.x9.e eVar) {
        this(eVar.getCurve(), eVar.getG(), eVar.getN(), eVar.getH(), eVar.getSeed());
    }

    static org.bouncycastle.math.ec.i validatePublicPoint(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.i iVar) {
        if (iVar == null) {
            throw new NullPointerException("Point cannot be null");
        }
        org.bouncycastle.math.ec.i normalize = org.bouncycastle.math.ec.c.importPoint(eVar, iVar).normalize();
        if (normalize.isInfinity()) {
            throw new IllegalArgumentException("Point at infinity");
        }
        if (normalize.isValid()) {
            return normalize;
        }
        throw new IllegalArgumentException("Point not on curve");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.curve.equals(fVar.curve) && this.G.equals(fVar.G) && this.f17129n.equals(fVar.f17129n);
    }

    public org.bouncycastle.math.ec.e getCurve() {
        return this.curve;
    }

    public org.bouncycastle.math.ec.i getG() {
        return this.G;
    }

    public BigInteger getH() {
        return this.f17128h;
    }

    public synchronized BigInteger getHInv() {
        try {
            if (this.hInv == null) {
                this.hInv = org.bouncycastle.util.b.modOddInverseVar(this.f17129n, this.f17128h);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.hInv;
    }

    public BigInteger getN() {
        return this.f17129n;
    }

    public byte[] getSeed() {
        return org.bouncycastle.util.a.clone(this.seed);
    }

    public int hashCode() {
        return ((((this.curve.hashCode() ^ 1028) * 257) ^ this.G.hashCode()) * 257) ^ this.f17129n.hashCode();
    }

    public BigInteger validatePrivateScalar(BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new NullPointerException("Scalar cannot be null");
        }
        if (bigInteger.compareTo(org.bouncycastle.math.ec.d.ONE) < 0 || bigInteger.compareTo(getN()) >= 0) {
            throw new IllegalArgumentException("Scalar is not in the interval [1, n - 1]");
        }
        return bigInteger;
    }

    public f(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.i iVar, BigInteger bigInteger) {
        this(eVar, iVar, bigInteger, org.bouncycastle.math.ec.d.ONE, null);
    }

    public org.bouncycastle.math.ec.i validatePublicPoint(org.bouncycastle.math.ec.i iVar) {
        return validatePublicPoint(getCurve(), iVar);
    }

    public f(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.i iVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eVar, iVar, bigInteger, bigInteger2, null);
    }

    public f(org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.i iVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.hInv = null;
        if (eVar == null) {
            throw new NullPointerException("curve");
        }
        if (bigInteger == null) {
            throw new NullPointerException("n");
        }
        this.curve = eVar;
        this.G = validatePublicPoint(eVar, iVar);
        this.f17129n = bigInteger;
        this.f17128h = bigInteger2;
        this.seed = org.bouncycastle.util.a.clone(bArr);
    }
}

package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class b implements org.bouncycastle.crypto.c {
    private static final int DEFAULT_MINIMUM_LENGTH = 160;

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f17119g;

    /* renamed from: j, reason: collision with root package name */
    private BigInteger f17120j;

    /* renamed from: l, reason: collision with root package name */
    private int f17121l;

    /* renamed from: m, reason: collision with root package name */
    private int f17122m;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f17123p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f17124q;
    private c validation;

    public b(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }

    private static int getDefaultMParam(int i8) {
        if (i8 != 0 && i8 < 160) {
            return i8;
        }
        return 160;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (getQ() != null) {
            if (!getQ().equals(bVar.getQ())) {
                return false;
            }
        } else if (bVar.getQ() != null) {
            return false;
        }
        return bVar.getP().equals(this.f17123p) && bVar.getG().equals(this.f17119g);
    }

    public BigInteger getG() {
        return this.f17119g;
    }

    public BigInteger getJ() {
        return this.f17120j;
    }

    public int getL() {
        return this.f17121l;
    }

    public int getM() {
        return this.f17122m;
    }

    public BigInteger getP() {
        return this.f17123p;
    }

    public BigInteger getQ() {
        return this.f17124q;
    }

    public c getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) ^ (getQ() != null ? getQ().hashCode() : 0);
    }

    public b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, 0);
    }

    public b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i8) {
        this(bigInteger, bigInteger2, bigInteger3, getDefaultMParam(i8), i8, null, null);
    }

    public b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i8, int i9) {
        this(bigInteger, bigInteger2, bigInteger3, i8, i9, null, null);
    }

    public b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i8, int i9, BigInteger bigInteger4, c cVar) {
        if (i9 != 0) {
            if (i9 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i9 < i8) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i8 > bigInteger.bitLength() && !org.bouncycastle.util.j.isOverrideSet("org.bouncycastle.dh.allow_unsafe_p_value")) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.f17119g = bigInteger2;
        this.f17123p = bigInteger;
        this.f17124q = bigInteger3;
        this.f17122m = i8;
        this.f17121l = i9;
        this.f17120j = bigInteger4;
        this.validation = cVar;
    }

    public b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, c cVar) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, cVar);
    }
}

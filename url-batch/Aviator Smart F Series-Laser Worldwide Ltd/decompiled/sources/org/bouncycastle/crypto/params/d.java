package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class d implements org.bouncycastle.crypto.c {

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f17125g;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f17126p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f17127q;
    private e validation;

    public d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f17125g = bigInteger3;
        this.f17126p = bigInteger;
        this.f17127q = bigInteger2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.getP().equals(this.f17126p) && dVar.getQ().equals(this.f17127q) && dVar.getG().equals(this.f17125g);
    }

    public BigInteger getG() {
        return this.f17125g;
    }

    public BigInteger getP() {
        return this.f17126p;
    }

    public BigInteger getQ() {
        return this.f17127q;
    }

    public e getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }

    public d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, e eVar) {
        this.f17125g = bigInteger3;
        this.f17126p = bigInteger;
        this.f17127q = bigInteger2;
        this.validation = eVar;
    }
}

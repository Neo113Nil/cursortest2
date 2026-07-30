package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class d implements AlgorithmParameterSpec {
    private i G;
    private org.bouncycastle.math.ec.e curve;

    /* renamed from: h, reason: collision with root package name */
    private BigInteger f17135h;

    /* renamed from: n, reason: collision with root package name */
    private BigInteger f17136n;
    private byte[] seed;

    public d(org.bouncycastle.math.ec.e eVar, i iVar, BigInteger bigInteger) {
        this.curve = eVar;
        this.G = iVar.normalize();
        this.f17136n = bigInteger;
        this.f17135h = BigInteger.valueOf(1L);
        this.seed = null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return getCurve().equals(dVar.getCurve()) && getG().equals(dVar.getG());
    }

    public org.bouncycastle.math.ec.e getCurve() {
        return this.curve;
    }

    public i getG() {
        return this.G;
    }

    public BigInteger getH() {
        return this.f17135h;
    }

    public BigInteger getN() {
        return this.f17136n;
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public int hashCode() {
        return getCurve().hashCode() ^ getG().hashCode();
    }

    public d(org.bouncycastle.math.ec.e eVar, i iVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this.curve = eVar;
        this.G = iVar.normalize();
        this.f17136n = bigInteger;
        this.f17135h = bigInteger2;
        this.seed = null;
    }

    public d(org.bouncycastle.math.ec.e eVar, i iVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.curve = eVar;
        this.G = iVar.normalize();
        this.f17136n = bigInteger;
        this.f17135h = bigInteger2;
        this.seed = bArr;
    }
}

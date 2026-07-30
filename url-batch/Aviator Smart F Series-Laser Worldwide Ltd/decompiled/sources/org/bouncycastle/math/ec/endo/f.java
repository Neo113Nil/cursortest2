package org.bouncycastle.math.ec.endo;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class f {
    protected final BigInteger beta;
    protected final BigInteger lambda;
    protected final g splitParams;

    public f(BigInteger bigInteger, BigInteger bigInteger2, g gVar) {
        this.beta = bigInteger;
        this.lambda = bigInteger2;
        this.splitParams = gVar;
    }

    public BigInteger getBeta() {
        return this.beta;
    }

    public int getBits() {
        return getSplitParams().getBits();
    }

    public BigInteger getG1() {
        return getSplitParams().getG1();
    }

    public BigInteger getG2() {
        return getSplitParams().getG2();
    }

    public BigInteger getLambda() {
        return this.lambda;
    }

    public g getSplitParams() {
        return this.splitParams;
    }

    public BigInteger getV1A() {
        return getSplitParams().getV1A();
    }

    public BigInteger getV1B() {
        return getSplitParams().getV1B();
    }

    public BigInteger getV2A() {
        return getSplitParams().getV2A();
    }

    public BigInteger getV2B() {
        return getSplitParams().getV2B();
    }

    public f(BigInteger bigInteger, BigInteger bigInteger2, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger3, BigInteger bigInteger4, int i8) {
        this.beta = bigInteger;
        this.lambda = bigInteger2;
        this.splitParams = new g(bigIntegerArr, bigIntegerArr2, bigInteger3, bigInteger4, i8);
    }
}

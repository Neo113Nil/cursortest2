package org.bouncycastle.math.ec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class b implements h {
    protected i checkResult(i iVar) {
        return c.implCheckResult(iVar);
    }

    @Override // org.bouncycastle.math.ec.h
    public i multiply(i iVar, BigInteger bigInteger) {
        int signum = bigInteger.signum();
        if (signum == 0 || iVar.isInfinity()) {
            return iVar.getCurve().getInfinity();
        }
        i multiplyPositive = multiplyPositive(iVar, bigInteger.abs());
        if (signum <= 0) {
            multiplyPositive = multiplyPositive.negate();
        }
        return checkResult(multiplyPositive);
    }

    protected abstract i multiplyPositive(i iVar, BigInteger bigInteger);
}

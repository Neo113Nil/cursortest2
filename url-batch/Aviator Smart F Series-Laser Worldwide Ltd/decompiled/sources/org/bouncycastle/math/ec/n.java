package org.bouncycastle.math.ec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class n extends b {
    protected final e curve;
    protected final org.bouncycastle.math.ec.endo.d glvEndomorphism;

    public n(e eVar, org.bouncycastle.math.ec.endo.d dVar) {
        if (eVar == null || eVar.getOrder() == null) {
            throw new IllegalArgumentException("Need curve with known group order");
        }
        this.curve = eVar;
        this.glvEndomorphism = dVar;
    }

    @Override // org.bouncycastle.math.ec.b
    protected i multiplyPositive(i iVar, BigInteger bigInteger) {
        if (!this.curve.equals(iVar.getCurve())) {
            throw new IllegalStateException();
        }
        BigInteger[] decomposeScalar = this.glvEndomorphism.decomposeScalar(bigInteger.mod(iVar.getCurve().getOrder()));
        BigInteger bigInteger2 = decomposeScalar[0];
        BigInteger bigInteger3 = decomposeScalar[1];
        return this.glvEndomorphism.hasEfficientPointMap() ? c.implShamirsTrickWNaf(this.glvEndomorphism, iVar, bigInteger2, bigInteger3) : c.implShamirsTrickWNaf(iVar, bigInteger2, org.bouncycastle.math.ec.endo.c.mapPoint(this.glvEndomorphism, iVar), bigInteger3);
    }
}

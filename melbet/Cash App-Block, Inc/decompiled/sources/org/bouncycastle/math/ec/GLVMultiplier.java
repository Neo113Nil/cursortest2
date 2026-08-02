package org.bouncycastle.math.ec;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.math.ec.endo.EndoUtil;
import org.bouncycastle.math.ec.endo.GLVEndomorphism;

/* loaded from: classes8.dex */
public class GLVMultiplier extends AbstractECMultiplier {
    protected final ECCurve curve;
    protected final GLVEndomorphism glvEndomorphism;

    public GLVMultiplier(ECCurve eCCurve, GLVEndomorphism gLVEndomorphism) {
        if (eCCurve == null || eCCurve.getOrder() == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Need curve with known group order");
            throw null;
        }
        this.curve = eCCurve;
        this.glvEndomorphism = gLVEndomorphism;
    }

    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        if (!this.curve.equals(eCPoint.getCurve())) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        BigInteger[] decomposeScalar = this.glvEndomorphism.decomposeScalar(bigInteger.mod(eCPoint.getCurve().getOrder()));
        BigInteger bigInteger2 = decomposeScalar[0];
        BigInteger bigInteger3 = decomposeScalar[1];
        boolean hasEfficientPointMap = this.glvEndomorphism.hasEfficientPointMap();
        GLVEndomorphism gLVEndomorphism = this.glvEndomorphism;
        return hasEfficientPointMap ? ECAlgorithms.implShamirsTrickWNaf(gLVEndomorphism, eCPoint, bigInteger2, bigInteger3) : ECAlgorithms.implShamirsTrickWNaf(eCPoint, bigInteger2, EndoUtil.mapPoint(gLVEndomorphism, eCPoint), bigInteger3);
    }
}

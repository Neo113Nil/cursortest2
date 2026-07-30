package org.bouncycastle.math.ec.endo;

import java.math.BigInteger;
import org.bouncycastle.math.ec.i;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.q;

/* loaded from: classes5.dex */
public abstract class c {
    public static final String PRECOMP_NAME = "bc_endo";

    static class a implements p {
        final /* synthetic */ org.bouncycastle.math.ec.endo.a val$endomorphism;
        final /* synthetic */ i val$p;

        a(org.bouncycastle.math.ec.endo.a aVar, i iVar) {
            this.val$endomorphism = aVar;
            this.val$p = iVar;
        }

        private boolean checkExisting(b bVar, org.bouncycastle.math.ec.endo.a aVar) {
            return (bVar == null || bVar.getEndomorphism() != aVar || bVar.getMappedPoint() == null) ? false : true;
        }

        @Override // org.bouncycastle.math.ec.p
        public q precompute(q qVar) {
            b bVar = qVar instanceof b ? (b) qVar : null;
            if (checkExisting(bVar, this.val$endomorphism)) {
                return bVar;
            }
            i map = this.val$endomorphism.getPointMap().map(this.val$p);
            b bVar2 = new b();
            bVar2.setEndomorphism(this.val$endomorphism);
            bVar2.setMappedPoint(map);
            return bVar2;
        }
    }

    private static BigInteger calculateB(BigInteger bigInteger, BigInteger bigInteger2, int i8) {
        boolean z7 = bigInteger2.signum() < 0;
        BigInteger multiply = bigInteger.multiply(bigInteger2.abs());
        boolean testBit = multiply.testBit(i8 - 1);
        BigInteger shiftRight = multiply.shiftRight(i8);
        if (testBit) {
            shiftRight = shiftRight.add(org.bouncycastle.math.ec.d.ONE);
        }
        return z7 ? shiftRight.negate() : shiftRight;
    }

    public static BigInteger[] decomposeScalar(g gVar, BigInteger bigInteger) {
        int bits = gVar.getBits();
        BigInteger calculateB = calculateB(bigInteger, gVar.getG1(), bits);
        BigInteger calculateB2 = calculateB(bigInteger, gVar.getG2(), bits);
        return new BigInteger[]{bigInteger.subtract(calculateB.multiply(gVar.getV1A()).add(calculateB2.multiply(gVar.getV2A()))), calculateB.multiply(gVar.getV1B()).add(calculateB2.multiply(gVar.getV2B())).negate()};
    }

    public static i mapPoint(org.bouncycastle.math.ec.endo.a aVar, i iVar) {
        return ((b) iVar.getCurve().precompute(iVar, PRECOMP_NAME, new a(aVar, iVar))).getMappedPoint();
    }
}

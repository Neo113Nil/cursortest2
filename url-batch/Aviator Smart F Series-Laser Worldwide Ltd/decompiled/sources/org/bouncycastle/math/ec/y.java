package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class y extends b {
    static final String PRECOMP_NAME = "bc_wtnaf";

    static class a implements p {
        final /* synthetic */ byte val$a;
        final /* synthetic */ i.b val$p;

        a(i.b bVar, byte b8) {
            this.val$p = bVar;
            this.val$a = b8;
        }

        @Override // org.bouncycastle.math.ec.p
        public q precompute(q qVar) {
            if (qVar instanceof z) {
                return qVar;
            }
            z zVar = new z();
            zVar.setPreComp(t.getPreComp(this.val$p, this.val$a));
            return zVar;
        }
    }

    private static i.b multiplyFromWTnaf(i.b bVar, byte[] bArr) {
        e.b bVar2 = (e.b) bVar.getCurve();
        i.b[] preComp = ((z) bVar2.precompute(bVar, PRECOMP_NAME, new a(bVar, bVar2.getA().toBigInteger().byteValue()))).getPreComp();
        i.b[] bVarArr = new i.b[preComp.length];
        for (int i8 = 0; i8 < preComp.length; i8++) {
            bVarArr[i8] = (i.b) preComp[i8].negate();
        }
        i.b bVar3 = (i.b) bVar.getCurve().getInfinity();
        int i9 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i9++;
            byte b8 = bArr[length];
            if (b8 != 0) {
                bVar3 = (i.b) bVar3.tauPow(i9).add(b8 > 0 ? preComp[b8 >>> 1] : bVarArr[(-b8) >>> 1]);
                i9 = 0;
            }
        }
        return i9 > 0 ? bVar3.tauPow(i9) : bVar3;
    }

    private i.b multiplyWTnaf(i.b bVar, a0 a0Var, byte b8, byte b9) {
        return multiplyFromWTnaf(bVar, t.tauAdicWNaf(b9, a0Var, (byte) 4, BigInteger.valueOf(16L), t.getTw(b9, 4), b8 == 0 ? t.alpha0 : t.alpha1));
    }

    @Override // org.bouncycastle.math.ec.b
    protected i multiplyPositive(i iVar, BigInteger bigInteger) {
        if (!(iVar instanceof i.b)) {
            throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
        }
        i.b bVar = (i.b) iVar;
        e.b bVar2 = (e.b) bVar.getCurve();
        int fieldSize = bVar2.getFieldSize();
        byte byteValue = bVar2.getA().toBigInteger().byteValue();
        byte mu = t.getMu(byteValue);
        return multiplyWTnaf(bVar, t.partModReduction(bigInteger, fieldSize, byteValue, bVar2.getSi(), mu, (byte) 10), byteValue, mu);
    }
}

package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.asn1.o;

/* loaded from: classes5.dex */
public class i extends f {
    private o name;

    public i(o oVar, org.bouncycastle.asn1.x9.e eVar) {
        super(eVar);
        this.name = oVar;
    }

    public o getName() {
        return this.name;
    }

    public i(o oVar, f fVar) {
        super(fVar.getCurve(), fVar.getG(), fVar.getN(), fVar.getH(), fVar.getSeed());
        this.name = oVar;
    }

    public i(o oVar, org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.i iVar, BigInteger bigInteger) {
        this(oVar, eVar, iVar, bigInteger, org.bouncycastle.math.ec.d.ONE, null);
    }

    public i(o oVar, org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.i iVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(oVar, eVar, iVar, bigInteger, bigInteger2, null);
    }

    public i(o oVar, org.bouncycastle.math.ec.e eVar, org.bouncycastle.math.ec.i iVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        super(eVar, iVar, bigInteger, bigInteger2, bArr);
        this.name = oVar;
    }
}

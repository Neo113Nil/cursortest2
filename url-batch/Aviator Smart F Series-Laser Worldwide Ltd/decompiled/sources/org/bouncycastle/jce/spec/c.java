package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.bouncycastle.math.ec.i;
import org.bouncycastle.math.field.g;

/* loaded from: classes5.dex */
public class c extends ECParameterSpec {
    private String name;

    public c(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger) {
        super(ellipticCurve, eCPoint, bigInteger, 1);
        this.name = str;
    }

    private static EllipticCurve convertCurve(org.bouncycastle.math.ec.e eVar, byte[] bArr) {
        return new EllipticCurve(convertField(eVar.getField()), eVar.getA().toBigInteger(), eVar.getB().toBigInteger(), bArr);
    }

    private static ECField convertField(org.bouncycastle.math.field.b bVar) {
        if (org.bouncycastle.math.ec.c.isFpField(bVar)) {
            return new ECFieldFp(bVar.getCharacteristic());
        }
        org.bouncycastle.math.field.f minimalPolynomial = ((g) bVar).getMinimalPolynomial();
        int[] exponentsPresent = minimalPolynomial.getExponentsPresent();
        return new ECFieldF2m(minimalPolynomial.getDegree(), org.bouncycastle.util.a.reverseInPlace(org.bouncycastle.util.a.copyOfRange(exponentsPresent, 1, exponentsPresent.length - 1)));
    }

    public String getName() {
        return this.name;
    }

    public c(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        super(ellipticCurve, eCPoint, bigInteger, bigInteger2.intValue());
        this.name = str;
    }

    public c(String str, org.bouncycastle.math.ec.e eVar, i iVar, BigInteger bigInteger) {
        super(convertCurve(eVar, null), org.bouncycastle.jcajce.provider.asymmetric.util.a.convertPoint(iVar), bigInteger, 1);
        this.name = str;
    }

    public c(String str, org.bouncycastle.math.ec.e eVar, i iVar, BigInteger bigInteger, BigInteger bigInteger2) {
        super(convertCurve(eVar, null), org.bouncycastle.jcajce.provider.asymmetric.util.a.convertPoint(iVar), bigInteger, bigInteger2.intValue());
        this.name = str;
    }

    public c(String str, org.bouncycastle.math.ec.e eVar, i iVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        super(convertCurve(eVar, bArr), org.bouncycastle.jcajce.provider.asymmetric.util.a.convertPoint(iVar), bigInteger, bigInteger2.intValue());
        this.name = str;
    }
}

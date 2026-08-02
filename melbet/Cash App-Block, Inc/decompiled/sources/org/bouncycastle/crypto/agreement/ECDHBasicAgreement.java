package org.bouncycastle.crypto.agreement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECPoint;

/* loaded from: classes9.dex */
public class ECDHBasicAgreement implements BasicAgreement {
    private ECPrivateKeyParameters key;

    @Override // org.bouncycastle.crypto.BasicAgreement
    public BigInteger calculateAgreement(CipherParameters cipherParameters) {
        String str;
        ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) cipherParameters;
        ECDomainParameters parameters = this.key.getParameters();
        if (parameters.equals(eCPublicKeyParameters.getParameters())) {
            BigInteger d = this.key.getD();
            ECPoint cleanPoint = ECAlgorithms.cleanPoint(parameters.getCurve(), eCPublicKeyParameters.getQ());
            if (cleanPoint.isInfinity()) {
                str = "Infinity is not a valid public key for ECDH";
            } else {
                BigInteger h = parameters.getH();
                if (!h.equals(ECConstants.ONE)) {
                    d = parameters.getHInv().multiply(d).mod(parameters.getN());
                    cleanPoint = ECAlgorithms.referenceMultiply(cleanPoint, h);
                }
                ECPoint normalize = cleanPoint.multiply(d).normalize();
                if (!normalize.isInfinity()) {
                    return normalize.getAffineXCoord().toBigInteger();
                }
                str = "Infinity is not a valid agreement value for ECDH";
            }
        } else {
            str = "ECDH public key has wrong domain parameters";
        }
        a$$ExternalSyntheticBUOutline0.m$1(str);
        return null;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return this.key.getParameters().getCurve().getFieldElementEncodingLength();
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public void init(CipherParameters cipherParameters) {
        ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters) cipherParameters;
        this.key = eCPrivateKeyParameters;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("ECDH", eCPrivateKeyParameters));
    }
}

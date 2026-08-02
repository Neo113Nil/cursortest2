package org.bouncycastle.crypto.agreement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* loaded from: classes9.dex */
public class DHBasicAgreement implements BasicAgreement {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private DHParameters dhParams;
    private DHPrivateKeyParameters key;

    @Override // org.bouncycastle.crypto.BasicAgreement
    public BigInteger calculateAgreement(CipherParameters cipherParameters) {
        DHPublicKeyParameters dHPublicKeyParameters = (DHPublicKeyParameters) cipherParameters;
        if (!dHPublicKeyParameters.getParameters().equals(this.dhParams)) {
            a$$ExternalSyntheticBUOutline0.m$3("Diffie-Hellman public key has wrong parameters.");
            return null;
        }
        BigInteger p = this.dhParams.getP();
        BigInteger y = dHPublicKeyParameters.getY();
        if (y != null) {
            BigInteger bigInteger = ONE;
            if (y.compareTo(bigInteger) > 0 && y.compareTo(p.subtract(bigInteger)) < 0) {
                BigInteger modPow = y.modPow(this.key.getX(), p);
                if (!modPow.equals(bigInteger)) {
                    return modPow;
                }
                a$$ExternalSyntheticBUOutline0.m$1("Shared key can't be 1");
                return null;
            }
        }
        a$$ExternalSyntheticBUOutline0.m$3("Diffie-Hellman public key is weak");
        return null;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public int getFieldSize() {
        return (this.key.getParameters().getP().bitLength() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.BasicAgreement
    public void init(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        AsymmetricKeyParameter asymmetricKeyParameter = (AsymmetricKeyParameter) cipherParameters;
        if (!(asymmetricKeyParameter instanceof DHPrivateKeyParameters)) {
            a$$ExternalSyntheticBUOutline0.m$3("DHEngine expects DHPrivateKeyParameters");
            return;
        }
        DHPrivateKeyParameters dHPrivateKeyParameters = (DHPrivateKeyParameters) asymmetricKeyParameter;
        this.key = dHPrivateKeyParameters;
        this.dhParams = dHPrivateKeyParameters.getParameters();
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("DHB", this.key));
    }
}

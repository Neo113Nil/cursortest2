package org.bouncycastle.crypto.ec;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* loaded from: classes9.dex */
public class ECElGamalDecryptor implements ECDecryptor {
    private ECPrivateKeyParameters key;

    @Override // org.bouncycastle.crypto.ec.ECDecryptor
    public ECPoint decrypt(ECPair eCPair) {
        ECPrivateKeyParameters eCPrivateKeyParameters = this.key;
        if (eCPrivateKeyParameters == null) {
            a$$ExternalSyntheticBUOutline0.m$1("ECElGamalDecryptor not initialised");
            return null;
        }
        ECCurve curve = eCPrivateKeyParameters.getParameters().getCurve();
        return ECAlgorithms.cleanPoint(curve, eCPair.getY()).subtract(ECAlgorithms.cleanPoint(curve, eCPair.getX()).multiply(this.key.getD())).normalize();
    }

    @Override // org.bouncycastle.crypto.ec.ECDecryptor
    public void init(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ECPrivateKeyParameters) {
            this.key = (ECPrivateKeyParameters) cipherParameters;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("ECPrivateKeyParameters are required for decryption.");
        }
    }
}

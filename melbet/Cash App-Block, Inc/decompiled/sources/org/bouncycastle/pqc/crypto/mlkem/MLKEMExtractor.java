package org.bouncycastle.pqc.crypto.mlkem;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.EncapsulatedSecretExtractor;

/* loaded from: classes10.dex */
public class MLKEMExtractor implements EncapsulatedSecretExtractor {
    private final MLKEMEngine engine;
    private final MLKEMPrivateKeyParameters privateKey;

    public MLKEMExtractor(MLKEMPrivateKeyParameters mLKEMPrivateKeyParameters) {
        if (mLKEMPrivateKeyParameters == null) {
            a$$ExternalSyntheticBUOutline0.m$2("'privateKey' cannot be null");
            throw null;
        }
        this.privateKey = mLKEMPrivateKeyParameters;
        this.engine = mLKEMPrivateKeyParameters.getParameters().getEngine();
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        return this.engine.kemDecrypt(this.privateKey.getEncoded(), bArr);
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public int getEncapsulationLength() {
        return this.engine.getCryptoCipherTextBytes();
    }
}

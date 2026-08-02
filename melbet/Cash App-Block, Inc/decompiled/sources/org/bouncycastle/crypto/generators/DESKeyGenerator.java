package org.bouncycastle.crypto.generators;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.DESParameters;

/* loaded from: classes9.dex */
public class DESKeyGenerator extends CipherKeyGenerator {
    @Override // org.bouncycastle.crypto.CipherKeyGenerator
    public byte[] generateKey() {
        byte[] bArr = new byte[8];
        do {
            this.random.nextBytes(bArr);
            DESParameters.setOddParity(bArr);
        } while (DESParameters.isWeakKey(bArr, 0));
        return bArr;
    }

    @Override // org.bouncycastle.crypto.CipherKeyGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        super.init(keyGenerationParameters);
        int i = this.strength;
        if (i == 0 || i == 7) {
            this.strength = 8;
        } else if (i != 8) {
            a$$ExternalSyntheticBUOutline0.m$3("DES key must be 64 bits long.");
            return;
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("DESKeyGen", 56, null, CryptoServicePurpose.KEYGEN));
    }
}

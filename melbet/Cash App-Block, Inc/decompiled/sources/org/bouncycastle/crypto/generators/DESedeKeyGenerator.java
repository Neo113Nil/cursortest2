package org.bouncycastle.crypto.generators;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.DESParameters;
import org.bouncycastle.crypto.params.DESedeParameters;

/* loaded from: classes9.dex */
public class DESedeKeyGenerator extends DESKeyGenerator {
    private static final int MAX_IT = 20;

    @Override // org.bouncycastle.crypto.generators.DESKeyGenerator, org.bouncycastle.crypto.CipherKeyGenerator
    public byte[] generateKey() {
        int i = this.strength;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            this.random.nextBytes(bArr);
            DESParameters.setOddParity(bArr);
            i2++;
            if (i2 >= 20 || (!DESedeParameters.isWeakKey(bArr, 0, i) && DESedeParameters.isRealEDEKey(bArr, 0))) {
                break;
            }
        }
        if (!DESedeParameters.isWeakKey(bArr, 0, i) && DESedeParameters.isRealEDEKey(bArr, 0)) {
            return bArr;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Unable to generate DES-EDE key");
        return null;
    }

    @Override // org.bouncycastle.crypto.generators.DESKeyGenerator, org.bouncycastle.crypto.CipherKeyGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.random = keyGenerationParameters.getRandom();
        int strength = (keyGenerationParameters.getStrength() + 7) / 8;
        this.strength = strength;
        if (strength == 0 || strength == 21) {
            this.strength = 24;
        } else if (strength == 14) {
            this.strength = 16;
        } else if (strength != 24 && strength != 16) {
            a$$ExternalSyntheticBUOutline0.m$3("DESede key must be 192 or 128 bits long.");
            return;
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("DESedeKeyGen", 112, null, CryptoServicePurpose.KEYGEN));
    }
}

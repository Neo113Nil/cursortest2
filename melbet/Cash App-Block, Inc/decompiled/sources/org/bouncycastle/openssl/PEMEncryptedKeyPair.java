package org.bouncycastle.openssl;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import java.io.IOException;
import org.bouncycastle.operator.OperatorCreationException;

/* loaded from: classes8.dex */
public class PEMEncryptedKeyPair {
    private final String dekAlgName;
    private final byte[] iv;
    private final byte[] keyBytes;
    private final PEMKeyPairParser parser;

    public PEMEncryptedKeyPair(String str, byte[] bArr, byte[] bArr2, PEMKeyPairParser pEMKeyPairParser) {
        this.dekAlgName = str;
        this.iv = bArr;
        this.keyBytes = bArr2;
        this.parser = pEMKeyPairParser;
    }

    public PEMKeyPair decryptKeyPair(PEMDecryptorProvider pEMDecryptorProvider) {
        try {
            return this.parser.parse(pEMDecryptorProvider.get(this.dekAlgName).decrypt(this.keyBytes, this.iv));
        } catch (IOException e) {
            throw e;
        } catch (OperatorCreationException e2) {
            throw new PEMException("cannot create extraction operator: " + e2.getMessage(), e2);
        } catch (Exception e3) {
            throw new PEMException(Fragment$5$$ExternalSyntheticOutline0.m(e3, new StringBuilder("exception processing key pair: ")), e3);
        }
    }

    public String getDekAlgName() {
        return this.dekAlgName;
    }
}

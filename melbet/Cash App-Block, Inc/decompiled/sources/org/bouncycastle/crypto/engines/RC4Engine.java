package org.bouncycastle.crypto.engines;

import bo.app.a$$ExternalSyntheticBUOutline0;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: classes9.dex */
public class RC4Engine implements StreamCipher {
    private static final int STATE_LENGTH = 256;
    private boolean forEncryption;
    private byte[] engineState = null;
    private int x = 0;
    private int y = 0;
    private byte[] workingKey = null;

    public RC4Engine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 20));
    }

    private void setKey(byte[] bArr) {
        this.workingKey = bArr;
        this.x = 0;
        this.y = 0;
        if (this.engineState == null) {
            this.engineState = new byte[256];
        }
        for (int i = 0; i < 256; i++) {
            this.engineState[i] = (byte) i;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            int i5 = bArr[i2] & 255;
            byte[] bArr2 = this.engineState;
            byte b = bArr2[i4];
            i3 = (i5 + b + i3) & 255;
            bArr2[i4] = bArr2[i3];
            bArr2[i3] = b;
            i2 = (i2 + 1) % bArr.length;
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "RC4";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            a$$ExternalSyntheticBUOutline0.m$3(GetCert$$ExternalSyntheticOutline0.m("invalid parameter passed to RC4 init - ", cipherParameters));
            return;
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.workingKey = key;
        this.forEncryption = z;
        setKey(key);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 20, cipherParameters, Utils.getPurpose(z)));
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            f$$ExternalSyntheticLambda0.m$4("input buffer too short");
            return 0;
        }
        if (i3 + i2 > bArr2.length) {
            f$$ExternalSyntheticLambda0.m$3("output buffer too short");
            return 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (this.x + 1) & 255;
            this.x = i5;
            byte[] bArr3 = this.engineState;
            byte b = bArr3[i5];
            int i6 = (this.y + b) & 255;
            this.y = i6;
            bArr3[i5] = bArr3[i6];
            bArr3[i6] = b;
            bArr2[i4 + i3] = (byte) (bArr3[(bArr3[i5] + b) & 255] ^ bArr[i4 + i]);
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        setKey(this.workingKey);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        int i = (this.x + 1) & 255;
        this.x = i;
        byte[] bArr = this.engineState;
        byte b2 = bArr[i];
        int i2 = (this.y + b2) & 255;
        this.y = i2;
        bArr[i] = bArr[i2];
        bArr[i2] = b2;
        return (byte) (bArr[(bArr[i] + b2) & 255] ^ b);
    }
}

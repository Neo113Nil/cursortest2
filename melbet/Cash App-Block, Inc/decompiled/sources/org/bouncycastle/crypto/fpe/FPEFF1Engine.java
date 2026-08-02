package org.bouncycastle.crypto.fpe;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.params.FPEParameters;
import org.bouncycastle.util.Properties;

/* loaded from: classes9.dex */
public class FPEFF1Engine extends FPEEngine {
    public FPEFF1Engine(BlockCipher blockCipher) {
        super(blockCipher);
        if (blockCipher.getBlockSize() != 16) {
            a$$ExternalSyntheticBUOutline0.m$3("base cipher needs to be 128 bits");
            throw null;
        }
        if (Properties.isOverrideSet("org.bouncycastle.fpe.disable") || Properties.isOverrideSet("org.bouncycastle.fpe.disable_ff1")) {
            a$$ExternalSyntheticBUOutline0.m("FF1 encryption disabled");
            throw null;
        }
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public int decryptBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        byte[] decryptFF1;
        int radix = this.fpeParameters.getRadix();
        BlockCipher blockCipher = this.baseCipher;
        if (radix > 256) {
            decryptFF1 = FPEEngine.toByteArray(SP80038G.decryptFF1w(blockCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), FPEEngine.toShortArray(bArr), i, i2 / 2));
            i4 = i2;
        } else {
            i4 = i2;
            decryptFF1 = SP80038G.decryptFF1(blockCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), bArr, i, i4);
        }
        System.arraycopy(decryptFF1, 0, bArr2, i3, i4);
        return i4;
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public int encryptBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        byte[] encryptFF1;
        int radix = this.fpeParameters.getRadix();
        BlockCipher blockCipher = this.baseCipher;
        if (radix > 256) {
            encryptFF1 = FPEEngine.toByteArray(SP80038G.encryptFF1w(blockCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), FPEEngine.toShortArray(bArr), i, i2 / 2));
            i4 = i2;
        } else {
            i4 = i2;
            encryptFF1 = SP80038G.encryptFF1(blockCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), bArr, i, i4);
        }
        System.arraycopy(encryptFF1, 0, bArr2, i3, i4);
        return i4;
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public String getAlgorithmName() {
        return "FF1";
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forEncryption = z;
        this.fpeParameters = (FPEParameters) cipherParameters;
        this.baseCipher.init(!r2.isUsingInverseFunction(), this.fpeParameters.getKey());
    }

    public FPEFF1Engine() {
        this(AESEngine.newInstance());
    }
}

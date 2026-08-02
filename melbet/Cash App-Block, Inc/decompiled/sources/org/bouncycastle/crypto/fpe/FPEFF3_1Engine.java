package org.bouncycastle.crypto.fpe;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.params.FPEParameters;
import org.bouncycastle.util.Properties;

/* loaded from: classes9.dex */
public class FPEFF3_1Engine extends FPEEngine {
    public FPEFF3_1Engine(BlockCipher blockCipher) {
        super(blockCipher);
        if (blockCipher.getBlockSize() != 16) {
            a$$ExternalSyntheticBUOutline0.m$3("base cipher needs to be 128 bits");
            throw null;
        }
        if (Properties.isOverrideSet("org.bouncycastle.fpe.disable")) {
            a$$ExternalSyntheticBUOutline0.m("FPE disabled");
            throw null;
        }
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public int decryptBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        byte[] decryptFF3_1;
        int radix = this.fpeParameters.getRadix();
        BlockCipher blockCipher = this.baseCipher;
        if (radix > 256) {
            decryptFF3_1 = FPEEngine.toByteArray(SP80038G.decryptFF3_1w(blockCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), FPEEngine.toShortArray(bArr), i, i2 / 2));
            i4 = i2;
        } else {
            i4 = i2;
            decryptFF3_1 = SP80038G.decryptFF3_1(blockCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), bArr, i, i4);
        }
        System.arraycopy(decryptFF3_1, 0, bArr2, i3, i4);
        return i4;
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public int encryptBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        byte[] encryptFF3_1;
        int radix = this.fpeParameters.getRadix();
        BlockCipher blockCipher = this.baseCipher;
        if (radix > 256) {
            encryptFF3_1 = FPEEngine.toByteArray(SP80038G.encryptFF3_1w(blockCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), FPEEngine.toShortArray(bArr), i, i2 / 2));
            i4 = i2;
        } else {
            i4 = i2;
            encryptFF3_1 = SP80038G.encryptFF3_1(blockCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), bArr, i, i4);
        }
        System.arraycopy(encryptFF3_1, 0, bArr2, i3, i4);
        return i4;
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public String getAlgorithmName() {
        return "FF3-1";
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forEncryption = z;
        this.fpeParameters = (FPEParameters) cipherParameters;
        this.baseCipher.init(!r3.isUsingInverseFunction(), this.fpeParameters.getKey().reverse());
        if (this.fpeParameters.getTweak().length == 7) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("tweak should be 56 bits");
    }

    public FPEFF3_1Engine() {
        this(AESEngine.newInstance());
    }
}

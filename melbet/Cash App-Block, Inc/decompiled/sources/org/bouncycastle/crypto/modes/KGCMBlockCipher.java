package org.bouncycastle.crypto.modes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier;
import org.bouncycastle.crypto.modes.kgcm.Tables16kKGCMMultiplier_512;
import org.bouncycastle.crypto.modes.kgcm.Tables4kKGCMMultiplier_128;
import org.bouncycastle.crypto.modes.kgcm.Tables8kKGCMMultiplier_256;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes9.dex */
public class KGCMBlockCipher implements AEADBlockCipher {
    private static final int MIN_MAC_BITS = 64;
    private long[] b;
    private final int blockSize;
    private BufferedBlockCipher ctrEngine;
    private BlockCipher engine;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private byte[] iv;
    private byte[] macBlock;
    private KGCMMultiplier multiplier;
    private ExposedByteArrayOutputStream associatedText = new ExposedByteArrayOutputStream();
    private ExposedByteArrayOutputStream data = new ExposedByteArrayOutputStream();
    private int macSize = -1;

    public static class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public KGCMBlockCipher(BlockCipher blockCipher) {
        this.engine = blockCipher;
        this.ctrEngine = new BufferedBlockCipher(new KCTRBlockCipher(blockCipher));
        int blockSize = this.engine.getBlockSize();
        this.blockSize = blockSize;
        this.initialAssociatedText = new byte[blockSize];
        this.iv = new byte[blockSize];
        this.multiplier = createDefaultMultiplier(blockSize);
        this.b = new long[blockSize >>> 3];
        this.macBlock = null;
    }

    private void calculateMac(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i2;
        while (true) {
            long[] jArr = this.b;
            if (i >= i4) {
                long j = (i3 & BodyPartID.bodyIdMax) << 3;
                long j2 = (BodyPartID.bodyIdMax & i2) << 3;
                jArr[0] = j ^ jArr[0];
                int i5 = this.blockSize >>> 4;
                jArr[i5] = jArr[i5] ^ j2;
                byte[] longToLittleEndian = Pack.longToLittleEndian(jArr);
                this.macBlock = longToLittleEndian;
                this.engine.processBlock(longToLittleEndian, 0, longToLittleEndian, 0);
                return;
            }
            xorWithInput(jArr, bArr, i);
            this.multiplier.multiplyH(this.b);
            i += this.blockSize;
        }
    }

    private static KGCMMultiplier createDefaultMultiplier(int i) {
        if (i == 16) {
            return new Tables4kKGCMMultiplier_128();
        }
        if (i == 32) {
            return new Tables8kKGCMMultiplier_256();
        }
        if (i == 64) {
            return new Tables16kKGCMMultiplier_512();
        }
        a$$ExternalSyntheticBUOutline0.m$3("Only 128, 256, and 512 -bit block sizes supported");
        return null;
    }

    private void processAAD(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            xorWithInput(this.b, bArr, i);
            this.multiplier.multiplyH(this.b);
            i += this.blockSize;
        }
    }

    private static void xorWithInput(long[] jArr, byte[] bArr, int i) {
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2] = jArr[i2] ^ Pack.littleEndianToLong(bArr, i);
            i += 8;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) {
        int i2;
        int doFinal;
        int size = this.data.size();
        if (!this.forEncryption && size < this.macSize) {
            f$$ExternalSyntheticLambda0.m$2("data too short");
            return 0;
        }
        byte[] bArr2 = new byte[this.blockSize];
        this.engine.processBlock(bArr2, 0, bArr2, 0);
        long[] jArr = new long[this.blockSize >>> 3];
        Pack.littleEndianToLong(bArr2, 0, jArr);
        this.multiplier.init(jArr);
        Arrays.fill(bArr2, (byte) 0);
        Arrays.fill(jArr, 0L);
        int size2 = this.associatedText.size();
        if (size2 > 0) {
            processAAD(this.associatedText.getBuffer(), 0, size2);
        }
        if (!this.forEncryption) {
            i2 = size;
            int i3 = i2 - this.macSize;
            if (bArr.length - i < i3) {
                f$$ExternalSyntheticLambda0.m$3("Output buffer too short");
                return 0;
            }
            calculateMac(this.data.getBuffer(), 0, i3, size2);
            int processBytes = this.ctrEngine.processBytes(this.data.getBuffer(), 0, i3, bArr, i);
            doFinal = this.ctrEngine.doFinal(bArr, i + processBytes) + processBytes;
        } else {
            if ((bArr.length - i) - this.macSize < size) {
                f$$ExternalSyntheticLambda0.m$3("Output buffer too short");
                return 0;
            }
            int processBytes2 = this.ctrEngine.processBytes(this.data.getBuffer(), 0, size, bArr, i);
            i2 = size;
            doFinal = this.ctrEngine.doFinal(bArr, i + processBytes2) + processBytes2;
            calculateMac(bArr, i, i2, size2);
        }
        byte[] bArr3 = this.macBlock;
        if (bArr3 == null) {
            a$$ExternalSyntheticBUOutline0.m$1("mac is not calculated");
            return 0;
        }
        boolean z = this.forEncryption;
        int i4 = this.macSize;
        if (z) {
            System.arraycopy(bArr3, 0, bArr, i + doFinal, i4);
            reset();
            return doFinal + this.macSize;
        }
        byte[] bArr4 = new byte[i4];
        byte[] buffer = this.data.getBuffer();
        int i5 = this.macSize;
        System.arraycopy(buffer, i2 - i5, bArr4, 0, i5);
        int i6 = this.macSize;
        byte[] bArr5 = new byte[i6];
        System.arraycopy(this.macBlock, 0, bArr5, 0, i6);
        if (Arrays.constantTimeAreEqual(bArr4, bArr5)) {
            reset();
            return doFinal;
        }
        f$$ExternalSyntheticLambda0.m$2("mac verification failed");
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName() + "/KGCM";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        int i = this.macSize;
        byte[] bArr = new byte[i];
        System.arraycopy(this.macBlock, 0, bArr, 0, i);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        int size = this.data.size() + i;
        boolean z = this.forEncryption;
        int i2 = this.macSize;
        if (z) {
            return size + i2;
        }
        if (size < i2) {
            return 0;
        }
        return size - i2;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        KeyParameter keyParameter;
        this.forEncryption = z;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            byte[] nonce = aEADParameters.getNonce();
            byte[] bArr = this.iv;
            int length = bArr.length - nonce.length;
            Arrays.fill(bArr, (byte) 0);
            System.arraycopy(nonce, 0, this.iv, length, nonce.length);
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 64 || macSize > (this.blockSize << 3) || (macSize & 7) != 0) {
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(macSize, "Invalid value for MAC size: "));
                return;
            }
            this.macSize = macSize >>> 3;
            keyParameter = aEADParameters.getKey();
            byte[] bArr2 = this.initialAssociatedText;
            if (bArr2 != null) {
                processAADBytes(bArr2, 0, bArr2.length);
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                a$$ExternalSyntheticBUOutline0.m$3("Invalid parameter passed");
                return;
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            byte[] bArr3 = this.iv;
            int length2 = bArr3.length - iv.length;
            Arrays.fill(bArr3, (byte) 0);
            System.arraycopy(iv, 0, this.iv, length2, iv.length);
            this.initialAssociatedText = null;
            this.macSize = this.blockSize;
            keyParameter = (KeyParameter) parametersWithIV.getParameters();
        }
        this.macBlock = new byte[this.blockSize];
        this.ctrEngine.init(true, new ParametersWithIV(keyParameter, this.iv));
        this.engine.init(true, keyParameter);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b) {
        this.associatedText.write(b);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        this.associatedText.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b, byte[] bArr, int i) {
        this.data.write(b);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr.length >= i + i2) {
            this.data.write(bArr, i, i2);
            return 0;
        }
        f$$ExternalSyntheticLambda0.m$4("input buffer too short");
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        Arrays.fill(this.b, 0L);
        this.engine.reset();
        this.data.reset();
        this.associatedText.reset();
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }
}

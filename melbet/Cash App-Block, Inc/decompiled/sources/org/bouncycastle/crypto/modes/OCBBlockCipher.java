package org.bouncycastle.crypto.modes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Vector;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Longs;

/* loaded from: classes9.dex */
public class OCBBlockCipher implements AEADBlockCipher {
    private static final int BLOCK_SIZE = 16;
    private byte[] Checksum;
    private Vector L;
    private byte[] L_Asterisk;
    private byte[] L_Dollar;
    private byte[] OffsetHASH;
    private byte[] Sum;
    private boolean forEncryption;
    private byte[] hashBlock;
    private long hashBlockCount;
    private int hashBlockPos;
    private BlockCipher hashCipher;
    private byte[] initialAssociatedText;
    private byte[] macBlock;
    private int macSize;
    private byte[] mainBlock;
    private long mainBlockCount;
    private int mainBlockPos;
    private BlockCipher mainCipher;
    private byte[] KtopInput = null;
    private byte[] Stretch = new byte[24];
    private byte[] OffsetMAIN_0 = new byte[16];
    private byte[] OffsetMAIN = new byte[16];

    public OCBBlockCipher(BlockCipher blockCipher, BlockCipher blockCipher2) {
        if (blockCipher == null) {
            a$$ExternalSyntheticBUOutline0.m$3("'hashCipher' cannot be null");
            throw null;
        }
        if (blockCipher.getBlockSize() != 16) {
            a$$ExternalSyntheticBUOutline0.m$3("'hashCipher' must have a block size of 16");
            throw null;
        }
        if (blockCipher2 == null) {
            a$$ExternalSyntheticBUOutline0.m$3("'mainCipher' cannot be null");
            throw null;
        }
        if (blockCipher2.getBlockSize() != 16) {
            a$$ExternalSyntheticBUOutline0.m$3("'mainCipher' must have a block size of 16");
            throw null;
        }
        if (!blockCipher.getAlgorithmName().equals(blockCipher2.getAlgorithmName())) {
            a$$ExternalSyntheticBUOutline0.m$3("'hashCipher' and 'mainCipher' must be the same algorithm");
            throw null;
        }
        this.hashCipher = blockCipher;
        this.mainCipher = blockCipher2;
    }

    public static byte[] OCB_double(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int shiftLeft = shiftLeft(bArr, bArr2);
        bArr2[15] = (byte) ((EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE >>> ((1 - shiftLeft) << 3)) ^ bArr2[15]);
        return bArr2;
    }

    public static void OCB_extend(byte[] bArr, int i) {
        bArr[i] = Byte.MIN_VALUE;
        while (true) {
            i++;
            if (i >= 16) {
                return;
            } else {
                bArr[i] = 0;
            }
        }
    }

    public static int OCB_ntz(long j) {
        return Longs.numberOfTrailingZeros(j);
    }

    public static int shiftLeft(byte[] bArr, byte[] bArr2) {
        int i = 16;
        int i2 = 0;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            int i3 = bArr[i] & 255;
            bArr2[i] = (byte) (i2 | (i3 << 1));
            i2 = (i3 >>> 7) & 1;
        }
    }

    public static void xor(byte[] bArr, byte[] bArr2) {
        Bytes.xorTo(16, bArr2, bArr);
    }

    public void clear(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) {
        byte[] bArr2;
        String str;
        if (this.forEncryption) {
            bArr2 = null;
        } else {
            int i2 = this.mainBlockPos;
            int i3 = this.macSize;
            if (i2 < i3) {
                str = "data too short";
                f$$ExternalSyntheticLambda0.m$2(str);
                return 0;
            }
            int i4 = i2 - i3;
            this.mainBlockPos = i4;
            bArr2 = new byte[i3];
            System.arraycopy(this.mainBlock, i4, bArr2, 0, i3);
        }
        int i5 = this.hashBlockPos;
        if (i5 > 0) {
            OCB_extend(this.hashBlock, i5);
            updateHASH(this.L_Asterisk);
        }
        int i6 = this.mainBlockPos;
        if (i6 > 0) {
            if (this.forEncryption) {
                OCB_extend(this.mainBlock, i6);
                xor(this.Checksum, this.mainBlock);
            }
            xor(this.OffsetMAIN, this.L_Asterisk);
            byte[] bArr3 = new byte[16];
            this.hashCipher.processBlock(this.OffsetMAIN, 0, bArr3, 0);
            xor(this.mainBlock, bArr3);
            int length = bArr.length;
            int i7 = this.mainBlockPos;
            if (length < i + i7) {
                f$$ExternalSyntheticLambda0.m$3("Output buffer too short");
                return 0;
            }
            System.arraycopy(this.mainBlock, 0, bArr, i, i7);
            if (!this.forEncryption) {
                OCB_extend(this.mainBlock, this.mainBlockPos);
                xor(this.Checksum, this.mainBlock);
            }
        }
        xor(this.Checksum, this.OffsetMAIN);
        xor(this.Checksum, this.L_Dollar);
        BlockCipher blockCipher = this.hashCipher;
        byte[] bArr4 = this.Checksum;
        blockCipher.processBlock(bArr4, 0, bArr4, 0);
        xor(this.Checksum, this.Sum);
        int i8 = this.macSize;
        byte[] bArr5 = new byte[i8];
        this.macBlock = bArr5;
        System.arraycopy(this.Checksum, 0, bArr5, 0, i8);
        int i9 = this.mainBlockPos;
        if (this.forEncryption) {
            int length2 = bArr.length;
            int i10 = i + i9;
            int i11 = this.macSize;
            if (length2 < i10 + i11) {
                f$$ExternalSyntheticLambda0.m$3("Output buffer too short");
                return 0;
            }
            System.arraycopy(this.macBlock, 0, bArr, i10, i11);
            i9 += this.macSize;
        } else if (!Arrays.constantTimeAreEqual(this.macBlock, bArr2)) {
            str = "mac check in OCB failed";
            f$$ExternalSyntheticLambda0.m$2(str);
            return 0;
        }
        reset(false);
        return i9;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.mainCipher.getAlgorithmName() + "/OCB";
    }

    public byte[] getLSub(int i) {
        while (true) {
            int size = this.L.size();
            Vector vector = this.L;
            if (i < size) {
                return (byte[]) vector.elementAt(i);
            }
            vector.addElement(OCB_double((byte[]) vector.lastElement()));
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        byte[] bArr = this.macBlock;
        return bArr == null ? new byte[this.macSize] : Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        int i2 = i + this.mainBlockPos;
        boolean z = this.forEncryption;
        int i3 = this.macSize;
        if (z) {
            return i2 + i3;
        }
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.mainCipher;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + this.mainBlockPos;
        if (!this.forEncryption) {
            int i3 = this.macSize;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % 16);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        byte[] iv;
        KeyParameter keyParameter;
        boolean z2 = this.forEncryption;
        this.forEncryption = z;
        this.macBlock = null;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 64 || macSize > 128 || macSize % 8 != 0) {
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(macSize, "Invalid value for MAC size: "));
                return;
            } else {
                this.macSize = macSize / 8;
                keyParameter = aEADParameters.getKey();
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                a$$ExternalSyntheticBUOutline0.m$3("invalid parameters passed to OCB");
                return;
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = 16;
            keyParameter = (KeyParameter) parametersWithIV.getParameters();
        }
        this.hashBlock = new byte[16];
        this.mainBlock = new byte[z ? 16 : this.macSize + 16];
        if (iv == null) {
            iv = new byte[0];
        }
        if (iv.length > 15) {
            a$$ExternalSyntheticBUOutline0.m$3("IV must be no more than 15 bytes");
            return;
        }
        if (keyParameter != null) {
            this.hashCipher.init(true, keyParameter);
            this.mainCipher.init(z, keyParameter);
            this.KtopInput = null;
        } else if (z2 != z) {
            a$$ExternalSyntheticBUOutline0.m$3("cannot change encrypting state without providing key.");
            return;
        }
        byte[] bArr = new byte[16];
        this.L_Asterisk = bArr;
        this.hashCipher.processBlock(bArr, 0, bArr, 0);
        this.L_Dollar = OCB_double(this.L_Asterisk);
        Vector vector = new Vector();
        this.L = vector;
        vector.addElement(OCB_double(this.L_Dollar));
        int processNonce = processNonce(iv);
        int i = processNonce % 8;
        int i2 = processNonce / 8;
        if (i == 0) {
            System.arraycopy(this.Stretch, i2, this.OffsetMAIN_0, 0, 16);
        } else {
            for (int i3 = 0; i3 < 16; i3++) {
                byte[] bArr2 = this.Stretch;
                int i4 = bArr2[i2] & 255;
                i2++;
                this.OffsetMAIN_0[i3] = (byte) (((bArr2[i2] & 255) >>> (8 - i)) | (i4 << i));
            }
        }
        this.hashBlockPos = 0;
        this.mainBlockPos = 0;
        this.hashBlockCount = 0L;
        this.mainBlockCount = 0L;
        this.OffsetHASH = new byte[16];
        this.Sum = new byte[16];
        System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
        this.Checksum = new byte[16];
        byte[] bArr3 = this.initialAssociatedText;
        if (bArr3 != null) {
            processAADBytes(bArr3, 0, bArr3.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b) {
        byte[] bArr = this.hashBlock;
        int i = this.hashBlockPos;
        bArr[i] = b;
        int i2 = i + 1;
        this.hashBlockPos = i2;
        if (i2 == bArr.length) {
            processHashBlock();
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.hashBlock;
            int i4 = this.hashBlockPos;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.hashBlockPos = i5;
            if (i5 == bArr2.length) {
                processHashBlock();
            }
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b, byte[] bArr, int i) {
        byte[] bArr2 = this.mainBlock;
        int i2 = this.mainBlockPos;
        bArr2[i2] = b;
        int i3 = i2 + 1;
        this.mainBlockPos = i3;
        if (i3 != bArr2.length) {
            return 0;
        }
        processMainBlock(bArr, i);
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr.length < i + i2) {
            f$$ExternalSyntheticLambda0.m$4("Input buffer too short");
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            byte[] bArr3 = this.mainBlock;
            int i6 = this.mainBlockPos;
            bArr3[i6] = bArr[i + i5];
            int i7 = i6 + 1;
            this.mainBlockPos = i7;
            if (i7 == bArr3.length) {
                processMainBlock(bArr2, i3 + i4);
                i4 += 16;
            }
        }
        return i4;
    }

    public void processHashBlock() {
        long j = this.hashBlockCount + 1;
        this.hashBlockCount = j;
        updateHASH(getLSub(OCB_ntz(j)));
        this.hashBlockPos = 0;
    }

    public void processMainBlock(byte[] bArr, int i) {
        if (bArr.length < i + 16) {
            f$$ExternalSyntheticLambda0.m$3("Output buffer too short");
            return;
        }
        if (this.forEncryption) {
            xor(this.Checksum, this.mainBlock);
            this.mainBlockPos = 0;
        }
        byte[] bArr2 = this.OffsetMAIN;
        long j = this.mainBlockCount + 1;
        this.mainBlockCount = j;
        xor(bArr2, getLSub(OCB_ntz(j)));
        xor(this.mainBlock, this.OffsetMAIN);
        BlockCipher blockCipher = this.mainCipher;
        byte[] bArr3 = this.mainBlock;
        blockCipher.processBlock(bArr3, 0, bArr3, 0);
        xor(this.mainBlock, this.OffsetMAIN);
        System.arraycopy(this.mainBlock, 0, bArr, i, 16);
        if (this.forEncryption) {
            return;
        }
        xor(this.Checksum, this.mainBlock);
        byte[] bArr4 = this.mainBlock;
        System.arraycopy(bArr4, 16, bArr4, 0, this.macSize);
        this.mainBlockPos = this.macSize;
    }

    public int processNonce(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
        bArr2[0] = (byte) (this.macSize << 4);
        int length = 15 - bArr.length;
        bArr2[length] = (byte) (bArr2[length] | 1);
        byte b = bArr2[15];
        int i2 = b & 63;
        bArr2[15] = (byte) (b & 192);
        byte[] bArr3 = this.KtopInput;
        if (bArr3 == null || !Arrays.areEqual(bArr2, bArr3)) {
            byte[] bArr4 = new byte[16];
            this.KtopInput = bArr2;
            this.hashCipher.processBlock(bArr2, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, this.Stretch, 0, 16);
            while (i < 8) {
                byte[] bArr5 = this.Stretch;
                int i3 = i + 16;
                byte b2 = bArr4[i];
                i++;
                bArr5[i3] = (byte) (b2 ^ bArr4[i]);
            }
        }
        return i2;
    }

    public void reset(boolean z) {
        this.hashCipher.reset();
        this.mainCipher.reset();
        clear(this.hashBlock);
        clear(this.mainBlock);
        this.hashBlockPos = 0;
        this.mainBlockPos = 0;
        this.hashBlockCount = 0L;
        this.mainBlockCount = 0L;
        clear(this.OffsetHASH);
        clear(this.Sum);
        System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
        clear(this.Checksum);
        if (z) {
            this.macBlock = null;
        }
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    public void updateHASH(byte[] bArr) {
        xor(this.OffsetHASH, bArr);
        xor(this.hashBlock, this.OffsetHASH);
        BlockCipher blockCipher = this.hashCipher;
        byte[] bArr2 = this.hashBlock;
        blockCipher.processBlock(bArr2, 0, bArr2, 0);
        xor(this.Sum, this.hashBlock);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }
}

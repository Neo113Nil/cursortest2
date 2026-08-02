package org.bouncycastle.crypto.engines;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import java.io.ByteArrayOutputStream;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes9.dex */
public class XoodyakEngine implements AEADCipher {
    private byte[] K;
    private int Rabsorb;
    private boolean aadFinished;
    private boolean encrypted;
    private boolean forEncryption;
    private byte[] iv;
    private MODE mode;
    private int phase;
    private byte[] state;
    private byte[] tag;
    private final int f_bPrime = 48;
    private final int Rkout = 24;
    private final int PhaseDown = 1;
    private final int PhaseUp = 2;
    private final int MAXROUNDS = 12;
    private final int TAGLEN = 16;
    final int Rkin = 44;
    private final int[] RC = {88, 56, 960, EnumC0170g.SDK_ASSET_ICON_INCOME_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE, 20, 96, 44, 896, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 416, 18};
    private boolean initialised = false;
    private final ByteArrayOutputStream aadData = new ByteArrayOutputStream();
    private final ByteArrayOutputStream message = new ByteArrayOutputStream();

    public enum MODE {
        ModeHash,
        ModeKeyed
    }

    private void AbsorbAny(byte[] bArr, int i, int i2, int i3, int i4) {
        while (true) {
            if (this.phase != 2) {
                Up(null, 0, 0);
            }
            int min = Math.min(i2, i3);
            Down(bArr, i, min, i4);
            i += min;
            i2 -= min;
            if (i2 == 0) {
                return;
            } else {
                i4 = 0;
            }
        }
    }

    private void Up(byte[] bArr, int i, int i2) {
        if (this.mode != MODE.ModeHash) {
            byte[] bArr2 = this.state;
            bArr2[47] = (byte) (bArr2[47] ^ i2);
        }
        int littleEndianToInt = Pack.littleEndianToInt(this.state, 0);
        int littleEndianToInt2 = Pack.littleEndianToInt(this.state, 4);
        int littleEndianToInt3 = Pack.littleEndianToInt(this.state, 8);
        int i3 = 12;
        int littleEndianToInt4 = Pack.littleEndianToInt(this.state, 12);
        int littleEndianToInt5 = Pack.littleEndianToInt(this.state, 16);
        int littleEndianToInt6 = Pack.littleEndianToInt(this.state, 20);
        int littleEndianToInt7 = Pack.littleEndianToInt(this.state, 24);
        int littleEndianToInt8 = Pack.littleEndianToInt(this.state, 28);
        int littleEndianToInt9 = Pack.littleEndianToInt(this.state, 32);
        int littleEndianToInt10 = Pack.littleEndianToInt(this.state, 36);
        int littleEndianToInt11 = Pack.littleEndianToInt(this.state, 40);
        int littleEndianToInt12 = Pack.littleEndianToInt(this.state, 44);
        int i4 = 0;
        while (i4 < i3) {
            int i5 = (littleEndianToInt ^ littleEndianToInt5) ^ littleEndianToInt9;
            int i6 = i4;
            int i7 = (littleEndianToInt2 ^ littleEndianToInt6) ^ littleEndianToInt10;
            int i8 = (littleEndianToInt3 ^ littleEndianToInt7) ^ littleEndianToInt11;
            int i9 = littleEndianToInt12;
            int i10 = (littleEndianToInt4 ^ littleEndianToInt8) ^ i9;
            int i11 = littleEndianToInt11;
            int rotateLeft = Integers.rotateLeft(i10, 5) ^ Integers.rotateLeft(i10, 14);
            int rotateLeft2 = Integers.rotateLeft(i5, 5) ^ Integers.rotateLeft(i5, 14);
            int rotateLeft3 = Integers.rotateLeft(i7, 5) ^ Integers.rotateLeft(i7, 14);
            int rotateLeft4 = Integers.rotateLeft(i8, 14) ^ Integers.rotateLeft(i8, 5);
            int i12 = littleEndianToInt ^ rotateLeft;
            int i13 = littleEndianToInt5 ^ rotateLeft;
            int i14 = littleEndianToInt2 ^ rotateLeft2;
            int i15 = littleEndianToInt6 ^ rotateLeft2;
            int i16 = rotateLeft2 ^ littleEndianToInt10;
            int i17 = littleEndianToInt3 ^ rotateLeft3;
            int i18 = littleEndianToInt7 ^ rotateLeft3;
            int i19 = littleEndianToInt4 ^ rotateLeft4;
            int i20 = littleEndianToInt8 ^ rotateLeft4;
            int rotateLeft5 = Integers.rotateLeft(littleEndianToInt9 ^ rotateLeft, 11);
            int rotateLeft6 = Integers.rotateLeft(i16, 11);
            int rotateLeft7 = Integers.rotateLeft(i11 ^ rotateLeft3, 11);
            int rotateLeft8 = Integers.rotateLeft(i9 ^ rotateLeft4, 11);
            int i21 = i12 ^ this.RC[i6];
            int i22 = ((~i20) & rotateLeft5) ^ i21;
            int i23 = ((~i13) & rotateLeft6) ^ i14;
            int i24 = ((~i15) & rotateLeft7) ^ i17;
            int i25 = ((~i18) & rotateLeft8) ^ i19;
            int i26 = ((~rotateLeft5) & i21) ^ i20;
            int i27 = i13 ^ ((~rotateLeft6) & i14);
            int i28 = ((~rotateLeft7) & i17) ^ i15;
            int i29 = ((~rotateLeft8) & i19) ^ i18;
            int i30 = rotateLeft5 ^ ((~i21) & i20);
            int i31 = rotateLeft6 ^ ((~i14) & i13);
            int i32 = rotateLeft7 ^ ((~i17) & i15);
            int i33 = rotateLeft8 ^ ((~i19) & i18);
            littleEndianToInt5 = Integers.rotateLeft(i26, 1);
            littleEndianToInt6 = Integers.rotateLeft(i27, 1);
            int rotateLeft9 = Integers.rotateLeft(i28, 1);
            int rotateLeft10 = Integers.rotateLeft(i29, 1);
            int rotateLeft11 = Integers.rotateLeft(i32, 8);
            littleEndianToInt10 = Integers.rotateLeft(i33, 8);
            int rotateLeft12 = Integers.rotateLeft(i30, 8);
            int rotateLeft13 = Integers.rotateLeft(i31, 8);
            i4 = i6 + 1;
            littleEndianToInt2 = i23;
            littleEndianToInt4 = i25;
            i3 = 12;
            littleEndianToInt7 = rotateLeft9;
            littleEndianToInt12 = rotateLeft13;
            littleEndianToInt = i22;
            littleEndianToInt9 = rotateLeft11;
            littleEndianToInt3 = i24;
            littleEndianToInt8 = rotateLeft10;
            littleEndianToInt11 = rotateLeft12;
        }
        Pack.intToLittleEndian(littleEndianToInt, this.state, 0);
        Pack.intToLittleEndian(littleEndianToInt2, this.state, 4);
        Pack.intToLittleEndian(littleEndianToInt3, this.state, 8);
        Pack.intToLittleEndian(littleEndianToInt4, this.state, 12);
        Pack.intToLittleEndian(littleEndianToInt5, this.state, 16);
        Pack.intToLittleEndian(littleEndianToInt6, this.state, 20);
        Pack.intToLittleEndian(littleEndianToInt7, this.state, 24);
        Pack.intToLittleEndian(littleEndianToInt8, this.state, 28);
        Pack.intToLittleEndian(littleEndianToInt9, this.state, 32);
        Pack.intToLittleEndian(littleEndianToInt10, this.state, 36);
        Pack.intToLittleEndian(littleEndianToInt11, this.state, 40);
        Pack.intToLittleEndian(littleEndianToInt12, this.state, 44);
        this.phase = 2;
        if (bArr != null) {
            System.arraycopy(this.state, 0, bArr, 0, i);
        }
    }

    private int encrypt(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3 = new byte[24];
        int i4 = this.encrypted ? 0 : 128;
        int i5 = i2;
        while (true) {
            if (i5 == 0 && this.encrypted) {
                return i2;
            }
            int min = Math.min(i5, 24);
            if (this.forEncryption) {
                System.arraycopy(bArr, i, bArr3, 0, min);
            }
            Up(null, 0, i4);
            int i6 = 0;
            while (i6 < min) {
                bArr2[i3 + i6] = (byte) (bArr[i] ^ this.state[i6]);
                i6++;
                i++;
            }
            if (this.forEncryption) {
                Down(bArr3, 0, min, 0);
            } else {
                Down(bArr2, i3, min, 0);
            }
            i3 += min;
            i5 -= min;
            this.encrypted = true;
            i4 = 0;
        }
    }

    private void processAAD() {
        if (this.aadFinished) {
            return;
        }
        byte[] byteArray = this.aadData.toByteArray();
        AbsorbAny(byteArray, 0, byteArray.length, this.Rabsorb, 3);
        this.aadFinished = true;
    }

    private void reset(boolean z) {
        if (z) {
            this.tag = null;
        }
        Arrays.fill(this.state, (byte) 0);
        this.aadFinished = false;
        this.encrypted = false;
        this.phase = 2;
        this.message.reset();
        this.aadData.reset();
        byte[] bArr = this.K;
        int length = bArr.length;
        int length2 = this.iv.length;
        byte[] bArr2 = new byte[44];
        this.mode = MODE.ModeKeyed;
        this.Rabsorb = 44;
        System.arraycopy(bArr, 0, bArr2, 0, length);
        System.arraycopy(this.iv, 0, bArr2, length, length2);
        int i = length + length2;
        bArr2[i] = (byte) length2;
        AbsorbAny(bArr2, 0, i + 1, this.Rabsorb, 2);
    }

    public void Down(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2;
        int i4 = 0;
        while (true) {
            bArr2 = this.state;
            if (i4 >= i2) {
                break;
            }
            bArr2[i4] = (byte) (bArr[i] ^ bArr2[i4]);
            i4++;
            i++;
        }
        bArr2[i2] = (byte) (bArr2[i2] ^ 1);
        byte b = bArr2[47];
        if (this.mode == MODE.ModeHash) {
            i3 &= 1;
        }
        bArr2[47] = (byte) (b ^ i3);
        this.phase = 1;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) {
        String str;
        XoodyakEngine xoodyakEngine;
        int i2;
        if (this.initialised) {
            byte[] byteArray = this.message.toByteArray();
            int size = this.message.size();
            boolean z = this.forEncryption;
            if ((z && size + 16 + i > bArr.length) || (!z && (size - 16) + i > bArr.length)) {
                f$$ExternalSyntheticLambda0.m$3("output buffer too short");
                return 0;
            }
            processAAD();
            if (this.forEncryption) {
                xoodyakEngine = this;
                xoodyakEngine.encrypt(byteArray, 0, size, bArr, i);
                byte[] bArr2 = new byte[16];
                xoodyakEngine.tag = bArr2;
                xoodyakEngine.Up(bArr2, 16, 64);
                System.arraycopy(xoodyakEngine.tag, 0, bArr, i + size, 16);
                i2 = size + 16;
            } else {
                xoodyakEngine = this;
                i2 = size - 16;
                xoodyakEngine.encrypt(byteArray, 0, i2, bArr, i);
                byte[] bArr3 = new byte[16];
                xoodyakEngine.tag = bArr3;
                xoodyakEngine.Up(bArr3, 16, 64);
                int i3 = i2;
                int i4 = 0;
                while (i4 < 16) {
                    int i5 = i3 + 1;
                    if (xoodyakEngine.tag[i4] == byteArray[i3]) {
                        i4++;
                        i3 = i5;
                    } else {
                        str = "Mac does not match";
                    }
                }
            }
            xoodyakEngine.reset(false);
            return i2;
        }
        str = "Need call init function before encryption/decryption";
        a$$ExternalSyntheticBUOutline0.m$3(str);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return "Xoodyak AEAD";
    }

    public int getBlockSize() {
        return 24;
    }

    public int getIVBytesSize() {
        return 16;
    }

    public int getKeyBytesSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.tag;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        return i + 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        return i;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forEncryption = z;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            a$$ExternalSyntheticBUOutline0.m$3("Xoodyak init parameters must include an IV");
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        this.iv = iv;
        if (iv == null || iv.length != 16) {
            a$$ExternalSyntheticBUOutline0.m$3("Xoodyak requires exactly 16 bytes of IV");
            return;
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            a$$ExternalSyntheticBUOutline0.m$3("Xoodyak init parameters must include a key");
            return;
        }
        byte[] key = ((KeyParameter) parametersWithIV.getParameters()).getKey();
        this.K = key;
        if (key.length != 16) {
            a$$ExternalSyntheticBUOutline0.m$3("Xoodyak key must be 128 bits long");
            return;
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z)));
        this.state = new byte[48];
        this.tag = new byte[16];
        this.initialised = true;
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b) {
        if (!this.aadFinished) {
            this.aadData.write(b);
            return;
        }
        StringBuilder sb = new StringBuilder("AAD cannot be added after reading a full block(");
        sb.append(getBlockSize());
        sb.append(" bytes) of input for ");
        sb.append(this.forEncryption ? "encryption" : "decryption");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        if (this.aadFinished) {
            StringBuilder sb = new StringBuilder("AAD cannot be added after reading a full block(");
            sb.append(getBlockSize());
            sb.append(" bytes) of input for ");
            sb.append(this.forEncryption ? "encryption" : "decryption");
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + i2 <= bArr.length) {
            this.aadData.write(bArr, i, i2);
        } else {
            f$$ExternalSyntheticLambda0.m$4("input buffer too short");
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b, byte[] bArr, int i) {
        return processBytes(new byte[]{b}, 0, 1, bArr, i);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.initialised) {
            a$$ExternalSyntheticBUOutline0.m$3("Need call init function before encryption/decryption");
            return 0;
        }
        if (this.mode != MODE.ModeKeyed) {
            a$$ExternalSyntheticBUOutline0.m$3("Xoodyak has not been initialised");
            return 0;
        }
        if (i + i2 > bArr.length) {
            f$$ExternalSyntheticLambda0.m$4("input buffer too short");
            return 0;
        }
        this.message.write(bArr, i, i2);
        int size = this.message.size() - (this.forEncryption ? 0 : 16);
        if (size >= getBlockSize()) {
            byte[] byteArray = this.message.toByteArray();
            int blockSize = getBlockSize() * (size / getBlockSize());
            if (blockSize + i3 <= bArr2.length) {
                processAAD();
                encrypt(byteArray, 0, blockSize, bArr2, i3);
                this.message.reset();
                this.message.write(byteArray, blockSize, byteArray.length - blockSize);
                return blockSize;
            }
            f$$ExternalSyntheticLambda0.m$3("output buffer is too short");
        }
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        if (this.initialised) {
            reset(true);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Need call init function before encryption/decryption");
        }
    }
}

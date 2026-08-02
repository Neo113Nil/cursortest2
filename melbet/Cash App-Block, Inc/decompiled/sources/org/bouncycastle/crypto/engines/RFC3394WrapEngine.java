package org.bouncycastle.crypto.engines;

import bo.app.a$$ExternalSyntheticBUOutline0;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class RFC3394WrapEngine implements Wrapper {
    private static final byte[] DEFAULT_IV = {-90, -90, -90, -90, -90, -90, -90, -90};
    private final BlockCipher engine;
    private boolean forWrapping;
    private final byte[] iv;
    private KeyParameter param;
    private final boolean wrapCipherMode;

    public RFC3394WrapEngine(BlockCipher blockCipher, boolean z) {
        this.iv = new byte[8];
        this.param = null;
        this.forWrapping = true;
        this.engine = blockCipher;
        this.wrapCipherMode = !z;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forWrapping = z;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof KeyParameter) {
            this.param = (KeyParameter) cipherParameters;
            System.arraycopy(DEFAULT_IV, 0, this.iv, 0, 8);
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            if (iv.length != 8) {
                a$$ExternalSyntheticBUOutline0.m$3("IV not equal to 8");
            } else {
                this.param = (KeyParameter) parametersWithIV.getParameters();
                System.arraycopy(iv, 0, this.iv, 0, 8);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ac, code lost:
    
        if (org.bouncycastle.util.Arrays.constantTimeAreEqual(r8, r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00af, code lost:
    
        net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0.m$2("checksum failed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b2, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0107, code lost:
    
        if (org.bouncycastle.util.Arrays.constantTimeAreEqual(r8, r1) != false) goto L40;
     */
    @Override // org.bouncycastle.crypto.Wrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] unwrap(byte[] bArr, int i, int i2) {
        String str;
        if (this.forWrapping) {
            a$$ExternalSyntheticBUOutline0.m$1("not set for unwrapping");
            return null;
        }
        if (i2 >= 16) {
            int i3 = i2 / 8;
            if (i3 * 8 == i2) {
                int i4 = 1;
                this.engine.init(!this.wrapCipherMode, this.param);
                byte[] bArr2 = this.iv;
                byte[] bArr3 = new byte[i2 - bArr2.length];
                byte[] bArr4 = new byte[bArr2.length];
                byte[] bArr5 = new byte[bArr2.length + 8];
                int i5 = i3 - 1;
                if (i5 == 1) {
                    this.engine.processBlock(bArr, i, bArr5, 0);
                    System.arraycopy(bArr5, 0, bArr4, 0, this.iv.length);
                    System.arraycopy(bArr5, this.iv.length, bArr3, 0, 8);
                } else {
                    System.arraycopy(bArr, i, bArr4, 0, bArr2.length);
                    byte[] bArr6 = this.iv;
                    System.arraycopy(bArr, bArr6.length + i, bArr3, 0, i2 - bArr6.length);
                    for (int i6 = 5; i6 >= 0; i6--) {
                        int i7 = i5;
                        while (i7 >= i4) {
                            System.arraycopy(bArr4, 0, bArr5, 0, this.iv.length);
                            int i8 = (i7 - 1) * 8;
                            System.arraycopy(bArr3, i8, bArr5, this.iv.length, 8);
                            int i9 = (i5 * i6) + i7;
                            int i10 = i4;
                            while (i9 != 0) {
                                int i11 = i4;
                                int length = this.iv.length - i10;
                                bArr5[length] = (byte) (bArr5[length] ^ ((byte) i9));
                                i9 >>>= 8;
                                i10++;
                                i4 = i11;
                            }
                            this.engine.processBlock(bArr5, 0, bArr5, 0);
                            System.arraycopy(bArr5, 0, bArr4, 0, 8);
                            System.arraycopy(bArr5, 8, bArr3, i8, 8);
                            i7--;
                            i4 = i4;
                        }
                    }
                }
                int i12 = i4;
                byte[] bArr7 = this.iv;
                if (i5 == i12) {
                    if (!Arrays.constantTimeAreEqual(bArr4, bArr7)) {
                        System.arraycopy(bArr, i, bArr4, 0, this.iv.length);
                        byte[] bArr8 = this.iv;
                        System.arraycopy(bArr, i + bArr8.length, bArr3, 0, i2 - bArr8.length);
                        int i13 = 5;
                        while (true) {
                            byte[] bArr9 = this.iv;
                            if (i13 < 0) {
                                break;
                            }
                            System.arraycopy(bArr4, 0, bArr5, 0, bArr9.length);
                            System.arraycopy(bArr3, 0, bArr5, this.iv.length, 8);
                            int i14 = (i5 * i13) + 1;
                            int i15 = 1;
                            while (i14 != 0) {
                                int length2 = this.iv.length - i15;
                                bArr5[length2] = (byte) (((byte) i14) ^ bArr5[length2]);
                                i14 >>>= 8;
                                i15++;
                            }
                            this.engine.processBlock(bArr5, 0, bArr5, 0);
                            System.arraycopy(bArr5, 0, bArr4, 0, 8);
                            System.arraycopy(bArr5, 8, bArr3, 0, 8);
                            i13--;
                        }
                    }
                    return bArr3;
                }
            } else {
                str = "unwrap data must be a multiple of 8 bytes";
            }
        } else {
            str = "unwrap data too short";
        }
        f$$ExternalSyntheticLambda0.m$2(str);
        return null;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i2) {
        String str;
        if (!this.forWrapping) {
            a$$ExternalSyntheticBUOutline0.m$1("not set for wrapping");
            return null;
        }
        if (i2 >= 8) {
            int i3 = i2 / 8;
            if (i3 * 8 == i2) {
                this.engine.init(this.wrapCipherMode, this.param);
                byte[] bArr2 = this.iv;
                byte[] bArr3 = new byte[bArr2.length + i2];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                System.arraycopy(bArr, i, bArr3, this.iv.length, i2);
                if (i3 == 1) {
                    this.engine.processBlock(bArr3, 0, bArr3, 0);
                    return bArr3;
                }
                byte[] bArr4 = new byte[this.iv.length + 8];
                for (int i4 = 0; i4 != 6; i4++) {
                    for (int i5 = 1; i5 <= i3; i5++) {
                        System.arraycopy(bArr3, 0, bArr4, 0, this.iv.length);
                        int i6 = i5 * 8;
                        System.arraycopy(bArr3, i6, bArr4, this.iv.length, 8);
                        this.engine.processBlock(bArr4, 0, bArr4, 0);
                        int i7 = (i3 * i4) + i5;
                        int i8 = 1;
                        while (i7 != 0) {
                            int length = this.iv.length - i8;
                            bArr4[length] = (byte) (((byte) i7) ^ bArr4[length]);
                            i7 >>>= 8;
                            i8++;
                        }
                        System.arraycopy(bArr4, 0, bArr3, 0, 8);
                        System.arraycopy(bArr4, 8, bArr3, i6, 8);
                    }
                }
                return bArr3;
            }
            str = "wrap data must be a multiple of 8 bytes";
        } else {
            str = "wrap data must be at least 8 bytes";
        }
        f$$ExternalSyntheticLambda0.m$4(str);
        return null;
    }

    public RFC3394WrapEngine(BlockCipher blockCipher) {
        this(blockCipher, false);
    }
}

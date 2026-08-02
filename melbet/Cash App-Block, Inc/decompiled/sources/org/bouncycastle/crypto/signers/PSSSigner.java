package org.bouncycastle.crypto.signers;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.security.SecureRandom;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.Prehash;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSABlindingParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class PSSSigner implements Signer {
    public static final byte TRAILER_IMPLICIT = -68;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest contentDigest1;
    private Digest contentDigest2;
    private int emBits;
    private int hLen;
    private byte[] mDash;
    private Digest mgfDigest;
    private int mgfhLen;
    private SecureRandom random;
    private int sLen;
    private boolean sSet;
    private byte[] salt;
    private byte trailer;

    private PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, Digest digest3, int i, byte b) {
        this.cipher = asymmetricBlockCipher;
        this.contentDigest1 = digest;
        this.contentDigest2 = digest2;
        this.mgfDigest = digest3;
        this.hLen = digest2.getDigestSize();
        this.mgfhLen = digest3.getDigestSize();
        this.sSet = false;
        this.sLen = i;
        this.salt = new byte[i];
        this.mDash = new byte[i + 8 + this.hLen];
        this.trailer = b;
    }

    private void ItoOSP(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    private void clearBlock(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    public static PSSSigner createRawSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        return new PSSSigner(asymmetricBlockCipher, Prehash.forDigest(digest), digest, digest, digest.getDigestSize(), TRAILER_IMPLICIT);
    }

    private byte[] maskGenerator(byte[] bArr, int i, int i2, int i3) {
        Digest digest = this.mgfDigest;
        if (!(digest instanceof Xof)) {
            return maskGeneratorFunction1(bArr, i, i2, i3);
        }
        byte[] bArr2 = new byte[i3];
        digest.update(bArr, i, i2);
        ((Xof) this.mgfDigest).doFinal(bArr2, 0, i3);
        return bArr2;
    }

    private byte[] maskGeneratorFunction1(byte[] bArr, int i, int i2, int i3) {
        int i4;
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[this.mgfhLen];
        byte[] bArr4 = new byte[4];
        this.mgfDigest.reset();
        int i5 = 0;
        while (true) {
            i4 = this.mgfhLen;
            if (i5 >= i3 / i4) {
                break;
            }
            ItoOSP(i5, bArr4);
            this.mgfDigest.update(bArr, i, i2);
            this.mgfDigest.update(bArr4, 0, 4);
            this.mgfDigest.doFinal(bArr3, 0);
            int i6 = this.mgfhLen;
            System.arraycopy(bArr3, 0, bArr2, i5 * i6, i6);
            i5++;
        }
        if (i4 * i5 < i3) {
            ItoOSP(i5, bArr4);
            this.mgfDigest.update(bArr, i, i2);
            this.mgfDigest.update(bArr4, 0, 4);
            this.mgfDigest.doFinal(bArr3, 0);
            int i7 = this.mgfhLen;
            System.arraycopy(bArr3, 0, bArr2, i5 * i7, i3 - (i5 * i7));
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        int digestSize = this.contentDigest1.getDigestSize();
        int i = this.hLen;
        if (digestSize != i) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        Digest digest = this.contentDigest1;
        byte[] bArr = this.mDash;
        digest.doFinal(bArr, (bArr.length - i) - this.sLen);
        if (this.sLen != 0) {
            if (!this.sSet) {
                this.random.nextBytes(this.salt);
            }
            byte[] bArr2 = this.salt;
            byte[] bArr3 = this.mDash;
            int length = bArr3.length;
            int i2 = this.sLen;
            System.arraycopy(bArr2, 0, bArr3, length - i2, i2);
        }
        int i3 = this.hLen;
        byte[] bArr4 = new byte[i3];
        Digest digest2 = this.contentDigest2;
        byte[] bArr5 = this.mDash;
        digest2.update(bArr5, 0, bArr5.length);
        this.contentDigest2.doFinal(bArr4, 0);
        byte[] bArr6 = this.block;
        int length2 = bArr6.length;
        int i4 = this.sLen;
        int i5 = this.hLen;
        bArr6[(((length2 - i4) - 1) - i5) - 1] = 1;
        System.arraycopy(this.salt, 0, bArr6, ((bArr6.length - i4) - i5) - 1, i4);
        byte[] maskGenerator = maskGenerator(bArr4, 0, i3, (this.block.length - this.hLen) - 1);
        int i6 = 0;
        while (true) {
            int length3 = maskGenerator.length;
            byte[] bArr7 = this.block;
            if (i6 == length3) {
                int length4 = bArr7.length;
                int i7 = this.hLen;
                System.arraycopy(bArr4, 0, bArr7, (length4 - i7) - 1, i7);
                byte[] bArr8 = this.block;
                bArr8[0] = (byte) ((255 >>> ((bArr8.length * 8) - this.emBits)) & bArr8[0]);
                bArr8[bArr8.length - 1] = this.trailer;
                byte[] processBlock = this.cipher.processBlock(bArr8, 0, bArr8.length);
                clearBlock(this.block);
                return processBlock;
            }
            bArr7[i6] = (byte) (bArr7[i6] ^ maskGenerator[i6]);
            i6++;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        CipherParameters cipherParameters2;
        RSAKeyParameters rSAKeyParameters;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            cipherParameters2 = parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
        } else {
            if (z) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            cipherParameters2 = cipherParameters;
        }
        if (cipherParameters2 instanceof RSABlindingParameters) {
            rSAKeyParameters = ((RSABlindingParameters) cipherParameters2).getPublicKey();
            this.cipher.init(z, cipherParameters);
        } else {
            rSAKeyParameters = (RSAKeyParameters) cipherParameters2;
            this.cipher.init(z, cipherParameters2);
        }
        int bitLength = rSAKeyParameters.getModulus().bitLength();
        int i = bitLength - 1;
        this.emBits = i;
        if (i < Boxes$$ExternalSyntheticOutline1.m(this.sLen, 8, this.hLen * 8, 9)) {
            a$$ExternalSyntheticBUOutline0.m$3("key too small for specified hash and salt lengths");
        } else {
            this.block = new byte[(bitLength + 6) / 8];
            reset();
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.contentDigest1.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        this.contentDigest1.update(b);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] bArr2;
        int length;
        byte b;
        byte[] bArr3;
        int digestSize = this.contentDigest1.getDigestSize();
        int i = this.hLen;
        if (digestSize != i) {
            Path$$ExternalSyntheticBUOutline0.m();
            return false;
        }
        Digest digest = this.contentDigest1;
        byte[] bArr4 = this.mDash;
        digest.doFinal(bArr4, (bArr4.length - i) - this.sLen);
        try {
            byte[] processBlock = this.cipher.processBlock(bArr, 0, bArr.length);
            byte[] bArr5 = this.block;
            Arrays.fill(bArr5, 0, bArr5.length - processBlock.length, (byte) 0);
            byte[] bArr6 = this.block;
            System.arraycopy(processBlock, 0, bArr6, bArr6.length - processBlock.length, processBlock.length);
            bArr2 = this.block;
            length = 255 >>> ((bArr2.length * 8) - this.emBits);
            b = bArr2[0];
        } catch (Exception unused) {
        }
        if ((b & 255) != (b & length) || bArr2[bArr2.length - 1] != this.trailer) {
            clearBlock(bArr2);
            return false;
        }
        int length2 = bArr2.length;
        int i2 = this.hLen;
        byte[] maskGenerator = maskGenerator(bArr2, (length2 - i2) - 1, i2, (bArr2.length - i2) - 1);
        int i3 = 0;
        while (true) {
            int length3 = maskGenerator.length;
            bArr3 = this.block;
            if (i3 == length3) {
                break;
            }
            bArr3[i3] = (byte) (bArr3[i3] ^ maskGenerator[i3]);
            i3++;
        }
        bArr3[0] = (byte) (bArr3[0] & length);
        int i4 = 0;
        while (true) {
            byte[] bArr7 = this.block;
            int length4 = bArr7.length;
            int i5 = this.hLen;
            int i6 = this.sLen;
            if (i4 != ((length4 - i5) - i6) - 2) {
                if (bArr7[i4] != 0) {
                    clearBlock(bArr7);
                    return false;
                }
                i4++;
            } else {
                if (bArr7[((bArr7.length - i5) - i6) - 2] != 1) {
                    clearBlock(bArr7);
                    return false;
                }
                if (this.sSet) {
                    byte[] bArr8 = this.salt;
                    byte[] bArr9 = this.mDash;
                    System.arraycopy(bArr8, 0, bArr9, bArr9.length - i6, i6);
                } else {
                    int length5 = ((bArr7.length - i6) - i5) - 1;
                    byte[] bArr10 = this.mDash;
                    System.arraycopy(bArr7, length5, bArr10, bArr10.length - i6, i6);
                }
                Digest digest2 = this.contentDigest2;
                byte[] bArr11 = this.mDash;
                digest2.update(bArr11, 0, bArr11.length);
                Digest digest3 = this.contentDigest2;
                byte[] bArr12 = this.mDash;
                digest3.doFinal(bArr12, bArr12.length - this.hLen);
                int length6 = this.block.length;
                int i7 = this.hLen;
                int i8 = (length6 - i7) - 1;
                int length7 = this.mDash.length - i7;
                while (true) {
                    byte[] bArr13 = this.mDash;
                    if (length7 == bArr13.length) {
                        clearBlock(bArr13);
                        clearBlock(this.block);
                        return true;
                    }
                    if ((this.block[i8] ^ bArr13[length7]) != 0) {
                        clearBlock(bArr13);
                        clearBlock(this.block);
                        return false;
                    }
                    i8++;
                    length7++;
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.contentDigest1.update(bArr, i, i2);
    }

    public static PSSSigner createRawSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i, byte b) {
        return new PSSSigner(asymmetricBlockCipher, Prehash.forDigest(digest), digest, digest2, i, b);
    }

    public static PSSSigner createRawSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr, byte b) {
        return new PSSSigner(asymmetricBlockCipher, Prehash.forDigest(digest), digest, digest2, bArr, b);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i, byte b) {
        this(asymmetricBlockCipher, digest, digest, i, b);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i) {
        this(asymmetricBlockCipher, digest, digest2, i, TRAILER_IMPLICIT);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, int i, byte b) {
        this(asymmetricBlockCipher, digest, digest, digest2, i, b);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, int i) {
        this(asymmetricBlockCipher, digest, i, TRAILER_IMPLICIT);
    }

    private PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, Digest digest3, byte[] bArr, byte b) {
        this.cipher = asymmetricBlockCipher;
        this.contentDigest1 = digest;
        this.contentDigest2 = digest2;
        this.mgfDigest = digest3;
        this.hLen = digest2.getDigestSize();
        this.mgfhLen = digest3.getDigestSize();
        this.sSet = true;
        int length = bArr.length;
        this.sLen = length;
        this.salt = bArr;
        this.mDash = new byte[length + 8 + this.hLen];
        this.trailer = b;
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest2, bArr, TRAILER_IMPLICIT);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr, byte b) {
        this(asymmetricBlockCipher, digest, digest, digest2, bArr, b);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest, bArr, TRAILER_IMPLICIT);
    }
}

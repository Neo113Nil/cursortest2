package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes9.dex */
public class X931Signer implements Signer {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA224 = 14540;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest digest;
    private RSAKeyParameters kParam;
    private int keyBits;
    private int trailer;

    public X931Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, boolean z) {
        int intValue;
        this.cipher = asymmetricBlockCipher;
        this.digest = digest;
        if (z) {
            intValue = 188;
        } else {
            Integer trailer = ISOTrailers.getTrailer(digest);
            if (trailer == null) {
                Path$$ExternalSyntheticBUOutline0.m(digest.getAlgorithmName(), "no valid trailer for digest: ");
                throw null;
            }
            intValue = trailer.intValue();
        }
        this.trailer = intValue;
    }

    private void clearBlock(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    private void createSignatureBlock(int i) {
        int i2;
        int digestSize = this.digest.getDigestSize();
        byte[] bArr = this.block;
        if (i == 188) {
            i2 = (bArr.length - digestSize) - 1;
            this.digest.doFinal(bArr, i2);
            this.block[r0.length - 1] = PSSSigner.TRAILER_IMPLICIT;
        } else {
            int length = (bArr.length - digestSize) - 2;
            this.digest.doFinal(bArr, length);
            byte[] bArr2 = this.block;
            bArr2[bArr2.length - 2] = (byte) (i >>> 8);
            bArr2[bArr2.length - 1] = (byte) i;
            i2 = length;
        }
        this.block[0] = 107;
        int i3 = i2 - 2;
        while (true) {
            byte[] bArr3 = this.block;
            if (i3 == 0) {
                bArr3[i2 - 1] = -70;
                return;
            } else {
                bArr3[i3] = -69;
                i3--;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        createSignatureBlock(this.trailer);
        AsymmetricBlockCipher asymmetricBlockCipher = this.cipher;
        byte[] bArr = this.block;
        BigInteger bigInteger = new BigInteger(1, asymmetricBlockCipher.processBlock(bArr, 0, bArr.length));
        clearBlock(this.block);
        return BigIntegers.asUnsignedByteArray(BigIntegers.getUnsignedByteLength(this.kParam.getModulus()), bigInteger.min(this.kParam.getModulus().subtract(bigInteger)));
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) cipherParameters;
        this.kParam = rSAKeyParameters;
        this.cipher.init(z, rSAKeyParameters);
        int bitLength = this.kParam.getModulus().bitLength();
        this.keyBits = bitLength;
        this.block = new byte[(bitLength + 7) / 8];
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        this.digest.update(b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if ((r4.intValue() & 15) == 12) goto L9;
     */
    @Override // org.bouncycastle.crypto.Signer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean verifySignature(byte[] bArr) {
        boolean z = false;
        try {
            this.block = this.cipher.processBlock(bArr, 0, bArr.length);
            BigInteger bigInteger = new BigInteger(1, this.block);
            if ((bigInteger.intValue() & 15) != 12) {
                bigInteger = this.kParam.getModulus().subtract(bigInteger);
            }
            createSignatureBlock(this.trailer);
            byte[] asUnsignedByteArray = BigIntegers.asUnsignedByteArray(this.block.length, bigInteger);
            z = Arrays.constantTimeAreEqual(this.block, asUnsignedByteArray);
            if (this.trailer == 15052 && !z) {
                byte[] bArr2 = this.block;
                bArr2[bArr2.length - 2] = 64;
                z = Arrays.constantTimeAreEqual(bArr2, asUnsignedByteArray);
            }
            clearBlock(this.block);
            clearBlock(asUnsignedByteArray);
        } catch (Exception unused) {
        }
        return z;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }

    public X931Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, false);
    }
}

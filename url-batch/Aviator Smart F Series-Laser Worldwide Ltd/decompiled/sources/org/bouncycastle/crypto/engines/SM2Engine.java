package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.c;
import org.bouncycastle.crypto.digests.n;
import org.bouncycastle.crypto.e;
import org.bouncycastle.crypto.params.f;
import org.bouncycastle.crypto.params.h;
import org.bouncycastle.crypto.params.j;
import org.bouncycastle.crypto.params.k;
import org.bouncycastle.crypto.params.m;
import org.bouncycastle.math.ec.i;
import org.bouncycastle.util.b;
import org.bouncycastle.util.g;

/* loaded from: classes5.dex */
public class SM2Engine {
    private int curveLength;
    private final e digest;
    private h ecKey;
    private f ecParams;
    private boolean forEncryption;
    private final Mode mode;
    private SecureRandom random;

    public enum Mode {
        C1C2C3,
        C1C3C2
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$SM2Engine$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$SM2Engine$Mode = iArr;
            try {
                iArr[Mode.C1C3C2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public SM2Engine() {
        this(new n());
    }

    private void addFieldElement(e eVar, org.bouncycastle.math.ec.f fVar) {
        byte[] asUnsignedByteArray = b.asUnsignedByteArray(this.curveLength, fVar.toBigInteger());
        eVar.update(asUnsignedByteArray, 0, asUnsignedByteArray.length);
    }

    private byte[] decrypt(byte[] bArr, int i8, int i9) {
        int i10;
        int i11 = (this.curveLength * 2) + 1;
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i8, bArr2, 0, i11);
        i decodePoint = this.ecParams.getCurve().decodePoint(bArr2);
        if (decodePoint.multiply(this.ecParams.getH()).isInfinity()) {
            throw new InvalidCipherTextException("[h]C1 at infinity");
        }
        i normalize = decodePoint.multiply(((j) this.ecKey).getD()).normalize();
        int digestSize = this.digest.getDigestSize();
        int i12 = (i9 - i11) - digestSize;
        byte[] bArr3 = new byte[i12];
        Mode mode = this.mode;
        Mode mode2 = Mode.C1C3C2;
        if (mode == mode2) {
            System.arraycopy(bArr, i8 + i11 + digestSize, bArr3, 0, i12);
        } else {
            System.arraycopy(bArr, i8 + i11, bArr3, 0, i12);
        }
        kdf(this.digest, normalize, bArr3);
        int digestSize2 = this.digest.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        addFieldElement(this.digest, normalize.getAffineXCoord());
        this.digest.update(bArr3, 0, i12);
        addFieldElement(this.digest, normalize.getAffineYCoord());
        this.digest.doFinal(bArr4, 0);
        if (this.mode == mode2) {
            i10 = 0;
            for (int i13 = 0; i13 != digestSize2; i13++) {
                i10 |= bArr4[i13] ^ bArr[(i8 + i11) + i13];
            }
        } else {
            i10 = 0;
            for (int i14 = 0; i14 != digestSize2; i14++) {
                i10 |= bArr4[i14] ^ bArr[((i8 + i11) + i12) + i14];
            }
        }
        org.bouncycastle.util.a.fill(bArr2, (byte) 0);
        org.bouncycastle.util.a.fill(bArr4, (byte) 0);
        if (i10 == 0) {
            return bArr3;
        }
        org.bouncycastle.util.a.fill(bArr3, (byte) 0);
        throw new InvalidCipherTextException("invalid cipher text");
    }

    private byte[] encrypt(byte[] bArr, int i8, int i9) {
        byte[] encoded;
        i normalize;
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        org.bouncycastle.math.ec.h createBasePointMultiplier = createBasePointMultiplier();
        do {
            BigInteger nextK = nextK();
            encoded = createBasePointMultiplier.multiply(this.ecParams.getG(), nextK).normalize().getEncoded(false);
            normalize = ((k) this.ecKey).getQ().multiply(nextK).normalize();
            kdf(this.digest, normalize, bArr2);
        } while (notEncrypted(bArr2, bArr, i8));
        byte[] bArr3 = new byte[this.digest.getDigestSize()];
        addFieldElement(this.digest, normalize.getAffineXCoord());
        this.digest.update(bArr, i8, i9);
        addFieldElement(this.digest, normalize.getAffineYCoord());
        this.digest.doFinal(bArr3, 0);
        return a.$SwitchMap$org$bouncycastle$crypto$engines$SM2Engine$Mode[this.mode.ordinal()] != 1 ? org.bouncycastle.util.a.concatenate(encoded, bArr2, bArr3) : org.bouncycastle.util.a.concatenate(encoded, bArr3, bArr2);
    }

    private void kdf(e eVar, i iVar, byte[] bArr) {
        g gVar;
        g gVar2;
        int digestSize = eVar.getDigestSize();
        byte[] bArr2 = new byte[Math.max(4, digestSize)];
        if (eVar instanceof g) {
            addFieldElement(eVar, iVar.getAffineXCoord());
            addFieldElement(eVar, iVar.getAffineYCoord());
            gVar = (g) eVar;
            gVar2 = gVar.copy();
        } else {
            gVar = null;
            gVar2 = null;
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < bArr.length) {
            if (gVar != null) {
                gVar.reset(gVar2);
            } else {
                addFieldElement(eVar, iVar.getAffineXCoord());
                addFieldElement(eVar, iVar.getAffineYCoord());
            }
            i9++;
            org.bouncycastle.util.i.intToBigEndian(i9, bArr2, 0);
            eVar.update(bArr2, 0, 4);
            eVar.doFinal(bArr2, 0);
            int min = Math.min(digestSize, bArr.length - i8);
            xor(bArr, bArr2, i8, min);
            i8 += min;
        }
    }

    private BigInteger nextK() {
        int bitLength = this.ecParams.getN().bitLength();
        while (true) {
            BigInteger createRandomBigInteger = b.createRandomBigInteger(bitLength, this.random);
            if (!createRandomBigInteger.equals(b.ZERO) && createRandomBigInteger.compareTo(this.ecParams.getN()) < 0) {
                return createRandomBigInteger;
            }
        }
    }

    private boolean notEncrypted(byte[] bArr, byte[] bArr2, int i8) {
        for (int i9 = 0; i9 != bArr.length; i9++) {
            if (bArr[i9] != bArr2[i8 + i9]) {
                return false;
            }
        }
        return true;
    }

    private void xor(byte[] bArr, byte[] bArr2, int i8, int i9) {
        for (int i10 = 0; i10 != i9; i10++) {
            int i11 = i8 + i10;
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i10]);
        }
    }

    protected org.bouncycastle.math.ec.h createBasePointMultiplier() {
        return new org.bouncycastle.math.ec.k();
    }

    public int getOutputSize(int i8) {
        return (this.curveLength * 2) + 1 + i8 + this.digest.getDigestSize();
    }

    public void init(boolean z7, c cVar) {
        this.forEncryption = z7;
        if (z7) {
            m mVar = (m) cVar;
            h hVar = (h) mVar.getParameters();
            this.ecKey = hVar;
            this.ecParams = hVar.getParameters();
            if (((k) this.ecKey).getQ().multiply(this.ecParams.getH()).isInfinity()) {
                throw new IllegalArgumentException("invalid key: [h]Q at infinity");
            }
            this.random = mVar.getRandom();
        } else {
            h hVar2 = (h) cVar;
            this.ecKey = hVar2;
            this.ecParams = hVar2.getParameters();
        }
        this.curveLength = (this.ecParams.getCurve().getFieldSize() + 7) / 8;
    }

    public byte[] processBlock(byte[] bArr, int i8, int i9) {
        return this.forEncryption ? encrypt(bArr, i8, i9) : decrypt(bArr, i8, i9);
    }

    public SM2Engine(e eVar) {
        this(eVar, Mode.C1C2C3);
    }

    public SM2Engine(e eVar, Mode mode) {
        if (mode == null) {
            throw new IllegalArgumentException("mode cannot be NULL");
        }
        this.digest = eVar;
        this.mode = mode;
    }

    public SM2Engine(Mode mode) {
        this(new n(), mode);
    }
}

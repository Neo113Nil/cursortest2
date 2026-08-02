package org.bouncycastle.crypto.engines;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.math.BigInteger;
import java.security.SecureRandom;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes9.dex */
public class SM2Engine {
    private int curveLength;
    private final Digest digest;
    private ECKeyParameters ecKey;
    private ECDomainParameters ecParams;
    private boolean forEncryption;
    private final Mode mode;
    private SecureRandom random;

    /* renamed from: org.bouncycastle.crypto.engines.SM2Engine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
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

    public enum Mode {
        C1C2C3,
        C1C3C2
    }

    public SM2Engine(Digest digest, Mode mode) {
        if (mode == null) {
            a$$ExternalSyntheticBUOutline0.m$3("mode cannot be NULL");
            throw null;
        }
        this.digest = digest;
        this.mode = mode;
    }

    private void addFieldElement(Digest digest, ECFieldElement eCFieldElement) {
        byte[] asUnsignedByteArray = BigIntegers.asUnsignedByteArray(this.curveLength, eCFieldElement.toBigInteger());
        digest.update(asUnsignedByteArray, 0, asUnsignedByteArray.length);
    }

    private byte[] decrypt(byte[] bArr, int i, int i2) {
        String str;
        int i3;
        int i4 = (this.curveLength * 2) + 1;
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i, bArr2, 0, i4);
        ECPoint decodePoint = this.ecParams.getCurve().decodePoint(bArr2);
        if (decodePoint.multiply(this.ecParams.getH()).isInfinity()) {
            str = "[h]C1 at infinity";
        } else {
            ECPoint normalize = decodePoint.multiply(((ECPrivateKeyParameters) this.ecKey).getD()).normalize();
            int digestSize = this.digest.getDigestSize();
            int i5 = (i2 - i4) - digestSize;
            byte[] bArr3 = new byte[i5];
            Mode mode = this.mode;
            Mode mode2 = Mode.C1C3C2;
            if (mode == mode2) {
                System.arraycopy(bArr, i + i4 + digestSize, bArr3, 0, i5);
            } else {
                System.arraycopy(bArr, i + i4, bArr3, 0, i5);
            }
            kdf(this.digest, normalize, bArr3);
            int digestSize2 = this.digest.getDigestSize();
            byte[] bArr4 = new byte[digestSize2];
            addFieldElement(this.digest, normalize.getAffineXCoord());
            this.digest.update(bArr3, 0, i5);
            addFieldElement(this.digest, normalize.getAffineYCoord());
            this.digest.doFinal(bArr4, 0);
            if (this.mode == mode2) {
                i3 = 0;
                for (int i6 = 0; i6 != digestSize2; i6++) {
                    i3 |= bArr4[i6] ^ bArr[(i + i4) + i6];
                }
            } else {
                int i7 = 0;
                for (int i8 = 0; i8 != digestSize2; i8++) {
                    i7 |= bArr4[i8] ^ bArr[JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(i, i4, i5, i8)];
                }
                i3 = i7;
            }
            Arrays.fill(bArr2, (byte) 0);
            Arrays.fill(bArr4, (byte) 0);
            if (i3 == 0) {
                return bArr3;
            }
            Arrays.fill(bArr3, (byte) 0);
            str = "invalid cipher text";
        }
        f$$ExternalSyntheticLambda0.m$2(str);
        return null;
    }

    private byte[] encrypt(byte[] bArr, int i, int i2) {
        byte[] encoded;
        ECPoint normalize;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        ECMultiplier createBasePointMultiplier = createBasePointMultiplier();
        do {
            BigInteger nextK = nextK();
            encoded = createBasePointMultiplier.multiply(this.ecParams.getG(), nextK).normalize().getEncoded(false);
            normalize = ((ECPublicKeyParameters) this.ecKey).getQ().multiply(nextK).normalize();
            kdf(this.digest, normalize, bArr2);
        } while (notEncrypted(bArr2, bArr, i));
        byte[] bArr3 = new byte[this.digest.getDigestSize()];
        addFieldElement(this.digest, normalize.getAffineXCoord());
        this.digest.update(bArr, i, i2);
        addFieldElement(this.digest, normalize.getAffineYCoord());
        this.digest.doFinal(bArr3, 0);
        return AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SM2Engine$Mode[this.mode.ordinal()] != 1 ? Arrays.concatenate(encoded, bArr2, bArr3) : Arrays.concatenate(encoded, bArr3, bArr2);
    }

    private void kdf(Digest digest, ECPoint eCPoint, byte[] bArr) {
        Memoable memoable;
        Memoable memoable2;
        int digestSize = digest.getDigestSize();
        byte[] bArr2 = new byte[Math.max(4, digestSize)];
        if (digest instanceof Memoable) {
            addFieldElement(digest, eCPoint.getAffineXCoord());
            addFieldElement(digest, eCPoint.getAffineYCoord());
            memoable = (Memoable) digest;
            memoable2 = memoable.copy();
        } else {
            memoable = null;
            memoable2 = null;
        }
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            if (memoable != null) {
                memoable.reset(memoable2);
            } else {
                addFieldElement(digest, eCPoint.getAffineXCoord());
                addFieldElement(digest, eCPoint.getAffineYCoord());
            }
            i2++;
            Pack.intToBigEndian(i2, bArr2, 0);
            digest.update(bArr2, 0, 4);
            digest.doFinal(bArr2, 0);
            int min = Math.min(digestSize, bArr.length - i);
            Bytes.xorTo(min, bArr2, 0, bArr, i);
            i += min;
        }
    }

    private BigInteger nextK() {
        int bitLength = this.ecParams.getN().bitLength();
        while (true) {
            BigInteger createRandomBigInteger = BigIntegers.createRandomBigInteger(bitLength, this.random);
            if (!createRandomBigInteger.equals(BigIntegers.ZERO) && createRandomBigInteger.compareTo(this.ecParams.getN()) < 0) {
                return createRandomBigInteger;
            }
        }
    }

    private boolean notEncrypted(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 != bArr.length; i2++) {
            if (bArr[i2] != bArr2[i + i2]) {
                return false;
            }
        }
        return true;
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    public int getOutputSize(int i) {
        return this.digest.getDigestSize() + Boxes$$ExternalSyntheticOutline1.m(this.curveLength, 2, 1, i);
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        this.forEncryption = z;
        if (z) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            ECKeyParameters eCKeyParameters = (ECKeyParameters) parametersWithRandom.getParameters();
            this.ecKey = eCKeyParameters;
            this.ecParams = eCKeyParameters.getParameters();
            if (((ECPublicKeyParameters) this.ecKey).getQ().multiply(this.ecParams.getH()).isInfinity()) {
                a$$ExternalSyntheticBUOutline0.m$3("invalid key: [h]Q at infinity");
                return;
            }
            this.random = parametersWithRandom.getRandom();
        } else {
            ECKeyParameters eCKeyParameters2 = (ECKeyParameters) cipherParameters;
            this.ecKey = eCKeyParameters2;
            this.ecParams = eCKeyParameters2.getParameters();
        }
        this.curveLength = this.ecParams.getCurve().getFieldElementEncodingLength();
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("SM2", ConstraintUtils.bitsOfSecurityFor(this.ecParams.getCurve()), this.ecKey, Utils.getPurpose(z)));
    }

    public byte[] processBlock(byte[] bArr, int i, int i2) {
        if (i + i2 <= bArr.length && i2 != 0) {
            return this.forEncryption ? encrypt(bArr, i, i2) : decrypt(bArr, i, i2);
        }
        f$$ExternalSyntheticLambda0.m$4("input buffer too short");
        return null;
    }

    public SM2Engine(Digest digest) {
        this(digest, Mode.C1C2C3);
    }

    public SM2Engine() {
        this(new SM3Digest());
    }

    public SM2Engine(Mode mode) {
        this(new SM3Digest(), mode);
    }
}

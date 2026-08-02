package org.bouncycastle.crypto.engines;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import java.security.SecureRandom;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.ElGamalKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes9.dex */
public class ElGamalEngine implements AsymmetricBlockCipher {
    private int bitSize;
    private boolean forEncryption;
    private ElGamalKeyParameters key;
    private SecureRandom random;
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        boolean z = this.forEncryption;
        int i = this.bitSize;
        return z ? (i - 1) / 8 : ((i + 7) / 8) * 2;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        boolean z = this.forEncryption;
        int i = this.bitSize;
        return z ? ((i + 7) / 8) * 2 : (i - 1) / 8;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.key = (ElGamalKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            this.key = (ElGamalKeyParameters) cipherParameters;
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        this.random = secureRandom;
        this.forEncryption = z;
        this.bitSize = this.key.getParameters().getP().bitLength();
        ElGamalKeyParameters elGamalKeyParameters = this.key;
        if (z) {
            if (!(elGamalKeyParameters instanceof ElGamalPublicKeyParameters)) {
                a$$ExternalSyntheticBUOutline0.m$3("ElGamalPublicKeyParameters are required for encryption.");
                return;
            }
        } else if (!(elGamalKeyParameters instanceof ElGamalPrivateKeyParameters)) {
            a$$ExternalSyntheticBUOutline0.m$3("ElGamalPrivateKeyParameters are required for decryption.");
            return;
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("RSA", ConstraintUtils.bitsOfSecurityFor(this.key.getParameters().getP()), this.key, Utils.getPurpose(z)));
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i2) {
        BigInteger createRandomBigInteger;
        if (this.key == null) {
            a$$ExternalSyntheticBUOutline0.m$1("ElGamal engine not initialised");
            return null;
        }
        if (i2 > (this.forEncryption ? (this.bitSize + 6) / 8 : getInputBlockSize())) {
            f$$ExternalSyntheticLambda0.m$4("input too large for ElGamal cipher.\n");
            return null;
        }
        BigInteger p = this.key.getParameters().getP();
        if (this.key instanceof ElGamalPrivateKeyParameters) {
            int i3 = i2 / 2;
            byte[] bArr2 = new byte[i3];
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, i3);
            System.arraycopy(bArr, i + i3, bArr3, 0, i3);
            return BigIntegers.asUnsignedByteArray(new BigInteger(1, bArr2).modPow(p.subtract(ONE).subtract(((ElGamalPrivateKeyParameters) this.key).getX()), p).multiply(new BigInteger(1, bArr3)).mod(p));
        }
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr4 = new byte[i2];
            System.arraycopy(bArr, i, bArr4, 0, i2);
            bArr = bArr4;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(p) >= 0) {
            f$$ExternalSyntheticLambda0.m$4("input too large for ElGamal cipher.\n");
            return null;
        }
        ElGamalPublicKeyParameters elGamalPublicKeyParameters = (ElGamalPublicKeyParameters) this.key;
        int bitLength = p.bitLength();
        while (true) {
            createRandomBigInteger = BigIntegers.createRandomBigInteger(bitLength, this.random);
            if (!createRandomBigInteger.equals(ZERO) && createRandomBigInteger.compareTo(p.subtract(TWO)) <= 0) {
                break;
            }
        }
        BigInteger modPow = this.key.getParameters().getG().modPow(createRandomBigInteger, p);
        BigInteger mod = bigInteger.multiply(elGamalPublicKeyParameters.getY().modPow(createRandomBigInteger, p)).mod(p);
        byte[] byteArray = modPow.toByteArray();
        byte[] byteArray2 = mod.toByteArray();
        int outputBlockSize = getOutputBlockSize();
        byte[] bArr5 = new byte[outputBlockSize];
        int i4 = outputBlockSize / 2;
        if (byteArray.length > i4) {
            System.arraycopy(byteArray, 1, bArr5, i4 - (byteArray.length - 1), byteArray.length - 1);
        } else {
            System.arraycopy(byteArray, 0, bArr5, i4 - byteArray.length, byteArray.length);
        }
        if (byteArray2.length > i4) {
            System.arraycopy(byteArray2, 1, bArr5, outputBlockSize - (byteArray2.length - 1), byteArray2.length - 1);
            return bArr5;
        }
        System.arraycopy(byteArray2, 0, bArr5, outputBlockSize - byteArray2.length, byteArray2.length);
        return bArr5;
    }
}

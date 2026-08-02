package org.bouncycastle.jcajce.provider.asymmetric.edec;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.generators.Ed25519KeyPairGenerator;
import org.bouncycastle.crypto.generators.Ed448KeyPairGenerator;
import org.bouncycastle.crypto.generators.X25519KeyPairGenerator;
import org.bouncycastle.crypto.generators.X448KeyPairGenerator;
import org.bouncycastle.crypto.params.Ed25519KeyGenerationParameters;
import org.bouncycastle.crypto.params.Ed448KeyGenerationParameters;
import org.bouncycastle.crypto.params.X25519KeyGenerationParameters;
import org.bouncycastle.crypto.params.X448KeyGenerationParameters;
import org.bouncycastle.internal.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {
    private static final int Ed25519 = 1;
    private static final int Ed448 = 2;
    private static final int EdDSA = -1;
    private static final int X25519 = 3;
    private static final int X448 = 4;
    private static final int XDH = -2;
    private final int algorithmDeclared;
    private int algorithmInitialized;
    private AsymmetricCipherKeyPairGenerator generator;
    private SecureRandom secureRandom;

    public static final class Ed25519 extends KeyPairGeneratorSpi {
        public Ed25519() {
            super(1);
        }
    }

    public static final class Ed448 extends KeyPairGeneratorSpi {
        public Ed448() {
            super(2);
        }
    }

    public static final class EdDSA extends KeyPairGeneratorSpi {
        public EdDSA() {
            super(-1);
        }
    }

    public static final class X25519 extends KeyPairGeneratorSpi {
        public X25519() {
            super(3);
        }
    }

    public static final class X448 extends KeyPairGeneratorSpi {
        public X448() {
            super(4);
        }
    }

    public static final class XDH extends KeyPairGeneratorSpi {
        public XDH() {
            super(-2);
        }
    }

    public KeyPairGeneratorSpi(int i) {
        this.algorithmDeclared = i;
        if (getAlgorithmFamily(i) != i) {
            this.algorithmInitialized = i;
        }
    }

    private static int getAlgorithmFamily(int i) {
        if (i == 1 || i == 2) {
            return -1;
        }
        if (i == 3 || i == 4) {
            return -2;
        }
        return i;
    }

    private static int getAlgorithmForName(String str) {
        if (str.equalsIgnoreCase(XDHParameterSpec.X25519) || str.equals(EdECObjectIdentifiers.id_X25519.getId())) {
            return 3;
        }
        if (str.equalsIgnoreCase(EdDSAParameterSpec.Ed25519) || str.equals(EdECObjectIdentifiers.id_Ed25519.getId())) {
            return 1;
        }
        if (str.equalsIgnoreCase(XDHParameterSpec.X448) || str.equals(EdECObjectIdentifiers.id_X448.getId())) {
            return 4;
        }
        if (str.equalsIgnoreCase(EdDSAParameterSpec.Ed448) || str.equals(EdECObjectIdentifiers.id_Ed448.getId())) {
            return 2;
        }
        throw new InvalidAlgorithmParameterException("invalid parameterSpec name: ".concat(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r4 == 4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        if (r4 == 3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int getAlgorithmForStrength(int i) {
        if (i == 255 || i == 256) {
            int i2 = this.algorithmDeclared;
            if (i2 != -2) {
                if (i2 == -1 || i2 == 1) {
                    return 1;
                }
            }
            return 3;
        }
        if (i != 448) {
            Mod$$ExternalSyntheticBUOutline0.m$4("unknown key size");
            return 0;
        }
        int i3 = this.algorithmDeclared;
        if (i3 != -2) {
            if (i3 == -1 || i3 == 2) {
                return 2;
            }
        }
        return 4;
        Mod$$ExternalSyntheticBUOutline0.m$4("key size not configurable");
        return 0;
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof ECGenParameterSpec ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : algorithmParameterSpec instanceof ECNamedCurveGenParameterSpec ? ((ECNamedCurveGenParameterSpec) algorithmParameterSpec).getName() : algorithmParameterSpec instanceof EdDSAParameterSpec ? ((EdDSAParameterSpec) algorithmParameterSpec).getCurveName() : algorithmParameterSpec instanceof XDHParameterSpec ? ((XDHParameterSpec) algorithmParameterSpec).getCurveName() : ECUtil.getNameFrom(algorithmParameterSpec);
    }

    private AsymmetricCipherKeyPairGenerator setupGenerator() {
        if (this.secureRandom == null) {
            this.secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        int i = this.algorithmInitialized;
        if (i == 1) {
            Ed25519KeyPairGenerator ed25519KeyPairGenerator = new Ed25519KeyPairGenerator();
            ed25519KeyPairGenerator.init(new Ed25519KeyGenerationParameters(this.secureRandom));
            return ed25519KeyPairGenerator;
        }
        if (i == 2) {
            Ed448KeyPairGenerator ed448KeyPairGenerator = new Ed448KeyPairGenerator();
            ed448KeyPairGenerator.init(new Ed448KeyGenerationParameters(this.secureRandom));
            return ed448KeyPairGenerator;
        }
        if (i == 3) {
            X25519KeyPairGenerator x25519KeyPairGenerator = new X25519KeyPairGenerator();
            x25519KeyPairGenerator.init(new X25519KeyGenerationParameters(this.secureRandom));
            return x25519KeyPairGenerator;
        }
        if (i != 4) {
            a$$ExternalSyntheticBUOutline0.m$1("generator not correctly initialized");
            return null;
        }
        X448KeyPairGenerator x448KeyPairGenerator = new X448KeyPairGenerator();
        x448KeyPairGenerator.init(new X448KeyGenerationParameters(this.secureRandom));
        return x448KeyPairGenerator;
    }

    @Override // java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (this.algorithmInitialized == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("generator not correctly initialized");
            return null;
        }
        if (this.generator == null) {
            this.generator = setupGenerator();
        }
        AsymmetricCipherKeyPair generateKeyPair = this.generator.generateKeyPair();
        int i = this.algorithmInitialized;
        if (i == 1 || i == 2) {
            return new KeyPair(new BCEdDSAPublicKey(generateKeyPair.getPublic()), new BCEdDSAPrivateKey(generateKeyPair.getPrivate()));
        }
        if (i == 3 || i == 4) {
            return new KeyPair(new BCXDHPublicKey(generateKeyPair.getPublic()), new BCXDHPrivateKey(generateKeyPair.getPrivate()));
        }
        a$$ExternalSyntheticBUOutline0.m$1("generator not correctly initialized");
        return null;
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        String nameFromParams = getNameFromParams(algorithmParameterSpec);
        if (nameFromParams == null) {
            throw new InvalidAlgorithmParameterException(GetCert$$ExternalSyntheticOutline0.m("invalid parameterSpec: ", algorithmParameterSpec));
        }
        int algorithmForName = getAlgorithmForName(nameFromParams);
        int i = this.algorithmDeclared;
        if (i != algorithmForName && i != getAlgorithmFamily(algorithmForName)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$1("parameterSpec for wrong curve type");
            return;
        }
        this.algorithmInitialized = algorithmForName;
        this.secureRandom = secureRandom;
        this.generator = null;
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.algorithmInitialized = getAlgorithmForStrength(i);
        this.secureRandom = secureRandom;
        this.generator = null;
    }
}

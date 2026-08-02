package org.bouncycastle.jcajce.provider.symmetric;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.CAST5Engine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.internal.asn1.misc.CAST5CBCParameters;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.asn1.GMSSPrivateKey$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public final class CAST5 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("CAST5");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1(e.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for CAST5 parameter generation.");
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new CAST5Engine()), 64);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new CAST5Engine());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("CAST5", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = CAST5.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            GMSSPrivateKey$$ExternalSyntheticOutline0.m4364m(sb, str, "$AlgParams", configurableProvider, "AlgorithmParameters.CAST5");
            GMSSPrivateKey$$ExternalSyntheticOutline0.m4364m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(configurableProvider, "AlgorithmParameterGenerator.CAST5", GMSSPrivateKey$$ExternalSyntheticOutline0.m("Alg.Alias.AlgorithmParameters.1.2.840.113533.7.66.10", "CAST5", configurableProvider, str, "$AlgParamGen"), "Alg.Alias.AlgorithmParameterGenerator.1.2.840.113533.7.66.10", "CAST5"), str, "$ECB", configurableProvider, "Cipher.CAST5");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = MiscObjectIdentifiers.cast5CBC;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, str + "$CBC");
            GMSSPrivateKey$$ExternalSyntheticOutline0.m4364m(new StringBuilder(), str, "$KeyGen", configurableProvider, "KeyGenerator.CAST5");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator", aSN1ObjectIdentifier, "CAST5");
        }
    }

    private CAST5() {
    }

    public static class AlgParams extends BaseAlgorithmParameters {
        private byte[] iv;
        private int keyLength = 128;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str)) {
                return new CAST5CBCParameters(engineGetEncoded(), this.keyLength).getEncoded();
            }
            if (str.equals("RAW")) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) {
            if (isASN1FormatString(str)) {
                CAST5CBCParameters cAST5CBCParameters = CAST5CBCParameters.getInstance(new ASN1InputStream(bArr).readObject());
                this.keyLength = cAST5CBCParameters.getKeyLength();
                this.iv = cAST5CBCParameters.getIV();
            } else if (str.equals("RAW")) {
                engineInit(bArr);
            } else {
                a$$ExternalSyntheticBUOutline0.m$4("Unknown parameters format in IV parameters object");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "CAST5 Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
            if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            Mod$$ExternalSyntheticBUOutline0.m("unknown parameter spec passed to CAST5 parameters object.");
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            byte[] bArr = this.iv;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) {
            byte[] bArr2 = new byte[bArr.length];
            this.iv = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else {
                Mod$$ExternalSyntheticBUOutline0.m("IvParameterSpec required to initialise a CAST5 parameters algorithm parameters object");
            }
        }
    }
}

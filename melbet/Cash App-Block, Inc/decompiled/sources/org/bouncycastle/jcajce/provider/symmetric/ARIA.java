package org.bouncycastle.jcajce.provider.symmetric;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.ARIAEngine;
import org.bouncycastle.crypto.engines.ARIAWrapEngine;
import org.bouncycastle.crypto.engines.ARIAWrapPadEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CCMBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.internal.asn1.cms.CCMParameters;
import org.bouncycastle.internal.asn1.cms.GCMParameters;
import org.bouncycastle.internal.asn1.nsri.NSRIObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import org.bouncycastle.pqc.asn1.GMSSPrivateKey$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public final class ARIA {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("ARIA");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1(e.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for ARIA parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "ARIA IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new ARIAEngine()), 128);
        }
    }

    public static class CCM extends BaseBlockCipher {
        public CCM() {
            super((AEADBlockCipher) new CCMBlockCipher(new ARIAEngine()), false, 12);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new ARIAEngine(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.ARIA.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new ARIAEngine();
                }
            });
        }
    }

    public static class GCM extends BaseBlockCipher {
        public GCM() {
            super(new GCMBlockCipher(new ARIAEngine()));
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new GMac(new GCMBlockCipher(new ARIAEngine())));
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("ARIA", null);
        }
    }

    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = ARIA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            GMSSPrivateKey$$ExternalSyntheticOutline0.m4364m(sb, str, "$AlgParams", configurableProvider, "AlgorithmParameters.ARIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NSRIObjectIdentifiers.id_aria128_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", aSN1ObjectIdentifier, "ARIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NSRIObjectIdentifiers.id_aria192_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", aSN1ObjectIdentifier2, "ARIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NSRIObjectIdentifiers.id_aria256_cbc;
            GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m4362m(configurableProvider, "Alg.Alias.AlgorithmParameters", "ARIA", str, aSN1ObjectIdentifier3), "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier2, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier3, "ARIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NSRIObjectIdentifiers.id_aria128_ofb;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier4, "ARIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NSRIObjectIdentifiers.id_aria192_ofb;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier5, "ARIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NSRIObjectIdentifiers.id_aria256_ofb;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier6, "ARIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NSRIObjectIdentifiers.id_aria128_cfb;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier7, "ARIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NSRIObjectIdentifiers.id_aria192_cfb;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier8, "ARIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NSRIObjectIdentifiers.id_aria256_cfb;
            GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m4362m(configurableProvider, "Alg.Alias.AlgorithmParameterGenerator", "ARIA", str, aSN1ObjectIdentifier9), "$ECB", configurableProvider, "Cipher.ARIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NSRIObjectIdentifiers.id_aria128_ecb;
            GMSSPrivateKey$$ExternalSyntheticOutline0.m4365m(configurableProvider, str, "$ECB", "Cipher", aSN1ObjectIdentifier10);
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = NSRIObjectIdentifiers.id_aria192_ecb;
            GMSSPrivateKey$$ExternalSyntheticOutline0.m4365m(configurableProvider, str, "$ECB", "Cipher", aSN1ObjectIdentifier11);
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NSRIObjectIdentifiers.id_aria256_ecb;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier12, str + "$ECB");
            GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m4362m(configurableProvider, "Cipher", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m4362m(configurableProvider, "Cipher", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m4362m(configurableProvider, "Cipher", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m4362m(configurableProvider, "Cipher", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m4362m(configurableProvider, "Cipher", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), str, "$CBC"), str, aSN1ObjectIdentifier), "$CBC", configurableProvider, "Cipher", aSN1ObjectIdentifier2), str, "$CBC"), str, aSN1ObjectIdentifier3), "$CFB", configurableProvider, "Cipher", aSN1ObjectIdentifier7), str, "$CFB"), str, aSN1ObjectIdentifier8), "$CFB", configurableProvider, "Cipher", aSN1ObjectIdentifier9), str, "$OFB"), str, aSN1ObjectIdentifier4), "$OFB", configurableProvider, "Cipher", aSN1ObjectIdentifier5), str, "$OFB"), str, aSN1ObjectIdentifier6), "$RFC3211Wrap", configurableProvider, "Cipher.ARIARFC3211WRAP", str), "$Wrap", configurableProvider, "Cipher.ARIAWRAP");
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = NSRIObjectIdentifiers.id_aria128_kw;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier13, "ARIAWRAP");
            ASN1ObjectIdentifier aSN1ObjectIdentifier14 = NSRIObjectIdentifiers.id_aria192_kw;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier14, "ARIAWRAP");
            ASN1ObjectIdentifier aSN1ObjectIdentifier15 = NSRIObjectIdentifiers.id_aria256_kw;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier15, "ARIAWRAP");
            configurableProvider.addAlgorithm("Cipher.ARIAWRAPPAD", GMSSPrivateKey$$ExternalSyntheticOutline0.m("Alg.Alias.Cipher.ARIAKW", "ARIAWRAP", configurableProvider, str, "$WrapPad"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier16 = NSRIObjectIdentifiers.id_aria128_kwp;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier16, "ARIAWRAPPAD");
            ASN1ObjectIdentifier aSN1ObjectIdentifier17 = NSRIObjectIdentifiers.id_aria192_kwp;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier17, "ARIAWRAPPAD");
            ASN1ObjectIdentifier aSN1ObjectIdentifier18 = NSRIObjectIdentifiers.id_aria256_kwp;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier18, "ARIAWRAPPAD");
            StringBuilder m4362m = GMSSPrivateKey$$ExternalSyntheticOutline0.m4362m(configurableProvider, "KeyGenerator", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m4362m(configurableProvider, "KeyGenerator", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m4362m(configurableProvider, "KeyGenerator", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m4362m(configurableProvider, "KeyGenerator", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m4362m(configurableProvider, "KeyGenerator", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m4362m(configurableProvider, "KeyGenerator", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m4362m(configurableProvider, "KeyGenerator", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m4362m(configurableProvider, "KeyGenerator", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m4362m(configurableProvider, "KeyGenerator", GMSSPrivateKey$$ExternalSyntheticOutline0.m("KeyGenerator.ARIA", GMSSPrivateKey$$ExternalSyntheticOutline0.m("Alg.Alias.Cipher.ARIAKWP", "ARIAWRAPPAD", configurableProvider, str, "$KeyGen"), configurableProvider, str, "$KeyGen128"), str, aSN1ObjectIdentifier13), "$KeyGen192", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier14), str, "$KeyGen256"), str, aSN1ObjectIdentifier15), "$KeyGen128", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier16), str, "$KeyGen192"), str, aSN1ObjectIdentifier17), "$KeyGen256", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier18), str, "$KeyGen128"), str, aSN1ObjectIdentifier10), "$KeyGen192", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier11), str, "$KeyGen256"), str, aSN1ObjectIdentifier12), "$KeyGen128", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier), str, "$KeyGen192"), str, aSN1ObjectIdentifier2), "$KeyGen256", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier3), str, "$KeyGen128"), str, aSN1ObjectIdentifier7), "$KeyGen192", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier8), str, "$KeyGen256"), str, aSN1ObjectIdentifier9), "$KeyGen128", configurableProvider, "KeyGenerator", aSN1ObjectIdentifier4), str, "$KeyGen192"), str, aSN1ObjectIdentifier5);
            m4362m.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier6, m4362m.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier19 = NSRIObjectIdentifiers.id_aria128_ccm;
            GMSSPrivateKey$$ExternalSyntheticOutline0.m4365m(configurableProvider, str, "$KeyGen128", "KeyGenerator", aSN1ObjectIdentifier19);
            ASN1ObjectIdentifier aSN1ObjectIdentifier20 = NSRIObjectIdentifiers.id_aria192_ccm;
            GMSSPrivateKey$$ExternalSyntheticOutline0.m4365m(configurableProvider, str, "$KeyGen192", "KeyGenerator", aSN1ObjectIdentifier20);
            ASN1ObjectIdentifier aSN1ObjectIdentifier21 = NSRIObjectIdentifiers.id_aria256_ccm;
            GMSSPrivateKey$$ExternalSyntheticOutline0.m4365m(configurableProvider, str, "$KeyGen256", "KeyGenerator", aSN1ObjectIdentifier21);
            ASN1ObjectIdentifier aSN1ObjectIdentifier22 = NSRIObjectIdentifiers.id_aria128_gcm;
            GMSSPrivateKey$$ExternalSyntheticOutline0.m4365m(configurableProvider, str, "$KeyGen128", "KeyGenerator", aSN1ObjectIdentifier22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier23 = NSRIObjectIdentifiers.id_aria192_gcm;
            GMSSPrivateKey$$ExternalSyntheticOutline0.m4365m(configurableProvider, str, "$KeyGen192", "KeyGenerator", aSN1ObjectIdentifier23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier24 = NSRIObjectIdentifiers.id_aria256_gcm;
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier24, str + "$KeyGen256");
            GMSSPrivateKey$$ExternalSyntheticOutline0.m4364m(new StringBuilder(), str, "$KeyFactory", configurableProvider, "SecretKeyFactory.ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier, "ARIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier2, "ARIA");
            StringBuilder m4362m2 = GMSSPrivateKey$$ExternalSyntheticOutline0.m4362m(configurableProvider, "Alg.Alias.SecretKeyFactory", "ARIA", str, aSN1ObjectIdentifier3);
            m4362m2.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.ARIACCM", m4362m2.toString());
            GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier19, configurableProvider, "ARIACCM", "Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier20, configurableProvider, "ARIACCM", "Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier21, configurableProvider, "ARIACCM", str), "$CCM", configurableProvider, "Cipher.ARIACCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier19, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier20, "CCM");
            StringBuilder m4362m3 = GMSSPrivateKey$$ExternalSyntheticOutline0.m4362m(configurableProvider, "Alg.Alias.Cipher", "CCM", str, aSN1ObjectIdentifier21);
            m4362m3.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.ARIAGCM", m4362m3.toString());
            GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier22, configurableProvider, "ARIAGCM", "Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier23, configurableProvider, "ARIAGCM", "Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier24, configurableProvider, "ARIAGCM", str), "$GCM", configurableProvider, "Cipher.ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier22, "ARIAGCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier23, "ARIAGCM");
            StringBuilder m4362m4 = GMSSPrivateKey$$ExternalSyntheticOutline0.m4362m(configurableProvider, "Alg.Alias.Cipher", "ARIAGCM", str, aSN1ObjectIdentifier24);
            m4362m4.append("$GMAC");
            addGMacAlgorithm(configurableProvider, "ARIA", m4362m4.toString(), Recorder$$ExternalSyntheticOutline2.m$1(str, "$KeyGen"));
            addPoly1305Algorithm(configurableProvider, "ARIA", Recorder$$ExternalSyntheticOutline2.m$1(str, "$Poly1305"), Recorder$$ExternalSyntheticOutline2.m$1(str, "$Poly1305KeyGen"));
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new ARIAEngine(), 128)), 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new ARIAEngine()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-ARIA", 256, new Poly1305KeyGenerator());
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new RFC3211WrapEngine(new ARIAEngine()), 16);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new ARIAWrapEngine());
        }
    }

    public static class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new ARIAWrapPadEngine());
        }
    }

    private ARIA() {
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen(int i) {
            super("ARIA", i, new CipherKeyGenerator());
        }

        public KeyGen() {
            this(256);
        }
    }

    public static class AlgParamsCCM extends BaseAlgorithmParameters {
        private CCMParameters ccmParams;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str)) {
                return this.ccmParams.getEncoded();
            }
            a$$ExternalSyntheticBUOutline0.m$4("unknown format specified");
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.ccmParams = CCMParameters.getInstance(GcmSpecUtil.extractGcmParameters(algorithmParameterSpec));
            } else {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
                }
                AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
                this.ccmParams = new CCMParameters(aEADParameterSpec.getNonce(), aEADParameterSpec.getMacSizeInBits() / 8);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "CCM";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                return GcmSpecUtil.gcmSpecExtractable() ? GcmSpecUtil.extractGcmSpec(this.ccmParams.toASN1Primitive()) : new AEADParameterSpec(this.ccmParams.getNonce(), this.ccmParams.getIcvLen() * 8);
            }
            if (cls == AEADParameterSpec.class) {
                return new AEADParameterSpec(this.ccmParams.getNonce(), this.ccmParams.getIcvLen() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.ccmParams.getNonce());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            return this.ccmParams.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) {
            this.ccmParams = CCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) {
            if (isASN1FormatString(str)) {
                this.ccmParams = CCMParameters.getInstance(bArr);
            } else {
                a$$ExternalSyntheticBUOutline0.m$4("unknown format specified");
            }
        }
    }

    public static class AlgParamsGCM extends BaseAlgorithmParameters {
        private GCMParameters gcmParams;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str)) {
                return this.gcmParams.getEncoded();
            }
            a$$ExternalSyntheticBUOutline0.m$4("unknown format specified");
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.gcmParams = GcmSpecUtil.extractGcmParameters(algorithmParameterSpec);
            } else {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
                }
                AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
                this.gcmParams = new GCMParameters(aEADParameterSpec.getNonce(), aEADParameterSpec.getMacSizeInBits() / 8);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "GCM";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                return GcmSpecUtil.gcmSpecExtractable() ? GcmSpecUtil.extractGcmSpec(this.gcmParams.toASN1Primitive()) : new AEADParameterSpec(this.gcmParams.getNonce(), this.gcmParams.getIcvLen() * 8);
            }
            if (cls == AEADParameterSpec.class) {
                return new AEADParameterSpec(this.gcmParams.getNonce(), this.gcmParams.getIcvLen() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.gcmParams.getNonce());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            return this.gcmParams.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) {
            this.gcmParams = GCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) {
            if (isASN1FormatString(str)) {
                this.gcmParams = GCMParameters.getInstance(bArr);
            } else {
                a$$ExternalSyntheticBUOutline0.m$4("unknown format specified");
            }
        }
    }
}

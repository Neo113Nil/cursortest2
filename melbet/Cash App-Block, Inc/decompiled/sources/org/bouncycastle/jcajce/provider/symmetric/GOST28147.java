package org.bouncycastle.jcajce.provider.symmetric;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.GOST28147Parameters;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.CryptoProWrapEngine;
import org.bouncycastle.crypto.engines.GOST28147Engine;
import org.bouncycastle.crypto.engines.GOST28147WrapEngine;
import org.bouncycastle.crypto.macs.GOST28147Mac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.GCFBBlockCipher;
import org.bouncycastle.internal.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.asn1.GMSSPrivateKey$$ExternalSyntheticOutline0;
import org.bouncycastle.util.Strings;

/* loaded from: classes9.dex */
public final class GOST28147 {
    private static Map<ASN1ObjectIdentifier, String> oidMappings = new HashMap();
    private static Map<String, ASN1ObjectIdentifier> nameMappings = new HashMap();

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        byte[] iv = new byte[8];
        byte[] sBox = GOST28147Engine.getSBox("E-A");

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(this.iv);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("GOST28147");
                createParametersInstance.init(new GOST28147ParameterSpec(this.sBox, this.iv));
                return createParametersInstance;
            } catch (Exception e) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1(e.getMessage());
                return null;
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            if (algorithmParameterSpec instanceof GOST28147ParameterSpec) {
                this.sBox = ((GOST28147ParameterSpec) algorithmParameterSpec).getSBox();
            } else {
                AesGcmSiv$$ExternalSyntheticLambda0.m$1("parameter spec not supported");
            }
        }
    }

    public static class AlgParams extends BaseAlgParams {
        private byte[] iv;
        private ASN1ObjectIdentifier sBox = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet;

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
                return;
            }
            if (!(algorithmParameterSpec instanceof GOST28147ParameterSpec)) {
                Mod$$ExternalSyntheticBUOutline0.m("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
                return;
            }
            this.iv = ((GOST28147ParameterSpec) algorithmParameterSpec).getIV();
            try {
                this.sBox = BaseAlgParams.getSBoxOID(((GOST28147ParameterSpec) algorithmParameterSpec).getSBox());
            } catch (IllegalArgumentException e) {
                throw new InvalidParameterSpecException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "GOST 28147 IV Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            if (cls == GOST28147ParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new GOST28147ParameterSpec(this.sBox, this.iv);
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        public byte[] localGetEncoded() {
            return new GOST28147Parameters(this.iv, this.sBox).getEncoded();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        public void localInit(byte[] bArr) {
            ASN1Primitive fromByteArray = ASN1Primitive.fromByteArray(bArr);
            if (fromByteArray instanceof ASN1OctetString) {
                this.iv = ASN1OctetString.getInstance(fromByteArray).getOctets();
            } else {
                if (!(fromByteArray instanceof ASN1Sequence)) {
                    a$$ExternalSyntheticBUOutline0.m$4("Unable to recognize parameters");
                    return;
                }
                GOST28147Parameters gOST28147Parameters = GOST28147Parameters.getInstance(fromByteArray);
                this.sBox = gOST28147Parameters.getEncryptionParamSet();
                this.iv = gOST28147Parameters.getIV();
            }
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new GOST28147Engine()), 64);
        }
    }

    public static class CryptoProWrap extends BaseWrapCipher {
        public CryptoProWrap() {
            super(new CryptoProWrapEngine());
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new GOST28147Engine());
        }
    }

    public static class GCFB extends BaseBlockCipher {
        public GCFB() {
            super(new BufferedBlockCipher(new GCFBBlockCipher(new GOST28147Engine())), 64);
        }
    }

    public static class GostWrap extends BaseWrapCipher {
        public GostWrap() {
            super(new GOST28147WrapEngine());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new GOST28147Mac());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = GOST28147.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            GMSSPrivateKey$$ExternalSyntheticOutline0.m4364m(sb, str, "$ECB", configurableProvider, "Cipher.GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.GOST", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.GOST-28147", "GOST28147");
            StringBuilder sb2 = new StringBuilder("Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = CryptoProObjectIdentifiers.gostR28147_gcfb;
            sb2.append(aSN1ObjectIdentifier);
            configurableProvider.addAlgorithm(sb2.toString(), str + "$GCFB");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            GMSSPrivateKey$$ExternalSyntheticOutline0.m(sb3, "$KeyGen", configurableProvider, "KeyGenerator.GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.GOST", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.GOST-28147", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + aSN1ObjectIdentifier, "GOST28147");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            StringBuilder m = GMSSPrivateKey$$ExternalSyntheticOutline0.m(sb4, "$AlgParams", configurableProvider, "AlgorithmParameters.GOST28147", str);
            m.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.GOST28147", m.toString());
            StringBuilder m2 = GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.AlgorithmParameters."), aSN1ObjectIdentifier, configurableProvider, "GOST28147", "Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier, configurableProvider, "GOST28147", "Cipher.");
            m2.append(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap);
            StringBuilder m4361m = GMSSPrivateKey$$ExternalSyntheticOutline0.m4361m(str, "$CryptoProWrap", configurableProvider, m2.toString(), "Cipher.");
            m4361m.append(CryptoProObjectIdentifiers.id_Gost28147_89_None_KeyWrap);
            configurableProvider.addAlgorithm(m4361m.toString(), str + "$GostWrap");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            GMSSPrivateKey$$ExternalSyntheticOutline0.m(sb5, "$Mac", configurableProvider, "Mac.GOST28147MAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.GOST28147", "GOST28147MAC");
        }
    }

    static {
        oidMappings.put(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_TestParamSet, "E-TEST");
        Map<ASN1ObjectIdentifier, String> map = oidMappings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet;
        map.put(aSN1ObjectIdentifier, "E-A");
        Map<ASN1ObjectIdentifier, String> map2 = oidMappings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_B_ParamSet;
        map2.put(aSN1ObjectIdentifier2, "E-B");
        Map<ASN1ObjectIdentifier, String> map3 = oidMappings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_C_ParamSet;
        map3.put(aSN1ObjectIdentifier3, "E-C");
        Map<ASN1ObjectIdentifier, String> map4 = oidMappings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_D_ParamSet;
        map4.put(aSN1ObjectIdentifier4, "E-D");
        Map<ASN1ObjectIdentifier, String> map5 = oidMappings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = RosstandartObjectIdentifiers.id_tc26_gost_28147_param_Z;
        map5.put(aSN1ObjectIdentifier5, "PARAM-Z");
        nameMappings.put("E-A", aSN1ObjectIdentifier);
        nameMappings.put("E-B", aSN1ObjectIdentifier2);
        nameMappings.put("E-C", aSN1ObjectIdentifier3);
        nameMappings.put("E-D", aSN1ObjectIdentifier4);
        nameMappings.put("PARAM-Z", aSN1ObjectIdentifier5);
    }

    private GOST28147() {
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen(int i) {
            super("GOST28147", i, new CipherKeyGenerator());
        }

        public KeyGen() {
            this(256);
        }
    }

    public static abstract class BaseAlgParams extends BaseAlgorithmParameters {
        private byte[] iv;
        private ASN1ObjectIdentifier sBox = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet;

        public static ASN1ObjectIdentifier getSBoxOID(String str) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = str != null ? (ASN1ObjectIdentifier) GOST28147.nameMappings.get(Strings.toUpperCase(str)) : null;
            if (aSN1ObjectIdentifier != null) {
                return aSN1ObjectIdentifier;
            }
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Unknown SBOX name: ", str));
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public final byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str)) {
                return localGetEncoded();
            }
            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m("Unknown parameter format: ", str));
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
                return;
            }
            if (!(algorithmParameterSpec instanceof GOST28147ParameterSpec)) {
                Mod$$ExternalSyntheticBUOutline0.m("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
                return;
            }
            this.iv = ((GOST28147ParameterSpec) algorithmParameterSpec).getIV();
            try {
                this.sBox = getSBoxOID(((GOST28147ParameterSpec) algorithmParameterSpec).getSBox());
            } catch (IllegalArgumentException e) {
                throw new InvalidParameterSpecException(e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            if (cls == GOST28147ParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new GOST28147ParameterSpec(this.sBox, this.iv);
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }

        public byte[] localGetEncoded() {
            return new GOST28147Parameters(this.iv, this.sBox).getEncoded();
        }

        public abstract void localInit(byte[] bArr);

        @Override // java.security.AlgorithmParametersSpi
        public final byte[] engineGetEncoded() {
            return engineGetEncoded("ASN.1");
        }

        public static ASN1ObjectIdentifier getSBoxOID(byte[] bArr) {
            return getSBoxOID(GOST28147Engine.getSBoxName(bArr));
        }

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(byte[] bArr) {
            engineInit(bArr, "ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(byte[] bArr, String str) {
            if (bArr == null) {
                a$$ExternalSyntheticBUOutline0.m$2("Encoded parameters cannot be null");
                return;
            }
            if (isASN1FormatString(str)) {
                try {
                    localInit(bArr);
                    return;
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    a$$ExternalSyntheticBUOutline0.m$4(Fragment$5$$ExternalSyntheticOutline0.m(e2, new StringBuilder("Parameter parsing failed: ")));
                    return;
                }
            }
            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m("Unknown parameter format: ", str));
        }
    }
}

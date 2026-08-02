package org.bouncycastle.jcajce.provider.util;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.pqc.asn1.GMSSPrivateKey$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public abstract class AsymmetricAlgorithmProvider extends AlgorithmProvider {
    public void addCipherAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("Cipher." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Cipher." + aSN1ObjectIdentifier, str);
            GMSSPrivateKey$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.Cipher.OID."), aSN1ObjectIdentifier, configurableProvider, str);
        }
    }

    public void addKeyFactoryAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("KeyFactory." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + aSN1ObjectIdentifier, str);
            GMSSPrivateKey$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.KeyFactory.OID."), aSN1ObjectIdentifier, configurableProvider, str);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
        }
    }

    public void addKeyGeneratorAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("KeyGenerator." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + aSN1ObjectIdentifier, str);
            GMSSPrivateKey$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.KeyGenerator.OID."), aSN1ObjectIdentifier, configurableProvider, str);
        }
    }

    public void addKeyPairGeneratorAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("KeyPairGenerator." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator." + aSN1ObjectIdentifier, str);
            GMSSPrivateKey$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.KeyPairGenerator.OID."), aSN1ObjectIdentifier, configurableProvider, str);
        }
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier, Map<String, String> map) {
        String m = Recorder$$ExternalSyntheticOutline2.m(str, "WITH", str2);
        String m2 = Recorder$$ExternalSyntheticOutline2.m(str, "with", str2);
        String m3 = Recorder$$ExternalSyntheticOutline2.m(str, "With", str2);
        String m4 = Recorder$$ExternalSyntheticOutline2.m(str, "/", str2);
        configurableProvider.addAlgorithm("Signature.".concat(m), str3);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(m2), m);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(m3), m);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(m4), m);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + aSN1ObjectIdentifier, m);
            GMSSPrivateKey$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.Signature.OID."), aSN1ObjectIdentifier, configurableProvider, m);
        }
        configurableProvider.addAttributes("Signature.".concat(m), map);
    }

    public void addSignatureAlias(ConfigurableProvider configurableProvider, String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("Alg.Alias.Signature." + aSN1ObjectIdentifier, str);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.Signature.OID."), aSN1ObjectIdentifier, configurableProvider, str);
    }

    public void registerKeyFactoryOid(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + aSN1ObjectIdentifier, str);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.KeyFactory.OID."), aSN1ObjectIdentifier, configurableProvider, str);
        configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
    }

    public void registerOid(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + aSN1ObjectIdentifier, str);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.KeyPairGenerator."), aSN1ObjectIdentifier, configurableProvider, str);
        configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
    }

    public void registerOidAlgorithmParameterGenerator(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + aSN1ObjectIdentifier, str);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.AlgorithmParameters."), aSN1ObjectIdentifier, configurableProvider, str);
    }

    public void registerOidAlgorithmParameters(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier, str);
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String m = Recorder$$ExternalSyntheticOutline2.m(str, "WITH", str2);
        String m2 = Recorder$$ExternalSyntheticOutline2.m(str, "with", str2);
        String m3 = Recorder$$ExternalSyntheticOutline2.m(str, "With", str2);
        String m4 = Recorder$$ExternalSyntheticOutline2.m(str, "/", str2);
        configurableProvider.addAlgorithm("Signature.".concat(m), str3);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(m2), m);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(m3), m);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(m4), m);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + aSN1ObjectIdentifier, m);
            GMSSPrivateKey$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.Signature.OID."), aSN1ObjectIdentifier, configurableProvider, m);
        }
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        addSignatureAlgorithm(configurableProvider, str, str2, str3, null);
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("Signature." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + aSN1ObjectIdentifier, str);
            GMSSPrivateKey$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.Signature.OID."), aSN1ObjectIdentifier, configurableProvider, str);
        }
    }
}

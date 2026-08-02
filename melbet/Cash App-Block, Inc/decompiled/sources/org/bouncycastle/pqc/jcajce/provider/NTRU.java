package org.bouncycastle.pqc.jcajce.provider;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.asn1.GMSSPrivateKey$$ExternalSyntheticOutline0;
import org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyFactorySpi;

/* loaded from: classes10.dex */
public class NTRU {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.ntru.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyGenerator.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyGeneratorSpi");
            StringBuilder sb = new StringBuilder("Alg.Alias.KeyGenerator.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.pqc_kem_ntru;
            StringBuilder m = GetCert$$ExternalSyntheticOutline0.m(sb, aSN1ObjectIdentifier, configurableProvider, "NTRU", "Alg.Alias.KeyGenerator.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = BCObjectIdentifiers.ntruhps2048509;
            StringBuilder m2 = GetCert$$ExternalSyntheticOutline0.m(m, aSN1ObjectIdentifier2, configurableProvider, "NTRU", "Alg.Alias.KeyGenerator.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.ntruhps2048677;
            StringBuilder m3 = GetCert$$ExternalSyntheticOutline0.m(m2, aSN1ObjectIdentifier3, configurableProvider, "NTRU", "Alg.Alias.KeyGenerator.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = BCObjectIdentifiers.ntruhps4096821;
            StringBuilder m4 = GetCert$$ExternalSyntheticOutline0.m(m3, aSN1ObjectIdentifier4, configurableProvider, "NTRU", "Alg.Alias.KeyGenerator.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = BCObjectIdentifiers.ntruhrss701;
            m4.append(aSN1ObjectIdentifier5);
            configurableProvider.addAlgorithm(m4.toString(), "NTRU");
            NTRUKeyFactorySpi nTRUKeyFactorySpi = new NTRUKeyFactorySpi();
            configurableProvider.addAlgorithm(GMSSPrivateKey$$ExternalSyntheticOutline0.m(configurableProvider, GMSSPrivateKey$$ExternalSyntheticOutline0.m(configurableProvider, GMSSPrivateKey$$ExternalSyntheticOutline0.m(configurableProvider, GMSSPrivateKey$$ExternalSyntheticOutline0.m(configurableProvider, GMSSPrivateKey$$ExternalSyntheticOutline0.m(configurableProvider, "Cipher.NTRU", "org.bouncycastle.pqc.jcajce.provider.ntru.NTRUCipherSpi$Base", "Alg.Alias.Cipher.", aSN1ObjectIdentifier), "NTRU", "Alg.Alias.Cipher.", aSN1ObjectIdentifier2), "NTRU", "Alg.Alias.Cipher.", aSN1ObjectIdentifier3), "NTRU", "Alg.Alias.Cipher.", aSN1ObjectIdentifier4), "NTRU", "Alg.Alias.Cipher.", aSN1ObjectIdentifier5), "NTRU");
            registerOid(configurableProvider, aSN1ObjectIdentifier, "NTRU", nTRUKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier2, "NTRU", nTRUKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier3, "NTRU", nTRUKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier4, "NTRU", nTRUKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier5, "NTRU", nTRUKeyFactorySpi);
        }
    }
}

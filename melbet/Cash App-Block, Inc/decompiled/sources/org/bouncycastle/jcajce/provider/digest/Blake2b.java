package org.bouncycastle.jcajce.provider.digest;

import com.plaid.internal.EnumC0170g;
import org.bouncycastle.crypto.digests.Blake2bDigest;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.pqc.asn1.GMSSPrivateKey$$ExternalSyntheticOutline0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes9.dex */
public class Blake2b {

    public static class Blake2b160 extends BCMessageDigest implements Cloneable {
        public Blake2b160() {
            super(new Blake2bDigest(EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2b160 blake2b160 = (Blake2b160) super.clone();
            blake2b160.digest = new Blake2bDigest((Blake2bDigest) this.digest);
            return blake2b160;
        }
    }

    public static class Blake2b256 extends BCMessageDigest implements Cloneable {
        public Blake2b256() {
            super(new Blake2bDigest(256));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2b256 blake2b256 = (Blake2b256) super.clone();
            blake2b256.digest = new Blake2bDigest((Blake2bDigest) this.digest);
            return blake2b256;
        }
    }

    public static class Blake2b384 extends BCMessageDigest implements Cloneable {
        public Blake2b384() {
            super(new Blake2bDigest(MLKEMEngine.KyberPolyBytes));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2b384 blake2b384 = (Blake2b384) super.clone();
            blake2b384.digest = new Blake2bDigest((Blake2bDigest) this.digest);
            return blake2b384;
        }
    }

    public static class Blake2b512 extends BCMessageDigest implements Cloneable {
        public Blake2b512() {
            super(new Blake2bDigest(512));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2b512 blake2b512 = (Blake2b512) super.clone();
            blake2b512.digest = new Blake2bDigest((Blake2bDigest) this.digest);
            return blake2b512;
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Blake2b.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Blake2b512");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-512", sb.toString());
            StringBuilder m = GMSSPrivateKey$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.MessageDigest."), MiscObjectIdentifiers.id_blake2b512, configurableProvider, "BLAKE2B-512", str);
            m.append("$Blake2b384");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-384", m.toString());
            StringBuilder m2 = GMSSPrivateKey$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.MessageDigest."), MiscObjectIdentifiers.id_blake2b384, configurableProvider, "BLAKE2B-384", str);
            m2.append("$Blake2b256");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-256", m2.toString());
            StringBuilder m3 = GMSSPrivateKey$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.MessageDigest."), MiscObjectIdentifiers.id_blake2b256, configurableProvider, "BLAKE2B-256", str);
            m3.append("$Blake2b160");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-160", m3.toString());
            GMSSPrivateKey$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.MessageDigest."), MiscObjectIdentifiers.id_blake2b160, configurableProvider, "BLAKE2B-160");
        }
    }

    private Blake2b() {
    }
}

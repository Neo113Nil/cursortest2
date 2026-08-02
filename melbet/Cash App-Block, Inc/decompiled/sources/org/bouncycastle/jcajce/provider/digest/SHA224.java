package org.bouncycastle.jcajce.provider.digest;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.asn1.GMSSPrivateKey$$ExternalSyntheticOutline0;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes9.dex */
public class SHA224 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA224Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA224Digest((SHA224Digest) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA224Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA224", 224, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA224.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            GMSSPrivateKey$$ExternalSyntheticOutline0.m4364m(sb, str, "$Digest", configurableProvider, "MessageDigest.SHA-224");
            StringBuilder m = GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(configurableProvider, "Alg.Alias.MessageDigest.SHA224", McElieceCCA2KeyGenParameterSpec.SHA224, "Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha224, configurableProvider, McElieceCCA2KeyGenParameterSpec.SHA224, str), "$HashMac", configurableProvider, "Mac.PBEWITHHMACSHA224", str);
            m.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA224", m.toString(), Recorder$$ExternalSyntheticOutline2.m$1(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "SHA224", PKCSObjectIdentifiers.id_hmacWithSHA224);
        }
    }

    private SHA224() {
    }
}

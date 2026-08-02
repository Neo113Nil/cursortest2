package org.bouncycastle.jcajce.provider.digest;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.MD2Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.asn1.GMSSPrivateKey$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public class MD2 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new MD2Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new MD2Digest((MD2Digest) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new MD2Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACMD2", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = MD2.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.MD2", sb.toString());
            StringBuilder m = GMSSPrivateKey$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.MessageDigest."), PKCSObjectIdentifiers.md2, configurableProvider, "MD2", str);
            m.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "MD2", m.toString(), Recorder$$ExternalSyntheticOutline2.m$1(str, "$KeyGenerator"));
        }
    }

    private MD2() {
    }
}

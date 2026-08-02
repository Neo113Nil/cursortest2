package org.bouncycastle.jcajce.provider.digest;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.plaid.internal.EnumC0170g;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.internal.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.pqc.asn1.GMSSPrivateKey$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public class RIPEMD160 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new RIPEMD160Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new RIPEMD160Digest((RIPEMD160Digest) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new RIPEMD160Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACRIPEMD160", EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = RIPEMD160.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.RIPEMD160", sb.toString());
            StringBuilder m = GMSSPrivateKey$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.MessageDigest."), TeleTrusTObjectIdentifiers.ripemd160, configurableProvider, "RIPEMD160", str);
            m.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "RIPEMD160", m.toString(), Recorder$$ExternalSyntheticOutline2.m$1(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "RIPEMD160", IANAObjectIdentifiers.hmacRIPEMD160);
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACRIPEMD160", str + "$PBEWithHmacKeyFactory");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            GMSSPrivateKey$$ExternalSyntheticOutline0.m(sb2, "$PBEWithHmac", configurableProvider, "Mac.PBEWITHHMACRIPEMD160");
        }
    }

    public static class PBEWithHmac extends BaseMac {
        public PBEWithHmac() {
            super(new HMac(new RIPEMD160Digest()), 2, 2, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
        }
    }

    public static class PBEWithHmacKeyFactory extends PBESecretKeyFactory {
        public PBEWithHmacKeyFactory() {
            super("PBEwithHmacRIPEMD160", null, false, 2, 2, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, 0);
        }
    }

    private RIPEMD160() {
    }
}

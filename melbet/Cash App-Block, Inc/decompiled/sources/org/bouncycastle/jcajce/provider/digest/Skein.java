package org.bouncycastle.jcajce.provider.digest;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SkeinDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.SkeinMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.asn1.GMSSPrivateKey$$ExternalSyntheticOutline0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes9.dex */
public class Skein {

    public static class DigestSkein1024 extends BCMessageDigest implements Cloneable {
        public DigestSkein1024(int i) {
            super(new SkeinDigest(1024, i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SkeinDigest((SkeinDigest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestSkein256 extends BCMessageDigest implements Cloneable {
        public DigestSkein256(int i) {
            super(new SkeinDigest(256, i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SkeinDigest((SkeinDigest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestSkein512 extends BCMessageDigest implements Cloneable {
        public DigestSkein512(int i) {
            super(new SkeinDigest(512, i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SkeinDigest((SkeinDigest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class Digest_1024_1024 extends DigestSkein1024 {
        public Digest_1024_1024() {
            super(1024);
        }
    }

    public static class Digest_1024_384 extends DigestSkein1024 {
        public Digest_1024_384() {
            super(MLKEMEngine.KyberPolyBytes);
        }
    }

    public static class Digest_1024_512 extends DigestSkein1024 {
        public Digest_1024_512() {
            super(512);
        }
    }

    public static class Digest_256_128 extends DigestSkein256 {
        public Digest_256_128() {
            super(128);
        }
    }

    public static class Digest_256_160 extends DigestSkein256 {
        public Digest_256_160() {
            super(EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
        }
    }

    public static class Digest_256_224 extends DigestSkein256 {
        public Digest_256_224() {
            super(224);
        }
    }

    public static class Digest_256_256 extends DigestSkein256 {
        public Digest_256_256() {
            super(256);
        }
    }

    public static class Digest_512_128 extends DigestSkein512 {
        public Digest_512_128() {
            super(128);
        }
    }

    public static class Digest_512_160 extends DigestSkein512 {
        public Digest_512_160() {
            super(EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
        }
    }

    public static class Digest_512_224 extends DigestSkein512 {
        public Digest_512_224() {
            super(224);
        }
    }

    public static class Digest_512_256 extends DigestSkein512 {
        public Digest_512_256() {
            super(256);
        }
    }

    public static class Digest_512_384 extends DigestSkein512 {
        public Digest_512_384() {
            super(MLKEMEngine.KyberPolyBytes);
        }
    }

    public static class Digest_512_512 extends DigestSkein512 {
        public Digest_512_512() {
            super(512);
        }
    }

    public static class HMacKeyGenerator_1024_1024 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_1024() {
            super("HMACSkein-1024-1024", 1024, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_1024_384 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_384() {
            super("HMACSkein-1024-384", MLKEMEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_1024_512 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_512() {
            super("HMACSkein-1024-512", 512, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_128 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_128() {
            super("HMACSkein-256-128", 128, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_160 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_160() {
            super("HMACSkein-256-160", EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_224 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_224() {
            super("HMACSkein-256-224", 224, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_256 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_256() {
            super("HMACSkein-256-256", 256, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_128 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_128() {
            super("HMACSkein-512-128", 128, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_160 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_160() {
            super("HMACSkein-512-160", EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_224 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_224() {
            super("HMACSkein-512-224", 224, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_256 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_256() {
            super("HMACSkein-512-256", 256, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_384 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_384() {
            super("HMACSkein-512-384", MLKEMEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_512 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_512() {
            super("HMACSkein-512-512", 512, new CipherKeyGenerator());
        }
    }

    public static class HashMac_1024_1024 extends BaseMac {
        public HashMac_1024_1024() {
            super(new HMac(new SkeinDigest(1024, 1024)));
        }
    }

    public static class HashMac_1024_384 extends BaseMac {
        public HashMac_1024_384() {
            super(new HMac(new SkeinDigest(1024, MLKEMEngine.KyberPolyBytes)));
        }
    }

    public static class HashMac_1024_512 extends BaseMac {
        public HashMac_1024_512() {
            super(new HMac(new SkeinDigest(1024, 512)));
        }
    }

    public static class HashMac_256_128 extends BaseMac {
        public HashMac_256_128() {
            super(new HMac(new SkeinDigest(256, 128)));
        }
    }

    public static class HashMac_256_160 extends BaseMac {
        public HashMac_256_160() {
            super(new HMac(new SkeinDigest(256, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE)));
        }
    }

    public static class HashMac_256_224 extends BaseMac {
        public HashMac_256_224() {
            super(new HMac(new SkeinDigest(256, 224)));
        }
    }

    public static class HashMac_256_256 extends BaseMac {
        public HashMac_256_256() {
            super(new HMac(new SkeinDigest(256, 256)));
        }
    }

    public static class HashMac_512_128 extends BaseMac {
        public HashMac_512_128() {
            super(new HMac(new SkeinDigest(512, 128)));
        }
    }

    public static class HashMac_512_160 extends BaseMac {
        public HashMac_512_160() {
            super(new HMac(new SkeinDigest(512, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE)));
        }
    }

    public static class HashMac_512_224 extends BaseMac {
        public HashMac_512_224() {
            super(new HMac(new SkeinDigest(512, 224)));
        }
    }

    public static class HashMac_512_256 extends BaseMac {
        public HashMac_512_256() {
            super(new HMac(new SkeinDigest(512, 256)));
        }
    }

    public static class HashMac_512_384 extends BaseMac {
        public HashMac_512_384() {
            super(new HMac(new SkeinDigest(512, MLKEMEngine.KyberPolyBytes)));
        }
    }

    public static class HashMac_512_512 extends BaseMac {
        public HashMac_512_512() {
            super(new HMac(new SkeinDigest(512, 512)));
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Skein.class.getName();

        private void addSkeinMacAlgorithm(ConfigurableProvider configurableProvider, int i, int i2) {
            String m = Recorder$$ExternalSyntheticOutline2.m("Skein-MAC-", i, i2, "-");
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            Boxes$$ExternalSyntheticOutline1.m(sb, str, "$SkeinMac_", i, "_");
            sb.append(i2);
            configurableProvider.addAlgorithm("Mac.".concat(m), sb.toString());
            configurableProvider.addAlgorithm(Recorder$$ExternalSyntheticOutline2.m(i, i2, "/", new StringBuilder("Alg.Alias.Mac.Skein-MAC")), m);
            configurableProvider.addAlgorithm("KeyGenerator.".concat(m), str + "$SkeinMacKeyGenerator_" + i + "_" + i2);
            configurableProvider.addAlgorithm(Recorder$$ExternalSyntheticOutline2.m(i, i2, "/", new StringBuilder("Alg.Alias.KeyGenerator.Skein-MAC")), m);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            addHMACAlgorithm(configurableProvider, "Skein-256-128", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(GMSSPrivateKey$$ExternalSyntheticOutline0.m(sb, str, "$Digest_256_128", configurableProvider, "MessageDigest.Skein-256-128"), str, "$Digest_256_160", configurableProvider, "MessageDigest.Skein-256-160"), str, "$Digest_256_224", configurableProvider, "MessageDigest.Skein-256-224"), str, "$Digest_256_256", configurableProvider, "MessageDigest.Skein-256-256"), str, "$Digest_512_128", configurableProvider, "MessageDigest.Skein-512-128"), str, "$Digest_512_160", configurableProvider, "MessageDigest.Skein-512-160"), str, "$Digest_512_224", configurableProvider, "MessageDigest.Skein-512-224"), str, "$Digest_512_256", configurableProvider, "MessageDigest.Skein-512-256"), str, "$Digest_512_384", configurableProvider, "MessageDigest.Skein-512-384"), str, "$Digest_512_512", configurableProvider, "MessageDigest.Skein-512-512"), str, "$Digest_1024_384", configurableProvider, "MessageDigest.Skein-1024-384"), str, "$Digest_1024_512", configurableProvider, "MessageDigest.Skein-1024-512"), str, "$Digest_1024_1024", configurableProvider, "MessageDigest.Skein-1024-1024"), str, "$HashMac_256_128"), Recorder$$ExternalSyntheticOutline2.m$1(str, "$HMacKeyGenerator_256_128"));
            addHMACAlgorithm(configurableProvider, "Skein-256-160", Recorder$$ExternalSyntheticOutline2.m$1(str, "$HashMac_256_160"), Recorder$$ExternalSyntheticOutline2.m$1(str, "$HMacKeyGenerator_256_160"));
            addHMACAlgorithm(configurableProvider, "Skein-256-224", Recorder$$ExternalSyntheticOutline2.m$1(str, "$HashMac_256_224"), Recorder$$ExternalSyntheticOutline2.m$1(str, "$HMacKeyGenerator_256_224"));
            addHMACAlgorithm(configurableProvider, "Skein-256-256", Recorder$$ExternalSyntheticOutline2.m$1(str, "$HashMac_256_256"), Recorder$$ExternalSyntheticOutline2.m$1(str, "$HMacKeyGenerator_256_256"));
            addHMACAlgorithm(configurableProvider, "Skein-512-128", Recorder$$ExternalSyntheticOutline2.m$1(str, "$HashMac_512_128"), Recorder$$ExternalSyntheticOutline2.m$1(str, "$HMacKeyGenerator_512_128"));
            addHMACAlgorithm(configurableProvider, "Skein-512-160", Recorder$$ExternalSyntheticOutline2.m$1(str, "$HashMac_512_160"), Recorder$$ExternalSyntheticOutline2.m$1(str, "$HMacKeyGenerator_512_160"));
            addHMACAlgorithm(configurableProvider, "Skein-512-224", Recorder$$ExternalSyntheticOutline2.m$1(str, "$HashMac_512_224"), Recorder$$ExternalSyntheticOutline2.m$1(str, "$HMacKeyGenerator_512_224"));
            addHMACAlgorithm(configurableProvider, "Skein-512-256", Recorder$$ExternalSyntheticOutline2.m$1(str, "$HashMac_512_256"), Recorder$$ExternalSyntheticOutline2.m$1(str, "$HMacKeyGenerator_512_256"));
            addHMACAlgorithm(configurableProvider, "Skein-512-384", Recorder$$ExternalSyntheticOutline2.m$1(str, "$HashMac_512_384"), Recorder$$ExternalSyntheticOutline2.m$1(str, "$HMacKeyGenerator_512_384"));
            addHMACAlgorithm(configurableProvider, "Skein-512-512", Recorder$$ExternalSyntheticOutline2.m$1(str, "$HashMac_512_512"), Recorder$$ExternalSyntheticOutline2.m$1(str, "$HMacKeyGenerator_512_512"));
            addHMACAlgorithm(configurableProvider, "Skein-1024-384", Recorder$$ExternalSyntheticOutline2.m$1(str, "$HashMac_1024_384"), Recorder$$ExternalSyntheticOutline2.m$1(str, "$HMacKeyGenerator_1024_384"));
            addHMACAlgorithm(configurableProvider, "Skein-1024-512", Recorder$$ExternalSyntheticOutline2.m$1(str, "$HashMac_1024_512"), Recorder$$ExternalSyntheticOutline2.m$1(str, "$HMacKeyGenerator_1024_512"));
            addHMACAlgorithm(configurableProvider, "Skein-1024-1024", Recorder$$ExternalSyntheticOutline2.m$1(str, "$HashMac_1024_1024"), Recorder$$ExternalSyntheticOutline2.m$1(str, "$HMacKeyGenerator_1024_1024"));
            addSkeinMacAlgorithm(configurableProvider, 256, 128);
            addSkeinMacAlgorithm(configurableProvider, 256, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
            addSkeinMacAlgorithm(configurableProvider, 256, 224);
            addSkeinMacAlgorithm(configurableProvider, 256, 256);
            addSkeinMacAlgorithm(configurableProvider, 512, 128);
            addSkeinMacAlgorithm(configurableProvider, 512, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
            addSkeinMacAlgorithm(configurableProvider, 512, 224);
            addSkeinMacAlgorithm(configurableProvider, 512, 256);
            addSkeinMacAlgorithm(configurableProvider, 512, MLKEMEngine.KyberPolyBytes);
            addSkeinMacAlgorithm(configurableProvider, 512, 512);
            addSkeinMacAlgorithm(configurableProvider, 1024, MLKEMEngine.KyberPolyBytes);
            addSkeinMacAlgorithm(configurableProvider, 1024, 512);
            addSkeinMacAlgorithm(configurableProvider, 1024, 1024);
        }
    }

    public static class SkeinMacKeyGenerator_1024_1024 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_1024() {
            super("Skein-MAC-1024-1024", 1024, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_1024_384 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_384() {
            super("Skein-MAC-1024-384", MLKEMEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_1024_512 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_512() {
            super("Skein-MAC-1024-512", 512, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_128 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_128() {
            super("Skein-MAC-256-128", 128, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_160 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_160() {
            super("Skein-MAC-256-160", EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_224 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_224() {
            super("Skein-MAC-256-224", 224, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_256 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_256() {
            super("Skein-MAC-256-256", 256, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_128 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_128() {
            super("Skein-MAC-512-128", 128, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_160 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_160() {
            super("Skein-MAC-512-160", EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_224 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_224() {
            super("Skein-MAC-512-224", 224, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_256 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_256() {
            super("Skein-MAC-512-256", 256, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_384 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_384() {
            super("Skein-MAC-512-384", MLKEMEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_512 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_512() {
            super("Skein-MAC-512-512", 512, new CipherKeyGenerator());
        }
    }

    public static class SkeinMac_1024_1024 extends BaseMac {
        public SkeinMac_1024_1024() {
            super(new SkeinMac(1024, 1024));
        }
    }

    public static class SkeinMac_1024_384 extends BaseMac {
        public SkeinMac_1024_384() {
            super(new SkeinMac(1024, MLKEMEngine.KyberPolyBytes));
        }
    }

    public static class SkeinMac_1024_512 extends BaseMac {
        public SkeinMac_1024_512() {
            super(new SkeinMac(1024, 512));
        }
    }

    public static class SkeinMac_256_128 extends BaseMac {
        public SkeinMac_256_128() {
            super(new SkeinMac(256, 128));
        }
    }

    public static class SkeinMac_256_160 extends BaseMac {
        public SkeinMac_256_160() {
            super(new SkeinMac(256, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE));
        }
    }

    public static class SkeinMac_256_224 extends BaseMac {
        public SkeinMac_256_224() {
            super(new SkeinMac(256, 224));
        }
    }

    public static class SkeinMac_256_256 extends BaseMac {
        public SkeinMac_256_256() {
            super(new SkeinMac(256, 256));
        }
    }

    public static class SkeinMac_512_128 extends BaseMac {
        public SkeinMac_512_128() {
            super(new SkeinMac(512, 128));
        }
    }

    public static class SkeinMac_512_160 extends BaseMac {
        public SkeinMac_512_160() {
            super(new SkeinMac(512, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE));
        }
    }

    public static class SkeinMac_512_224 extends BaseMac {
        public SkeinMac_512_224() {
            super(new SkeinMac(512, 224));
        }
    }

    public static class SkeinMac_512_256 extends BaseMac {
        public SkeinMac_512_256() {
            super(new SkeinMac(512, 256));
        }
    }

    public static class SkeinMac_512_384 extends BaseMac {
        public SkeinMac_512_384() {
            super(new SkeinMac(512, MLKEMEngine.KyberPolyBytes));
        }
    }

    public static class SkeinMac_512_512 extends BaseMac {
        public SkeinMac_512_512() {
            super(new SkeinMac(512, 512));
        }
    }

    private Skein() {
    }
}

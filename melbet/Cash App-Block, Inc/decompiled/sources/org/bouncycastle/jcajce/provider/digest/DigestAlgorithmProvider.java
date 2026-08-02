package org.bouncycastle.jcajce.provider.digest;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.pqc.asn1.GMSSPrivateKey$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    public void addHMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String m = Recorder$$ExternalSyntheticOutline2.m("HMAC", str);
        configurableProvider.addAlgorithm("Mac.".concat(m), str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC-" + str, m);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC/" + str, m);
        configurableProvider.addAlgorithm("KeyGenerator.".concat(m), str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC-" + str, m);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC/" + str, m);
    }

    public void addHMACAlias(ConfigurableProvider configurableProvider, String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String m = Recorder$$ExternalSyntheticOutline2.m("HMAC", str);
        configurableProvider.addAlgorithm("Alg.Alias.Mac." + aSN1ObjectIdentifier, m);
        GMSSPrivateKey$$ExternalSyntheticOutline0.m(new StringBuilder("Alg.Alias.KeyGenerator."), aSN1ObjectIdentifier, configurableProvider, m);
    }

    public void addKMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String m = Recorder$$ExternalSyntheticOutline2.m("KMAC", str);
        configurableProvider.addAlgorithm("Mac.".concat(m), str2);
        configurableProvider.addAlgorithm("KeyGenerator.".concat(m), str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.KMAC" + str, m);
    }
}

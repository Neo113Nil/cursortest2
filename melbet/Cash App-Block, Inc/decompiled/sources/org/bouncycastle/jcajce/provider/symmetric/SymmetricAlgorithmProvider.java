package org.bouncycastle.jcajce.provider.symmetric;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.pqc.asn1.GMSSPrivateKey$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
abstract class SymmetricAlgorithmProvider extends AlgorithmProvider {
    public void addCMacAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac." + str + "-CMAC", str2);
        StringBuilder m4361m = GMSSPrivateKey$$ExternalSyntheticOutline0.m4361m(str, "-CMAC", configurableProvider, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Alg.Alias.Mac.", str, "CMAC"), "KeyGenerator.");
        m4361m.append(str);
        m4361m.append("-CMAC");
        configurableProvider.addAlgorithm(m4361m.toString(), str3);
        configurableProvider.addAlgorithm(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Alg.Alias.KeyGenerator.", str, "CMAC"), str + "-CMAC");
    }

    public void addGMacAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac." + str + "-GMAC", str2);
        StringBuilder m4361m = GMSSPrivateKey$$ExternalSyntheticOutline0.m4361m(str, "-GMAC", configurableProvider, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Alg.Alias.Mac.", str, "GMAC"), "KeyGenerator.");
        m4361m.append(str);
        m4361m.append("-GMAC");
        configurableProvider.addAlgorithm(m4361m.toString(), str3);
        configurableProvider.addAlgorithm(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Alg.Alias.KeyGenerator.", str, "GMAC"), str + "-GMAC");
    }

    public void addPoly1305Algorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm("Mac.POLY1305-" + str, str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.POLY1305" + str, "POLY1305-" + str);
        configurableProvider.addAlgorithm("KeyGenerator.POLY1305-" + str, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.POLY1305" + str, "POLY1305-" + str);
    }
}

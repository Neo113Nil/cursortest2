package com.digitalturbine.ignite.encryption.generator;

import android.security.keystore.KeyGenParameterSpec;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes3.dex */
public final class a {
    public final AlgorithmParameterSpec a() {
        com.digitalturbine.ignite.authenticator.logger.a.a("%s : create specs", "KeyGeneratorSpecCreator");
        return new KeyGenParameterSpec.Builder("dtx_ignite_service_storage", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build();
    }
}

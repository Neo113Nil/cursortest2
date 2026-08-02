package org.bouncycastle.crypto;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes10.dex */
public interface EncapsulatedSecretGenerator {
    SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter);
}

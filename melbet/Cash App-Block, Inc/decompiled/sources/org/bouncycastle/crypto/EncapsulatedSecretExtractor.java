package org.bouncycastle.crypto;

/* loaded from: classes10.dex */
public interface EncapsulatedSecretExtractor {
    byte[] extractSecret(byte[] bArr);

    int getEncapsulationLength();
}

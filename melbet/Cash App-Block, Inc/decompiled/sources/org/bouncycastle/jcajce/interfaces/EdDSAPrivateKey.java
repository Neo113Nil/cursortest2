package org.bouncycastle.jcajce.interfaces;

import java.security.PrivateKey;

/* loaded from: classes9.dex */
public interface EdDSAPrivateKey extends EdDSAKey, PrivateKey {
    EdDSAPublicKey getPublicKey();
}

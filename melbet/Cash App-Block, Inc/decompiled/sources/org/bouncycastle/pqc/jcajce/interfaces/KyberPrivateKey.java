package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.PrivateKey;

/* loaded from: classes10.dex */
public interface KyberPrivateKey extends PrivateKey, KyberKey {
    KyberPublicKey getPublicKey();
}

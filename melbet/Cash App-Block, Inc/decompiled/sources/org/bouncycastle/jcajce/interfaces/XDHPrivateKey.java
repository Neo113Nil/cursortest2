package org.bouncycastle.jcajce.interfaces;

import java.security.PrivateKey;

/* loaded from: classes9.dex */
public interface XDHPrivateKey extends XDHKey, PrivateKey {
    XDHPublicKey getPublicKey();
}

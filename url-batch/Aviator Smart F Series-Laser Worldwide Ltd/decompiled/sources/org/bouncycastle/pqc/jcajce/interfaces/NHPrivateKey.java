package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import java.security.PrivateKey;

/* loaded from: classes5.dex */
public interface NHPrivateKey extends Key, PrivateKey {
    short[] getSecretData();
}

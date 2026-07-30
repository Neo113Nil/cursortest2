package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import java.security.PublicKey;

/* loaded from: classes5.dex */
public interface NHPublicKey extends Key, PublicKey {
    byte[] getPublicData();
}

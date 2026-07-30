package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.PrivateKey;

/* loaded from: classes5.dex */
public interface LMSPrivateKey extends LMSKey, PrivateKey {
    LMSPrivateKey extractKeyShard(int i8);

    long getIndex();

    @Override // org.bouncycastle.pqc.jcajce.interfaces.LMSKey
    /* synthetic */ int getLevels();

    long getUsagesRemaining();
}

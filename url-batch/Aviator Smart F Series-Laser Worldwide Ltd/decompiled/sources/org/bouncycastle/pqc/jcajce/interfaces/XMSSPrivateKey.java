package org.bouncycastle.pqc.jcajce.interfaces;

import f7.b;
import java.security.PrivateKey;

/* loaded from: classes5.dex */
public interface XMSSPrivateKey extends b, PrivateKey {
    XMSSPrivateKey extractKeyShard(int i8);

    @Override // f7.b
    /* synthetic */ int getHeight();

    long getIndex();

    @Override // f7.b
    /* synthetic */ String getTreeDigest();

    long getUsagesRemaining();
}

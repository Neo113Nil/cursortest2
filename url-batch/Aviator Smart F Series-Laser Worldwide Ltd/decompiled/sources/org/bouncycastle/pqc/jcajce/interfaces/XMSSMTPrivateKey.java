package org.bouncycastle.pqc.jcajce.interfaces;

import f7.c;
import java.security.PrivateKey;

/* loaded from: classes5.dex */
public interface XMSSMTPrivateKey extends c, PrivateKey {
    XMSSMTPrivateKey extractKeyShard(int i8);

    @Override // f7.c
    /* synthetic */ int getHeight();

    long getIndex();

    @Override // f7.c
    /* synthetic */ int getLayers();

    @Override // f7.c
    /* synthetic */ String getTreeDigest();

    long getUsagesRemaining();
}

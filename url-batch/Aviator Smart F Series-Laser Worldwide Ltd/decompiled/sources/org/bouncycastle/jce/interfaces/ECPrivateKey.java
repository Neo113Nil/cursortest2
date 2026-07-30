package org.bouncycastle.jce.interfaces;

import a7.a;
import java.math.BigInteger;
import java.security.PrivateKey;
import org.bouncycastle.jce.spec.d;

/* loaded from: classes5.dex */
public interface ECPrivateKey extends a, PrivateKey {
    BigInteger getD();

    @Override // a7.a
    /* synthetic */ d getParameters();
}

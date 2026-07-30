package org.bouncycastle.jce.interfaces;

import a7.a;
import java.security.PublicKey;
import org.bouncycastle.jce.spec.d;
import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public interface ECPublicKey extends a, PublicKey {
    @Override // a7.a
    /* synthetic */ d getParameters();

    i getQ();
}

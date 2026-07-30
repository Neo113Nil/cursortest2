package org.bouncycastle.math.ec.endo;

import java.math.BigInteger;
import org.bouncycastle.math.ec.j;

/* loaded from: classes5.dex */
public interface d extends a {
    BigInteger[] decomposeScalar(BigInteger bigInteger);

    @Override // org.bouncycastle.math.ec.endo.a
    /* synthetic */ j getPointMap();

    @Override // org.bouncycastle.math.ec.endo.a
    /* synthetic */ boolean hasEfficientPointMap();
}

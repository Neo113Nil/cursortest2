package org.bouncycastle.math.field;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public interface g extends a {
    @Override // org.bouncycastle.math.field.a, org.bouncycastle.math.field.b
    /* synthetic */ BigInteger getCharacteristic();

    @Override // org.bouncycastle.math.field.a
    /* synthetic */ int getDegree();

    @Override // org.bouncycastle.math.field.a, org.bouncycastle.math.field.b
    /* synthetic */ int getDimension();

    f getMinimalPolynomial();

    @Override // org.bouncycastle.math.field.a
    /* synthetic */ b getSubfield();
}

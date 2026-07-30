package org.bouncycastle.math.field;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public interface a extends b {
    @Override // org.bouncycastle.math.field.b
    /* synthetic */ BigInteger getCharacteristic();

    int getDegree();

    @Override // org.bouncycastle.math.field.b
    /* synthetic */ int getDimension();

    b getSubfield();
}

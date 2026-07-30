package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class j extends h {

    /* renamed from: d, reason: collision with root package name */
    private final BigInteger f17130d;

    public j(BigInteger bigInteger, f fVar) {
        super(true, fVar);
        this.f17130d = fVar.validatePrivateScalar(bigInteger);
    }

    public BigInteger getD() {
        return this.f17130d;
    }
}

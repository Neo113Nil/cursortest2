package org.bouncycastle.crypto.params;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class g extends org.bouncycastle.crypto.g {
    private f domainParams;

    public g(f fVar, SecureRandom secureRandom) {
        super(secureRandom, fVar.getN().bitLength());
        this.domainParams = fVar;
    }

    public f getDomainParameters() {
        return this.domainParams;
    }
}

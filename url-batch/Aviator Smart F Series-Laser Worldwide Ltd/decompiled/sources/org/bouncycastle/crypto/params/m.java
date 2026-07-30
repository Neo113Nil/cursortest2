package org.bouncycastle.crypto.params;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class m implements org.bouncycastle.crypto.c {
    private org.bouncycastle.crypto.c parameters;
    private SecureRandom random;

    public m(org.bouncycastle.crypto.c cVar) {
        this(cVar, null);
    }

    public org.bouncycastle.crypto.c getParameters() {
        return this.parameters;
    }

    public SecureRandom getRandom() {
        return this.random;
    }

    public m(org.bouncycastle.crypto.c cVar, SecureRandom secureRandom) {
        this.random = org.bouncycastle.crypto.d.getSecureRandom(secureRandom);
        this.parameters = cVar;
    }
}

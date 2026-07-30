package org.bouncycastle.crypto;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class g {
    private SecureRandom random;
    private int strength;

    public g(SecureRandom secureRandom, int i8) {
        this.random = d.getSecureRandom(secureRandom);
        this.strength = i8;
    }

    public SecureRandom getRandom() {
        return this.random;
    }

    public int getStrength() {
        return this.strength;
    }
}

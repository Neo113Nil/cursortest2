package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.b;
import org.bouncycastle.crypto.g;
import org.bouncycastle.crypto.params.f;
import org.bouncycastle.crypto.params.j;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.h;
import org.bouncycastle.math.ec.k;
import org.bouncycastle.math.ec.x;

/* loaded from: classes5.dex */
public class a implements b, d {
    f params;
    SecureRandom random;

    protected h createBasePointMultiplier() {
        return new k();
    }

    @Override // org.bouncycastle.crypto.b
    public org.bouncycastle.crypto.a generateKeyPair() {
        BigInteger n8 = this.params.getN();
        int bitLength = n8.bitLength();
        int i8 = bitLength >>> 2;
        while (true) {
            BigInteger createRandomBigInteger = org.bouncycastle.util.b.createRandomBigInteger(bitLength, this.random);
            if (createRandomBigInteger.compareTo(d.ONE) >= 0 && createRandomBigInteger.compareTo(n8) < 0 && x.getNafWeight(createRandomBigInteger) >= i8) {
                return new org.bouncycastle.crypto.a((org.bouncycastle.crypto.params.a) new org.bouncycastle.crypto.params.k(createBasePointMultiplier().multiply(this.params.getG(), createRandomBigInteger), this.params), (org.bouncycastle.crypto.params.a) new j(createRandomBigInteger, this.params));
            }
        }
    }

    @Override // org.bouncycastle.crypto.b
    public void init(g gVar) {
        org.bouncycastle.crypto.params.g gVar2 = (org.bouncycastle.crypto.params.g) gVar;
        this.random = gVar2.getRandom();
        this.params = gVar2.getDomainParameters();
    }
}

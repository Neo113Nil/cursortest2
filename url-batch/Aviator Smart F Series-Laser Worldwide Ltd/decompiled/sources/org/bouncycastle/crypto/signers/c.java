package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class c implements b {
    private static final BigInteger ZERO = BigInteger.valueOf(0);

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f17132q;
    private SecureRandom random;

    @Override // org.bouncycastle.crypto.signers.b
    public void init(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        throw new IllegalStateException("Operation not supported");
    }

    @Override // org.bouncycastle.crypto.signers.b
    public boolean isDeterministic() {
        return false;
    }

    @Override // org.bouncycastle.crypto.signers.b
    public BigInteger nextK() {
        int bitLength = this.f17132q.bitLength();
        while (true) {
            BigInteger createRandomBigInteger = org.bouncycastle.util.b.createRandomBigInteger(bitLength, this.random);
            if (!createRandomBigInteger.equals(ZERO) && createRandomBigInteger.compareTo(this.f17132q) < 0) {
                return createRandomBigInteger;
            }
        }
    }

    @Override // org.bouncycastle.crypto.signers.b
    public void init(BigInteger bigInteger, SecureRandom secureRandom) {
        this.f17132q = bigInteger;
        this.random = secureRandom;
    }
}

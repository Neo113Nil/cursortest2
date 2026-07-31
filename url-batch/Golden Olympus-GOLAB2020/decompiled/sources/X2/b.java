package X2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    static final a f9718a = new g(BigInteger.valueOf(2));

    /* renamed from: b, reason: collision with root package name */
    static final a f9719b = new g(BigInteger.valueOf(3));

    public static f a(int[] iArr) {
        if (iArr[0] != 0) {
            throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
        }
        for (int i4 = 1; i4 < iArr.length; i4++) {
            if (iArr[i4] <= iArr[i4 - 1]) {
                throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
            }
        }
        return new d(f9718a, new c(iArr));
    }

    public static a b(BigInteger bigInteger) {
        int bitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || bitLength < 2) {
            throw new IllegalArgumentException("'characteristic' must be >= 2");
        }
        if (bitLength < 3) {
            int intValue = bigInteger.intValue();
            if (intValue == 2) {
                return f9718a;
            }
            if (intValue == 3) {
                return f9719b;
            }
        }
        return new g(bigInteger);
    }
}

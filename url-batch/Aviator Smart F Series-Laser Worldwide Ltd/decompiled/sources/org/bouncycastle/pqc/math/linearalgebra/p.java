package org.bouncycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class p {
    static int nextInt(SecureRandom secureRandom, int i8) {
        int nextInt;
        int i9;
        if (((-i8) & i8) == i8) {
            return (int) ((i8 * (secureRandom.nextInt() >>> 1)) >> 31);
        }
        do {
            nextInt = secureRandom.nextInt() >>> 1;
            i9 = nextInt % i8;
        } while ((nextInt - i9) + (i8 - 1) < 0);
        return i9;
    }
}

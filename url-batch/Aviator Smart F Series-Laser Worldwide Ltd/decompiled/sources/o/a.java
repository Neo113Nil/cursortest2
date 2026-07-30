package o;

import cn.hutool.core.util.i0;
import java.security.SecureRandom;
import java.util.Random;

/* loaded from: classes.dex */
public class a {
    public static final int DEFAULT_SIZE = 21;
    private static final SecureRandom DEFAULT_NUMBER_GENERATOR = i0.getSecureRandom();
    private static final char[] DEFAULT_ALPHABET = "_-0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static String randomNanoId() {
        return randomNanoId(21);
    }

    public static String randomNanoId(int i8) {
        return randomNanoId(null, null, i8);
    }

    public static String randomNanoId(Random random, char[] cArr, int i8) {
        if (random == null) {
            random = DEFAULT_NUMBER_GENERATOR;
        }
        if (cArr == null) {
            cArr = DEFAULT_ALPHABET;
        }
        if (cArr.length == 0 || cArr.length >= 256) {
            throw new IllegalArgumentException("Alphabet must contain between 1 and 255 symbols.");
        }
        if (i8 > 0) {
            int floor = (2 << ((int) Math.floor(Math.log(cArr.length - 1) / Math.log(2.0d)))) - 1;
            int ceil = (int) Math.ceil(((floor * 1.6d) * i8) / cArr.length);
            StringBuilder sb = new StringBuilder();
            while (true) {
                byte[] bArr = new byte[ceil];
                random.nextBytes(bArr);
                for (int i9 = 0; i9 < ceil; i9++) {
                    int i10 = bArr[i9] & floor;
                    if (i10 < cArr.length) {
                        sb.append(cArr[i10]);
                        if (sb.length() == i8) {
                            return sb.toString();
                        }
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Size must be greater than zero.");
        }
    }
}

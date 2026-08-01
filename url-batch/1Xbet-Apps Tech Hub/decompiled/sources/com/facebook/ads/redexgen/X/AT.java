package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class AT extends Exception {
    public static byte[] A01;
    public static String[] A02 = {"LLL1AZ8LOai", "2B7qWnr6lboK1kzNzncdoP0B0brMv5Si", "Q6PB2WDRc4LRgt1IrB9ncLf4ycwP07EY", "7CWVV5CGm74gAvba93StX50LTK78ikzM", "ynv3Ef9TkO7iFkFcQiaLVAQ", "TH7Ylqo7zGIsqo5phZR", "ycuhnMWtVGGkzzPjnxpnYEgK0npEXwg2", "tZyIzHWr5GKf5F95sWHTJWAqY8lomPh4"};
    public final int A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[0].length() == 27) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "6WQS05Wn9adH8q8wYpq1YrK9XoQHj10A";
            strArr[3] = "Vk4pv7cTpcIIvcYbjBZcz8uea28NHwOt";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 95);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-91, -49, -61, -100, -112, -77, -33, -34, -42, -39, -41, -104, -50, 2, -15, -10, -4, -31, -1, -18, -16, -8, -83, -10, -5, -10, 1, -83, -13, -18, -10, -7, -14, -15, -57, -83};
    }

    static {
        A01();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AT(int i, int i2, int i3, int i4) {
        super(r3.append(r1).append(i3).append(r1).append(i4).append(A00(0, 1, 29)).toString());
        StringBuilder append = new StringBuilder().append(A00(12, 24, 46)).append(i).append(A00(3, 9, 17)).append(i2);
        String A00 = A00(1, 2, 68);
        this.A00 = i;
    }
}

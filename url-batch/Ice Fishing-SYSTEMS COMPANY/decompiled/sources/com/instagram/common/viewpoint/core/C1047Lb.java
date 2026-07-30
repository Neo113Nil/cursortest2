package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Lb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1047Lb {
    public static byte[] A00;
    public static String[] A01 = {"tEEVNd46OYTAYJSvyZnVijwEJ9mxfgyG", "BJ13dc7vhZee7KVmjVySYl", "uE9iMCRF0OSjC6XoeKPzOCY04vXFo0vs", "DUz1uNpjuvZzd5dAiuCT4alZ5wEF4BPh", "e8UGMtu5263EOY4JBlmpZ4vkWui3yNma", "jevJBWsVVFh2OOXdK4BBnA9fQcBAm7nu", "BtKAl", "xnRt56CD5b22yVN7z7QNi6lTzhm5niaa"};

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            byte b9 = copyOfRange[i10];
            if (A01[6].length() == 24) {
                throw new RuntimeException();
            }
            A01[5] = "03i3f9u06CqTOPMXzFUkxIwTnPnoVd6c";
            copyOfRange[i10] = (byte) ((b9 ^ i9) ^ 100);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{5};
    }

    static {
        A02();
    }

    private String A01(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        int slashIndex = str.lastIndexOf(47);
        if (lastIndexOf != -1 && lastIndexOf > slashIndex) {
            int dotIndex = lastIndexOf + 2;
            int slashIndex2 = dotIndex + 4;
            int dotIndex2 = str.length();
            if (slashIndex2 > dotIndex2) {
                int slashIndex3 = lastIndexOf + 1;
                int dotIndex3 = str.length();
                return str.substring(slashIndex3, dotIndex3);
            }
        }
        return A00(0, 0, 87);
    }

    public final String A03(String str) {
        String A012 = A01(str);
        String name = C1055Lj.A02(str);
        if (TextUtils.isEmpty(A012)) {
            return name;
        }
        StringBuilder append = new StringBuilder().append(name);
        String extension = A00(0, 1, 79);
        return append.append(extension).append(A012).toString();
    }
}

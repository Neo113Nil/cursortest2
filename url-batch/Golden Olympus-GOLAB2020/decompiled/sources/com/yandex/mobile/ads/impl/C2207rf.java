package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.rf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2207rf {
    public static boolean a(String str) {
        char c4;
        if ("rtsp" == str) {
            return true;
        }
        if (4 != str.length()) {
            return false;
        }
        for (int i4 = 0; i4 < 4; i4++) {
            if ("rtsp".charAt(i4) != str.charAt(i4) && ((c4 = (char) ((r5 | ' ') - 97)) >= 26 || c4 != ((char) ((r6 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static String b(String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i4 < length) {
                    char c4 = charArray[i4];
                    if (c4 >= 'A' && c4 <= 'Z') {
                        charArray[i4] = (char) (c4 ^ ' ');
                    }
                    i4++;
                }
                return String.valueOf(charArray);
            }
            i4++;
        }
        return str;
    }

    public static String c(String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i4 < length) {
                    char c4 = charArray[i4];
                    if (c4 >= 'a' && c4 <= 'z') {
                        charArray[i4] = (char) (c4 ^ ' ');
                    }
                    i4++;
                }
                return String.valueOf(charArray);
            }
            i4++;
        }
        return str;
    }
}

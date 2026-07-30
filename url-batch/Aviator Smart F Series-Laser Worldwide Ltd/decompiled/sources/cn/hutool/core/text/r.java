package cn.hutool.core.text;

import cn.hutool.core.util.c1;
import cn.hutool.core.util.d0;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public class r {
    private static int[][] generateMatrix(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, length + 1, length2 + 1);
        for (int i8 = 1; i8 <= length; i8++) {
            for (int i9 = 1; i9 <= length2; i9++) {
                int i10 = i8 - 1;
                int i11 = i9 - 1;
                if (str.charAt(i10) == str2.charAt(i11)) {
                    iArr[i8][i9] = iArr[i10][i11] + 1;
                } else {
                    int[] iArr2 = iArr[i8];
                    iArr2[i9] = Math.max(iArr2[i11], iArr[i10][i9]);
                }
            }
        }
        return iArr;
    }

    private static boolean isValidChar(char c8) {
        return (c8 >= 19968 && c8 <= 40959) || (c8 >= 'a' && c8 <= 'z') || ((c8 >= 'A' && c8 <= 'Z') || (c8 >= '0' && c8 <= '9'));
    }

    public static String longestCommonSubstring(String str, String str2) {
        int[][] generateMatrix = generateMatrix(str, str2);
        int length = str.length();
        int length2 = str2.length();
        int i8 = generateMatrix[length][length2];
        char[] cArr = new char[i8];
        int i9 = i8 - 1;
        while (true) {
            int[] iArr = generateMatrix[length];
            int i10 = iArr[length2];
            if (i10 == 0) {
                return new String(cArr);
            }
            if (i10 == iArr[length2 - 1]) {
                length2--;
            } else {
                int i11 = length - 1;
                if (i10 != generateMatrix[i11][length2]) {
                    cArr[i9] = str.charAt(i11);
                    i9--;
                    length2--;
                }
                length--;
            }
        }
    }

    private static int longestCommonSubstringLength(String str, String str2) {
        int length = str.length();
        return generateMatrix(str, str2)[length][str2.length()];
    }

    private static String removeSign(String str) {
        int length = str.length();
        StringBuilder builder = c1.builder(length);
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            if (isValidChar(charAt)) {
                builder.append(charAt);
            }
        }
        return builder.toString();
    }

    public static double similar(String str, String str2) {
        String str3;
        String str4;
        if (str.length() < str2.length()) {
            str3 = removeSign(str2);
            str4 = removeSign(str);
        } else {
            String removeSign = removeSign(str);
            String removeSign2 = removeSign(str2);
            str3 = removeSign;
            str4 = removeSign2;
        }
        int max = Math.max(str3.length(), str4.length());
        if (max == 0) {
            return 1.0d;
        }
        return d0.div(longestCommonSubstringLength(str3, str4), max);
    }

    public static String similar(String str, String str2, int i8) {
        return d0.formatPercent(similar(str, str2), i8);
    }
}

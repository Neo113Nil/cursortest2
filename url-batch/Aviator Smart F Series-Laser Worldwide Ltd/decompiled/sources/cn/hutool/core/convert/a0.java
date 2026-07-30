package cn.hutool.core.convert;

import cn.hutool.core.util.c1;
import cn.hutool.core.util.d0;

/* loaded from: classes.dex */
public class a0 {
    private static final String[] NUMBER = {"", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
    private static final String[] NUMBER_TEEN = {"TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"};
    private static final String[] NUMBER_TEN = {"TEN", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"};
    private static final String[] NUMBER_MORE = {"", "THOUSAND", "MILLION", "BILLION"};
    private static final String[] NUMBER_SUFFIX = {com.baidu.ar.k.f2621r, "w", "", "m", "", "", "b", "", "", "t", "", "", "p", "", "", "e"};

    public static String format(Object obj) {
        return obj != null ? format(obj.toString()) : "";
    }

    public static String formatSimple(long j8) {
        return formatSimple(j8, true);
    }

    private static String parseFirst(String str) {
        return NUMBER[Integer.parseInt(str.substring(str.length() - 1))];
    }

    private static String parseMore(int i8) {
        return NUMBER_MORE[i8];
    }

    private static String parseTeen(String str) {
        return NUMBER_TEEN[Integer.parseInt(str) - 10];
    }

    private static String parseTen(String str) {
        return NUMBER_TEN[Integer.parseInt(str.substring(0, 1)) - 1];
    }

    private static String transThree(String str) {
        if (str.startsWith("0")) {
            return transTwo(str.substring(1));
        }
        if (com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN.equals(str.substring(1))) {
            return parseFirst(str.substring(0, 1)) + " HUNDRED";
        }
        return parseFirst(str.substring(0, 1)) + " HUNDRED AND " + transTwo(str.substring(1));
    }

    private static String transTwo(String str) {
        if (str.length() > 2) {
            str = str.substring(0, 2);
        } else if (str.length() < 2) {
            str = "0" + str;
        }
        if (str.startsWith("0")) {
            return parseFirst(str);
        }
        if (str.startsWith("1")) {
            return parseTeen(str);
        }
        if (str.endsWith("0")) {
            return parseTen(str);
        }
        return parseTen(str) + cn.hutool.core.text.l.SPACE + parseFirst(str);
    }

    private static String format(String str) {
        String str2;
        int indexOf = str.indexOf(".");
        if (indexOf > -1) {
            String substring = str.substring(0, indexOf);
            str2 = str.substring(indexOf + 1);
            str = substring;
        } else {
            str2 = "";
        }
        String reverse = c1.reverse(str);
        String[] strArr = new String[5];
        int length = reverse.length() % 3;
        if (length == 1) {
            reverse = reverse + com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN;
        } else if (length == 2) {
            reverse = reverse + "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < reverse.length() / 3; i8++) {
            int i9 = i8 * 3;
            String reverse2 = c1.reverse(reverse.substring(i9, i9 + 3));
            strArr[i8] = reverse2;
            if ("000".equals(reverse2)) {
                sb.append(transThree(strArr[i8]));
            } else if (i8 != 0) {
                sb.insert(0, transThree(strArr[i8]) + cn.hutool.core.text.l.SPACE + parseMore(i8) + cn.hutool.core.text.l.SPACE);
            } else {
                sb = new StringBuilder(transThree(strArr[i8]));
            }
        }
        return sb.toString().trim() + cn.hutool.core.text.l.SPACE + (indexOf > -1 ? "AND CENTS " + transTwo(str2) + cn.hutool.core.text.l.SPACE : "") + "ONLY";
    }

    public static String formatSimple(long j8, boolean z7) {
        if (j8 < 1000) {
            return String.valueOf(j8);
        }
        double d8 = j8;
        int i8 = -1;
        while (d8 > 10.0d && (!z7 || i8 < 1)) {
            if (d8 >= 1000.0d) {
                d8 /= 1000.0d;
                i8++;
            }
            if (d8 > 10.0d) {
                d8 /= 10.0d;
                i8++;
            }
        }
        return String.format("%s%s", d0.decimalFormat(com.moyoung.dafit.module.common.utils.n.TWO_DECIMAL_PATTERN, d8), NUMBER_SUFFIX[i8]);
    }
}

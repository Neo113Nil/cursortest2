package cn.hutool.core.util;

import cn.hutool.core.map.SafeConcurrentHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class q {
    private static final char[] BASE_CODE_ARRAY;
    private static final Map<Character, Integer> CODE_INDEX_MAP;
    public static final Pattern CREDIT_CODE_PATTERN = cn.hutool.core.lang.n0.CREDIT_CODE;
    private static final int[] WEIGHT = {1, 3, 9, 27, 19, 26, 16, 17, 20, 29, 25, 13, 8, 24, 10, 30, 28};

    static {
        char[] charArray = "0123456789ABCDEFGHJKLMNPQRTUWXY".toCharArray();
        BASE_CODE_ARRAY = charArray;
        CODE_INDEX_MAP = new SafeConcurrentHashMap(charArray.length);
        int i8 = 0;
        while (true) {
            char[] cArr = BASE_CODE_ARRAY;
            if (i8 >= cArr.length) {
                return;
            }
            CODE_INDEX_MAP.put(Character.valueOf(cArr[i8]), Integer.valueOf(i8));
            i8++;
        }
    }

    private static int getParityBit(CharSequence charSequence) {
        int i8 = 0;
        for (int i9 = 0; i9 < 17; i9++) {
            Integer num = CODE_INDEX_MAP.get(Character.valueOf(charSequence.charAt(i9)));
            if (num == null) {
                return -1;
            }
            i8 += num.intValue() * WEIGHT[i9];
        }
        int i10 = 31 - (i8 % 31);
        if (i10 == 31) {
            return 0;
        }
        return i10;
    }

    public static boolean isCreditCode(CharSequence charSequence) {
        int parityBit;
        return isCreditCodeSimple(charSequence) && (parityBit = getParityBit(charSequence)) >= 0 && charSequence.charAt(17) == BASE_CODE_ARRAY[parityBit];
    }

    public static boolean isCreditCodeSimple(CharSequence charSequence) {
        if (cn.hutool.core.text.l.isBlank(charSequence)) {
            return false;
        }
        return p0.isMatch(CREDIT_CODE_PATTERN, charSequence);
    }

    public static String randomCreditCode() {
        int i8;
        int i9;
        StringBuilder sb = new StringBuilder(18);
        int i10 = 0;
        while (true) {
            i8 = 2;
            if (i10 >= 2) {
                break;
            }
            sb.append(Character.toUpperCase(BASE_CODE_ARRAY[i0.randomInt(r2.length - 1)]));
            i10++;
        }
        while (true) {
            if (i8 >= 8) {
                break;
            }
            sb.append(BASE_CODE_ARRAY[i0.randomInt(10)]);
            i8++;
        }
        for (i9 = 8; i9 < 17; i9++) {
            sb.append(BASE_CODE_ARRAY[i0.randomInt(r2.length - 1)]);
        }
        String sb2 = sb.toString();
        return sb2 + BASE_CODE_ARRAY[getParityBit(sb2)];
    }
}

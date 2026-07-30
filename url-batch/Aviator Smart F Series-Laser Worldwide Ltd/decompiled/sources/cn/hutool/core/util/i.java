package cn.hutool.core.util;

import cn.hutool.core.collection.CollUtil;
import java.util.Set;

/* loaded from: classes.dex */
public class i {
    private static final Set<String> TRUE_SET = CollUtil.newHashSet("true", "yes", "y", "t", "ok", "1", "on", "是", "对", "真", "對", "√");
    private static final Set<String> FALSE_SET = CollUtil.newHashSet("false", "no", "n", "f", "0", "off", "否", "错", "假", "錯", "×");

    public static boolean and(boolean... zArr) {
        if (g0.isEmpty(zArr)) {
            throw new IllegalArgumentException("The Array must not be empty !");
        }
        for (boolean z7 : zArr) {
            if (!z7) {
                return false;
            }
        }
        return true;
    }

    public static Boolean andOfWrap(Boolean... boolArr) {
        if (h.isEmpty((Object[]) boolArr)) {
            throw new IllegalArgumentException("The Array must not be empty !");
        }
        for (Boolean bool : boolArr) {
            if (isFalse(bool)) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public static boolean isBoolean(Class<?> cls) {
        return cls == Boolean.class || cls == Boolean.TYPE;
    }

    public static boolean isFalse(Boolean bool) {
        return Boolean.FALSE.equals(bool);
    }

    public static boolean isTrue(Boolean bool) {
        return Boolean.TRUE.equals(bool);
    }

    public static boolean negate(boolean z7) {
        return !z7;
    }

    public static boolean or(boolean... zArr) {
        if (g0.isEmpty(zArr)) {
            throw new IllegalArgumentException("The Array must not be empty !");
        }
        for (boolean z7 : zArr) {
            if (z7) {
                return true;
            }
        }
        return false;
    }

    public static Boolean orOfWrap(Boolean... boolArr) {
        if (h.isEmpty((Object[]) boolArr)) {
            throw new IllegalArgumentException("The Array must not be empty !");
        }
        for (Boolean bool : boolArr) {
            if (isTrue(bool)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static boolean toBoolean(String str) {
        if (!cn.hutool.core.text.l.isNotBlank(str)) {
            return false;
        }
        return TRUE_SET.contains(str.trim().toLowerCase());
    }

    public static Boolean toBooleanObject(String str) {
        if (!cn.hutool.core.text.l.isNotBlank(str)) {
            return null;
        }
        String lowerCase = str.trim().toLowerCase();
        if (TRUE_SET.contains(lowerCase)) {
            return Boolean.TRUE;
        }
        if (FALSE_SET.contains(lowerCase)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static byte toByte(boolean z7) {
        return (byte) toInt(z7);
    }

    public static Byte toByteObj(boolean z7) {
        return Byte.valueOf(toByte(z7));
    }

    public static char toChar(boolean z7) {
        return (char) toInt(z7);
    }

    public static Character toCharacter(boolean z7) {
        return Character.valueOf(toChar(z7));
    }

    public static double toDouble(boolean z7) {
        return toInt(z7);
    }

    public static Double toDoubleObj(boolean z7) {
        return Double.valueOf(toDouble(z7));
    }

    public static float toFloat(boolean z7) {
        return toInt(z7);
    }

    public static Float toFloatObj(boolean z7) {
        return Float.valueOf(toFloat(z7));
    }

    public static int toInt(boolean z7) {
        return z7 ? 1 : 0;
    }

    public static Integer toInteger(boolean z7) {
        return Integer.valueOf(toInt(z7));
    }

    public static long toLong(boolean z7) {
        return toInt(z7);
    }

    public static Long toLongObj(boolean z7) {
        return Long.valueOf(toLong(z7));
    }

    public static short toShort(boolean z7) {
        return (short) toInt(z7);
    }

    public static Short toShortObj(boolean z7) {
        return Short.valueOf(toShort(z7));
    }

    public static String toString(boolean z7, String str, String str2) {
        return z7 ? str : str2;
    }

    public static String toStringOnOff(boolean z7) {
        return toString(z7, "on", "off");
    }

    public static String toStringTrueFalse(boolean z7) {
        return toString(z7, "true", "false");
    }

    public static String toStringYesNo(boolean z7) {
        return toString(z7, "yes", "no");
    }

    public static boolean xor(boolean... zArr) {
        if (g0.isEmpty(zArr)) {
            throw new IllegalArgumentException("The Array must not be empty");
        }
        boolean z7 = false;
        for (boolean z8 : zArr) {
            z7 ^= z8;
        }
        return z7;
    }

    public static Boolean xorOfWrap(Boolean... boolArr) {
        if (h.isEmpty((Object[]) boolArr)) {
            throw new IllegalArgumentException("The Array must not be empty !");
        }
        return Boolean.valueOf(xor((boolean[]) cn.hutool.core.convert.d.convert(boolean[].class, (Object) boolArr)));
    }

    public static Boolean negate(Boolean bool) {
        if (bool == null) {
            return null;
        }
        return bool.booleanValue() ? Boolean.FALSE : Boolean.TRUE;
    }

    public static String toString(Boolean bool, String str, String str2, String str3) {
        return bool == null ? str3 : bool.booleanValue() ? str : str2;
    }
}

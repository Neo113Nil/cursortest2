package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import java.util.Locale;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;

/* loaded from: classes9.dex */
public final class CapitalizeDecapitalizeKt {
    public static final String capitalizeAsciiOnly(String str) {
        char charAt;
        str.getClass();
        if (str.length() == 0 || 'a' > (charAt = str.charAt(0)) || charAt >= '{') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toUpperCase(charAt));
        sb.append((CharSequence) str, 1, str.length());
        return sb.toString();
    }

    public static final String decapitalizeAsciiOnly(String str) {
        char charAt;
        str.getClass();
        if (str.length() == 0 || 'A' > (charAt = str.charAt(0)) || charAt >= '[') {
            return str;
        }
        return Character.toLowerCase(charAt) + str.substring(1);
    }

    public static final String decapitalizeSmartForCompiler(String str, boolean z) {
        Object obj;
        String lowerCase;
        str.getClass();
        if (str.length() == 0 || !isUpperCaseCharAt(str, 0, z)) {
            return str;
        }
        if (str.length() == 1 || !isUpperCaseCharAt(str, 1, z)) {
            if (z) {
                return decapitalizeAsciiOnly(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            return Character.toLowerCase(str.charAt(0)) + str.substring(1);
        }
        IntProgressionIterator it = new IntRange(0, str.length() - 1, 1).iterator();
        while (true) {
            if (!it.hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!isUpperCaseCharAt(str, ((Number) obj).intValue(), z)) {
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num == null) {
            if (z) {
                return toLowerCaseAsciiOnly(str);
            }
            String lowerCase2 = str.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            return lowerCase2;
        }
        int intValue = num.intValue() - 1;
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, intValue);
        if (z) {
            lowerCase = toLowerCaseAsciiOnly(substring);
        } else {
            lowerCase = substring.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        }
        sb.append(lowerCase);
        sb.append(str.substring(intValue));
        return sb.toString();
    }

    public static final boolean isUpperCaseCharAt(String str, int i, boolean z) {
        char charAt = str.charAt(i);
        return z ? 'A' <= charAt && charAt < '[' : Character.isUpperCase(charAt);
    }

    public static final String toLowerCaseAsciiOnly(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}

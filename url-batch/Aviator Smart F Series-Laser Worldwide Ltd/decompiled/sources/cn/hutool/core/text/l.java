package cn.hutool.core.text;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.comparator.VersionComparator;
import cn.hutool.core.lang.a0;
import cn.hutool.core.lang.func.Func1;
import cn.hutool.core.text.finder.CharFinder;
import cn.hutool.core.text.finder.StrFinder;
import cn.hutool.core.util.DesensitizedUtil;
import cn.hutool.core.util.d0;
import cn.hutool.core.util.g0;
import cn.hutool.core.util.p0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.MessageFormat;
import java.text.Normalizer;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public class l {
    public static final String EMPTY = "";
    public static final int INDEX_NOT_FOUND = -1;
    public static final String NULL = "null";
    public static final String SPACE = " ";

    public static String addPrefixIfNot(CharSequence charSequence, CharSequence charSequence2) {
        return prependIfMissing(charSequence, charSequence2, charSequence2);
    }

    public static String addSuffixIfNot(CharSequence charSequence, CharSequence charSequence2) {
        return appendIfMissing(charSequence, charSequence2, charSequence2);
    }

    public static String appendIfMissing(CharSequence charSequence, CharSequence charSequence2, CharSequence... charSequenceArr) {
        return appendIfMissing(charSequence, charSequence2, false, charSequenceArr);
    }

    public static String appendIfMissingIgnoreCase(CharSequence charSequence, CharSequence charSequence2, CharSequence... charSequenceArr) {
        return appendIfMissing(charSequence, charSequence2, true, charSequenceArr);
    }

    public static String blankToDefault(CharSequence charSequence, String str) {
        return isBlank(charSequence) ? str : charSequence.toString();
    }

    public static String brief(CharSequence charSequence, int i8) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        if (i8 <= 0 || length <= i8) {
            return charSequence.toString();
        }
        if (i8 == 1) {
            return String.valueOf(charSequence.charAt(0));
        }
        if (i8 == 2) {
            return charSequence.charAt(0) + ".";
        }
        if (i8 == 3) {
            return charSequence.charAt(0) + "." + charSequence.charAt(length - 1);
        }
        if (i8 != 4) {
            int i9 = i8 - 3;
            int i10 = i9 / 2;
            String charSequence2 = charSequence.toString();
            return format("{}...{}", charSequence2.substring(0, (i9 % 2) + i10), charSequence2.substring(length - i10));
        }
        return charSequence.charAt(0) + ".." + charSequence.charAt(length - 1);
    }

    public static StringBuilder builder(CharSequence... charSequenceArr) {
        StringBuilder sb = new StringBuilder();
        for (CharSequence charSequence : charSequenceArr) {
            sb.append(charSequence);
        }
        return sb;
    }

    public static ByteBuffer byteBuffer(CharSequence charSequence, String str) {
        return ByteBuffer.wrap(bytes(charSequence, str));
    }

    public static int byteLength(CharSequence charSequence, Charset charset) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.toString().getBytes(charset).length;
    }

    public static byte[] bytes(CharSequence charSequence) {
        return bytes(charSequence, Charset.defaultCharset());
    }

    public static String center(CharSequence charSequence, int i8) {
        return center(charSequence, i8, ' ');
    }

    public static String cleanBlank(CharSequence charSequence) {
        return filter(charSequence, new a0() { // from class: cn.hutool.core.text.h
            @Override // cn.hutool.core.lang.a0
            public final boolean accept(Object obj) {
                boolean lambda$cleanBlank$0;
                lambda$cleanBlank$0 = l.lambda$cleanBlank$0((Character) obj);
                return lambda$cleanBlank$0;
            }
        });
    }

    public static CharSequence commonPrefix(CharSequence charSequence, CharSequence charSequence2) {
        if (isEmpty(charSequence) || isEmpty(charSequence2)) {
            return "";
        }
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i8 = 0;
        while (i8 < min && charSequence.charAt(i8) == charSequence2.charAt(i8)) {
            i8++;
        }
        return charSequence.subSequence(0, i8);
    }

    public static CharSequence commonSuffix(CharSequence charSequence, CharSequence charSequence2) {
        if (isEmpty(charSequence) || isEmpty(charSequence2)) {
            return "";
        }
        int length = charSequence.length() - 1;
        for (int length2 = charSequence2.length() - 1; length >= 0 && length2 >= 0 && charSequence.charAt(length) == charSequence2.charAt(length2); length2--) {
            length--;
        }
        return charSequence.subSequence(length + 1, charSequence.length());
    }

    public static int compare(CharSequence charSequence, CharSequence charSequence2, boolean z7) {
        if (charSequence == charSequence2) {
            return 0;
        }
        return charSequence == null ? z7 ? -1 : 1 : charSequence2 == null ? z7 ? 1 : -1 : charSequence.toString().compareTo(charSequence2.toString());
    }

    public static int compareIgnoreCase(CharSequence charSequence, CharSequence charSequence2, boolean z7) {
        if (charSequence == charSequence2) {
            return 0;
        }
        return charSequence == null ? z7 ? -1 : 1 : charSequence2 == null ? z7 ? 1 : -1 : charSequence.toString().compareToIgnoreCase(charSequence2.toString());
    }

    public static int compareVersion(CharSequence charSequence, CharSequence charSequence2) {
        return VersionComparator.INSTANCE.compare(str(charSequence), str(charSequence2));
    }

    public static String concat(boolean z7, CharSequence... charSequenceArr) {
        StrBuilder strBuilder = new StrBuilder();
        for (CharSequence charSequence : charSequenceArr) {
            if (z7) {
                charSequence = nullToEmpty(charSequence);
            }
            strBuilder.append(charSequence);
        }
        return strBuilder.toString();
    }

    public static boolean contains(CharSequence charSequence, char c8) {
        return indexOf(charSequence, c8) > -1;
    }

    public static boolean containsAll(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (isBlank(charSequence) || cn.hutool.core.util.h.isEmpty((Object[]) charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence2 : charSequenceArr) {
            if (!contains(charSequence, charSequence2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        return getContainsStr(charSequence, charSequenceArr) != null;
    }

    public static boolean containsAnyIgnoreCase(CharSequence charSequence, CharSequence... charSequenceArr) {
        return getContainsStrIgnoreCase(charSequence, charSequenceArr) != null;
    }

    public static boolean containsBlank(CharSequence charSequence) {
        int length;
        if (charSequence == null || (length = charSequence.length()) == 0) {
            return false;
        }
        for (int i8 = 0; i8 < length; i8++) {
            if (cn.hutool.core.util.k.isBlankChar(charSequence.charAt(i8))) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == null ? charSequence2 == null : indexOfIgnoreCase(charSequence, charSequence2) > -1;
    }

    public static boolean containsOnly(CharSequence charSequence, char... cArr) {
        if (isEmpty(charSequence)) {
            return true;
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!g0.contains(cArr, charSequence.charAt(i8))) {
                return false;
            }
        }
        return true;
    }

    public static int count(CharSequence charSequence, CharSequence charSequence2) {
        int i8 = 0;
        if (hasEmpty(charSequence, charSequence2) || charSequence2.length() > charSequence.length()) {
            return 0;
        }
        String charSequence3 = charSequence.toString();
        String charSequence4 = charSequence2.toString();
        int i9 = 0;
        while (true) {
            int indexOf = charSequence3.indexOf(charSequence4, i8);
            if (indexOf <= -1) {
                return i9;
            }
            i9++;
            i8 = indexOf + charSequence2.length();
        }
    }

    public static String[] cut(CharSequence charSequence, int i8) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        if (length < i8) {
            return new String[]{charSequence.toString()};
        }
        int count = d0.count(length, i8);
        String[] strArr = new String[count];
        String charSequence2 = charSequence.toString();
        int i9 = 0;
        while (i9 < count) {
            int i10 = i9 * i8;
            strArr[i9] = charSequence2.substring(i10, i9 == count + (-1) ? length : i8 + i10);
            i9++;
        }
        return strArr;
    }

    public static String desensitized(CharSequence charSequence, DesensitizedUtil.DesensitizedType desensitizedType) {
        return DesensitizedUtil.desensitized(charSequence, desensitizedType);
    }

    public static String emptyIfNull(CharSequence charSequence) {
        return nullToEmpty(charSequence);
    }

    public static String emptyToDefault(CharSequence charSequence, String str) {
        return isEmpty(charSequence) ? str : charSequence.toString();
    }

    public static String emptyToNull(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return null;
        }
        return charSequence.toString();
    }

    public static boolean endWith(CharSequence charSequence, char c8) {
        return !isEmpty(charSequence) && c8 == charSequence.charAt(charSequence.length() - 1);
    }

    public static boolean endWithAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!isEmpty(charSequence) && !cn.hutool.core.util.h.isEmpty((Object[]) charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (endWith(charSequence, charSequence2, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean endWithAnyIgnoreCase(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!isEmpty(charSequence) && !cn.hutool.core.util.h.isEmpty((Object[]) charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (endWith(charSequence, charSequence2, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean endWithIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return endWith(charSequence, charSequence2, true);
    }

    public static boolean equals(CharSequence charSequence, CharSequence charSequence2) {
        return equals(charSequence, charSequence2, false);
    }

    public static boolean equalsAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        return equalsAny(charSequence, false, charSequenceArr);
    }

    public static boolean equalsAnyIgnoreCase(CharSequence charSequence, CharSequence... charSequenceArr) {
        return equalsAny(charSequence, true, charSequenceArr);
    }

    public static boolean equalsCharAt(CharSequence charSequence, int i8, char c8) {
        return charSequence != null && i8 >= 0 && charSequence.length() > i8 && c8 == charSequence.charAt(i8);
    }

    public static boolean equalsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return equals(charSequence, charSequence2, true);
    }

    public static String filter(CharSequence charSequence, a0 a0Var) {
        if (charSequence == null || a0Var == null) {
            return str(charSequence);
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = charSequence.charAt(i8);
            if (a0Var.accept(Character.valueOf(charAt))) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static <T extends CharSequence> T firstNonBlank(T... tArr) {
        return (T) cn.hutool.core.util.h.firstMatch(new cn.hutool.core.lang.d0() { // from class: cn.hutool.core.text.g
            @Override // cn.hutool.core.lang.d0
            public final boolean match(Object obj) {
                return l.isNotBlank((CharSequence) obj);
            }
        }, tArr);
    }

    public static <T extends CharSequence> T firstNonEmpty(T... tArr) {
        return (T) cn.hutool.core.util.h.firstMatch(new cn.hutool.core.lang.d0() { // from class: cn.hutool.core.text.j
            @Override // cn.hutool.core.lang.d0
            public final boolean match(Object obj) {
                return l.isNotEmpty((CharSequence) obj);
            }
        }, tArr);
    }

    public static <T extends CharSequence> T firstNonNull(T... tArr) {
        return (T) cn.hutool.core.util.h.firstNonNull(tArr);
    }

    public static String fixLength(CharSequence charSequence, char c8, int i8) {
        int length = i8 - charSequence.length();
        if (length <= 0) {
            return charSequence.toString();
        }
        return ((Object) charSequence) + repeat(c8, length);
    }

    public static String format(CharSequence charSequence, Object... objArr) {
        return charSequence == null ? "null" : (cn.hutool.core.util.h.isEmpty(objArr) || isBlank(charSequence)) ? charSequence.toString() : n.format(charSequence.toString(), objArr);
    }

    public static String genGetter(CharSequence charSequence) {
        return upperFirstAndAddPre(charSequence, "get");
    }

    public static String genSetter(CharSequence charSequence) {
        return upperFirstAndAddPre(charSequence, "set");
    }

    public static String getContainsStr(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!isEmpty(charSequence) && !cn.hutool.core.util.h.isEmpty((Object[]) charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (charSequence2 != null && charSequence.toString().contains(charSequence2)) {
                    return charSequence2.toString();
                }
            }
        }
        return null;
    }

    public static String getContainsStrIgnoreCase(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!isEmpty(charSequence) && !cn.hutool.core.util.h.isEmpty((Object[]) charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (containsIgnoreCase(charSequence, charSequence2)) {
                    return charSequence2.toString();
                }
            }
        }
        return null;
    }

    public static String getGeneralField(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.startsWith("get") || charSequence2.startsWith("set")) {
            return removePreAndLowerFirst(charSequence, 3);
        }
        if (charSequence2.startsWith("is")) {
            return removePreAndLowerFirst(charSequence, 2);
        }
        return null;
    }

    public static boolean hasBlank(CharSequence... charSequenceArr) {
        if (cn.hutool.core.util.h.isEmpty((Object[]) charSequenceArr)) {
            return true;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (isBlank(charSequence)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasEmpty(CharSequence... charSequenceArr) {
        if (cn.hutool.core.util.h.isEmpty((Object[]) charSequenceArr)) {
            return true;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (isEmpty(charSequence)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasLetter(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            if (cn.hutool.core.util.k.isLetter(charSequence.charAt(i8))) {
                return true;
            }
        }
        return false;
    }

    public static String hide(CharSequence charSequence, int i8, int i9) {
        return replace(charSequence, i8, i9, '*');
    }

    public static int indexOf(CharSequence charSequence, char c8) {
        return indexOf(charSequence, c8, 0);
    }

    public static int indexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return indexOfIgnoreCase(charSequence, charSequence2, 0);
    }

    public static String indexedFormat(CharSequence charSequence, Object... objArr) {
        return MessageFormat.format(charSequence.toString(), objArr);
    }

    public static boolean isAllBlank(CharSequence... charSequenceArr) {
        if (cn.hutool.core.util.h.isEmpty((Object[]) charSequenceArr)) {
            return true;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (isNotBlank(charSequence)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllCharMatch(CharSequence charSequence, cn.hutool.core.lang.d0 d0Var) {
        if (isBlank(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return true;
            }
        } while (d0Var.match(Character.valueOf(charSequence.charAt(length))));
        return false;
    }

    public static boolean isAllEmpty(CharSequence... charSequenceArr) {
        if (cn.hutool.core.util.h.isEmpty((Object[]) charSequenceArr)) {
            return true;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (isNotEmpty(charSequence)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllNotBlank(CharSequence... charSequenceArr) {
        return !hasBlank(charSequenceArr);
    }

    public static boolean isAllNotEmpty(CharSequence... charSequenceArr) {
        return !hasEmpty(charSequenceArr);
    }

    public static boolean isBlank(CharSequence charSequence) {
        int length;
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i8 = 0; i8 < length; i8++) {
                if (!cn.hutool.core.util.k.isBlankChar(charSequence.charAt(i8))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isBlankOrUndefined(CharSequence charSequence) {
        if (isBlank(charSequence)) {
            return true;
        }
        return isNullOrUndefinedStr(charSequence);
    }

    public static boolean isCharEquals(CharSequence charSequence) {
        cn.hutool.core.lang.q.notEmpty(charSequence, "Str to check must be not empty!", new Object[0]);
        return count(charSequence, charSequence.charAt(0)) == charSequence.length();
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isEmptyOrUndefined(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return true;
        }
        return isNullOrUndefinedStr(charSequence);
    }

    public static boolean isLowerCase(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (Character.isUpperCase(charSequence.charAt(i8))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNotBlank(CharSequence charSequence) {
        return !isBlank(charSequence);
    }

    public static boolean isNotEmpty(CharSequence charSequence) {
        return !isEmpty(charSequence);
    }

    public static boolean isNullOrUndefined(CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        return isNullOrUndefinedStr(charSequence);
    }

    private static boolean isNullOrUndefinedStr(CharSequence charSequence) {
        String trim = charSequence.toString().trim();
        return "null".equals(trim) || "undefined".equals(trim);
    }

    public static boolean isNumeric(CharSequence charSequence) {
        return isAllCharMatch(charSequence, new cn.hutool.core.lang.d0() { // from class: cn.hutool.core.text.f
            @Override // cn.hutool.core.lang.d0
            public final boolean match(Object obj) {
                return Character.isDigit(((Character) obj).charValue());
            }
        });
    }

    public static boolean isSubEquals(CharSequence charSequence, int i8, CharSequence charSequence2, boolean z7) {
        return isSubEquals(charSequence, i8, charSequence2, 0, charSequence2.length(), z7);
    }

    public static boolean isSurround(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        if (isBlank(charSequence) || charSequence.length() < charSequence2.length() + charSequence3.length()) {
            return false;
        }
        String charSequence4 = charSequence.toString();
        return charSequence4.startsWith(charSequence2.toString()) && charSequence4.endsWith(charSequence3.toString());
    }

    public static boolean isUpperCase(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (Character.isLowerCase(charSequence.charAt(i8))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isWrap(CharSequence charSequence, String str, String str2) {
        if (cn.hutool.core.util.h.hasNull(charSequence, str, str2)) {
            return false;
        }
        String charSequence2 = charSequence.toString();
        return charSequence2.startsWith(str) && charSequence2.endsWith(str2);
    }

    public static String join(CharSequence charSequence, Object... objArr) {
        return cn.hutool.core.util.h.join(objArr, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$cleanBlank$0(Character ch) {
        return !cn.hutool.core.util.k.isBlankChar(ch.charValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$subByCodePoint$1(StringBuilder sb, int i8) {
        sb.append(Character.toChars(i8));
    }

    public static int lastIndexOf(CharSequence charSequence, CharSequence charSequence2, int i8, boolean z7) {
        return (isEmpty(charSequence) || isEmpty(charSequence2)) ? equals(charSequence, charSequence2) ? 0 : -1 : new StrFinder(charSequence2, z7).setText(charSequence).setNegative(true).start(i8);
    }

    public static int lastIndexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return lastIndexOfIgnoreCase(charSequence, charSequence2, charSequence.length());
    }

    public static int length(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static String lowerFirst(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() > 0) {
            char charAt = charSequence.charAt(0);
            if (Character.isUpperCase(charAt)) {
                return Character.toLowerCase(charAt) + subSuf(charSequence, 1);
            }
        }
        return charSequence.toString();
    }

    public static String maxLength(CharSequence charSequence, int i8) {
        cn.hutool.core.lang.q.isTrue(i8 > 0);
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() <= i8) {
            return charSequence.toString();
        }
        return sub(charSequence, 0, i8) + "...";
    }

    public static String move(CharSequence charSequence, int i8, int i9, int i10) {
        if (isEmpty(charSequence)) {
            return str(charSequence);
        }
        int length = charSequence.length();
        if (Math.abs(i10) > length) {
            i10 %= length;
        }
        StringBuilder sb = new StringBuilder(length);
        if (i10 > 0) {
            int min = Math.min(i10 + i9, charSequence.length());
            sb.append(charSequence.subSequence(0, i8));
            sb.append(charSequence.subSequence(i9, min));
            sb.append(charSequence.subSequence(i8, i9));
            sb.append(charSequence.subSequence(min, charSequence.length()));
        } else {
            if (i10 >= 0) {
                return str(charSequence);
            }
            int max = Math.max(i10 + i8, 0);
            sb.append(charSequence.subSequence(0, max));
            sb.append(charSequence.subSequence(i8, i9));
            sb.append(charSequence.subSequence(max, i8));
            sb.append(charSequence.subSequence(i9, charSequence.length()));
        }
        return sb.toString();
    }

    public static String normalize(CharSequence charSequence) {
        return Normalizer.normalize(charSequence, Normalizer.Form.NFC);
    }

    public static String nullToDefault(CharSequence charSequence, String str) {
        return charSequence == null ? str : charSequence.toString();
    }

    public static String nullToEmpty(CharSequence charSequence) {
        return nullToDefault(charSequence, "");
    }

    public static int ordinalIndexOf(CharSequence charSequence, CharSequence charSequence2, int i8) {
        int i9 = -1;
        if (charSequence != null && charSequence2 != null && i8 > 0) {
            if (charSequence2.length() == 0) {
                return 0;
            }
            int i10 = 0;
            do {
                i9 = indexOf(charSequence, charSequence2, i9 + 1, false);
                if (i9 < 0) {
                    return i9;
                }
                i10++;
            } while (i10 < i8);
        }
        return i9;
    }

    public static String padAfter(CharSequence charSequence, int i8, char c8) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        return length == i8 ? charSequence.toString() : length > i8 ? sub(charSequence, length - i8, length) : charSequence.toString().concat(repeat(c8, i8 - length));
    }

    public static String padPre(CharSequence charSequence, int i8, CharSequence charSequence2) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        return length == i8 ? charSequence.toString() : length > i8 ? subPre(charSequence, i8) : repeatByLength(charSequence2, i8 - length).concat(charSequence.toString());
    }

    public static String prependIfMissing(CharSequence charSequence, CharSequence charSequence2, CharSequence... charSequenceArr) {
        return prependIfMissing(charSequence, charSequence2, false, charSequenceArr);
    }

    public static String prependIfMissingIgnoreCase(CharSequence charSequence, CharSequence charSequence2, CharSequence... charSequenceArr) {
        return prependIfMissing(charSequence, charSequence2, true, charSequenceArr);
    }

    public static String removeAll(CharSequence charSequence, CharSequence charSequence2) {
        return (isEmpty(charSequence) || isEmpty(charSequence2)) ? str(charSequence) : charSequence.toString().replace(charSequence2, "");
    }

    public static String removeAllLineBreaks(CharSequence charSequence) {
        return removeAll(charSequence, '\r', '\n');
    }

    public static String removeAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        String str = str(charSequence);
        if (isNotEmpty(charSequence)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                str = removeAll(str, charSequence2);
            }
        }
        return str;
    }

    public static String removePreAndLowerFirst(CharSequence charSequence, int i8) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() <= i8) {
            return charSequence.toString();
        }
        char lowerCase = Character.toLowerCase(charSequence.charAt(i8));
        int i9 = i8 + 1;
        if (charSequence.length() <= i9) {
            return String.valueOf(lowerCase);
        }
        return lowerCase + charSequence.toString().substring(i9);
    }

    public static String removePrefix(CharSequence charSequence, CharSequence charSequence2) {
        if (isEmpty(charSequence) || isEmpty(charSequence2)) {
            return str(charSequence);
        }
        String charSequence3 = charSequence.toString();
        return charSequence3.startsWith(charSequence2.toString()) ? subSuf(charSequence3, charSequence2.length()) : charSequence3;
    }

    public static String removePrefixIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        if (isEmpty(charSequence) || isEmpty(charSequence2)) {
            return str(charSequence);
        }
        String charSequence3 = charSequence.toString();
        return startWithIgnoreCase(charSequence, charSequence2) ? subSuf(charSequence3, charSequence2.length()) : charSequence3;
    }

    public static String removeSufAndLowerFirst(CharSequence charSequence, CharSequence charSequence2) {
        return lowerFirst(removeSuffix(charSequence, charSequence2));
    }

    public static String removeSuffix(CharSequence charSequence, CharSequence charSequence2) {
        if (isEmpty(charSequence) || isEmpty(charSequence2)) {
            return str(charSequence);
        }
        String charSequence3 = charSequence.toString();
        return charSequence3.endsWith(charSequence2.toString()) ? subPre(charSequence3, charSequence3.length() - charSequence2.length()) : charSequence3;
    }

    public static String removeSuffixIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        if (isEmpty(charSequence) || isEmpty(charSequence2)) {
            return str(charSequence);
        }
        String charSequence3 = charSequence.toString();
        return endWithIgnoreCase(charSequence, charSequence2) ? subPre(charSequence3, charSequence3.length() - charSequence2.length()) : charSequence3;
    }

    public static String repeat(char c8, int i8) {
        if (i8 <= 0) {
            return "";
        }
        char[] cArr = new char[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            cArr[i9] = c8;
        }
        return new String(cArr);
    }

    public static String repeatAndJoin(CharSequence charSequence, int i8, CharSequence charSequence2) {
        if (i8 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i8);
        sb.append(charSequence);
        int i9 = i8 - 1;
        boolean isNotEmpty = isNotEmpty(charSequence2);
        while (true) {
            int i10 = i9 - 1;
            if (i9 <= 0) {
                return sb.toString();
            }
            if (isNotEmpty) {
                sb.append(charSequence2);
            }
            sb.append(charSequence);
            i9 = i10;
        }
    }

    public static String repeatByLength(CharSequence charSequence, int i8) {
        if (charSequence == null) {
            return null;
        }
        if (i8 <= 0) {
            return "";
        }
        int length = charSequence.length();
        if (length == i8) {
            return charSequence.toString();
        }
        if (length > i8) {
            return subPre(charSequence, i8);
        }
        char[] cArr = new char[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            cArr[i9] = charSequence.charAt(i9 % length);
        }
        return new String(cArr);
    }

    public static String replace(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return replace(charSequence, 0, charSequence2, charSequence3, false);
    }

    public static String replaceChars(CharSequence charSequence, String str, CharSequence charSequence2) {
        return (isEmpty(charSequence) || isEmpty(str)) ? str(charSequence) : replaceChars(charSequence, str.toCharArray(), charSequence2);
    }

    public static String replaceFirst(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return replaceFirst(charSequence, charSequence2, charSequence3, false);
    }

    public static String replaceIgnoreCase(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return replace(charSequence, 0, charSequence2, charSequence3, true);
    }

    public static String replaceLast(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return replaceLast(charSequence, charSequence2, charSequence3, false);
    }

    public static List<String> split(CharSequence charSequence, char c8) {
        return split(charSequence, c8, 0);
    }

    public static String[] splitToArray(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == null ? new String[0] : q.splitToArray((CharSequence) charSequence.toString(), str(charSequence2), 0, false, false);
    }

    public static int[] splitToInt(CharSequence charSequence, char c8) {
        return (int[]) cn.hutool.core.convert.d.convert(int[].class, (Object) splitTrim(charSequence, c8));
    }

    public static long[] splitToLong(CharSequence charSequence, char c8) {
        return (long[]) cn.hutool.core.convert.d.convert(long[].class, (Object) splitTrim(charSequence, c8));
    }

    public static List<String> splitTrim(CharSequence charSequence, char c8) {
        return splitTrim(charSequence, c8, -1);
    }

    public static boolean startWith(CharSequence charSequence, char c8) {
        return !isEmpty(charSequence) && c8 == charSequence.charAt(0);
    }

    public static boolean startWithAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!isEmpty(charSequence) && !cn.hutool.core.util.h.isEmpty((Object[]) charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (startWith(charSequence, charSequence2, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean startWithAnyIgnoreCase(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!isEmpty(charSequence) && !cn.hutool.core.util.h.isEmpty((Object[]) charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (startWith(charSequence, charSequence2, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean startWithIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return startWith(charSequence, charSequence2, true);
    }

    public static boolean startWithIgnoreEquals(CharSequence charSequence, CharSequence charSequence2) {
        return startWith(charSequence, charSequence2, false, true);
    }

    public static String str(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    public static StrBuilder strBuilder(CharSequence... charSequenceArr) {
        return StrBuilder.create(charSequenceArr);
    }

    public static String strip(CharSequence charSequence, CharSequence charSequence2) {
        return equals(charSequence, charSequence2) ? "" : strip(charSequence, charSequence2, charSequence2);
    }

    public static String stripIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return stripIgnoreCase(charSequence, charSequence2, charSequence2);
    }

    public static String sub(CharSequence charSequence, int i8, int i9) {
        if (isEmpty(charSequence)) {
            return str(charSequence);
        }
        int length = charSequence.length();
        if (i8 < 0) {
            i8 += length;
            if (i8 < 0) {
                i8 = 0;
            }
        } else if (i8 > length) {
            i8 = length;
        }
        if (i9 >= 0 ? i9 > length : (i9 = i9 + length) < 0) {
            i9 = length;
        }
        if (i9 < i8) {
            int i10 = i9;
            i9 = i8;
            i8 = i10;
        }
        return i8 == i9 ? "" : charSequence.toString().substring(i8, i9);
    }

    public static String subAfter(CharSequence charSequence, CharSequence charSequence2, boolean z7) {
        if (isEmpty(charSequence)) {
            if (charSequence == null) {
                return null;
            }
            return "";
        }
        if (charSequence2 == null) {
            return "";
        }
        String charSequence3 = charSequence.toString();
        String charSequence4 = charSequence2.toString();
        int lastIndexOf = z7 ? charSequence3.lastIndexOf(charSequence4) : charSequence3.indexOf(charSequence4);
        return (-1 == lastIndexOf || charSequence.length() + (-1) == lastIndexOf) ? "" : charSequence3.substring(lastIndexOf + charSequence2.length());
    }

    public static String subBefore(CharSequence charSequence, CharSequence charSequence2, boolean z7) {
        if (isEmpty(charSequence) || charSequence2 == null) {
            if (charSequence == null) {
                return null;
            }
            return charSequence.toString();
        }
        String charSequence3 = charSequence.toString();
        String charSequence4 = charSequence2.toString();
        if (charSequence4.isEmpty()) {
            return "";
        }
        int lastIndexOf = z7 ? charSequence3.lastIndexOf(charSequence4) : charSequence3.indexOf(charSequence4);
        return -1 == lastIndexOf ? charSequence3 : lastIndexOf == 0 ? "" : charSequence3.substring(0, lastIndexOf);
    }

    public static String subBetween(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        int indexOf;
        if (charSequence != null && charSequence2 != null && charSequence3 != null) {
            String charSequence4 = charSequence.toString();
            String charSequence5 = charSequence2.toString();
            String charSequence6 = charSequence3.toString();
            int indexOf2 = charSequence4.indexOf(charSequence5);
            if (indexOf2 != -1 && (indexOf = charSequence4.indexOf(charSequence6, charSequence5.length() + indexOf2)) != -1) {
                return charSequence4.substring(indexOf2 + charSequence5.length(), indexOf);
            }
        }
        return null;
    }

    public static String[] subBetweenAll(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        int i8 = 1;
        if (hasEmpty(charSequence, charSequence2, charSequence3) || !contains(charSequence, charSequence2)) {
            return new String[0];
        }
        LinkedList linkedList = new LinkedList();
        String[] splitToArray = splitToArray(charSequence, charSequence2);
        if (charSequence2.equals(charSequence3)) {
            int length = splitToArray.length - 1;
            while (i8 < length) {
                linkedList.add(splitToArray[i8]);
                i8 += 2;
            }
        } else {
            while (i8 < splitToArray.length) {
                String str = splitToArray[i8];
                int indexOf = str.indexOf(charSequence3.toString());
                if (indexOf > 0) {
                    linkedList.add(str.substring(0, indexOf));
                }
                i8++;
            }
        }
        return (String[]) linkedList.toArray(new String[0]);
    }

    public static String subByCodePoint(CharSequence charSequence, int i8, int i9) {
        IntStream codePoints;
        IntStream skip;
        IntStream limit;
        if (isEmpty(charSequence)) {
            return str(charSequence);
        }
        if (i8 < 0 || i8 > i9) {
            throw new IllegalArgumentException();
        }
        if (i8 == i9) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        codePoints = charSequence.toString().codePoints();
        skip = codePoints.skip(i8);
        limit = skip.limit(i9 - i8);
        limit.forEach(new IntConsumer() { // from class: cn.hutool.core.text.k
            @Override // java.util.function.IntConsumer
            public final void accept(int i10) {
                l.lambda$subByCodePoint$1(sb, i10);
            }
        });
        return sb.toString();
    }

    public static String subPre(CharSequence charSequence, int i8) {
        return sub(charSequence, 0, i8);
    }

    public static String subPreGbk(CharSequence charSequence, int i8, CharSequence charSequence2) {
        return subPreGbk(charSequence, i8, true) + ((Object) charSequence2);
    }

    public static String subSuf(CharSequence charSequence, int i8) {
        if (isEmpty(charSequence)) {
            return null;
        }
        return sub(charSequence, i8, charSequence.length());
    }

    public static String subSufByLength(CharSequence charSequence, int i8) {
        if (isEmpty(charSequence)) {
            return null;
        }
        return i8 <= 0 ? "" : sub(charSequence, -i8, charSequence.length());
    }

    public static String subWithLength(String str, int i8, int i9) {
        return sub(str, i8, i8 < 0 ? i8 - i9 : i9 + i8);
    }

    public static String swapCase(String str) {
        if (isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i8 = 0; i8 < charArray.length; i8++) {
            char c8 = charArray[i8];
            if (Character.isUpperCase(c8)) {
                charArray[i8] = Character.toLowerCase(c8);
            } else if (Character.isTitleCase(c8)) {
                charArray[i8] = Character.toLowerCase(c8);
            } else if (Character.isLowerCase(c8)) {
                charArray[i8] = Character.toUpperCase(c8);
            }
        }
        return new String(charArray);
    }

    public static String toCamelCase(CharSequence charSequence) {
        return m.toCamelCase(charSequence);
    }

    public static String toSymbolCase(CharSequence charSequence, char c8) {
        return m.toSymbolCase(charSequence, c8);
    }

    public static String toUnderlineCase(CharSequence charSequence) {
        return m.toUnderlineCase(charSequence);
    }

    public static int totalLength(CharSequence... charSequenceArr) {
        int length = charSequenceArr.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            CharSequence charSequence = charSequenceArr[i9];
            i8 += charSequence == null ? 0 : charSequence.length();
        }
        return i8;
    }

    public static String trim(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return trim(charSequence, 0);
    }

    public static String trimEnd(CharSequence charSequence) {
        return trim(charSequence, 1);
    }

    public static String trimStart(CharSequence charSequence) {
        return trim(charSequence, -1);
    }

    public static String trimToEmpty(CharSequence charSequence) {
        return charSequence == null ? "" : trim(charSequence);
    }

    public static String trimToNull(CharSequence charSequence) {
        String trim = trim(charSequence);
        if ("".equals(trim)) {
            return null;
        }
        return trim;
    }

    public static String unWrap(CharSequence charSequence, String str, String str2) {
        return isWrap(charSequence, str, str2) ? sub(charSequence, str.length(), charSequence.length() - str2.length()) : charSequence.toString();
    }

    public static String upperFirst(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() > 0) {
            char charAt = charSequence.charAt(0);
            if (Character.isLowerCase(charAt)) {
                return Character.toUpperCase(charAt) + subSuf(charSequence, 1);
            }
        }
        return charSequence.toString();
    }

    public static String upperFirstAndAddPre(CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return null;
        }
        return str + upperFirst(charSequence);
    }

    public static byte[] utf8Bytes(CharSequence charSequence) {
        return bytes(charSequence, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static String wrap(CharSequence charSequence, CharSequence charSequence2) {
        return wrap(charSequence, charSequence2, charSequence2);
    }

    public static String[] wrapAll(CharSequence charSequence, CharSequence charSequence2, CharSequence... charSequenceArr) {
        String[] strArr = new String[charSequenceArr.length];
        for (int i8 = 0; i8 < charSequenceArr.length; i8++) {
            strArr[i8] = wrap(charSequenceArr[i8], charSequence, charSequence2);
        }
        return strArr;
    }

    public static String[] wrapAllIfMissing(CharSequence charSequence, CharSequence charSequence2, CharSequence... charSequenceArr) {
        String[] strArr = new String[charSequenceArr.length];
        for (int i8 = 0; i8 < charSequenceArr.length; i8++) {
            strArr[i8] = wrapIfMissing(charSequenceArr[i8], charSequence, charSequence2);
        }
        return strArr;
    }

    public static String[] wrapAllWithPair(CharSequence charSequence, CharSequence... charSequenceArr) {
        return wrapAll(charSequence, charSequence, charSequenceArr);
    }

    public static String[] wrapAllWithPairIfMissing(CharSequence charSequence, CharSequence... charSequenceArr) {
        return wrapAllIfMissing(charSequence, charSequence, charSequenceArr);
    }

    public static String wrapIfMissing(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        int length = isNotEmpty(charSequence) ? charSequence.length() : 0;
        if (isNotEmpty(charSequence2)) {
            length += charSequence2.length();
        }
        if (isNotEmpty(charSequence3)) {
            length += charSequence3.length();
        }
        StringBuilder sb = new StringBuilder(length);
        if (isNotEmpty(charSequence2) && !startWith(charSequence, charSequence2)) {
            sb.append(charSequence2);
        }
        if (isNotEmpty(charSequence)) {
            sb.append(charSequence);
        }
        if (isNotEmpty(charSequence3) && !endWith(charSequence, charSequence3)) {
            sb.append(charSequence3);
        }
        return sb.toString();
    }

    public static String appendIfMissing(CharSequence charSequence, CharSequence charSequence2, boolean z7, CharSequence... charSequenceArr) {
        if (charSequence == null || isEmpty(charSequence2) || endWith(charSequence, charSequence2, z7)) {
            return str(charSequence);
        }
        if (cn.hutool.core.util.h.isNotEmpty((Object[]) charSequenceArr)) {
            for (CharSequence charSequence3 : charSequenceArr) {
                if (endWith(charSequence, charSequence3, z7)) {
                    return charSequence.toString();
                }
            }
        }
        return charSequence.toString().concat(charSequence2.toString());
    }

    public static byte[] bytes(CharSequence charSequence, String str) {
        return bytes(charSequence, isBlank(str) ? Charset.defaultCharset() : Charset.forName(str));
    }

    public static String center(CharSequence charSequence, int i8, char c8) {
        if (charSequence == null || i8 <= 0) {
            return str(charSequence);
        }
        int length = charSequence.length();
        int i9 = i8 - length;
        return i9 <= 0 ? charSequence.toString() : padAfter(padPre(charSequence, length + (i9 / 2), c8), i8, c8).toString();
    }

    public static boolean contains(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return false;
        }
        return charSequence.toString().contains(charSequence2);
    }

    public static boolean containsAny(CharSequence charSequence, char... cArr) {
        if (!isEmpty(charSequence)) {
            int length = charSequence.length();
            for (int i8 = 0; i8 < length; i8++) {
                if (g0.contains(cArr, charSequence.charAt(i8))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean equals(CharSequence charSequence, CharSequence charSequence2, boolean z7) {
        if (charSequence == null) {
            return charSequence2 == null;
        }
        if (charSequence2 == null) {
            return false;
        }
        return z7 ? charSequence.toString().equalsIgnoreCase(charSequence2.toString()) : charSequence.toString().contentEquals(charSequence2);
    }

    public static boolean equalsAny(CharSequence charSequence, boolean z7, CharSequence... charSequenceArr) {
        if (cn.hutool.core.util.h.isEmpty((Object[]) charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence2 : charSequenceArr) {
            if (equals(charSequence, charSequence2, z7)) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(CharSequence charSequence, char c8, int i8) {
        return charSequence instanceof String ? ((String) charSequence).indexOf(c8, i8) : indexOf(charSequence, c8, i8, -1);
    }

    public static int indexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2, int i8) {
        return indexOf(charSequence, charSequence2, i8, true);
    }

    public static boolean isSubEquals(CharSequence charSequence, int i8, CharSequence charSequence2, int i9, int i10, boolean z7) {
        if (charSequence == null || charSequence2 == null) {
            return false;
        }
        return charSequence.toString().regionMatches(z7, i8, charSequence2.toString(), i9, i10);
    }

    public static <T> String join(CharSequence charSequence, Iterable<T> iterable) {
        return CollUtil.join(iterable, charSequence);
    }

    public static int lastIndexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2, int i8) {
        return lastIndexOf(charSequence, charSequence2, i8, true);
    }

    public static String prependIfMissing(CharSequence charSequence, CharSequence charSequence2, boolean z7, CharSequence... charSequenceArr) {
        if (charSequence == null || isEmpty(charSequence2) || startWith(charSequence, charSequence2, z7)) {
            return str(charSequence);
        }
        if (charSequenceArr != null && charSequenceArr.length > 0) {
            for (CharSequence charSequence3 : charSequenceArr) {
                if (startWith(charSequence, charSequence3, z7)) {
                    return charSequence.toString();
                }
            }
        }
        return charSequence2.toString().concat(charSequence.toString());
    }

    public static String replace(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z7) {
        return replace(charSequence, 0, charSequence2, charSequence3, z7);
    }

    public static String replaceFirst(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z7) {
        if (isEmpty(charSequence)) {
            return str(charSequence);
        }
        int indexOf = indexOf(charSequence, charSequence2, 0, z7);
        return -1 == indexOf ? str(charSequence) : replace(charSequence, indexOf, charSequence2.length() + indexOf, charSequence3);
    }

    public static String replaceLast(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z7) {
        if (isEmpty(charSequence)) {
            return str(charSequence);
        }
        int lastIndexOf = lastIndexOf(charSequence, charSequence2, charSequence.length(), z7);
        return -1 == lastIndexOf ? str(charSequence) : replace(charSequence, lastIndexOf, charSequence2, charSequence3, z7);
    }

    public static List<String> split(CharSequence charSequence, char c8, int i8) {
        return split(charSequence, c8, i8, false, false);
    }

    public static String[] splitToArray(CharSequence charSequence, char c8) {
        return splitToArray(charSequence, c8, 0);
    }

    public static int[] splitToInt(CharSequence charSequence, CharSequence charSequence2) {
        return (int[]) cn.hutool.core.convert.d.convert(int[].class, (Object) splitTrim(charSequence, charSequence2));
    }

    public static long[] splitToLong(CharSequence charSequence, CharSequence charSequence2) {
        return (long[]) cn.hutool.core.convert.d.convert(long[].class, (Object) splitTrim(charSequence, charSequence2));
    }

    public static List<String> splitTrim(CharSequence charSequence, CharSequence charSequence2) {
        return splitTrim(charSequence, charSequence2, -1);
    }

    public static String stripIgnoreCase(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        if (isEmpty(charSequence)) {
            return str(charSequence);
        }
        int length = charSequence.length();
        String charSequence4 = charSequence.toString();
        int length2 = startWithIgnoreCase(charSequence4, charSequence2) ? charSequence2.length() : 0;
        if (endWithIgnoreCase(charSequence4, charSequence3)) {
            length -= charSequence3.length();
        }
        return charSequence4.substring(length2, length);
    }

    public static String subPreGbk(CharSequence charSequence, int i8, boolean z7) {
        if (isEmpty(charSequence)) {
            return str(charSequence);
        }
        byte[] bytes = bytes(charSequence, cn.hutool.core.util.l.CHARSET_GBK);
        if (bytes.length <= i8) {
            return charSequence.toString();
        }
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            if (bytes[i10] < 0) {
                i9++;
            }
        }
        if (i9 % 2 != 0) {
            i8 = z7 ? i8 + 1 : i8 - 1;
        }
        return new String(bytes, 0, i8, cn.hutool.core.util.l.CHARSET_GBK);
    }

    public static String toCamelCase(CharSequence charSequence, char c8) {
        return m.toCamelCase(charSequence, c8);
    }

    public static String trim(CharSequence charSequence, int i8) {
        return trim(charSequence, i8, new Predicate() { // from class: cn.hutool.core.text.i
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cn.hutool.core.util.k.isBlankChar(((Character) obj).charValue());
            }
        });
    }

    public static String wrap(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return nullToEmpty(charSequence2).concat(nullToEmpty(charSequence)).concat(nullToEmpty(charSequence3));
    }

    public static byte[] bytes(CharSequence charSequence, Charset charset) {
        if (charSequence == null) {
            return null;
        }
        if (charset == null) {
            return charSequence.toString().getBytes();
        }
        return charSequence.toString().getBytes(charset);
    }

    public static boolean endWith(CharSequence charSequence, CharSequence charSequence2, boolean z7) {
        return endWith(charSequence, charSequence2, z7, false);
    }

    public static String replace(CharSequence charSequence, int i8, CharSequence charSequence2, CharSequence charSequence3, boolean z7) {
        if (!isEmpty(charSequence) && !isEmpty(charSequence2)) {
            if (charSequence3 == null) {
                charSequence3 = "";
            }
            int length = charSequence.length();
            int length2 = charSequence2.length();
            if (length < length2) {
                return str(charSequence);
            }
            if (i8 > length) {
                return str(charSequence);
            }
            if (i8 < 0) {
                i8 = 0;
            }
            StringBuilder sb = new StringBuilder((length - length2) + charSequence3.length());
            if (i8 != 0) {
                sb.append(charSequence.subSequence(0, i8));
            }
            while (true) {
                int indexOf = indexOf(charSequence, charSequence2, i8, z7);
                if (indexOf <= -1) {
                    break;
                }
                sb.append(charSequence.subSequence(i8, indexOf));
                sb.append(charSequence3);
                i8 = indexOf + length2;
            }
            if (i8 < length) {
                sb.append(charSequence.subSequence(i8, length));
            }
            return sb.toString();
        }
        return str(charSequence);
    }

    public static List<String> split(CharSequence charSequence, char c8, boolean z7, boolean z8) {
        return split(charSequence, c8, 0, z7, z8);
    }

    public static String[] splitToArray(CharSequence charSequence, char c8, int i8) {
        cn.hutool.core.lang.q.notNull(charSequence, "Text must be not null!", new Object[0]);
        return q.splitToArray((CharSequence) charSequence.toString(), c8, i8, false, false);
    }

    public static List<String> splitTrim(CharSequence charSequence, char c8, int i8) {
        return split(charSequence, c8, i8, true, true);
    }

    public static boolean startWith(CharSequence charSequence, CharSequence charSequence2, boolean z7) {
        return startWith(charSequence, charSequence2, z7, false);
    }

    public static String strip(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        if (isEmpty(charSequence)) {
            return str(charSequence);
        }
        int length = charSequence.length();
        String charSequence4 = charSequence.toString();
        int length2 = startWith(charSequence4, charSequence2) ? charSequence2.length() : 0;
        if (endWith(charSequence4, charSequence3)) {
            length -= charSequence3.length();
        }
        return charSequence4.substring(Math.min(length2, length), Math.max(length2, length));
    }

    public static String trim(CharSequence charSequence, int i8, Predicate<Character> predicate) {
        int i9;
        boolean test;
        boolean test2;
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        int i10 = 0;
        if (i8 <= 0) {
            while (i10 < length) {
                test2 = predicate.test(Character.valueOf(charSequence.charAt(i10)));
                if (!test2) {
                    break;
                }
                i10++;
            }
        }
        if (i8 >= 0) {
            i9 = length;
            while (i10 < i9) {
                test = predicate.test(Character.valueOf(charSequence.charAt(i9 - 1)));
                if (!test) {
                    break;
                }
                i9--;
            }
        } else {
            i9 = length;
        }
        if (i10 <= 0 && i9 >= length) {
            return charSequence.toString();
        }
        return charSequence.toString().substring(i10, i9);
    }

    public static boolean endWith(CharSequence charSequence, CharSequence charSequence2, boolean z7, boolean z8) {
        if (charSequence == null || charSequence2 == null) {
            return !z8 && charSequence == null && charSequence2 == null;
        }
        if (charSequence.toString().regionMatches(z7, charSequence.length() - charSequence2.length(), charSequence2.toString(), 0, charSequence2.length())) {
            return (z8 && equals(charSequence, charSequence2, z7)) ? false : true;
        }
        return false;
    }

    public static boolean isWrap(CharSequence charSequence, String str) {
        return isWrap(charSequence, str, str);
    }

    public static String removeAll(CharSequence charSequence, char... cArr) {
        if (charSequence != null && !g0.isEmpty(cArr)) {
            int length = charSequence.length();
            if (length == 0) {
                return str(charSequence);
            }
            StringBuilder sb = new StringBuilder(length);
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = charSequence.charAt(i8);
                if (!g0.contains(cArr, charAt)) {
                    sb.append(charAt);
                }
            }
            return sb.toString();
        }
        return str(charSequence);
    }

    public static String repeat(CharSequence charSequence, int i8) {
        if (charSequence == null) {
            return null;
        }
        if (i8 <= 0 || charSequence.length() == 0) {
            return "";
        }
        if (i8 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        long j8 = length * i8;
        int i9 = (int) j8;
        if (i9 == j8) {
            char[] cArr = new char[i9];
            charSequence.toString().getChars(0, length, cArr, 0);
            while (true) {
                int i10 = i9 - length;
                if (length < i10) {
                    System.arraycopy(cArr, 0, cArr, length, length);
                    length <<= 1;
                } else {
                    System.arraycopy(cArr, 0, cArr, length, i10);
                    return new String(cArr);
                }
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("Required String length is too large: " + j8);
        }
    }

    public static String replaceChars(CharSequence charSequence, char[] cArr, CharSequence charSequence2) {
        if (!isEmpty(charSequence) && !g0.isEmpty(cArr)) {
            HashSet hashSet = new HashSet(cArr.length);
            for (char c8 : cArr) {
                hashSet.add(Character.valueOf(c8));
            }
            int length = charSequence.length();
            StringBuilder sb = new StringBuilder();
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = charSequence.charAt(i8);
                sb.append(hashSet.contains(Character.valueOf(charAt)) ? charSequence2 : Character.valueOf(charAt));
            }
            return sb.toString();
        }
        return str(charSequence);
    }

    public static List<String> split(CharSequence charSequence, char c8, int i8, boolean z7, boolean z8) {
        return q.split(charSequence, c8, i8, z7, z8);
    }

    public static List<String> splitTrim(CharSequence charSequence, CharSequence charSequence2, int i8) {
        return split(charSequence, charSequence2, i8, true, true);
    }

    public static boolean startWith(CharSequence charSequence, CharSequence charSequence2, boolean z7, boolean z8) {
        if (charSequence == null || charSequence2 == null) {
            return !z8 && charSequence == null && charSequence2 == null;
        }
        if (charSequence.toString().regionMatches(z7, 0, charSequence2.toString(), 0, charSequence2.length())) {
            return (z8 && equals(charSequence, charSequence2, z7)) ? false : true;
        }
        return false;
    }

    public static String unWrap(CharSequence charSequence, char c8, char c9) {
        if (isEmpty(charSequence)) {
            return str(charSequence);
        }
        if (charSequence.charAt(0) == c8 && charSequence.charAt(charSequence.length() - 1) == c9) {
            return sub(charSequence, 1, charSequence.length() - 1);
        }
        return charSequence.toString();
    }

    public static int indexOf(CharSequence charSequence, char c8, int i8, int i9) {
        if (isEmpty(charSequence)) {
            return -1;
        }
        return new CharFinder(c8).setText(charSequence).setEndIndex(i9).start(i8);
    }

    public static boolean isSurround(CharSequence charSequence, char c8, char c9) {
        return !isBlank(charSequence) && charSequence.length() >= 2 && charSequence.charAt(0) == c8 && charSequence.charAt(charSequence.length() - 1) == c9;
    }

    public static boolean isWrap(CharSequence charSequence, char c8) {
        return isWrap(charSequence, c8, c8);
    }

    public static String padAfter(CharSequence charSequence, int i8, CharSequence charSequence2) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        if (length == i8) {
            return charSequence.toString();
        }
        if (length > i8) {
            return subSufByLength(charSequence, i8);
        }
        return charSequence.toString().concat(repeatByLength(charSequence2, i8 - length));
    }

    public static String padPre(CharSequence charSequence, int i8, char c8) {
        if (charSequence == null) {
            return null;
        }
        int length = charSequence.length();
        if (length == i8) {
            return charSequence.toString();
        }
        if (length > i8) {
            return subPre(charSequence, i8);
        }
        return repeat(c8, i8 - length).concat(charSequence.toString());
    }

    public static <R> List<R> split(CharSequence charSequence, char c8, int i8, boolean z7, Function<String, R> function) {
        return q.split(charSequence, c8, i8, z7, function);
    }

    public static int count(CharSequence charSequence, char c8) {
        if (isEmpty(charSequence)) {
            return 0;
        }
        int length = charSequence.length();
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            if (c8 == charSequence.charAt(i9)) {
                i8++;
            }
        }
        return i8;
    }

    public static boolean isWrap(CharSequence charSequence, char c8, char c9) {
        return charSequence != null && charSequence.charAt(0) == c8 && charSequence.charAt(charSequence.length() - 1) == c9;
    }

    public static List<String> split(CharSequence charSequence, CharSequence charSequence2) {
        return split(charSequence, charSequence2, false, false);
    }

    public static int indexOf(CharSequence charSequence, CharSequence charSequence2, int i8, boolean z7) {
        if (isEmpty(charSequence) || isEmpty(charSequence2)) {
            return equals(charSequence, charSequence2) ? 0 : -1;
        }
        return new StrFinder(charSequence2, z7).setText(charSequence).start(i8);
    }

    public static String removePreAndLowerFirst(CharSequence charSequence, CharSequence charSequence2) {
        return lowerFirst(removePrefix(charSequence, charSequence2));
    }

    public static List<String> split(CharSequence charSequence, CharSequence charSequence2, boolean z7, boolean z8) {
        return split(charSequence, charSequence2, 0, z7, z8);
    }

    public static boolean startWith(CharSequence charSequence, CharSequence charSequence2) {
        return startWith(charSequence, charSequence2, false);
    }

    public static String subAfter(CharSequence charSequence, char c8, boolean z7) {
        if (isEmpty(charSequence)) {
            if (charSequence == null) {
                return null;
            }
            return "";
        }
        String charSequence2 = charSequence.toString();
        int lastIndexOf = z7 ? charSequence2.lastIndexOf(c8) : charSequence2.indexOf(c8);
        return -1 == lastIndexOf ? "" : charSequence2.substring(lastIndexOf + 1);
    }

    public static String subBetween(CharSequence charSequence, CharSequence charSequence2) {
        return subBetween(charSequence, charSequence2, charSequence2);
    }

    public static String center(CharSequence charSequence, int i8, CharSequence charSequence2) {
        if (charSequence != null && i8 > 0) {
            if (isEmpty(charSequence2)) {
                charSequence2 = SPACE;
            }
            int length = charSequence.length();
            int i9 = i8 - length;
            if (i9 <= 0) {
                return charSequence.toString();
            }
            return padAfter(padPre(charSequence, length + (i9 / 2), charSequence2), i8, charSequence2).toString();
        }
        return str(charSequence);
    }

    public static boolean endWith(CharSequence charSequence, CharSequence charSequence2) {
        return endWith(charSequence, charSequence2, false);
    }

    public static List<String> split(CharSequence charSequence, CharSequence charSequence2, int i8, boolean z7, boolean z8) {
        return q.split(charSequence, charSequence2 == null ? null : charSequence2.toString(), i8, z7, z8);
    }

    public static String subBefore(CharSequence charSequence, char c8, boolean z7) {
        if (isEmpty(charSequence)) {
            if (charSequence == null) {
                return null;
            }
            return "";
        }
        String charSequence2 = charSequence.toString();
        int lastIndexOf = z7 ? charSequence2.lastIndexOf(c8) : charSequence2.indexOf(c8);
        return -1 == lastIndexOf ? charSequence2 : lastIndexOf == 0 ? "" : charSequence2.substring(0, lastIndexOf);
    }

    public static String unWrap(CharSequence charSequence, char c8) {
        return unWrap(charSequence, c8, c8);
    }

    public static String[] split(CharSequence charSequence, int i8) {
        return q.splitByLength(charSequence, i8);
    }

    public static String[] subBetweenAll(CharSequence charSequence, CharSequence charSequence2) {
        return subBetweenAll(charSequence, charSequence2, charSequence2);
    }

    public static String replace(CharSequence charSequence, int i8, int i9, char c8) {
        IntStream codePoints;
        int[] array;
        if (isEmpty(charSequence)) {
            return str(charSequence);
        }
        String str = str(charSequence);
        codePoints = str.codePoints();
        array = codePoints.toArray();
        int length = array.length;
        if (i8 > length) {
            return str;
        }
        if (i9 > length) {
            i9 = length;
        }
        if (i8 > i9) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 >= i8 && i10 < i9) {
                sb.append(c8);
            } else {
                sb.append(new String(array, i10, 1));
            }
        }
        return sb.toString();
    }

    public static String replace(CharSequence charSequence, int i8, int i9, CharSequence charSequence2) {
        IntStream codePoints;
        int[] array;
        if (isEmpty(charSequence)) {
            return str(charSequence);
        }
        String str = str(charSequence);
        codePoints = str.codePoints();
        array = codePoints.toArray();
        int length = array.length;
        if (i8 > length) {
            return str;
        }
        if (i9 > length) {
            i9 = length;
        }
        if (i8 > i9) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < i8; i10++) {
            sb.append(new String(array, i10, 1));
        }
        sb.append(charSequence2);
        while (i9 < length) {
            sb.append(new String(array, i9, 1));
            i9++;
        }
        return sb.toString();
    }

    public static String replace(CharSequence charSequence, Pattern pattern, Func1<Matcher, String> func1) {
        return p0.replaceAll(charSequence, pattern, func1);
    }

    public static String replace(CharSequence charSequence, String str, Func1<Matcher, String> func1) {
        return p0.replaceAll(charSequence, str, func1);
    }
}

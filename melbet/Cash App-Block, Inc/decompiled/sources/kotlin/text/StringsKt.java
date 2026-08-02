package kotlin.text;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.internal.CopyOnWriteArrayList;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TransformingSequence;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"kotlin/text/StringsKt__AppendableKt", "kotlin/text/StringsKt__IndentKt", "kotlin/text/StringsKt__RegexExtensionsJVMKt", "kotlin/text/StringsKt__RegexExtensionsKt", "kotlin/text/StringsKt__StringBuilderJVMKt", "kotlin/text/StringsKt__StringBuilderKt", "kotlin/text/StringsKt__StringNumberConversionsJVMKt", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/StringsKt__StringsJVMKt", "kotlin/text/StringsKt__StringsKt", "kotlin/text/StringsKt___StringsJvmKt", "kotlin/text/StringsKt___StringsKt"}, k = 4, mv = {2, 3, 0}, xi = 49)
/* loaded from: classes3.dex */
public final class StringsKt extends StringsKt___StringsKt {
    public static String commonPrefixWith$default(String str, String str2) {
        str.getClass();
        str2.getClass();
        int min = Math.min(str.length(), str2.length());
        int i = 0;
        while (i < min && CharsKt__CharKt.equals(str.charAt(i), str2.charAt(i), false)) {
            i++;
        }
        int i2 = i - 1;
        if (StringsKt__StringsKt.hasSurrogatePairAt(i2, str) || StringsKt__StringsKt.hasSurrogatePairAt(i2, str2)) {
            i--;
        }
        return str.subSequence(0, i).toString();
    }

    public static boolean contains(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (indexOf$default(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (StringsKt__StringsKt.indexOf$StringsKt__StringsKt(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean endsWith$default(CharSequence charSequence, String str) {
        charSequence.getClass();
        return charSequence instanceof String ? StringsKt__StringsJVMKt.endsWith((String) charSequence, str, false) : StringsKt__StringsKt.regionMatchesImpl(charSequence, false, charSequence.length() - str.length(), str, 0, str.length());
    }

    public static Pair findAnyOf(int i, String str, ArrayList arrayList) {
        str.getClass();
        return StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt(str, arrayList, i, true);
    }

    public static int getLastIndex(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static int indexOf$default(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        charSequence.getClass();
        return (z || !(charSequence instanceof String)) ? StringsKt__StringsKt.indexOfAny(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    public static boolean isBlank(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!CharsKt.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int lastIndexOf$default(char c, int i, int i2, CharSequence charSequence) {
        if ((i2 & 2) != 0) {
            i = getLastIndex(charSequence);
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(ArraysKt___ArraysKt.single(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (CharsKt__CharKt.equals(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static String padEnd(String str, int i, char c) {
        CharSequence charSequence;
        str.getClass();
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static String padStart(int i, String str) {
        CharSequence charSequence;
        str.getClass();
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static String removePrefix(CharSequence charSequence, String str) {
        str.getClass();
        charSequence.getClass();
        return StringsKt__StringsKt.startsWith$default(charSequence, str) ? str.substring(charSequence.length()) : str;
    }

    public static String removeSuffix(String str, String str2) {
        str.getClass();
        return endsWith$default(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static String removeSurrounding(String str) {
        str.getClass();
        return (str.length() >= 2 && StringsKt__StringsKt.startsWith$default("\"", str) && endsWith$default(str, "\"")) ? Boxes$$ExternalSyntheticOutline1.m1148m(1, 1, str) : str;
    }

    public static StringBuilder replaceRange(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < i) {
            Path$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m(i2, i, "End index (", ") is less than start index (", ")."));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static List split$default(CharSequence charSequence, char[] cArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        int i3 = 1;
        if (cArr.length == 1) {
            return StringsKt__StringsKt.split$StringsKt__StringsKt(i2, charSequence, String.valueOf(cArr[0]), false);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(StringsKt__StringsKt.rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, cArr, i2), i3);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(copyOnWriteArrayList, 10));
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt__StringsKt.substring(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static TransformingSequence splitToSequence$default(CharSequence charSequence, char[] cArr) {
        charSequence.getClass();
        return SequencesKt___SequencesKt.map(StringsKt__StringsKt.rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, cArr, 0), new StringsKt__IndentKt$$ExternalSyntheticLambda0(charSequence, 1));
    }

    public static boolean startsWith$default(String str, char c) {
        str.getClass();
        return str.length() > 0 && CharsKt__CharKt.equals(str.charAt(0), c, false);
    }

    public static String substring(String str, IntRange intRange) {
        str.getClass();
        intRange.getClass();
        return str.substring(intRange.first, intRange.last + 1);
    }

    public static String substringAfter(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int indexOf$default = indexOf$default((CharSequence) str, c, 0, false, 6);
        return indexOf$default == -1 ? str2 : str.substring(indexOf$default + 1, str.length());
    }

    public static String substringAfterLast(char c, String str, String str2) {
        str.getClass();
        str2.getClass();
        int lastIndexOf$default = lastIndexOf$default(c, 0, 6, str);
        return lastIndexOf$default == -1 ? str2 : str.substring(lastIndexOf$default + 1, str.length());
    }

    public static String substringAfterLast$default(String str, String str2) {
        str.getClass();
        str.getClass();
        int lastIndexOf$default = lastIndexOf$default(str, str2, 0, 6);
        return lastIndexOf$default == -1 ? str : str.substring(str2.length() + lastIndexOf$default, str.length());
    }

    public static String substringBefore(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int indexOf$default = indexOf$default((CharSequence) str, str2, 0, false, 6);
        return indexOf$default == -1 ? str3 : str.substring(0, indexOf$default);
    }

    public static String substringBefore$default(String str, char c) {
        str.getClass();
        str.getClass();
        int indexOf$default = indexOf$default((CharSequence) str, c, 0, false, 6);
        return indexOf$default == -1 ? str : str.substring(0, indexOf$default);
    }

    public static String substringBeforeLast$default(String str, char c) {
        int lastIndexOf$default = lastIndexOf$default(c, 0, 6, str);
        return lastIndexOf$default == -1 ? str : str.substring(0, lastIndexOf$default);
    }

    public static Boolean toBooleanStrictOrNull(String str) {
        str.getClass();
        if (Intrinsics.areEqual(str, "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.areEqual(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static Integer toIntOrNull(int i, String str) {
        boolean z;
        int i2;
        int i3;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        int i5 = -2147483647;
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i5 = PKIFailureInfo.systemUnavail;
                z = true;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), i);
            if (digit < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + digit) {
                return null;
            }
            i4 = i3 - digit;
            i2++;
        }
        return z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    public static Long toLongOrNull(int i, String str) {
        boolean z;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
                i2 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i2 = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), i);
            if (digit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / i;
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * i;
            long j5 = digit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i2++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    public static String trim(String str, char... cArr) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean contains = ArraysKt___ArraysKt.contains(cArr, str.charAt(!z ? i : length));
            if (z) {
                if (!contains) {
                    break;
                }
                length--;
            } else if (contains) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static String trimEnd(String str, char... cArr) {
        CharSequence charSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!ArraysKt___ArraysKt.contains(cArr, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static String trimStart(String str, char... cArr) {
        CharSequence charSequence;
        str.getClass();
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequence = "";
                break;
            }
            if (!ArraysKt___ArraysKt.contains(cArr, str.charAt(i))) {
                charSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        return charSequence.toString();
    }

    public static String substringAfter(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        int indexOf$default = indexOf$default((CharSequence) str, str2, 0, false, 6);
        return indexOf$default == -1 ? str3 : str.substring(str2.length() + indexOf$default, str.length());
    }

    public static boolean endsWith$default(String str, char c) {
        str.getClass();
        return str.length() > 0 && CharsKt__CharKt.equals(str.charAt(str.length() - 1), c, false);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt__StringsKt.indexOf(i, charSequence, str, z);
    }

    public static boolean contains(CharSequence charSequence, char c, boolean z) {
        charSequence.getClass();
        return indexOf$default(charSequence, c, 0, z, 2) >= 0;
    }

    public static CharSequence trimStart(String str) {
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!CharsKt.isWhitespace(str.charAt(i))) {
                return str.subSequence(i, str.length());
            }
        }
        return "";
    }

    public static CharSequence trim(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean isWhitespace = CharsKt.isWhitespace(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!isWhitespace) {
                    break;
                }
                length--;
            } else if (isWhitespace) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static int lastIndexOf$default(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = getLastIndex(charSequence);
        }
        int i3 = i;
        charSequence.getClass();
        str.getClass();
        if (!(charSequence instanceof String)) {
            return StringsKt__StringsKt.indexOf$StringsKt__StringsKt(charSequence, str, i3, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(str, i3);
    }

    public static Long toLongOrNull(String str) {
        str.getClass();
        return toLongOrNull(10, str);
    }
}

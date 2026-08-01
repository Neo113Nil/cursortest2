package kotlin.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.x;
import te.a1;

@Metadata(d1 = {"kotlin/text/StringsKt__AppendableKt", "kotlin/text/StringsKt__IndentKt", "kotlin/text/StringsKt__RegexExtensionsJVMKt", "kotlin/text/StringsKt__RegexExtensionsKt", "kotlin/text/StringsKt__StringBuilderJVMKt", "kotlin/text/StringsKt__StringBuilderKt", "kotlin/text/StringsKt__StringNumberConversionsJVMKt", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/StringsKt__StringsJVMKt", "kotlin/text/StringsKt__StringsKt", "kotlin/text/StringsKt___StringsJvmKt", "kotlin/text/StringsKt___StringsKt"}, k = a4.j.LONG_FIELD_NUMBER, mv = {2, a4.j.LONG_FIELD_NUMBER, 0}, xi = 49)
/* loaded from: classes.dex */
public final class StringsKt extends r {
    public static boolean n(String str, String str2) {
        str.getClass();
        return StringsKt__StringsKt.j(str, str2, 0, 2) >= 0;
    }

    public static boolean o(CharSequence charSequence) {
        return charSequence instanceof String ? ((String) charSequence).endsWith(".xml") : StringsKt__StringsKt.k(charSequence, charSequence.length() - 4, ".xml", 0, 4, false);
    }

    public static int p(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static int q(CharSequence charSequence, char c10, int i3, int i10) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c10, i3);
        }
        char[] cArr = {c10};
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(cArr[0], i3);
        }
        if (i3 < 0) {
            i3 = 0;
        }
        int length = charSequence.length() - 1;
        if (i3 > length) {
            return -1;
        }
        while (cArr[0] != charSequence.charAt(i3)) {
            if (i3 == length) {
                return -1;
            }
            i3++;
        }
        return i3;
    }

    public static boolean r(CharSequence charSequence) {
        charSequence.getClass();
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (!CharsKt.a(charSequence.charAt(i3))) {
                return false;
            }
        }
        return true;
    }

    public static List s(String str) {
        str.getClass();
        e eVar = new e(str);
        if (!eVar.hasNext()) {
            return j0.f5574d;
        }
        Object next = eVar.next();
        if (!eVar.hasNext()) {
            return x.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (eVar.hasNext()) {
            arrayList.add(eVar.next());
        }
        return arrayList;
    }

    public static String t(int i3, String str) {
        CharSequence charSequence;
        str.getClass();
        if (i3 < 0) {
            a1.e(n0.l.f(i3, "Desired length ", " is less than zero."));
            return null;
        }
        if (i3 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i3);
            int length = i3 - str.length();
            int i10 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append('0');
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            sb2.append((CharSequence) str);
            charSequence = sb2;
        }
        return charSequence.toString();
    }

    public static String u(String str) {
        return str.startsWith("fb") ? str.substring(2) : str;
    }

    public static String w(String str, String str2, String str3) {
        str.getClass();
        int j = StringsKt__StringsKt.j(str, str2, 0, 6);
        return j == -1 ? str3 : str.substring(str2.length() + j, str.length());
    }

    public static Long x(String str) {
        boolean z10;
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (charAt < '0') {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z10 = false;
                i3 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i3 = 1;
            }
        } else {
            z10 = false;
        }
        long j3 = 0;
        long j10 = -256204778801521550L;
        while (i3 < length) {
            int digit = Character.digit((int) str.charAt(i3), 10);
            if (digit < 0) {
                return null;
            }
            if (j3 < j10) {
                if (j10 != -256204778801521550L) {
                    return null;
                }
                j10 = j / 10;
                if (j3 < j10) {
                    return null;
                }
            }
            long j11 = j3 * 10;
            long j12 = digit;
            if (j11 < j + j12) {
                return null;
            }
            j3 = j11 - j12;
            i3++;
        }
        return z10 ? Long.valueOf(j3) : Long.valueOf(-j3);
    }

    public static CharSequence y(String str) {
        str.getClass();
        int length = str.length() - 1;
        int i3 = 0;
        boolean z10 = false;
        while (i3 <= length) {
            boolean a9 = CharsKt.a(str.charAt(!z10 ? i3 : length));
            if (z10) {
                if (!a9) {
                    break;
                }
                length--;
            } else if (a9) {
                i3++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i3, length + 1);
    }
}

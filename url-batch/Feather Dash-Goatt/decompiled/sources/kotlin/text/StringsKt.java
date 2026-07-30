package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import defpackage.ye1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"se1", "kotlin/text/b", "te1", "ue1", "ve1", "we1", "xe1", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/c", "kotlin/text/StringsKt__StringsKt", "kotlin/text/e", "ye1"}, d2 = {}, k = 4, mv = {2, 2, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 49)
/* loaded from: classes.dex */
public final class StringsKt extends ye1 {
    public static boolean k(String str, String str2) {
        return StringsKt__StringsKt.g(str, str2, 0, true, 2) >= 0;
    }

    public static boolean l(CharSequence charSequence) {
        return charSequence instanceof String ? ((String) charSequence).endsWith(".xml") : StringsKt__StringsKt.i(charSequence, charSequence.length() - 4, ".xml", 0, 4, false);
    }

    public static int m(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (cArr[0] != charSequence.charAt(i)) {
            if (i == length) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public static boolean n(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!CharsKt.a(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String o(String str) {
        return str.startsWith("fb") ? str.substring(2) : str;
    }

    public static String q(String str, String str2) {
        int g = StringsKt__StringsKt.g(str, str2, 0, false, 6);
        return g == -1 ? str : str.substring(str2.length() + g, str.length());
    }

    public static Long r(String str) {
        boolean z;
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (Intrinsics.b(charAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
                i = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / 10;
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * 10;
            long j5 = digit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    public static CharSequence s(String str) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean a = CharsKt.a(str.charAt(!z ? i : length));
            if (z) {
                if (!a) {
                    break;
                }
                length--;
            } else if (a) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}

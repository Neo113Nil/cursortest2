package kotlin.text;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class o extends StringsKt__StringNumberConversionsKt {
    public static boolean f(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static String g(String str, String str2, String str3) {
        str.getClass();
        int i3 = StringsKt__StringsKt.i(str, str2, 0, false);
        if (i3 < 0) {
            return str;
        }
        int length = str2.length();
        int i10 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i11 = 0;
        do {
            sb2.append((CharSequence) str, i11, i3);
            sb2.append(str3);
            i11 = i3 + length;
            if (i3 >= str.length()) {
                break;
            }
            i3 = StringsKt__StringsKt.i(str, str2, i3 + i10, false);
        } while (i3 > 0);
        sb2.append((CharSequence) str, i11, str.length());
        return sb2.toString();
    }

    public static boolean h(String str, String str2) {
        str.getClass();
        return str.startsWith(str2);
    }
}

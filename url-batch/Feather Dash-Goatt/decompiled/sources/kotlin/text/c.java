package kotlin.text;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class c extends StringsKt__StringNumberConversionsKt {
    public static String d(String str, String str2, String str3) {
        str.getClass();
        int f = StringsKt__StringsKt.f(str, str2, 0, false);
        if (f < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, f);
            sb.append(str3);
            i2 = f + length;
            if (f >= str.length()) {
                break;
            }
            f = StringsKt__StringsKt.f(str, str2, f + i, false);
        } while (f > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static boolean e(String str, String str2) {
        str.getClass();
        return str.startsWith(str2);
    }
}

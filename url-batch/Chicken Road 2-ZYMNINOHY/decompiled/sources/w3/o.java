package w3;

/* loaded from: classes.dex */
public abstract class o extends n {
    public static boolean V(String str, String suffix) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(suffix, "suffix");
        return str.endsWith(suffix);
    }

    public static boolean W(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean X(int i4, int i5, int i6, String str, String other, boolean z) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        return !z ? str.regionMatches(i4, other, i5, i6) : str.regionMatches(z, i4, other, i5, i6);
    }

    public static String Y(String str, String oldValue, String newValue) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(oldValue, "oldValue");
        kotlin.jvm.internal.i.e(newValue, "newValue");
        int f02 = AbstractC1510g.f0(str, oldValue, 0, false);
        if (f02 < 0) {
            return str;
        }
        int length = oldValue.length();
        int i4 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i5 = 0;
        do {
            sb.append((CharSequence) str, i5, f02);
            sb.append(newValue);
            i5 = f02 + length;
            if (f02 >= str.length()) {
                break;
            }
            f02 = AbstractC1510g.f0(str, oldValue, f02 + i4, false);
        } while (f02 > 0);
        sb.append((CharSequence) str, i5, str.length());
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean Z(int i4, String str, String str2, boolean z) {
        kotlin.jvm.internal.i.e(str, "<this>");
        return !z ? str.startsWith(str2, i4) : X(i4, 0, str2.length(), str, str2, z);
    }

    public static boolean a0(String str, String prefix, boolean z) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        return !z ? str.startsWith(prefix) : X(0, 0, prefix.length(), str, prefix, z);
    }
}

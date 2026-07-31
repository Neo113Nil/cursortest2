package X5;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String a7 = (String) obj;
        String b7 = (String) obj2;
        kotlin.jvm.internal.i.e(a7, "a");
        kotlin.jvm.internal.i.e(b7, "b");
        int min = Math.min(a7.length(), b7.length());
        for (int i7 = 4; i7 < min; i7++) {
            char charAt = a7.charAt(i7);
            char charAt2 = b7.charAt(i7);
            if (charAt != charAt2) {
                return kotlin.jvm.internal.i.g(charAt, charAt2) < 0 ? -1 : 1;
            }
        }
        int length = a7.length();
        int length2 = b7.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}

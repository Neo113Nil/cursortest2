package G3;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String a3 = (String) obj;
        String b4 = (String) obj2;
        kotlin.jvm.internal.i.e(a3, "a");
        kotlin.jvm.internal.i.e(b4, "b");
        int min = Math.min(a3.length(), b4.length());
        for (int i4 = 4; i4 < min; i4++) {
            char charAt = a3.charAt(i4);
            char charAt2 = b4.charAt(i4);
            if (charAt != charAt2) {
                return kotlin.jvm.internal.i.f(charAt, charAt2) < 0 ? -1 : 1;
            }
        }
        int length = a3.length();
        int length2 = b4.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}

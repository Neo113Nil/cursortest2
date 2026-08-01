package c3;

import java.util.Comparator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        u2.c.e(str, "a");
        u2.c.e(str2, "b");
        int min = Math.min(str.length(), str2.length());
        for (int i4 = 4; i4 < min; i4++) {
            char charAt = str.charAt(i4);
            char charAt2 = str2.charAt(i4);
            if (charAt != charAt2) {
                return u2.c.f(charAt, charAt2) < 0 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}

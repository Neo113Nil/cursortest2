package s7;

import java.util.Comparator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        r6.k.f(str, "a");
        r6.k.f(str2, "b");
        int min = Math.min(str.length(), str2.length());
        for (int i7 = 4; i7 < min; i7++) {
            char charAt = str.charAt(i7);
            char charAt2 = str2.charAt(i7);
            if (charAt != charAt2) {
                return r6.k.g(charAt, charAt2) < 0 ? -1 : 1;
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

package T4;

import java.util.Comparator;

/* renamed from: T4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155e implements Comparator {
    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return -1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        String a6 = (String) obj;
        String b6 = (String) obj2;
        kotlin.jvm.internal.i.e(a6, "a");
        kotlin.jvm.internal.i.e(b6, "b");
        int min = Math.min(a6.length(), b6.length());
        int i2 = 4;
        while (true) {
            if (i2 < min) {
                char charAt = a6.charAt(i2);
                char charAt2 = b6.charAt(i2);
                if (charAt == charAt2) {
                    i2++;
                } else if (kotlin.jvm.internal.i.g(charAt, charAt2) >= 0) {
                    return 1;
                }
            } else {
                int length = a6.length();
                int length2 = b6.length();
                if (length == length2) {
                    return 0;
                }
                if (length >= length2) {
                    return 1;
                }
            }
        }
    }
}

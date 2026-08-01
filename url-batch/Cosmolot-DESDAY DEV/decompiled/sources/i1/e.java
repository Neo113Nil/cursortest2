package i1;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class e implements Comparator {
    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return -1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        X0.e.e(str, "a");
        X0.e.e(str2, "b");
        int min = Math.min(str.length(), str2.length());
        int i = 4;
        while (true) {
            if (i < min) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt == charAt2) {
                    i++;
                } else if (X0.e.f(charAt, charAt2) >= 0) {
                    return 1;
                }
            } else {
                int length = str.length();
                int length2 = str2.length();
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

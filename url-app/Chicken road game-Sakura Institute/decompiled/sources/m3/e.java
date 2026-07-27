package m3;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

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
        String a4 = (String) obj;
        String b4 = (String) obj2;
        Intrinsics.checkNotNullParameter(a4, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        int min = Math.min(a4.length(), b4.length());
        int i2 = 4;
        while (true) {
            if (i2 < min) {
                char charAt = a4.charAt(i2);
                char charAt2 = b4.charAt(i2);
                if (charAt == charAt2) {
                    i2++;
                } else if (Intrinsics.e(charAt, charAt2) >= 0) {
                    return 1;
                }
            } else {
                int length = a4.length();
                int length2 = b4.length();
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

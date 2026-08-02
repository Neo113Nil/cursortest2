package okhttp3;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CipherSuite$Companion$ORDER_BY_NAME$1 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        str.getClass();
        str2.getClass();
        int min = Math.min(str.length(), str2.length());
        for (int i = 4; i < min; i++) {
            char charAt = str.charAt(i);
            char charAt2 = str2.charAt(i);
            if (charAt != charAt2) {
                return Intrinsics.compare((int) charAt, (int) charAt2) < 0 ? -1 : 1;
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

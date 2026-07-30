package D6;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: D6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String a7 = (String) obj;
        String b7 = (String) obj2;
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b7, "b");
        int min = Math.min(a7.length(), b7.length());
        for (int i2 = 4; i2 < min; i2++) {
            char charAt = a7.charAt(i2);
            char charAt2 = b7.charAt(i2);
            if (charAt != charAt2) {
                return Intrinsics.d(charAt, charAt2) < 0 ? -1 : 1;
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

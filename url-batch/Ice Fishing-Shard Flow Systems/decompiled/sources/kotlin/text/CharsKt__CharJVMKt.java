package kotlin.text;

import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* loaded from: classes.dex */
public class CharsKt__CharJVMKt {
    public static final boolean a(char c7) {
        return Character.isWhitespace(c7) || Character.isSpaceChar(c7);
    }

    public static int checkRadix(int i2) {
        if (2 <= i2 && i2 < 37) {
            return i2;
        }
        StringBuilder k7 = C4.p.k(i2, "radix ", " was not in valid range ");
        k7.append(new IntRange(2, 36, 1));
        throw new IllegalArgumentException(k7.toString());
    }
}

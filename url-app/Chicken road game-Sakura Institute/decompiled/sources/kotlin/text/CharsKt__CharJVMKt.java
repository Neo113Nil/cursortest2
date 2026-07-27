package kotlin.text;

import A.AbstractC0017m;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* loaded from: classes.dex */
public class CharsKt__CharJVMKt {
    public static int checkRadix(int i2) {
        if (2 <= i2 && i2 < 37) {
            return i2;
        }
        StringBuilder o4 = AbstractC0017m.o(i2, "radix ", " was not in valid range ");
        o4.append(new IntRange(2, 36, 1));
        throw new IllegalArgumentException(o4.toString());
    }
}

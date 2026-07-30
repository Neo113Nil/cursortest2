package M6;

import T6.i;
import q1.h;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1773a;

    static {
        i iVar = i.f2618l;
        f1773a = h.n("xn--");
    }

    public static int a(int i2, int i5, boolean z7) {
        int i7 = z7 ? i2 / 700 : i2 / 2;
        int i8 = (i7 / i5) + i7;
        int i9 = 0;
        while (i8 > 455) {
            i8 /= 35;
            i9 += 36;
        }
        return ((i8 * 36) / (i8 + 38)) + i9;
    }

    public static int b(int i2) {
        if (i2 < 26) {
            return i2 + 97;
        }
        if (i2 < 36) {
            return i2 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i2).toString());
    }
}

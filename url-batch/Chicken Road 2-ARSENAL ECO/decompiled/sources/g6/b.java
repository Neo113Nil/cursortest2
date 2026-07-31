package g6;

import n6.i;
import y1.C0760d;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final i f4317a;

    static {
        i iVar = i.f5525i;
        f4317a = C0760d.d("xn--");
    }

    public static int a(int i7, int i8, boolean z5) {
        int i9 = z5 ? i7 / 700 : i7 / 2;
        int i10 = (i9 / i8) + i9;
        int i11 = 0;
        while (i10 > 455) {
            i10 /= 35;
            i11 += 36;
        }
        return ((i10 * 36) / (i10 + 38)) + i11;
    }

    public static int b(int i7) {
        if (i7 < 26) {
            return i7 + 97;
        }
        if (i7 < 36) {
            return i7 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i7).toString());
    }
}

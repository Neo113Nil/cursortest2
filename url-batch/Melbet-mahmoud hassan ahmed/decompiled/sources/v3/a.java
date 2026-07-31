package v3;

import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public final class a {
    public static boolean a(@RecentlyNonNull int[] iArr, int i7) {
        if (iArr == null) {
            return false;
        }
        for (int i8 : iArr) {
            if (i8 == i7) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean b(@RecentlyNonNull T[] tArr, @RecentlyNonNull T t6) {
        int length = tArr != null ? tArr.length : 0;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            if (!r3.n.a(tArr[i7], t6)) {
                i7++;
            } else if (i7 >= 0) {
                return true;
            }
        }
        return false;
    }
}

package o4;

/* loaded from: classes.dex */
public final class a {
    public static int a(boolean z6, boolean z7) {
        if (z6 == z7) {
            return 0;
        }
        return z6 ? 1 : -1;
    }

    public static boolean b(boolean[] zArr, boolean z6) {
        for (boolean z7 : zArr) {
            if (z7 == z6) {
                return true;
            }
        }
        return false;
    }
}

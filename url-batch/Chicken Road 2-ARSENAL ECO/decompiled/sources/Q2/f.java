package Q2;

/* loaded from: classes.dex */
public final class f {
    private static final int HIGH_PRIORITY_THRESHOLD = 9;
    public static final f INSTANCE = new f();

    private f() {
    }

    public final boolean isHighPriority(int i7) {
        return i7 >= HIGH_PRIORITY_THRESHOLD;
    }

    public final int toAndroidImportance(int i7) {
        if (i7 >= HIGH_PRIORITY_THRESHOLD) {
            return 5;
        }
        if (i7 >= 7) {
            return 4;
        }
        if (i7 >= 5) {
            return 3;
        }
        if (i7 >= 3) {
            return 2;
        }
        return i7 >= 1 ? 1 : 0;
    }

    public final int toAndroidPriority(int i7) {
        if (i7 >= HIGH_PRIORITY_THRESHOLD) {
            return 2;
        }
        if (i7 >= 7) {
            return 1;
        }
        if (i7 >= 5) {
            return 0;
        }
        return i7 >= 3 ? -1 : -2;
    }
}

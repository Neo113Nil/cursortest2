package s3;

/* loaded from: classes.dex */
public final class f {
    private static final int HIGH_PRIORITY_THRESHOLD = 9;
    public static final f INSTANCE = new f();

    private f() {
    }

    public final boolean isHighPriority(int i2) {
        return i2 >= HIGH_PRIORITY_THRESHOLD;
    }

    public final int toAndroidImportance(int i2) {
        if (i2 >= HIGH_PRIORITY_THRESHOLD) {
            return 5;
        }
        if (i2 >= 7) {
            return 4;
        }
        if (i2 >= 5) {
            return 3;
        }
        if (i2 >= 3) {
            return 2;
        }
        return i2 >= 1 ? 1 : 0;
    }

    public final int toAndroidPriority(int i2) {
        if (i2 >= HIGH_PRIORITY_THRESHOLD) {
            return 2;
        }
        if (i2 >= 7) {
            return 1;
        }
        if (i2 >= 5) {
            return 0;
        }
        return i2 >= 3 ? -1 : -2;
    }
}

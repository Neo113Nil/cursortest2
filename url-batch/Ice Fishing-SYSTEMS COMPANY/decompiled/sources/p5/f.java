package p5;

/* loaded from: classes2.dex */
public final class f {
    private static final int HIGH_PRIORITY_THRESHOLD = 9;
    public static final f INSTANCE = new f();

    private f() {
    }

    public final boolean isHighPriority(int i) {
        return i >= 9;
    }

    public final int toAndroidImportance(int i) {
        if (i >= 9) {
            return 5;
        }
        if (i >= 7) {
            return 4;
        }
        if (i >= 5) {
            return 3;
        }
        if (i >= 3) {
            return 2;
        }
        return i >= 1 ? 1 : 0;
    }

    public final int toAndroidPriority(int i) {
        if (i >= 9) {
            return 2;
        }
        if (i >= 7) {
            return 1;
        }
        if (i >= 5) {
            return 0;
        }
        return i >= 3 ? -1 : -2;
    }
}

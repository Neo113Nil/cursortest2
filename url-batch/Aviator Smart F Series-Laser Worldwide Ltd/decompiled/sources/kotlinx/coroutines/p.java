package kotlinx.coroutines;

/* loaded from: classes3.dex */
public abstract class p {
    private static final int DECISION_SHIFT = 29;
    private static final int INDEX_MASK = 536870911;
    private static final int NO_INDEX = 536870911;
    private static final int RESUMED = 2;
    public static final kotlinx.coroutines.internal.g0 RESUME_TOKEN = new kotlinx.coroutines.internal.g0("RESUME_TOKEN");
    private static final int SUSPENDED = 1;
    private static final int UNDECIDED = 0;

    private static final int decisionAndIndex(int i8, int i9) {
        return (i8 << 29) + i9;
    }

    private static final int getDecision(int i8) {
        return i8 >> 29;
    }

    private static final int getIndex(int i8) {
        return i8 & 536870911;
    }
}

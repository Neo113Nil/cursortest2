package kotlinx.coroutines.internal;

/* loaded from: classes5.dex */
public abstract class q {
    public static final void checkParallelism(int i8) {
        if (i8 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i8).toString());
    }
}

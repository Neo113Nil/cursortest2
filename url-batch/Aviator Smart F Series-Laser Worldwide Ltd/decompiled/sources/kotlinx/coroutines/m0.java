package kotlinx.coroutines;

/* loaded from: classes3.dex */
public abstract class m0 {
    private static final boolean defaultMainDelayOptIn = kotlinx.coroutines.internal.h0.systemProp("kotlinx.coroutines.main.delay", false);
    private static final p0 DefaultDelay = initializeDefaultDelay();

    public static final p0 getDefaultDelay() {
        return DefaultDelay;
    }

    public static /* synthetic */ void getDefaultDelay$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final p0 initializeDefaultDelay() {
        if (!defaultMainDelayOptIn) {
            return l0.INSTANCE;
        }
        v1 main = t0.getMain();
        return (kotlinx.coroutines.internal.x.isMissing(main) || !(main instanceof p0)) ? l0.INSTANCE : (p0) main;
    }
}

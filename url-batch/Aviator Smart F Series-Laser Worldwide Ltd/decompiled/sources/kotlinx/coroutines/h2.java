package kotlinx.coroutines;

/* loaded from: classes3.dex */
public final class h2 {
    public static final h2 INSTANCE = new h2();
    private static final ThreadLocal<y0> ref = kotlinx.coroutines.internal.k0.commonThreadLocal(new kotlinx.coroutines.internal.g0("ThreadLocalEventLoop"));

    private h2() {
    }

    public final y0 currentOrNull$kotlinx_coroutines_core() {
        return ref.get();
    }

    public final y0 getEventLoop$kotlinx_coroutines_core() {
        ThreadLocal<y0> threadLocal = ref;
        y0 y0Var = threadLocal.get();
        if (y0Var != null) {
            return y0Var;
        }
        y0 createEventLoop = b1.createEventLoop();
        threadLocal.set(createEventLoop);
        return createEventLoop;
    }

    public final void resetEventLoop$kotlinx_coroutines_core() {
        ref.set(null);
    }

    public final void setEventLoop$kotlinx_coroutines_core(y0 y0Var) {
        ref.set(y0Var);
    }
}

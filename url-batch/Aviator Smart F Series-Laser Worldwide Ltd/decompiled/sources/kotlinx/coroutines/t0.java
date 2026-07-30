package kotlinx.coroutines;

/* loaded from: classes3.dex */
public final class t0 {
    public static final t0 INSTANCE = new t0();
    private static final CoroutineDispatcher Default = kotlinx.coroutines.scheduling.b.INSTANCE;
    private static final CoroutineDispatcher Unconfined = i2.INSTANCE;
    private static final CoroutineDispatcher IO = kotlinx.coroutines.scheduling.a.INSTANCE;

    private t0() {
    }

    public static final CoroutineDispatcher getDefault() {
        return Default;
    }

    public static /* synthetic */ void getDefault$annotations() {
    }

    public static final CoroutineDispatcher getIO() {
        return IO;
    }

    public static /* synthetic */ void getIO$annotations() {
    }

    public static final v1 getMain() {
        return kotlinx.coroutines.internal.w.dispatcher;
    }

    public static /* synthetic */ void getMain$annotations() {
    }

    public static final CoroutineDispatcher getUnconfined() {
        return Unconfined;
    }

    public static /* synthetic */ void getUnconfined$annotations() {
    }

    public final void shutdown() {
        l0.INSTANCE.shutdown();
        kotlinx.coroutines.scheduling.b.INSTANCE.shutdown$kotlinx_coroutines_core();
    }
}

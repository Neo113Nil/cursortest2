package kotlinx.coroutines;

/* loaded from: classes3.dex */
public final class f extends z0 {
    private final Thread thread;

    public f(Thread thread) {
        this.thread = thread;
    }

    @Override // kotlinx.coroutines.a1
    protected Thread getThread() {
        return this.thread;
    }
}

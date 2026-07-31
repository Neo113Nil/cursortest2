package j4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class z implements Executor {
    z() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}

package com.stripe.android.googlepaylauncher;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class DirectExecutor implements Executor {
    public static final DirectExecutor INSTANCE = new DirectExecutor();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }
}

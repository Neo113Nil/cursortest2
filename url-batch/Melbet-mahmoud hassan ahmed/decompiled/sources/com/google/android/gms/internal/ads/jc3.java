package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class jc3 {
    public static dc3 a(ExecutorService executorService) {
        if (executorService instanceof dc3) {
            return (dc3) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new ic3((ScheduledExecutorService) executorService) : new fc3(executorService);
    }

    public static Executor b() {
        return fb3.INSTANCE;
    }

    static Executor c(Executor executor, ga3<?> ga3Var) {
        Objects.requireNonNull(executor);
        return executor == fb3.INSTANCE ? executor : new ec3(executor, ga3Var);
    }
}

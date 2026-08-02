package v0;

import io.appmetrica.analytics.impl.Zo;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC1449a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Executor f15529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Zo f15530b;

    public ExecutorC1449a(ExecutorService executorService, Zo zo) {
        this.f15529a = executorService;
        this.f15530b = zo;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f15529a.execute(runnable);
    }
}

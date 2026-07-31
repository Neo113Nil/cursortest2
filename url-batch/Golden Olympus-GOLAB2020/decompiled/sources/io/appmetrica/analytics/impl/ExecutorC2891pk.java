package io.appmetrica.analytics.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.pk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC2891pk implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f39629a;

    public ExecutorC2891pk(Handler handler) {
        this.f39629a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f39629a.post(runnable);
    }
}

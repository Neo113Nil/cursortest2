package io.appmetrica.analytics.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.ik, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0697ik implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f12049a;

    public ExecutorC0697ik(Handler handler) {
        this.f12049a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f12049a.post(runnable);
    }
}

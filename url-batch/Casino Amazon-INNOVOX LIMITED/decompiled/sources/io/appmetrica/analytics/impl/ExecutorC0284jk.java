package io.appmetrica.analytics.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.jk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC0284jk implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f1325a;

    public ExecutorC0284jk(Handler handler) {
        this.f1325a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1325a.post(runnable);
    }
}

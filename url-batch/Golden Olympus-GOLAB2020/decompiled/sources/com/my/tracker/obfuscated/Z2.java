package com.my.tracker.obfuscated;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class Z2 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f21090b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f21090b.post(runnable);
    }
}

package com.startapp.sdk.internal;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ed implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f3742a;

    public ed(ld ldVar) {
        this.f3742a = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Executor) this.f3742a.f4091c.a()).execute(this.f3742a.v);
    }
}

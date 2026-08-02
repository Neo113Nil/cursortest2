package com.startapp.sdk.internal;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class cd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f3654a;

    public cd(ld ldVar) {
        this.f3654a = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Executor) this.f3654a.f4091c.a()).execute(this.f3654a.f4106t);
    }
}

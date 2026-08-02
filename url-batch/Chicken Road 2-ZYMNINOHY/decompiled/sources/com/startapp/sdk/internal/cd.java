package com.startapp.sdk.internal;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class cd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f6765a;

    public cd(ld ldVar) {
        this.f6765a = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Executor) this.f6765a.f7219c.a()).execute(this.f6765a.f7234t);
    }
}

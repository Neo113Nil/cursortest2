package com.startapp.sdk.internal;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ed implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ld f6856a;

    public ed(ld ldVar) {
        this.f6856a = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Executor) this.f6856a.f7219c.a()).execute(this.f6856a.v);
    }
}

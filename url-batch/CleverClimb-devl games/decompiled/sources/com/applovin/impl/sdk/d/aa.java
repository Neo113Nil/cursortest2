package com.applovin.impl.sdk.d;

/* loaded from: classes.dex */
public class aa extends a {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f3076a;

    public aa(com.applovin.impl.sdk.j jVar, Runnable runnable) {
        super("TaskRunnable", jVar);
        this.f3076a = runnable;
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.f;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3076a.run();
    }
}

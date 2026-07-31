package com.startapp.sdk.internal;

import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class kc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tc f304a;

    public kc(tc tcVar) {
        this.f304a = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Executor) this.f304a.c.a()).execute(this.f304a.t);
    }
}

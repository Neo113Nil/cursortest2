package com.startapp.sdk.internal;

import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class mc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tc f336a;

    public mc(tc tcVar) {
        this.f336a = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Executor) this.f336a.c.a()).execute(this.f336a.v);
    }
}

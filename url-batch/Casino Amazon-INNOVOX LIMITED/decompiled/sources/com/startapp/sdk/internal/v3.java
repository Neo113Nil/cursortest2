package com.startapp.sdk.internal;

import android.content.Context;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class v3 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f460a;
    public final /* synthetic */ pa b;
    public final /* synthetic */ com.startapp.sdk.components.a c;

    public v3(com.startapp.sdk.components.a aVar, Context context, pa paVar) {
        this.c = aVar;
        this.f460a = context;
        this.b = paVar;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 2, 5L, TimeUnit.SECONDS, new PriorityBlockingQueue(), new k5("info"));
        r8 r8Var = new r8(this.f460a);
        v7 v7Var = (v7) this.b.a();
        t3 t3Var = new t3(threadPoolExecutor);
        com.startapp.sdk.components.a aVar = this.c;
        return new d9(r8Var, v7Var, threadPoolExecutor, t3Var, aVar.t, new h9(this.f460a, aVar.m, aVar.h), new u3());
    }
}

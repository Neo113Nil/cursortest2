package com.startapp.sdk.internal;

import android.content.Context;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3672a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ib f3673b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f3674c;

    public d4(com.startapp.sdk.components.a aVar, Context context, ib ibVar) {
        this.f3674c = aVar;
        this.f3672a = context;
        this.f3673b = ibVar;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 2, 5L, TimeUnit.SECONDS, new PriorityBlockingQueue(), new u5("info"));
        h9 h9Var = new h9(this.f3672a);
        k8 k8Var = (k8) this.f3673b.a();
        b4 b4Var = new b4(threadPoolExecutor);
        com.startapp.sdk.components.a aVar = this.f3674c;
        return new t9(h9Var, k8Var, threadPoolExecutor, b4Var, aVar.f3479t, new x9(this.f3672a, aVar.f3474n, aVar.f3469i), new c4());
    }
}

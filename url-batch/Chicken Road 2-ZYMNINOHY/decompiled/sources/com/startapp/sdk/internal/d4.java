package com.startapp.sdk.internal;

import android.content.Context;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ib f6785b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f6786c;

    public d4(com.startapp.sdk.components.a aVar, Context context, ib ibVar) {
        this.f6786c = aVar;
        this.f6784a = context;
        this.f6785b = ibVar;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 2, 5L, TimeUnit.SECONDS, new PriorityBlockingQueue(), new u5("info"));
        h9 h9Var = new h9(this.f6784a);
        k8 k8Var = (k8) this.f6785b.a();
        b4 b4Var = new b4(threadPoolExecutor);
        com.startapp.sdk.components.a aVar = this.f6786c;
        return new t9(h9Var, k8Var, threadPoolExecutor, b4Var, aVar.f6577t, new x9(this.f6784a, aVar.n, aVar.f6568i), new c4());
    }
}

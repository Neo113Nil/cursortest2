package com.startapp.sdk.internal;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class b4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f6700a;

    public b4(ThreadPoolExecutor threadPoolExecutor) {
        this.f6700a = threadPoolExecutor;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return Integer.valueOf(this.f6700a.getMaximumPoolSize() - this.f6700a.getActiveCount());
    }
}

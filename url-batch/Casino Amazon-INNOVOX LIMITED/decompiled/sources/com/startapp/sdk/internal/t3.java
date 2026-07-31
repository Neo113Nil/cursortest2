package com.startapp.sdk.internal;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class t3 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f432a;

    public t3(ThreadPoolExecutor threadPoolExecutor) {
        this.f432a = threadPoolExecutor;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        return Integer.valueOf(this.f432a.getMaximumPoolSize() - this.f432a.getActiveCount());
    }
}

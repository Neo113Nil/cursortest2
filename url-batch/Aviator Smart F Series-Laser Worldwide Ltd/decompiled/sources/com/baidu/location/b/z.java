package com.baidu.location.b;

import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private ExecutorService f4928a;

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f4929b;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static z f4930a = new z();
    }

    private z() {
        this.f4928a = null;
        this.f4929b = null;
    }

    public static z a() {
        return b.f4930a;
    }

    public synchronized ExecutorService b() {
        return this.f4928a;
    }

    public synchronized ExecutorService c() {
        return this.f4929b;
    }

    public void d() {
        ExecutorService executorService = this.f4928a;
        if (executorService != null) {
            executorService.shutdown();
        }
        ExecutorService executorService2 = this.f4929b;
        if (executorService2 != null) {
            executorService2.shutdown();
        }
    }
}

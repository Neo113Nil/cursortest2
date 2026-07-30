package com.baidu.bdhttpdns;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private static volatile m f4277a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f4278b = new ThreadPoolExecutor(5, 25, 20, TimeUnit.SECONDS, new LinkedBlockingDeque(50));

    private m() {
    }

    static m a() {
        if (f4277a == null) {
            synchronized (m.class) {
                try {
                    if (f4277a == null) {
                        f4277a = new m();
                    }
                } finally {
                }
            }
        }
        return f4277a;
    }

    Executor b() {
        return this.f4278b;
    }
}

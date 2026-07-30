package com.anythink.core.common.s.a;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    static volatile Executor f16509b;

    /* renamed from: a, reason: collision with root package name */
    static com.anythink.core.common.s.a.a.c f16508a = new d();

    /* renamed from: c, reason: collision with root package name */
    static int f16510c = 4096;

    private h() {
    }

    private static void a(int i) {
        if (i < 2048 || i > 65535) {
            return;
        }
        f16510c = i;
    }

    public static void a(com.anythink.core.common.s.a.a.c cVar) {
        f16508a = cVar;
    }

    public static void a(Executor executor) {
        if (executor != null) {
            f16509b = executor;
        }
    }

    public static Executor a() {
        if (f16509b == null) {
            synchronized (h.class) {
                try {
                    if (f16509b == null) {
                        f16509b = Executors.newCachedThreadPool();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16509b;
    }
}

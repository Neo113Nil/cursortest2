package com.baidu.mapapi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static ExecutorService f5334a;

    public static ExecutorService a() {
        if (f5334a == null) {
            b();
        }
        return f5334a;
    }

    public static synchronized void b() {
        synchronized (a.class) {
            if (f5334a == null) {
                f5334a = Executors.newCachedThreadPool();
            }
        }
    }
}

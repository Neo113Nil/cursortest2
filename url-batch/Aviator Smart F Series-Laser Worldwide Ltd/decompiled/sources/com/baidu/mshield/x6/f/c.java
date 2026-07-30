package com.baidu.mshield.x6.f;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes2.dex */
public class c extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    public static volatile c f8559a;

    /* renamed from: b, reason: collision with root package name */
    public static Handler f8560b;

    public c() {
        super("BackgroundThread", 10);
    }

    public static void b() {
        if (f8559a == null) {
            f8559a = new c();
            f8559a.start();
            f8560b = new Handler(f8559a.getLooper());
        }
    }

    public static Handler c() {
        Handler handler;
        try {
            synchronized (c.class) {
                b();
                handler = f8560b;
            }
            return handler;
        } catch (Throwable th) {
            f.b(th);
            return f8560b;
        }
    }
}

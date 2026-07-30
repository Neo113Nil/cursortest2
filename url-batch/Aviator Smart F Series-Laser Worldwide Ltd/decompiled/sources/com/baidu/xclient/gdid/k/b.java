package com.baidu.xclient.gdid.k;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes2.dex */
public class b extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    public static b f10768a;

    /* renamed from: b, reason: collision with root package name */
    public static Handler f10769b;

    public b() {
        super("BackgroundThread", 10);
    }

    public static b b() {
        b bVar;
        synchronized (b.class) {
            d();
            bVar = f10768a;
        }
        return bVar;
    }

    public static Handler c() {
        Handler handler;
        synchronized (b.class) {
            d();
            handler = f10769b;
        }
        return handler;
    }

    public static void d() {
        if (f10768a == null) {
            b bVar = new b();
            f10768a = bVar;
            bVar.start();
            f10769b = new Handler(f10768a.getLooper());
        }
    }

    public void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        try {
            c().post(runnable);
        } catch (Throwable th) {
            d.a(th);
        }
    }
}

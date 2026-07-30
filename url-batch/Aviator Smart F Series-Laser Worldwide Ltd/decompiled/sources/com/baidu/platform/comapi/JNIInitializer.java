package com.baidu.platform.comapi;

import android.app.Application;
import android.content.Context;
import com.baidu.platform.comapi.resource.ResourceList;
import com.baidu.platform.comapi.resource.b;
import com.baidu.vi.VIContext;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class JNIInitializer {

    /* renamed from: d, reason: collision with root package name */
    private static Context f8728d;

    /* renamed from: e, reason: collision with root package name */
    private static a f8729e;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f8731g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f8732h;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f8733i;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f8734j;

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f8725a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f8726b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f8727c = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private static final CountDownLatch f8730f = new CountDownLatch(1);

    public static void attach(Application application, boolean z7, boolean z8, boolean z9, boolean z10) {
        if (application == null) {
            throw new RuntimeException("BDMapSDKException: Application Context is null");
        }
        f8731g = z7;
        f8732h = z8;
        f8733i = z9;
        f8734j = z10;
        if (f8728d == null) {
            f8728d = application;
        }
        VIContext.init(application);
    }

    public static void destroy() {
        f8729e.a();
        f8725a.set(false);
    }

    public static Context getCachedContext() {
        return f8728d;
    }

    public static CountDownLatch getResourceDoneLatch() {
        return f8730f;
    }

    public static void initEngine() {
        while (true) {
            AtomicBoolean atomicBoolean = f8725a;
            boolean z7 = atomicBoolean.get();
            if (z7) {
                return;
            }
            if (atomicBoolean.compareAndSet(z7, true)) {
                a aVar = new a();
                f8729e = aVar;
                if (!aVar.a(f8728d)) {
                    throw new RuntimeException("BDMapSDKException: engine init failed");
                }
            }
        }
    }

    public static void initEngineResource(ResourceList resourceList) {
        while (true) {
            AtomicBoolean atomicBoolean = f8727c;
            boolean z7 = atomicBoolean.get();
            if (z7) {
                return;
            }
            if (atomicBoolean.compareAndSet(z7, true)) {
                if (resourceList != null) {
                    try {
                        b.f9807a.a(resourceList);
                    } finally {
                        f8730f.countDown();
                    }
                }
            }
        }
    }

    public static void initLongLink() {
        while (true) {
            AtomicBoolean atomicBoolean = f8726b;
            boolean z7 = atomicBoolean.get();
            if (z7) {
                return;
            }
            if (atomicBoolean.compareAndSet(z7, true)) {
                a aVar = f8729e;
                if (aVar == null) {
                    throw new RuntimeException("engine must init first");
                }
                if (!aVar.b(f8728d)) {
                    throw new RuntimeException("longlink init failed");
                }
            }
        }
    }

    public static boolean isBaseLineRelease() {
        return f8734j;
    }

    public static boolean isDebug() {
        return f8732h;
    }

    public static boolean isInited() {
        return f8725a.get();
    }

    public static boolean isMainProcess() {
        return f8731g;
    }

    public static boolean isResourceInited() {
        return f8727c.get();
    }

    public static boolean isUserTest() {
        return f8733i;
    }
}

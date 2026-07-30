package com.baidu.ar.libloader;

import android.content.Context;
import com.baidu.ar.ARType;
import com.baidu.ar.libloader.ILibLoader;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile ILibLoader f2753a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Object f2754b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2755c = false;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f2756d = false;

    public static ILibLoader a() {
        if (f2753a == null) {
            synchronized (f2754b) {
                try {
                    if (f2753a == null) {
                        f2753a = new b();
                    }
                } finally {
                }
            }
        }
        return f2753a;
    }

    public static boolean b() {
        boolean z7;
        synchronized (f2754b) {
            z7 = f2755c;
        }
        return z7;
    }

    public static void c() {
        f2756d = true;
        f2755c = false;
        if (f2753a != null) {
            f2753a.release();
            f2753a = null;
        }
    }

    public static void d() {
        f2756d = false;
    }

    public static void a(Context context, ILibLoader.b bVar) {
        if (f2756d) {
            return;
        }
        a().load(context, bVar);
    }

    public static void a(ARType aRType, String str, String str2, ILibLoader.a aVar) {
        if (f2756d) {
            return;
        }
        a().prepareCaseRes(aRType, str, str2, aVar);
    }

    public static void a(ILibLoader iLibLoader) {
        synchronized (f2754b) {
            f2753a = iLibLoader;
            f2755c = true;
        }
        f2756d = false;
    }

    public static void a(ILibLoaderPlugin iLibLoaderPlugin) {
        a().setLibLoadPlugin(iLibLoaderPlugin);
    }

    public static void a(String str) {
        if (f2756d) {
            return;
        }
        a().require(str);
    }

    public static void a(String str, ILibLoader.c cVar) {
        a().setLibReadyListener(str, cVar);
    }
}

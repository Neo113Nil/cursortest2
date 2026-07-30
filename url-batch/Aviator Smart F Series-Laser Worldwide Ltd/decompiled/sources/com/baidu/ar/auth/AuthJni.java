package com.baidu.ar.auth;

import com.baidu.ar.gd;
import com.baidu.ar.libloader.ILibLoader;
import com.baidu.ar.statistic.StatisticApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class AuthJni {

    /* renamed from: c, reason: collision with root package name */
    public static volatile AuthJni f1763c;

    /* renamed from: b, reason: collision with root package name */
    public final List<Runnable> f1765b = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public boolean f1764a = false;

    public class a implements ILibLoader.c {

        /* renamed from: com.baidu.ar.auth.AuthJni$a$a, reason: collision with other inner class name */
        public class RunnableC0032a implements Runnable {
            public RunnableC0032a(a aVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (AuthJni.f1763c != null) {
                    try {
                        AuthJni.f1763c.nativeInit();
                        AuthJni.f1763c.f1764a = true;
                        AuthJni.f1763c.b();
                    } catch (Throwable th) {
                        th.printStackTrace();
                        AuthJni.b(AuthJni.f1763c.getVersionStr(), th.getMessage());
                    }
                }
            }
        }

        @Override // com.baidu.ar.libloader.ILibLoader.c
        public void onError() {
        }

        @Override // com.baidu.ar.libloader.ILibLoader.c
        public void onReady() {
            gd.a(new RunnableC0032a(this));
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int[] f1766a;

        public b(int[] iArr) {
            this.f1766a = iArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (AuthJni.f1763c != null) {
                    AuthJni.f1763c.nativeSetGrantedFeatures(this.f1766a);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                if (AuthJni.f1763c != null) {
                    AuthJni.f1763c.nativePutGrantedFeatures(this.f1766a);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                AuthJni.f1763c.nativeDestroy();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            AuthJni unused = AuthJni.f1763c = null;
        }
    }

    public static void init() {
        f1763c = new AuthJni();
        com.baidu.ar.libloader.a.a("dumixar");
        com.baidu.ar.libloader.a.a("dumixar", new a());
    }

    public static void release() {
        if (f1763c != null) {
            f1763c.f1765b.clear();
            gd.a(new c());
        }
    }

    public static void setGrantedFeatures(int[] iArr) {
        if (f1763c == null) {
            return;
        }
        b bVar = new b(iArr);
        if (f1763c.f1764a) {
            gd.a(bVar);
        } else {
            f1763c.f1765b.add(bVar);
        }
    }

    public final void b() {
        Iterator<Runnable> it = this.f1765b.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.f1765b.clear();
    }

    public String getVersionStr() {
        try {
            return "ver-" + nativeGetVersion();
        } catch (Throwable th) {
            th.printStackTrace();
            return "EXCEPTION-UNKNOWN";
        }
    }

    public native void nativeDestroy();

    public native int nativeGetVersion();

    public native void nativeInit();

    public native void nativePutGrantedFeatures(int[] iArr);

    public native void nativeSetGrantedFeatures(int[] iArr);

    public void sendAuthFailMessageFromNative(int i8) {
        ARAuth.a(i8);
    }

    public static void b(String str, String str2) {
        String name = Thread.currentThread().getName();
        HashMap hashMap = new HashMap();
        hashMap.put("event_param", name + "_" + str + "_" + str2);
        hashMap.put("feature_code", str);
        StatisticApi.onEvent("event_authjni_error", hashMap);
    }
}

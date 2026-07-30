package com.baidu.platform.comapi.h.i;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f9116a;

    /* renamed from: b, reason: collision with root package name */
    private String f9117b;

    /* renamed from: c, reason: collision with root package name */
    private String f9118c;

    private a() {
    }

    public static synchronized a b() {
        a aVar;
        synchronized (a.class) {
            try {
                if (f9116a == null) {
                    f9116a = new a();
                }
                aVar = f9116a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public String a() {
        return this.f9118c;
    }

    public String c() {
        return this.f9117b;
    }
}

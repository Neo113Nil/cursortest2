package com.baidu.platform.comapi.wnplatform.tts;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10538a = "c";

    /* renamed from: b, reason: collision with root package name */
    private static c f10539b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10540c = false;

    private c() {
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            try {
                if (f10539b == null) {
                    f10539b = new c();
                }
                cVar = f10539b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public synchronized void a(boolean z7) {
        com.baidu.platform.comapi.h.g.a.b(f10538a + "setBusy:" + z7);
        this.f10540c = z7;
    }
}

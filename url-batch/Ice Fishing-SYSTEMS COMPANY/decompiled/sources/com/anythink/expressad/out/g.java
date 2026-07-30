package com.anythink.expressad.out;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static com.anythink.expressad.g.a f20185a;

    private g() {
    }

    public static com.anythink.expressad.g.a a() {
        if (f20185a == null) {
            synchronized (g.class) {
                try {
                    if (f20185a == null) {
                        f20185a = new com.anythink.expressad.g.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20185a;
    }
}

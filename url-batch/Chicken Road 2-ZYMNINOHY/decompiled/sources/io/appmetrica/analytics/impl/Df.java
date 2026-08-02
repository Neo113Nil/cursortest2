package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Df implements Cf {

    /* renamed from: a, reason: collision with root package name */
    private volatile String f10197a;

    private final String b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("getProcessName", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
            if (invoke != null) {
                return (String) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    @Override // io.appmetrica.analytics.impl.Cf
    public String a() {
        if (this.f10197a != null) {
            return this.f10197a;
        }
        synchronized (this) {
            if (this.f10197a == null) {
                this.f10197a = b();
            }
        }
        return this.f10197a;
    }
}

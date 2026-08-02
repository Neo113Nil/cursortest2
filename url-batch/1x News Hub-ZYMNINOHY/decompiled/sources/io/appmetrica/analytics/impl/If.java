package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class If implements Hf {

    /* renamed from: a, reason: collision with root package name */
    private volatile String f6155a;

    private final String b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("getProcessName", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
            if (invoke != null) {
                return (String) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    @Override // io.appmetrica.analytics.impl.Hf
    public String a() {
        if (this.f6155a != null) {
            return this.f6155a;
        }
        synchronized (this) {
            if (this.f6155a == null) {
                this.f6155a = b();
            }
        }
        return this.f6155a;
    }
}

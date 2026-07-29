package com.c.b;

/* compiled from: Property.java */
/* loaded from: classes.dex */
public abstract class c<T, V> {

    /* renamed from: a, reason: collision with root package name */
    private final String f3545a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<V> f3546b;

    public abstract V a(T t);

    public c(Class<V> cls, String str) {
        this.f3545a = str;
        this.f3546b = cls;
    }

    public void a(T t, V v) {
        throw new UnsupportedOperationException("Property " + a() + " is read-only");
    }

    public String a() {
        return this.f3545a;
    }
}

package com.moat.analytics.mobile.vng.a.b;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private static final a<?> f7332a = new a<>();

    /* renamed from: b, reason: collision with root package name */
    private final T f7333b;

    private a() {
        this.f7333b = null;
    }

    private a(T t) {
        if (t == null) {
            throw new NullPointerException("Optional of null value.");
        }
        this.f7333b = t;
    }

    public static <T> a<T> a() {
        return (a<T>) f7332a;
    }

    public static <T> a<T> a(T t) {
        return new a<>(t);
    }

    public static <T> a<T> b(T t) {
        return t == null ? a() : a(t);
    }

    public T b() {
        if (this.f7333b != null) {
            return this.f7333b;
        }
        throw new NoSuchElementException("No value present");
    }

    public T c(T t) {
        return this.f7333b != null ? this.f7333b : t;
    }

    public boolean c() {
        return this.f7333b != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f7333b != aVar.f7333b) {
            return (this.f7333b == null || aVar.f7333b == null || !this.f7333b.equals(aVar.f7333b)) ? false : true;
        }
        return true;
    }

    public int hashCode() {
        if (this.f7333b == null) {
            return 0;
        }
        return this.f7333b.hashCode();
    }

    public String toString() {
        return this.f7333b != null ? String.format("Optional[%s]", this.f7333b) : "Optional.empty";
    }
}

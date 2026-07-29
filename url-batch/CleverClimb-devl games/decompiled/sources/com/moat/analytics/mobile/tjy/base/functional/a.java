package com.moat.analytics.mobile.tjy.base.functional;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final a f7252a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Object f7253b;

    private a() {
        this.f7253b = null;
    }

    private a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Optional of null value.");
        }
        this.f7253b = obj;
    }

    public static a a() {
        return f7252a;
    }

    public static a a(Object obj) {
        return new a(obj);
    }

    public static a b(Object obj) {
        return obj == null ? a() : a(obj);
    }

    public final Object b() {
        if (this.f7253b != null) {
            return this.f7253b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final Object c(Object obj) {
        return this.f7253b != null ? this.f7253b : obj;
    }

    public final boolean c() {
        return this.f7253b != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f7253b == aVar.f7253b) {
            return true;
        }
        if (this.f7253b == null || aVar.f7253b == null) {
            return false;
        }
        return this.f7253b.equals(aVar.f7253b);
    }

    public final int hashCode() {
        if (this.f7253b == null) {
            return 0;
        }
        return this.f7253b.hashCode();
    }

    public final String toString() {
        return this.f7253b != null ? String.format("Optional[%s]", this.f7253b) : "Optional.empty";
    }
}

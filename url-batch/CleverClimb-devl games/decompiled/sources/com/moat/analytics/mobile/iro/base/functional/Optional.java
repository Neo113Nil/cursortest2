package com.moat.analytics.mobile.iro.base.functional;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class Optional<T> {

    /* renamed from: ˏ, reason: contains not printable characters */
    private static final Optional<?> f1081 = new Optional<>();

    /* renamed from: ˋ, reason: contains not printable characters */
    private final T f1082;

    private Optional() {
        this.f1082 = null;
    }

    public static <T> Optional<T> empty() {
        return (Optional<T>) f1081;
    }

    private Optional(T t) {
        if (t == null) {
            throw new NullPointerException("Optional of null value.");
        }
        this.f1082 = t;
    }

    public static <T> Optional<T> of(T t) {
        return new Optional<>(t);
    }

    public static <T> Optional<T> ofNullable(T t) {
        return t == null ? empty() : of(t);
    }

    public final T get() {
        if (this.f1082 == null) {
            throw new NoSuchElementException("No value present");
        }
        return this.f1082;
    }

    public final boolean isPresent() {
        return this.f1082 != null;
    }

    public final T orElse(T t) {
        return this.f1082 != null ? this.f1082 : t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Optional)) {
            return false;
        }
        Optional optional = (Optional) obj;
        return this.f1082 == optional.f1082 || !(this.f1082 == null || optional.f1082 == null || !this.f1082.equals(optional.f1082));
    }

    public final int hashCode() {
        if (this.f1082 == null) {
            return 0;
        }
        return this.f1082.hashCode();
    }

    public final String toString() {
        return this.f1082 != null ? String.format("Optional[%s]", this.f1082) : "Optional.empty";
    }
}

package com.moat.analytics.mobile.cha.base.functional;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class Optional<T> {

    /* renamed from: ˏ, reason: contains not printable characters */
    private static final Optional<?> f863 = new Optional<>();

    /* renamed from: ॱ, reason: contains not printable characters */
    private final T f864;

    private Optional() {
        this.f864 = null;
    }

    public static <T> Optional<T> empty() {
        return (Optional<T>) f863;
    }

    private Optional(T t) {
        if (t == null) {
            throw new NullPointerException("Optional of null value.");
        }
        this.f864 = t;
    }

    public static <T> Optional<T> of(T t) {
        return new Optional<>(t);
    }

    public static <T> Optional<T> ofNullable(T t) {
        return t == null ? empty() : of(t);
    }

    public final T get() {
        if (this.f864 == null) {
            throw new NoSuchElementException("No value present");
        }
        return this.f864;
    }

    public final boolean isPresent() {
        return this.f864 != null;
    }

    public final T orElse(T t) {
        return this.f864 != null ? this.f864 : t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Optional)) {
            return false;
        }
        Optional optional = (Optional) obj;
        return this.f864 == optional.f864 || !(this.f864 == null || optional.f864 == null || !this.f864.equals(optional.f864));
    }

    public final int hashCode() {
        if (this.f864 == null) {
            return 0;
        }
        return this.f864.hashCode();
    }

    public final String toString() {
        return this.f864 != null ? String.format("Optional[%s]", this.f864) : "Optional.empty";
    }
}

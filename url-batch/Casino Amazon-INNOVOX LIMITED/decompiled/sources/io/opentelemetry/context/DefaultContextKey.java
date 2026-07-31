package io.opentelemetry.context;

/* loaded from: classes3.dex */
final class DefaultContextKey<T> implements ContextKey<T> {
    private final String name;

    DefaultContextKey(String str) {
        this.name = str;
    }

    public String toString() {
        return this.name;
    }
}

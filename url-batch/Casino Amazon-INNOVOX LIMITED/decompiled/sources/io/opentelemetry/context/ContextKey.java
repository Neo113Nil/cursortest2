package io.opentelemetry.context;

/* loaded from: classes3.dex */
public interface ContextKey<T> {
    static <T> ContextKey<T> named(String str) {
        return new DefaultContextKey(str);
    }
}

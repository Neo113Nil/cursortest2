package io.opentelemetry.context;

import io.opentelemetry.context.ThreadLocalContextStorage;

/* loaded from: classes3.dex */
public interface Scope extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    static Scope noop() {
        return ThreadLocalContextStorage.NoopScope.INSTANCE;
    }
}

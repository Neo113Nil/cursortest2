package io.opentelemetry.sdk.metrics.internal.state;

import java.util.function.Supplier;

/* loaded from: classes3.dex */
public final class ObjectPool<T> {
    private final Supplier<T> objectCreator;
    private final ArrayBasedStack<T> pool = new ArrayBasedStack<>();

    public ObjectPool(Supplier<T> supplier) {
        this.objectCreator = supplier;
    }

    public T borrowObject() {
        T pop = this.pool.pop();
        return pop == null ? this.objectCreator.get() : pop;
    }

    public void returnObject(T t) {
        this.pool.push(t);
    }
}

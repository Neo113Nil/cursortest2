package com.yandex.div.core.widget;

import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class Resettable<T> {

    @NotNull
    private final Function0<T> initializer;

    @Nullable
    private T value;

    /* JADX WARN: Multi-variable type inference failed */
    public Resettable(@NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.initializer = initializer;
    }

    public final T get() {
        if (this.value == null) {
            this.value = (T) this.initializer.invoke();
        }
        T t4 = this.value;
        if (t4 != null) {
            return t4;
        }
        throw new ConcurrentModificationException("Set to null by another thread");
    }

    public final boolean getInitialized() {
        return this.value != null;
    }

    public final void reset() {
        this.value = null;
    }
}

package com.yandex.div.storage.util;

import V1.a;
import W1.h;
import W1.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class LazyProvider<T> implements a {

    @NotNull
    private final h value$delegate;

    public LazyProvider(@NotNull Function0<? extends T> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        this.value$delegate = i.b(init);
    }

    private final T getValue() {
        return (T) this.value$delegate.getValue();
    }

    @Override // V1.a
    public T get() {
        return getValue();
    }
}

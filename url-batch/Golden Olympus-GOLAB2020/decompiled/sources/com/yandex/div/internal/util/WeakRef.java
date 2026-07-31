package com.yandex.div.internal.util;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.c;
import m2.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class WeakRef<T> implements c {

    @Nullable
    private WeakReference<T> weakReference;

    public WeakRef(@Nullable T t4) {
        this.weakReference = t4 != null ? new WeakReference<>(t4) : null;
    }

    @Override // kotlin.properties.c
    @Nullable
    public T getValue(@Nullable Object obj, @NotNull h property) {
        Intrinsics.checkNotNullParameter(property, "property");
        WeakReference<T> weakReference = this.weakReference;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // kotlin.properties.c
    public void setValue(@Nullable Object obj, @NotNull h property, @Nullable T t4) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.weakReference = t4 != null ? new WeakReference<>(t4) : null;
    }
}

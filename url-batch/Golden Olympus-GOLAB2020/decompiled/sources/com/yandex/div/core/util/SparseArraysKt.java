package com.yandex.div.core.util;

import androidx.collection.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class SparseArraysKt {
    @NotNull
    public static final <T> Iterable<T> toIterable(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return new SparseArrayIterable(hVar);
    }
}

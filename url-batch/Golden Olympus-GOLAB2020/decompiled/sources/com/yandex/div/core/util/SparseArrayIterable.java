package com.yandex.div.core.util;

import androidx.collection.h;
import i2.InterfaceC2471a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class SparseArrayIterable<T> implements Iterable<T>, InterfaceC2471a {

    @NotNull
    private final h array;

    public SparseArrayIterable(@NotNull h array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new SparseArrayIterator(this.array);
    }
}

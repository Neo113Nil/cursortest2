package ru.rustore.sdk.reactive.backpressure.buffer;

import W1.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C3218h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.reactive.backpressure.buffer.BufferItemType;

@Metadata
/* loaded from: classes3.dex */
public final class Buffer<T> {

    @NotNull
    private final C3218h elements;

    @NotNull
    private final Object monitor;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Buffer() {
        this(r0, 1, r0);
        DefaultConstructorMarker defaultConstructorMarker = null;
    }

    public final void clear() {
        synchronized (this.monitor) {
            this.elements.clear();
            Unit unit = Unit.f41027a;
        }
    }

    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.monitor) {
            isEmpty = this.elements.isEmpty();
        }
        return isEmpty;
    }

    public final void offer(@NotNull BufferItemType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.monitor) {
            this.elements.addLast(value);
            Unit unit = Unit.f41027a;
        }
    }

    @Nullable
    public final BufferItemType popFirstOrNull() {
        BufferItemType bufferItemType;
        synchronized (this.monitor) {
            try {
                bufferItemType = (BufferItemType) this.elements.p();
                if (!(bufferItemType instanceof BufferItemType.Error)) {
                    if (bufferItemType instanceof BufferItemType.Item) {
                        bufferItemType = (BufferItemType.Item) bufferItemType;
                    } else if (!Intrinsics.areEqual(bufferItemType, BufferItemType.Complete.INSTANCE)) {
                        if (bufferItemType != null) {
                            throw new m();
                        }
                        bufferItemType = null;
                    }
                }
            } finally {
            }
        }
        return bufferItemType;
    }

    @Nullable
    public final BufferItemType popLastOrNull() {
        BufferItemType bufferItemType;
        synchronized (this.monitor) {
            try {
                bufferItemType = (BufferItemType) this.elements.q();
                if (!(bufferItemType instanceof BufferItemType.Error)) {
                    if (bufferItemType instanceof BufferItemType.Item) {
                        bufferItemType = (BufferItemType.Item) bufferItemType;
                    } else if (!Intrinsics.areEqual(bufferItemType, BufferItemType.Complete.INSTANCE)) {
                        if (bufferItemType != null) {
                            throw new m();
                        }
                        bufferItemType = null;
                    }
                }
            } finally {
            }
        }
        return bufferItemType;
    }

    public final int size() {
        int size;
        synchronized (this.monitor) {
            size = this.elements.size();
        }
        return size;
    }

    @NotNull
    public final List<BufferItemType> toList() {
        List<BufferItemType> list;
        synchronized (this.monitor) {
            list = CollectionsKt.toList(this.elements);
        }
        return list;
    }

    public Buffer(@NotNull Object monitor) {
        Intrinsics.checkNotNullParameter(monitor, "monitor");
        this.monitor = monitor;
        this.elements = new C3218h();
    }

    public /* synthetic */ Buffer(Object obj, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new Object() : obj);
    }
}

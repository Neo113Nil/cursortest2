package ru.rustore.sdk.reactive.backpressure.buffer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public abstract class BufferItemType {

    @Metadata
    public static final class Complete extends BufferItemType {

        @NotNull
        public static final Complete INSTANCE = new Complete();

        private Complete() {
            super(null);
        }
    }

    @Metadata
    public static final class Error extends BufferItemType {

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final Throwable f45848e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull Throwable e4) {
            super(null);
            Intrinsics.checkNotNullParameter(e4, "e");
            this.f45848e = e4;
        }

        @NotNull
        public final Throwable getE() {
            return this.f45848e;
        }
    }

    @Metadata
    public static final class Item<T> extends BufferItemType {
        private final T item;

        public Item(T t4) {
            super(null);
            this.item = t4;
        }

        public final T getItem() {
            return this.item;
        }
    }

    public /* synthetic */ BufferItemType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BufferItemType() {
    }
}

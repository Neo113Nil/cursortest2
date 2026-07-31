package com.yandex.div.internal.template;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class Field<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public final boolean overridable;
    public final int type;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> Field<T> nullField(boolean z4) {
            Field<T> field = z4 ? Placeholder.INSTANCE : Null.INSTANCE;
            Intrinsics.checkNotNull(field, "null cannot be cast to non-null type com.yandex.div.internal.template.Field<T of com.yandex.div.internal.template.Field.Companion.nullField>");
            return field;
        }

        private Companion() {
        }
    }

    @Metadata
    public static final class Null extends Field<Object> {

        @NotNull
        public static final Null INSTANCE = new Null();

        /* JADX WARN: Multi-variable type inference failed */
        private Null() {
            super(0, 0 == true ? 1 : 0, null);
        }
    }

    @Metadata
    public static final class Placeholder extends Field<Object> {

        @NotNull
        public static final Placeholder INSTANCE = new Placeholder();

        private Placeholder() {
            super(1, 1 == true ? 1 : 0, null);
        }
    }

    @Metadata
    public static final class Reference<T> extends Field<T> {

        @NotNull
        public final String reference;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Reference(boolean z4, @NotNull String reference) {
            super(3, z4, null);
            Intrinsics.checkNotNullParameter(reference, "reference");
            this.reference = reference;
        }
    }

    @Metadata
    public static final class Value<T> extends Field<T> {
        public final T value;

        public Value(boolean z4, T t4) {
            super(2, z4, null);
            this.value = t4;
        }
    }

    public /* synthetic */ Field(int i4, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, z4);
    }

    private Field(int i4, boolean z4) {
        this.type = i4;
        this.overridable = z4;
    }
}

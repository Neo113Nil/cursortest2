package com.yandex.div.core.dagger;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ExternalOptional<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Q1.b optional;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> ExternalOptional<T> empty() {
            return new ExternalOptional<>(Q1.b.f9169b.a());
        }

        @NotNull
        public final <T> ExternalOptional<T> of(@NotNull T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new ExternalOptional<>(Q1.b.f9169b.b(value));
        }

        @NotNull
        public final <T> ExternalOptional<T> ofNullable(@Nullable T t4) {
            return t4 != null ? of(t4) : empty();
        }

        private Companion() {
        }
    }

    public ExternalOptional(@NotNull Q1.b optional) {
        Intrinsics.checkNotNullParameter(optional, "optional");
        this.optional = optional;
    }

    @NotNull
    public static final <T> ExternalOptional<T> empty() {
        return Companion.empty();
    }

    @NotNull
    public static final <T> ExternalOptional<T> of(@NotNull T t4) {
        return Companion.of(t4);
    }

    @NotNull
    public final Q1.b getOptional() {
        return this.optional;
    }
}

package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public abstract class Single<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> Single<T> create(@NotNull Function1<? super SingleEmitter<T>, Unit> source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new SingleCreate(source);
        }

        @NotNull
        public final <T> Single<T> from(@NotNull Function0<? extends T> source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new SingleFrom(source);
        }

        private Companion() {
        }
    }

    public abstract void subscribe(@NotNull SingleObserver<T> singleObserver);
}

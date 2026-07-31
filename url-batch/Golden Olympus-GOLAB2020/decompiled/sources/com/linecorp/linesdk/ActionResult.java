package com.linecorp.linesdk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class ActionResult<T, U> {

    @Metadata
    public static final class Error<T, U> extends ActionResult<T, U> {
        private final U value;

        public Error(U u4) {
            super(null);
            this.value = u4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Error copy$default(Error error, Object obj, int i4, Object obj2) {
            if ((i4 & 1) != 0) {
                obj = error.value;
            }
            return error.copy(obj);
        }

        public final U component1() {
            return this.value;
        }

        @NotNull
        public final Error<T, U> copy(U u4) {
            return new Error<>(u4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.value, ((Error) obj).value);
        }

        public final U getValue() {
            return this.value;
        }

        public int hashCode() {
            U u4 = this.value;
            if (u4 == null) {
                return 0;
            }
            return u4.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(value=" + this.value + ')';
        }
    }

    @Metadata
    public static final class Success<T, U> extends ActionResult<T, U> {
        private final T value;

        public Success(T t4) {
            super(null);
            this.value = t4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i4, Object obj2) {
            if ((i4 & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.value;
        }

        @NotNull
        public final Success<T, U> copy(T t4) {
            return new Success<>(t4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.value, ((Success) obj).value);
        }

        public final T getValue() {
            return this.value;
        }

        public int hashCode() {
            T t4 = this.value;
            if (t4 == null) {
                return 0;
            }
            return t4.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(value=" + this.value + ')';
        }
    }

    public /* synthetic */ ActionResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ActionResult() {
    }
}

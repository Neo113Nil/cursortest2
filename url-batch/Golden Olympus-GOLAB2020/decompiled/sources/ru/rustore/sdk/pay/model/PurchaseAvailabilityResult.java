package ru.rustore.sdk.pay.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public interface PurchaseAvailabilityResult {

    @Metadata
    public static final class Available implements PurchaseAvailabilityResult {

        @NotNull
        public static final Available INSTANCE = new Available();

        private Available() {
        }
    }

    @Metadata
    public static final class Unavailable implements PurchaseAvailabilityResult {

        @NotNull
        private final Throwable cause;

        public Unavailable(@NotNull Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
        }

        public static /* synthetic */ Unavailable copy$default(Unavailable unavailable, Throwable th, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                th = unavailable.cause;
            }
            return unavailable.copy(th);
        }

        @NotNull
        public final Throwable component1() {
            return this.cause;
        }

        @NotNull
        public final Unavailable copy(@NotNull Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new Unavailable(cause);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unavailable) && Intrinsics.areEqual(this.cause, ((Unavailable) obj).cause);
        }

        @NotNull
        public final Throwable getCause() {
            return this.cause;
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @NotNull
        public String toString() {
            return "Unavailable(cause=" + this.cause + ')';
        }
    }
}

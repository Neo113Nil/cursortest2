package com.monetization.ads.quality.base.state;

import com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface AdQualityVerificationState {

    @Metadata
    public static final class Blocked implements AdQualityVerificationState {

        @NotNull
        private final AdQualityVerificationBlockingReasons reason;

        public Blocked(@NotNull AdQualityVerificationBlockingReasons reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }

        public static /* synthetic */ Blocked copy$default(Blocked blocked, AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                adQualityVerificationBlockingReasons = blocked.reason;
            }
            return blocked.copy(adQualityVerificationBlockingReasons);
        }

        @NotNull
        public final AdQualityVerificationBlockingReasons component1() {
            return this.reason;
        }

        @NotNull
        public final Blocked copy(@NotNull AdQualityVerificationBlockingReasons reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Blocked(reason);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Blocked) && Intrinsics.areEqual(this.reason, ((Blocked) obj).reason);
        }

        @NotNull
        public final AdQualityVerificationBlockingReasons getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "Blocked(reason=" + this.reason + ")";
        }
    }

    @Metadata
    public static final class Error implements AdQualityVerificationState {

        @NotNull
        private final AdQualityVerificationError error;

        public Error(@NotNull AdQualityVerificationError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public static /* synthetic */ Error copy$default(Error error, AdQualityVerificationError adQualityVerificationError, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                adQualityVerificationError = error.error;
            }
            return error.copy(adQualityVerificationError);
        }

        @NotNull
        public final AdQualityVerificationError component1() {
            return this.error;
        }

        @NotNull
        public final Error copy(@NotNull AdQualityVerificationError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.error, ((Error) obj).error);
        }

        @NotNull
        public final AdQualityVerificationError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(error=" + this.error + ")";
        }
    }

    @Metadata
    public static final class NotStarted implements AdQualityVerificationState {

        @NotNull
        public static final NotStarted INSTANCE = new NotStarted();

        private NotStarted() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof NotStarted);
        }

        public int hashCode() {
            return 1691080461;
        }

        @NotNull
        public String toString() {
            return "NotStarted";
        }
    }

    @Metadata
    public static final class ShouldBeBlockedOnDisplay implements AdQualityVerificationState {

        @NotNull
        private final AdQualityVerificationBlockingReasons reason;

        public ShouldBeBlockedOnDisplay(@NotNull AdQualityVerificationBlockingReasons reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }

        public static /* synthetic */ ShouldBeBlockedOnDisplay copy$default(ShouldBeBlockedOnDisplay shouldBeBlockedOnDisplay, AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                adQualityVerificationBlockingReasons = shouldBeBlockedOnDisplay.reason;
            }
            return shouldBeBlockedOnDisplay.copy(adQualityVerificationBlockingReasons);
        }

        @NotNull
        public final AdQualityVerificationBlockingReasons component1() {
            return this.reason;
        }

        @NotNull
        public final ShouldBeBlockedOnDisplay copy(@NotNull AdQualityVerificationBlockingReasons reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new ShouldBeBlockedOnDisplay(reason);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShouldBeBlockedOnDisplay) && Intrinsics.areEqual(this.reason, ((ShouldBeBlockedOnDisplay) obj).reason);
        }

        @NotNull
        public final AdQualityVerificationBlockingReasons getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "ShouldBeBlockedOnDisplay(reason=" + this.reason + ")";
        }
    }

    @Metadata
    public static final class Verified implements AdQualityVerificationState {

        @NotNull
        public static final Verified INSTANCE = new Verified();

        private Verified() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof Verified);
        }

        public int hashCode() {
            return -800540825;
        }

        @NotNull
        public String toString() {
            return "Verified";
        }
    }
}

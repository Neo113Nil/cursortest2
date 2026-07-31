package com.monetization.ads.quality.base.result;

import com.monetization.ads.quality.base.AdQualityVerificationStateFlow;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface AdQualityVerificationResult {

    @Metadata
    public static final class NotImplemented implements AdQualityVerificationResult {

        @NotNull
        public static final NotImplemented INSTANCE = new NotImplemented();

        private NotImplemented() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof NotImplemented);
        }

        public int hashCode() {
            return -293539646;
        }

        @NotNull
        public String toString() {
            return "NotImplemented";
        }
    }

    @Metadata
    public static final class NotVerified implements AdQualityVerificationResult {

        @NotNull
        private final AdQualityVerificationError reason;

        public NotVerified(@NotNull AdQualityVerificationError reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }

        public static /* synthetic */ NotVerified copy$default(NotVerified notVerified, AdQualityVerificationError adQualityVerificationError, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                adQualityVerificationError = notVerified.reason;
            }
            return notVerified.copy(adQualityVerificationError);
        }

        @NotNull
        public final AdQualityVerificationError component1() {
            return this.reason;
        }

        @NotNull
        public final NotVerified copy(@NotNull AdQualityVerificationError reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new NotVerified(reason);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotVerified) && Intrinsics.areEqual(this.reason, ((NotVerified) obj).reason);
        }

        @NotNull
        public final AdQualityVerificationError getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return "NotVerified(reason=" + this.reason + ")";
        }
    }

    @Metadata
    public static final class Verified implements AdQualityVerificationResult {

        @NotNull
        private final AdQualityVerificationStateFlow verifiedAd;

        public Verified(@NotNull AdQualityVerificationStateFlow verifiedAd) {
            Intrinsics.checkNotNullParameter(verifiedAd, "verifiedAd");
            this.verifiedAd = verifiedAd;
        }

        public static /* synthetic */ Verified copy$default(Verified verified, AdQualityVerificationStateFlow adQualityVerificationStateFlow, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                adQualityVerificationStateFlow = verified.verifiedAd;
            }
            return verified.copy(adQualityVerificationStateFlow);
        }

        @NotNull
        public final AdQualityVerificationStateFlow component1() {
            return this.verifiedAd;
        }

        @NotNull
        public final Verified copy(@NotNull AdQualityVerificationStateFlow verifiedAd) {
            Intrinsics.checkNotNullParameter(verifiedAd, "verifiedAd");
            return new Verified(verifiedAd);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Verified) && Intrinsics.areEqual(this.verifiedAd, ((Verified) obj).verifiedAd);
        }

        @NotNull
        public final AdQualityVerificationStateFlow getVerifiedAd() {
            return this.verifiedAd;
        }

        public int hashCode() {
            return this.verifiedAd.hashCode();
        }

        @NotNull
        public String toString() {
            return "Verified(verifiedAd=" + this.verifiedAd + ")";
        }
    }

    @Metadata
    public static final class WaitingForVerification implements AdQualityVerificationResult {

        @NotNull
        public static final WaitingForVerification INSTANCE = new WaitingForVerification();

        private WaitingForVerification() {
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof WaitingForVerification);
        }

        public int hashCode() {
            return 393213194;
        }

        @NotNull
        public String toString() {
            return "WaitingForVerification";
        }
    }
}

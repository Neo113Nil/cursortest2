package com.monetization.ads.quality.base.model;

import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class AdQualityVerificationError {

    @NotNull
    private static final a Code = new a(0);

    @Deprecated
    public static final int INTERNAL_ERROR = 1;

    @Deprecated
    public static final int INVALID_REQUEST = 2;

    @Deprecated
    public static final int UNKNOWN_ERROR = 0;
    private final int code;

    @NotNull
    private final String description;

    @Metadata
    public static final class DisabledError extends AdQualityVerificationError {
        public DisabledError() {
            super(1, "The ad verification is disabled by configuration", null);
        }
    }

    @Metadata
    public static final class InitializationAlreadyInProcess extends AdQualityVerificationError {
        public InitializationAlreadyInProcess() {
            super(1, "The verification initialization is already in progress", null);
        }
    }

    @Metadata
    public static final class InternalError extends AdQualityVerificationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalError(@NotNull String description) {
            super(1, "The ad verification build in error: " + description, null);
            Intrinsics.checkNotNullParameter(description, "description");
        }
    }

    @Metadata
    public static final class InvalidAdObject extends AdQualityVerificationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidAdObject(@NotNull AdQualityVerifiableNetwork network) {
            super(2, "The ad object for verification " + network.name() + " is invalid", null);
            Intrinsics.checkNotNullParameter(network, "network");
        }
    }

    @Metadata
    public static final class InvalidInit extends AdQualityVerificationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidInit(@NotNull String errorDescription) {
            super(1, "The verifier initialization error: " + errorDescription, null);
            Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        }
    }

    @Metadata
    public static final class LowUsagePercent extends AdQualityVerificationError {
        public LowUsagePercent() {
            super(1, "The ad verification is not in percent usage", null);
        }
    }

    @Metadata
    public static final class TimeoutError extends AdQualityVerificationError {
        public TimeoutError(long j4) {
            super(1, "The ad verifications timed out after " + j4, null);
        }
    }

    @Metadata
    public static final class UnknownError extends AdQualityVerificationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownError(@NotNull String description) {
            super(0, "The ad verification failed with error: " + description, null);
            Intrinsics.checkNotNullParameter(description, "description");
        }
    }

    @Metadata
    public static final class UnsupportedNetwork extends AdQualityVerificationError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnsupportedNetwork(@NotNull AdQualityVerifiableNetwork network) {
            super(2, "The " + network.name() + " is unsupported for verification", null);
            Intrinsics.checkNotNullParameter(network, "network");
        }
    }

    private static final class a {
        public /* synthetic */ a(int i4) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ AdQualityVerificationError(int i4, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, str);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public String toString() {
        return "Ad verification error: (code: " + this.code + ", description: " + this.description + ")";
    }

    private AdQualityVerificationError(int i4, String str) {
        this.code = i4;
        this.description = str;
    }
}

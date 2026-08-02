package com.squareup.cash.support.backend.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;

/* loaded from: classes7.dex */
public interface DisputesTrackerService$DisputesHistoryResult {

    public final class Failure implements DisputesTrackerService$DisputesHistoryResult {
        public final ErrorType errorType;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class ErrorType {
            public static final /* synthetic */ ErrorType[] $VALUES;
            public static final ErrorType INVALID_SERVER_RESPONSE;
            public static final ErrorType NETWORK_ERROR;

            static {
                ErrorType errorType = new ErrorType("NETWORK_ERROR", 0);
                NETWORK_ERROR = errorType;
                ErrorType errorType2 = new ErrorType("INVALID_SERVER_RESPONSE", 1);
                INVALID_SERVER_RESPONSE = errorType2;
                $VALUES = new ErrorType[]{errorType, errorType2};
            }

            public static ErrorType valueOf(String str) {
                return (ErrorType) Enum.valueOf(ErrorType.class, str);
            }

            public static ErrorType[] values() {
                return (ErrorType[]) $VALUES.clone();
            }
        }

        public Failure(ErrorType errorType) {
            this.errorType = errorType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && this.errorType == ((Failure) obj).errorType;
        }

        public final int hashCode() {
            return this.errorType.hashCode();
        }

        public final String toString() {
            return "Failure(errorType=" + this.errorType + ")";
        }
    }

    public final class Success implements DisputesTrackerService$DisputesHistoryResult {
        public final int activeClaims;
        public final int totalClaims;

        public Success(int i, int i2) {
            this.totalClaims = i;
            this.activeClaims = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return this.totalClaims == success.totalClaims && this.activeClaims == success.activeClaims;
        }

        public final int hashCode() {
            return Integer.hashCode(this.activeClaims) + (Integer.hashCode(this.totalClaims) * 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline2.m(this.totalClaims, this.activeClaims, "Success(totalClaims=", ", activeClaims=", ")");
        }
    }
}

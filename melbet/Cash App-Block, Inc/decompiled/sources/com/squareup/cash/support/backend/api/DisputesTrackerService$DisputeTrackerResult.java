package com.squareup.cash.support.backend.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface DisputesTrackerService$DisputeTrackerResult {

    public final class Failure implements DisputesTrackerService$DisputeTrackerResult {
        public final String errorBody;
        public final String errorTitle;
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

        public Failure(String str, String str2, ErrorType errorType) {
            str.getClass();
            str2.getClass();
            this.errorTitle = str;
            this.errorBody = str2;
            this.errorType = errorType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.areEqual(this.errorTitle, failure.errorTitle) && Intrinsics.areEqual(this.errorBody, failure.errorBody) && this.errorType == failure.errorType;
        }

        public final int hashCode() {
            return this.errorType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.errorTitle.hashCode() * 31, 31, this.errorBody);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failure(errorTitle=", this.errorTitle, ", errorBody=", this.errorBody, ", errorType=");
            m.append(this.errorType);
            m.append(")");
            return m.toString();
        }
    }

    public final class Success implements DisputesTrackerService$DisputeTrackerResult {
        public final List disputesList;
        public final boolean hasMoreDisputes;

        public Success(List list, boolean z) {
            list.getClass();
            this.disputesList = list;
            this.hasMoreDisputes = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.disputesList, success.disputesList) && this.hasMoreDisputes == success.hasMoreDisputes;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasMoreDisputes) + (this.disputesList.hashCode() * 31);
        }

        public final String toString() {
            return "Success(disputesList=" + this.disputesList + ", hasMoreDisputes=" + this.hasMoreDisputes + ")";
        }
    }
}

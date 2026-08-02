package com.squareup.cash.support.backend.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface SupportEmailValidationService$EmailValidationResult {

    public final class Failure implements SupportEmailValidationService$EmailValidationResult {
        public final String errorBody;
        public final String errorTitle;
        public final ErrorType errorType;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class ErrorType {
            public static final /* synthetic */ ErrorType[] $VALUES;
            public static final ErrorType NETWORK;
            public static final ErrorType VALIDATION;

            static {
                ErrorType errorType = new ErrorType("VALIDATION", 0);
                VALIDATION = errorType;
                ErrorType errorType2 = new ErrorType("NETWORK", 1);
                NETWORK = errorType2;
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

    public final class Success implements SupportEmailValidationService$EmailValidationResult {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return -34567383;
        }

        public final String toString() {
            return "Success";
        }
    }
}

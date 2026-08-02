package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class CreateInquiryResult {

    public final class Error extends CreateInquiryResult {
        public final InternalErrorInfo cause;
        public final String debugMessage;

        public Error(String str, InternalErrorInfo internalErrorInfo) {
            internalErrorInfo.getClass();
            this.debugMessage = str;
            this.cause = internalErrorInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.debugMessage, error.debugMessage) && Intrinsics.areEqual(this.cause, error.cause);
        }

        public final int hashCode() {
            String str = this.debugMessage;
            return this.cause.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "Error(debugMessage=" + this.debugMessage + ", cause=" + this.cause + ")";
        }
    }

    public final class Success extends CreateInquiryResult {
        public final String fallbackSessionToken;
        public final String inquiryId;
        public final InquirySessionDataWrapper inquirySession;
        public final NextStep nextStep;

        public Success(String str, NextStep nextStep, String str2, InquirySessionDataWrapper inquirySessionDataWrapper) {
            str.getClass();
            nextStep.getClass();
            this.inquiryId = str;
            this.nextStep = nextStep;
            this.fallbackSessionToken = str2;
            this.inquirySession = inquirySessionDataWrapper;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.inquiryId, success.inquiryId) && Intrinsics.areEqual(this.nextStep, success.nextStep) && Intrinsics.areEqual(this.fallbackSessionToken, success.fallbackSessionToken) && Intrinsics.areEqual(this.inquirySession, success.inquirySession);
        }

        public final int hashCode() {
            int hashCode = (this.nextStep.hashCode() + (this.inquiryId.hashCode() * 31)) * 31;
            String str = this.fallbackSessionToken;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            InquirySessionDataWrapper inquirySessionDataWrapper = this.inquirySession;
            return hashCode2 + (inquirySessionDataWrapper != null ? inquirySessionDataWrapper.hashCode() : 0);
        }

        public final String toString() {
            return "Success(inquiryId=" + this.inquiryId + ", nextStep=" + this.nextStep + ", fallbackSessionToken=" + this.fallbackSessionToken + ", inquirySession=" + this.inquirySession + ")";
        }
    }
}

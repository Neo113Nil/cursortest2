package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class CreateInquirySessionResult {

    public final class Error extends CreateInquirySessionResult {
        public final InternalErrorInfo cause;

        public Error(InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
            networkErrorInfo.getClass();
            this.cause = networkErrorInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.cause, ((Error) obj).cause);
        }

        public final int hashCode() {
            return this.cause.hashCode();
        }

        public final String toString() {
            return "Error(cause=" + this.cause + ")";
        }
    }

    public final class Success extends CreateInquirySessionResult {
        public final InquirySessionConfig inquirySessionConfig;
        public final String sessionToken;

        public Success(String str, InquirySessionConfig inquirySessionConfig) {
            str.getClass();
            inquirySessionConfig.getClass();
            this.sessionToken = str;
            this.inquirySessionConfig = inquirySessionConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.sessionToken, success.sessionToken) && Intrinsics.areEqual(this.inquirySessionConfig, success.inquirySessionConfig);
        }

        public final int hashCode() {
            return this.inquirySessionConfig.hashCode() + (this.sessionToken.hashCode() * 31);
        }

        public final String toString() {
            return "Success(sessionToken=" + this.sessionToken + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
        }
    }
}

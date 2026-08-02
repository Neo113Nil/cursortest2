package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class ExchangeOneTimeCodeResult {

    public final class Error extends ExchangeOneTimeCodeResult {
        public final InternalErrorInfo cause;

        public Error(InternalErrorInfo internalErrorInfo) {
            internalErrorInfo.getClass();
            this.cause = internalErrorInfo;
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

    public final class Success extends ExchangeOneTimeCodeResult {
        public final String inquiryId;
        public final InquirySessionConfig inquirySessionConfig;
        public final String sessionToken;

        public Success(String str, String str2, InquirySessionConfig inquirySessionConfig) {
            this.inquiryId = str;
            this.sessionToken = str2;
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
            return this.inquiryId.equals(success.inquiryId) && this.sessionToken.equals(success.sessionToken) && this.inquirySessionConfig.equals(success.inquirySessionConfig);
        }

        public final int hashCode() {
            return this.inquirySessionConfig.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.inquiryId.hashCode() * 31, 31, this.sessionToken);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(inquiryId=", this.inquiryId, ", sessionToken=", this.sessionToken, ", inquirySessionConfig=");
            m.append(this.inquirySessionConfig);
            m.append(")");
            return m.toString();
        }
    }
}

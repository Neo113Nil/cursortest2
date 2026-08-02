package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class TransitionBackResult {

    public final class Error extends TransitionBackResult {
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

    public final class Success extends TransitionBackResult {
        public final InquiryState nextState;

        public Success(InquiryState inquiryState) {
            this.nextState = inquiryState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.nextState.equals(((Success) obj).nextState);
        }

        public final int hashCode() {
            return this.nextState.hashCode();
        }

        public final String toString() {
            return "Success(nextState=" + this.nextState + ")";
        }
    }
}

package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class TransitionWorker$Response {

    public final class Error extends TransitionWorker$Response {
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

    public final class Success extends TransitionWorker$Response {
        public final InquiryState nextState;

        public Success(InquiryState inquiryState) {
            this.nextState = inquiryState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.nextState, ((Success) obj).nextState);
        }

        public final int hashCode() {
            InquiryState inquiryState = this.nextState;
            if (inquiryState == null) {
                return 0;
            }
            return inquiryState.hashCode();
        }

        public final String toString() {
            return "Success(nextState=" + this.nextState + ")";
        }
    }
}

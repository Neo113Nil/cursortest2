package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;

/* loaded from: classes9.dex */
public abstract class VerifyDeviceIntegrityResult {

    public final class Error extends VerifyDeviceIntegrityResult {
        public final InternalErrorInfo cause;

        public Error(InternalErrorInfo internalErrorInfo) {
            this.cause = internalErrorInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.cause.equals(((Error) obj).cause);
        }

        public final int hashCode() {
            return this.cause.hashCode();
        }

        public final String toString() {
            return "Error(cause=" + this.cause + ")";
        }
    }

    public final class Success extends VerifyDeviceIntegrityResult {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return -888968121;
        }

        public final String toString() {
            return "Success";
        }
    }
}

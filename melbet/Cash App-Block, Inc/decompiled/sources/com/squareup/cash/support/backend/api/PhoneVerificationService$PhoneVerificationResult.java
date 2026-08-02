package com.squareup.cash.support.backend.api;

import androidx.glance.layout.BoxKt;
import app.cash.api.ApiResult;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface PhoneVerificationService$PhoneVerificationResult {

    public final class Failure implements PhoneVerificationService$PhoneVerificationResult {
        public final ApiResult.Failure failureType;

        public Failure(ApiResult.Failure failure) {
            this.failureType = failure;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && this.failureType.equals(((Failure) obj).failureType);
        }

        public final int hashCode() {
            return this.failureType.hashCode();
        }

        public final String toString() {
            return "Failure(failureType=" + this.failureType + ")";
        }
    }

    public final class Success implements PhoneVerificationService$PhoneVerificationResult {
        public final String articleToken;
        public final String message;
        public final String title;
        public final BoxKt verificationState;

        public Success(BoxKt boxKt, String str, String str2, String str3) {
            this.verificationState = boxKt;
            this.title = str;
            this.message = str2;
            this.articleToken = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return this.verificationState.equals(success.verificationState) && this.title.equals(success.title) && this.message.equals(success.message) && Intrinsics.areEqual(this.articleToken, success.articleToken);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.verificationState.hashCode() * 31, 31, this.title), 31, this.message);
            String str = this.articleToken;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(verificationState=");
            sb.append(this.verificationState);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", message=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.message, ", articleToken=", this.articleToken, ")");
        }
    }
}

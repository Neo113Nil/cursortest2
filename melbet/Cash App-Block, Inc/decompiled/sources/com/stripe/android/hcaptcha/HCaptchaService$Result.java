package com.stripe.android.hcaptcha;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public interface HCaptchaService$Result {

    public final class Failure implements HCaptchaService$Result {
        public final Throwable error;

        public Failure(Throwable th) {
            th.getClass();
            this.error = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.areEqual(this.error, ((Failure) obj).error);
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("Failure(error=", ")", this.error);
        }
    }

    public final class Success implements HCaptchaService$Result {
        public final String token;

        public Success(String str) {
            str.getClass();
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.token, ((Success) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(token=", this.token, ")");
        }
    }
}

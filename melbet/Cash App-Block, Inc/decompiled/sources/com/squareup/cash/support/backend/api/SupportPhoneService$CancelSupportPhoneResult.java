package com.squareup.cash.support.backend.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface SupportPhoneService$CancelSupportPhoneResult {

    public final class Error implements SupportPhoneService$CancelSupportPhoneResult {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 887734311;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Success implements SupportPhoneService$CancelSupportPhoneResult {
        public final String message;
        public final String title;

        public Success(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.message = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.title, success.title) && Intrinsics.areEqual(this.message, success.message);
        }

        public final int hashCode() {
            return this.message.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Success(title=", this.title, ", message=", this.message, ")");
        }
    }
}

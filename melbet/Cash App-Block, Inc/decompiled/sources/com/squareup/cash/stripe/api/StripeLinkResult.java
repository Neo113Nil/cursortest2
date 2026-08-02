package com.squareup.cash.stripe.api;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface StripeLinkResult {

    public final class Canceled implements StripeLinkResult {
        public static final Canceled INSTANCE = new Canceled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Canceled);
        }

        public final int hashCode() {
            return 1160884000;
        }

        public final String toString() {
            return "Canceled";
        }
    }

    public final class ManualLink implements StripeLinkResult {
        public static final ManualLink INSTANCE = new ManualLink();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ManualLink);
        }

        public final int hashCode() {
            return -72196697;
        }

        public final String toString() {
            return "ManualLink";
        }
    }

    public final class Success implements StripeLinkResult {
        public final String accountId;
        public final String institutionName;
        public final String paymentMethodId;

        public Success(String str, String str2, String str3) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.accountId = str;
            this.paymentMethodId = str2;
            this.institutionName = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.accountId, success.accountId) && Intrinsics.areEqual(this.paymentMethodId, success.paymentMethodId) && Intrinsics.areEqual(this.institutionName, success.institutionName);
        }

        public final int hashCode() {
            return this.institutionName.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.accountId.hashCode() * 31, 31, this.paymentMethodId);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(accountId=", this.accountId, ", paymentMethodId=", this.paymentMethodId, ", institutionName="), this.institutionName, ")");
        }
    }
}

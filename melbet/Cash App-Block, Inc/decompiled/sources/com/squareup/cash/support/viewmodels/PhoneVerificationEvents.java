package com.squareup.cash.support.viewmodels;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface PhoneVerificationEvents {

    public final class Close implements PhoneVerificationEvents {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1068029758;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class LearnMore implements PhoneVerificationEvents {
        public final String articleToken;

        public LearnMore(String str) {
            str.getClass();
            this.articleToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LearnMore) && Intrinsics.areEqual(this.articleToken, ((LearnMore) obj).articleToken);
        }

        public final int hashCode() {
            return this.articleToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LearnMore(articleToken=", this.articleToken, ")");
        }
    }

    public final class Reject implements PhoneVerificationEvents {
        public static final Reject INSTANCE = new Reject();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Reject);
        }

        public final int hashCode() {
            return -828005607;
        }

        public final String toString() {
            return "Reject";
        }
    }

    public final class Retry implements PhoneVerificationEvents {
        public static final Retry INSTANCE = new Retry();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Retry);
        }

        public final int hashCode() {
            return 1081678830;
        }

        public final String toString() {
            return "Retry";
        }
    }

    public final class Verify implements PhoneVerificationEvents {
        public static final Verify INSTANCE = new Verify();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Verify);
        }

        public final int hashCode() {
            return -713246733;
        }

        public final String toString() {
            return "Verify";
        }
    }
}

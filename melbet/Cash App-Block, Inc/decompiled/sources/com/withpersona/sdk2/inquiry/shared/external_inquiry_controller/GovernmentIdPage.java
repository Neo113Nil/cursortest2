package com.withpersona.sdk2.inquiry.shared.external_inquiry_controller;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public interface GovernmentIdPage {

    public final class AutoClassificationFailure implements GovernmentIdPage {
        public static final AutoClassificationFailure INSTANCE = new AutoClassificationFailure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AutoClassificationFailure);
        }

        public final int hashCode() {
            return -1856828727;
        }

        public final String toString() {
            return "AutoClassificationFailure";
        }
    }

    public final class AutoClassificationSelect implements GovernmentIdPage {
        public static final AutoClassificationSelect INSTANCE = new AutoClassificationSelect();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AutoClassificationSelect);
        }

        public final int hashCode() {
            return 454604765;
        }

        public final String toString() {
            return "AutoClassificationSelect";
        }
    }

    public final class Check implements GovernmentIdPage {
        public final int pageIndex;

        public Check(int i) {
            this.pageIndex = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Check) && this.pageIndex == ((Check) obj).pageIndex;
        }

        public final int hashCode() {
            return Integer.hashCode(this.pageIndex);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.pageIndex, "Check(pageIndex=", ")");
        }
    }

    public final class CheckUpload implements GovernmentIdPage {
        public final int pageIndex;

        public CheckUpload(int i) {
            this.pageIndex = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CheckUpload) && this.pageIndex == ((CheckUpload) obj).pageIndex;
        }

        public final int hashCode() {
            return Integer.hashCode(this.pageIndex);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.pageIndex, "CheckUpload(pageIndex=", ")");
        }
    }

    public final class Pending implements GovernmentIdPage {
        public static final Pending INSTANCE = new Pending();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Pending);
        }

        public final int hashCode() {
            return 35282187;
        }

        public final String toString() {
            return "Pending";
        }
    }

    public final class Prompt implements GovernmentIdPage {
        public final int pageIndex;

        public Prompt(int i) {
            this.pageIndex = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Prompt) && this.pageIndex == ((Prompt) obj).pageIndex;
        }

        public final int hashCode() {
            return Integer.hashCode(this.pageIndex);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.pageIndex, "Prompt(pageIndex=", ")");
        }
    }

    public final class Select implements GovernmentIdPage {
        public static final Select INSTANCE = new Select();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Select);
        }

        public final int hashCode() {
            return 364061448;
        }

        public final String toString() {
            return "Select";
        }
    }

    public final class TakePhoto implements GovernmentIdPage {
        public final int pageIndex;

        public TakePhoto(int i) {
            this.pageIndex = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TakePhoto) && this.pageIndex == ((TakePhoto) obj).pageIndex;
        }

        public final int hashCode() {
            return Integer.hashCode(this.pageIndex);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.pageIndex, "TakePhoto(pageIndex=", ")");
        }
    }
}

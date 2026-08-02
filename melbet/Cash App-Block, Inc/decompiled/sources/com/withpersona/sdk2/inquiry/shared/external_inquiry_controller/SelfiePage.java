package com.withpersona.sdk2.inquiry.shared.external_inquiry_controller;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public interface SelfiePage {

    public final class CheckUpload implements SelfiePage {
        public static final CheckUpload INSTANCE = new CheckUpload();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CheckUpload);
        }

        public final int hashCode() {
            return 1416782425;
        }

        public final String toString() {
            return "CheckUpload";
        }
    }

    public final class FinalizeVideo implements SelfiePage {
        public static final FinalizeVideo INSTANCE = new FinalizeVideo();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FinalizeVideo);
        }

        public final int hashCode() {
            return -576649171;
        }

        public final String toString() {
            return "FinalizeVideo";
        }
    }

    public final class LeadInAnimation implements SelfiePage {
        public final String pose;

        public LeadInAnimation(String str) {
            this.pose = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LeadInAnimation) && Intrinsics.areEqual(this.pose, ((LeadInAnimation) obj).pose);
        }

        public final int hashCode() {
            String str = this.pose;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LeadInAnimation(pose=", this.pose, ")");
        }
    }

    public final class Pending implements SelfiePage {
        public static final Pending INSTANCE = new Pending();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Pending);
        }

        public final int hashCode() {
            return -238548281;
        }

        public final String toString() {
            return "Pending";
        }
    }

    public final class Prompt implements SelfiePage {
        public static final Prompt INSTANCE = new Prompt();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Prompt);
        }

        public final int hashCode() {
            return 1251275316;
        }

        public final String toString() {
            return "Prompt";
        }
    }

    public final class TakePhoto implements SelfiePage {
        public final String pose;

        public TakePhoto(String str) {
            this.pose = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TakePhoto) && Intrinsics.areEqual(this.pose, ((TakePhoto) obj).pose);
        }

        public final int hashCode() {
            String str = this.pose;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TakePhoto(pose=", this.pose, ")");
        }
    }
}

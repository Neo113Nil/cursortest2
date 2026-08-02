package com.squareup.cash.support.viewmodels;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ScreenshotReviewViewEvent {

    public final class AbortSendingScreenshots implements ScreenshotReviewViewEvent {
        public static final AbortSendingScreenshots INSTANCE = new AbortSendingScreenshots();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AbortSendingScreenshots);
        }

        public final int hashCode() {
            return -321545538;
        }

        public final String toString() {
            return "AbortSendingScreenshots";
        }
    }

    public final class AbortTakingScreenshots implements ScreenshotReviewViewEvent {
        public static final AbortTakingScreenshots INSTANCE = new AbortTakingScreenshots();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AbortTakingScreenshots);
        }

        public final int hashCode() {
            return 251307422;
        }

        public final String toString() {
            return "AbortTakingScreenshots";
        }
    }

    public final class Back implements ScreenshotReviewViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -909765268;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    public final class Close implements ScreenshotReviewViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1863310867;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class DismissViewScreenshot implements ScreenshotReviewViewEvent {
        public static final DismissViewScreenshot INSTANCE = new DismissViewScreenshot();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissViewScreenshot);
        }

        public final int hashCode() {
            return -209452752;
        }

        public final String toString() {
            return "DismissViewScreenshot";
        }
    }

    public final class Done implements ScreenshotReviewViewEvent {
        public static final Done INSTANCE = new Done();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Done);
        }

        public final int hashCode() {
            return -909691897;
        }

        public final String toString() {
            return "Done";
        }
    }

    public final class ErrorDisplayed implements ScreenshotReviewViewEvent {
        public static final ErrorDisplayed INSTANCE = new ErrorDisplayed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ErrorDisplayed);
        }

        public final int hashCode() {
            return -274988546;
        }

        public final String toString() {
            return "ErrorDisplayed";
        }
    }

    public final class RemoveScreenshot implements ScreenshotReviewViewEvent {
        public final String screenshotUri;

        public RemoveScreenshot(String str) {
            str.getClass();
            this.screenshotUri = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveScreenshot) && Intrinsics.areEqual(this.screenshotUri, ((RemoveScreenshot) obj).screenshotUri);
        }

        public final int hashCode() {
            return this.screenshotUri.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RemoveScreenshot(screenshotUri=", this.screenshotUri, ")");
        }
    }

    public final class SendScreenshots implements ScreenshotReviewViewEvent {
        public static final SendScreenshots INSTANCE = new SendScreenshots();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SendScreenshots);
        }

        public final int hashCode() {
            return 985159040;
        }

        public final String toString() {
            return "SendScreenshots";
        }
    }

    public final class TakeMoreScreenshots implements ScreenshotReviewViewEvent {
        public static final TakeMoreScreenshots INSTANCE = new TakeMoreScreenshots();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TakeMoreScreenshots);
        }

        public final int hashCode() {
            return 463132300;
        }

        public final String toString() {
            return "TakeMoreScreenshots";
        }
    }

    /* loaded from: classes9.dex */
    public final class ViewScreenshot implements ScreenshotReviewViewEvent {
        public final String screenshotUri;

        public ViewScreenshot(String str) {
            str.getClass();
            this.screenshotUri = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewScreenshot) && Intrinsics.areEqual(this.screenshotUri, ((ViewScreenshot) obj).screenshotUri);
        }

        public final int hashCode() {
            return this.screenshotUri.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ViewScreenshot(screenshotUri=", this.screenshotUri, ")");
        }
    }
}

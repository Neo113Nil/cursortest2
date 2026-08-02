package com.squareup.cash.support.screenshot;

import com.squareup.cash.support.screens.SupportScreens;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ScreenshotViewEvent {

    public final class Done implements ScreenshotViewEvent {
        public final SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs;

        public Done(SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs) {
            screenshotArgs.getClass();
            this.screenshotArgs = screenshotArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Done) && Intrinsics.areEqual(this.screenshotArgs, ((Done) obj).screenshotArgs);
        }

        public final SupportScreens.ScreenshotScreen.ScreenshotArgs getScreenshotArgs() {
            return this.screenshotArgs;
        }

        public final int hashCode() {
            return this.screenshotArgs.hashCode();
        }

        public final String toString() {
            return "Done(screenshotArgs=" + this.screenshotArgs + ")";
        }
    }

    public final class PreparationCompleted implements ScreenshotViewEvent {
        public final SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs;

        public PreparationCompleted(SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs) {
            screenshotArgs.getClass();
            this.screenshotArgs = screenshotArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PreparationCompleted) && Intrinsics.areEqual(this.screenshotArgs, ((PreparationCompleted) obj).screenshotArgs);
        }

        public final int hashCode() {
            return this.screenshotArgs.hashCode();
        }

        public final String toString() {
            return "PreparationCompleted(screenshotArgs=" + this.screenshotArgs + ")";
        }
    }

    public final class ScreenshotResultDisplayed implements ScreenshotViewEvent {
        public final SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs;

        public ScreenshotResultDisplayed(SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs) {
            screenshotArgs.getClass();
            this.screenshotArgs = screenshotArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScreenshotResultDisplayed) && Intrinsics.areEqual(this.screenshotArgs, ((ScreenshotResultDisplayed) obj).screenshotArgs);
        }

        public final int hashCode() {
            return this.screenshotArgs.hashCode();
        }

        public final String toString() {
            return "ScreenshotResultDisplayed(screenshotArgs=" + this.screenshotArgs + ")";
        }
    }

    public final class TakeScreenshot implements ScreenshotViewEvent {
        public final SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs;

        public TakeScreenshot(SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs) {
            screenshotArgs.getClass();
            this.screenshotArgs = screenshotArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TakeScreenshot) && Intrinsics.areEqual(this.screenshotArgs, ((TakeScreenshot) obj).screenshotArgs);
        }

        public final SupportScreens.ScreenshotScreen.ScreenshotArgs getScreenshotArgs() {
            return this.screenshotArgs;
        }

        public final int hashCode() {
            return this.screenshotArgs.hashCode();
        }

        public final String toString() {
            return "TakeScreenshot(screenshotArgs=" + this.screenshotArgs + ")";
        }
    }
}

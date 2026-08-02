package com.squareup.cash.support.screenshot;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface ScreenshotManager$ScreenshotResult {

    /* loaded from: classes7.dex */
    public final class Failed implements ScreenshotManager$ScreenshotResult {
        public static final Failed INSTANCE = new Failed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public final int hashCode() {
            return 579608426;
        }

        public final String toString() {
            return "Failed";
        }
    }

    /* loaded from: classes7.dex */
    public final class Prohibited implements ScreenshotManager$ScreenshotResult {
        public static final Prohibited INSTANCE = new Prohibited();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Prohibited);
        }

        public final int hashCode() {
            return -1120210069;
        }

        public final String toString() {
            return "Prohibited";
        }
    }

    /* loaded from: classes7.dex */
    public final class Success implements ScreenshotManager$ScreenshotResult {
        public final Bitmap screenshot;

        public Success(Bitmap bitmap) {
            bitmap.getClass();
            this.screenshot = bitmap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.screenshot, ((Success) obj).screenshot);
        }

        public final Bitmap getScreenshot() {
            return this.screenshot;
        }

        public final int hashCode() {
            return this.screenshot.hashCode();
        }

        public final String toString() {
            return "Success(screenshot=" + this.screenshot + ")";
        }
    }
}

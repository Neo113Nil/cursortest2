package com.squareup.cash.support.viewmodels;

import android.net.Uri;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ScreenshotReviewViewModel {

    public final class Loaded implements ScreenshotReviewViewModel {
        public final List screenshotList;
        public final boolean showQuitConfirmation;

        public Loaded(List list, boolean z) {
            list.getClass();
            this.screenshotList = list;
            this.showQuitConfirmation = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.screenshotList, loaded.screenshotList) && this.showQuitConfirmation == loaded.showQuitConfirmation;
        }

        @Override // com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel
        public final List getScreenshotList() {
            return this.screenshotList;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showQuitConfirmation) + (this.screenshotList.hashCode() * 31);
        }

        public final String toString() {
            return "Loaded(screenshotList=" + this.screenshotList + ", showQuitConfirmation=" + this.showQuitConfirmation + ")";
        }
    }

    public final class Screenshot {
        public final String fileName;
        public final UploadStatus uploadStatus;
        public final Uri uri;

        public Screenshot(Uri uri, String str, UploadStatus uploadStatus) {
            uri.getClass();
            this.uri = uri;
            this.fileName = str;
            this.uploadStatus = uploadStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Screenshot)) {
                return false;
            }
            Screenshot screenshot = (Screenshot) obj;
            return Intrinsics.areEqual(this.uri, screenshot.uri) && Intrinsics.areEqual(this.fileName, screenshot.fileName) && this.uploadStatus == screenshot.uploadStatus;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.uri.hashCode() * 31, 31, this.fileName);
            UploadStatus uploadStatus = this.uploadStatus;
            return m + (uploadStatus == null ? 0 : uploadStatus.hashCode());
        }

        public final String toString() {
            return "Screenshot(uri=" + this.uri + ", fileName=" + this.fileName + ", uploadStatus=" + this.uploadStatus + ")";
        }
    }

    public final class UploadFailed implements ScreenshotReviewViewModel {
        public final List screenshotList;

        public UploadFailed(List list) {
            list.getClass();
            this.screenshotList = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UploadFailed) && Intrinsics.areEqual(this.screenshotList, ((UploadFailed) obj).screenshotList);
        }

        @Override // com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel
        public final List getScreenshotList() {
            return this.screenshotList;
        }

        public final int hashCode() {
            return this.screenshotList.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("UploadFailed(screenshotList=", ")", this.screenshotList);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class UploadStatus {
        public static final /* synthetic */ UploadStatus[] $VALUES;
        public static final UploadStatus FAILED;
        public static final UploadStatus UPLOADED;
        public static final UploadStatus UPLOADING;

        static {
            UploadStatus uploadStatus = new UploadStatus("UPLOADING", 0);
            UPLOADING = uploadStatus;
            UploadStatus uploadStatus2 = new UploadStatus("UPLOADED", 1);
            UPLOADED = uploadStatus2;
            UploadStatus uploadStatus3 = new UploadStatus("FAILED", 2);
            FAILED = uploadStatus3;
            $VALUES = new UploadStatus[]{uploadStatus, uploadStatus2, uploadStatus3};
        }

        public static UploadStatus valueOf(String str) {
            return (UploadStatus) Enum.valueOf(UploadStatus.class, str);
        }

        public static UploadStatus[] values() {
            return (UploadStatus[]) $VALUES.clone();
        }
    }

    public final class Uploaded implements ScreenshotReviewViewModel {
        public final String doneButtonText;
        public final List screenshotList;

        public Uploaded(List list, String str) {
            list.getClass();
            str.getClass();
            this.screenshotList = list;
            this.doneButtonText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uploaded)) {
                return false;
            }
            Uploaded uploaded = (Uploaded) obj;
            return Intrinsics.areEqual(this.screenshotList, uploaded.screenshotList) && Intrinsics.areEqual(this.doneButtonText, uploaded.doneButtonText);
        }

        @Override // com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel
        public final List getScreenshotList() {
            return this.screenshotList;
        }

        public final int hashCode() {
            return this.doneButtonText.hashCode() + (this.screenshotList.hashCode() * 31);
        }

        public final String toString() {
            return "Uploaded(screenshotList=" + this.screenshotList + ", doneButtonText=" + this.doneButtonText + ")";
        }
    }

    public final class Uploading implements ScreenshotReviewViewModel {
        public final List screenshotList;
        public final int totalCount;
        public final int uploadCount;

        public Uploading(int i, int i2, List list) {
            list.getClass();
            this.screenshotList = list;
            this.uploadCount = i;
            this.totalCount = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uploading)) {
                return false;
            }
            Uploading uploading = (Uploading) obj;
            return Intrinsics.areEqual(this.screenshotList, uploading.screenshotList) && this.uploadCount == uploading.uploadCount && this.totalCount == uploading.totalCount;
        }

        @Override // com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel
        public final List getScreenshotList() {
            return this.screenshotList;
        }

        public final int hashCode() {
            return Integer.hashCode(this.totalCount) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.uploadCount, this.screenshotList.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Uploading(screenshotList=");
            sb.append(this.screenshotList);
            sb.append(", uploadCount=");
            sb.append(this.uploadCount);
            sb.append(", totalCount=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.totalCount, ")", sb);
        }
    }

    public final class ViewingScreenshot implements ScreenshotReviewViewModel {
        public final List screenshotList;
        public final String viewScreenshotUri;

        public ViewingScreenshot(List list, String str) {
            list.getClass();
            this.screenshotList = list;
            this.viewScreenshotUri = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewingScreenshot)) {
                return false;
            }
            ViewingScreenshot viewingScreenshot = (ViewingScreenshot) obj;
            return Intrinsics.areEqual(this.screenshotList, viewingScreenshot.screenshotList) && this.viewScreenshotUri.equals(viewingScreenshot.viewScreenshotUri);
        }

        @Override // com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel
        public final List getScreenshotList() {
            return this.screenshotList;
        }

        public final int hashCode() {
            return this.viewScreenshotUri.hashCode() + (this.screenshotList.hashCode() * 31);
        }

        public final String toString() {
            return "ViewingScreenshot(screenshotList=" + this.screenshotList + ", viewScreenshotUri=" + this.viewScreenshotUri + ")";
        }
    }

    List getScreenshotList();
}

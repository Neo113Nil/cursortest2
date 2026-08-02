package com.squareup.cash.support.backend.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ScreenshotService$ServiceState {

    public final class Canceled implements ScreenshotService$ServiceState {
        public final List fileStates;

        public Canceled(List list) {
            list.getClass();
            this.fileStates = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Canceled) && Intrinsics.areEqual(this.fileStates, ((Canceled) obj).fileStates);
        }

        @Override // com.squareup.cash.support.backend.api.ScreenshotService$ServiceState
        public final List getFileStates() {
            return this.fileStates;
        }

        public final int hashCode() {
            return this.fileStates.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Canceled(fileStates=", ")", this.fileStates);
        }
    }

    public final class Failed implements ScreenshotService$ServiceState {
        public final FailReason failReason;
        public final List fileStates;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class FailReason {
            public static final /* synthetic */ FailReason[] $VALUES;
            public static final FailReason SENT_SCREENSHOTS_FAILED;
            public static final FailReason UPLOAD_FILE_FAILED;

            static {
                FailReason failReason = new FailReason("UPLOAD_FILE_FAILED", 0);
                UPLOAD_FILE_FAILED = failReason;
                FailReason failReason2 = new FailReason("SENT_SCREENSHOTS_FAILED", 1);
                SENT_SCREENSHOTS_FAILED = failReason2;
                $VALUES = new FailReason[]{failReason, failReason2};
            }

            public static FailReason valueOf(String str) {
                return (FailReason) Enum.valueOf(FailReason.class, str);
            }

            public static FailReason[] values() {
                return (FailReason[]) $VALUES.clone();
            }
        }

        public Failed(List list, FailReason failReason) {
            list.getClass();
            this.fileStates = list;
            this.failReason = failReason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) obj;
            return Intrinsics.areEqual(this.fileStates, failed.fileStates) && this.failReason == failed.failReason;
        }

        @Override // com.squareup.cash.support.backend.api.ScreenshotService$ServiceState
        public final List getFileStates() {
            return this.fileStates;
        }

        public final int hashCode() {
            return this.failReason.hashCode() + (this.fileStates.hashCode() * 31);
        }

        public final String toString() {
            return "Failed(fileStates=" + this.fileStates + ", failReason=" + this.failReason + ")";
        }
    }

    public final class Sending implements ScreenshotService$ServiceState {
        public final List fileStates;

        public Sending(List list) {
            list.getClass();
            this.fileStates = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Sending) && Intrinsics.areEqual(this.fileStates, ((Sending) obj).fileStates);
        }

        @Override // com.squareup.cash.support.backend.api.ScreenshotService$ServiceState
        public final List getFileStates() {
            return this.fileStates;
        }

        public final int hashCode() {
            return this.fileStates.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Sending(fileStates=", ")", this.fileStates);
        }
    }

    public final class StandBy implements ScreenshotService$ServiceState {
        public static final StandBy INSTANCE = new StandBy();
        public static final EmptyList fileStates = EmptyList.INSTANCE;

        @Override // com.squareup.cash.support.backend.api.ScreenshotService$ServiceState
        public final List getFileStates() {
            return fileStates;
        }
    }

    public final class Succeeded implements ScreenshotService$ServiceState {
        public final List fileStates;

        public Succeeded(List list) {
            list.getClass();
            this.fileStates = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Succeeded) && Intrinsics.areEqual(this.fileStates, ((Succeeded) obj).fileStates);
        }

        @Override // com.squareup.cash.support.backend.api.ScreenshotService$ServiceState
        public final List getFileStates() {
            return this.fileStates;
        }

        public final int hashCode() {
            return this.fileStates.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Succeeded(fileStates=", ")", this.fileStates);
        }
    }

    public final class Uploading implements ScreenshotService$ServiceState {
        public final ArrayList fileStates;
        public final int totalCount;
        public final int uploadedCount;

        public Uploading(ArrayList arrayList, int i, int i2) {
            this.fileStates = arrayList;
            this.uploadedCount = i;
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
            return this.fileStates.equals(uploading.fileStates) && this.uploadedCount == uploading.uploadedCount && this.totalCount == uploading.totalCount;
        }

        @Override // com.squareup.cash.support.backend.api.ScreenshotService$ServiceState
        public final List getFileStates() {
            return this.fileStates;
        }

        public final int hashCode() {
            return Integer.hashCode(this.totalCount) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.uploadedCount, this.fileStates.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Uploading(fileStates=");
            sb.append(this.fileStates);
            sb.append(", uploadedCount=");
            sb.append(this.uploadedCount);
            sb.append(", totalCount=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.totalCount, ")", sb);
        }
    }

    List getFileStates();
}

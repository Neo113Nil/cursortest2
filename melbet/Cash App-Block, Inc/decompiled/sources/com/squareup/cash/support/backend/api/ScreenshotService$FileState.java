package com.squareup.cash.support.backend.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ScreenshotService$FileState {

    public final class Failed implements ScreenshotService$FileState {
        public final String errorMessage;
        public final String fileUri;

        public Failed(String str, String str2) {
            str.getClass();
            this.fileUri = str;
            this.errorMessage = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) obj;
            return Intrinsics.areEqual(this.fileUri, failed.fileUri) && this.errorMessage.equals(failed.errorMessage);
        }

        @Override // com.squareup.cash.support.backend.api.ScreenshotService$FileState
        public final String getFileUri() {
            return this.fileUri;
        }

        public final int hashCode() {
            return this.errorMessage.hashCode() + (this.fileUri.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Failed(fileUri=", this.fileUri, ", errorMessage=", this.errorMessage, ")");
        }
    }

    public final class StandBy implements ScreenshotService$FileState {
        public final String fileUri;

        public StandBy(String str) {
            str.getClass();
            this.fileUri = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StandBy) && Intrinsics.areEqual(this.fileUri, ((StandBy) obj).fileUri);
        }

        @Override // com.squareup.cash.support.backend.api.ScreenshotService$FileState
        public final String getFileUri() {
            return this.fileUri;
        }

        public final int hashCode() {
            return this.fileUri.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StandBy(fileUri=", this.fileUri, ")");
        }
    }

    public final class Uploaded implements ScreenshotService$FileState {
        public final String fileUri;

        public Uploaded(String str) {
            str.getClass();
            this.fileUri = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Uploaded) && Intrinsics.areEqual(this.fileUri, ((Uploaded) obj).fileUri);
        }

        @Override // com.squareup.cash.support.backend.api.ScreenshotService$FileState
        public final String getFileUri() {
            return this.fileUri;
        }

        public final int hashCode() {
            return this.fileUri.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Uploaded(fileUri=", this.fileUri, ")");
        }
    }

    public final class Uploading implements ScreenshotService$FileState {
        public final String fileUri;

        public Uploading(String str) {
            str.getClass();
            this.fileUri = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Uploading) && Intrinsics.areEqual(this.fileUri, ((Uploading) obj).fileUri);
        }

        @Override // com.squareup.cash.support.backend.api.ScreenshotService$FileState
        public final String getFileUri() {
            return this.fileUri;
        }

        public final int hashCode() {
            return this.fileUri.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Uploading(fileUri=", this.fileUri, ")");
        }
    }

    String getFileUri();
}

package com.squareup.cash.support.backend.real;

import com.squareup.cash.fileupload.api.FileMetadata;
import com.squareup.cash.fileupload.api.UriString;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RealScreenshotService$UploadedFile {
    public final FileMetadata fileMetadata;
    public final String fileToken;
    public final String fileUri;

    public RealScreenshotService$UploadedFile(FileMetadata fileMetadata, String str, String str2) {
        str.getClass();
        str2.getClass();
        fileMetadata.getClass();
        this.fileUri = str;
        this.fileToken = str2;
        this.fileMetadata = fileMetadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealScreenshotService$UploadedFile)) {
            return false;
        }
        RealScreenshotService$UploadedFile realScreenshotService$UploadedFile = (RealScreenshotService$UploadedFile) obj;
        return Intrinsics.areEqual(this.fileUri, realScreenshotService$UploadedFile.fileUri) && Intrinsics.areEqual(this.fileToken, realScreenshotService$UploadedFile.fileToken) && Intrinsics.areEqual(this.fileMetadata, realScreenshotService$UploadedFile.fileMetadata);
    }

    public final int hashCode() {
        return this.fileMetadata.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.fileUri.hashCode() * 31, 31, this.fileToken);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UploadedFile(fileUri=", UriString.m3554toStringimpl(this.fileUri), ", fileToken=", this.fileToken, ", fileMetadata=");
        m.append(this.fileMetadata);
        m.append(")");
        return m.toString();
    }
}

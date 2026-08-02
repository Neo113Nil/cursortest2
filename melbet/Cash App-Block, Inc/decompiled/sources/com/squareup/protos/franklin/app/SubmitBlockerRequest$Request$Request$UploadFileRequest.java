package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$UploadFileRequest extends zzdh {
    public final UploadFileRequest value;

    public SubmitBlockerRequest$Request$Request$UploadFileRequest(UploadFileRequest uploadFileRequest) {
        uploadFileRequest.getClass();
        this.value = uploadFileRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$UploadFileRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$UploadFileRequest) obj).value);
    }

    public final UploadFileRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "UploadFileRequest(value=" + this.value + ")";
    }
}

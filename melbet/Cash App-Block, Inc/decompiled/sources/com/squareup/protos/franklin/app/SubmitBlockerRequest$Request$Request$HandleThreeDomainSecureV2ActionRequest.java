package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import com.squareup.protos.franklin.service.HandleThreeDomainSecureV2ActionRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureV2ActionRequest extends zzdh {
    public final HandleThreeDomainSecureV2ActionRequest value;

    public SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureV2ActionRequest(HandleThreeDomainSecureV2ActionRequest handleThreeDomainSecureV2ActionRequest) {
        handleThreeDomainSecureV2ActionRequest.getClass();
        this.value = handleThreeDomainSecureV2ActionRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureV2ActionRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureV2ActionRequest) obj).value);
    }

    public final HandleThreeDomainSecureV2ActionRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "HandleThreeDomainSecureV2ActionRequest(value=" + this.value + ")";
    }
}

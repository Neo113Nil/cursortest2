package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import com.squareup.protos.franklin.service.HandleThreeDomainSecureRedirectRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureRedirectRequest extends zzdh {
    public final HandleThreeDomainSecureRedirectRequest value;

    public SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureRedirectRequest(HandleThreeDomainSecureRedirectRequest handleThreeDomainSecureRedirectRequest) {
        handleThreeDomainSecureRedirectRequest.getClass();
        this.value = handleThreeDomainSecureRedirectRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureRedirectRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$HandleThreeDomainSecureRedirectRequest) obj).value);
    }

    public final HandleThreeDomainSecureRedirectRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "HandleThreeDomainSecureRedirectRequest(value=" + this.value + ")";
    }
}

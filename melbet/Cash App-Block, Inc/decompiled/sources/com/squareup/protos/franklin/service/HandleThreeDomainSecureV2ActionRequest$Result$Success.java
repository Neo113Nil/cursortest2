package com.squareup.protos.franklin.service;

import com.google.android.gms.internal.mlkit_vision_face.zzed;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class HandleThreeDomainSecureV2ActionRequest$Result$Success extends zzed {
    public final ThreeDomainSecureV2ActionSuccess value;

    public HandleThreeDomainSecureV2ActionRequest$Result$Success(ThreeDomainSecureV2ActionSuccess threeDomainSecureV2ActionSuccess) {
        threeDomainSecureV2ActionSuccess.getClass();
        this.value = threeDomainSecureV2ActionSuccess;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HandleThreeDomainSecureV2ActionRequest$Result$Success) && Intrinsics.areEqual(this.value, ((HandleThreeDomainSecureV2ActionRequest$Result$Success) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.value + ")";
    }
}

package com.squareup.protos.franklin.service;

import com.google.android.gms.internal.mlkit_vision_face.zzed;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class HandleThreeDomainSecureV2ActionRequest$Result$Error extends zzed {
    public final ThreeDomainSecureV2ActionError value;

    public HandleThreeDomainSecureV2ActionRequest$Result$Error(ThreeDomainSecureV2ActionError threeDomainSecureV2ActionError) {
        threeDomainSecureV2ActionError.getClass();
        this.value = threeDomainSecureV2ActionError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HandleThreeDomainSecureV2ActionRequest$Result$Error) && Intrinsics.areEqual(this.value, ((HandleThreeDomainSecureV2ActionRequest$Result$Error) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Error(value=" + this.value + ")";
    }
}

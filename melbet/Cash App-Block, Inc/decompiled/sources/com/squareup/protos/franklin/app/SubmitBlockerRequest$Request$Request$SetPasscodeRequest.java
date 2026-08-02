package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import com.squareup.protos.franklin.common.SetPasscodeRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$SetPasscodeRequest extends zzdh {
    public final SetPasscodeRequest value;

    public SubmitBlockerRequest$Request$Request$SetPasscodeRequest(SetPasscodeRequest setPasscodeRequest) {
        setPasscodeRequest.getClass();
        this.value = setPasscodeRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SetPasscodeRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SetPasscodeRequest) obj).value);
    }

    public final SetPasscodeRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SetPasscodeRequest(value=" + this.value + ")";
    }
}

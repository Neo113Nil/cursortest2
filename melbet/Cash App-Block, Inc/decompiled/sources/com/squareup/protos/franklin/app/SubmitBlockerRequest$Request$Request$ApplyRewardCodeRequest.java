package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$ApplyRewardCodeRequest extends zzdh {
    public final ApplyRewardCodeRequest value;

    public SubmitBlockerRequest$Request$Request$ApplyRewardCodeRequest(ApplyRewardCodeRequest applyRewardCodeRequest) {
        applyRewardCodeRequest.getClass();
        this.value = applyRewardCodeRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$ApplyRewardCodeRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$ApplyRewardCodeRequest) obj).value);
    }

    public final ApplyRewardCodeRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ApplyRewardCodeRequest(value=" + this.value + ")";
    }
}

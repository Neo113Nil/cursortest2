package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$SetScheduledTransactionPreferenceRequest extends zzdh {
    public final SetScheduledTransactionPreferenceRequest value;

    public SubmitBlockerRequest$Request$Request$SetScheduledTransactionPreferenceRequest(SetScheduledTransactionPreferenceRequest setScheduledTransactionPreferenceRequest) {
        setScheduledTransactionPreferenceRequest.getClass();
        this.value = setScheduledTransactionPreferenceRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SetScheduledTransactionPreferenceRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SetScheduledTransactionPreferenceRequest) obj).value);
    }

    public final SetScheduledTransactionPreferenceRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SetScheduledTransactionPreferenceRequest(value=" + this.value + ")";
    }
}

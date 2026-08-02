package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import com.squareup.protos.cash.investautomator.api.flows.SubmitAutomationForFlowRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SubmitBlockerRequest$Request$Request$SubmitAutomationForFlowRequest extends zzdh {
    public final SubmitAutomationForFlowRequest value;

    public SubmitBlockerRequest$Request$Request$SubmitAutomationForFlowRequest(SubmitAutomationForFlowRequest submitAutomationForFlowRequest) {
        submitAutomationForFlowRequest.getClass();
        this.value = submitAutomationForFlowRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$SubmitAutomationForFlowRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$SubmitAutomationForFlowRequest) obj).value);
    }

    public final SubmitAutomationForFlowRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SubmitAutomationForFlowRequest(value=" + this.value + ")";
    }
}

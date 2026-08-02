package com.withpersona.sdk2.inquiry.shared.external_inquiry_controller;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public final class ControllerRequest$CancelRequest {
    public final boolean skipBackendCall;

    public ControllerRequest$CancelRequest(boolean z) {
        this.skipBackendCall = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ControllerRequest$CancelRequest) && this.skipBackendCall == ((ControllerRequest$CancelRequest) obj).skipBackendCall;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.skipBackendCall) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("CancelRequest(force=true, skipBackendCall=", ")", this.skipBackendCall);
    }
}

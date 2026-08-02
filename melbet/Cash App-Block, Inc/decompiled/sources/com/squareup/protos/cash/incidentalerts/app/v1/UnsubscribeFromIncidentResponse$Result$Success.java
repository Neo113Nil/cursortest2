package com.squareup.protos.cash.incidentalerts.app.v1;

import com.bumptech.glide.RegistryFactory;
import com.squareup.protos.cash.incidentalerts.app.v1.UnsubscribeFromIncidentResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class UnsubscribeFromIncidentResponse$Result$Success extends RegistryFactory {
    public final UnsubscribeFromIncidentResponse.Success value;

    public UnsubscribeFromIncidentResponse$Result$Success(UnsubscribeFromIncidentResponse.Success success) {
        success.getClass();
        this.value = success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnsubscribeFromIncidentResponse$Result$Success) && Intrinsics.areEqual(this.value, ((UnsubscribeFromIncidentResponse$Result$Success) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.value + ")";
    }
}

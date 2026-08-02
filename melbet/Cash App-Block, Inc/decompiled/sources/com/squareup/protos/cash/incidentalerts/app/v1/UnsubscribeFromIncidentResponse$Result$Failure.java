package com.squareup.protos.cash.incidentalerts.app.v1;

import com.bumptech.glide.RegistryFactory;
import com.squareup.protos.cash.incidentalerts.app.v1.UnsubscribeFromIncidentResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class UnsubscribeFromIncidentResponse$Result$Failure extends RegistryFactory {
    public final UnsubscribeFromIncidentResponse.Failure value;

    public UnsubscribeFromIncidentResponse$Result$Failure(UnsubscribeFromIncidentResponse.Failure failure) {
        failure.getClass();
        this.value = failure;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnsubscribeFromIncidentResponse$Result$Failure) && Intrinsics.areEqual(this.value, ((UnsubscribeFromIncidentResponse$Result$Failure) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Failure(value=" + this.value + ")";
    }
}

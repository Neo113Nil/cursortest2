package com.squareup.protos.cash.incidentalerts.app.v1;

import com.bugsnag.android.internal.StringUtils;
import com.squareup.protos.cash.incidentalerts.app.v1.SubscribeToIncidentResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SubscribeToIncidentResponse$Result$Failure extends StringUtils {
    public final SubscribeToIncidentResponse.Failure value;

    public SubscribeToIncidentResponse$Result$Failure(SubscribeToIncidentResponse.Failure failure) {
        failure.getClass();
        this.value = failure;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubscribeToIncidentResponse$Result$Failure) && Intrinsics.areEqual(this.value, ((SubscribeToIncidentResponse$Result$Failure) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Failure(value=" + this.value + ")";
    }
}

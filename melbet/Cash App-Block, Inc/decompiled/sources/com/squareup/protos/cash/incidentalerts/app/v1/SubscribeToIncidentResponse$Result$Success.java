package com.squareup.protos.cash.incidentalerts.app.v1;

import com.bugsnag.android.internal.StringUtils;
import com.squareup.protos.cash.incidentalerts.app.v1.SubscribeToIncidentResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SubscribeToIncidentResponse$Result$Success extends StringUtils {
    public final SubscribeToIncidentResponse.Success value;

    public SubscribeToIncidentResponse$Result$Success(SubscribeToIncidentResponse.Success success) {
        success.getClass();
        this.value = success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubscribeToIncidentResponse$Result$Success) && Intrinsics.areEqual(this.value, ((SubscribeToIncidentResponse$Result$Success) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.value + ")";
    }
}

package com.squareup.protos.timecards;

import com.datadog.android.rum.model.ViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class GetShiftsOverviewRequest$DateTime$IncludedDateTime extends ViewEvent.Companion {
    public final String value;

    public GetShiftsOverviewRequest$DateTime$IncludedDateTime(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetShiftsOverviewRequest$DateTime$IncludedDateTime) && Intrinsics.areEqual(this.value, ((GetShiftsOverviewRequest$DateTime$IncludedDateTime) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("IncludedDateTime(value=", this.value, ")");
    }
}

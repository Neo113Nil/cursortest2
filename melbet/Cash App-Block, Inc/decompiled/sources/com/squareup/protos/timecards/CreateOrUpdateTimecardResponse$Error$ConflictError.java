package com.squareup.protos.timecards;

import com.squareup.protos.timecards.CreateOrUpdateTimecardResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CreateOrUpdateTimecardResponse$Error$ConflictError {
    public final CreateOrUpdateTimecardResponse.ConflictError value;

    public CreateOrUpdateTimecardResponse$Error$ConflictError(CreateOrUpdateTimecardResponse.ConflictError conflictError) {
        conflictError.getClass();
        this.value = conflictError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateOrUpdateTimecardResponse$Error$ConflictError) && Intrinsics.areEqual(this.value, ((CreateOrUpdateTimecardResponse$Error$ConflictError) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ConflictError(value=" + this.value + ")";
    }
}

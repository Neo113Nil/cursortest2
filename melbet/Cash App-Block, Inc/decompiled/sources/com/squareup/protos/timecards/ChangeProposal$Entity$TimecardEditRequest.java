package com.squareup.protos.timecards;

import com.squareup.cash.clientrouting.UtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ChangeProposal$Entity$TimecardEditRequest extends UtilsKt {
    public final TimecardEditRequest value;

    public ChangeProposal$Entity$TimecardEditRequest(TimecardEditRequest timecardEditRequest) {
        timecardEditRequest.getClass();
        this.value = timecardEditRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChangeProposal$Entity$TimecardEditRequest) && Intrinsics.areEqual(this.value, ((ChangeProposal$Entity$TimecardEditRequest) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TimecardEditRequest(value=" + this.value + ")";
    }
}

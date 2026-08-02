package com.squareup.cash.work.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ShiftSection2ViewEvent$DetailsClicked implements WorkHomeViewEvent {
    public final String shiftId;

    public ShiftSection2ViewEvent$DetailsClicked(String str) {
        str.getClass();
        this.shiftId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShiftSection2ViewEvent$DetailsClicked) && Intrinsics.areEqual(this.shiftId, ((ShiftSection2ViewEvent$DetailsClicked) obj).shiftId);
    }

    public final int hashCode() {
        return this.shiftId.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DetailsClicked(shiftId=", this.shiftId, ")");
    }
}

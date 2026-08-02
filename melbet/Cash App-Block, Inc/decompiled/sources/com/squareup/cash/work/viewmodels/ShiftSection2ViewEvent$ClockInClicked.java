package com.squareup.cash.work.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShiftSection2ViewEvent$ClockInClicked implements WorkHomeViewEvent {
    public final String shiftId;

    public ShiftSection2ViewEvent$ClockInClicked(String str) {
        this.shiftId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShiftSection2ViewEvent$ClockInClicked) && Intrinsics.areEqual(this.shiftId, ((ShiftSection2ViewEvent$ClockInClicked) obj).shiftId);
    }

    public final int hashCode() {
        String str = this.shiftId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClockInClicked(shiftId=", this.shiftId, ")");
    }
}

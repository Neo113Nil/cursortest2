package com.squareup.cash.work.presenters.shift;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;

/* loaded from: classes7.dex */
public final class ShiftDetailClockInState {
    public final boolean enabled;
    public final boolean show;

    public ShiftDetailClockInState(boolean z, boolean z2) {
        this.show = z;
        this.enabled = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftDetailClockInState)) {
            return false;
        }
        ShiftDetailClockInState shiftDetailClockInState = (ShiftDetailClockInState) obj;
        return this.show == shiftDetailClockInState.show && this.enabled == shiftDetailClockInState.enabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.enabled) + (Boolean.hashCode(this.show) * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("ShiftDetailClockInState(show=", ", enabled=", ")", this.show, this.enabled);
    }
}

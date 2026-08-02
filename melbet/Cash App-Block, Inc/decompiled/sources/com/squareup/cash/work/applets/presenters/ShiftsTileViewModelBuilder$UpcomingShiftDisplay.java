package com.squareup.cash.work.applets.presenters;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShiftsTileViewModelBuilder$UpcomingShiftDisplay {
    public final String primaryText;
    public final String secondaryText;

    public ShiftsTileViewModelBuilder$UpcomingShiftDisplay(String str, String str2) {
        str.getClass();
        this.primaryText = str;
        this.secondaryText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftsTileViewModelBuilder$UpcomingShiftDisplay)) {
            return false;
        }
        ShiftsTileViewModelBuilder$UpcomingShiftDisplay shiftsTileViewModelBuilder$UpcomingShiftDisplay = (ShiftsTileViewModelBuilder$UpcomingShiftDisplay) obj;
        return Intrinsics.areEqual(this.primaryText, shiftsTileViewModelBuilder$UpcomingShiftDisplay.primaryText) && this.secondaryText.equals(shiftsTileViewModelBuilder$UpcomingShiftDisplay.secondaryText);
    }

    public final int hashCode() {
        return this.secondaryText.hashCode() + (this.primaryText.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("UpcomingShiftDisplay(primaryText=", this.primaryText, ", secondaryText=", this.secondaryText, ")");
    }
}

package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.work.screens.WorkHomeScreen;
import java.time.OffsetDateTime;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ShiftNotStartedDialogScreen implements DialogScreen {
    public static final Parcelable.Creator<ShiftNotStartedDialogScreen> CREATOR = new WorkHomeScreen.Creator(20);
    public final OffsetDateTime startDateTime;
    public final String timeZoneId;

    public ShiftNotStartedDialogScreen(OffsetDateTime offsetDateTime, String str) {
        offsetDateTime.getClass();
        this.startDateTime = offsetDateTime;
        this.timeZoneId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftNotStartedDialogScreen)) {
            return false;
        }
        ShiftNotStartedDialogScreen shiftNotStartedDialogScreen = (ShiftNotStartedDialogScreen) obj;
        return Intrinsics.areEqual(this.startDateTime, shiftNotStartedDialogScreen.startDateTime) && Intrinsics.areEqual(this.timeZoneId, shiftNotStartedDialogScreen.timeZoneId);
    }

    public final int hashCode() {
        int hashCode = this.startDateTime.hashCode() * 31;
        String str = this.timeZoneId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ShiftNotStartedDialogScreen(startDateTime=" + this.startDateTime + ", timeZoneId=" + this.timeZoneId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.startDateTime);
        parcel.writeString(this.timeZoneId);
    }
}

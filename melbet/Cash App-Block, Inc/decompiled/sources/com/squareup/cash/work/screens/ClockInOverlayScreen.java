package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.work.screens.WorkHomeScreen;

/* loaded from: classes.dex */
public final class ClockInOverlayScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<ClockInOverlayScreen> CREATOR = new WorkHomeScreen.Creator(10);
    public final boolean isScheduledUserFlow;

    public ClockInOverlayScreen(boolean z) {
        this.isScheduledUserFlow = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClockInOverlayScreen) && this.isScheduledUserFlow == ((ClockInOverlayScreen) obj).isScheduledUserFlow;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isScheduledUserFlow);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("ClockInOverlayScreen(isScheduledUserFlow=", ")", this.isScheduledUserFlow);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.isScheduledUserFlow ? 1 : 0);
    }
}

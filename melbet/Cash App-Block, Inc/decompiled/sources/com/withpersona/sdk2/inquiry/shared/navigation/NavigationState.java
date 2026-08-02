package com.withpersona.sdk2.inquiry.shared.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;

/* loaded from: classes9.dex */
public final class NavigationState implements Parcelable {
    public static final Parcelable.Creator<NavigationState> CREATOR = new PoseConfigs.Creator(29);
    public final boolean handleBackPress;
    public final boolean isNavigationEnabled;
    public final boolean showBackButton;
    public final boolean showCancelButton;
    public final boolean showHelpButton;
    public final boolean showNavBar;

    public NavigationState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.showBackButton = z;
        this.showCancelButton = z2;
        this.showNavBar = z3;
        this.handleBackPress = z4;
        this.isNavigationEnabled = z5;
        this.showHelpButton = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.showBackButton ? 1 : 0);
        parcel.writeInt(this.showCancelButton ? 1 : 0);
        parcel.writeInt(this.showNavBar ? 1 : 0);
        parcel.writeInt(this.handleBackPress ? 1 : 0);
        parcel.writeInt(this.isNavigationEnabled ? 1 : 0);
        parcel.writeInt(this.showHelpButton ? 1 : 0);
    }
}

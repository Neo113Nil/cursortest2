package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.work.screens.WorkHomeScreen;

/* loaded from: classes.dex */
public final class MerchantPickerBottomSheetScreen implements Screen, OnlyOneOverlayTreatment {
    public static final MerchantPickerBottomSheetScreen INSTANCE = new MerchantPickerBottomSheetScreen();
    public static final Parcelable.Creator<MerchantPickerBottomSheetScreen> CREATOR = new WorkHomeScreen.Creator(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof MerchantPickerBottomSheetScreen);
    }

    public final int hashCode() {
        return -1945243976;
    }

    public final String toString() {
        return "MerchantPickerBottomSheetScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}

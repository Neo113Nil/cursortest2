package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.stripe.android.SetupIntentResult;

/* loaded from: classes.dex */
public final class WorkTaxFormsListScreen implements Screen {
    public static final WorkTaxFormsListScreen INSTANCE = new WorkTaxFormsListScreen();
    public static final Parcelable.Creator<WorkTaxFormsListScreen> CREATOR = new SetupIntentResult.Creator(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof WorkTaxFormsListScreen);
    }

    public final int hashCode() {
        return 730516785;
    }

    public final String toString() {
        return "WorkTaxFormsListScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}

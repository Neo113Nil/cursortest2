package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.stripe.android.SetupIntentResult;

/* loaded from: classes.dex */
public final class WorkPayHomeScreen implements Screen {
    public static final WorkPayHomeScreen INSTANCE = new WorkPayHomeScreen();
    public static final Parcelable.Creator<WorkPayHomeScreen> CREATOR = new SetupIntentResult.Creator(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof WorkPayHomeScreen);
    }

    public final int hashCode() {
        return 509474544;
    }

    public final String toString() {
        return "WorkPayHomeScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}

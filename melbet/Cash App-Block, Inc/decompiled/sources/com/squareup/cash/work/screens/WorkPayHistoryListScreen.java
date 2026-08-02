package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.stripe.android.SetupIntentResult;

/* loaded from: classes.dex */
public final class WorkPayHistoryListScreen implements Screen {
    public static final WorkPayHistoryListScreen INSTANCE = new WorkPayHistoryListScreen();
    public static final Parcelable.Creator<WorkPayHistoryListScreen> CREATOR = new SetupIntentResult.Creator(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof WorkPayHistoryListScreen);
    }

    public final int hashCode() {
        return -438643207;
    }

    public final String toString() {
        return "WorkPayHistoryListScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}

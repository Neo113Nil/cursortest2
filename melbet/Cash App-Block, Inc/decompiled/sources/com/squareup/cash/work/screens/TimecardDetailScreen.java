package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.work.screens.WorkHomeScreen;

/* loaded from: classes.dex */
public final class TimecardDetailScreen implements Screen {
    public static final TimecardDetailScreen INSTANCE = new TimecardDetailScreen();
    public static final Parcelable.Creator<TimecardDetailScreen> CREATOR = new WorkHomeScreen.Creator(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof TimecardDetailScreen);
    }

    public final int hashCode() {
        return -918319156;
    }

    public final String toString() {
        return "TimecardDetailScreen";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}

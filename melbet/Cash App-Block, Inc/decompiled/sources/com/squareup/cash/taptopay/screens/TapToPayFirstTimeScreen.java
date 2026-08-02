package com.squareup.cash.taptopay.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.tax.primitives.Id;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TapToPayFirstTimeScreen implements Screen, NeverInBackStackScreen {
    public static final Parcelable.Creator<TapToPayFirstTimeScreen> CREATOR = new Id.Close.Creator(9);
    public final String initiatorNotes;

    public TapToPayFirstTimeScreen(String str) {
        str.getClass();
        this.initiatorNotes = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TapToPayFirstTimeScreen) && Intrinsics.areEqual(this.initiatorNotes, ((TapToPayFirstTimeScreen) obj).initiatorNotes);
    }

    public final int hashCode() {
        return this.initiatorNotes.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TapToPayFirstTimeScreen(initiatorNotes=", this.initiatorNotes, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.initiatorNotes);
    }
}

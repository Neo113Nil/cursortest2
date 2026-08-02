package com.squareup.cash.wallet.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CardLockHalfSheetScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<CardLockHalfSheetScreen> CREATOR = new WalletHomeScreen.Creator(28);
    public final String description;
    public final String title;

    public CardLockHalfSheetScreen(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.description = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardLockHalfSheetScreen)) {
            return false;
        }
        CardLockHalfSheetScreen cardLockHalfSheetScreen = (CardLockHalfSheetScreen) obj;
        return Intrinsics.areEqual(this.title, cardLockHalfSheetScreen.title) && Intrinsics.areEqual(this.description, cardLockHalfSheetScreen.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("CardLockHalfSheetScreen(title=", this.title, ", description=", this.description, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.description);
    }
}

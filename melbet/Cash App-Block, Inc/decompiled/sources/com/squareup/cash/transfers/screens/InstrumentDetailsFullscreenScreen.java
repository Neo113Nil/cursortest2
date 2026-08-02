package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.tax.screens.TaxMenuSheet;
import com.squareup.protos.franklin.api.CashInstrumentType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class InstrumentDetailsFullscreenScreen implements InstrumentDetailsScreen {
    public static final Parcelable.Creator<InstrumentDetailsFullscreenScreen> CREATOR = new TaxMenuSheet.Creator(18);
    public final String instrumentToken;
    public final CashInstrumentType instrumentType;
    public final Screen parentScreen;

    public InstrumentDetailsFullscreenScreen(Screen screen, CashInstrumentType cashInstrumentType, String str) {
        str.getClass();
        cashInstrumentType.getClass();
        screen.getClass();
        this.instrumentToken = str;
        this.instrumentType = cashInstrumentType;
        this.parentScreen = screen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentDetailsFullscreenScreen)) {
            return false;
        }
        InstrumentDetailsFullscreenScreen instrumentDetailsFullscreenScreen = (InstrumentDetailsFullscreenScreen) obj;
        return Intrinsics.areEqual(this.instrumentToken, instrumentDetailsFullscreenScreen.instrumentToken) && this.instrumentType == instrumentDetailsFullscreenScreen.instrumentType && Intrinsics.areEqual(this.parentScreen, instrumentDetailsFullscreenScreen.parentScreen);
    }

    @Override // com.squareup.cash.transfers.screens.InstrumentDetailsScreen
    public final String getInstrumentToken() {
        return this.instrumentToken;
    }

    @Override // com.squareup.cash.transfers.screens.InstrumentDetailsScreen
    public final CashInstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    @Override // com.squareup.cash.transfers.screens.InstrumentDetailsScreen
    public final Screen getParentScreen() {
        return this.parentScreen;
    }

    public final int hashCode() {
        return this.parentScreen.hashCode() + ((this.instrumentType.hashCode() + (this.instrumentToken.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InstrumentDetailsFullscreenScreen(instrumentToken=" + this.instrumentToken + ", instrumentType=" + this.instrumentType + ", parentScreen=" + this.parentScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.instrumentToken);
        parcel.writeString(this.instrumentType.name());
        parcel.writeParcelable(this.parentScreen, i);
    }
}

package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Question;
import com.squareup.cash.tax.screens.TaxMenuSheet;

/* loaded from: classes7.dex */
public final class InstrumentLinkingOptionsQuestion implements Question {
    public static final InstrumentLinkingOptionsQuestion INSTANCE = new InstrumentLinkingOptionsQuestion();
    public static final Parcelable.Creator<InstrumentLinkingOptionsQuestion> CREATOR = new TaxMenuSheet.Creator(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof InstrumentLinkingOptionsQuestion);
    }

    public final int hashCode() {
        return -1132904062;
    }

    public final String toString() {
        return "InstrumentLinkingOptionsQuestion";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}

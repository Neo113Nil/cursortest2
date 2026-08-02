package com.squareup.cash.tax.web.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.tax.screens.TaxMenuSheet;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BridgeSavedState implements Parcelable {
    public static final Parcelable.Creator<BridgeSavedState> CREATOR = new TaxMenuSheet.Creator(6);
    public final String lastUrlLoaded;

    public BridgeSavedState(String str) {
        this.lastUrlLoaded = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BridgeSavedState) && Intrinsics.areEqual(this.lastUrlLoaded, ((BridgeSavedState) obj).lastUrlLoaded);
    }

    public final int hashCode() {
        String str = this.lastUrlLoaded;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BridgeSavedState(lastUrlLoaded=", this.lastUrlLoaded, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.lastUrlLoaded);
    }
}

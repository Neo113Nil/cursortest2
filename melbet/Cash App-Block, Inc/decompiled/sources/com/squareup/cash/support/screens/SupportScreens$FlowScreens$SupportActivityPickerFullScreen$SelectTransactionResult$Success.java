package com.squareup.cash.support.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.support.screens.SupportScreens;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SupportScreens$FlowScreens$SupportActivityPickerFullScreen$SelectTransactionResult$Success implements Parcelable {
    public static final Parcelable.Creator<SupportScreens$FlowScreens$SupportActivityPickerFullScreen$SelectTransactionResult$Success> CREATOR = new SupportScreens.FlowScreens.Data.Creator(3);
    public final String token;

    public SupportScreens$FlowScreens$SupportActivityPickerFullScreen$SelectTransactionResult$Success(String str) {
        str.getClass();
        this.token = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SupportScreens$FlowScreens$SupportActivityPickerFullScreen$SelectTransactionResult$Success) && Intrinsics.areEqual(this.token, ((SupportScreens$FlowScreens$SupportActivityPickerFullScreen$SelectTransactionResult$Success) obj).token);
    }

    public final int hashCode() {
        return this.token.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(token=", this.token, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
    }
}

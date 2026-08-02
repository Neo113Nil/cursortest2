package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.tax.screens.TaxMenuSheet;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BalanceBasedAddCashDisabledDialogScreen implements DialogScreen {
    public static final Parcelable.Creator<BalanceBasedAddCashDisabledDialogScreen> CREATOR = new TaxMenuSheet.Creator(13);
    public final String clientRoute;
    public final String message;
    public final String negativeButtonLabel;
    public final String positiveButtonLabel;
    public final String title;

    public BalanceBasedAddCashDisabledDialogScreen(String str, String str2, String str3, String str4, String str5) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        this.title = str;
        this.message = str2;
        this.positiveButtonLabel = str3;
        this.negativeButtonLabel = str4;
        this.clientRoute = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalanceBasedAddCashDisabledDialogScreen)) {
            return false;
        }
        BalanceBasedAddCashDisabledDialogScreen balanceBasedAddCashDisabledDialogScreen = (BalanceBasedAddCashDisabledDialogScreen) obj;
        return Intrinsics.areEqual(this.title, balanceBasedAddCashDisabledDialogScreen.title) && Intrinsics.areEqual(this.message, balanceBasedAddCashDisabledDialogScreen.message) && Intrinsics.areEqual(this.positiveButtonLabel, balanceBasedAddCashDisabledDialogScreen.positiveButtonLabel) && Intrinsics.areEqual(this.negativeButtonLabel, balanceBasedAddCashDisabledDialogScreen.negativeButtonLabel) && Intrinsics.areEqual(this.clientRoute, balanceBasedAddCashDisabledDialogScreen.clientRoute);
    }

    public final int hashCode() {
        return this.clientRoute.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.positiveButtonLabel), 31, this.negativeButtonLabel);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BalanceBasedAddCashDisabledDialogScreen(title=", this.title, ", message=", this.message, ", positiveButtonLabel=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.positiveButtonLabel, ", negativeButtonLabel=", this.negativeButtonLabel, ", clientRoute=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.clientRoute, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        parcel.writeString(this.positiveButtonLabel);
        parcel.writeString(this.negativeButtonLabel);
        parcel.writeString(this.clientRoute);
    }
}

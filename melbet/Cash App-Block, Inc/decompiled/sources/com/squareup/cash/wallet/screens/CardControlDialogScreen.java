package com.squareup.cash.wallet.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.cash.postcard.CardModule;

/* loaded from: classes.dex */
public final class CardControlDialogScreen implements DialogScreen {
    public static final Parcelable.Creator<CardControlDialogScreen> CREATOR = new WalletHomeScreen.Creator(27);
    public final CardModule.CardElementAction.OpenDialog dialog;

    public CardControlDialogScreen(CardModule.CardElementAction.OpenDialog openDialog) {
        openDialog.getClass();
        this.dialog = openDialog;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.dialog, i);
    }
}

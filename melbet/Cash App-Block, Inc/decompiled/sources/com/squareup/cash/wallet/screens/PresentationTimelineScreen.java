package com.squareup.cash.wallet.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.cash.wallet.viewmodels.PresentationTimelineViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PresentationTimelineScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<PresentationTimelineScreen> CREATOR = new WalletHomeScreen.Creator(29);
    public final PresentationTimelineViewModel viewModel;

    public PresentationTimelineScreen(PresentationTimelineViewModel presentationTimelineViewModel) {
        presentationTimelineViewModel.getClass();
        this.viewModel = presentationTimelineViewModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PresentationTimelineScreen) && Intrinsics.areEqual(this.viewModel, ((PresentationTimelineScreen) obj).viewModel);
    }

    public final int hashCode() {
        return this.viewModel.hashCode();
    }

    public final String toString() {
        return "PresentationTimelineScreen(viewModel=" + this.viewModel + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.viewModel, i);
    }
}

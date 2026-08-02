package com.squareup.cash.wallet.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.work.screens.WorkHomeScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PresentationAction implements Parcelable {
    public static final Parcelable.Creator<PresentationAction> CREATOR = new WorkHomeScreen.Creator(3);
    public final String clientRouteUrl;
    public final String label;

    public PresentationAction(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.label = str;
        this.clientRouteUrl = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresentationAction)) {
            return false;
        }
        PresentationAction presentationAction = (PresentationAction) obj;
        return Intrinsics.areEqual(this.label, presentationAction.label) && Intrinsics.areEqual(this.clientRouteUrl, presentationAction.clientRouteUrl);
    }

    public final int hashCode() {
        return this.clientRouteUrl.hashCode() + (this.label.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("PresentationAction(label=", this.label, ", clientRouteUrl=", this.clientRouteUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.label);
        parcel.writeString(this.clientRouteUrl);
    }
}

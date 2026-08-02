package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.stripe.android.SetupIntentResult;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class WorkTaxFormDownloaderScreen implements DialogScreen {
    public static final Parcelable.Creator<WorkTaxFormDownloaderScreen> CREATOR = new SetupIntentResult.Creator(3);
    public final String downloadUrl;
    public final String title;
    public final String token;

    public WorkTaxFormDownloaderScreen(String str, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.token = str;
        this.title = str2;
        this.downloadUrl = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkTaxFormDownloaderScreen)) {
            return false;
        }
        WorkTaxFormDownloaderScreen workTaxFormDownloaderScreen = (WorkTaxFormDownloaderScreen) obj;
        return Intrinsics.areEqual(this.token, workTaxFormDownloaderScreen.token) && Intrinsics.areEqual(this.title, workTaxFormDownloaderScreen.title) && Intrinsics.areEqual(this.downloadUrl, workTaxFormDownloaderScreen.downloadUrl);
    }

    public final int hashCode() {
        return this.downloadUrl.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.title);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WorkTaxFormDownloaderScreen(token=", this.token, ", title=", this.title, ", downloadUrl="), this.downloadUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeString(this.title);
        parcel.writeString(this.downloadUrl);
    }
}

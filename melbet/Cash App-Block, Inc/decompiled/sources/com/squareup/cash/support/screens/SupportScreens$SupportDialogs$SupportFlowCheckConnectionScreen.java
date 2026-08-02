package com.squareup.cash.support.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import com.squareup.cash.support.screens.SupportScreens;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen extends SupportScreens implements DialogScreen {
    public static final Parcelable.Creator<SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen> CREATOR = new SupportScreens.FlowScreens.Data.Creator(19);
    public final boolean handleCloseNavigation;
    public final String message;
    public final String title;

    public /* synthetic */ SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen(String str, String str2, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) == 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen)) {
            return false;
        }
        SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen supportScreens$SupportDialogs$SupportFlowCheckConnectionScreen = (SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen) obj;
        return Intrinsics.areEqual(this.title, supportScreens$SupportDialogs$SupportFlowCheckConnectionScreen.title) && Intrinsics.areEqual(this.message, supportScreens$SupportDialogs$SupportFlowCheckConnectionScreen.message) && this.handleCloseNavigation == supportScreens$SupportDialogs$SupportFlowCheckConnectionScreen.handleCloseNavigation;
    }

    @Override // com.squareup.cash.screens.MainScreens
    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        return Boolean.hashCode(this.handleCloseNavigation) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SupportFlowCheckConnectionScreen(title=", this.title, ", message=", this.message, ", handleCloseNavigation="), this.handleCloseNavigation, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        parcel.writeInt(this.handleCloseNavigation ? 1 : 0);
    }

    public SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen(String str, String str2, boolean z) {
        super(0);
        this.title = str;
        this.message = str2;
        this.handleCloseNavigation = z;
    }
}

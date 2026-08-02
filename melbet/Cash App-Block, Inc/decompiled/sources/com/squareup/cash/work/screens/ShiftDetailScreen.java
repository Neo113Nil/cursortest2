package com.squareup.cash.work.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.work.screens.WorkHomeScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ShiftDetailScreen implements Screen {
    public static final Parcelable.Creator<ShiftDetailScreen> CREATOR = new WorkHomeScreen.Creator(18);
    public final String shiftId;

    public ShiftDetailScreen(String str) {
        str.getClass();
        this.shiftId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShiftDetailScreen) && Intrinsics.areEqual(this.shiftId, ((ShiftDetailScreen) obj).shiftId);
    }

    public final int hashCode() {
        return this.shiftId.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShiftDetailScreen(shiftId=", this.shiftId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.shiftId);
    }
}

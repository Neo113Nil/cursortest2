package com.squareup.cash.support.backend.api.activities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.support.backend.api.activities.Amount;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Avatar implements Parcelable {
    public static final Parcelable.Creator<Avatar> CREATOR = new Amount.Creator(1);
    public final boolean colorizeImage;
    public final Integer darkAccentColor;
    public final String darkImageUrl;
    public final String initial;
    public final Integer lightAccentColor;
    public final String lightImageUrl;

    public Avatar(String str, boolean z, String str2, Integer num, String str3, Integer num2) {
        str.getClass();
        this.initial = str;
        this.colorizeImage = z;
        this.lightImageUrl = str2;
        this.lightAccentColor = num;
        this.darkImageUrl = str3;
        this.darkAccentColor = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) obj;
        return Intrinsics.areEqual(this.initial, avatar.initial) && this.colorizeImage == avatar.colorizeImage && Intrinsics.areEqual(this.lightImageUrl, avatar.lightImageUrl) && Intrinsics.areEqual(this.lightAccentColor, avatar.lightAccentColor) && Intrinsics.areEqual(this.darkImageUrl, avatar.darkImageUrl) && Intrinsics.areEqual(this.darkAccentColor, avatar.darkAccentColor);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.initial.hashCode() * 31, 31, this.colorizeImage);
        String str = this.lightImageUrl;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.lightAccentColor;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.darkImageUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.darkAccentColor;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("Avatar(initial=", this.initial, ", colorizeImage=", ", lightImageUrl=", this.colorizeImage);
        NavAction$$ExternalSyntheticOutline0.m(m1540m, this.lightImageUrl, ", lightAccentColor=", this.lightAccentColor, ", darkImageUrl=");
        m1540m.append(this.darkImageUrl);
        m1540m.append(", darkAccentColor=");
        m1540m.append(this.darkAccentColor);
        m1540m.append(")");
        return m1540m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.initial);
        parcel.writeInt(this.colorizeImage ? 1 : 0);
        parcel.writeString(this.lightImageUrl);
        Integer num = this.lightAccentColor;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num);
        }
        parcel.writeString(this.darkImageUrl);
        Integer num2 = this.darkAccentColor;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            NavAction$$ExternalSyntheticOutline0.m(parcel, 1, num2);
        }
    }
}

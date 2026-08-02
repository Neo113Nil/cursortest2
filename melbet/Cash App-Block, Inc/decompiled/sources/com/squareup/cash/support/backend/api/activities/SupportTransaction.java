package com.squareup.cash.support.backend.api.activities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.support.backend.api.activities.Amount;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SupportTransaction implements Parcelable {
    public static final Parcelable.Creator<SupportTransaction> CREATOR = new Amount.Creator(2);
    public final Amount amount;
    public final Avatar avatar;
    public final String entityId;
    public final String subtitle;
    public final String tertiaryLabel;
    public final String title;

    public SupportTransaction(String str, String str2, String str3, String str4, Avatar avatar, Amount amount) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.entityId = str;
        this.title = str2;
        this.subtitle = str3;
        this.tertiaryLabel = str4;
        this.avatar = avatar;
        this.amount = amount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportTransaction)) {
            return false;
        }
        SupportTransaction supportTransaction = (SupportTransaction) obj;
        return Intrinsics.areEqual(this.entityId, supportTransaction.entityId) && Intrinsics.areEqual(this.title, supportTransaction.title) && Intrinsics.areEqual(this.subtitle, supportTransaction.subtitle) && Intrinsics.areEqual(this.tertiaryLabel, supportTransaction.tertiaryLabel) && Intrinsics.areEqual(this.avatar, supportTransaction.avatar) && Intrinsics.areEqual(this.amount, supportTransaction.amount);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.entityId.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.tertiaryLabel);
        Avatar avatar = this.avatar;
        int hashCode = (m + (avatar == null ? 0 : avatar.hashCode())) * 31;
        Amount amount = this.amount;
        return hashCode + (amount != null ? amount.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SupportTransaction(entityId=", this.entityId, ", title=", this.title, ", subtitle=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.subtitle, ", tertiaryLabel=", this.tertiaryLabel, ", avatar=");
        m.append(this.avatar);
        m.append(", amount=");
        m.append(this.amount);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.entityId);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.tertiaryLabel);
        Avatar avatar = this.avatar;
        if (avatar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            avatar.writeToParcel(parcel, i);
        }
        Amount amount = this.amount;
        if (amount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount.writeToParcel(parcel, i);
        }
    }
}

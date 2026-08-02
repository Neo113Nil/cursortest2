package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.Card;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BinRange implements StripeModel {
    public static final Parcelable.Creator<BinRange> CREATOR = new Card.Creator(7);
    public final String high;
    public final boolean isStatic;
    public final String low;

    public BinRange(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.low = str;
        this.high = str2;
        this.isStatic = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BinRange)) {
            return false;
        }
        BinRange binRange = (BinRange) obj;
        return Intrinsics.areEqual(this.low, binRange.low) && Intrinsics.areEqual(this.high, binRange.high) && this.isStatic == binRange.isStatic;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isStatic) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.low.hashCode() * 31, 31, this.high);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BinRange(low=", this.low, ", high=", this.high, ", isStatic="), this.isStatic, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.low);
        parcel.writeString(this.high);
        parcel.writeInt(this.isStatic ? 1 : 0);
    }
}

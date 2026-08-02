package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.Card;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CancelCaptchaChallengeParams implements Parcelable {
    public static final Parcelable.Creator<CancelCaptchaChallengeParams> CREATOR = new Card.Creator(8);
    public final String clientSecret;

    public CancelCaptchaChallengeParams(String str) {
        str.getClass();
        this.clientSecret = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CancelCaptchaChallengeParams) && Intrinsics.areEqual(this.clientSecret, ((CancelCaptchaChallengeParams) obj).clientSecret);
    }

    public final int hashCode() {
        return this.clientSecret.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CancelCaptchaChallengeParams(clientSecret=", this.clientSecret, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.clientSecret);
    }
}

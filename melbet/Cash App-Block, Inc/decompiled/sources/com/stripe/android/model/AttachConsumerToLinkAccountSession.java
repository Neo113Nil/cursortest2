package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.Card;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class AttachConsumerToLinkAccountSession implements StripeModel {
    public static final Parcelable.Creator<AttachConsumerToLinkAccountSession> CREATOR = new Card.Creator(5);
    public final String clientSecret;
    public final String id;

    public AttachConsumerToLinkAccountSession(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.clientSecret = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachConsumerToLinkAccountSession)) {
            return false;
        }
        AttachConsumerToLinkAccountSession attachConsumerToLinkAccountSession = (AttachConsumerToLinkAccountSession) obj;
        return Intrinsics.areEqual(this.id, attachConsumerToLinkAccountSession.id) && Intrinsics.areEqual(this.clientSecret, attachConsumerToLinkAccountSession.clientSecret);
    }

    public final int hashCode() {
        return this.clientSecret.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("AttachConsumerToLinkAccountSession(id=", this.id, ", clientSecret=", this.clientSecret, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.clientSecret);
    }
}

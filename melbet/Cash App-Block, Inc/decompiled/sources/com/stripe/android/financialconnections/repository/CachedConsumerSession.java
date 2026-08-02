package com.stripe.android.financialconnections.repository;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.stripe.android.financialconnections.model.ServerLink;
import com.stripe.android.model.LinkBrand;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class CachedConsumerSession implements Parcelable {
    public static final Parcelable.Creator<CachedConsumerSession> CREATOR = new ServerLink.Creator(23);
    public final String clientSecret;
    public final String emailAddress;
    public final boolean isVerified;
    public final LinkBrand linkBrand;
    public final String phoneNumber;
    public final String publishableKey;

    public CachedConsumerSession(String str, String str2, String str3, String str4, boolean z, LinkBrand linkBrand) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.emailAddress = str;
        this.phoneNumber = str2;
        this.clientSecret = str3;
        this.publishableKey = str4;
        this.isVerified = z;
        this.linkBrand = linkBrand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedConsumerSession)) {
            return false;
        }
        CachedConsumerSession cachedConsumerSession = (CachedConsumerSession) obj;
        return Intrinsics.areEqual(this.emailAddress, cachedConsumerSession.emailAddress) && Intrinsics.areEqual(this.phoneNumber, cachedConsumerSession.phoneNumber) && Intrinsics.areEqual(this.clientSecret, cachedConsumerSession.clientSecret) && Intrinsics.areEqual(this.publishableKey, cachedConsumerSession.publishableKey) && this.isVerified == cachedConsumerSession.isVerified && this.linkBrand == cachedConsumerSession.linkBrand;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.emailAddress.hashCode() * 31, 31, this.phoneNumber), 31, this.clientSecret);
        String str = this.publishableKey;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.isVerified);
        LinkBrand linkBrand = this.linkBrand;
        return m2 + (linkBrand != null ? linkBrand.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CachedConsumerSession(emailAddress=", this.emailAddress, ", phoneNumber=", this.phoneNumber, ", clientSecret=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.clientSecret, ", publishableKey=", this.publishableKey, ", isVerified=");
        m.append(this.isVerified);
        m.append(", linkBrand=");
        m.append(this.linkBrand);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.emailAddress);
        parcel.writeString(this.phoneNumber);
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.publishableKey);
        parcel.writeInt(this.isVerified ? 1 : 0);
        LinkBrand linkBrand = this.linkBrand;
        if (linkBrand == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(linkBrand.name());
        }
    }
}

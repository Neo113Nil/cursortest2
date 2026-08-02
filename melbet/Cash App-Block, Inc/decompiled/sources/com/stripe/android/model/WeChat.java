package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.Token;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class WeChat implements StripeModel {
    public static final Parcelable.Creator<WeChat> CREATOR = new Token.Creator(4);
    public final String appId;
    public final String nonce;
    public final String packageValue;
    public final String partnerId;
    public final String prepayId;
    public final String qrCodeUrl;
    public final String sign;
    public final String statementDescriptor;
    public final String timestamp;

    public WeChat(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.statementDescriptor = str;
        this.appId = str2;
        this.nonce = str3;
        this.packageValue = str4;
        this.partnerId = str5;
        this.prepayId = str6;
        this.sign = str7;
        this.timestamp = str8;
        this.qrCodeUrl = str9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeChat)) {
            return false;
        }
        WeChat weChat = (WeChat) obj;
        return Intrinsics.areEqual(this.statementDescriptor, weChat.statementDescriptor) && Intrinsics.areEqual(this.appId, weChat.appId) && Intrinsics.areEqual(this.nonce, weChat.nonce) && Intrinsics.areEqual(this.packageValue, weChat.packageValue) && Intrinsics.areEqual(this.partnerId, weChat.partnerId) && Intrinsics.areEqual(this.prepayId, weChat.prepayId) && Intrinsics.areEqual(this.sign, weChat.sign) && Intrinsics.areEqual(this.timestamp, weChat.timestamp) && Intrinsics.areEqual(this.qrCodeUrl, weChat.qrCodeUrl);
    }

    public final int hashCode() {
        String str = this.statementDescriptor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nonce;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.packageValue;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.partnerId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.prepayId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sign;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.timestamp;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.qrCodeUrl;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WeChat(statementDescriptor=", this.statementDescriptor, ", appId=", this.appId, ", nonce=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.nonce, ", packageValue=", this.packageValue, ", partnerId=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.partnerId, ", prepayId=", this.prepayId, ", sign=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.sign, ", timestamp=", this.timestamp, ", qrCodeUrl=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.qrCodeUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.statementDescriptor);
        parcel.writeString(this.appId);
        parcel.writeString(this.nonce);
        parcel.writeString(this.packageValue);
        parcel.writeString(this.partnerId);
        parcel.writeString(this.prepayId);
        parcel.writeString(this.sign);
        parcel.writeString(this.timestamp);
        parcel.writeString(this.qrCodeUrl);
    }
}

package com.squareup.cash.threedsdataonly.backend.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Transaction$AuthenticationRequestParameters {
    public final String deviceData;
    public final String messageVersion;
    public final String sdkAppID;
    public final String sdkEphemeralPublicKey;
    public final String sdkReferenceNumber;
    public final String sdkTransactionID;

    public Transaction$AuthenticationRequestParameters(String str, String str2, String str3, String str4, String str5, String str6) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        str6.getClass();
        this.sdkAppID = str;
        this.sdkTransactionID = str2;
        this.sdkEphemeralPublicKey = str3;
        this.sdkReferenceNumber = str4;
        this.messageVersion = str5;
        this.deviceData = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transaction$AuthenticationRequestParameters)) {
            return false;
        }
        Transaction$AuthenticationRequestParameters transaction$AuthenticationRequestParameters = (Transaction$AuthenticationRequestParameters) obj;
        return Intrinsics.areEqual(this.sdkAppID, transaction$AuthenticationRequestParameters.sdkAppID) && Intrinsics.areEqual(this.sdkTransactionID, transaction$AuthenticationRequestParameters.sdkTransactionID) && Intrinsics.areEqual(this.sdkEphemeralPublicKey, transaction$AuthenticationRequestParameters.sdkEphemeralPublicKey) && Intrinsics.areEqual(this.sdkReferenceNumber, transaction$AuthenticationRequestParameters.sdkReferenceNumber) && Intrinsics.areEqual(this.messageVersion, transaction$AuthenticationRequestParameters.messageVersion) && Intrinsics.areEqual(this.deviceData, transaction$AuthenticationRequestParameters.deviceData);
    }

    public final int hashCode() {
        return this.deviceData.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sdkAppID.hashCode() * 31, 31, this.sdkTransactionID), 31, this.sdkEphemeralPublicKey), 31, this.sdkReferenceNumber), 31, this.messageVersion);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AuthenticationRequestParameters(sdkAppID=", this.sdkAppID, ", sdkTransactionID=", this.sdkTransactionID, ", sdkEphemeralPublicKey=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.sdkEphemeralPublicKey, ", sdkReferenceNumber=", this.sdkReferenceNumber, ", messageVersion=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.messageVersion, ", deviceData=", this.deviceData, ")");
    }
}

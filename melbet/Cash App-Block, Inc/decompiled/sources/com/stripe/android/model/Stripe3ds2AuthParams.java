package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.stripe.android.model.SourceParams;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collection;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class Stripe3ds2AuthParams implements Parcelable {
    public static final Parcelable.Creator<Stripe3ds2AuthParams> CREATOR = new SourceParams.Creator(8);
    public final String deviceData;
    public final int maxTimeout;
    public final String messageVersion;
    public final String returnUrl;
    public final String sdkAppId;
    public final String sdkEphemeralPublicKey;
    public final String sdkReferenceNumber;
    public final String sdkTransactionId;
    public final String sourceId;

    public Stripe3ds2AuthParams(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.sourceId = str;
        this.sdkAppId = str2;
        this.sdkReferenceNumber = str3;
        this.sdkTransactionId = str4;
        this.deviceData = str5;
        this.sdkEphemeralPublicKey = str6;
        this.messageVersion = str7;
        this.maxTimeout = i;
        this.returnUrl = str8;
    }

    public static JSONObject getDeviceRenderOptions() {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            failure = new JSONObject().put("sdkInterface", "03").put("sdkUiType", new JSONArray((Collection) CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"01", "02", "03", "04", "05"})));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Object jSONObject = new JSONObject();
        if (failure instanceof Result.Failure) {
            failure = jSONObject;
        }
        return (JSONObject) failure;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stripe3ds2AuthParams)) {
            return false;
        }
        Stripe3ds2AuthParams stripe3ds2AuthParams = (Stripe3ds2AuthParams) obj;
        return Intrinsics.areEqual(this.sourceId, stripe3ds2AuthParams.sourceId) && Intrinsics.areEqual(this.sdkAppId, stripe3ds2AuthParams.sdkAppId) && Intrinsics.areEqual(this.sdkReferenceNumber, stripe3ds2AuthParams.sdkReferenceNumber) && Intrinsics.areEqual(this.sdkTransactionId, stripe3ds2AuthParams.sdkTransactionId) && Intrinsics.areEqual(this.deviceData, stripe3ds2AuthParams.deviceData) && Intrinsics.areEqual(this.sdkEphemeralPublicKey, stripe3ds2AuthParams.sdkEphemeralPublicKey) && Intrinsics.areEqual(this.messageVersion, stripe3ds2AuthParams.messageVersion) && this.maxTimeout == stripe3ds2AuthParams.maxTimeout && Intrinsics.areEqual(this.returnUrl, stripe3ds2AuthParams.returnUrl);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxTimeout, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sourceId.hashCode() * 31, 31, this.sdkAppId), 31, this.sdkReferenceNumber), 31, this.sdkTransactionId), 31, this.deviceData), 31, this.sdkEphemeralPublicKey), 31, this.messageVersion), 31);
        String str = this.returnUrl;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Stripe3ds2AuthParams(sourceId=", this.sourceId, ", sdkAppId=", this.sdkAppId, ", sdkReferenceNumber=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.sdkReferenceNumber, ", sdkTransactionId=", this.sdkTransactionId, ", deviceData=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.deviceData, ", sdkEphemeralPublicKey=", this.sdkEphemeralPublicKey, ", messageVersion=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.messageVersion, ", maxTimeout=", this.maxTimeout, ", returnUrl=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.returnUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.sourceId);
        parcel.writeString(this.sdkAppId);
        parcel.writeString(this.sdkReferenceNumber);
        parcel.writeString(this.sdkTransactionId);
        parcel.writeString(this.deviceData);
        parcel.writeString(this.sdkEphemeralPublicKey);
        parcel.writeString(this.messageVersion);
        parcel.writeInt(this.maxTimeout);
        parcel.writeString(this.returnUrl);
    }
}

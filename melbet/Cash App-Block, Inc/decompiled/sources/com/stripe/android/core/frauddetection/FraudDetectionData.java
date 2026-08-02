package com.stripe.android.core.frauddetection;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.StripeModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class FraudDetectionData implements StripeModel {
    public static final Parcelable.Creator<FraudDetectionData> CREATOR = new Country.Creator(3);
    public final String guid;
    public final String muid;
    public final String sid;
    public final long timestamp;

    public FraudDetectionData(String str, long j, String str2, String str3) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.guid = str;
        this.muid = str2;
        this.sid = str3;
        this.timestamp = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FraudDetectionData)) {
            return false;
        }
        FraudDetectionData fraudDetectionData = (FraudDetectionData) obj;
        return Intrinsics.areEqual(this.guid, fraudDetectionData.guid) && Intrinsics.areEqual(this.muid, fraudDetectionData.muid) && Intrinsics.areEqual(this.sid, fraudDetectionData.sid) && this.timestamp == fraudDetectionData.timestamp;
    }

    public final Map getParams() {
        return MapsKt__MapsKt.mapOf(new Pair("guid", this.guid), new Pair("muid", this.muid), new Pair("sid", this.sid));
    }

    public final int hashCode() {
        return Long.hashCode(this.timestamp) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.guid.hashCode() * 31, 31, this.muid), 31, this.sid);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FraudDetectionData(guid=", this.guid, ", muid=", this.muid, ", sid=");
        m.append(this.sid);
        m.append(", timestamp=");
        m.append(this.timestamp);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.guid);
        parcel.writeString(this.muid);
        parcel.writeString(this.sid);
        parcel.writeLong(this.timestamp);
    }
}

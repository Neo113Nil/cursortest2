package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.PaymentIntent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class MandateDataParams$Type$Online implements Parcelable {
    public static final Parcelable.Creator<MandateDataParams$Type$Online> CREATOR = new PaymentIntent.Creator(9);
    public static final MandateDataParams$Type$Online DEFAULT = new MandateDataParams$Type$Online(null, null, true);
    public final boolean inferFromClient;
    public final String ipAddress;
    public final String userAgent;

    public MandateDataParams$Type$Online(String str, String str2, boolean z) {
        this.ipAddress = str;
        this.userAgent = str2;
        this.inferFromClient = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MandateDataParams$Type$Online)) {
            return false;
        }
        MandateDataParams$Type$Online mandateDataParams$Type$Online = (MandateDataParams$Type$Online) obj;
        return Intrinsics.areEqual(this.ipAddress, mandateDataParams$Type$Online.ipAddress) && Intrinsics.areEqual(this.userAgent, mandateDataParams$Type$Online.userAgent) && this.inferFromClient == mandateDataParams$Type$Online.inferFromClient;
    }

    public final int hashCode() {
        String str = this.ipAddress;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userAgent;
        return Boolean.hashCode(this.inferFromClient) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Online(ipAddress=", this.ipAddress, ", userAgent=", this.userAgent, ", inferFromClient="), this.inferFromClient, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.ipAddress);
        parcel.writeString(this.userAgent);
        parcel.writeInt(this.inferFromClient ? 1 : 0);
    }
}

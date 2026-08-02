package com.stripe.android.challenge.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.SetupIntentResult;
import com.stripe.android.core.model.StripeModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BridgeErrorParams implements StripeModel {
    public static final Parcelable.Creator<BridgeErrorParams> CREATOR = new SetupIntentResult.Creator(20);
    public final String code;
    public final String message;

    /* renamed from: type, reason: collision with root package name */
    public final String f1426type;

    public BridgeErrorParams(String str, String str2, String str3) {
        this.message = str;
        this.f1426type = str2;
        this.code = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BridgeErrorParams)) {
            return false;
        }
        BridgeErrorParams bridgeErrorParams = (BridgeErrorParams) obj;
        return Intrinsics.areEqual(this.message, bridgeErrorParams.message) && Intrinsics.areEqual(this.f1426type, bridgeErrorParams.f1426type) && Intrinsics.areEqual(this.code, bridgeErrorParams.code);
    }

    public final int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1426type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.code;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BridgeErrorParams(message=", this.message, ", type=", this.f1426type, ", code="), this.code, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.message);
        parcel.writeString(this.f1426type);
        parcel.writeString(this.code);
    }
}

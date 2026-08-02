package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.stripe.android.model.PaymentIntent;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class MandateDataParams implements Parcelable {
    public static final Parcelable.Creator<MandateDataParams> CREATOR = new PaymentIntent.Creator(8);

    /* renamed from: type, reason: collision with root package name */
    public final MandateDataParams$Type$Online f1438type;

    public MandateDataParams(MandateDataParams$Type$Online mandateDataParams$Type$Online) {
        mandateDataParams$Type$Online.getClass();
        this.f1438type = mandateDataParams$Type$Online;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MandateDataParams) && Intrinsics.areEqual(this.f1438type, ((MandateDataParams) obj).f1438type);
    }

    public final int hashCode() {
        return this.f1438type.hashCode();
    }

    public final Map toParamMap() {
        Map mapOf;
        MandateDataParams$Type$Online mandateDataParams$Type$Online = this.f1438type;
        mandateDataParams$Type$Online.getClass();
        Pair pair = new Pair("type", "online");
        if (mandateDataParams$Type$Online.inferFromClient) {
            mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("infer_from_client", Boolean.TRUE));
        } else {
            String str = mandateDataParams$Type$Online.ipAddress;
            if (str == null) {
                str = "";
            }
            Pair pair2 = new Pair("ip_address", str);
            String str2 = mandateDataParams$Type$Online.userAgent;
            mapOf = MapsKt__MapsKt.mapOf(pair2, new Pair("user_agent", str2 != null ? str2 : ""));
        }
        return BalanceFeedKt$$ExternalSyntheticOutline0.m("customer_acceptance", MapsKt__MapsKt.mapOf(pair, new Pair("online", mapOf)));
    }

    public final String toString() {
        return "MandateDataParams(type=" + this.f1438type + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f1438type, i);
    }
}

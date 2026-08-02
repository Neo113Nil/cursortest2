package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.appsflyer.AdRevenueScheme;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.Card;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class Address implements StripeModel, Parcelable {
    public static final Parcelable.Creator<Address> CREATOR = new Card.Creator(3);
    public final String city;
    public final String country;
    public final String line1;
    public final String line2;
    public final String postalCode;
    public final String state;

    public Address(String str, String str2, String str3, String str4, String str5, String str6) {
        this.city = str;
        this.country = str2;
        this.line1 = str3;
        this.line2 = str4;
        this.postalCode = str5;
        this.state = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return Intrinsics.areEqual(this.city, address.city) && Intrinsics.areEqual(this.country, address.country) && Intrinsics.areEqual(this.line1, address.line1) && Intrinsics.areEqual(this.line2, address.line2) && Intrinsics.areEqual(this.postalCode, address.postalCode) && Intrinsics.areEqual(this.state, address.state);
    }

    public final int hashCode() {
        String str = this.city;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.line1;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.line2;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postalCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.state;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final Map toParamMap() {
        String str = this.city;
        if (str == null) {
            str = "";
        }
        Pair pair = new Pair("city", str);
        String str2 = this.country;
        if (str2 == null) {
            str2 = "";
        }
        Pair pair2 = new Pair(AdRevenueScheme.COUNTRY, str2);
        String str3 = this.line1;
        if (str3 == null) {
            str3 = "";
        }
        Pair pair3 = new Pair("line1", str3);
        String str4 = this.line2;
        if (str4 == null) {
            str4 = "";
        }
        Pair pair4 = new Pair("line2", str4);
        String str5 = this.postalCode;
        if (str5 == null) {
            str5 = "";
        }
        Pair pair5 = new Pair("postal_code", str5);
        String str6 = this.state;
        Map mapOf = MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, new Pair("state", str6 != null ? str6 : ""));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapOf.entrySet()) {
            if (((String) entry.getValue()).length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Address(city=", this.city, ", country=", this.country, ", line1=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.line1, ", line2=", this.line2, ", postalCode=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.postalCode, ", state=", this.state, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.city);
        parcel.writeString(this.country);
        parcel.writeString(this.line1);
        parcel.writeString(this.line2);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.state);
    }
}

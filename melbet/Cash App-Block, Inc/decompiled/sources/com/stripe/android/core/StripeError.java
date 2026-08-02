package com.stripe.android.core;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.stripe.android.core.model.StripeModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class StripeError implements StripeModel, Serializable {
    public static final Parcelable.Creator<StripeError> CREATOR = new Creator();
    public final String charge;
    public final String code;
    public final String declineCode;
    public final String docUrl;
    public final Map extraFields;
    public final String message;
    public final String param;

    /* renamed from: type, reason: collision with root package name */
    public final String f1428type;

    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new StripeError(readString, readString2, readString3, readString4, readString5, readString6, readString7, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StripeError[i];
        }
    }

    public StripeError(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map) {
        this.f1428type = str;
        this.message = str2;
        this.code = str3;
        this.param = str4;
        this.declineCode = str5;
        this.charge = str6;
        this.docUrl = str7;
        this.extraFields = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StripeError)) {
            return false;
        }
        StripeError stripeError = (StripeError) obj;
        return Intrinsics.areEqual(this.f1428type, stripeError.f1428type) && Intrinsics.areEqual(this.message, stripeError.message) && Intrinsics.areEqual(this.code, stripeError.code) && Intrinsics.areEqual(this.param, stripeError.param) && Intrinsics.areEqual(this.declineCode, stripeError.declineCode) && Intrinsics.areEqual(this.charge, stripeError.charge) && Intrinsics.areEqual(this.docUrl, stripeError.docUrl) && Intrinsics.areEqual(this.extraFields, stripeError.extraFields);
    }

    public final int hashCode() {
        String str = this.f1428type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.code;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.param;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.declineCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.charge;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.docUrl;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map map = this.extraFields;
        return hashCode7 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StripeError(type=", this.f1428type, ", message=", this.message, ", code=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.code, ", param=", this.param, ", declineCode=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.declineCode, ", charge=", this.charge, ", docUrl=");
        m.append(this.docUrl);
        m.append(", extraFields=");
        m.append(this.extraFields);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f1428type);
        parcel.writeString(this.message);
        parcel.writeString(this.code);
        parcel.writeString(this.param);
        parcel.writeString(this.declineCode);
        parcel.writeString(this.charge);
        parcel.writeString(this.docUrl);
        Map map = this.extraFields;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator m = Matcher$$ExternalSyntheticOutline0.m(parcel, 1, map);
        while (m.hasNext()) {
            Map.Entry entry = (Map.Entry) m.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}

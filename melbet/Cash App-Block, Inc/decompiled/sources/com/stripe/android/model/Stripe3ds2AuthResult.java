package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.SourceParams;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class Stripe3ds2AuthResult implements StripeModel {
    public static final Parcelable.Creator<Stripe3ds2AuthResult> CREATOR = new SourceParams.Creator(10);
    public final Ares ares;
    public final Long created;
    public final String creq;
    public final ThreeDS2Error error;
    public final String fallbackRedirectUrl;
    public final String id;
    public final boolean liveMode;
    public final String source;
    public final String state;

    public final class Ares implements StripeModel {
        public static final Parcelable.Creator<Ares> CREATOR = new SourceParams.Creator(9);
        public final String acsChallengeMandated;
        public final String acsSignedContent;
        public final String acsTransId;
        public final String acsUrl;
        public final String authenticationType;
        public final String cardholderInfo;
        public final List messageExtension;
        public final String messageType;
        public final String messageVersion;
        public final String sdkTransId;
        public final String threeDSServerTransId;
        public final String transStatus;

        public Ares(String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList, String str8, String str9, String str10, String str11) {
            this.threeDSServerTransId = str;
            this.acsChallengeMandated = str2;
            this.acsSignedContent = str3;
            this.acsTransId = str4;
            this.acsUrl = str5;
            this.authenticationType = str6;
            this.cardholderInfo = str7;
            this.messageExtension = arrayList;
            this.messageType = str8;
            this.messageVersion = str9;
            this.sdkTransId = str10;
            this.transStatus = str11;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ares)) {
                return false;
            }
            Ares ares = (Ares) obj;
            return Intrinsics.areEqual(this.threeDSServerTransId, ares.threeDSServerTransId) && Intrinsics.areEqual(this.acsChallengeMandated, ares.acsChallengeMandated) && Intrinsics.areEqual(this.acsSignedContent, ares.acsSignedContent) && Intrinsics.areEqual(this.acsTransId, ares.acsTransId) && Intrinsics.areEqual(this.acsUrl, ares.acsUrl) && Intrinsics.areEqual(this.authenticationType, ares.authenticationType) && Intrinsics.areEqual(this.cardholderInfo, ares.cardholderInfo) && Intrinsics.areEqual(this.messageExtension, ares.messageExtension) && Intrinsics.areEqual(this.messageType, ares.messageType) && Intrinsics.areEqual(this.messageVersion, ares.messageVersion) && Intrinsics.areEqual(this.sdkTransId, ares.sdkTransId) && Intrinsics.areEqual(this.transStatus, ares.transStatus);
        }

        public final int hashCode() {
            String str = this.threeDSServerTransId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.acsChallengeMandated;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.acsSignedContent;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.acsTransId;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.acsUrl;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.authenticationType;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.cardholderInfo;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            List list = this.messageExtension;
            int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
            String str8 = this.messageType;
            int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.messageVersion;
            int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.sdkTransId;
            int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.transStatus;
            return hashCode11 + (str11 != null ? str11.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Ares(threeDSServerTransId=", this.threeDSServerTransId, ", acsChallengeMandated=", this.acsChallengeMandated, ", acsSignedContent=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.acsSignedContent, ", acsTransId=", this.acsTransId, ", acsUrl=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.acsUrl, ", authenticationType=", this.authenticationType, ", cardholderInfo=");
            NavAction$$ExternalSyntheticOutline0.m(this.cardholderInfo, ", messageExtension=", ", messageType=", m, this.messageExtension);
            Boxes$$ExternalSyntheticOutline1.m(m, this.messageType, ", messageVersion=", this.messageVersion, ", sdkTransId=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.sdkTransId, ", transStatus=", this.transStatus, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.threeDSServerTransId);
            parcel.writeString(this.acsChallengeMandated);
            parcel.writeString(this.acsSignedContent);
            parcel.writeString(this.acsTransId);
            parcel.writeString(this.acsUrl);
            parcel.writeString(this.authenticationType);
            parcel.writeString(this.cardholderInfo);
            List list = this.messageExtension;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
                while (m.hasNext()) {
                    ((MessageExtension) m.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.messageType);
            parcel.writeString(this.messageVersion);
            parcel.writeString(this.sdkTransId);
            parcel.writeString(this.transStatus);
        }
    }

    public final class MessageExtension implements StripeModel {
        public static final Parcelable.Creator<MessageExtension> CREATOR = new SourceParams.Creator(11);
        public final boolean criticalityIndicator;
        public final Map data;
        public final String id;
        public final String name;

        public MessageExtension(String str, boolean z, String str2, Map map) {
            this.name = str;
            this.criticalityIndicator = z;
            this.id = str2;
            this.data = map;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessageExtension)) {
                return false;
            }
            MessageExtension messageExtension = (MessageExtension) obj;
            return Intrinsics.areEqual(this.name, messageExtension.name) && this.criticalityIndicator == messageExtension.criticalityIndicator && Intrinsics.areEqual(this.id, messageExtension.id) && Intrinsics.areEqual(this.data, messageExtension.data);
        }

        public final int hashCode() {
            String str = this.name;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.criticalityIndicator);
            String str2 = this.id;
            int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map map = this.data;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("MessageExtension(name=", this.name, ", criticalityIndicator=", ", id=", this.criticalityIndicator);
            m1540m.append(this.id);
            m1540m.append(", data=");
            m1540m.append(this.data);
            m1540m.append(")");
            return m1540m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.name);
            parcel.writeInt(this.criticalityIndicator ? 1 : 0);
            parcel.writeString(this.id);
            Map map = this.data;
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

    public final class ThreeDS2Error implements StripeModel {
        public static final Parcelable.Creator<ThreeDS2Error> CREATOR = new SourceParams.Creator(12);
        public final String acsTransId;
        public final String dsTransId;
        public final String errorCode;
        public final String errorComponent;
        public final String errorDescription;
        public final String errorDetail;
        public final String errorMessageType;
        public final String messageType;
        public final String messageVersion;
        public final String sdkTransId;
        public final String threeDSServerTransId;

        public ThreeDS2Error(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.threeDSServerTransId = str;
            this.acsTransId = str2;
            this.dsTransId = str3;
            this.errorCode = str4;
            this.errorComponent = str5;
            this.errorDescription = str6;
            this.errorDetail = str7;
            this.errorMessageType = str8;
            this.messageType = str9;
            this.messageVersion = str10;
            this.sdkTransId = str11;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ThreeDS2Error)) {
                return false;
            }
            ThreeDS2Error threeDS2Error = (ThreeDS2Error) obj;
            return Intrinsics.areEqual(this.threeDSServerTransId, threeDS2Error.threeDSServerTransId) && Intrinsics.areEqual(this.acsTransId, threeDS2Error.acsTransId) && Intrinsics.areEqual(this.dsTransId, threeDS2Error.dsTransId) && Intrinsics.areEqual(this.errorCode, threeDS2Error.errorCode) && Intrinsics.areEqual(this.errorComponent, threeDS2Error.errorComponent) && Intrinsics.areEqual(this.errorDescription, threeDS2Error.errorDescription) && Intrinsics.areEqual(this.errorDetail, threeDS2Error.errorDetail) && Intrinsics.areEqual(this.errorMessageType, threeDS2Error.errorMessageType) && Intrinsics.areEqual(this.messageType, threeDS2Error.messageType) && Intrinsics.areEqual(this.messageVersion, threeDS2Error.messageVersion) && Intrinsics.areEqual(this.sdkTransId, threeDS2Error.sdkTransId);
        }

        public final int hashCode() {
            String str = this.threeDSServerTransId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.acsTransId;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.dsTransId;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.errorCode;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.errorComponent;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.errorDescription;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.errorDetail;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.errorMessageType;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.messageType;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.messageVersion;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.sdkTransId;
            return hashCode10 + (str11 != null ? str11.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ThreeDS2Error(threeDSServerTransId=", this.threeDSServerTransId, ", acsTransId=", this.acsTransId, ", dsTransId=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.dsTransId, ", errorCode=", this.errorCode, ", errorComponent=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.errorComponent, ", errorDescription=", this.errorDescription, ", errorDetail=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.errorDetail, ", errorMessageType=", this.errorMessageType, ", messageType=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.messageType, ", messageVersion=", this.messageVersion, ", sdkTransId=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.sdkTransId, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.threeDSServerTransId);
            parcel.writeString(this.acsTransId);
            parcel.writeString(this.dsTransId);
            parcel.writeString(this.errorCode);
            parcel.writeString(this.errorComponent);
            parcel.writeString(this.errorDescription);
            parcel.writeString(this.errorDetail);
            parcel.writeString(this.errorMessageType);
            parcel.writeString(this.messageType);
            parcel.writeString(this.messageVersion);
            parcel.writeString(this.sdkTransId);
        }
    }

    public Stripe3ds2AuthResult(String str, Ares ares, Long l, String str2, String str3, boolean z, ThreeDS2Error threeDS2Error, String str4, String str5) {
        this.id = str;
        this.ares = ares;
        this.created = l;
        this.source = str2;
        this.state = str3;
        this.liveMode = z;
        this.error = threeDS2Error;
        this.fallbackRedirectUrl = str4;
        this.creq = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stripe3ds2AuthResult)) {
            return false;
        }
        Stripe3ds2AuthResult stripe3ds2AuthResult = (Stripe3ds2AuthResult) obj;
        return Intrinsics.areEqual(this.id, stripe3ds2AuthResult.id) && Intrinsics.areEqual(this.ares, stripe3ds2AuthResult.ares) && Intrinsics.areEqual(this.created, stripe3ds2AuthResult.created) && Intrinsics.areEqual(this.source, stripe3ds2AuthResult.source) && Intrinsics.areEqual(this.state, stripe3ds2AuthResult.state) && this.liveMode == stripe3ds2AuthResult.liveMode && Intrinsics.areEqual(this.error, stripe3ds2AuthResult.error) && Intrinsics.areEqual(this.fallbackRedirectUrl, stripe3ds2AuthResult.fallbackRedirectUrl) && Intrinsics.areEqual(this.creq, stripe3ds2AuthResult.creq);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Ares ares = this.ares;
        int hashCode2 = (hashCode + (ares == null ? 0 : ares.hashCode())) * 31;
        Long l = this.created;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.source;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.state;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.liveMode);
        ThreeDS2Error threeDS2Error = this.error;
        int hashCode5 = (m + (threeDS2Error == null ? 0 : threeDS2Error.hashCode())) * 31;
        String str4 = this.fallbackRedirectUrl;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.creq;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stripe3ds2AuthResult(id=");
        sb.append(this.id);
        sb.append(", ares=");
        sb.append(this.ares);
        sb.append(", created=");
        ViewEvent$State$EnumUnboxingLocalUtility.m(this.created, ", source=", this.source, ", state=", sb);
        NavAction$$ExternalSyntheticOutline0.m(sb, this.state, ", liveMode=", this.liveMode, ", error=");
        sb.append(this.error);
        sb.append(", fallbackRedirectUrl=");
        sb.append(this.fallbackRedirectUrl);
        sb.append(", creq=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.creq, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        Ares ares = this.ares;
        if (ares == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ares.writeToParcel(parcel, i);
        }
        Long l = this.created;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
        }
        parcel.writeString(this.source);
        parcel.writeString(this.state);
        parcel.writeInt(this.liveMode ? 1 : 0);
        ThreeDS2Error threeDS2Error = this.error;
        if (threeDS2Error == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threeDS2Error.writeToParcel(parcel, i);
        }
        parcel.writeString(this.fallbackRedirectUrl);
        parcel.writeString(this.creq);
    }
}

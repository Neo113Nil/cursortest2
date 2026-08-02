package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.hcaptcha.HCaptchaStateListener;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import net.idrnd.face.iad.capture.internal.y0;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ErrorData implements Parcelable {
    public static final Parcelable.Creator<ErrorData> CREATOR = new HCaptchaStateListener.Creator(17);
    public final String acsTransId;
    public final String dsTransId;
    public final String errorCode;
    public final ErrorComponent errorComponent;
    public final String errorDescription;
    public final String errorDetail;
    public final String errorMessageType;
    public final String messageVersion;
    public final SdkTransactionId sdkTransId;
    public final String serverTransId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ErrorComponent {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ ErrorComponent[] $VALUES;
        public static final y0 Companion;
        public static final ErrorComponent ThreeDsSdk;
        public final String code;

        static {
            ErrorComponent errorComponent = new ErrorComponent("ThreeDsSdk", 0, "C");
            ThreeDsSdk = errorComponent;
            ErrorComponent[] errorComponentArr = {errorComponent, new ErrorComponent("ThreeDsServer", 1, "S"), new ErrorComponent("DirectoryServer", 2, "D"), new ErrorComponent("Acs", 3, GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_IN_PROGRESS)};
            $VALUES = errorComponentArr;
            $ENTRIES = new EnumEntriesList(errorComponentArr);
            Companion = new y0();
        }

        public ErrorComponent(String str, int i, String str2) {
            this.code = str2;
        }

        public static ErrorComponent valueOf(String str) {
            return (ErrorComponent) Enum.valueOf(ErrorComponent.class, str);
        }

        public static ErrorComponent[] values() {
            return (ErrorComponent[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ErrorData(String str, String str2, String str3, String str4, String str5, String str6, String str7, SdkTransactionId sdkTransactionId, int i) {
        this(str, str2, null, str3, ErrorComponent.ThreeDsSdk, str4, str5, (i & 128) != 0 ? null : str6, str7, sdkTransactionId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorData)) {
            return false;
        }
        ErrorData errorData = (ErrorData) obj;
        return Intrinsics.areEqual(this.serverTransId, errorData.serverTransId) && Intrinsics.areEqual(this.acsTransId, errorData.acsTransId) && Intrinsics.areEqual(this.dsTransId, errorData.dsTransId) && Intrinsics.areEqual(this.errorCode, errorData.errorCode) && this.errorComponent == errorData.errorComponent && Intrinsics.areEqual(this.errorDescription, errorData.errorDescription) && Intrinsics.areEqual(this.errorDetail, errorData.errorDetail) && Intrinsics.areEqual(this.errorMessageType, errorData.errorMessageType) && Intrinsics.areEqual(this.messageVersion, errorData.messageVersion) && Intrinsics.areEqual(this.sdkTransId, errorData.sdkTransId);
    }

    public final int hashCode() {
        String str = this.serverTransId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.acsTransId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dsTransId;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.errorCode);
        ErrorComponent errorComponent = this.errorComponent;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (errorComponent == null ? 0 : errorComponent.hashCode())) * 31, 31, this.errorDescription), 31, this.errorDetail);
        String str4 = this.errorMessageType;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.messageVersion);
        SdkTransactionId sdkTransactionId = this.sdkTransId;
        return m3 + (sdkTransactionId != null ? sdkTransactionId.value.hashCode() : 0);
    }

    public final JSONObject toJson$3ds2sdk_release() {
        JSONObject put = new JSONObject().put("messageType", "Erro").put("messageVersion", this.messageVersion).put("sdkTransID", this.sdkTransId).put("errorCode", this.errorCode).put("errorDescription", this.errorDescription).put("errorDetail", this.errorDetail);
        String str = this.serverTransId;
        if (str != null) {
            put.put("threeDSServerTransID", str);
        }
        String str2 = this.acsTransId;
        if (str2 != null) {
            put.put("acsTransID", str2);
        }
        String str3 = this.dsTransId;
        if (str3 != null) {
            put.put("dsTransID", str3);
        }
        ErrorComponent errorComponent = this.errorComponent;
        if (errorComponent != null) {
            put.put("errorComponent", errorComponent.code);
        }
        String str4 = this.errorMessageType;
        if (str4 != null) {
            put.put("errorMessageType", str4);
        }
        put.getClass();
        return put;
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ErrorData(serverTransId=", this.serverTransId, ", acsTransId=", this.acsTransId, ", dsTransId=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.dsTransId, ", errorCode=", this.errorCode, ", errorComponent=");
        m.append(this.errorComponent);
        m.append(", errorDescription=");
        m.append(this.errorDescription);
        m.append(", errorDetail=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.errorDetail, ", errorMessageType=", this.errorMessageType, ", messageVersion=");
        m.append(this.messageVersion);
        m.append(", sdkTransId=");
        m.append(this.sdkTransId);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.serverTransId);
        parcel.writeString(this.acsTransId);
        parcel.writeString(this.dsTransId);
        parcel.writeString(this.errorCode);
        ErrorComponent errorComponent = this.errorComponent;
        if (errorComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(errorComponent.name());
        }
        parcel.writeString(this.errorDescription);
        parcel.writeString(this.errorDetail);
        parcel.writeString(this.errorMessageType);
        parcel.writeString(this.messageVersion);
        SdkTransactionId sdkTransactionId = this.sdkTransId;
        if (sdkTransactionId == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sdkTransactionId.value);
        }
    }

    public ErrorData(String str, String str2, String str3, String str4, ErrorComponent errorComponent, String str5, String str6, String str7, String str8, SdkTransactionId sdkTransactionId) {
        Request$Priority$EnumUnboxingLocalUtility.m(str4, str5, str6, str8);
        this.serverTransId = str;
        this.acsTransId = str2;
        this.dsTransId = str3;
        this.errorCode = str4;
        this.errorComponent = errorComponent;
        this.errorDescription = str5;
        this.errorDetail = str6;
        this.errorMessageType = str7;
        this.messageVersion = str8;
        this.sdkTransId = sdkTransactionId;
    }
}

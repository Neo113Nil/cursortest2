package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public interface InquiryWorkflow$Output extends Parcelable {

    public final class Complete implements InquiryWorkflow$Output {
        public static final Parcelable.Creator<Complete> CREATOR = new MrzKey.Creator(11);
        public final Map fields;
        public final String inquiryId;
        public final String inquiryStatus;
        public final String redirectUri;
        public final String sessionToken;

        public Complete(String str, String str2, String str3, String str4, Map map) {
            str.getClass();
            str2.getClass();
            this.inquiryId = str;
            this.inquiryStatus = str2;
            this.fields = map;
            this.sessionToken = str3;
            this.redirectUri = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Complete)) {
                return false;
            }
            Complete complete = (Complete) obj;
            return Intrinsics.areEqual(this.inquiryId, complete.inquiryId) && Intrinsics.areEqual(this.inquiryStatus, complete.inquiryStatus) && this.fields.equals(complete.fields) && Intrinsics.areEqual(this.sessionToken, complete.sessionToken) && Intrinsics.areEqual(this.redirectUri, complete.redirectUri);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output
        public final String getSessionToken() {
            return this.sessionToken;
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.inquiryId.hashCode() * 31, 31, this.inquiryStatus), this.fields, 31);
            String str = this.sessionToken;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.redirectUri;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Complete(inquiryId=", this.inquiryId, ", inquiryStatus=", this.inquiryStatus, ", fields=");
            m.append(this.fields);
            m.append(", sessionToken=");
            m.append(this.sessionToken);
            m.append(", redirectUri=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.redirectUri, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.inquiryStatus);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.fields, parcel);
            while (m.hasNext()) {
                Map.Entry entry = (Map.Entry) m.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeParcelable((Parcelable) entry.getValue(), i);
            }
            parcel.writeString(this.sessionToken);
            parcel.writeString(this.redirectUri);
        }
    }

    public final class Error implements InquiryWorkflow$Output {
        public static final Parcelable.Creator<Error> CREATOR = new MrzKey.Creator(12);
        public final InternalErrorInfo cause;
        public final String debugMessage;
        public final ErrorCode errorCode;
        public final String sessionToken;

        public Error(String str, ErrorCode errorCode, InternalErrorInfo internalErrorInfo, String str2) {
            errorCode.getClass();
            internalErrorInfo.getClass();
            this.debugMessage = str;
            this.errorCode = errorCode;
            this.cause = internalErrorInfo;
            this.sessionToken = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.debugMessage, error.debugMessage) && this.errorCode == error.errorCode && Intrinsics.areEqual(this.cause, error.cause) && Intrinsics.areEqual(this.sessionToken, error.sessionToken);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output
        public final String getSessionToken() {
            return this.sessionToken;
        }

        public final int hashCode() {
            String str = this.debugMessage;
            int hashCode = (this.cause.hashCode() + ((this.errorCode.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
            String str2 = this.sessionToken;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return "Error(debugMessage=" + this.debugMessage + ", errorCode=" + this.errorCode + ", cause=" + this.cause + ", sessionToken=" + this.sessionToken + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.debugMessage);
            parcel.writeParcelable(this.errorCode, i);
            parcel.writeParcelable(this.cause, i);
            parcel.writeString(this.sessionToken);
        }
    }

    public final class ReinitializeWithFallbackMode implements InquiryWorkflow$Output {
        public static final Parcelable.Creator<ReinitializeWithFallbackMode> CREATOR = new MrzKey.Creator(13);
        public final String inquiryId;
        public final String sessionToken;

        public ReinitializeWithFallbackMode(String str, String str2) {
            str.getClass();
            this.inquiryId = str;
            this.sessionToken = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReinitializeWithFallbackMode)) {
                return false;
            }
            ReinitializeWithFallbackMode reinitializeWithFallbackMode = (ReinitializeWithFallbackMode) obj;
            return Intrinsics.areEqual(this.inquiryId, reinitializeWithFallbackMode.inquiryId) && Intrinsics.areEqual(this.sessionToken, reinitializeWithFallbackMode.sessionToken);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output
        public final String getSessionToken() {
            return this.sessionToken;
        }

        public final int hashCode() {
            int hashCode = this.inquiryId.hashCode() * 31;
            String str = this.sessionToken;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("ReinitializeWithFallbackMode(inquiryId=", this.inquiryId, ", sessionToken=", this.sessionToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.sessionToken);
        }
    }

    String getSessionToken();

    public final class Cancel implements InquiryWorkflow$Output {
        public static final Parcelable.Creator<Cancel> CREATOR = new MrzKey.Creator(10);
        public final String cancelButtonText;
        public final boolean force;
        public final String inquiryId;
        public final String message;
        public final String resumeButtonText;
        public final String sessionToken;
        public final boolean skipBackendCall;
        public final StepStyle styles;
        public final String title;

        public Cancel(String str, String str2, StepStyle stepStyle, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
            this.inquiryId = str;
            this.sessionToken = str2;
            this.styles = stepStyle;
            this.title = str3;
            this.message = str4;
            this.resumeButtonText = str5;
            this.cancelButtonText = str6;
            this.force = z;
            this.skipBackendCall = z2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cancel)) {
                return false;
            }
            Cancel cancel = (Cancel) obj;
            return Intrinsics.areEqual(this.inquiryId, cancel.inquiryId) && Intrinsics.areEqual(this.sessionToken, cancel.sessionToken) && Intrinsics.areEqual(this.styles, cancel.styles) && Intrinsics.areEqual(this.title, cancel.title) && Intrinsics.areEqual(this.message, cancel.message) && Intrinsics.areEqual(this.resumeButtonText, cancel.resumeButtonText) && Intrinsics.areEqual(this.cancelButtonText, cancel.cancelButtonText) && this.force == cancel.force && this.skipBackendCall == cancel.skipBackendCall;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output
        public final String getSessionToken() {
            return this.sessionToken;
        }

        public final int hashCode() {
            String str = this.inquiryId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.sessionToken;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            StepStyle stepStyle = this.styles;
            int hashCode3 = (hashCode2 + (stepStyle == null ? 0 : stepStyle.hashCode())) * 31;
            String str3 = this.title;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.message;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.resumeButtonText;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.cancelButtonText;
            return Boolean.hashCode(this.skipBackendCall) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.force);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Cancel(inquiryId=", this.inquiryId, ", sessionToken=", this.sessionToken, ", styles=");
            m.append(this.styles);
            m.append(", title=");
            m.append(this.title);
            m.append(", message=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.message, ", resumeButtonText=", this.resumeButtonText, ", cancelButtonText=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.cancelButtonText, ", force=", this.force, ", skipBackendCall=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.skipBackendCall, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.sessionToken);
            parcel.writeParcelable(this.styles, i);
            parcel.writeString(this.title);
            parcel.writeString(this.message);
            parcel.writeString(this.resumeButtonText);
            parcel.writeString(this.cancelButtonText);
            parcel.writeInt(this.force ? 1 : 0);
            parcel.writeInt(this.skipBackendCall ? 1 : 0);
        }

        public /* synthetic */ Cancel(String str, String str2, StepStyle stepStyle, String str3, String str4, String str5, String str6) {
            this(str, str2, stepStyle, str3, str4, str5, str6, false, false);
        }
    }
}

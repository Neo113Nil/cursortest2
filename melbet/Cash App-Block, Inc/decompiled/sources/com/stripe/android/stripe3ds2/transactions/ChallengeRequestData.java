package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.internal.mlkit_vision_barcode.zzck;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.hcaptcha.HCaptchaStateListener;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ChallengeRequestData implements Serializable, Parcelable {
    public static final Parcelable.Creator<ChallengeRequestData> CREATOR = new HCaptchaStateListener.Creator(13);
    public final String acsTransId;
    public final CancelReason cancelReason;
    public final String challengeDataEntry;
    public final String challengeHtmlDataEntry;
    public final List messageExtensions;
    public final String messageVersion;
    public final Boolean oobContinue;
    public final SdkTransactionId sdkTransId;
    public final Boolean shouldResendChallenge;
    public final String threeDSRequestorAppURL;
    public final String threeDsServerTransId;
    public final Boolean whitelistingDataEntry;

    public enum CancelReason {
        UserSelected("01"),
        /* JADX INFO: Fake field, exist only in values array */
        Reserved("02"),
        /* JADX INFO: Fake field, exist only in values array */
        TransactionTimedOutDecoupled("03"),
        /* JADX INFO: Fake field, exist only in values array */
        TransactionTimedOutOther("04"),
        /* JADX INFO: Fake field, exist only in values array */
        TransactionTimedOutFirstCreq("05"),
        /* JADX INFO: Fake field, exist only in values array */
        TransactionError("06"),
        /* JADX INFO: Fake field, exist only in values array */
        Unknown("07");

        public final String code;

        CancelReason(String str) {
            this.code = str;
        }
    }

    public ChallengeRequestData(String str, String str2, String str3, SdkTransactionId sdkTransactionId, String str4, String str5, CancelReason cancelReason, String str6, List list, Boolean bool, Boolean bool2, Boolean bool3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        sdkTransactionId.getClass();
        this.messageVersion = str;
        this.threeDsServerTransId = str2;
        this.acsTransId = str3;
        this.sdkTransId = sdkTransactionId;
        this.threeDSRequestorAppURL = str4;
        this.challengeDataEntry = str5;
        this.cancelReason = cancelReason;
        this.challengeHtmlDataEntry = str6;
        this.messageExtensions = list;
        this.oobContinue = bool;
        this.shouldResendChallenge = bool2;
        this.whitelistingDataEntry = bool3;
    }

    public static ChallengeRequestData copy$default(ChallengeRequestData challengeRequestData, String str, String str2, Boolean bool, int i) {
        CancelReason cancelReason = CancelReason.UserSelected;
        Boolean bool2 = Boolean.TRUE;
        String str3 = challengeRequestData.messageVersion;
        String str4 = challengeRequestData.threeDsServerTransId;
        String str5 = challengeRequestData.acsTransId;
        SdkTransactionId sdkTransactionId = challengeRequestData.sdkTransId;
        String str6 = challengeRequestData.threeDSRequestorAppURL;
        String str7 = (i & 32) != 0 ? challengeRequestData.challengeDataEntry : str;
        if ((i & 64) != 0) {
            cancelReason = challengeRequestData.cancelReason;
        }
        CancelReason cancelReason2 = cancelReason;
        String str8 = (i & 128) != 0 ? challengeRequestData.challengeHtmlDataEntry : str2;
        List list = challengeRequestData.messageExtensions;
        Boolean bool3 = (i & 512) != 0 ? challengeRequestData.oobContinue : bool2;
        if ((i & 1024) != 0) {
            bool2 = challengeRequestData.shouldResendChallenge;
        }
        Boolean bool4 = bool2;
        Boolean bool5 = (i & 2048) != 0 ? challengeRequestData.whitelistingDataEntry : bool;
        str3.getClass();
        str4.getClass();
        str5.getClass();
        sdkTransactionId.getClass();
        return new ChallengeRequestData(str3, str4, str5, sdkTransactionId, str6, str7, cancelReason2, str8, list, bool3, bool4, bool5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeRequestData)) {
            return false;
        }
        ChallengeRequestData challengeRequestData = (ChallengeRequestData) obj;
        return Intrinsics.areEqual(this.messageVersion, challengeRequestData.messageVersion) && Intrinsics.areEqual(this.threeDsServerTransId, challengeRequestData.threeDsServerTransId) && Intrinsics.areEqual(this.acsTransId, challengeRequestData.acsTransId) && Intrinsics.areEqual(this.sdkTransId, challengeRequestData.sdkTransId) && Intrinsics.areEqual(this.threeDSRequestorAppURL, challengeRequestData.threeDSRequestorAppURL) && Intrinsics.areEqual(this.challengeDataEntry, challengeRequestData.challengeDataEntry) && this.cancelReason == challengeRequestData.cancelReason && Intrinsics.areEqual(this.challengeHtmlDataEntry, challengeRequestData.challengeHtmlDataEntry) && Intrinsics.areEqual(this.messageExtensions, challengeRequestData.messageExtensions) && Intrinsics.areEqual(this.oobContinue, challengeRequestData.oobContinue) && Intrinsics.areEqual(this.shouldResendChallenge, challengeRequestData.shouldResendChallenge) && Intrinsics.areEqual(this.whitelistingDataEntry, challengeRequestData.whitelistingDataEntry);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.messageVersion.hashCode() * 31, 31, this.threeDsServerTransId), 31, this.acsTransId), 31, this.sdkTransId.value);
        String str = this.threeDSRequestorAppURL;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.challengeDataEntry;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CancelReason cancelReason = this.cancelReason;
        int hashCode3 = (hashCode2 + (cancelReason == null ? 0 : cancelReason.hashCode())) * 31;
        String str3 = this.challengeHtmlDataEntry;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.messageExtensions;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.oobContinue;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.shouldResendChallenge;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.whitelistingDataEntry;
        return hashCode7 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final JSONObject toJson$3ds2sdk_release() {
        try {
            Result.Companion companion = Result.Companion;
            JSONObject put = new JSONObject().put("messageType", "CReq").put("messageVersion", this.messageVersion).put("sdkTransID", this.sdkTransId.value).put("threeDSServerTransID", this.threeDsServerTransId).put("acsTransID", this.acsTransId);
            CancelReason cancelReason = this.cancelReason;
            if (cancelReason != null) {
                put.put("challengeCancel", cancelReason.code);
            }
            String str = this.threeDSRequestorAppURL;
            if (str != null && str.length() != 0) {
                put.put("threeDSRequestorAppURL", str);
            }
            String str2 = this.challengeDataEntry;
            if (str2 != null && str2.length() != 0) {
                put.put("challengeDataEntry", str2);
            }
            String str3 = this.challengeHtmlDataEntry;
            if (str3 != null && str3.length() != 0) {
                put.put("challengeHTMLDataEntry", str3);
            }
            String str4 = "Y";
            if ((str2 == null || str2.length() == 0) && ((str3 == null || str3.length() == 0) && cancelReason == null)) {
                put.put("challengeNoEntry", "Y");
            }
            Parcelable.Creator<MessageExtension> creator = MessageExtension.CREATOR;
            JSONArray jsonArray = zzck.toJsonArray(this.messageExtensions);
            if (jsonArray != null) {
                put.put("messageExtensions", jsonArray);
            }
            Boolean bool = this.oobContinue;
            if (bool != null) {
                put.put("oobContinue", bool.booleanValue());
            }
            Boolean bool2 = this.shouldResendChallenge;
            if (bool2 != null) {
                put.put("resendChallenge", bool2.booleanValue() ? "Y" : "N");
            }
            Boolean bool3 = this.whitelistingDataEntry;
            if (bool3 != null) {
                if (!bool3.booleanValue()) {
                    str4 = "N";
                }
                put.put("whitelistingDataEntry", str4);
            }
            put.getClass();
            return put;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(new Result.Failure(th));
            if (m4120exceptionOrNullimpl != null) {
                throw new SDKRuntimeException(m4120exceptionOrNullimpl);
            }
            OptionalProvider$$ExternalSyntheticLambda0.m$1();
            return null;
        }
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ChallengeRequestData(messageVersion=", this.messageVersion, ", threeDsServerTransId=", this.threeDsServerTransId, ", acsTransId=");
        m.append(this.acsTransId);
        m.append(", sdkTransId=");
        m.append(this.sdkTransId);
        m.append(", threeDSRequestorAppURL=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.threeDSRequestorAppURL, ", challengeDataEntry=", this.challengeDataEntry, ", cancelReason=");
        m.append(this.cancelReason);
        m.append(", challengeHtmlDataEntry=");
        m.append(this.challengeHtmlDataEntry);
        m.append(", messageExtensions=");
        m.append(this.messageExtensions);
        m.append(", oobContinue=");
        m.append(this.oobContinue);
        m.append(", shouldResendChallenge=");
        m.append(this.shouldResendChallenge);
        m.append(", whitelistingDataEntry=");
        m.append(this.whitelistingDataEntry);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.messageVersion);
        parcel.writeString(this.threeDsServerTransId);
        parcel.writeString(this.acsTransId);
        SdkTransactionId sdkTransactionId = this.sdkTransId;
        sdkTransactionId.getClass();
        parcel.writeString(sdkTransactionId.value);
        parcel.writeString(this.threeDSRequestorAppURL);
        parcel.writeString(this.challengeDataEntry);
        CancelReason cancelReason = this.cancelReason;
        if (cancelReason == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cancelReason.name());
        }
        parcel.writeString(this.challengeHtmlDataEntry);
        List list = this.messageExtensions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
            while (m.hasNext()) {
                ((MessageExtension) m.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.oobContinue;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
        }
        Boolean bool2 = this.shouldResendChallenge;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.whitelistingDataEntry;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool3);
        }
    }

    public /* synthetic */ ChallengeRequestData(String str, String str2, String str3, SdkTransactionId sdkTransactionId, String str4, List list, int i) {
        this(str, str2, str3, sdkTransactionId, str4, null, null, null, (i & 256) != 0 ? null : list, null, null, null);
    }
}

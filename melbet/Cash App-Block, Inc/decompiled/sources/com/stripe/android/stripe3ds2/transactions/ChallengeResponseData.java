package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.hcaptcha.HCaptchaStateListener;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ChallengeResponseData implements Parcelable {
    public static final Parcelable.Creator<ChallengeResponseData> CREATOR = new HCaptchaStateListener.Creator(15);
    public static final List YES_NO_VALUES = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Y", "N"});
    public final String acsHtml;
    public final String acsHtmlRefresh;
    public final String acsTransId;
    public final String challengeAdditionalInfoText;
    public final String challengeInfoHeader;
    public final String challengeInfoLabel;
    public final String challengeInfoText;
    public final List challengeSelectOptions;
    public final String expandInfoLabel;
    public final String expandInfoText;
    public final boolean isChallengeCompleted;
    public final Image issuerImage;
    public final List messageExtensions;
    public final String messageVersion;
    public final String oobAppLabel;
    public final String oobAppUrl;
    public final String oobContinueLabel;
    public final Image paymentSystemImage;
    public final String resendInformationLabel;
    public final SdkTransactionId sdkTransId;
    public final String serverTransId;
    public final boolean shouldShowChallengeInfoTextIndicator;
    public final String submitAuthenticationLabel;
    public final String transStatus;
    public final UiType uiType;
    public final String whitelistingInfoText;
    public final String whyInfoLabel;
    public final String whyInfoText;

    public final class ChallengeSelectOption implements Parcelable {
        public static final Parcelable.Creator<ChallengeSelectOption> CREATOR = new HCaptchaStateListener.Creator(14);
        public final String name;
        public final String text;

        public ChallengeSelectOption(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.name = str;
            this.text = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChallengeSelectOption)) {
                return false;
            }
            ChallengeSelectOption challengeSelectOption = (ChallengeSelectOption) obj;
            return Intrinsics.areEqual(this.name, challengeSelectOption.name) && Intrinsics.areEqual(this.text, challengeSelectOption.text);
        }

        public final int hashCode() {
            return this.text.hashCode() + (this.name.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("ChallengeSelectOption(name=", this.name, ", text=", this.text, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.name);
            parcel.writeString(this.text);
        }
    }

    public final class Image implements Parcelable {
        public static final Parcelable.Creator<Image> CREATOR = new HCaptchaStateListener.Creator(16);
        public final String extraHighUrl;
        public final String highUrl;
        public final String mediumUrl;

        public Image(String str, String str2, String str3) {
            this.mediumUrl = str;
            this.highUrl = str2;
            this.extraHighUrl = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Image)) {
                return false;
            }
            Image image = (Image) obj;
            return Intrinsics.areEqual(this.mediumUrl, image.mediumUrl) && Intrinsics.areEqual(this.highUrl, image.highUrl) && Intrinsics.areEqual(this.extraHighUrl, image.extraHighUrl);
        }

        public final int hashCode() {
            String str = this.mediumUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.highUrl;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.extraHighUrl;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Image(mediumUrl=", this.mediumUrl, ", highUrl=", this.highUrl, ", extraHighUrl="), this.extraHighUrl, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.mediumUrl);
            parcel.writeString(this.highUrl);
            parcel.writeString(this.extraHighUrl);
        }
    }

    public ChallengeResponseData(String str, String str2, String str3, String str4, UiType uiType, boolean z, String str5, String str6, String str7, String str8, boolean z2, ArrayList arrayList, String str9, String str10, Image image, ArrayList arrayList2, String str11, String str12, String str13, String str14, Image image2, String str15, SdkTransactionId sdkTransactionId, String str16, String str17, String str18, String str19, String str20) {
        str.getClass();
        str2.getClass();
        str11.getClass();
        sdkTransactionId.getClass();
        this.serverTransId = str;
        this.acsTransId = str2;
        this.acsHtml = str3;
        this.acsHtmlRefresh = str4;
        this.uiType = uiType;
        this.isChallengeCompleted = z;
        this.challengeInfoHeader = str5;
        this.challengeInfoLabel = str6;
        this.challengeInfoText = str7;
        this.challengeAdditionalInfoText = str8;
        this.shouldShowChallengeInfoTextIndicator = z2;
        this.challengeSelectOptions = arrayList;
        this.expandInfoLabel = str9;
        this.expandInfoText = str10;
        this.issuerImage = image;
        this.messageExtensions = arrayList2;
        this.messageVersion = str11;
        this.oobAppUrl = str12;
        this.oobAppLabel = str13;
        this.oobContinueLabel = str14;
        this.paymentSystemImage = image2;
        this.resendInformationLabel = str15;
        this.sdkTransId = sdkTransactionId;
        this.submitAuthenticationLabel = str16;
        this.whitelistingInfoText = str17;
        this.whyInfoLabel = str18;
        this.whyInfoText = str19;
        this.transStatus = str20;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeResponseData)) {
            return false;
        }
        ChallengeResponseData challengeResponseData = (ChallengeResponseData) obj;
        return Intrinsics.areEqual(this.serverTransId, challengeResponseData.serverTransId) && Intrinsics.areEqual(this.acsTransId, challengeResponseData.acsTransId) && Intrinsics.areEqual(this.acsHtml, challengeResponseData.acsHtml) && Intrinsics.areEqual(this.acsHtmlRefresh, challengeResponseData.acsHtmlRefresh) && this.uiType == challengeResponseData.uiType && this.isChallengeCompleted == challengeResponseData.isChallengeCompleted && Intrinsics.areEqual(this.challengeInfoHeader, challengeResponseData.challengeInfoHeader) && Intrinsics.areEqual(this.challengeInfoLabel, challengeResponseData.challengeInfoLabel) && Intrinsics.areEqual(this.challengeInfoText, challengeResponseData.challengeInfoText) && Intrinsics.areEqual(this.challengeAdditionalInfoText, challengeResponseData.challengeAdditionalInfoText) && this.shouldShowChallengeInfoTextIndicator == challengeResponseData.shouldShowChallengeInfoTextIndicator && Intrinsics.areEqual(this.challengeSelectOptions, challengeResponseData.challengeSelectOptions) && Intrinsics.areEqual(this.expandInfoLabel, challengeResponseData.expandInfoLabel) && Intrinsics.areEqual(this.expandInfoText, challengeResponseData.expandInfoText) && Intrinsics.areEqual(this.issuerImage, challengeResponseData.issuerImage) && Intrinsics.areEqual(this.messageExtensions, challengeResponseData.messageExtensions) && Intrinsics.areEqual(this.messageVersion, challengeResponseData.messageVersion) && Intrinsics.areEqual(this.oobAppUrl, challengeResponseData.oobAppUrl) && Intrinsics.areEqual(this.oobAppLabel, challengeResponseData.oobAppLabel) && Intrinsics.areEqual(this.oobContinueLabel, challengeResponseData.oobContinueLabel) && Intrinsics.areEqual(this.paymentSystemImage, challengeResponseData.paymentSystemImage) && Intrinsics.areEqual(this.resendInformationLabel, challengeResponseData.resendInformationLabel) && Intrinsics.areEqual(this.sdkTransId, challengeResponseData.sdkTransId) && Intrinsics.areEqual(this.submitAuthenticationLabel, challengeResponseData.submitAuthenticationLabel) && Intrinsics.areEqual(this.whitelistingInfoText, challengeResponseData.whitelistingInfoText) && Intrinsics.areEqual(this.whyInfoLabel, challengeResponseData.whyInfoLabel) && Intrinsics.areEqual(this.whyInfoText, challengeResponseData.whyInfoText) && Intrinsics.areEqual(this.transStatus, challengeResponseData.transStatus);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.serverTransId.hashCode() * 31, 31, this.acsTransId);
        String str = this.acsHtml;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.acsHtmlRefresh;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UiType uiType = this.uiType;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (uiType == null ? 0 : uiType.hashCode())) * 31, 31, this.isChallengeCompleted);
        String str3 = this.challengeInfoHeader;
        int hashCode3 = (m2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.challengeInfoLabel;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.challengeInfoText;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.challengeAdditionalInfoText;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.shouldShowChallengeInfoTextIndicator);
        List list = this.challengeSelectOptions;
        int hashCode6 = (m3 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.expandInfoLabel;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.expandInfoText;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Image image = this.issuerImage;
        int hashCode9 = (hashCode8 + (image == null ? 0 : image.hashCode())) * 31;
        List list2 = this.messageExtensions;
        int m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.messageVersion);
        String str9 = this.oobAppUrl;
        int hashCode10 = (m4 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.oobAppLabel;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.oobContinueLabel;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Image image2 = this.paymentSystemImage;
        int hashCode13 = (hashCode12 + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str12 = this.resendInformationLabel;
        int m5 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31, 31, this.sdkTransId.value);
        String str13 = this.submitAuthenticationLabel;
        int hashCode14 = (m5 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.whitelistingInfoText;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.whyInfoLabel;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.whyInfoText;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.transStatus;
        return hashCode17 + (str17 != null ? str17.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ChallengeResponseData(serverTransId=", this.serverTransId, ", acsTransId=", this.acsTransId, ", acsHtml=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.acsHtml, ", acsHtmlRefresh=", this.acsHtmlRefresh, ", uiType=");
        m.append(this.uiType);
        m.append(", isChallengeCompleted=");
        m.append(this.isChallengeCompleted);
        m.append(", challengeInfoHeader=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.challengeInfoHeader, ", challengeInfoLabel=", this.challengeInfoLabel, ", challengeInfoText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.challengeInfoText, ", challengeAdditionalInfoText=", this.challengeAdditionalInfoText, ", shouldShowChallengeInfoTextIndicator=");
        m.append(this.shouldShowChallengeInfoTextIndicator);
        m.append(", challengeSelectOptions=");
        m.append(this.challengeSelectOptions);
        m.append(", expandInfoLabel=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.expandInfoLabel, ", expandInfoText=", this.expandInfoText, ", issuerImage=");
        m.append(this.issuerImage);
        m.append(", messageExtensions=");
        m.append(this.messageExtensions);
        m.append(", messageVersion=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.messageVersion, ", oobAppUrl=", this.oobAppUrl, ", oobAppLabel=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.oobAppLabel, ", oobContinueLabel=", this.oobContinueLabel, ", paymentSystemImage=");
        m.append(this.paymentSystemImage);
        m.append(", resendInformationLabel=");
        m.append(this.resendInformationLabel);
        m.append(", sdkTransId=");
        m.append(this.sdkTransId);
        m.append(", submitAuthenticationLabel=");
        m.append(this.submitAuthenticationLabel);
        m.append(", whitelistingInfoText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.whitelistingInfoText, ", whyInfoLabel=", this.whyInfoLabel, ", whyInfoText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.whyInfoText, ", transStatus=", this.transStatus, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.serverTransId);
        parcel.writeString(this.acsTransId);
        parcel.writeString(this.acsHtml);
        parcel.writeString(this.acsHtmlRefresh);
        UiType uiType = this.uiType;
        if (uiType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(uiType.name());
        }
        parcel.writeInt(this.isChallengeCompleted ? 1 : 0);
        parcel.writeString(this.challengeInfoHeader);
        parcel.writeString(this.challengeInfoLabel);
        parcel.writeString(this.challengeInfoText);
        parcel.writeString(this.challengeAdditionalInfoText);
        parcel.writeInt(this.shouldShowChallengeInfoTextIndicator ? 1 : 0);
        List list = this.challengeSelectOptions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
            while (m.hasNext()) {
                ((ChallengeSelectOption) m.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.expandInfoLabel);
        parcel.writeString(this.expandInfoText);
        Image image = this.issuerImage;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image.writeToParcel(parcel, i);
        }
        List list2 = this.messageExtensions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator m2 = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list2);
            while (m2.hasNext()) {
                ((MessageExtension) m2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.messageVersion);
        parcel.writeString(this.oobAppUrl);
        parcel.writeString(this.oobAppLabel);
        parcel.writeString(this.oobContinueLabel);
        Image image2 = this.paymentSystemImage;
        if (image2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.resendInformationLabel);
        SdkTransactionId sdkTransactionId = this.sdkTransId;
        sdkTransactionId.getClass();
        parcel.writeString(sdkTransactionId.value);
        parcel.writeString(this.submitAuthenticationLabel);
        parcel.writeString(this.whitelistingInfoText);
        parcel.writeString(this.whyInfoLabel);
        parcel.writeString(this.whyInfoText);
        parcel.writeString(this.transStatus);
    }
}
